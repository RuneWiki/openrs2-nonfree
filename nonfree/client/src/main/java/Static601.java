import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_142 = new Class218(40, -1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!gaa;)I")
	public static int method8190(@OriginalArg(1) int arg0, @OriginalArg(2) Class108 arg1) {
		if (!Static71.method1836(arg1).method1188(arg0) && arg1.anObjectArray21 == null) {
			return -1;
		} else if (arg1.anIntArray218 == null || arg1.anIntArray218.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray218[arg0];
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method8191(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local22 >= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(113) int local113;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local113 = 0; local113 < arg0; local113++) {
				if (local113 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(161) int local161;
		for (local113 = arg0 - 1; local113 >= 0; local113--) {
			for (local161 = 0; local161 < arg0; local161++) {
				if (local161 >= local113) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(203) int local203;
		for (local161 = arg0 - 1; local161 >= 0; local161--) {
			for (local203 = 0; local203 < arg0; local203++) {
				if (local203 <= local161 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(245) int local245;
		for (local203 = 0; local203 < arg0; local203++) {
			for (local245 = 0; local245 < arg0; local245++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local203 << 1 <= local245) {
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
		@Pc(307) int local307;
		for (local245 = 0; local245 < arg0; local245++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local245 >> 1 >= local307) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(356) int local356;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local356 = arg0 - 1; local356 >= 0; local356--) {
				if (local307 << 1 <= local356) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(404) int local404;
		for (local356 = arg0 - 1; local356 >= 0; local356--) {
			for (local404 = arg0 - 1; local404 >= 0; local404--) {
				if (local356 >> 1 >= local404) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(450) int local450;
		for (local404 = arg0 - 1; local404 >= 0; local404--) {
			for (local450 = 0; local450 < arg0; local450++) {
				if (local450 >= local404 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(488) int local488;
		for (local450 = 0; local450 < arg0; local450++) {
			for (local488 = 0; local488 < arg0; local488++) {
				if (local450 >> 1 >= local488) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(529) int local529;
		for (local488 = 0; local488 < arg0; local488++) {
			for (local529 = arg0 - 1; local529 >= 0; local529--) {
				if (local529 >= local488 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(573) int local573;
		for (local529 = arg0 - 1; local529 >= 0; local529--) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local529 >> 1 <= local573) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(615) int local615;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local615 = 0; local615 < arg0; local615++) {
				if (local615 <= local573 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(656) int local656;
		for (local615 = 0; local615 < arg0; local615++) {
			for (local656 = arg0 - 1; local656 >= 0; local656--) {
				if (local615 >> 1 <= local656) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(698) int local698;
		for (local656 = arg0 - 1; local656 >= 0; local656--) {
			for (local698 = arg0 - 1; local698 >= 0; local698--) {
				if (local698 <= local656 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(749) int local749;
		for (local698 = arg0 - 1; local698 >= 0; local698--) {
			for (local749 = arg0 - 1; local749 >= 0; local749--) {
				if (local698 >> 1 <= local749) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(788) int local788;
		for (local749 = arg0 - 1; local749 >= 0; local749--) {
			for (local788 = 0; local788 < arg0; local788++) {
				if (local788 <= local749 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(830) int local830;
		for (local788 = 0; local788 < arg0; local788++) {
			for (local830 = 0; local830 < arg0; local830++) {
				if (local830 >= local788 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(875) int local875;
		for (local830 = 0; local830 < arg0; local830++) {
			for (local875 = arg0 - 1; local875 >= 0; local875--) {
				if (local830 << 1 >= local875) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(920) int local920;
		for (local875 = 0; local875 < arg0; local875++) {
			for (local920 = 0; local920 < arg0; local920++) {
				if (local920 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(967) int local967;
		for (local920 = 0; local920 < arg0; local920++) {
			for (local967 = 0; local967 < arg0; local967++) {
				if (arg0 / 2 >= local920) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1010) int local1010;
		for (local967 = 0; local967 < arg0; local967++) {
			for (local1010 = 0; local1010 < arg0; local1010++) {
				if (local1010 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1057) int local1057;
		for (local1010 = 0; local1010 < arg0; local1010++) {
			for (local1057 = 0; local1057 < arg0; local1057++) {
				if (local1010 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1108) int local1108;
		for (local1057 = 0; local1057 < arg0; local1057++) {
			for (local1108 = 0; local1108 < arg0; local1108++) {
				if (local1108 <= local1057 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1160) int local1160;
		for (local1108 = arg0 - 1; local1108 >= 0; local1108--) {
			for (local1160 = 0; local1160 < arg0; local1160++) {
				if (local1160 <= local1108 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1212) int local1212;
		for (local1160 = arg0 - 1; local1160 >= 0; local1160--) {
			for (local1212 = arg0 - 1; local1212 >= 0; local1212--) {
				if (local1160 - arg0 / 2 >= local1212) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1261) int local1261;
		for (local1212 = 0; local1212 < arg0; local1212++) {
			for (local1261 = arg0 - 1; local1261 >= 0; local1261--) {
				if (local1212 - arg0 / 2 >= local1261) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1305) int local1305;
		for (local1261 = 0; local1261 < arg0; local1261++) {
			for (local1305 = 0; local1305 < arg0; local1305++) {
				if (local1261 - arg0 / 2 <= local1305) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1353) int local1353;
		for (local1305 = arg0 - 1; local1305 >= 0; local1305--) {
			for (local1353 = 0; local1353 < arg0; local1353++) {
				if (local1353 >= local1305 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1400) int local1400;
		for (local1353 = arg0 - 1; local1353 >= 0; local1353--) {
			for (local1400 = arg0 - 1; local1400 >= 0; local1400--) {
				if (local1400 >= local1353 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1400 = 0; local1400 < arg0; local1400++) {
			for (@Pc(1447) int local1447 = arg0 - 1; local1447 >= 0; local1447--) {
				if (local1400 - arg0 / 2 <= local1447) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(21) int local21 = arg4 - arg3;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg4 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = (local61 - 3) * local53;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = (arg4 - 1) * local101;
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local21 - 1) * local109;
		@Pc(153) int[] local153 = Static104.anIntArrayArray24[arg6];
		Static580.method8027(local153, arg1 - local16, arg1 - arg0, arg2);
		Static580.method8027(local153, local16 + arg1, arg1 - local16, arg5);
		Static580.method8027(local153, arg0 + arg1, arg1 - -local16, arg2);
		while (local9 > 0) {
			@Pc(198) boolean local198 = local9 <= local21;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local135;
					local117 += local105;
					local135 += local105;
					local7++;
				}
			}
			if (local198) {
				if (local88 < 0) {
					while (local88 < 0) {
						local97 += local143;
						local88 += local127;
						local11++;
						local127 += local113;
						local143 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local88 += local127;
					local143 += local113;
					local127 += local113;
					local11++;
				}
				local88 += -local149;
				local97 += -local133;
				local133 -= local109;
				local149 -= local109;
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local135;
				local117 += local105;
				local7++;
				local135 += local105;
			}
			local70 += -local141;
			local79 += -local123;
			local9--;
			local141 -= local101;
			local123 -= local101;
			@Pc(337) int local337 = arg6 - local9;
			@Pc(341) int local341 = local9 + arg6;
			@Pc(346) int local346 = arg1 + local7;
			@Pc(351) int local351 = arg1 - local7;
			if (local198) {
				@Pc(377) int local377 = local11 + arg1;
				@Pc(382) int local382 = arg1 - local11;
				Static580.method8027(Static104.anIntArrayArray24[local337], local382, local351, arg2);
				Static580.method8027(Static104.anIntArrayArray24[local337], local377, local382, arg5);
				Static580.method8027(Static104.anIntArrayArray24[local337], local346, local377, arg2);
				Static580.method8027(Static104.anIntArrayArray24[local341], local382, local351, arg2);
				Static580.method8027(Static104.anIntArrayArray24[local341], local377, local382, arg5);
				Static580.method8027(Static104.anIntArrayArray24[local341], local346, local377, arg2);
			} else {
				Static580.method8027(Static104.anIntArrayArray24[local337], local346, local351, arg2);
				Static580.method8027(Static104.anIntArrayArray24[local341], local346, local351, arg2);
			}
		}
	}
}
