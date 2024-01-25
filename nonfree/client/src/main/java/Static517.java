import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	public static int method7518() {
		@Pc(27) byte local27;
		if (Static248.anInt4899 >= 96) {
			@Pc(13) int local13 = Static576.method8076();
			if (local13 <= 100) {
				Static303.method7244();
				local27 = 4;
			} else if (local13 <= 500) {
				Static407.method6323();
				local27 = 3;
			} else if (local13 > 1000) {
				Static499.method7252();
				local27 = 1;
			} else {
				local27 = 2;
				Static339.method915();
			}
		} else {
			Static499.method7252();
			local27 = 1;
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 0) {
			Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
			Static230.method3973(0, false);
		}
		Static124.method2223();
		return local27;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7519(@OriginalArg(0) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local73 <= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(163) int local163;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local116 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(204) int local204;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local163 >> 1 >= local204) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(250) int local250;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local250 = 0; local250 < arg0; local250++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local204 << 1 <= local250) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(303) int local303;
		for (local250 = 0; local250 < arg0; local250++) {
			for (local303 = arg0 - 1; local303 >= 0; local303--) {
				if (local250 >> 1 >= local303) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(352) int local352;
		for (local303 = arg0 - 1; local303 >= 0; local303--) {
			for (local352 = arg0 - 1; local352 >= 0; local352--) {
				if (local352 >= local303 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(399) int local399;
		for (local352 = arg0 - 1; local352 >= 0; local352--) {
			for (local399 = arg0 - 1; local399 >= 0; local399--) {
				if (local352 >> 1 >= local399) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(455) int local455;
		for (local399 = arg0 - 1; local399 >= 0; local399--) {
			for (local455 = 0; local455 < arg0; local455++) {
				if (local399 << 1 <= local455) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(500) int local500;
		for (local455 = 0; local455 < arg0; local455++) {
			for (local500 = 0; local500 < arg0; local500++) {
				if (local500 <= local455 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(553) int local553;
		for (local500 = 0; local500 < arg0; local500++) {
			for (local553 = arg0 - 1; local553 >= 0; local553--) {
				if (local500 << 1 <= local553) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(604) int local604;
		for (local553 = arg0 - 1; local553 >= 0; local553--) {
			for (local604 = 0; local604 < arg0; local604++) {
				if (local604 >= local553 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(646) int local646;
		for (local604 = 0; local604 < arg0; local604++) {
			for (local646 = 0; local646 < arg0; local646++) {
				if (local604 << 1 >= local646) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(695) int local695;
		for (local646 = 0; local646 < arg0; local646++) {
			for (local695 = arg0 - 1; local695 >= 0; local695--) {
				if (local646 >> 1 <= local695) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(748) int local748;
		for (local695 = arg0 - 1; local695 >= 0; local695--) {
			for (local748 = arg0 - 1; local748 >= 0; local748--) {
				if (local695 << 1 >= local748) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(796) int local796;
		for (local748 = arg0 - 1; local748 >= 0; local748--) {
			for (local796 = arg0 - 1; local796 >= 0; local796--) {
				if (local748 >> 1 <= local796) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(845) int local845;
		for (local796 = arg0 - 1; local796 >= 0; local796--) {
			for (local845 = 0; local845 < arg0; local845++) {
				if (local845 <= local796 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(894) int local894;
		for (local845 = 0; local845 < arg0; local845++) {
			for (local894 = 0; local894 < arg0; local894++) {
				if (local894 >= local845 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(939) int local939;
		for (local894 = 0; local894 < arg0; local894++) {
			for (local939 = arg0 - 1; local939 >= 0; local939--) {
				if (local939 <= local894 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(980) int local980;
		for (local939 = 0; local939 < arg0; local939++) {
			for (local980 = 0; local980 < arg0; local980++) {
				if (local980 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1031) int local1031;
		for (local980 = 0; local980 < arg0; local980++) {
			for (local1031 = 0; local1031 < arg0; local1031++) {
				if (arg0 / 2 >= local980) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1078) int local1078;
		for (local1031 = 0; local1031 < arg0; local1031++) {
			for (local1078 = 0; local1078 < arg0; local1078++) {
				if (local1078 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1121) int local1121;
		for (local1078 = 0; local1078 < arg0; local1078++) {
			for (local1121 = 0; local1121 < arg0; local1121++) {
				if (arg0 / 2 <= local1078) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1160) int local1160;
		for (local1121 = 0; local1121 < arg0; local1121++) {
			for (local1160 = 0; local1160 < arg0; local1160++) {
				if (local1121 - arg0 / 2 >= local1160) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1211) int local1211;
		for (local1160 = arg0 - 1; local1160 >= 0; local1160--) {
			for (local1211 = 0; local1211 < arg0; local1211++) {
				if (local1211 <= local1160 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1264) int local1264;
		for (local1211 = arg0 - 1; local1211 >= 0; local1211--) {
			for (local1264 = arg0 - 1; local1264 >= 0; local1264--) {
				if (local1264 <= local1211 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1306) int local1306;
		for (local1264 = 0; local1264 < arg0; local1264++) {
			for (local1306 = arg0 - 1; local1306 >= 0; local1306--) {
				if (local1306 <= local1264 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1351) int local1351;
		for (local1306 = 0; local1306 < arg0; local1306++) {
			for (local1351 = 0; local1351 < arg0; local1351++) {
				if (local1351 >= local1306 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1395) int local1395;
		for (local1351 = arg0 - 1; local1351 >= 0; local1351--) {
			for (local1395 = 0; local1395 < arg0; local1395++) {
				if (local1351 - arg0 / 2 <= local1395) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1446) int local1446;
		for (local1395 = arg0 - 1; local1395 >= 0; local1395--) {
			for (local1446 = arg0 - 1; local1446 >= 0; local1446--) {
				if (local1395 - arg0 / 2 <= local1446) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1446 = 0; local1446 < arg0; local1446++) {
			for (@Pc(1494) int local1494 = arg0 - 1; local1494 >= 0; local1494--) {
				if (local1494 >= local1446 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
