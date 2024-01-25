import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public static int anInt3526 = 1;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IZ)[[[B")
	public static byte[][][] method2829(@OriginalArg(0) int arg0) {
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
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(109) int local109;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local109 = 0; local109 < arg0; local109++) {
				if (local73 <= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(152) int local152;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local152 >= local109) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(197) int local197;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local197 <= local152 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(246) int local246;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local246 >= local197 << 1) {
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
		@Pc(296) int local296;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local296 = arg0 - 1; local296 >= 0; local296--) {
				if (local296 <= local246 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(346) int local346;
		for (local296 = arg0 - 1; local296 >= 0; local296--) {
			for (local346 = arg0 - 1; local346 >= 0; local346--) {
				if (local296 << 1 <= local346) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(394) int local394;
		for (local346 = arg0 - 1; local346 >= 0; local346--) {
			for (local394 = arg0 - 1; local394 >= 0; local394--) {
				if (local346 >> 1 >= local394) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(440) int local440;
		for (local394 = arg0 - 1; local394 >= 0; local394--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local440 >= local394 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		@Pc(535) int local535;
		for (local482 = 0; local482 < arg0; local482++) {
			for (local535 = arg0 - 1; local535 >= 0; local535--) {
				if (local482 << 1 <= local535) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(579) int local579;
		for (local535 = arg0 - 1; local535 >= 0; local535--) {
			for (local579 = 0; local579 < arg0; local579++) {
				if (local535 >> 1 <= local579) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(621) int local621;
		for (local579 = 0; local579 < arg0; local579++) {
			for (local621 = 0; local621 < arg0; local621++) {
				if (local579 << 1 >= local621) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(670) int local670;
		for (local621 = 0; local621 < arg0; local621++) {
			for (local670 = arg0 - 1; local670 >= 0; local670--) {
				if (local621 >> 1 <= local670) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(716) int local716;
		for (local670 = arg0 - 1; local670 >= 0; local670--) {
			for (local716 = arg0 - 1; local716 >= 0; local716--) {
				if (local670 << 1 >= local716) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(764) int local764;
		for (local716 = arg0 - 1; local716 >= 0; local716--) {
			for (local764 = arg0 - 1; local764 >= 0; local764--) {
				if (local716 >> 1 <= local764) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(809) int local809;
		for (local764 = arg0 - 1; local764 >= 0; local764--) {
			for (local809 = 0; local809 < arg0; local809++) {
				if (local764 << 1 >= local809) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(847) int local847;
		for (local809 = 0; local809 < arg0; local809++) {
			for (local847 = 0; local847 < arg0; local847++) {
				if (local809 >> 1 <= local847) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(896) int local896;
		for (local847 = 0; local847 < arg0; local847++) {
			for (local896 = arg0 - 1; local896 >= 0; local896--) {
				if (local847 << 1 >= local896) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(937) int local937;
		for (local896 = 0; local896 < arg0; local896++) {
			for (local937 = 0; local937 < arg0; local937++) {
				if (arg0 / 2 >= local937) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(984) int local984;
		for (local937 = 0; local937 < arg0; local937++) {
			for (local984 = 0; local984 < arg0; local984++) {
				if (local937 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1031) int local1031;
		for (local984 = 0; local984 < arg0; local984++) {
			for (local1031 = 0; local1031 < arg0; local1031++) {
				if (arg0 / 2 <= local1031) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1070) int local1070;
		for (local1031 = 0; local1031 < arg0; local1031++) {
			for (local1070 = 0; local1070 < arg0; local1070++) {
				if (arg0 / 2 <= local1031) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1117) int local1117;
		for (local1070 = 0; local1070 < arg0; local1070++) {
			for (local1117 = 0; local1117 < arg0; local1117++) {
				if (local1117 <= local1070 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1160) int local1160;
		for (local1117 = arg0 - 1; local1117 >= 0; local1117--) {
			for (local1160 = 0; local1160 < arg0; local1160++) {
				if (local1160 <= local1117 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1216) int local1216;
		for (local1160 = arg0 - 1; local1160 >= 0; local1160--) {
			for (local1216 = arg0 - 1; local1216 >= 0; local1216--) {
				if (local1160 - arg0 / 2 >= local1216) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1260) int local1260;
		for (local1216 = 0; local1216 < arg0; local1216++) {
			for (local1260 = arg0 - 1; local1260 >= 0; local1260--) {
				if (local1216 - arg0 / 2 >= local1260) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1310) int local1310;
		for (local1260 = 0; local1260 < arg0; local1260++) {
			for (local1310 = 0; local1310 < arg0; local1310++) {
				if (local1260 - arg0 / 2 <= local1310) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1354) int local1354;
		for (local1310 = arg0 - 1; local1310 >= 0; local1310--) {
			for (local1354 = 0; local1354 < arg0; local1354++) {
				if (local1310 - arg0 / 2 <= local1354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1403) int local1403;
		for (local1354 = arg0 - 1; local1354 >= 0; local1354--) {
			for (local1403 = arg0 - 1; local1403 >= 0; local1403--) {
				if (local1403 >= local1354 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1403 = 0; local1403 < arg0; local1403++) {
			for (@Pc(1448) int local1448 = arg0 - 1; local1448 >= 0; local1448--) {
				if (local1448 >= local1403 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIILclient!pg;)Lclient!gq;")
	public static Class20_Sub1_Sub1 method2830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class163_Sub2 arg4) {
		if (arg4.aBoolean380 || Static376.method4880(arg0) && Static376.method4880(arg1)) {
			return new Class20_Sub1_Sub1(arg4, 3553, arg3, arg2, arg0, arg1, true);
		} else if (arg4.aBoolean377) {
			return new Class20_Sub1_Sub1(arg4, 34037, arg3, arg2, arg0, arg1, true);
		} else {
			return new Class20_Sub1_Sub1(arg4, arg3, arg2, arg0, arg1, Static29.method453(arg0), Static29.method453(arg1), true);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2831(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static291.anInt4793; local11++) {
			if (arg0.equalsIgnoreCase(Static26.aStringArray4[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static247.aStringArray23[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public static void method2832() {
		@Pc(9) int local9 = Static247.anInt3992 * 128 + 64;
		@Pc(15) int local15 = Static434.anInt7014 * 128 + 64;
		@Pc(23) int local23 = Static302.method3973(local15, local9, Static61.anInt1129) - Static77.anInt1469;
		if (Static215.anInt3549 < 100) {
			if (local9 > Static174.anInt3028) {
				Static174.anInt3028 += Static240.anInt3886 + (local9 - Static174.anInt3028) * Static215.anInt3549 / 1000;
				if (Static174.anInt3028 > local9) {
					Static174.anInt3028 = local9;
				}
			}
			if (local9 < Static174.anInt3028) {
				Static174.anInt3028 -= Static240.anInt3886 + Static215.anInt3549 * (Static174.anInt3028 - local9) / 1000;
				if (Static174.anInt3028 < local9) {
					Static174.anInt3028 = local9;
				}
			}
			if (Static40.anInt771 < local23) {
				Static40.anInt771 += Static240.anInt3886 + Static215.anInt3549 * (local23 - Static40.anInt771) / 1000;
				if (local23 < Static40.anInt771) {
					Static40.anInt771 = local23;
				}
			}
			if (local15 > Static143.anInt2544) {
				Static143.anInt2544 += Static215.anInt3549 * (local15 - Static143.anInt2544) / 1000 + Static240.anInt3886;
				if (Static143.anInt2544 > local15) {
					Static143.anInt2544 = local15;
				}
			}
			if (local23 < Static40.anInt771) {
				Static40.anInt771 -= Static240.anInt3886 + Static215.anInt3549 * (Static40.anInt771 - local23) / 1000;
				if (Static40.anInt771 < local23) {
					Static40.anInt771 = local23;
				}
			}
			if (local15 < Static143.anInt2544) {
				Static143.anInt2544 -= (Static143.anInt2544 - local15) * Static215.anInt3549 / 1000 + Static240.anInt3886;
				if (Static143.anInt2544 < local15) {
					Static143.anInt2544 = local15;
				}
			}
		} else {
			Static174.anInt3028 = Static247.anInt3992 * 128 + 64;
			Static143.anInt2544 = Static434.anInt7014 * 128 + 64;
			Static40.anInt771 = Static302.method3973(Static143.anInt2544, Static174.anInt3028, Static61.anInt1129) - Static77.anInt1469;
		}
		local15 = Static330.anInt5575 * 128 + 64;
		local9 = Static338.anInt5763 * 128 + 64;
		local23 = Static302.method3973(local15, local9, Static61.anInt1129) - Static172.anInt3016;
		@Pc(226) int local226 = local9 - Static174.anInt3028;
		@Pc(231) int local231 = local23 - Static40.anInt771;
		@Pc(236) int local236 = local15 - Static143.anInt2544;
		@Pc(247) int local247 = (int) Math.sqrt((double) (local236 * local236 + local226 * local226));
		@Pc(258) int local258 = (int) (Math.atan2((double) local231, (double) local247) * 2607.5945876176133D) & 0x3FFF;
		@Pc(269) int local269 = (int) (Math.atan2((double) local226, (double) local236) * -2607.5945876176133D) & 0x3FFF;
		if (local258 < 1024) {
			local258 = 1024;
		}
		if (local258 > 3072) {
			local258 = 3072;
		}
		if (local258 > Static235.anInt3805) {
			Static235.anInt3805 += Static98.anInt1863 * (local258 - Static235.anInt3805 >> 3) / 1000 + Static334.anInt5640 << 3;
			if (Static235.anInt3805 > local258) {
				Static235.anInt3805 = local258;
			}
		}
		if (Static235.anInt3805 > local258) {
			Static235.anInt3805 -= (Static235.anInt3805 - local258 >> 3) * Static98.anInt1863 / 1000 + Static334.anInt5640 << 3;
			if (Static235.anInt3805 < local258) {
				Static235.anInt3805 = local258;
			}
		}
		@Pc(353) int local353 = local269 - Static310.anInt5375;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static310.anInt5375 += Static98.anInt1863 * local353 / 1000 + Static334.anInt5640 << 3;
			Static310.anInt5375 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static310.anInt5375 -= Static334.anInt5640 + -local353 * Static98.anInt1863 / 1000 << 3;
			Static310.anInt5375 &= 0x3FFF;
		}
		@Pc(411) int local411 = local269 - Static310.anInt5375;
		if (local411 > 8192) {
			local411 -= 16384;
		}
		if (local411 < -8192) {
			local411 += 16384;
		}
		Static381.anInt6280 = 0;
		if (local411 < 0 && local353 > 0 || local411 > 0 && local353 < 0) {
			Static310.anInt5375 = local269;
		}
	}
}
