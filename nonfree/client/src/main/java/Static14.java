import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "Lclient!ib;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "Lclient!wo;")
	public static Class390 aClass390_1;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
	public static int anInt206 = 2;

	@OriginalMember(owner = "client!aja", name = "i", descriptor = "[Lclient!lt;")
	public static Class221[] aClass221Array1 = null;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method245(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(160) int local160;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local160 = 0; local160 < arg0; local160++) {
				if (local160 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(202) int local202;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local202 = 0; local202 < arg0; local202++) {
				if (local160 >> 1 >= local202) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(244) int local244;
		for (local202 = 0; local202 < arg0; local202++) {
			for (local244 = 0; local244 < arg0; local244++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local244 >= local202 << 1) {
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
		@Pc(309) int local309;
		for (local244 = 0; local244 < arg0; local244++) {
			for (local309 = arg0 - 1; local309 >= 0; local309--) {
				if (local309 <= local244 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(360) int local360;
		for (local309 = arg0 - 1; local309 >= 0; local309--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local360 >= local309 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(407) int local407;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local407 = arg0 - 1; local407 >= 0; local407--) {
				if (local360 >> 1 >= local407) {
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
		@Pc(495) int local495;
		for (local449 = 0; local449 < arg0; local449++) {
			for (local495 = 0; local495 < arg0; local495++) {
				if (local495 <= local449 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(548) int local548;
		for (local495 = 0; local495 < arg0; local495++) {
			for (local548 = arg0 - 1; local548 >= 0; local548--) {
				if (local495 << 1 <= local548) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(591) int local591;
		for (local548 = arg0 - 1; local548 >= 0; local548--) {
			for (local591 = 0; local591 < arg0; local591++) {
				if (local591 >= local548 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(637) int local637;
		for (local591 = 0; local591 < arg0; local591++) {
			for (local637 = 0; local637 < arg0; local637++) {
				if (local637 <= local591 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(686) int local686;
		for (local637 = 0; local637 < arg0; local637++) {
			for (local686 = arg0 - 1; local686 >= 0; local686--) {
				if (local637 >> 1 <= local686) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(735) int local735;
		for (local686 = arg0 - 1; local686 >= 0; local686--) {
			for (local735 = arg0 - 1; local735 >= 0; local735--) {
				if (local735 <= local686 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(783) int local783;
		for (local735 = arg0 - 1; local735 >= 0; local735--) {
			for (local783 = arg0 - 1; local783 >= 0; local783--) {
				if (local783 >= local735 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(826) int local826;
		for (local783 = arg0 - 1; local783 >= 0; local783--) {
			for (local826 = 0; local826 < arg0; local826++) {
				if (local826 <= local783 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(868) int local868;
		for (local826 = 0; local826 < arg0; local826++) {
			for (local868 = 0; local868 < arg0; local868++) {
				if (local826 >> 1 <= local868) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(909) int local909;
		for (local868 = 0; local868 < arg0; local868++) {
			for (local909 = arg0 - 1; local909 >= 0; local909--) {
				if (local909 <= local868 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(951) int local951;
		for (local909 = 0; local909 < arg0; local909++) {
			for (local951 = 0; local951 < arg0; local951++) {
				if (arg0 / 2 >= local951) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(994) int local994;
		for (local951 = 0; local951 < arg0; local951++) {
			for (local994 = 0; local994 < arg0; local994++) {
				if (arg0 / 2 >= local951) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1045) int local1045;
		for (local994 = 0; local994 < arg0; local994++) {
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
		@Pc(1135) int local1135;
		for (local1088 = 0; local1088 < arg0; local1088++) {
			for (local1135 = 0; local1135 < arg0; local1135++) {
				if (local1088 - arg0 / 2 >= local1135) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1187) int local1187;
		for (local1135 = arg0 - 1; local1135 >= 0; local1135--) {
			for (local1187 = 0; local1187 < arg0; local1187++) {
				if (local1187 <= local1135 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1240) int local1240;
		for (local1187 = arg0 - 1; local1187 >= 0; local1187--) {
			for (local1240 = arg0 - 1; local1240 >= 0; local1240--) {
				if (local1240 <= local1187 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1292) int local1292;
		for (local1240 = 0; local1240 < arg0; local1240++) {
			for (local1292 = arg0 - 1; local1292 >= 0; local1292--) {
				if (local1240 - arg0 / 2 >= local1292) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1341) int local1341;
		for (local1292 = 0; local1292 < arg0; local1292++) {
			for (local1341 = 0; local1341 < arg0; local1341++) {
				if (local1292 - arg0 / 2 <= local1341) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1389) int local1389;
		for (local1341 = arg0 - 1; local1341 >= 0; local1341--) {
			for (local1389 = 0; local1389 < arg0; local1389++) {
				if (local1389 >= local1341 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1445) int local1445;
		for (local1389 = arg0 - 1; local1389 >= 0; local1389--) {
			for (local1445 = arg0 - 1; local1445 >= 0; local1445--) {
				if (local1445 >= local1389 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1445 = 0; local1445 < arg0; local1445++) {
			for (@Pc(1487) int local1487 = arg0 - 1; local1487 >= 0; local1487--) {
				if (local1445 - arg0 / 2 <= local1487) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
