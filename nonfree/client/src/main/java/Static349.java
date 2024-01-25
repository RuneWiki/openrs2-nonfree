import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Lclient!kg;")
	public static Class5_Sub4_Sub4_Sub1 aClass5_Sub4_Sub4_Sub1_2;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public static int anInt6770 = -1;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt6771 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!fb;I)V")
	public static void method5665(@OriginalArg(0) Class3_Sub4 arg0) {
		if (arg0.aByteArray70.length - arg0.anInt4268 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method3643();
		if (local19 < 0 || local19 > 14) {
			return;
		}
		@Pc(40) byte local40;
		if (local19 == 14) {
			local40 = 36;
		} else if (local19 == 13) {
			local40 = 35;
		} else if (local19 == 12) {
			local40 = 34;
		} else if (local19 == 11) {
			local40 = 33;
		} else if (local19 == 10) {
			local40 = 32;
		} else if (local19 == 9) {
			local40 = 31;
		} else if (local19 == 8) {
			local40 = 30;
		} else if (local19 == 7) {
			local40 = 29;
		} else if (local19 == 6) {
			local40 = 28;
		} else if (local19 == 5) {
			local40 = 28;
		} else if (local19 == 4) {
			local40 = 24;
		} else if (local19 == 3) {
			local40 = 23;
		} else if (local19 == 2) {
			local40 = 22;
		} else if (local19 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray70.length - arg0.anInt4268) {
			return;
		}
		Static144.anInt2893 = arg0.method3643();
		if (Static144.anInt2893 < 1) {
			Static144.anInt2893 = 1;
		} else if (Static144.anInt2893 > 4) {
			Static144.anInt2893 = 4;
		}
		Static350.method5692(arg0.method3643() == 1);
		Static228.aBoolean265 = arg0.method3643() == 1;
		Static271.aBoolean338 = arg0.method3643() == 1;
		Static352.aBoolean453 = arg0.method3643() == 1;
		Static33.anInt778 = arg0.method3643() == 1 ? 1 : 0;
		Static274.aBoolean403 = arg0.method3643() == 1;
		Static5.aBoolean13 = arg0.method3643() == 1;
		Static21.aBoolean29 = arg0.method3643() == 1;
		Static77.anInt1520 = arg0.method3643();
		if (Static77.anInt1520 > 2) {
			Static77.anInt1520 = 2;
		}
		if (local19 < 2) {
			Static118.aBoolean141 = arg0.method3643() == 1;
			arg0.method3643();
		} else {
			Static118.aBoolean141 = arg0.method3643() == 1;
		}
		Static333.aBoolean435 = arg0.method3643() == 1;
		Static302.aBoolean410 = arg0.method3643() == 1;
		Static45.anInt930 = arg0.method3643();
		if (Static45.anInt930 > 2) {
			Static45.anInt930 = 2;
		}
		Static135.anInt2792 = Static45.anInt930;
		Static149.aBoolean162 = arg0.method3643() == 1;
		Static224.anInt4582 = arg0.method3643();
		if (Static224.anInt4582 > 127) {
			Static224.anInt4582 = 127;
		}
		Static36.anInt809 = arg0.method3643();
		Static260.anInt5195 = arg0.method3643();
		if (Static260.anInt5195 > 127) {
			Static260.anInt5195 = 127;
		}
		if (local19 >= 1) {
			Static175.anInt3635 = arg0.method3649();
			Static321.anInt6220 = arg0.method3649();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method3643();
		}
		@Pc(397) int local397;
		if (local19 >= 4) {
			local397 = arg0.method3643();
			if (local397 < 0 || local397 > 2) {
				local397 = 0;
			}
			if (Static26.anInt699 < 96) {
				local397 = 0;
			}
			Static243.method4153(local397);
		}
		if (local19 >= 5) {
			Static84.anInt1688 = arg0.method3642();
		}
		local397 = 0;
		if (local19 >= 6) {
			Static37.anInt6452 = local397 = arg0.method3643();
		}
		if (Static37.anInt6452 != 1 && Static37.anInt6452 != 2) {
			Static37.anInt6452 = 2;
		}
		if (local19 >= 7) {
			Static250.aBoolean275 = arg0.method3643() == 1;
		}
		if (local19 >= 8) {
			Static165.aBoolean173 = arg0.method3643() == 1;
		}
		if (local19 >= 9) {
			Static226.anInt4626 = arg0.method3643();
		}
		if (Static226.anInt4626 < 0 || Static226.anInt4626 > 3) {
			Static226.anInt4626 = 0;
		}
		if (local19 >= 10) {
			Static172.aBoolean196 = arg0.method3643() != 0;
		}
		if (local19 >= 11) {
			Static260.aBoolean302 = arg0.method3643() != 0;
		}
		if (local19 >= 12) {
			Static33.anInt778 = arg0.method3643();
		}
		if (Static33.anInt778 < 0 || Static33.anInt778 > 2) {
			Static33.anInt778 = 1;
		}
		if (local19 >= 13) {
			Static250.aBoolean274 = arg0.method3643() == 1;
		}
		if (local19 >= 14) {
			Static197.anInt4054 = arg0.method3643();
		} else if (local397 == 0) {
			Static197.anInt4054 = 2;
		} else {
			Static197.anInt4054 = 1;
		}
		if (Static197.anInt4054 < 0 || Static197.anInt4054 > 3) {
			Static197.anInt4054 = 2;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)V")
	public static void method5666(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static327.anInt6302 + aClass5_Sub4_Sub4_Sub1_2.anInt5901;
		@Pc(15) int local15 = aClass5_Sub4_Sub4_Sub1_2.anInt5905 + Static348.anInt6764;
		if (Static298.anInt5943 - local10 < -500 || Static298.anInt5943 - local10 > 500 || Static56.anInt1230 - local15 < -500 || Static56.anInt1230 - local15 > 500) {
			Static298.anInt5943 = local10;
			Static56.anInt1230 = local15;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static298.anInt5943 != local10) {
			local63 = local10 - Static298.anInt5943;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static298.anInt5943 += local71;
		}
		if (Static56.anInt1230 != local15) {
			local63 = local15 - Static56.anInt1230;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local63 > local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static56.anInt1230 += local71;
		}
		if (!Static165.aBoolean173) {
			Static57.aFloat3 += Static128.aFloat21 * (float) arg0 / 6.0F;
			Static46.aFloat2 += (float) arg0 * Static352.aFloat78 / 6.0F;
		}
		Static240.method4147();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method5668(@OriginalArg(1) int arg0) {
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
		@Pc(159) int local159;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local159 = 0; local159 < arg0; local159++) {
				if (local116 <= local159) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(204) int local204;
		for (local159 = arg0 - 1; local159 >= 0; local159--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local159 >> 1 >= local204) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(246) int local246;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local204 << 1 <= local246) {
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
		@Pc(307) int local307;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local246 >> 1 >= local307) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(360) int local360;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local360 = arg0 - 1; local360 >= 0; local360--) {
				if (local307 << 1 <= local360) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(404) int local404;
		for (local360 = arg0 - 1; local360 >= 0; local360--) {
			for (local404 = arg0 - 1; local404 >= 0; local404--) {
				if (local360 >> 1 >= local404) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(450) int local450;
		for (local404 = arg0 - 1; local404 >= 0; local404--) {
			for (local450 = 0; local450 < arg0; local450++) {
				if (local404 << 1 <= local450) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(495) int local495;
		for (local450 = 0; local450 < arg0; local450++) {
			for (local495 = 0; local495 < arg0; local495++) {
				if (local495 <= local450 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(540) int local540;
		for (local495 = 0; local495 < arg0; local495++) {
			for (local540 = arg0 - 1; local540 >= 0; local540--) {
				if (local540 >= local495 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(580) int local580;
		for (local540 = arg0 - 1; local540 >= 0; local540--) {
			for (local580 = 0; local580 < arg0; local580++) {
				if (local580 >= local540 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(618) int local618;
		for (local580 = 0; local580 < arg0; local580++) {
			for (local618 = 0; local618 < arg0; local618++) {
				if (local580 << 1 >= local618) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(667) int local667;
		for (local618 = 0; local618 < arg0; local618++) {
			for (local667 = arg0 - 1; local667 >= 0; local667--) {
				if (local618 >> 1 <= local667) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(709) int local709;
		for (local667 = arg0 - 1; local667 >= 0; local667--) {
			for (local709 = arg0 - 1; local709 >= 0; local709--) {
				if (local667 << 1 >= local709) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(760) int local760;
		for (local709 = arg0 - 1; local709 >= 0; local709--) {
			for (local760 = arg0 - 1; local760 >= 0; local760--) {
				if (local709 >> 1 <= local760) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(803) int local803;
		for (local760 = arg0 - 1; local760 >= 0; local760--) {
			for (local803 = 0; local803 < arg0; local803++) {
				if (local803 <= local760 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(844) int local844;
		for (local803 = 0; local803 < arg0; local803++) {
			for (local844 = 0; local844 < arg0; local844++) {
				if (local803 >> 1 <= local844) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(973) int local973;
		for (local934 = 0; local934 < arg0; local934++) {
			for (local973 = 0; local973 < arg0; local973++) {
				if (local934 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1020) int local1020;
		for (local973 = 0; local973 < arg0; local973++) {
			for (local1020 = 0; local1020 < arg0; local1020++) {
				if (local1020 >= arg0 / 2) {
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
		@Pc(1110) int local1110;
		for (local1067 = 0; local1067 < arg0; local1067++) {
			for (local1110 = 0; local1110 < arg0; local1110++) {
				if (local1110 <= local1067 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1161) int local1161;
		for (local1110 = arg0 - 1; local1110 >= 0; local1110--) {
			for (local1161 = 0; local1161 < arg0; local1161++) {
				if (local1161 <= local1110 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1210) int local1210;
		for (local1161 = arg0 - 1; local1161 >= 0; local1161--) {
			for (local1210 = arg0 - 1; local1210 >= 0; local1210--) {
				if (local1161 - arg0 / 2 >= local1210) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1254) int local1254;
		for (local1210 = 0; local1210 < arg0; local1210++) {
			for (local1254 = arg0 - 1; local1254 >= 0; local1254--) {
				if (local1254 <= local1210 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1299) int local1299;
		for (local1254 = 0; local1254 < arg0; local1254++) {
			for (local1299 = 0; local1299 < arg0; local1299++) {
				if (local1254 - arg0 / 2 <= local1299) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1351) int local1351;
		for (local1299 = arg0 - 1; local1299 >= 0; local1299--) {
			for (local1351 = 0; local1351 < arg0; local1351++) {
				if (local1299 - arg0 / 2 <= local1351) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1398) int local1398;
		for (local1351 = arg0 - 1; local1351 >= 0; local1351--) {
			for (local1398 = arg0 - 1; local1398 >= 0; local1398--) {
				if (local1351 - arg0 / 2 <= local1398) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1398 = 0; local1398 < arg0; local1398++) {
			for (@Pc(1446) int local1446 = arg0 - 1; local1446 >= 0; local1446--) {
				if (local1446 >= local1398 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
