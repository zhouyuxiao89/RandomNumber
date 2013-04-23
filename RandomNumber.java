public class RandomNumber {
  private int LoBound;
  private int HiBound;
  public int GetANumer_Between_1_and_10()
  {
  	int computerNum;
  	computerNum = 1 + (int)(Math.random()*10);
  	return computerNum;
  }
  public int GetANumber()
  {
  	int computerNum;
  	computerNum = LoBound + (int)(Math.random()*HiBound);
  	return computerNum;
  }
  public RandomNumber()
  {
  	LoBound = 1;
  	HiBound = 10;
  }
  public RandomNumber( int low ,int high )
  {
  	LoBound = low;
  	HiBound = high;
  }
}
