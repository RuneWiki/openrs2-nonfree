import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt6148;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "J")
	public static long aLong201;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt6146 = -1;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "[I")
	public static final int[] anIntArray589 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Lclient!fj;")
	public static Class69 method5320(@OriginalArg(0) int arg0) {
		@Pc(12) Class69 local12 = (Class69) Static269.aClass37_88.method915((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(32) byte[] local32 = Static348.aClass134_136.method3009(arg0, 34);
		local12 = new Class69();
		if (local32 != null) {
			local12.method1391(arg0, new Class1_Sub21(local32));
		}
		Static269.aClass37_88.method922((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method5321(@OriginalArg(1) int arg0) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		@Pc(208) int local208;
		for (local163 = arg0 - 1; local163 >= 0; local163--) {
			for (local208 = 0; local208 < arg0; local208++) {
				if (local163 >> 1 >= local208) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(246) int local246;
		for (local208 = 0; local208 < arg0; local208++) {
			for (local246 = 0; local246 < arg0; local246++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local246 >= local208 << 1) {
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
		@Pc(312) int local312;
		for (local246 = 0; local246 < arg0; local246++) {
			for (local312 = arg0 - 1; local312 >= 0; local312--) {
				if (local312 <= local246 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(354) int local354;
		for (local312 = arg0 - 1; local312 >= 0; local312--) {
			for (local354 = arg0 - 1; local354 >= 0; local354--) {
				if (local354 >= local312 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(401) int local401;
		for (local354 = arg0 - 1; local354 >= 0; local354--) {
			for (local401 = arg0 - 1; local401 >= 0; local401--) {
				if (local354 >> 1 >= local401) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(440) int local440;
		for (local401 = arg0 - 1; local401 >= 0; local401--) {
			for (local440 = 0; local440 < arg0; local440++) {
				if (local440 >= local401 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(486) int local486;
		for (local440 = 0; local440 < arg0; local440++) {
			for (local486 = 0; local486 < arg0; local486++) {
				if (local486 <= local440 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(531) int local531;
		for (local486 = 0; local486 < arg0; local486++) {
			for (local531 = arg0 - 1; local531 >= 0; local531--) {
				if (local486 << 1 <= local531) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(574) int local574;
		for (local531 = arg0 - 1; local531 >= 0; local531--) {
			for (local574 = 0; local574 < arg0; local574++) {
				if (local531 >> 1 <= local574) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(616) int local616;
		for (local574 = 0; local574 < arg0; local574++) {
			for (local616 = 0; local616 < arg0; local616++) {
				if (local616 <= local574 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(669) int local669;
		for (local616 = 0; local616 < arg0; local616++) {
			for (local669 = arg0 - 1; local669 >= 0; local669--) {
				if (local616 >> 1 <= local669) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(715) int local715;
		for (local669 = arg0 - 1; local669 >= 0; local669--) {
			for (local715 = arg0 - 1; local715 >= 0; local715--) {
				if (local669 << 1 >= local715) {
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
				if (local715 >> 1 <= local763) {
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
				if (local763 << 1 >= local809) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(855) int local855;
		for (local809 = 0; local809 < arg0; local809++) {
			for (local855 = 0; local855 < arg0; local855++) {
				if (local855 >= local809 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(900) int local900;
		for (local855 = 0; local855 < arg0; local855++) {
			for (local900 = arg0 - 1; local900 >= 0; local900--) {
				if (local855 << 1 >= local900) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(945) int local945;
		for (local900 = 0; local900 < arg0; local900++) {
			for (local945 = 0; local945 < arg0; local945++) {
				if (arg0 / 2 >= local945) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(988) int local988;
		for (local945 = 0; local945 < arg0; local945++) {
			for (local988 = 0; local988 < arg0; local988++) {
				if (local945 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1035) int local1035;
		for (local988 = 0; local988 < arg0; local988++) {
			for (local1035 = 0; local1035 < arg0; local1035++) {
				if (arg0 / 2 <= local1035) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1074) int local1074;
		for (local1035 = 0; local1035 < arg0; local1035++) {
			for (local1074 = 0; local1074 < arg0; local1074++) {
				if (local1035 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1117) int local1117;
		for (local1074 = 0; local1074 < arg0; local1074++) {
			for (local1117 = 0; local1117 < arg0; local1117++) {
				if (local1117 <= local1074 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1164) int local1164;
		for (local1117 = arg0 - 1; local1117 >= 0; local1117--) {
			for (local1164 = 0; local1164 < arg0; local1164++) {
				if (local1117 - arg0 / 2 >= local1164) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1211) int local1211;
		for (local1164 = arg0 - 1; local1164 >= 0; local1164--) {
			for (local1211 = arg0 - 1; local1211 >= 0; local1211--) {
				if (local1164 - arg0 / 2 >= local1211) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1259) int local1259;
		for (local1211 = 0; local1211 < arg0; local1211++) {
			for (local1259 = arg0 - 1; local1259 >= 0; local1259--) {
				if (local1211 - arg0 / 2 >= local1259) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1304) int local1304;
		for (local1259 = 0; local1259 < arg0; local1259++) {
			for (local1304 = 0; local1304 < arg0; local1304++) {
				if (local1304 >= local1259 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1355) int local1355;
		for (local1304 = arg0 - 1; local1304 >= 0; local1304--) {
			for (local1355 = 0; local1355 < arg0; local1355++) {
				if (local1355 >= local1304 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1407) int local1407;
		for (local1355 = arg0 - 1; local1355 >= 0; local1355--) {
			for (local1407 = arg0 - 1; local1407 >= 0; local1407--) {
				if (local1355 - arg0 / 2 <= local1407) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1407 = 0; local1407 < arg0; local1407++) {
			for (@Pc(1449) int local1449 = arg0 - 1; local1449 >= 0; local1449--) {
				if (local1449 >= local1407 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII)V")
	public static void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg0 * (arg0 - 32) / arg4;
		if (local11 < 8) {
			local11 = 8;
		}
		@Pc(29) int local29 = (arg0 - local11 - 32) * arg2 / (arg4 - arg0);
		Static214.aClass8Array12[0].method4393(arg1, arg3);
		Static214.aClass8Array12[1].method4393(arg1, arg0 + arg3 - 16);
		Static217.aClass105_5.method4225(arg0 - 32, Static75.anInt1565, 16, arg1, arg3 + 16);
		Static217.aClass105_5.method4225(local11, Static291.anInt5861, 16, arg1, arg3 + local29 + 16);
		Static217.aClass105_5.method4255(Static301.anInt6027, local11, local29 + arg3 + 16, arg1);
		Static217.aClass105_5.method4255(Static301.anInt6027, local11, arg3 + local29 + 16, arg1 + 1);
		Static217.aClass105_5.method4248(arg1, Static301.anInt6027, arg3 + local29 + 16, 16);
		Static217.aClass105_5.method4248(arg1, Static301.anInt6027, arg3 + local29 + 17, 16);
		Static217.aClass105_5.method4255(Static289.anInt5798, local11, arg3 + local29 + 16, arg1 + 15);
		Static217.aClass105_5.method4255(Static289.anInt5798, local11 - 1, arg3 + 17 - -local29, arg1 + 14);
		Static217.aClass105_5.method4248(arg1, Static289.anInt5798, local11 + arg3 + local29 + 15, 16);
		Static217.aClass105_5.method4248(arg1 + 1, Static289.anInt5798, local11 + local29 + arg3 + 14, 15);
	}
}
