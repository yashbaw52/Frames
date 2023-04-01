package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		
		text.getText();
		System.out.println(text);
		
	
	}
}
