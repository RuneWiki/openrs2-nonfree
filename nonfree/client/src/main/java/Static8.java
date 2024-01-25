import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "Lclient!ub;")
	public static Class327 aClass327_1;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
	public static int anInt276;

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "J")
	public static long aLong9 = -1L;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)J")
	public static synchronized long method201() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static572.aLong258 > local5) {
			Static534.aLong241 += Static572.aLong258 - local5;
		}
		Static572.aLong258 = local5;
		return local5 + Static534.aLong241;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method202(@OriginalArg(0) int arg0) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(120) int local120;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local120 = 0; local120 < arg0; local120++) {
				if (local73 <= local120) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(163) int local163;
		for (local120 = arg0 - 1; local120 >= 0; local120--) {
			for (local163 = 0; local163 < arg0; local163++) {
				if (local120 <= local163) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(209) int local209;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local209 = 0; local209 < arg0; local209++) {
				if (local209 <= local163 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(255) int local255;
		for (local209 = 0; local209 < arg0; local209++) {
			for (local255 = 0; local255 < arg0; local255++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local255 >= local209 << 1) {
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
		@Pc(320) int local320;
		for (local255 = 0; local255 < arg0; local255++) {
			for (local320 = arg0 - 1; local320 >= 0; local320--) {
				if (local320 <= local255 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(366) int local366;
		for (local320 = arg0 - 1; local320 >= 0; local320--) {
			for (local366 = arg0 - 1; local366 >= 0; local366--) {
				if (local366 >= local320 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(407) int local407;
		for (local366 = arg0 - 1; local366 >= 0; local366--) {
			for (local407 = arg0 - 1; local407 >= 0; local407--) {
				if (local366 >> 1 >= local407) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(449) int local449;
		for (local407 = arg0 - 1; local407 >= 0; local407--) {
			for (local449 = 0; local449 < arg0; local449++) {
				if (local407 << 1 <= local449) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(491) int local491;
		for (local449 = 0; local449 < arg0; local449++) {
			for (local491 = 0; local491 < arg0; local491++) {
				if (local449 >> 1 >= local491) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(540) int local540;
		for (local491 = 0; local491 < arg0; local491++) {
			for (local540 = arg0 - 1; local540 >= 0; local540--) {
				if (local540 >= local491 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(591) int local591;
		for (local540 = arg0 - 1; local540 >= 0; local540--) {
			for (local591 = 0; local591 < arg0; local591++) {
				if (local540 >> 1 <= local591) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(633) int local633;
		for (local591 = 0; local591 < arg0; local591++) {
			for (local633 = 0; local633 < arg0; local633++) {
				if (local591 << 1 >= local633) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(682) int local682;
		for (local633 = 0; local633 < arg0; local633++) {
			for (local682 = arg0 - 1; local682 >= 0; local682--) {
				if (local682 >= local633 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(727) int local727;
		for (local682 = arg0 - 1; local682 >= 0; local682--) {
			for (local727 = arg0 - 1; local727 >= 0; local727--) {
				if (local727 <= local682 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(777) int local777;
		for (local727 = arg0 - 1; local727 >= 0; local727--) {
			for (local777 = arg0 - 1; local777 >= 0; local777--) {
				if (local777 >= local727 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(819) int local819;
		for (local777 = arg0 - 1; local777 >= 0; local777--) {
			for (local819 = 0; local819 < arg0; local819++) {
				if (local819 <= local777 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(861) int local861;
		for (local819 = 0; local819 < arg0; local819++) {
			for (local861 = 0; local861 < arg0; local861++) {
				if (local819 >> 1 <= local861) {
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
				if (local910 <= local861 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(959) int local959;
		for (local910 = 0; local910 < arg0; local910++) {
			for (local959 = 0; local959 < arg0; local959++) {
				if (arg0 / 2 >= local959) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1002) int local1002;
		for (local959 = 0; local959 < arg0; local959++) {
			for (local1002 = 0; local1002 < arg0; local1002++) {
				if (local959 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1045) int local1045;
		for (local1002 = 0; local1002 < arg0; local1002++) {
			for (local1045 = 0; local1045 < arg0; local1045++) {
				if (local1045 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1088) int local1088;
		for (local1045 = 0; local1045 < arg0; local1045++) {
			for (local1088 = 0; local1088 < arg0; local1088++) {
				if (local1045 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1131) int local1131;
		for (local1088 = 0; local1088 < arg0; local1088++) {
			for (local1131 = 0; local1131 < arg0; local1131++) {
				if (local1131 <= local1088 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1179) int local1179;
		for (local1131 = arg0 - 1; local1131 >= 0; local1131--) {
			for (local1179 = 0; local1179 < arg0; local1179++) {
				if (local1179 <= local1131 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1230) int local1230;
		for (local1179 = arg0 - 1; local1179 >= 0; local1179--) {
			for (local1230 = arg0 - 1; local1230 >= 0; local1230--) {
				if (local1179 - arg0 / 2 >= local1230) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1278) int local1278;
		for (local1230 = 0; local1230 < arg0; local1230++) {
			for (local1278 = arg0 - 1; local1278 >= 0; local1278--) {
				if (local1230 - arg0 / 2 >= local1278) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1323) int local1323;
		for (local1278 = 0; local1278 < arg0; local1278++) {
			for (local1323 = 0; local1323 < arg0; local1323++) {
				if (local1278 - arg0 / 2 <= local1323) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1371) int local1371;
		for (local1323 = arg0 - 1; local1323 >= 0; local1323--) {
			for (local1371 = 0; local1371 < arg0; local1371++) {
				if (local1371 >= local1323 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1416) int local1416;
		for (local1371 = arg0 - 1; local1371 >= 0; local1371--) {
			for (local1416 = arg0 - 1; local1416 >= 0; local1416--) {
				if (local1371 - arg0 / 2 <= local1416) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1416 = 0; local1416 < arg0; local1416++) {
			for (@Pc(1465) int local1465 = arg0 - 1; local1465 >= 0; local1465--) {
				if (local1465 >= local1416 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
