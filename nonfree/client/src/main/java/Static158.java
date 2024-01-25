import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!fw", name = "h", descriptor = "[Lclient!i;")
	public static Class17[] aClass17Array2;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!nu;)V")
	public static void method2424(@OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub2 arg0) {
		for (@Pc(14) Class1_Sub30 local14 = (Class1_Sub30) Static381.aClass361_69.method7854(); local14 != null; local14 = (Class1_Sub30) Static381.aClass361_69.method7853()) {
			if (arg0 == local14.aClass20_Sub2_Sub4_Sub1_Sub2_1) {
				if (local14.aClass1_Sub8_Sub1_4 != null) {
					Static298.aClass1_Sub8_Sub4_2.method6033(local14.aClass1_Sub8_Sub1_4);
					local14.aClass1_Sub8_Sub1_4 = null;
				}
				local14.method7878();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!ir;)V")
	public static void method2429(@OriginalArg(0) Class20_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static464.anIntArray526[local4]; local7++) {
				if (Static166.aClass20_Sub2ArrayArray1[local4][local7] == arg0) {
					Static600.method3766(Static166.aClass20_Sub2ArrayArray1[local4], local7 + 1, Static166.aClass20_Sub2ArrayArray1[local4], local7, Static464.anIntArray526[local4] - local7 - 1);
					local37 = Static464.anIntArray526[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static288.anIntArray327[local4]; local49++) {
				if (Static386.aClass20_Sub2ArrayArray3[local4][local49] == arg0) {
					Static600.method3766(Static386.aClass20_Sub2ArrayArray3[local4], local49 + 1, Static386.aClass20_Sub2ArrayArray3[local4], local49, Static288.anIntArray327[local4] - local49 - 1);
					local37 = Static288.anIntArray327[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static431.anIntArray499[local4]; local91++) {
				if (Static379.aClass20_Sub2ArrayArray2[local4][local91] == arg0) {
					Static600.method3766(Static379.aClass20_Sub2ArrayArray2[local4], local91 + 1, Static379.aClass20_Sub2ArrayArray2[local4], local91, Static431.anIntArray499[local4] - local91 - 1);
					local37 = Static431.anIntArray499[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z")
	public static boolean method2431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static457.aBoolean566) {
			return false;
		} else if (Static13.anInt359 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static354.anIntArrayArrayArray14[arg1][arg0][arg2];
			if (-Static7.anInt135 == local22) {
				return false;
			} else if (local22 == Static7.anInt135) {
				return true;
			} else if (Static499.aClass17Array3 == Static20.aClass17Array1) {
				return false;
			} else {
				@Pc(46) int local46 = arg0 << Static378.anInt6665;
				@Pc(50) int local50 = arg2 << Static378.anInt6665;
				if (Static314.method4794(Static20.aClass17Array1[arg1].method6642(arg0, arg2), Static20.aClass17Array1[arg1].method6642(arg0, arg2 + 1), local50 + Static47.anInt1239 - 1, local50 + (Static47.anInt1239 - 1), Static20.aClass17Array1[arg1].method6642(arg0 + 1, arg2 - -1), local46 + 1, local50 + 1, local46 + 1, Static47.anInt1239 + -1 + local46) && Static314.method4794(Static20.aClass17Array1[arg1].method6642(arg0, arg2), Static20.aClass17Array1[arg1].method6642(arg0 + 1, arg2 + 1), Static47.anInt1239 + local50 - 1, local50 - -1, Static20.aClass17Array1[arg1].method6642(arg0 + 1, arg2), local46 + 1, local50 + 1, local46 + Static47.anInt1239 - 1, local46 + -1 + Static47.anInt1239)) {
					Static500.anInt6882++;
					Static354.anIntArrayArrayArray14[arg1][arg0][arg2] = Static7.anInt135;
					return true;
				} else {
					Static354.anIntArrayArrayArray14[arg1][arg0][arg2] = -Static7.anInt135;
					return false;
				}
			}
		}
	}
}
