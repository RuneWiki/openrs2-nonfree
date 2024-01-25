import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "[I")
	public static final int[] anIntArray537 = new int[1];

	@OriginalMember(owner = "client!uda", name = "F", descriptor = "I")
	public static int anInt9341 = 104;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7337(@OriginalArg(1) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(109) int local109;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local69 <= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(156) int local156;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local156 = 0; local156 < arg0; local156++) {
				if (local156 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(198) int local198;
		for (local156 = arg0 - 1; local156 >= 0; local156--) {
			for (local198 = 0; local198 < arg0; local198++) {
				if (local156 >> 1 >= local198) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(243) int local243;
		for (local198 = 0; local198 < arg0; local198++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local243 >= local198 << 1) {
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
		@Pc(300) int local300;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local300 = arg0 - 1; local300 >= 0; local300--) {
				if (local243 >> 1 >= local300) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(353) int local353;
		for (local300 = arg0 - 1; local300 >= 0; local300--) {
			for (local353 = arg0 - 1; local353 >= 0; local353--) {
				if (local300 << 1 <= local353) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(397) int local397;
		for (local353 = arg0 - 1; local353 >= 0; local353--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local397 <= local353 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(436) int local436;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local436 = 0; local436 < arg0; local436++) {
				if (local397 << 1 <= local436) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(478) int local478;
		for (local436 = 0; local436 < arg0; local436++) {
			for (local478 = 0; local478 < arg0; local478++) {
				if (local436 >> 1 >= local478) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(531) int local531;
		for (local478 = 0; local478 < arg0; local478++) {
			for (local531 = arg0 - 1; local531 >= 0; local531--) {
				if (local478 << 1 <= local531) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(582) int local582;
		for (local531 = arg0 - 1; local531 >= 0; local531--) {
			for (local582 = 0; local582 < arg0; local582++) {
				if (local531 >> 1 <= local582) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(627) int local627;
		for (local582 = 0; local582 < arg0; local582++) {
			for (local627 = 0; local627 < arg0; local627++) {
				if (local627 <= local582 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(675) int local675;
		for (local627 = 0; local627 < arg0; local627++) {
			for (local675 = arg0 - 1; local675 >= 0; local675--) {
				if (local627 >> 1 <= local675) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(725) int local725;
		for (local675 = arg0 - 1; local675 >= 0; local675--) {
			for (local725 = arg0 - 1; local725 >= 0; local725--) {
				if (local725 <= local675 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(766) int local766;
		for (local725 = arg0 - 1; local725 >= 0; local725--) {
			for (local766 = arg0 - 1; local766 >= 0; local766--) {
				if (local766 >= local725 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(815) int local815;
		for (local766 = arg0 - 1; local766 >= 0; local766--) {
			for (local815 = 0; local815 < arg0; local815++) {
				if (local815 <= local766 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(857) int local857;
		for (local815 = 0; local815 < arg0; local815++) {
			for (local857 = 0; local857 < arg0; local857++) {
				if (local815 >> 1 <= local857) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(906) int local906;
		for (local857 = 0; local857 < arg0; local857++) {
			for (local906 = arg0 - 1; local906 >= 0; local906--) {
				if (local906 <= local857 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(952) int local952;
		for (local906 = 0; local906 < arg0; local906++) {
			for (local952 = 0; local952 < arg0; local952++) {
				if (local952 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(995) int local995;
		for (local952 = 0; local952 < arg0; local952++) {
			for (local995 = 0; local995 < arg0; local995++) {
				if (arg0 / 2 >= local952) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1042) int local1042;
		for (local995 = 0; local995 < arg0; local995++) {
			for (local1042 = 0; local1042 < arg0; local1042++) {
				if (arg0 / 2 <= local1042) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1089) int local1089;
		for (local1042 = 0; local1042 < arg0; local1042++) {
			for (local1089 = 0; local1089 < arg0; local1089++) {
				if (arg0 / 2 <= local1042) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1136) int local1136;
		for (local1089 = 0; local1089 < arg0; local1089++) {
			for (local1136 = 0; local1136 < arg0; local1136++) {
				if (local1089 - arg0 / 2 >= local1136) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1183) int local1183;
		for (local1136 = arg0 - 1; local1136 >= 0; local1136--) {
			for (local1183 = 0; local1183 < arg0; local1183++) {
				if (local1183 <= local1136 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1236) int local1236;
		for (local1183 = arg0 - 1; local1183 >= 0; local1183--) {
			for (local1236 = arg0 - 1; local1236 >= 0; local1236--) {
				if (local1183 - arg0 / 2 >= local1236) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1284) int local1284;
		for (local1236 = 0; local1236 < arg0; local1236++) {
			for (local1284 = arg0 - 1; local1284 >= 0; local1284--) {
				if (local1236 - arg0 / 2 >= local1284) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1329) int local1329;
		for (local1284 = 0; local1284 < arg0; local1284++) {
			for (local1329 = 0; local1329 < arg0; local1329++) {
				if (local1284 - arg0 / 2 <= local1329) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1377) int local1377;
		for (local1329 = arg0 - 1; local1329 >= 0; local1329--) {
			for (local1377 = 0; local1377 < arg0; local1377++) {
				if (local1377 >= local1329 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1429) int local1429;
		for (local1377 = arg0 - 1; local1377 >= 0; local1377--) {
			for (local1429 = arg0 - 1; local1429 >= 0; local1429--) {
				if (local1377 - arg0 / 2 <= local1429) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1429 = 0; local1429 < arg0; local1429++) {
			for (@Pc(1477) int local1477 = arg0 - 1; local1477 >= 0; local1477--) {
				if (local1477 >= local1429 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
