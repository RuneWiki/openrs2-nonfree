import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ts;I)Ljava/lang/String;")
	public static String method1204(@OriginalArg(0) Class6_Sub45 arg0) {
		return arg0.aString97 == null || arg0.aString97.length() <= 0 ? arg0.aString98 : arg0.aString98 + Static230.aClass156_31.method4065(Static25.anInt769) + arg0.aString97;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Z")
	public static boolean method1205() {
		try {
			if (Static171.anInt3648 == 2) {
				if (Static335.aClass6_Sub24_2 == null) {
					Static335.aClass6_Sub24_2 = Static603.method3612(Static377.aClass251_90, Static300.anInt5541, Static394.anInt6906);
					if (Static335.aClass6_Sub24_2 == null) {
						return false;
					}
				}
				if (Static546.aClass93_1 == null) {
					Static546.aClass93_1 = new Class93(Static96.aClass251_24, Static447.aClass251_103);
				}
				if (Static587.aClass6_Sub18_Sub2_3.method3325(Static546.aClass93_1, Static582.aClass251_128, Static335.aClass6_Sub24_2)) {
					Static587.aClass6_Sub18_Sub2_3.method3322();
					Static587.aClass6_Sub18_Sub2_3.method3316(Static430.anInt7500);
					Static587.aClass6_Sub18_Sub2_3.method3317(Static335.aClass6_Sub24_2, Static259.aBoolean354);
					Static171.anInt3648 = 0;
					Static377.aClass251_90 = null;
					Static546.aClass93_1 = null;
					Static335.aClass6_Sub24_2 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static587.aClass6_Sub18_Sub2_3.method3293();
			Static377.aClass251_90 = null;
			Static335.aClass6_Sub24_2 = null;
			Static171.anInt3648 = 0;
			Static546.aClass93_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method1207() {
		if (Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242) || Static294.anInt5492 == Static97.anInt1863) {
			Static100.method1794(Static240.aClass14_7);
			if (Static500.anInt8331 != Static97.anInt1863) {
				Static422.method6091();
			}
		} else {
			Static66.method1315(false, 11, Static455.anInt7847, Static447.anInt7737);
		}
	}
}
