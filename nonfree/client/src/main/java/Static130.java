import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray89;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "[I")
	public static final int[] anIntArray762 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method7765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static156.anIntArrayArrayArray8[arg0][local16][local20] == -Static230.anInt4157) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static175.anInt3259) + 1;
			@Pc(142) int local142 = (arg3 << Static175.anInt3259) + 2;
			@Pc(151) int local151 = Static532.aClass75Array3[arg0].ba(arg1, arg3) + arg5;
			if (!Static468.method7043(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static175.anInt3259) - 1;
			if (!Static468.method7043(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static175.anInt3259) - 1;
			if (!Static468.method7043(local20, local151, local177)) {
				return false;
			} else if (Static468.method7043(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static266.method4294(arg0, arg1, arg3)) {
			local16 = arg1 << Static175.anInt3259;
			local20 = arg3 << Static175.anInt3259;
			return Static468.method7043(local16 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static468.method7043(local16 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static468.method7043(local16 + Static136.anInt2574 - 1, Static532.aClass75Array3[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static136.anInt2574 - 1) && Static468.method7043(local16 + 1, Static532.aClass75Array3[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static136.anInt2574 - 1);
		} else {
			return false;
		}
	}
}
