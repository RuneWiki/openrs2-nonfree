import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V")
	public static void method1277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = arg3; local11 < arg0 + arg3; local11++) {
			for (local15 = arg4; local15 < arg4 + arg1; local15++) {
				if (local15 >= 0 && local15 < Static350.anInt6637 && local11 >= 0 && local11 < Static105.anInt2647) {
					Static338.anIntArrayArrayArray40[arg2][local15][local11] = arg2 <= 0 ? 0 : Static338.anIntArrayArrayArray40[arg2 - 1][local15][local11] - 240;
				}
			}
		}
		if (arg4 > 0 && Static350.anInt6637 > arg4) {
			for (local15 = arg3 + 1; local15 < arg3 + arg0; local15++) {
				if (local15 >= 0 && local15 < Static105.anInt2647) {
					Static338.anIntArrayArrayArray40[arg2][arg4][local15] = Static338.anIntArrayArrayArray40[arg2][arg4 - 1][local15];
				}
			}
		}
		if (arg3 > 0 && Static105.anInt2647 > arg3) {
			for (local15 = arg4 + 1; local15 < arg1 + arg4; local15++) {
				if (local15 >= 0 && local15 < Static350.anInt6637) {
					Static338.anIntArrayArrayArray40[arg2][local15][arg3] = Static338.anIntArrayArrayArray40[arg2][local15][arg3 - 1];
				}
			}
		}
		if (arg4 < 0 || arg3 < 0 || arg4 >= Static350.anInt6637 || arg3 >= Static105.anInt2647) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 > 0 && Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3] != 0) {
				Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3];
				return;
			}
			if (arg3 > 0 && Static338.anIntArrayArrayArray40[arg2][arg4][arg3 - 1] != 0) {
				Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4][arg3 - 1];
				return;
			}
			if (arg4 > 0 && arg3 > 0 && Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3 - 1] != 0) {
				Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3] != Static338.anIntArrayArrayArray40[arg2 - 1][arg4 - 1][arg3]) {
			Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3];
			return;
		}
		if (arg3 > 0 && Static338.anIntArrayArrayArray40[arg2][arg4][arg3 - 1] != Static338.anIntArrayArrayArray40[arg2 - 1][arg4][arg3 - 1]) {
			Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4][arg3 - 1];
			return;
		}
		if (arg4 > 0 && arg3 > 0 && Static338.anIntArrayArrayArray40[arg2 - 1][arg4 - 1][arg3 - 1] != Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3 - 1]) {
			Static338.anIntArrayArrayArray40[arg2][arg4][arg3] = Static338.anIntArrayArrayArray40[arg2][arg4 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[S)[S")
	public static short[] method1280(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static359.method762(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!pl;IIII)V")
	public static void method1281(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static351.method5596(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static198.anInt4128) {
			Static351.method5596(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static351.method5596(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static15.anInt1162) {
			Static351.method5596(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static15.anInt1162) {
			Static351.method5596(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static198.anInt4128 && arg4 <= Static15.anInt1162) {
			Static351.method5596(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static351.method5596(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static198.anInt4128 && arg4 > 0) {
			Static351.method5596(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
