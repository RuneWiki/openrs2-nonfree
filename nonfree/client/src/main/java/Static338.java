import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!r", name = "i", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_101 = new Class186(43, 6);

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt5679 = 0;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_102 = new Class186(16, 10);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method4779() {
		if (Static44.aClass28_14.method3514()) {
			Static44.aClass28_14.method3558(Static314.aCanvas8);
			Static389.method5359();
			Static44.aClass28_14.method3492(Static314.aCanvas8);
			Static44.aClass28_14.method3525(Static314.aCanvas8);
		} else {
			Static385.method5310(Static155.anInt2774);
		}
		Static207.method3239();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!qi;)Z")
	public static boolean method4780(@OriginalArg(1) Class207 arg0) {
		return Static162.aClass207_3 == arg0 || Static312.aClass207_7 == arg0 || Static388.aClass207_10 == arg0 || Static383.aClass207_9 == arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4783(@OriginalArg(1) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(202) int local202;
		for (local160 = arg0 - 1; local160 >= 0; local160--) {
			for (local202 = 0; local202 < arg0; local202++) {
				if (local202 <= local160 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		@Pc(302) int local302;
		for (local244 = 0; local244 < arg0; local244++) {
			for (local302 = arg0 - 1; local302 >= 0; local302--) {
				if (local244 >> 1 >= local302) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(351) int local351;
		for (local302 = arg0 - 1; local302 >= 0; local302--) {
			for (local351 = arg0 - 1; local351 >= 0; local351--) {
				if (local351 >= local302 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(395) int local395;
		for (local351 = arg0 - 1; local351 >= 0; local351--) {
			for (local395 = arg0 - 1; local395 >= 0; local395--) {
				if (local395 <= local351 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(440) int local440;
		for (local395 = arg0 - 1; local395 >= 0; local395--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local395 << 1 <= local440) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(482) int local482;
		for (local440 = 0; local440 < arg0; local440++) {
			for (local482 = 0; local482 < arg0; local482++) {
				if (local482 <= local440 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(531) int local531;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local531 = arg0 - 1; local531 >= 0; local531--) {
				if (local531 >= local482 << 1) {
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
				if (local582 >= local531 >> 1) {
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
				if (local620 <= local582 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(669) int local669;
		for (local620 = 0; local620 < arg0; local620++) {
			for (local669 = arg0 - 1; local669 >= 0; local669--) {
				if (local620 >> 1 <= local669) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(719) int local719;
		for (local669 = arg0 - 1; local669 >= 0; local669--) {
			for (local719 = arg0 - 1; local719 >= 0; local719--) {
				if (local719 <= local669 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(760) int local760;
		for (local719 = arg0 - 1; local719 >= 0; local719--) {
			for (local760 = arg0 - 1; local760 >= 0; local760--) {
				if (local719 >> 1 <= local760) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(806) int local806;
		for (local760 = arg0 - 1; local760 >= 0; local760--) {
			for (local806 = 0; local806 < arg0; local806++) {
				if (local806 <= local760 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(844) int local844;
		for (local806 = 0; local806 < arg0; local806++) {
			for (local844 = 0; local844 < arg0; local844++) {
				if (local806 >> 1 <= local844) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(889) int local889;
		for (local844 = 0; local844 < arg0; local844++) {
			for (local889 = arg0 - 1; local889 >= 0; local889--) {
				if (local889 <= local844 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(934) int local934;
		for (local889 = 0; local889 < arg0; local889++) {
			for (local934 = 0; local934 < arg0; local934++) {
				if (arg0 / 2 >= local934) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(977) int local977;
		for (local934 = 0; local934 < arg0; local934++) {
			for (local977 = 0; local977 < arg0; local977++) {
				if (arg0 / 2 >= local934) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1020) int local1020;
		for (local977 = 0; local977 < arg0; local977++) {
			for (local1020 = 0; local1020 < arg0; local1020++) {
				if (arg0 / 2 <= local1020) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1067) int local1067;
		for (local1020 = 0; local1020 < arg0; local1020++) {
			for (local1067 = 0; local1067 < arg0; local1067++) {
				if (local1020 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1106) int local1106;
		for (local1067 = 0; local1067 < arg0; local1067++) {
			for (local1106 = 0; local1106 < arg0; local1106++) {
				if (local1067 - arg0 / 2 >= local1106) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1158) int local1158;
		for (local1106 = arg0 - 1; local1106 >= 0; local1106--) {
			for (local1158 = 0; local1158 < arg0; local1158++) {
				if (local1158 <= local1106 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1210) int local1210;
		for (local1158 = arg0 - 1; local1158 >= 0; local1158--) {
			for (local1210 = arg0 - 1; local1210 >= 0; local1210--) {
				if (local1210 <= local1158 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1252) int local1252;
		for (local1210 = 0; local1210 < arg0; local1210++) {
			for (local1252 = arg0 - 1; local1252 >= 0; local1252--) {
				if (local1252 <= local1210 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1293) int local1293;
		for (local1252 = 0; local1252 < arg0; local1252++) {
			for (local1293 = 0; local1293 < arg0; local1293++) {
				if (local1293 >= local1252 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1345) int local1345;
		for (local1293 = arg0 - 1; local1293 >= 0; local1293--) {
			for (local1345 = 0; local1345 < arg0; local1345++) {
				if (local1293 - arg0 / 2 <= local1345) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1397) int local1397;
		for (local1345 = arg0 - 1; local1345 >= 0; local1345--) {
			for (local1397 = arg0 - 1; local1397 >= 0; local1397--) {
				if (local1397 >= local1345 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1397 = 0; local1397 < arg0; local1397++) {
			for (@Pc(1441) int local1441 = arg0 - 1; local1441 >= 0; local1441--) {
				if (local1397 - arg0 / 2 <= local1441) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
