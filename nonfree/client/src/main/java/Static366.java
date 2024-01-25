import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "Lclient!dr;")
	public static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_4;

	@OriginalMember(owner = "client!me", name = "S", descriptor = "I")
	public static int anInt5928;

	@OriginalMember(owner = "client!me", name = "W", descriptor = "I")
	public static int anInt5930 = -1;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method5374(@OriginalArg(0) int arg0) {
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
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local116 >= local73) {
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
		@Pc(201) int local201;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local201 = 0; local201 < arg0; local201++) {
				if (local163 >> 1 >= local201) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(239) int local239;
		for (local201 = 0; local201 < arg0; local201++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local201 << 1 <= local239) {
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
		@Pc(293) int local293;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local293 <= local239 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(342) int local342;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local342 = arg0 - 1; local342 >= 0; local342--) {
				if (local342 >= local293 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(390) int local390;
		for (local342 = arg0 - 1; local342 >= 0; local342--) {
			for (local390 = arg0 - 1; local390 >= 0; local390--) {
				if (local342 >> 1 >= local390) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(435) int local435;
		for (local390 = arg0 - 1; local390 >= 0; local390--) {
			for (local435 = 0; local435 < arg0; local435++) {
				if (local390 << 1 <= local435) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(477) int local477;
		for (local435 = 0; local435 < arg0; local435++) {
			for (local477 = 0; local477 < arg0; local477++) {
				if (local477 <= local435 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(522) int local522;
		for (local477 = 0; local477 < arg0; local477++) {
			for (local522 = arg0 - 1; local522 >= 0; local522--) {
				if (local522 >= local477 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(573) int local573;
		for (local522 = arg0 - 1; local522 >= 0; local522--) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local573 >= local522 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(614) int local614;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local614 = 0; local614 < arg0; local614++) {
				if (local614 <= local573 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(659) int local659;
		for (local614 = 0; local614 < arg0; local614++) {
			for (local659 = arg0 - 1; local659 >= 0; local659--) {
				if (local614 >> 1 <= local659) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(705) int local705;
		for (local659 = arg0 - 1; local659 >= 0; local659--) {
			for (local705 = arg0 - 1; local705 >= 0; local705--) {
				if (local659 << 1 >= local705) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(752) int local752;
		for (local705 = arg0 - 1; local705 >= 0; local705--) {
			for (local752 = arg0 - 1; local752 >= 0; local752--) {
				if (local752 >= local705 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(801) int local801;
		for (local752 = arg0 - 1; local752 >= 0; local752--) {
			for (local801 = 0; local801 < arg0; local801++) {
				if (local801 <= local752 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(846) int local846;
		for (local801 = 0; local801 < arg0; local801++) {
			for (local846 = 0; local846 < arg0; local846++) {
				if (local801 >> 1 <= local846) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(899) int local899;
		for (local846 = 0; local846 < arg0; local846++) {
			for (local899 = arg0 - 1; local899 >= 0; local899--) {
				if (local846 << 1 >= local899) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(944) int local944;
		for (local899 = 0; local899 < arg0; local899++) {
			for (local944 = 0; local944 < arg0; local944++) {
				if (arg0 / 2 >= local944) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(983) int local983;
		for (local944 = 0; local944 < arg0; local944++) {
			for (local983 = 0; local983 < arg0; local983++) {
				if (local944 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1034) int local1034;
		for (local983 = 0; local983 < arg0; local983++) {
			for (local1034 = 0; local1034 < arg0; local1034++) {
				if (arg0 / 2 <= local1034) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1081) int local1081;
		for (local1034 = 0; local1034 < arg0; local1034++) {
			for (local1081 = 0; local1081 < arg0; local1081++) {
				if (arg0 / 2 <= local1034) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1124) int local1124;
		for (local1081 = 0; local1081 < arg0; local1081++) {
			for (local1124 = 0; local1124 < arg0; local1124++) {
				if (local1081 - arg0 / 2 >= local1124) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1176) int local1176;
		for (local1124 = arg0 - 1; local1124 >= 0; local1124--) {
			for (local1176 = 0; local1176 < arg0; local1176++) {
				if (local1176 <= local1124 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1228) int local1228;
		for (local1176 = arg0 - 1; local1176 >= 0; local1176--) {
			for (local1228 = arg0 - 1; local1228 >= 0; local1228--) {
				if (local1228 <= local1176 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1277) int local1277;
		for (local1228 = 0; local1228 < arg0; local1228++) {
			for (local1277 = arg0 - 1; local1277 >= 0; local1277--) {
				if (local1228 - arg0 / 2 >= local1277) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1326) int local1326;
		for (local1277 = 0; local1277 < arg0; local1277++) {
			for (local1326 = 0; local1326 < arg0; local1326++) {
				if (local1277 - arg0 / 2 <= local1326) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1374) int local1374;
		for (local1326 = arg0 - 1; local1326 >= 0; local1326--) {
			for (local1374 = 0; local1374 < arg0; local1374++) {
				if (local1326 - arg0 / 2 <= local1374) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1427) int local1427;
		for (local1374 = arg0 - 1; local1374 >= 0; local1374--) {
			for (local1427 = arg0 - 1; local1427 >= 0; local1427--) {
				if (local1374 - arg0 / 2 <= local1427) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1427 = 0; local1427 < arg0; local1427++) {
			for (@Pc(1476) int local1476 = arg0 - 1; local1476 >= 0; local1476--) {
				if (local1427 - arg0 / 2 <= local1476) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
