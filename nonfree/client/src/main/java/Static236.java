import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(JI)V")
	public static void method3449(@OriginalArg(0) long arg0) {
		@Pc(19) int local19 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 + Static242.anInt4632;
		@Pc(24) int local24 = Static378.anInt6795 + Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066;
		if (Static34.anInt572 - local19 < -500 || Static34.anInt572 - local19 > 500 || Static241.anInt4245 - local24 < -500 || Static241.anInt4245 - local24 > 500) {
			Static34.anInt572 = local19;
			Static241.anInt4245 = local24;
		}
		@Pc(67) int local67;
		@Pc(75) int local75;
		if (Static34.anInt572 != local19) {
			local67 = local19 - Static34.anInt572;
			local75 = (int) (arg0 * (long) local67 / 320L);
			if (local67 <= 0) {
				if (local75 == 0) {
					local75 = -1;
				} else if (local75 < local67) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = 1;
			} else if (local75 > local67) {
				local75 = local67;
			}
			Static34.anInt572 += local75;
		}
		if (Static241.anInt4245 != local24) {
			local67 = local24 - Static241.anInt4245;
			local75 = (int) (arg0 * (long) local67 / 320L);
			if (local67 > 0) {
				if (local75 == 0) {
					local75 = 1;
				} else if (local67 < local75) {
					local75 = local67;
				}
			} else if (local75 == 0) {
				local75 = -1;
			} else if (local67 > local75) {
				local75 = local67;
			}
			Static241.anInt4245 += local75;
		}
		if (!Static327.aClass230_Sub1_1.aBoolean621) {
			Static90.aFloat25 += (float) arg0 * Static1.aFloat2 / 6.0F;
			Static147.aFloat59 += (float) arg0 * Static285.aFloat4 / 6.0F;
		}
		Static412.method5593();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIII[BII[BI)V")
	public static void method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(26) int local26 = -arg5; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg1++;
				arg4[local34] = (byte) (arg4[local34] - arg6[arg7++]);
				@Pc(47) int local47 = arg1++;
				arg4[local47] = (byte) (arg4[local47] - arg6[arg7++]);
				@Pc(60) int local60 = arg1++;
				arg4[local60] = (byte) (arg4[local60] - arg6[arg7++]);
				@Pc(73) int local73 = arg1++;
				arg4[local73] = (byte) (arg4[local73] - arg6[arg7++]);
			}
			for (@Pc(92) int local92 = local15; local92 < 0; local92++) {
				local34 = arg1++;
				arg4[local34] = (byte) (arg4[local34] - arg6[arg7++]);
			}
			arg7 += arg3;
			arg1 += arg0;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZLclient!oe;IIIIII)Z")
	public static boolean method3451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class181 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg1;
		@Pc(17) int local17 = arg6 - 64;
		@Pc(22) int local22 = arg1 - 64;
		Static210.anIntArrayArray24[64][64] = 99;
		Static81.anIntArrayArray7[64][64] = 0;
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		Static355.anIntArray476[0] = arg6;
		@Pc(58) int local58 = local49 + 1;
		Static366.anIntArray494[0] = arg1;
		@Pc(63) int[][] local63 = arg3.anIntArrayArray29;
		while (local51 != local58) {
			local9 = Static366.anIntArray494[local51];
			local7 = Static355.anIntArray476[local51];
			@Pc(79) int local79 = local7 - arg3.anInt4723;
			@Pc(85) int local85 = local9 - arg3.anInt4725;
			@Pc(90) int local90 = local9 - local22;
			local51 = local51 + 1 & 0xFFF;
			@Pc(101) int local101 = local7 - local17;
			if (arg4 == -4) {
				if (local7 == arg8 && arg5 == local9) {
					Static148.anInt7258 = local7;
					Static135.anInt2444 = local9;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static401.method5482(1, arg8, arg5, arg7, local9, local7, arg2, 1)) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg3.method3867(arg5, 1, arg2, arg8, arg7, local7, local9, arg0, 1)) {
					Static148.anInt7258 = local7;
					Static135.anInt2444 = local9;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg3.method3869(arg2, 1, arg0, arg8, arg7, local9, local7, arg5)) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg3.method3874(local7, 1, arg8, arg9, arg4, local9, arg5)) {
					Static135.anInt2444 = local9;
					Static148.anInt7258 = local7;
					return true;
				}
			} else if (arg3.method3866(arg9, local7, arg4, arg8, 1, arg5, local9)) {
				Static135.anInt2444 = local9;
				Static148.anInt7258 = local7;
				return true;
			}
			@Pc(253) int local253 = Static81.anIntArrayArray7[local101][local90] + 1;
			if (local101 > 0 && Static210.anIntArrayArray24[local101 - 1][local90] == 0 && (local63[local79 - 1][local85] & 0x42240000) == 0) {
				Static355.anIntArray476[local58] = local7 - 1;
				Static366.anIntArray494[local58] = local9;
				local58 = local58 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local101 - 1][local90] = 2;
				Static81.anIntArrayArray7[local101 - 1][local90] = local253;
			}
			if (local101 < 127 && Static210.anIntArrayArray24[local101 + 1][local90] == 0 && (local63[local79 + 1][local85] & 0x60240000) == 0) {
				Static355.anIntArray476[local58] = local7 + 1;
				Static366.anIntArray494[local58] = local9;
				Static210.anIntArrayArray24[local101 + 1][local90] = 8;
				local58 = local58 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local101 + 1][local90] = local253;
			}
			if (local90 > 0 && Static210.anIntArrayArray24[local101][local90 - 1] == 0 && (local63[local79][local85 - 1] & 0x40A40000) == 0) {
				Static355.anIntArray476[local58] = local7;
				Static366.anIntArray494[local58] = local9 - 1;
				local58 = local58 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local101][local90 - 1] = 1;
				Static81.anIntArrayArray7[local101][local90 - 1] = local253;
			}
			if (local90 < 127 && Static210.anIntArrayArray24[local101][local90 + 1] == 0 && (local63[local79][local85 + 1] & 0x48240000) == 0) {
				Static355.anIntArray476[local58] = local7;
				Static366.anIntArray494[local58] = local9 + 1;
				local58 = local58 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local101][local90 + 1] = 4;
				Static81.anIntArrayArray7[local101][local90 + 1] = local253;
			}
			if (local101 > 0 && local90 > 0 && Static210.anIntArrayArray24[local101 - 1][local90 - 1] == 0 && (local63[local79 - 1][local85 - 1] & 0x43A40000) == 0 && (local63[local79 - 1][local85] & 0x42240000) == 0 && (local63[local79][local85 - 1] & 0x40A40000) == 0) {
				Static355.anIntArray476[local58] = local7 - 1;
				Static366.anIntArray494[local58] = local9 - 1;
				Static210.anIntArrayArray24[local101 - 1][local90 - 1] = 3;
				local58 = local58 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local101 - 1][local90 - 1] = local253;
			}
			if (local101 < 127 && local90 > 0 && Static210.anIntArrayArray24[local101 + 1][local90 - 1] == 0 && (local63[local79 + 1][local85 - 1] & 0x60E40000) == 0 && (local63[local79 + 1][local85] & 0x60240000) == 0 && (local63[local79][local85 - 1] & 0x40A40000) == 0) {
				Static355.anIntArray476[local58] = local7 + 1;
				Static366.anIntArray494[local58] = local9 - 1;
				local58 = local58 + 1 & 0xFFF;
				Static210.anIntArrayArray24[local101 + 1][local90 - 1] = 9;
				Static81.anIntArrayArray7[local101 + 1][local90 - 1] = local253;
			}
			if (local101 > 0 && local90 < 127 && Static210.anIntArrayArray24[local101 - 1][local90 + 1] == 0 && (local63[local79 - 1][local85 + 1] & 0x4E240000) == 0 && (local63[local79 - 1][local85] & 0x42240000) == 0 && (local63[local79][local85 + 1] & 0x48240000) == 0) {
				Static355.anIntArray476[local58] = local7 - 1;
				Static366.anIntArray494[local58] = local9 + 1;
				Static210.anIntArrayArray24[local101 - 1][local90 + 1] = 6;
				local58 = local58 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local101 - 1][local90 + 1] = local253;
			}
			if (local101 < 127 && local90 < 127 && Static210.anIntArrayArray24[local101 + 1][local90 + 1] == 0 && (local63[local79 + 1][local85 + 1] & 0x78240000) == 0 && (local63[local79 + 1][local85] & 0x60240000) == 0 && (local63[local79][local85 + 1] & 0x48240000) == 0) {
				Static355.anIntArray476[local58] = local7 + 1;
				Static366.anIntArray494[local58] = local9 + 1;
				Static210.anIntArrayArray24[local101 + 1][local90 + 1] = 12;
				local58 = local58 + 1 & 0xFFF;
				Static81.anIntArrayArray7[local101 + 1][local90 + 1] = local253;
			}
		}
		Static148.anInt7258 = local7;
		Static135.anInt2444 = local9;
		return false;
	}

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "(I)V")
	public static void method3452() {
		@Pc(1) Class151 local1 = Static299.aClass151_126;
		synchronized (Static299.aClass151_126) {
			Static299.aClass151_126.method3298();
		}
		local1 = Static241.aClass151_108;
		synchronized (Static241.aClass151_108) {
			Static241.aClass151_108.method3298();
		}
	}
}
