import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!kq;")
	public static Class152 aClass152_3;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	public static int anInt4362 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!is;IIIIIIIIII)Z")
	public static boolean method3485(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg7 - 64;
		Static47.anIntArrayArray10[64][64] = 99;
		@Pc(29) int local29 = arg5 - 64;
		Static51.anIntArrayArray12[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static13.anIntArray10[0] = arg7;
		@Pc(51) int local51 = local42 + 1;
		Static149.anIntArray226[0] = arg5;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray38;
		while (local44 != local51) {
			local7 = Static13.anIntArray10[local44];
			local9 = Static149.anIntArray226[local44];
			@Pc(72) int local72 = local9 - arg0.anInt3167;
			local44 = local44 + 1 & 0xFFF;
			@Pc(83) int local83 = local7 - arg0.anInt3180;
			@Pc(88) int local88 = local9 - local29;
			@Pc(92) int local92 = local7 - local18;
			if (arg6 == -4) {
				if (local7 == arg3 && local9 == arg1) {
					Static110.anInt2053 = local9;
					Static228.anInt3904 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static248.method3584(1, local9, local7, arg4, arg1, arg2, 1, arg3)) {
					Static110.anInt2053 = local9;
					Static228.anInt3904 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method2456(arg2, local9, 1, arg4, arg3, arg1, arg8, 1, local7)) {
					Static228.anInt3904 = local7;
					Static110.anInt2053 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method2459(local7, 1, arg8, arg4, arg2, local9, arg3, arg1)) {
					Static110.anInt2053 = local9;
					Static228.anInt3904 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method2463(arg3, arg9, arg1, arg6, local9, 1, local7)) {
					Static110.anInt2053 = local9;
					Static228.anInt3904 = local7;
					return true;
				}
			} else if (arg0.method2449(1, local9, local7, arg3, arg9, arg6, arg1)) {
				Static228.anInt3904 = local7;
				Static110.anInt2053 = local9;
				return true;
			}
			@Pc(245) int local245 = Static51.anIntArrayArray12[local92][local88] + 1;
			if (local92 > 0 && Static47.anIntArrayArray10[local92 - 1][local88] == 0 && (local56[local83 - 1][local72] & 0x42240000) == 0) {
				Static13.anIntArray10[local51] = local7 - 1;
				Static149.anIntArray226[local51] = local9;
				Static47.anIntArrayArray10[local92 - 1][local88] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local92 - 1][local88] = local245;
			}
			if (local92 < 127 && Static47.anIntArrayArray10[local92 + 1][local88] == 0 && (local56[local83 + 1][local72] & 0x60240000) == 0) {
				Static13.anIntArray10[local51] = local7 + 1;
				Static149.anIntArray226[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local92 + 1][local88] = 8;
				Static51.anIntArrayArray12[local92 + 1][local88] = local245;
			}
			if (local88 > 0 && Static47.anIntArrayArray10[local92][local88 - 1] == 0 && (local56[local83][local72 - 1] & 0x40A40000) == 0) {
				Static13.anIntArray10[local51] = local7;
				Static149.anIntArray226[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local92][local88 - 1] = 1;
				Static51.anIntArrayArray12[local92][local88 - 1] = local245;
			}
			if (local88 < 127 && Static47.anIntArrayArray10[local92][local88 + 1] == 0 && (local56[local83][local72 + 1] & 0x48240000) == 0) {
				Static13.anIntArray10[local51] = local7;
				Static149.anIntArray226[local51] = local9 + 1;
				Static47.anIntArrayArray10[local92][local88 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local92][local88 + 1] = local245;
			}
			if (local92 > 0 && local88 > 0 && Static47.anIntArrayArray10[local92 - 1][local88 - 1] == 0 && (local56[local83 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local83 - 1][local72] & 0x42240000) == 0 && (local56[local83][local72 - 1] & 0x40A40000) == 0) {
				Static13.anIntArray10[local51] = local7 - 1;
				Static149.anIntArray226[local51] = local9 - 1;
				Static47.anIntArrayArray10[local92 - 1][local88 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local92 - 1][local88 - 1] = local245;
			}
			if (local92 < 127 && local88 > 0 && Static47.anIntArrayArray10[local92 + 1][local88 - 1] == 0 && (local56[local83 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local83 + 1][local72] & 0x60240000) == 0 && (local56[local83][local72 - 1] & 0x40A40000) == 0) {
				Static13.anIntArray10[local51] = local7 + 1;
				Static149.anIntArray226[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static47.anIntArrayArray10[local92 + 1][local88 - 1] = 9;
				Static51.anIntArrayArray12[local92 + 1][local88 - 1] = local245;
			}
			if (local92 > 0 && local88 < 127 && Static47.anIntArrayArray10[local92 - 1][local88 + 1] == 0 && (local56[local83 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local83 - 1][local72] & 0x42240000) == 0 && (local56[local83][local72 + 1] & 0x48240000) == 0) {
				Static13.anIntArray10[local51] = local7 - 1;
				Static149.anIntArray226[local51] = local9 + 1;
				Static47.anIntArrayArray10[local92 - 1][local88 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local92 - 1][local88 + 1] = local245;
			}
			if (local92 < 127 && local88 < 127 && Static47.anIntArrayArray10[local92 + 1][local88 + 1] == 0 && (local56[local83 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local83 + 1][local72] & 0x60240000) == 0 && (local56[local83][local72 + 1] & 0x48240000) == 0) {
				Static13.anIntArray10[local51] = local7 + 1;
				Static149.anIntArray226[local51] = local9 + 1;
				Static47.anIntArrayArray10[local92 + 1][local88 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static51.anIntArrayArray12[local92 + 1][local88 + 1] = local245;
			}
		}
		Static110.anInt2053 = local9;
		Static228.anInt3904 = local7;
		return false;
	}
}
