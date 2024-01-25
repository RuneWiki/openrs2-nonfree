import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!qa;")
	public static Class39 aClass39_12;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
	public static final int[] anIntArray700 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_183 = new Class239(12, 4);

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_184 = new Class239(81, 8);

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method7622(@OriginalArg(1) int arg0) {
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
				if (local26 >= local73) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local73 <= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(155) int local155;
		for (local112 = arg0 - 1; local112 >= 0; local112--) {
			for (local155 = 0; local155 < arg0; local155++) {
				if (local155 >= local112) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(200) int local200;
		for (local155 = arg0 - 1; local155 >= 0; local155--) {
			for (local200 = 0; local200 < arg0; local200++) {
				if (local155 >> 1 >= local200) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(249) int local249;
		for (local200 = 0; local200 < arg0; local200++) {
			for (local249 = 0; local249 < arg0; local249++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local200 << 1 <= local249) {
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
		@Pc(318) int local318;
		for (local249 = 0; local249 < arg0; local249++) {
			for (local318 = arg0 - 1; local318 >= 0; local318--) {
				if (local318 <= local249 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(367) int local367;
		for (local318 = arg0 - 1; local318 >= 0; local318--) {
			for (local367 = arg0 - 1; local367 >= 0; local367--) {
				if (local367 >= local318 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(411) int local411;
		for (local367 = arg0 - 1; local367 >= 0; local367--) {
			for (local411 = arg0 - 1; local411 >= 0; local411--) {
				if (local367 >> 1 >= local411) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(457) int local457;
		for (local411 = arg0 - 1; local411 >= 0; local411--) {
			for (local457 = 0; local457 < arg0; local457++) {
				if (local411 << 1 <= local457) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(495) int local495;
		for (local457 = 0; local457 < arg0; local457++) {
			for (local495 = 0; local495 < arg0; local495++) {
				if (local495 <= local457 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(536) int local536;
		for (local495 = 0; local495 < arg0; local495++) {
			for (local536 = arg0 - 1; local536 >= 0; local536--) {
				if (local536 >= local495 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(583) int local583;
		for (local536 = arg0 - 1; local536 >= 0; local536--) {
			for (local583 = 0; local583 < arg0; local583++) {
				if (local536 >> 1 <= local583) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(625) int local625;
		for (local583 = 0; local583 < arg0; local583++) {
			for (local625 = 0; local625 < arg0; local625++) {
				if (local625 <= local583 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(674) int local674;
		for (local625 = 0; local625 < arg0; local625++) {
			for (local674 = arg0 - 1; local674 >= 0; local674--) {
				if (local625 >> 1 <= local674) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(727) int local727;
		for (local674 = arg0 - 1; local674 >= 0; local674--) {
			for (local727 = arg0 - 1; local727 >= 0; local727--) {
				if (local674 << 1 >= local727) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(771) int local771;
		for (local727 = arg0 - 1; local727 >= 0; local727--) {
			for (local771 = arg0 - 1; local771 >= 0; local771--) {
				if (local771 >= local727 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(820) int local820;
		for (local771 = arg0 - 1; local771 >= 0; local771--) {
			for (local820 = 0; local820 < arg0; local820++) {
				if (local771 << 1 >= local820) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(861) int local861;
		for (local820 = 0; local820 < arg0; local820++) {
			for (local861 = 0; local861 < arg0; local861++) {
				if (local820 >> 1 <= local861) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(910) int local910;
		for (local861 = 0; local861 < arg0; local861++) {
			for (local910 = arg0 - 1; local910 >= 0; local910--) {
				if (local861 << 1 >= local910) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(948) int local948;
		for (local910 = 0; local910 < arg0; local910++) {
			for (local948 = 0; local948 < arg0; local948++) {
				if (local948 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(999) int local999;
		for (local948 = 0; local948 < arg0; local948++) {
			for (local999 = 0; local999 < arg0; local999++) {
				if (arg0 / 2 >= local948) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1042) int local1042;
		for (local999 = 0; local999 < arg0; local999++) {
			for (local1042 = 0; local1042 < arg0; local1042++) {
				if (arg0 / 2 <= local1042) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1085) int local1085;
		for (local1042 = 0; local1042 < arg0; local1042++) {
			for (local1085 = 0; local1085 < arg0; local1085++) {
				if (local1042 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1136) int local1136;
		for (local1085 = 0; local1085 < arg0; local1085++) {
			for (local1136 = 0; local1136 < arg0; local1136++) {
				if (local1085 - arg0 / 2 >= local1136) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1188) int local1188;
		for (local1136 = arg0 - 1; local1136 >= 0; local1136--) {
			for (local1188 = 0; local1188 < arg0; local1188++) {
				if (local1136 - arg0 / 2 >= local1188) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1241) int local1241;
		for (local1188 = arg0 - 1; local1188 >= 0; local1188--) {
			for (local1241 = arg0 - 1; local1241 >= 0; local1241--) {
				if (local1241 <= local1188 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1286) int local1286;
		for (local1241 = 0; local1241 < arg0; local1241++) {
			for (local1286 = arg0 - 1; local1286 >= 0; local1286--) {
				if (local1286 <= local1241 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1327) int local1327;
		for (local1286 = 0; local1286 < arg0; local1286++) {
			for (local1327 = 0; local1327 < arg0; local1327++) {
				if (local1286 - arg0 / 2 <= local1327) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1378) int local1378;
		for (local1327 = arg0 - 1; local1327 >= 0; local1327--) {
			for (local1378 = 0; local1378 < arg0; local1378++) {
				if (local1378 >= local1327 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1434) int local1434;
		for (local1378 = arg0 - 1; local1378 >= 0; local1378--) {
			for (local1434 = arg0 - 1; local1434 >= 0; local1434--) {
				if (local1378 - arg0 / 2 <= local1434) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1434 = 0; local1434 < arg0; local1434++) {
			for (@Pc(1478) int local1478 = arg0 - 1; local1478 >= 0; local1478--) {
				if (local1434 - arg0 / 2 <= local1478) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
