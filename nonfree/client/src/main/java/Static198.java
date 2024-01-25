import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "[Lclient!oe;")
	public static Class234[] aClass234Array1;

	@OriginalMember(owner = "client!hv", name = "E", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_6 = new Class342(0, 2, 2, 1);

	@OriginalMember(owner = "client!hv", name = "f", descriptor = "(I)V")
	public static void method3581() {
		Static579.aClass251_129.anInt6868 = 1;
		Static588.method1989();
		Static203.aBoolean287 = true;
		Static470.aBoolean53 = true;
		Static512.method7101();
		for (@Pc(7430) int local7430 = 0; local7430 < Static434.aClass262Array1.length; local7430++) {
			Static434.aClass262Array1[local7430] = null;
		}
		Static199.aBoolean458 = false;
		Static428.method6153();
		Static196.anInt4058 = (int) (Math.random() * 80.0D) - 40;
		Static289.anInt5381 = (int) (Math.random() * 100.0D) - 50;
		Static428.aFloat160 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static95.anInt1825 = (int) (Math.random() * 110.0D) - 55;
		Static185.anInt3860 = (int) (Math.random() * 120.0D) - 60;
		Static291.anInt5446 = (int) (Math.random() * 30.0D) - 20;
		Static480.method6621();
		for (@Pc(7504) int local7504 = 0; local7504 < 2048; local7504++) {
			Static588.aClass4_Sub1_Sub1_Sub2Array3[local7504] = null;
		}
		Static464.anInt7995 = 0;
		Static535.anInt8885 = 0;
		Static593.aClass128_43.method3274();
		Static83.aClass361_10.method7842();
		Static79.aClass361_9.method7842();
		Static328.aClass40_5.method1133();
		Static478.aClass128_40.method3274();
		Static413.aClass361_53 = new Class361();
		Static498.aClass101_1.method2867();
		Static489.method6692();
		Static130.anInt2957 = 0;
		Static340.anInt6138 = 0;
		Static190.anInt3955 = 0;
		Static526.anInt8805 = 0;
		Static489.anInt8245 = 0;
		Static397.anInt6953 = 0;
		Static109.anInt2112 = 0;
		Static25.anInt764 = 0;
		Static48.anInt1087 = 0;
		Static42.anInt1021 = 0;
		for (@Pc(7566) int local7566 = 0; local7566 < Static395.anIntArray511.length; local7566++) {
			if (!Static165.aBooleanArray29[local7566]) {
				Static395.anIntArray511[local7566] = -1;
			}
		}
		if (Static468.anInt8036 != -1) {
			Static438.method6243(Static468.anInt8036);
		}
		for (@Pc(7596) Class6_Sub11 local7596 = (Class6_Sub11) Static224.aClass128_23.method3265(); local7596 != null; local7596 = (Class6_Sub11) Static224.aClass128_23.method3273()) {
			if (!local7596.method7803()) {
				local7596 = (Class6_Sub11) Static224.aClass128_23.method3265();
				if (local7596 == null) {
					break;
				}
			}
			Static145.method2815(false, true, local7596);
		}
		Static468.anInt8036 = -1;
		Static224.aClass128_23 = new Class128(8);
		Static163.method2979();
		Static518.aClass292_13 = null;
		for (@Pc(7638) int local7638 = 0; local7638 < 8; local7638++) {
			Static115.aStringArray5[local7638] = null;
			Static584.aBooleanArray42[local7638] = false;
			Static142.anIntArray712[local7638] = -1;
		}
		Static32.method909();
		Static63.aBoolean69 = true;
		for (@Pc(7664) int local7664 = 0; local7664 < 100; local7664++) {
			Static31.aBooleanArray17[local7664] = true;
		}
		for (@Pc(7678) int local7678 = 0; local7678 < 6; local7678++) {
			Static229.aClass314Array1[local7678] = new Class314();
		}
		for (@Pc(7694) int local7694 = 0; local7694 < 25; local7694++) {
			Static41.anIntArray285[local7694] = 0;
			Static400.anIntArray515[local7694] = 0;
			Static536.anIntArray688[local7694] = 0;
		}
		Static425.method6109();
		Static261.aBoolean359 = true;
		Static180.aShortArray24 = Static71.aShortArray11 = Static259.aShortArray55 = Static205.aShortArray37 = new short[256];
		Static356.aString47 = Static230.aClass156_25.method4065(Static25.anInt769);
		Static30.anInt863 = 0;
		Static140.aClass6_Sub48_Sub1_1.aBoolean694 = false;
		Static140.aClass6_Sub48_Sub1_1.aBoolean695 = false;
		Static50.method1123();
		Static180.method3269();
		Class273.lb = null;
		Static579.aClass251_129.anInt6868 = 2;
		Static182.aLong95 = 0L;
	}

	@OriginalMember(owner = "client!hv", name = "g", descriptor = "(I)I")
	public static int method3583() {
		return Static540.anIntArray254 == null ? 0 : Static540.anIntArray254.length * 2;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3584(@OriginalArg(0) String arg0) {
		return Static103.method1850(arg0);
	}
}
