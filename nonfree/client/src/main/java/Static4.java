import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_2 = new Class186(3, -2);

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_3 = new Class186(19, -1);

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)[[[B")
	public static byte[][][] method42(@OriginalArg(1) int arg0) {
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
		@Pc(87) int local87;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local87 = 0; local87 < arg0; local87++) {
				if (local26 >= local87) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(133) int local133;
		for (local87 = 0; local87 < arg0; local87++) {
			for (local133 = 0; local133 < arg0; local133++) {
				if (local133 >= local87) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(186) int local186;
		for (local133 = arg0 - 1; local133 >= 0; local133--) {
			for (local186 = 0; local186 < arg0; local186++) {
				if (local133 <= local186) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(237) int local237;
		for (local186 = arg0 - 1; local186 >= 0; local186--) {
			for (local237 = 0; local237 < arg0; local237++) {
				if (local186 >> 1 >= local237) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(289) int local289;
		for (local237 = 0; local237 < arg0; local237++) {
			for (local289 = 0; local289 < arg0; local289++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local289 >= local237 << 1) {
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
		@Pc(362) int local362;
		for (local289 = 0; local289 < arg0; local289++) {
			for (local362 = arg0 - 1; local362 >= 0; local362--) {
				if (local289 >> 1 >= local362) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(417) int local417;
		for (local362 = arg0 - 1; local362 >= 0; local362--) {
			for (local417 = arg0 - 1; local417 >= 0; local417--) {
				if (local362 << 1 <= local417) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(468) int local468;
		for (local417 = arg0 - 1; local417 >= 0; local417--) {
			for (local468 = arg0 - 1; local468 >= 0; local468--) {
				if (local417 >> 1 >= local468) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(517) int local517;
		for (local468 = arg0 - 1; local468 >= 0; local468--) {
			for (local517 = 0; local517 < arg0; local517++) {
				if (local468 << 1 <= local517) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(573) int local573;
		for (local517 = 0; local517 < arg0; local517++) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local573 <= local517 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local632 = arg0 - 1; local632 >= 0; local632--) {
				if (local632 >= local573 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(686) int local686;
		for (local632 = arg0 - 1; local632 >= 0; local632--) {
			for (local686 = 0; local686 < arg0; local686++) {
				if (local686 >= local632 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(734) int local734;
		for (local686 = 0; local686 < arg0; local686++) {
			for (local734 = 0; local734 < arg0; local734++) {
				if (local734 <= local686 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(797) int local797;
		for (local734 = 0; local734 < arg0; local734++) {
			for (local797 = arg0 - 1; local797 >= 0; local797--) {
				if (local734 >> 1 <= local797) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(853) int local853;
		for (local797 = arg0 - 1; local797 >= 0; local797--) {
			for (local853 = arg0 - 1; local853 >= 0; local853--) {
				if (local797 << 1 >= local853) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(911) int local911;
		for (local853 = arg0 - 1; local853 >= 0; local853--) {
			for (local911 = arg0 - 1; local911 >= 0; local911--) {
				if (local911 >= local853 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(960) int local960;
		for (local911 = arg0 - 1; local911 >= 0; local911--) {
			for (local960 = 0; local960 < arg0; local960++) {
				if (local960 <= local911 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1019) int local1019;
		for (local960 = 0; local960 < arg0; local960++) {
			for (local1019 = 0; local1019 < arg0; local1019++) {
				if (local1019 >= local960 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1074) int local1074;
		for (local1019 = 0; local1019 < arg0; local1019++) {
			for (local1074 = arg0 - 1; local1074 >= 0; local1074--) {
				if (local1074 <= local1019 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1126) int local1126;
		for (local1074 = 0; local1074 < arg0; local1074++) {
			for (local1126 = 0; local1126 < arg0; local1126++) {
				if (arg0 / 2 >= local1126) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1179) int local1179;
		for (local1126 = 0; local1126 < arg0; local1126++) {
			for (local1179 = 0; local1179 < arg0; local1179++) {
				if (local1126 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1232) int local1232;
		for (local1179 = 0; local1179 < arg0; local1179++) {
			for (local1232 = 0; local1232 < arg0; local1232++) {
				if (arg0 / 2 <= local1232) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1285) int local1285;
		for (local1232 = 0; local1232 < arg0; local1232++) {
			for (local1285 = 0; local1285 < arg0; local1285++) {
				if (local1232 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1334) int local1334;
		for (local1285 = 0; local1285 < arg0; local1285++) {
			for (local1334 = 0; local1334 < arg0; local1334++) {
				if (local1334 <= local1285 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1391) int local1391;
		for (local1334 = arg0 - 1; local1334 >= 0; local1334--) {
			for (local1391 = 0; local1391 < arg0; local1391++) {
				if (local1391 <= local1334 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1446) int local1446;
		for (local1391 = arg0 - 1; local1391 >= 0; local1391--) {
			for (local1446 = arg0 - 1; local1446 >= 0; local1446--) {
				if (local1391 - arg0 / 2 >= local1446) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1502) int local1502;
		for (local1446 = 0; local1446 < arg0; local1446++) {
			for (local1502 = arg0 - 1; local1502 >= 0; local1502--) {
				if (local1446 - arg0 / 2 >= local1502) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1560) int local1560;
		for (local1502 = 0; local1502 < arg0; local1502++) {
			for (local1560 = 0; local1560 < arg0; local1560++) {
				if (local1502 - arg0 / 2 <= local1560) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1614) int local1614;
		for (local1560 = arg0 - 1; local1560 >= 0; local1560--) {
			for (local1614 = 0; local1614 < arg0; local1614++) {
				if (local1614 >= local1560 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1676) int local1676;
		for (local1614 = arg0 - 1; local1614 >= 0; local1614--) {
			for (local1676 = arg0 - 1; local1676 >= 0; local1676--) {
				if (local1614 - arg0 / 2 <= local1676) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1676 = 0; local1676 < arg0; local1676++) {
			for (@Pc(1731) int local1731 = arg0 - 1; local1731 >= 0; local1731--) {
				if (local1676 - arg0 / 2 <= local1731) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)V")
	public static void method43(@OriginalArg(0) int arg0) {
		Static287.anIntArray305 = new int[arg0];
		Static482.anIntArray460 = new int[arg0];
		Static167.anIntArray153 = new int[arg0];
		Static228.anIntArray503 = new int[arg0];
		Static603.anIntArray546 = new int[arg0];
	}
}
