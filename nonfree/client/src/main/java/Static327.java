import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "Z")
	public static boolean aBoolean434 = false;

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	public static int anInt6118 = 0;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V")
	public static void method5315(@OriginalArg(0) int arg0) {
		if (arg0 == Static276.anInt4985) {
			return;
		}
		Static634.anInt10129 = Static638.anInt10172 = Static29.anIntArray23[arg0];
		Static630.method8654();
		Static85.anIntArrayArray11 = new int[Static634.anInt10129][Static638.anInt10172];
		Static609.anIntArrayArray63 = new int[Static634.anInt10129][Static638.anInt10172];
		Static193.anIntArrayArrayArray10 = new int[4][Static634.anInt10129 >> 3][Static638.anInt10172 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static271.aClass105Array1[local40] = Static640.method8724(Static634.anInt10129, Static638.anInt10172);
		}
		Static3.aByteArrayArrayArray1 = new byte[4][Static634.anInt10129][Static638.anInt10172];
		Static164.method2912(Static638.anInt10172, Static634.anInt10129);
		Static341.method7765(Static323.aClass5_9, Static638.anInt10172 >> 3, Static634.anInt10129 >> 3);
		Static276.anInt4985 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)[[[B")
	public static byte[][][] method5316(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(65) int local65;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local65 = 0; local65 < arg0; local65++) {
				if (local65 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(105) int local105;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local65 <= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(152) int local152;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local152 >= local105) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(194) int local194;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local194 = 0; local194 < arg0; local194++) {
				if (local152 >> 1 >= local194) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(243) int local243;
		for (local194 = 0; local194 < arg0; local194++) {
			for (local243 = 0; local243 < arg0; local243++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local243 >= local194 << 1) {
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
		@Pc(304) int local304;
		for (local243 = 0; local243 < arg0; local243++) {
			for (local304 = arg0 - 1; local304 >= 0; local304--) {
				if (local243 >> 1 >= local304) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(354) int local354;
		for (local304 = arg0 - 1; local304 >= 0; local304--) {
			for (local354 = arg0 - 1; local354 >= 0; local354--) {
				if (local304 << 1 <= local354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(398) int local398;
		for (local354 = arg0 - 1; local354 >= 0; local354--) {
			for (local398 = arg0 - 1; local398 >= 0; local398--) {
				if (local354 >> 1 >= local398) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(437) int local437;
		for (local398 = arg0 - 1; local398 >= 0; local398--) {
			for (local437 = 0; local437 < arg0; local437++) {
				if (local437 >= local398 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(483) int local483;
		for (local437 = 0; local437 < arg0; local437++) {
			for (local483 = 0; local483 < arg0; local483++) {
				if (local437 >> 1 >= local483) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(528) int local528;
		for (local483 = 0; local483 < arg0; local483++) {
			for (local528 = arg0 - 1; local528 >= 0; local528--) {
				if (local528 >= local483 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(575) int local575;
		for (local528 = arg0 - 1; local528 >= 0; local528--) {
			for (local575 = 0; local575 < arg0; local575++) {
				if (local575 >= local528 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(616) int local616;
		for (local575 = 0; local575 < arg0; local575++) {
			for (local616 = 0; local616 < arg0; local616++) {
				if (local616 <= local575 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(661) int local661;
		for (local616 = 0; local616 < arg0; local616++) {
			for (local661 = arg0 - 1; local661 >= 0; local661--) {
				if (local661 >= local616 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(703) int local703;
		for (local661 = arg0 - 1; local661 >= 0; local661--) {
			for (local703 = arg0 - 1; local703 >= 0; local703--) {
				if (local661 << 1 >= local703) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(748) int local748;
		for (local703 = arg0 - 1; local703 >= 0; local703--) {
			for (local748 = arg0 - 1; local748 >= 0; local748--) {
				if (local748 >= local703 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(794) int local794;
		for (local748 = arg0 - 1; local748 >= 0; local748--) {
			for (local794 = 0; local794 < arg0; local794++) {
				if (local748 << 1 >= local794) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(839) int local839;
		for (local794 = 0; local794 < arg0; local794++) {
			for (local839 = 0; local839 < arg0; local839++) {
				if (local839 >= local794 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(884) int local884;
		for (local839 = 0; local839 < arg0; local839++) {
			for (local884 = arg0 - 1; local884 >= 0; local884--) {
				if (local884 <= local839 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(933) int local933;
		for (local884 = 0; local884 < arg0; local884++) {
			for (local933 = 0; local933 < arg0; local933++) {
				if (arg0 / 2 >= local933) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(976) int local976;
		for (local933 = 0; local933 < arg0; local933++) {
			for (local976 = 0; local976 < arg0; local976++) {
				if (arg0 / 2 >= local933) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1015) int local1015;
		for (local976 = 0; local976 < arg0; local976++) {
			for (local1015 = 0; local1015 < arg0; local1015++) {
				if (local1015 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1066) int local1066;
		for (local1015 = 0; local1015 < arg0; local1015++) {
			for (local1066 = 0; local1066 < arg0; local1066++) {
				if (arg0 / 2 <= local1015) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1113) int local1113;
		for (local1066 = 0; local1066 < arg0; local1066++) {
			for (local1113 = 0; local1113 < arg0; local1113++) {
				if (local1113 <= local1066 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1161) int local1161;
		for (local1113 = arg0 - 1; local1113 >= 0; local1113--) {
			for (local1161 = 0; local1161 < arg0; local1161++) {
				if (local1161 <= local1113 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1217) int local1217;
		for (local1161 = arg0 - 1; local1161 >= 0; local1161--) {
			for (local1217 = arg0 - 1; local1217 >= 0; local1217--) {
				if (local1161 - arg0 / 2 >= local1217) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1262) int local1262;
		for (local1217 = 0; local1217 < arg0; local1217++) {
			for (local1262 = arg0 - 1; local1262 >= 0; local1262--) {
				if (local1217 - arg0 / 2 >= local1262) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1307) int local1307;
		for (local1262 = 0; local1262 < arg0; local1262++) {
			for (local1307 = 0; local1307 < arg0; local1307++) {
				if (local1307 >= local1262 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1359) int local1359;
		for (local1307 = arg0 - 1; local1307 >= 0; local1307--) {
			for (local1359 = 0; local1359 < arg0; local1359++) {
				if (local1359 >= local1307 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1412) int local1412;
		for (local1359 = arg0 - 1; local1359 >= 0; local1359--) {
			for (local1412 = arg0 - 1; local1412 >= 0; local1412--) {
				if (local1412 >= local1359 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1412 = 0; local1412 < arg0; local1412++) {
			for (@Pc(1458) int local1458 = arg0 - 1; local1458 >= 0; local1458--) {
				if (local1412 - arg0 / 2 <= local1458) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
