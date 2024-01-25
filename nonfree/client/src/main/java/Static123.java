import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_6 = new Class229(9, 7);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	public static void method2107(@OriginalArg(0) boolean arg0) {
		if (Static402.aClass56_2 != null) {
			Static402.aClass56_2.method1312();
			Static402.aClass56_2 = null;
		}
		Static250.anInt4901 = 0;
		Static194.method2970();
		Static227.method3905();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static86.aClass91Array1[local24].method2180();
		}
		Static306.method4837(false);
		System.gc();
		Static67.method1229();
		Static507.anInt8581 = -1;
		Static316.aBoolean424 = false;
		Static457.method6476(true);
		Static534.anInt9007 = 0;
		Static460.anInt7803 = 0;
		Static212.anInt4105 = 0;
		Static470.anInt7897 = 0;
		Static271.anInt5150 = 0;
		Static331.anInt6011 = 0;
		for (@Pc(63) int local63 = 0; local63 < Static384.aClass268Array1.length; local63++) {
			Static384.aClass268Array1[local63] = null;
		}
		Static482.method6625();
		for (@Pc(78) int local78 = 0; local78 < 2048; local78++) {
			Static349.aClass49_Sub2_Sub2_Sub1Array1[local78] = null;
		}
		Static157.anInt4503 = 0;
		Static380.aClass17_29.method734();
		Static350.anInt6254 = 0;
		Static255.aClass17_20.method734();
		Static241.method4170();
		Static475.anInt6155 = 0;
		Static251.aClass119_1.method2649();
		Static294.method4703();
		Static344.method5214();
		Static211.aLong173 = 0L;
		Static38.aClass1_Sub44_1 = null;
		if (arg0) {
			Static85.method1463(11);
			return;
		}
		Static85.method1463(2);
		try {
			Static557.method5219("loggedout", Static466.aClass102_4.anApplet1);
		} catch (@Pc(130) Throwable local130) {
		}
	}
}
