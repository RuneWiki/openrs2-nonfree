import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
	public static int anInt1515;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)V")
	public static void method1391() {
		Static53.anIntArray80 = null;
		Static179.anIntArray373 = null;
		Static71.anIntArray88 = null;
		Static142.aBoolean211 = false;
		Static345.anIntArray567 = null;
		Static370.anIntArray618 = null;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static432.anIntArrayArrayArray8[arg0][local16][local20] == -Static85.anInt7651) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static286.anInt5018) + 1;
			@Pc(142) int local142 = (arg3 << Static286.anInt5018) + 2;
			@Pc(151) int local151 = Static332.aClass154Array3[arg0].ua(arg1, arg3) + arg5;
			if (!Static330.method1920(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static286.anInt5018) - 1;
			if (!Static330.method1920(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static286.anInt5018) - 1;
			if (!Static330.method1920(local20, local151, local177)) {
				return false;
			} else if (Static330.method1920(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static305.method4247(arg0, arg1, arg3)) {
			local16 = arg1 << Static286.anInt5018;
			local20 = arg3 << Static286.anInt5018;
			return Static330.method1920(local16 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static330.method1920(local16 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static330.method1920(local16 + Static335.anInt5671 - 1, Static332.aClass154Array3[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static335.anInt5671 - 1) && Static330.method1920(local16 + 1, Static332.aClass154Array3[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static335.anInt5671 - 1);
		} else {
			return false;
		}
	}
}
