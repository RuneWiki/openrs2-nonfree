import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!ai;")
	private static Class6 aClass6_342 = Static38.method685("Malformed login packet)3");

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_343 = aClass6_342;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method840() {
		aClass6_342 = null;
		anIntArray68 = null;
		aClass6_343 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)V")
	public static void method841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (local11 = 0; local11 < 8; local11++) {
				Static165.anIntArrayArrayArray10[arg2][local7 + arg0][arg1 + local11] = 0;
			}
		}
		if (arg0 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static165.anIntArrayArrayArray10[arg2][arg0][local11 + arg1] = Static165.anIntArrayArrayArray10[arg2][arg0 - 1][local11 + arg1];
			}
		}
		if (arg1 > 0) {
			for (local11 = 1; local11 < 8; local11++) {
				Static165.anIntArrayArrayArray10[arg2][arg0 + local11][arg1] = Static165.anIntArrayArrayArray10[arg2][arg0 + local11][arg1 - 1];
			}
		}
		if (arg0 > 0 && Static165.anIntArrayArrayArray10[arg2][arg0 - 1][arg1] != 0) {
			Static165.anIntArrayArrayArray10[arg2][arg0][arg1] = Static165.anIntArrayArrayArray10[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static165.anIntArrayArrayArray10[arg2][arg0][arg1 - 1] != 0) {
			Static165.anIntArrayArrayArray10[arg2][arg0][arg1] = Static165.anIntArrayArrayArray10[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static165.anIntArrayArrayArray10[arg2][arg0 - 1][arg1 - 1] != 0) {
			Static165.anIntArrayArrayArray10[arg2][arg0][arg1] = Static165.anIntArrayArrayArray10[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public static void method842(@OriginalArg(1) int arg0) {
		Static128.anInt2950 = arg0;
	}
}
