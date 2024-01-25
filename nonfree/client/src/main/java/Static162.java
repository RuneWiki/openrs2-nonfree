import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	public static int anInt3418;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "I")
	public static int anInt3424;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[5];

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public static int anInt3420 = 0;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "I")
	public static int anInt3425 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIB)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static433.aClass1_Sub3_Sub1_11.anInt1710 = 0;
		Static433.aClass1_Sub3_Sub1_11.method1208(Static168.aClass247_31.anInt7273);
		Static433.aClass1_Sub3_Sub1_11.method1208(arg0);
		Static433.aClass1_Sub3_Sub1_11.method1208(arg3);
		Static433.aClass1_Sub3_Sub1_11.method1227(arg1);
		Static433.aClass1_Sub3_Sub1_11.method1227(arg2);
		Static168.anInt1719 = -3;
		Static174.anInt3826 = 1;
		Static319.anInt1887 = 0;
		Static54.anInt1413 = 0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!za;Lclient!ec;Z)V")
	public static void method2667(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class68 arg1) {
		@Pc(35) boolean local35 = Static43.aClass57_1.method1416(arg1.anInt2141, arg0, arg1.anInt2192 | 0xFF000000, arg1.anInt2136, arg1.anInt2165, arg1.aBoolean133 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null, arg1.anInt2106) == null;
		if (local35) {
			Static175.aClass203_31.method4551(new Class1_Sub23(arg1.anInt2136, arg1.anInt2106, arg1.anInt2141, arg1.anInt2192 | 0xFF000000, arg1.anInt2165, arg1.aBoolean133));
			Static446.method6042(arg1);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZ)V")
	public static void method2668(@OriginalArg(0) boolean arg0) {
		if (Static388.aClass236_13 != null) {
			Static388.aClass236_13.method5236();
			Static388.aClass236_13 = null;
		}
		Static97.anInt2331 = 0;
		Static312.method4476();
		Static81.method1504();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static19.aClass120Array1[local17].method3044();
		}
		Static347.method4917(false);
		System.gc();
		Static328.method4659();
		Static71.anInt1878 = -1;
		Static180.aBoolean240 = false;
		Static54.method1003(true);
		Static150.anInt3209 = 0;
		Static380.anInt6896 = 0;
		Static76.anInt1937 = 0;
		Static367.anInt6719 = 0;
		Static140.anInt3082 = 0;
		Static278.anInt5374 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static393.aClass178Array1.length; local55++) {
			Static393.aClass178Array1[local55] = null;
		}
		Static204.method3261();
		for (@Pc(69) int local69 = 0; local69 < 2048; local69++) {
			Static135.aClass30_Sub1_Sub1_Sub2Array1[local69] = null;
		}
		Static197.anInt4078 = 0;
		Static24.aClass38_3.method774();
		Static127.anInt2832 = 0;
		Static156.aClass38_16.method774();
		Static214.method5444();
		Static20.anInt524 = 0;
		Static366.aClass190_1.method4307();
		Static209.method3318();
		Static104.method1748();
		Static2.aClass1_Sub15_1 = null;
		Static208.aLong126 = 0L;
		if (arg0) {
			Static118.method2017(11);
			return;
		}
		Static118.method2017(2);
		try {
			Static466.method4995("loggedout", Static150.aClass183_3.anApplet1);
		} catch (@Pc(120) Throwable local120) {
		}
	}
}
