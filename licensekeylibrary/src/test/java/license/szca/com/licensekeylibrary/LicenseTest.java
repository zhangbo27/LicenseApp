package license.szca.com.licensekeylibrary;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;

/**
 * description 生成的20位license的测试类
 * Created by JD
 * on 2017/9/14.
 */

public class LicenseTest {

  private String testData = "hello";
    private Context mContext;
    private GenLicenseKeyUtil genLicenseKeyUtil;

    @Before
    public void init(){


          mContext = InstrumentationRegistry.getContext();
        genLicenseKeyUtil = new GenLicenseKeyUtil(mContext);
    }

    @Test
    public void shaTest(){

    }


}
