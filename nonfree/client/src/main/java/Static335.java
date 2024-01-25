import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
	public static int anInt5671;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_126 = new Class217(104, 2);

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
	public static final int[] anIntArray554 = new int[5];

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_57 = new Class267(64);

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "[I")
	public static final int[] anIntArray555 = new int[14];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4518(@OriginalArg(0) int arg0) {
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
				if (local69 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local69 <= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local112 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(205) int local205;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local205 = 0; local205 < arg0; local205++) {
				if (local163 >> 1 >= local205) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(246) int local246;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local246 >= local205 << 1) {
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
		@Pc(308) int local308;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local308 = arg0 - 1; local308 >= 0; local308--) {
				if (local246 >> 1 >= local308) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(358) int local358;
		for (local308 = arg0 - 1; local308 >= 0; local308--) {
			for (local358 = arg0 - 1; local358 >= 0; local358--) {
				if (local308 << 1 <= local358) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(405) int local405;
		for (local358 = arg0 - 1; local358 >= 0; local358--) {
			for (local405 = arg0 - 1; local405 >= 0; local405--) {
				if (local358 >> 1 >= local405) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(449) int local449;
		for (local405 = arg0 - 1; local405 >= 0; local405--) {
			for (local449 = 0; local449 < arg0; local449++) {
				if (local449 >= local405 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(490) int local490;
		for (local449 = 0; local449 < arg0; local449++) {
			for (local490 = 0; local490 < arg0; local490++) {
				if (local490 <= local449 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(535) int local535;
		for (local490 = 0; local490 < arg0; local490++) {
			for (local535 = arg0 - 1; local535 >= 0; local535--) {
				if (local490 << 1 <= local535) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(582) int local582;
		for (local535 = arg0 - 1; local535 >= 0; local535--) {
			for (local582 = 0; local582 < arg0; local582++) {
				if (local535 >> 1 <= local582) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(620) int local620;
		for (local582 = 0; local582 < arg0; local582++) {
			for (local620 = 0; local620 < arg0; local620++) {
				if (local582 << 1 >= local620) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(665) int local665;
		for (local620 = 0; local620 < arg0; local620++) {
			for (local665 = arg0 - 1; local665 >= 0; local665--) {
				if (local665 >= local620 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(715) int local715;
		for (local665 = arg0 - 1; local665 >= 0; local665--) {
			for (local715 = arg0 - 1; local715 >= 0; local715--) {
				if (local715 <= local665 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(763) int local763;
		for (local715 = arg0 - 1; local715 >= 0; local715--) {
			for (local763 = arg0 - 1; local763 >= 0; local763--) {
				if (local763 >= local715 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(809) int local809;
		for (local763 = arg0 - 1; local763 >= 0; local763--) {
			for (local809 = 0; local809 < arg0; local809++) {
				if (local809 <= local763 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(854) int local854;
		for (local809 = 0; local809 < arg0; local809++) {
			for (local854 = 0; local854 < arg0; local854++) {
				if (local854 >= local809 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(899) int local899;
		for (local854 = 0; local854 < arg0; local854++) {
			for (local899 = arg0 - 1; local899 >= 0; local899--) {
				if (local899 <= local854 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		@Pc(995) int local995;
		for (local944 = 0; local944 < arg0; local944++) {
			for (local995 = 0; local995 < arg0; local995++) {
				if (arg0 / 2 >= local944) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1038) int local1038;
		for (local995 = 0; local995 < arg0; local995++) {
			for (local1038 = 0; local1038 < arg0; local1038++) {
				if (local1038 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1085) int local1085;
		for (local1038 = 0; local1038 < arg0; local1038++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (arg0 / 2 <= local1038) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1128) int local1128;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1128 = 0; local1128 < arg0; local1128++) {
				if (local1128 <= local1085 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1176) int local1176;
		for (local1128 = arg0 - 1; local1128 >= 0; local1128--) {
			for (local1176 = 0; local1176 < arg0; local1176++) {
				if (local1128 - arg0 / 2 >= local1176) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1232) int local1232;
		for (local1176 = arg0 - 1; local1176 >= 0; local1176--) {
			for (local1232 = arg0 - 1; local1232 >= 0; local1232--) {
				if (local1232 <= local1176 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1276) int local1276;
		for (local1232 = 0; local1232 < arg0; local1232++) {
			for (local1276 = arg0 - 1; local1276 >= 0; local1276--) {
				if (local1232 - arg0 / 2 >= local1276) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1319) int local1319;
		for (local1276 = 0; local1276 < arg0; local1276++) {
			for (local1319 = 0; local1319 < arg0; local1319++) {
				if (local1276 - arg0 / 2 <= local1319) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1367) int local1367;
		for (local1319 = arg0 - 1; local1319 >= 0; local1319--) {
			for (local1367 = 0; local1367 < arg0; local1367++) {
				if (local1319 - arg0 / 2 <= local1367) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1415) int local1415;
		for (local1367 = arg0 - 1; local1367 >= 0; local1367--) {
			for (local1415 = arg0 - 1; local1415 >= 0; local1415--) {
				if (local1415 >= local1367 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1415 = 0; local1415 < arg0; local1415++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1460 >= local1415 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4519(@OriginalArg(1) String arg0) {
		return Static430.method5707(arg0, 10);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IC)Z")
	public static boolean method4520(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
