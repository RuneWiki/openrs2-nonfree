import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_65 = new Class218(36, 6);

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "Lclient!bba;")
	public static final Class26 aClass26_6 = new Class26();

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)V")
	public static void method4376(@OriginalArg(0) boolean arg0) {
		if (Static412.aClass51_25 != null) {
			Static412.aClass51_25.method3508();
			Static412.aClass51_25 = null;
		}
		Static621.anInt10311 = 0;
		Static598.method8184();
		Static59.method8063();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static334.aClass291Array20[local21].method7196();
		}
		Static234.method4503(false);
		System.gc();
		Static300.method5151();
		Static48.aBoolean89 = false;
		Static148.anInt3680 = -1;
		Static545.method7726();
		Static471.method6995(true);
		Static472.anInt6106 = 0;
		Static124.anInt3150 = 0;
		Static446.anInt8090 = 0;
		Static79.anInt1964 = 0;
		Static631.anInt10399 = 0;
		Static324.anInt6511 = 0;
		for (@Pc(67) int local67 = 0; local67 < Static253.aClass369Array1.length; local67++) {
			Static253.aClass369Array1[local67] = null;
		}
		Static542.method7684();
		for (@Pc(86) int local86 = 0; local86 < 2048; local86++) {
			Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local86] = null;
		}
		Static377.anInt7132 = 0;
		Static60.aClass307_6.method7427();
		Static234.anInt5314 = 0;
		Static644.aClass307_55.method7427();
		Static2.method33();
		Static222.anInt5083 = 0;
		Static514.aClass166_1.method4931();
		Static217.method1814();
		Static69.method1735();
		Static189.aLong94 = 0L;
		Static369.aClass3_Sub14_1 = null;
		if (arg0) {
			Static182.method3694(12);
			return;
		}
		Static182.method3694(3);
		try {
			Static653.method5390("loggedout", Static632.anApplet2);
		} catch (@Pc(141) Throwable local141) {
		}
	}
}
