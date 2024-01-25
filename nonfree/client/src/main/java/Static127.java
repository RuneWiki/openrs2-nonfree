import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[Lclient!d;")
	public static Class60[] aClass60Array7;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public static int method3632() {
		@Pc(9) int local9 = Static28.aClass161_1.method3451();
		if (Static446.aClass161Array1.length - 1 > local9) {
			Static28.aClass161_1 = Static446.aClass161Array1[local9 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!sl;IIIIIIIII)Z")
	public static boolean method3633(@OriginalArg(0) int arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg5 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static88.anIntArrayArray26[64][64] = 99;
		Static102.anIntArrayArray29[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static160.anIntArray325[0] = arg5;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static502.anIntArray649[0] = arg4;
		@Pc(51) int[][] local51 = arg1.anIntArrayArray80;
		while (local46 != local43) {
			local9 = Static502.anIntArray649[local43];
			local7 = Static160.anIntArray325[local43];
			@Pc(67) int local67 = local9 - arg1.anInt7934;
			@Pc(72) int local72 = local9 - local23;
			local43 = local43 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - arg1.anInt7938;
			@Pc(87) int local87 = local7 - local18;
			if (arg6 == -4) {
				if (local7 == arg8 && local9 == arg9) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static134.method1997(1, arg8, arg7, local9, arg9, local7, arg2, 1)) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method6561(1, local7, arg9, arg7, arg2, arg8, 1, arg0, local9)) {
					Static119.anInt7676 = local7;
					Static97.anInt1600 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method6547(arg9, 1, arg2, local7, arg8, local9, arg7, arg0)) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method6545(arg9, 1, arg3, arg8, arg6, local9, local7)) {
					Static97.anInt1600 = local9;
					Static119.anInt7676 = local7;
					return true;
				}
			} else if (arg1.method6559(arg3, arg9, 1, arg8, arg6, local7, local9)) {
				Static119.anInt7676 = local7;
				Static97.anInt1600 = local9;
				return true;
			}
			@Pc(248) int local248 = Static102.anIntArrayArray29[local87][local72] + 1;
			if (local87 > 0 && Static88.anIntArrayArray26[local87 - 1][local72] == 0 && (local51[local83 - 1][local67] & 0x42240000) == 0) {
				Static160.anIntArray325[local46] = local7 - 1;
				Static502.anIntArray649[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87 - 1][local72] = 2;
				Static102.anIntArrayArray29[local87 - 1][local72] = local248;
			}
			if (local87 < 127 && Static88.anIntArrayArray26[local87 + 1][local72] == 0 && (local51[local83 + 1][local67] & 0x60240000) == 0) {
				Static160.anIntArray325[local46] = local7 + 1;
				Static502.anIntArray649[local46] = local9;
				Static88.anIntArrayArray26[local87 + 1][local72] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local87 + 1][local72] = local248;
			}
			if (local72 > 0 && Static88.anIntArrayArray26[local87][local72 - 1] == 0 && (local51[local83][local67 - 1] & 0x40A40000) == 0) {
				Static160.anIntArray325[local46] = local7;
				Static502.anIntArray649[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87][local72 - 1] = 1;
				Static102.anIntArrayArray29[local87][local72 - 1] = local248;
			}
			if (local72 < 127 && Static88.anIntArrayArray26[local87][local72 + 1] == 0 && (local51[local83][local67 + 1] & 0x48240000) == 0) {
				Static160.anIntArray325[local46] = local7;
				Static502.anIntArray649[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87][local72 + 1] = 4;
				Static102.anIntArrayArray29[local87][local72 + 1] = local248;
			}
			if (local87 > 0 && local72 > 0 && Static88.anIntArrayArray26[local87 - 1][local72 - 1] == 0 && (local51[local83 - 1][local67 - 1] & 0x43A40000) == 0 && (local51[local83 - 1][local67] & 0x42240000) == 0 && (local51[local83][local67 - 1] & 0x40A40000) == 0) {
				Static160.anIntArray325[local46] = local7 - 1;
				Static502.anIntArray649[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87 - 1][local72 - 1] = 3;
				Static102.anIntArrayArray29[local87 - 1][local72 - 1] = local248;
			}
			if (local87 < 127 && local72 > 0 && Static88.anIntArrayArray26[local87 + 1][local72 - 1] == 0 && (local51[local83 + 1][local67 - 1] & 0x60E40000) == 0 && (local51[local83 + 1][local67] & 0x60240000) == 0 && (local51[local83][local67 - 1] & 0x40A40000) == 0) {
				Static160.anIntArray325[local46] = local7 + 1;
				Static502.anIntArray649[local46] = local9 - 1;
				Static88.anIntArrayArray26[local87 + 1][local72 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static102.anIntArrayArray29[local87 + 1][local72 - 1] = local248;
			}
			if (local87 > 0 && local72 < 127 && Static88.anIntArrayArray26[local87 - 1][local72 + 1] == 0 && (local51[local83 - 1][local67 + 1] & 0x4E240000) == 0 && (local51[local83 - 1][local67] & 0x42240000) == 0 && (local51[local83][local67 + 1] & 0x48240000) == 0) {
				Static160.anIntArray325[local46] = local7 - 1;
				Static502.anIntArray649[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87 - 1][local72 + 1] = 6;
				Static102.anIntArrayArray29[local87 - 1][local72 + 1] = local248;
			}
			if (local87 < 127 && local72 < 127 && Static88.anIntArrayArray26[local87 + 1][local72 + 1] == 0 && (local51[local83 + 1][local67 + 1] & 0x78240000) == 0 && (local51[local83 + 1][local67] & 0x60240000) == 0 && (local51[local83][local67 + 1] & 0x48240000) == 0) {
				Static160.anIntArray325[local46] = local7 + 1;
				Static502.anIntArray649[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static88.anIntArrayArray26[local87 + 1][local72 + 1] = 12;
				Static102.anIntArrayArray29[local87 + 1][local72 + 1] = local248;
			}
		}
		Static97.anInt1600 = local9;
		Static119.anInt7676 = local7;
		return false;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([BBI)I")
	public static int method3634(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static121.method1828(0, arg0, arg1);
	}
}
