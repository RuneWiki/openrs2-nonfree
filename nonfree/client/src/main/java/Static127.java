import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	public static int anInt3198;

	@OriginalMember(owner = "client!kk", name = "N", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "Lclient!lc;")
	public static Class79 aClass79_18 = new Class79(4);

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString204 = "Allocating memory";

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2419(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static133.aString212 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static82.aString136 + "</col>";
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)Z")
	public static boolean method2420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static248.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static134.anInt3305) {
			return false;
		} else if (local7 == Static134.anInt3305) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static252.method4076(local22 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg2], local26 + 1) && Static252.method4076(local22 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local26 + 1) && Static252.method4076(local22 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static252.method4076(local22 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static248.anIntArrayArrayArray13[arg0][arg1][arg2] = Static134.anInt3305;
				return true;
			} else {
				Static248.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static134.anInt3305;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIII)V")
	public static void method2421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg2; local7 <= arg2 + arg0; local7++) {
			for (local11 = arg3; local11 <= arg3 + arg4; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static39.aByteArrayArrayArray4[arg1][local11][local7] = 127;
				}
			}
		}
		@Pc(64) int local64;
		for (local11 = arg2; local11 < arg2 + arg0; local11++) {
			for (local64 = arg3; local64 < arg3 + arg4; local64++) {
				if (local64 >= 0 && local64 < 104 && local11 >= 0 && local11 < 104) {
					Static38.anIntArrayArrayArray6[arg1][local64][local11] = arg1 > 0 ? Static38.anIntArrayArrayArray6[arg1 - 1][local64][local11] : 0;
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local64 = arg2 + 1; local64 < arg0 + arg2; local64++) {
				if (local64 >= 0 && local64 < 104) {
					Static38.anIntArrayArrayArray6[arg1][arg3][local64] = Static38.anIntArrayArrayArray6[arg1][arg3 - 1][local64];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local64 = arg3 + 1; local64 < arg3 + arg4; local64++) {
				if (local64 >= 0 && local64 < 104) {
					Static38.anIntArrayArrayArray6[arg1][local64][arg2] = Static38.anIntArrayArrayArray6[arg1][local64][arg2 - 1];
				}
			}
		}
		if (arg3 < 0 || arg2 < 0 || arg3 >= 104 || arg2 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 > 0 && Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2] != 0) {
				Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2];
				return;
			}
			if (arg2 > 0 && Static38.anIntArrayArrayArray6[arg1][arg3][arg2 - 1] != 0) {
				Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3][arg2 - 1];
				return;
			}
			if (arg3 > 0 && arg2 > 0 && Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2 - 1] != 0) {
				Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2] != Static38.anIntArrayArrayArray6[arg1 - 1][arg3 - 1][arg2]) {
			Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2];
			return;
		}
		if (arg2 > 0 && Static38.anIntArrayArrayArray6[arg1][arg3][arg2 - 1] != Static38.anIntArrayArrayArray6[arg1 - 1][arg3][arg2 - 1]) {
			Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3][arg2 - 1];
			return;
		}
		if (arg3 > 0 && arg2 > 0 && Static38.anIntArrayArrayArray6[arg1 - 1][arg3 - 1][arg2 - 1] != Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2 - 1]) {
			Static38.anIntArrayArrayArray6[arg1][arg3][arg2] = Static38.anIntArrayArrayArray6[arg1][arg3 - 1][arg2 - 1];
			return;
		}
	}
}
