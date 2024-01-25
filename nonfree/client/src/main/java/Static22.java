import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "Lclient!cv;")
	public static final Class51 aClass51_2 = new Class51(8);

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_13 = new Class254(0, 5);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static291.anIntArrayArrayArray141[arg0][local16][local20] == -Static79.anInt1457) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static58.anInt1051) + 1;
			@Pc(142) int local142 = (arg3 << Static58.anInt1051) + 2;
			@Pc(151) int local151 = Static256.aClass70Array2[arg0].I(arg1, arg3) + arg5;
			if (!Static87.method4374(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static58.anInt1051) - 1;
			if (!Static87.method4374(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static58.anInt1051) - 1;
			if (!Static87.method4374(local20, local151, local177)) {
				return false;
			} else if (Static87.method4374(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static406.method5515(arg0, arg1, arg3)) {
			local16 = arg1 << Static58.anInt1051;
			local20 = arg3 << Static58.anInt1051;
			return Static87.method4374(local16 + 1, Static256.aClass70Array2[arg0].I(arg1, arg3) + arg5, local20 + 1) && Static87.method4374(local16 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg3) + arg5, local20 + 1) && Static87.method4374(local16 + Static297.anInt4985 - 1, Static256.aClass70Array2[arg0].I(arg1 + 1, arg3 + 1) + arg5, local20 + Static297.anInt4985 - 1) && Static87.method4374(local16 + 1, Static256.aClass70Array2[arg0].I(arg1, arg3 + 1) + arg5, local20 + Static297.anInt4985 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IBI)V")
	public static void method255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static44.anInt680 = arg0 - Static350.anInt6636;
		Static150.anInt2693 = arg1 - Static350.anInt6639;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
	public static void method256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class137 local28 = Static131.aClass137ArrayArrayArray2[local9][arg0][arg1] = Static131.aClass137ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte48--;
				for (@Pc(40) Class167 local40 = local28.aClass167_1; local40 != null; local40 = local40.aClass167_2) {
					@Pc(44) Class47_Sub1 local44 = local40.aClass47_Sub1_2;
					if (local44.aShort104 == arg0 && local44.aShort105 == arg1) {
						local44.aByte97--;
					}
				}
			}
		}
		if (Static131.aClass137ArrayArrayArray2[0][arg0][arg1] == null) {
			Static131.aClass137ArrayArrayArray2[0][arg0][arg1] = new Class137(0, arg0, arg1);
			Static131.aClass137ArrayArrayArray2[0][arg0][arg1].aByte44 = 1;
		}
		Static131.aClass137ArrayArrayArray2[0][arg0][arg1].aClass137_1 = local7;
		Static131.aClass137ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V")
	public static void method259(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > arg1) {
			Static23.method323(Static283.anIntArrayArray30[arg3], arg1, arg0, arg2);
		} else {
			Static23.method323(Static283.anIntArrayArray30[arg3], arg2, arg0, arg1);
		}
	}
}
