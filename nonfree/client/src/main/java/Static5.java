import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!ik;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public static int anInt218 = 0;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[I")
	public static int[] anIntArray7 = new int[1];

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public static int anInt221 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg0 < 1 || arg2 > Static497.anInt7926 - 2 || arg0 > Static646.anInt9979 - 2) {
			return;
		}
		@Pc(42) int local42 = arg3;
		if (arg3 < 3 && Static574.method7435(arg2, arg0)) {
			local42 = arg3 + 1;
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 0 && !Static268.method3817(arg0, local42, arg2, Static606.anInt9196)) {
			return;
		}
		if (Static448.aClass364ArrayArrayArray2 == null) {
			return;
		}
		Static414.aClass114_Sub1_15.method8694(arg0, arg5, Static455.aClass109Array1[arg3], Static153.aClass22_4, arg2, arg3);
		if (arg6 < 0) {
			return;
		}
		@Pc(96) int local96 = Static580.aClass3_Sub22_24.aClass21_Sub5_1.method2407();
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
		Static414.aClass114_Sub1_15.method8697(arg4, arg7, arg1, arg2, arg0, Static153.aClass22_4, local42, arg3, Static455.aClass109Array1[arg3], arg6);
		Static580.aClass3_Sub22_24.method2423(local96, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
		return;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!cja;II)Z")
	public static boolean method230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (!Static42.aBoolean87 || !Static497.aBoolean530) {
			return false;
		} else if (Static532.anInt8283 < 100) {
			return false;
		} else if (Static323.method4705(arg0, arg3, arg1)) {
			@Pc(31) int local31 = arg1 << Static626.anInt9669;
			@Pc(35) int local35 = arg3 << Static626.anInt9669;
			@Pc(45) int local45 = Static477.aClass259Array3[arg0].method9295(arg3, arg1) - 1;
			@Pc(51) int local51 = local45 + arg2.method9081();
			if (arg2.aShort52 == 1) {
				if (!Static574.method7434(local45, local51, local31, local31, local35, local35, local31, local51, Static308.anInt4969 + local35)) {
					return false;
				} else if (Static574.method7434(local45, local45, local31, local31, Static308.anInt4969 + local35, local35, local31, local51, local35 + Static308.anInt4969)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 2) {
				if (!Static574.method7434(local45, local51, Static308.anInt4969 + local31, local31, Static308.anInt4969 + local35, Static308.anInt4969 + local35, local31, local51, Static308.anInt4969 + local35)) {
					return false;
				} else if (Static574.method7434(local45, local51, Static308.anInt4969 + local31, local31, Static308.anInt4969 + local35, local35 + Static308.anInt4969, local31 + Static308.anInt4969, local45, local35 + Static308.anInt4969)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 4) {
				if (!Static574.method7434(local45, local51, Static308.anInt4969 + local31, Static308.anInt4969 + local31, local35, local35, local31 + Static308.anInt4969, local51, local35 + Static308.anInt4969)) {
					return false;
				} else if (Static574.method7434(local45, local45, Static308.anInt4969 + local31, local31 + Static308.anInt4969, local35 + Static308.anInt4969, local35, local31 + Static308.anInt4969, local51, Static308.anInt4969 + local35)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 8) {
				if (!Static574.method7434(local45, local51, local31 + Static308.anInt4969, local31, local35, local35, local31, local51, local35)) {
					return false;
				} else if (Static574.method7434(local45, local51, local31 + Static308.anInt4969, local31, local35, local35, Static308.anInt4969 + local31, local45, local35)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 16) {
				if (Static84.method1820(local35 + Static434.anInt10639, Static434.anInt10639, Static434.anInt10639, local31, local51, local45)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 32) {
				if (Static84.method1820(local35 + Static434.anInt10639, Static434.anInt10639, Static434.anInt10639, Static434.anInt10639 + local31, local51, local45)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 == 64) {
				if (Static84.method1820(local35, Static434.anInt10639, Static434.anInt10639, Static434.anInt10639 + local31, local51, local45)) {
					Static62.anInt1503++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort52 != 128) {
				return true;
			} else if (Static84.method1820(local35, Static434.anInt10639, Static434.anInt10639, local31, local51, local45)) {
				Static62.anInt1503++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
