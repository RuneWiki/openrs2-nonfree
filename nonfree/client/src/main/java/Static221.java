import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Lclient!wp;")
	public static Interface10 anInterface10_4;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[128][128];

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static int anInt3917 = 0;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "[I")
	public static final int[] anIntArray423 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Lclient!dt;")
	public static Class62 aClass62_13 = null;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method3680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg2 == arg5 && arg7 == arg8 && arg3 == arg6) {
			Static163.method2304(arg1, arg2, arg3, arg4, arg7);
			return;
		}
		@Pc(42) int local42 = arg1;
		@Pc(44) int local44 = arg2;
		@Pc(48) int local48 = arg1 * 3;
		@Pc(52) int local52 = arg2 * 3;
		@Pc(56) int local56 = arg0 * 3;
		@Pc(60) int local60 = arg5 * 3;
		@Pc(64) int local64 = arg8 * 3;
		@Pc(68) int local68 = arg6 * 3;
		@Pc(77) int local77 = local56 + arg7 - arg1 - local64;
		@Pc(88) int local88 = arg3 + local60 - arg2 - local68;
		@Pc(98) int local98 = local64 + local48 - local56 - local56;
		@Pc(107) int local107 = local52 + local68 - local60 - local60;
		@Pc(112) int local112 = local56 - local48;
		@Pc(117) int local117 = local60 - local52;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local127 * local119 >> 12;
			@Pc(137) int local137 = local77 * local133;
			@Pc(141) int local141 = local88 * local133;
			@Pc(145) int local145 = local98 * local127;
			@Pc(149) int local149 = local127 * local107;
			@Pc(153) int local153 = local119 * local112;
			@Pc(157) int local157 = local117 * local119;
			@Pc(168) int local168 = arg1 + (local137 + local145 + local153 >> 12);
			@Pc(178) int local178 = (local157 + local141 + local149 >> 12) + arg2;
			Static163.method2304(local42, local44, local178, arg4, local168);
			local44 = local178;
			local42 = local168;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!ee;IIIIIIIIII)Z")
	public static boolean method3681(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg5;
		@Pc(14) int local14 = arg8;
		@Pc(23) int local23 = arg5 - 64;
		anIntArrayArray38[64][64] = 99;
		@Pc(34) int local34 = arg8 - 64;
		Static389.anIntArrayArray60[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static136.anIntArray274[0] = arg5;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static269.anIntArray524[0] = arg8;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray19;
		while (local48 != local51) {
			local14 = Static269.anIntArray524[local48];
			local12 = Static136.anIntArray274[local48];
			@Pc(71) int local71 = local14 - arg0.anInt1639;
			local48 = local48 + 1 & 0xFFF;
			@Pc(83) int local83 = local12 - arg0.anInt1637;
			@Pc(88) int local88 = local12 - local23;
			@Pc(93) int local93 = local14 - local34;
			if (arg4 == -4) {
				if (arg2 == local12 && local14 == arg9) {
					Static274.anInt4765 = local12;
					Static319.anInt5443 = local14;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static252.method4104(arg3, arg7, 1, arg2, local12, arg9, local14, 1)) {
					Static319.anInt5443 = local14;
					Static274.anInt4765 = local12;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg0.method1323(arg9, arg2, arg7, 1, local12, arg3, local14, 1, arg6)) {
					Static274.anInt4765 = local12;
					Static319.anInt5443 = local14;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg0.method1339(local12, arg9, 1, local14, arg3, arg7, arg2, arg6)) {
					Static319.anInt5443 = local14;
					Static274.anInt4765 = local12;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg0.method1331(arg1, local14, arg9, local12, arg2, 1, arg4)) {
					Static319.anInt5443 = local14;
					Static274.anInt4765 = local12;
					return true;
				}
			} else if (arg0.method1326(arg4, local12, local14, arg1, 1, arg2, arg9)) {
				Static274.anInt4765 = local12;
				Static319.anInt5443 = local14;
				return true;
			}
			@Pc(238) int local238 = Static389.anIntArrayArray60[local88][local93] + 1;
			if (local88 > 0 && anIntArrayArray38[local88 - 1][local93] == 0 && (local56[local83 - 1][local71] & 0x42240000) == 0) {
				Static136.anIntArray274[local51] = local12 - 1;
				Static269.anIntArray524[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				anIntArrayArray38[local88 - 1][local93] = 2;
				Static389.anIntArrayArray60[local88 - 1][local93] = local238;
			}
			if (local88 < 127 && anIntArrayArray38[local88 + 1][local93] == 0 && (local56[local83 + 1][local71] & 0x60240000) == 0) {
				Static136.anIntArray274[local51] = local12 + 1;
				Static269.anIntArray524[local51] = local14;
				anIntArrayArray38[local88 + 1][local93] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local88 + 1][local93] = local238;
			}
			if (local93 > 0 && anIntArrayArray38[local88][local93 - 1] == 0 && (local56[local83][local71 - 1] & 0x40A40000) == 0) {
				Static136.anIntArray274[local51] = local12;
				Static269.anIntArray524[local51] = local14 - 1;
				anIntArrayArray38[local88][local93 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local88][local93 - 1] = local238;
			}
			if (local93 < 127 && anIntArrayArray38[local88][local93 + 1] == 0 && (local56[local83][local71 + 1] & 0x48240000) == 0) {
				Static136.anIntArray274[local51] = local12;
				Static269.anIntArray524[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				anIntArrayArray38[local88][local93 + 1] = 4;
				Static389.anIntArrayArray60[local88][local93 + 1] = local238;
			}
			if (local88 > 0 && local93 > 0 && anIntArrayArray38[local88 - 1][local93 - 1] == 0 && (local56[local83 - 1][local71 - 1] & 0x43A40000) == 0 && (local56[local83 - 1][local71] & 0x42240000) == 0 && (local56[local83][local71 - 1] & 0x40A40000) == 0) {
				Static136.anIntArray274[local51] = local12 - 1;
				Static269.anIntArray524[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				anIntArrayArray38[local88 - 1][local93 - 1] = 3;
				Static389.anIntArrayArray60[local88 - 1][local93 - 1] = local238;
			}
			if (local88 < 127 && local93 > 0 && anIntArrayArray38[local88 + 1][local93 - 1] == 0 && (local56[local83 + 1][local71 - 1] & 0x60E40000) == 0 && (local56[local83 + 1][local71] & 0x60240000) == 0 && (local56[local83][local71 - 1] & 0x40A40000) == 0) {
				Static136.anIntArray274[local51] = local12 + 1;
				Static269.anIntArray524[local51] = local14 - 1;
				anIntArrayArray38[local88 + 1][local93 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local88 + 1][local93 - 1] = local238;
			}
			if (local88 > 0 && local93 < 127 && anIntArrayArray38[local88 - 1][local93 + 1] == 0 && (local56[local83 - 1][local71 + 1] & 0x4E240000) == 0 && (local56[local83 - 1][local71] & 0x42240000) == 0 && (local56[local83][local71 + 1] & 0x48240000) == 0) {
				Static136.anIntArray274[local51] = local12 - 1;
				Static269.anIntArray524[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				anIntArrayArray38[local88 - 1][local93 + 1] = 6;
				Static389.anIntArrayArray60[local88 - 1][local93 + 1] = local238;
			}
			if (local88 < 127 && local93 < 127 && anIntArrayArray38[local88 + 1][local93 + 1] == 0 && (local56[local83 + 1][local71 + 1] & 0x78240000) == 0 && (local56[local83 + 1][local71] & 0x60240000) == 0 && (local56[local83][local71 + 1] & 0x48240000) == 0) {
				Static136.anIntArray274[local51] = local12 + 1;
				Static269.anIntArray524[local51] = local14 + 1;
				anIntArrayArray38[local88 + 1][local93 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static389.anIntArrayArray60[local88 + 1][local93 + 1] = local238;
			}
		}
		Static274.anInt4765 = local12;
		Static319.anInt5443 = local14;
		return false;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
	public static boolean method3683() {
		return Static349.aBoolean450;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZBI)V")
	public static void method3684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static2.anInt68 == 0) {
			Static348.method4050(false);
		} else {
			Static52.anInt1098 = Static2.anInt68;
			Static186.method2929(0);
		}
		Static264.aBoolean366 = arg2;
		Static79.anInt1634 = arg3;
		Static152.anInt2776 = arg1;
		Static42.method462(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method3685(@OriginalArg(0) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(117) int local117;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local117 = 0; local117 < arg0; local117++) {
				if (local73 <= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(164) int local164;
		for (local117 = arg0 - 1; local117 >= 0; local117--) {
			for (local164 = 0; local164 < arg0; local164++) {
				if (local164 >= local117) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(209) int local209;
		for (local164 = arg0 - 1; local164 >= 0; local164--) {
			for (local209 = 0; local209 < arg0; local209++) {
				if (local164 >> 1 >= local209) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(247) int local247;
		for (local209 = 0; local209 < arg0; local209++) {
			for (local247 = 0; local247 < arg0; local247++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local247 >= local209 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(312) int local312;
		for (local247 = 0; local247 < arg0; local247++) {
			for (local312 = arg0 - 1; local312 >= 0; local312--) {
				if (local247 >> 1 >= local312) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(365) int local365;
		for (local312 = arg0 - 1; local312 >= 0; local312--) {
			for (local365 = arg0 - 1; local365 >= 0; local365--) {
				if (local312 << 1 <= local365) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(412) int local412;
		for (local365 = arg0 - 1; local365 >= 0; local365--) {
			for (local412 = arg0 - 1; local412 >= 0; local412--) {
				if (local412 <= local365 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(458) int local458;
		for (local412 = arg0 - 1; local412 >= 0; local412--) {
			for (local458 = 0; local458 < arg0; local458++) {
				if (local412 << 1 <= local458) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(503) int local503;
		for (local458 = 0; local458 < arg0; local458++) {
			for (local503 = 0; local503 < arg0; local503++) {
				if (local503 <= local458 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(552) int local552;
		for (local503 = 0; local503 < arg0; local503++) {
			for (local552 = arg0 - 1; local552 >= 0; local552--) {
				if (local503 << 1 <= local552) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(599) int local599;
		for (local552 = arg0 - 1; local552 >= 0; local552--) {
			for (local599 = 0; local599 < arg0; local599++) {
				if (local599 >= local552 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(645) int local645;
		for (local599 = 0; local599 < arg0; local599++) {
			for (local645 = 0; local645 < arg0; local645++) {
				if (local645 <= local599 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(686) int local686;
		for (local645 = 0; local645 < arg0; local645++) {
			for (local686 = arg0 - 1; local686 >= 0; local686--) {
				if (local686 >= local645 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(728) int local728;
		for (local686 = arg0 - 1; local686 >= 0; local686--) {
			for (local728 = arg0 - 1; local728 >= 0; local728--) {
				if (local686 << 1 >= local728) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(772) int local772;
		for (local728 = arg0 - 1; local728 >= 0; local728--) {
			for (local772 = arg0 - 1; local772 >= 0; local772--) {
				if (local772 >= local728 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(821) int local821;
		for (local772 = arg0 - 1; local772 >= 0; local772--) {
			for (local821 = 0; local821 < arg0; local821++) {
				if (local821 <= local772 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(870) int local870;
		for (local821 = 0; local821 < arg0; local821++) {
			for (local870 = 0; local870 < arg0; local870++) {
				if (local870 >= local821 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(911) int local911;
		for (local870 = 0; local870 < arg0; local870++) {
			for (local911 = arg0 - 1; local911 >= 0; local911--) {
				if (local911 <= local870 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(956) int local956;
		for (local911 = 0; local911 < arg0; local911++) {
			for (local956 = 0; local956 < arg0; local956++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1003) int local1003;
		for (local956 = 0; local956 < arg0; local956++) {
			for (local1003 = 0; local1003 < arg0; local1003++) {
				if (local956 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1046) int local1046;
		for (local1003 = 0; local1003 < arg0; local1003++) {
			for (local1046 = 0; local1046 < arg0; local1046++) {
				if (local1046 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1093) int local1093;
		for (local1046 = 0; local1046 < arg0; local1046++) {
			for (local1093 = 0; local1093 < arg0; local1093++) {
				if (arg0 / 2 <= local1046) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1140) int local1140;
		for (local1093 = 0; local1093 < arg0; local1093++) {
			for (local1140 = 0; local1140 < arg0; local1140++) {
				if (local1093 - arg0 / 2 >= local1140) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1195) int local1195;
		for (local1140 = arg0 - 1; local1140 >= 0; local1140--) {
			for (local1195 = 0; local1195 < arg0; local1195++) {
				if (local1140 - arg0 / 2 >= local1195) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1244) int local1244;
		for (local1195 = arg0 - 1; local1195 >= 0; local1195--) {
			for (local1244 = arg0 - 1; local1244 >= 0; local1244--) {
				if (local1195 - arg0 / 2 >= local1244) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1295) int local1295;
		for (local1244 = 0; local1244 < arg0; local1244++) {
			for (local1295 = arg0 - 1; local1295 >= 0; local1295--) {
				if (local1244 - arg0 / 2 >= local1295) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1335) int local1335;
		for (local1295 = 0; local1295 < arg0; local1295++) {
			for (local1335 = 0; local1335 < arg0; local1335++) {
				if (local1335 >= local1295 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1388) int local1388;
		for (local1335 = arg0 - 1; local1335 >= 0; local1335--) {
			for (local1388 = 0; local1388 < arg0; local1388++) {
				if (local1335 - arg0 / 2 <= local1388) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1433) int local1433;
		for (local1388 = arg0 - 1; local1388 >= 0; local1388--) {
			for (local1433 = arg0 - 1; local1433 >= 0; local1433--) {
				if (local1433 >= local1388 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1433 = 0; local1433 < arg0; local1433++) {
			for (@Pc(1485) int local1485 = arg0 - 1; local1485 >= 0; local1485--) {
				if (local1433 - arg0 / 2 <= local1485) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(CI)C")
	public static char method3686(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
