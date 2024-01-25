import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public static int anInt6380;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt6382;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_84 = new Class212(47, 3);

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public static int anInt6378 = 0;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
	public static final int[] anIntArray514 = new int[5];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method5234() {
		Static93.anInt2064 = 0;
		Static121.aClass7Array2 = new Class7[50];
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!eu;)V")
	public static void method5235(@OriginalArg(1) Class4_Sub14 arg0) {
		if (!Static87.aBoolean142) {
			arg0.method6330();
			Static352.anInt6233--;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ue;IIIIIIIIII)Z")
	public static boolean method5236(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg3 - 64;
		Static227.anIntArrayArray33[64][64] = 99;
		@Pc(34) int local34 = arg7 - 64;
		Static459.anIntArrayArray58[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static405.anIntArray576[0] = arg3;
		@Pc(51) int local51 = local42 + 1;
		Static336.anIntArray488[0] = arg7;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray55;
		while (local44 != local51) {
			local7 = Static405.anIntArray576[local44];
			local9 = Static336.anIntArray488[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(78) int local78 = local9 - arg0.anInt7189;
			@Pc(83) int local83 = local7 - local18;
			@Pc(89) int local89 = local7 - arg0.anInt7191;
			@Pc(94) int local94 = local9 - local34;
			if (arg9 == -4) {
				if (arg8 == local7 && arg6 == local9) {
					Static257.anInt4975 = local9;
					Static240.anInt4706 = local7;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static323.method2066(arg5, arg1, arg8, local9, local7, 1, arg6, 1)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg0.method5727(arg8, 1, arg6, local7, arg1, 1, arg5, local9, arg2)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg0.method5734(arg6, arg2, 1, arg1, arg8, local7, arg5, local9)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg0.method5738(arg9, arg8, arg6, local7, local9, 1, arg4)) {
					Static240.anInt4706 = local7;
					Static257.anInt4975 = local9;
					return true;
				}
			} else if (arg0.method5735(arg8, arg6, arg4, local9, 1, local7, arg9)) {
				Static240.anInt4706 = local7;
				Static257.anInt4975 = local9;
				return true;
			}
			@Pc(249) int local249 = Static459.anIntArrayArray58[local83][local94] + 1;
			if (local83 > 0 && Static227.anIntArrayArray33[local83 - 1][local94] == 0 && (local56[local89 - 1][local78] & 0x42240000) == 0) {
				Static405.anIntArray576[local51] = local7 - 1;
				Static336.anIntArray488[local51] = local9;
				Static227.anIntArrayArray33[local83 - 1][local94] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local83 - 1][local94] = local249;
			}
			if (local83 < 127 && Static227.anIntArrayArray33[local83 + 1][local94] == 0 && (local56[local89 + 1][local78] & 0x60240000) == 0) {
				Static405.anIntArray576[local51] = local7 + 1;
				Static336.anIntArray488[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local83 + 1][local94] = 8;
				Static459.anIntArrayArray58[local83 + 1][local94] = local249;
			}
			if (local94 > 0 && Static227.anIntArrayArray33[local83][local94 - 1] == 0 && (local56[local89][local78 - 1] & 0x40A40000) == 0) {
				Static405.anIntArray576[local51] = local7;
				Static336.anIntArray488[local51] = local9 - 1;
				Static227.anIntArrayArray33[local83][local94 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local83][local94 - 1] = local249;
			}
			if (local94 < 127 && Static227.anIntArrayArray33[local83][local94 + 1] == 0 && (local56[local89][local78 + 1] & 0x48240000) == 0) {
				Static405.anIntArray576[local51] = local7;
				Static336.anIntArray488[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local83][local94 + 1] = 4;
				Static459.anIntArrayArray58[local83][local94 + 1] = local249;
			}
			if (local83 > 0 && local94 > 0 && Static227.anIntArrayArray33[local83 - 1][local94 - 1] == 0 && (local56[local89 - 1][local78 - 1] & 0x43A40000) == 0 && (local56[local89 - 1][local78] & 0x42240000) == 0 && (local56[local89][local78 - 1] & 0x40A40000) == 0) {
				Static405.anIntArray576[local51] = local7 - 1;
				Static336.anIntArray488[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local83 - 1][local94 - 1] = 3;
				Static459.anIntArrayArray58[local83 - 1][local94 - 1] = local249;
			}
			if (local83 < 127 && local94 > 0 && Static227.anIntArrayArray33[local83 + 1][local94 - 1] == 0 && (local56[local89 + 1][local78 - 1] & 0x60E40000) == 0 && (local56[local89 + 1][local78] & 0x60240000) == 0 && (local56[local89][local78 - 1] & 0x40A40000) == 0) {
				Static405.anIntArray576[local51] = local7 + 1;
				Static336.anIntArray488[local51] = local9 - 1;
				Static227.anIntArrayArray33[local83 + 1][local94 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static459.anIntArrayArray58[local83 + 1][local94 - 1] = local249;
			}
			if (local83 > 0 && local94 < 127 && Static227.anIntArrayArray33[local83 - 1][local94 + 1] == 0 && (local56[local89 - 1][local78 + 1] & 0x4E240000) == 0 && (local56[local89 - 1][local78] & 0x42240000) == 0 && (local56[local89][local78 + 1] & 0x48240000) == 0) {
				Static405.anIntArray576[local51] = local7 - 1;
				Static336.anIntArray488[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local83 - 1][local94 + 1] = 6;
				Static459.anIntArrayArray58[local83 - 1][local94 + 1] = local249;
			}
			if (local83 < 127 && local94 < 127 && Static227.anIntArrayArray33[local83 + 1][local94 + 1] == 0 && (local56[local89 + 1][local78 + 1] & 0x78240000) == 0 && (local56[local89 + 1][local78] & 0x60240000) == 0 && (local56[local89][local78 + 1] & 0x48240000) == 0) {
				Static405.anIntArray576[local51] = local7 + 1;
				Static336.anIntArray488[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static227.anIntArrayArray33[local83 + 1][local94 + 1] = 12;
				Static459.anIntArrayArray58[local83 + 1][local94 + 1] = local249;
			}
		}
		Static257.anInt4975 = local9;
		Static240.anInt4706 = local7;
		return false;
	}
}
