import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int anInt6325 = 0;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Lclient!ae;")
	public static final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_3 = new Class5_Sub1_Sub1(5000);

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public static int anInt6338 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIB)V")
	public static void method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = arg4; local12 < arg4 + arg0; local12++) {
			for (local16 = arg2; local16 < arg2 + arg3; local16++) {
				if (local16 >= 0 && Static266.anInt5101 > local16 && local12 >= 0 && Static339.anInt6352 > local12) {
					Static200.anIntArrayArrayArray17[arg1][local16][local12] = arg1 > 0 ? Static200.anIntArrayArrayArray17[arg1 - 1][local16][local12] - 240 : 0;
				}
			}
		}
		if (arg2 > 0 && Static266.anInt5101 > arg2) {
			for (local16 = arg4 + 1; local16 < arg4 + arg0; local16++) {
				if (local16 >= 0 && local16 < Static339.anInt6352) {
					Static200.anIntArrayArrayArray17[arg1][arg2][local16] = Static200.anIntArrayArrayArray17[arg1][arg2 - 1][local16];
				}
			}
		}
		if (arg4 > 0 && Static339.anInt6352 > arg4) {
			for (local16 = arg2 + 1; local16 < arg3 + arg2; local16++) {
				if (local16 >= 0 && Static266.anInt5101 > local16) {
					Static200.anIntArrayArrayArray17[arg1][local16][arg4] = Static200.anIntArrayArrayArray17[arg1][local16][arg4 - 1];
				}
			}
		}
		if (arg2 < 0 || arg4 < 0 || Static266.anInt5101 <= arg2 || arg4 >= Static339.anInt6352) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && Static200.anIntArrayArrayArray17[arg1 - 1][arg2 - 1][arg4] != Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4]) {
				Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static200.anIntArrayArrayArray17[arg1 - 1][arg2][arg4 - 1] != Static200.anIntArrayArrayArray17[arg1][arg2][arg4 - 1]) {
				Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2][arg4 - 1];
				return;
			}
			if (arg2 > 0 && arg4 > 0 && Static200.anIntArrayArrayArray17[arg1 - 1][arg2 - 1][arg4 - 1] != Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4 - 1]) {
				Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4] != 0) {
			Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static200.anIntArrayArrayArray17[arg1][arg2][arg4 - 1] != 0) {
			Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2][arg4 - 1];
			return;
		}
		if (arg2 > 0 && arg4 > 0 && Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4 - 1] != 0) {
			Static200.anIntArrayArrayArray17[arg1][arg2][arg4] = Static200.anIntArrayArrayArray17[arg1][arg2 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)Lclient!gp;")
	public static Class75 method5602(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static186.aFloat98 == 3.0D) {
				return Static172.aClass75_5;
			}
			if ((double) Static186.aFloat98 == 4.0D) {
				return Static188.aClass75_6;
			}
			if ((double) Static186.aFloat98 == 6.0D) {
				return Static228.aClass75_8;
			}
			if ((double) Static186.aFloat98 >= 8.0D) {
				return Static225.aClass75_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static186.aFloat98 == 3.0D) {
				return Static228.aClass75_8;
			}
			if ((double) Static186.aFloat98 == 4.0D) {
				return Static225.aClass75_7;
			}
			if ((double) Static186.aFloat98 == 6.0D) {
				return Static161.aClass75_4;
			}
			if ((double) Static186.aFloat98 >= 8.0D) {
				return Static106.aClass75_1;
			}
		} else if (arg0 == 2) {
			if ((double) Static186.aFloat98 == 3.0D) {
				return Static161.aClass75_4;
			}
			if ((double) Static186.aFloat98 == 4.0D) {
				return Static106.aClass75_1;
			}
			if ((double) Static186.aFloat98 == 6.0D) {
				return Static302.aClass75_9;
			}
			if ((double) Static186.aFloat98 >= 8.0D) {
				return Static191.aClass75_10;
			}
		}
		return null;
	}
}
