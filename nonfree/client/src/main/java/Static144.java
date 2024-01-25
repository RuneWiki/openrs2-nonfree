import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "Lclient!qj;")
	public static Class165 aClass165_50;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!le;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!jd;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_3;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "[I")
	public static final int[] anIntArray333 = new int[500];

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString113 = null;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method2738(@OriginalArg(1) Class177 arg0) {
		@Pc(9) Class177 local9 = Static216.method3962(arg0);
		@Pc(13) int local13;
		@Pc(15) int local15;
		if (local9 == null) {
			local13 = Static11.anInt5389;
			local15 = Static320.anInt6140;
		} else {
			local13 = local9.anInt5179;
			local15 = local9.anInt5209;
		}
		Static298.method5223(local13, local15, arg0, false);
		Static206.method3815(local13, arg0, local15);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method2739(@OriginalArg(1) Class165 arg0) {
		aClass165_50 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[[B")
	public static byte[][][] method2744(@OriginalArg(0) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(112) int local112;
		for (local69 = 0; local69 < arg0; local69++) {
			for (local112 = 0; local112 < arg0; local112++) {
				if (local112 >= local69) {
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
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(254) int local254;
		for (local205 = 0; local205 < arg0; local205++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local254 >= local205 << 1) {
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
		@Pc(319) int local319;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local319 = arg0 - 1; local319 >= 0; local319--) {
				if (local254 >> 1 >= local319) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(372) int local372;
		for (local319 = arg0 - 1; local319 >= 0; local319--) {
			for (local372 = arg0 - 1; local372 >= 0; local372--) {
				if (local319 << 1 <= local372) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(416) int local416;
		for (local372 = arg0 - 1; local372 >= 0; local372--) {
			for (local416 = arg0 - 1; local416 >= 0; local416--) {
				if (local416 <= local372 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(462) int local462;
		for (local416 = arg0 - 1; local416 >= 0; local416--) {
			for (local462 = 0; local462 < arg0; local462++) {
				if (local416 << 1 <= local462) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(508) int local508;
		for (local462 = 0; local462 < arg0; local462++) {
			for (local508 = 0; local508 < arg0; local508++) {
				if (local508 <= local462 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(553) int local553;
		for (local508 = 0; local508 < arg0; local508++) {
			for (local553 = arg0 - 1; local553 >= 0; local553--) {
				if (local508 << 1 <= local553) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(597) int local597;
		for (local553 = arg0 - 1; local553 >= 0; local553--) {
			for (local597 = 0; local597 < arg0; local597++) {
				if (local553 >> 1 <= local597) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(642) int local642;
		for (local597 = 0; local597 < arg0; local597++) {
			for (local642 = 0; local642 < arg0; local642++) {
				if (local642 <= local597 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(691) int local691;
		for (local642 = 0; local642 < arg0; local642++) {
			for (local691 = arg0 - 1; local691 >= 0; local691--) {
				if (local691 >= local642 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(737) int local737;
		for (local691 = arg0 - 1; local691 >= 0; local691--) {
			for (local737 = arg0 - 1; local737 >= 0; local737--) {
				if (local737 <= local691 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(782) int local782;
		for (local737 = arg0 - 1; local737 >= 0; local737--) {
			for (local782 = arg0 - 1; local782 >= 0; local782--) {
				if (local782 >= local737 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(827) int local827;
		for (local782 = arg0 - 1; local782 >= 0; local782--) {
			for (local827 = 0; local827 < arg0; local827++) {
				if (local827 <= local782 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(872) int local872;
		for (local827 = 0; local827 < arg0; local827++) {
			for (local872 = 0; local872 < arg0; local872++) {
				if (local872 >= local827 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(925) int local925;
		for (local872 = 0; local872 < arg0; local872++) {
			for (local925 = arg0 - 1; local925 >= 0; local925--) {
				if (local872 << 1 >= local925) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(970) int local970;
		for (local925 = 0; local925 < arg0; local925++) {
			for (local970 = 0; local970 < arg0; local970++) {
				if (arg0 / 2 >= local970) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1013) int local1013;
		for (local970 = 0; local970 < arg0; local970++) {
			for (local1013 = 0; local1013 < arg0; local1013++) {
				if (arg0 / 2 >= local970) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1064) int local1064;
		for (local1013 = 0; local1013 < arg0; local1013++) {
			for (local1064 = 0; local1064 < arg0; local1064++) {
				if (local1064 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1111) int local1111;
		for (local1064 = 0; local1064 < arg0; local1064++) {
			for (local1111 = 0; local1111 < arg0; local1111++) {
				if (local1064 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1154) int local1154;
		for (local1111 = 0; local1111 < arg0; local1111++) {
			for (local1154 = 0; local1154 < arg0; local1154++) {
				if (local1154 <= local1111 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1206) int local1206;
		for (local1154 = arg0 - 1; local1154 >= 0; local1154--) {
			for (local1206 = 0; local1206 < arg0; local1206++) {
				if (local1154 - arg0 / 2 >= local1206) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1255) int local1255;
		for (local1206 = arg0 - 1; local1206 >= 0; local1206--) {
			for (local1255 = arg0 - 1; local1255 >= 0; local1255--) {
				if (local1206 - arg0 / 2 >= local1255) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1303) int local1303;
		for (local1255 = 0; local1255 < arg0; local1255++) {
			for (local1303 = arg0 - 1; local1303 >= 0; local1303--) {
				if (local1303 <= local1255 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1358) int local1358;
		for (local1303 = 0; local1303 < arg0; local1303++) {
			for (local1358 = 0; local1358 < arg0; local1358++) {
				if (local1303 - arg0 / 2 <= local1358) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1410) int local1410;
		for (local1358 = arg0 - 1; local1358 >= 0; local1358--) {
			for (local1410 = 0; local1410 < arg0; local1410++) {
				if (local1410 >= local1358 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1466) int local1466;
		for (local1410 = arg0 - 1; local1410 >= 0; local1410--) {
			for (local1466 = arg0 - 1; local1466 >= 0; local1466--) {
				if (local1466 >= local1410 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1466 = 0; local1466 < arg0; local1466++) {
			for (@Pc(1508) int local1508 = arg0 - 1; local1508 >= 0; local1508--) {
				if (local1466 - arg0 / 2 <= local1508) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}
}
