import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	public static void method2065() {
		@Pc(1) Class26 local1 = Static262.aClass26_49;
		synchronized (Static262.aClass26_49) {
			Static262.aClass26_49.method333();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIII)V")
	public static void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static166.anInt3315 || arg3 < Static240.anInt4829) {
			return;
		}
		@Pc(28) boolean local28;
		if (arg1 < Static280.anInt212) {
			arg1 = Static280.anInt212;
			local28 = false;
		} else if (Static346.anInt6607 >= arg1) {
			local28 = true;
		} else {
			arg1 = Static346.anInt6607;
			local28 = false;
		}
		@Pc(56) boolean local56;
		if (arg4 < Static280.anInt212) {
			arg4 = Static280.anInt212;
			local56 = false;
		} else if (Static346.anInt6607 >= arg4) {
			local56 = true;
		} else {
			arg4 = Static346.anInt6607;
			local56 = false;
		}
		if (Static240.anInt4829 > arg0) {
			arg0 = Static240.anInt4829;
		} else {
			Static224.method5303(Static73.anIntArrayArray6[arg0++], arg4, arg2, arg1);
		}
		if (arg3 > Static166.anInt3315) {
			arg3 = Static166.anInt3315;
		} else {
			Static224.method5303(Static73.anIntArrayArray6[arg3--], arg4, arg2, arg1);
		}
		@Pc(111) int local111;
		if (local28 && local56) {
			for (local111 = arg0; local111 <= arg3; local111++) {
				@Pc(153) int[] local153 = Static73.anIntArrayArray6[local111];
				local153[arg1] = local153[arg4] = arg2;
			}
		} else if (local28) {
			for (local111 = arg0; local111 <= arg3; local111++) {
				Static73.anIntArrayArray6[local111][arg1] = arg2;
			}
		} else if (local56) {
			for (local111 = arg0; local111 <= arg3; local111++) {
				Static73.anIntArrayArray6[local111][arg4] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIILclient!hh;IIII)Z")
	public static boolean method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg1 - 64;
		@Pc(23) int local23 = arg4 - 64;
		Static135.anIntArrayArray26[64][64] = 99;
		Static329.anIntArrayArray75[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static182.anIntArray268[0] = arg1;
		@Pc(51) int local51 = local42 + 1;
		Static185.anIntArray283[0] = arg4;
		@Pc(56) int[][] local56 = arg6.anIntArrayArray18;
		while (local51 != local44) {
			local7 = Static182.anIntArray268[local44];
			local9 = Static185.anIntArray283[local44];
			@Pc(70) int local70 = local9 - local23;
			local44 = local44 + 1 & 0xFFF;
			@Pc(81) int local81 = local7 - local18;
			@Pc(87) int local87 = local7 - arg6.anInt2163;
			@Pc(93) int local93 = local9 - arg6.anInt2177;
			if (arg7 == -4) {
				if (arg2 == local7 && local9 == arg0) {
					Static165.anInt3290 = local7;
					Static236.anInt4751 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static180.method4117(arg5, arg9, local9, 2, 2, local7, arg2, arg0)) {
					Static165.anInt3290 = local7;
					Static236.anInt4751 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg6.method1764(arg9, 2, arg2, arg5, arg0, local9, local7, arg3, 2)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg6.method1768(arg5, arg9, arg3, local7, 2, arg2, local9, arg0)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg6.method1757(arg7, local9, arg8, arg0, arg2, local7, 2)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg6.method1766(arg0, arg8, local9, arg7, 2, arg2, local7)) {
				Static165.anInt3290 = local7;
				Static236.anInt4751 = local9;
				return true;
			}
			@Pc(242) int local242 = Static329.anIntArrayArray75[local81][local70] + 1;
			if (local81 > 0 && Static135.anIntArrayArray26[local81 - 1][local70] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static182.anIntArray268[local51] = local7 - 1;
				Static185.anIntArray283[local51] = local9;
				Static135.anIntArrayArray26[local81 - 1][local70] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local81 - 1][local70] = local242;
			}
			if (local81 < 126 && Static135.anIntArrayArray26[local81 + 1][local70] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static182.anIntArray268[local51] = local7 + 1;
				Static185.anIntArray283[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81 + 1][local70] = 8;
				Static329.anIntArrayArray75[local81 + 1][local70] = local242;
			}
			if (local70 > 0 && Static135.anIntArrayArray26[local81][local70 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static182.anIntArray268[local51] = local7;
				Static185.anIntArray283[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81][local70 - 1] = 1;
				Static329.anIntArrayArray75[local81][local70 - 1] = local242;
			}
			if (local70 < 126 && Static135.anIntArrayArray26[local81][local70 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static182.anIntArray268[local51] = local7;
				Static185.anIntArray283[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81][local70 + 1] = 4;
				Static329.anIntArrayArray75[local81][local70 + 1] = local242;
			}
			if (local81 > 0 && local70 > 0 && Static135.anIntArrayArray26[local81 - 1][local70 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static182.anIntArray268[local51] = local7 - 1;
				Static185.anIntArray283[local51] = local9 - 1;
				Static135.anIntArrayArray26[local81 - 1][local70 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local81 - 1][local70 - 1] = local242;
			}
			if (local81 < 126 && local70 > 0 && Static135.anIntArrayArray26[local81 + 1][local70 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static182.anIntArray268[local51] = local7 + 1;
				Static185.anIntArray283[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81 + 1][local70 - 1] = 9;
				Static329.anIntArrayArray75[local81 + 1][local70 - 1] = local242;
			}
			if (local81 > 0 && local70 < 126 && Static135.anIntArrayArray26[local81 - 1][local70 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static182.anIntArray268[local51] = local7 - 1;
				Static185.anIntArray283[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81 - 1][local70 + 1] = 6;
				Static329.anIntArrayArray75[local81 - 1][local70 + 1] = local242;
			}
			if (local81 < 126 && local70 < 126 && Static135.anIntArrayArray26[local81 + 1][local70 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static182.anIntArray268[local51] = local7 + 1;
				Static185.anIntArray283[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local81 + 1][local70 + 1] = 12;
				Static329.anIntArrayArray75[local81 + 1][local70 + 1] = local242;
			}
		}
		Static165.anInt3290 = local7;
		Static236.anInt4751 = local9;
		return false;
	}
}
