import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array9;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	public static int anInt5281 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static440.anIntArrayArrayArray14[arg0][local16][local20] == -Static226.anInt3951) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static168.anInt3026) + 1;
			@Pc(142) int local142 = (arg3 << Static168.anInt3026) + 2;
			@Pc(151) int local151 = Static244.aClass165Array8[arg0].l(arg1, arg3) + arg5;
			if (!Static302.method4020(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static168.anInt3026) - 1;
			if (!Static302.method4020(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static168.anInt3026) - 1;
			if (!Static302.method4020(local20, local151, local177)) {
				return false;
			} else if (Static302.method4020(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static194.method2806(arg0, arg1, arg3)) {
			local16 = arg1 << Static168.anInt3026;
			local20 = arg3 << Static168.anInt3026;
			return Static302.method4020(local16 + 1, Static244.aClass165Array8[arg0].l(arg1, arg3) + arg5, local20 + 1) && Static302.method4020(local16 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg3) + arg5, local20 + 1) && Static302.method4020(local16 + Static363.anInt5820 - 1, Static244.aClass165Array8[arg0].l(arg1 + 1, arg3 + 1) + arg5, local20 + Static363.anInt5820 - 1) && Static302.method4020(local16 + 1, Static244.aClass165Array8[arg0].l(arg1, arg3 + 1) + arg5, local20 + Static363.anInt5820 - 1);
		} else {
			return false;
		}
	}
}
