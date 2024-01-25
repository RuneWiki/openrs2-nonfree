import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "Lclient!vk;")
	public static Class259 aClass259_3;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method5816(@OriginalArg(1) int arg0) {
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
		@Pc(69) int local69;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local69 = 0; local69 < arg0; local69++) {
				if (local26 >= local69) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(105) int local105;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local69 <= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(148) int local148;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local148 = 0; local148 < arg0; local148++) {
				if (local148 >= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local148 = arg0 - 1; local148 >= 0; local148--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local148 >> 1 >= local194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(235) int local235;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local235 = 0; local235 < arg0; local235++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local194 << 1 <= local235) {
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
		@Pc(293) int local293;
		for (local235 = 0; local235 < arg0; local235++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local293 <= local235 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(339) int local339;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local339 = arg0 - 1; local339 >= 0; local339--) {
				if (local293 << 1 <= local339) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(383) int local383;
		for (local339 = arg0 - 1; local339 >= 0; local339--) {
			for (local383 = arg0 - 1; local383 >= 0; local383--) {
				if (local339 >> 1 >= local383) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(426) int local426;
		for (local383 = arg0 - 1; local383 >= 0; local383--) {
			for (local426 = 0; local426 < arg0; local426++) {
				if (local383 << 1 <= local426) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(472) int local472;
		for (local426 = 0; local426 < arg0; local426++) {
			for (local472 = 0; local472 < arg0; local472++) {
				if (local472 <= local426 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local472 = 0; local472 < arg0; local472++) {
			for (@Pc(517) int local517 = arg0 - 1; local517 >= 0; local517--) {
				if (local472 << 1 <= local517) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(565) int local565;
		for (@Pc(561) int local561 = arg0 - 1; local561 >= 0; local561--) {
			for (local565 = 0; local565 < arg0; local565++) {
				if (local561 >> 1 <= local565) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(607) int local607;
		for (local565 = 0; local565 < arg0; local565++) {
			for (local607 = 0; local607 < arg0; local607++) {
				if (local607 <= local565 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(648) int local648;
		for (local607 = 0; local607 < arg0; local607++) {
			for (local648 = arg0 - 1; local648 >= 0; local648--) {
				if (local648 >= local607 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(690) int local690;
		for (local648 = arg0 - 1; local648 >= 0; local648--) {
			for (local690 = arg0 - 1; local690 >= 0; local690--) {
				if (local648 << 1 >= local690) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(734) int local734;
		for (local690 = arg0 - 1; local690 >= 0; local690--) {
			for (local734 = arg0 - 1; local734 >= 0; local734--) {
				if (local690 >> 1 <= local734) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(783) int local783;
		for (local734 = arg0 - 1; local734 >= 0; local734--) {
			for (local783 = 0; local783 < arg0; local783++) {
				if (local734 << 1 >= local783) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(828) int local828;
		for (local783 = 0; local783 < arg0; local783++) {
			for (local828 = 0; local828 < arg0; local828++) {
				if (local828 >= local783 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(877) int local877;
		for (local828 = 0; local828 < arg0; local828++) {
			for (local877 = arg0 - 1; local877 >= 0; local877--) {
				if (local828 << 1 >= local877) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(926) int local926;
		for (local877 = 0; local877 < arg0; local877++) {
			for (local926 = 0; local926 < arg0; local926++) {
				if (arg0 / 2 >= local926) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(969) int local969;
		for (local926 = 0; local926 < arg0; local926++) {
			for (local969 = 0; local969 < arg0; local969++) {
				if (local926 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1016) int local1016;
		for (local969 = 0; local969 < arg0; local969++) {
			for (local1016 = 0; local1016 < arg0; local1016++) {
				if (local1016 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1063) int local1063;
		for (local1016 = 0; local1016 < arg0; local1016++) {
			for (local1063 = 0; local1063 < arg0; local1063++) {
				if (local1016 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1110) int local1110;
		for (local1063 = 0; local1063 < arg0; local1063++) {
			for (local1110 = 0; local1110 < arg0; local1110++) {
				if (local1110 <= local1063 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1157) int local1157;
		for (local1110 = arg0 - 1; local1110 >= 0; local1110--) {
			for (local1157 = 0; local1157 < arg0; local1157++) {
				if (local1157 <= local1110 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1205) int local1205;
		for (local1157 = arg0 - 1; local1157 >= 0; local1157--) {
			for (local1205 = arg0 - 1; local1205 >= 0; local1205--) {
				if (local1205 <= local1157 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1253) int local1253;
		for (local1205 = 0; local1205 < arg0; local1205++) {
			for (local1253 = arg0 - 1; local1253 >= 0; local1253--) {
				if (local1205 - arg0 / 2 >= local1253) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1301) int local1301;
		for (local1253 = 0; local1253 < arg0; local1253++) {
			for (local1301 = 0; local1301 < arg0; local1301++) {
				if (local1253 - arg0 / 2 <= local1301) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1353) int local1353;
		for (local1301 = arg0 - 1; local1301 >= 0; local1301--) {
			for (local1353 = 0; local1353 < arg0; local1353++) {
				if (local1301 - arg0 / 2 <= local1353) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1402) int local1402;
		for (local1353 = arg0 - 1; local1353 >= 0; local1353--) {
			for (local1402 = arg0 - 1; local1402 >= 0; local1402--) {
				if (local1402 >= local1353 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1402 = 0; local1402 < arg0; local1402++) {
			for (@Pc(1449) int local1449 = arg0 - 1; local1449 >= 0; local1449--) {
				if (local1402 - arg0 / 2 <= local1449) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
