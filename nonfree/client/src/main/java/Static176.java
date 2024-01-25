import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)I")
	public static int method3052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return 1023 - arg1;
		} else if (local16 == 2) {
			return 1023 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static481.anIntArrayArrayArray12[arg0][local16][local20] == -Static108.anInt2350) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static270.anInt5288) + 1;
			@Pc(142) int local142 = (arg3 << Static270.anInt5288) + 2;
			@Pc(151) int local151 = Static248.aClass131Array4[arg0].ba(arg1, arg3) + arg5;
			if (!Static118.method2275(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static270.anInt5288) - 1;
			if (!Static118.method2275(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static270.anInt5288) - 1;
			if (!Static118.method2275(local20, local151, local177)) {
				return false;
			} else if (Static118.method2275(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static523.method7168(arg0, arg1, arg3)) {
			local16 = arg1 << Static270.anInt5288;
			local20 = arg3 << Static270.anInt5288;
			return Static118.method2275(local16 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static118.method2275(local16 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static118.method2275(local16 + Static58.anInt1202 - 1, Static248.aClass131Array4[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static58.anInt1202 - 1) && Static118.method2275(local16 + 1, Static248.aClass131Array4[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static58.anInt1202 - 1);
		} else {
			return false;
		}
	}
}
