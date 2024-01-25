import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_58 = new Class44(14, -1);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method3659(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (@Pc(26) int local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(77) int local77;
		for (@Pc(73) int local73 = arg0 - 1; local73 >= 0; local73--) {
			for (local77 = 0; local77 < arg0; local77++) {
				if (local73 >= local77) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(124) int local124;
		for (local77 = 0; local77 < arg0; local77++) {
			for (local124 = 0; local124 < arg0; local124++) {
				if (local124 >= local77) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(167) int local167;
		for (local124 = arg0 - 1; local124 >= 0; local124--) {
			for (local167 = 0; local167 < arg0; local167++) {
				if (local167 >= local124) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(209) int local209;
		for (local167 = arg0 - 1; local167 >= 0; local167--) {
			for (local209 = 0; local209 < arg0; local209++) {
				if (local167 >> 1 >= local209) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(254) int local254;
		for (local209 = 0; local209 < arg0; local209++) {
			for (local254 = 0; local254 < arg0; local254++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local209 << 1 <= local254) {
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
		@Pc(315) int local315;
		for (local254 = 0; local254 < arg0; local254++) {
			for (local315 = arg0 - 1; local315 >= 0; local315--) {
				if (local315 <= local254 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(368) int local368;
		for (local315 = arg0 - 1; local315 >= 0; local315--) {
			for (local368 = arg0 - 1; local368 >= 0; local368--) {
				if (local368 >= local315 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(415) int local415;
		for (local368 = arg0 - 1; local368 >= 0; local368--) {
			for (local415 = arg0 - 1; local415 >= 0; local415--) {
				if (local415 <= local368 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(454) int local454;
		for (local415 = arg0 - 1; local415 >= 0; local415--) {
			for (local454 = 0; local454 < arg0; local454++) {
				if (local454 >= local415 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(499) int local499;
		for (local454 = 0; local454 < arg0; local454++) {
			for (local499 = 0; local499 < arg0; local499++) {
				if (local499 <= local454 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(544) int local544;
		for (local499 = 0; local499 < arg0; local499++) {
			for (local544 = arg0 - 1; local544 >= 0; local544--) {
				if (local544 >= local499 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(587) int local587;
		for (local544 = arg0 - 1; local544 >= 0; local544--) {
			for (local587 = 0; local587 < arg0; local587++) {
				if (local587 >= local544 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(632) int local632;
		for (local587 = 0; local587 < arg0; local587++) {
			for (local632 = 0; local632 < arg0; local632++) {
				if (local587 << 1 >= local632) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(685) int local685;
		for (local632 = 0; local632 < arg0; local632++) {
			for (local685 = arg0 - 1; local685 >= 0; local685--) {
				if (local632 >> 1 <= local685) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(731) int local731;
		for (local685 = arg0 - 1; local685 >= 0; local685--) {
			for (local731 = arg0 - 1; local731 >= 0; local731--) {
				if (local731 <= local685 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(775) int local775;
		for (local731 = arg0 - 1; local731 >= 0; local731--) {
			for (local775 = arg0 - 1; local775 >= 0; local775--) {
				if (local731 >> 1 <= local775) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(817) int local817;
		for (local775 = arg0 - 1; local775 >= 0; local775--) {
			for (local817 = 0; local817 < arg0; local817++) {
				if (local817 <= local775 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(863) int local863;
		for (local817 = 0; local817 < arg0; local817++) {
			for (local863 = 0; local863 < arg0; local863++) {
				if (local863 >= local817 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(908) int local908;
		for (local863 = 0; local863 < arg0; local863++) {
			for (local908 = arg0 - 1; local908 >= 0; local908--) {
				if (local908 <= local863 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(957) int local957;
		for (local908 = 0; local908 < arg0; local908++) {
			for (local957 = 0; local957 < arg0; local957++) {
				if (arg0 / 2 >= local957) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1004) int local1004;
		for (local957 = 0; local957 < arg0; local957++) {
			for (local1004 = 0; local1004 < arg0; local1004++) {
				if (local957 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1043) int local1043;
		for (local1004 = 0; local1004 < arg0; local1004++) {
			for (local1043 = 0; local1043 < arg0; local1043++) {
				if (arg0 / 2 <= local1043) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1082) int local1082;
		for (local1043 = 0; local1043 < arg0; local1043++) {
			for (local1082 = 0; local1082 < arg0; local1082++) {
				if (arg0 / 2 <= local1043) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1121) int local1121;
		for (local1082 = 0; local1082 < arg0; local1082++) {
			for (local1121 = 0; local1121 < arg0; local1121++) {
				if (local1121 <= local1082 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1165) int local1165;
		for (local1121 = arg0 - 1; local1121 >= 0; local1121--) {
			for (local1165 = 0; local1165 < arg0; local1165++) {
				if (local1121 - arg0 / 2 >= local1165) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1221) int local1221;
		for (local1165 = arg0 - 1; local1165 >= 0; local1165--) {
			for (local1221 = arg0 - 1; local1221 >= 0; local1221--) {
				if (local1221 <= local1165 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1265) int local1265;
		for (local1221 = 0; local1221 < arg0; local1221++) {
			for (local1265 = arg0 - 1; local1265 >= 0; local1265--) {
				if (local1221 - arg0 / 2 >= local1265) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1309) int local1309;
		for (local1265 = 0; local1265 < arg0; local1265++) {
			for (local1309 = 0; local1309 < arg0; local1309++) {
				if (local1309 >= local1265 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1365) int local1365;
		for (local1309 = arg0 - 1; local1309 >= 0; local1309--) {
			for (local1365 = 0; local1365 < arg0; local1365++) {
				if (local1309 - arg0 / 2 <= local1365) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1414) int local1414;
		for (local1365 = arg0 - 1; local1365 >= 0; local1365--) {
			for (local1414 = arg0 - 1; local1414 >= 0; local1414--) {
				if (local1365 - arg0 / 2 <= local1414) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1414 = 0; local1414 < arg0; local1414++) {
			for (@Pc(1460) int local1460 = arg0 - 1; local1460 >= 0; local1460--) {
				if (local1460 >= local1414 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Lclient!vl;")
	public static Class4_Sub1 method3661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class113 local7 = Static176.aClass113ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_2;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBI)V")
	public static void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static399.aClass167_Sub1_1.anInt5568 >> 8;
		if (arg2 == -1 && !Static256.aBoolean398) {
			Static251.method3862();
		} else if (arg2 != -1 && (arg2 != Static378.anInt6716 || !Static204.method3164()) && local6 != 0 && !Static256.aBoolean398) {
			Static175.method2758(local6, arg0, arg2, Static329.aClass188_90);
		}
		Static378.anInt6716 = arg2;
	}
}
