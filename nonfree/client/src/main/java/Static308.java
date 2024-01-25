import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_166 = new Class272(14, 2);

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "Lclient!sk;")
	public static final Class309 aClass309_9 = new Class309();

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method4826(@OriginalArg(1) int arg0) {
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
		@Pc(152) int local152;
		for (local109 = arg0 - 1; local109 >= 0; local109--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local109 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(197) int local197;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local152 >> 1 >= local197) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(239) int local239;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local239 = 0; local239 < arg0; local239++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local197 << 1 <= local239) {
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
		@Pc(293) int local293;
		for (local239 = 0; local239 < arg0; local239++) {
			for (local293 = arg0 - 1; local293 >= 0; local293--) {
				if (local239 >> 1 >= local293) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(342) int local342;
		for (local293 = arg0 - 1; local293 >= 0; local293--) {
			for (local342 = arg0 - 1; local342 >= 0; local342--) {
				if (local293 << 1 <= local342) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(386) int local386;
		for (local342 = arg0 - 1; local342 >= 0; local342--) {
			for (local386 = arg0 - 1; local386 >= 0; local386--) {
				if (local386 <= local342 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(432) int local432;
		for (local386 = arg0 - 1; local386 >= 0; local386--) {
			for (local432 = 0; local432 < arg0; local432++) {
				if (local386 << 1 <= local432) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(478) int local478;
		for (local432 = 0; local432 < arg0; local432++) {
			for (local478 = 0; local478 < arg0; local478++) {
				if (local432 >> 1 >= local478) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(519) int local519;
		for (local478 = 0; local478 < arg0; local478++) {
			for (local519 = arg0 - 1; local519 >= 0; local519--) {
				if (local519 >= local478 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(563) int local563;
		for (local519 = arg0 - 1; local519 >= 0; local519--) {
			for (local563 = 0; local563 < arg0; local563++) {
				if (local519 >> 1 <= local563) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(609) int local609;
		for (local563 = 0; local563 < arg0; local563++) {
			for (local609 = 0; local609 < arg0; local609++) {
				if (local563 << 1 >= local609) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(654) int local654;
		for (local609 = 0; local609 < arg0; local609++) {
			for (local654 = arg0 - 1; local654 >= 0; local654--) {
				if (local654 >= local609 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(703) int local703;
		for (local654 = arg0 - 1; local654 >= 0; local654--) {
			for (local703 = arg0 - 1; local703 >= 0; local703--) {
				if (local703 <= local654 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(751) int local751;
		for (local703 = arg0 - 1; local703 >= 0; local703--) {
			for (local751 = arg0 - 1; local751 >= 0; local751--) {
				if (local703 >> 1 <= local751) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(797) int local797;
		for (local751 = arg0 - 1; local751 >= 0; local751--) {
			for (local797 = 0; local797 < arg0; local797++) {
				if (local751 << 1 >= local797) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(842) int local842;
		for (local797 = 0; local797 < arg0; local797++) {
			for (local842 = 0; local842 < arg0; local842++) {
				if (local842 >= local797 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(883) int local883;
		for (local842 = 0; local842 < arg0; local842++) {
			for (local883 = arg0 - 1; local883 >= 0; local883--) {
				if (local842 << 1 >= local883) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(932) int local932;
		for (local883 = 0; local883 < arg0; local883++) {
			for (local932 = 0; local932 < arg0; local932++) {
				if (local932 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(975) int local975;
		for (local932 = 0; local932 < arg0; local932++) {
			for (local975 = 0; local975 < arg0; local975++) {
				if (local932 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1014) int local1014;
		for (local975 = 0; local975 < arg0; local975++) {
			for (local1014 = 0; local1014 < arg0; local1014++) {
				if (local1014 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1057) int local1057;
		for (local1014 = 0; local1014 < arg0; local1014++) {
			for (local1057 = 0; local1057 < arg0; local1057++) {
				if (local1014 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1101) int local1101;
		for (local1057 = 0; local1057 < arg0; local1057++) {
			for (local1101 = 0; local1101 < arg0; local1101++) {
				if (local1101 <= local1057 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1153) int local1153;
		for (local1101 = arg0 - 1; local1101 >= 0; local1101--) {
			for (local1153 = 0; local1153 < arg0; local1153++) {
				if (local1101 - arg0 / 2 >= local1153) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1209) int local1209;
		for (local1153 = arg0 - 1; local1153 >= 0; local1153--) {
			for (local1209 = arg0 - 1; local1209 >= 0; local1209--) {
				if (local1153 - arg0 / 2 >= local1209) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1253) int local1253;
		for (local1209 = 0; local1209 < arg0; local1209++) {
			for (local1253 = arg0 - 1; local1253 >= 0; local1253--) {
				if (local1209 - arg0 / 2 >= local1253) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1298) int local1298;
		for (local1253 = 0; local1253 < arg0; local1253++) {
			for (local1298 = 0; local1298 < arg0; local1298++) {
				if (local1253 - arg0 / 2 <= local1298) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1354) int local1354;
		for (local1298 = arg0 - 1; local1298 >= 0; local1298--) {
			for (local1354 = 0; local1354 < arg0; local1354++) {
				if (local1298 - arg0 / 2 <= local1354) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1406) int local1406;
		for (local1354 = arg0 - 1; local1354 >= 0; local1354--) {
			for (local1406 = arg0 - 1; local1406 >= 0; local1406--) {
				if (local1406 >= local1354 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1406 = 0; local1406 < arg0; local1406++) {
			for (@Pc(1454) int local1454 = arg0 - 1; local1454 >= 0; local1454--) {
				if (local1406 - arg0 / 2 <= local1454) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V")
	public static void method4827(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg2; local58++) {
			if ((long) (local56 & local58) + local24 > arg0[local58]) {
				@Pc(79) long local79 = arg0[local58];
				arg0[local58] = arg0[local20];
				arg0[local20] = local79;
				@Pc(93) Object local93 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20++] = local93;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg3[arg2] = arg3[local20];
		arg3[local20] = local38;
		method4827(arg0, arg1, local20 - 1, arg3);
		method4827(arg0, local20 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBLclient!fa;Lclient!r;II)V")
	public static void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface8 arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static277.anInt5091 < 100) {
			Static508.method6811(arg3, arg2);
		}
		arg3.da(arg4, arg5, arg4 + arg0, arg1 + arg5);
		@Pc(35) int local35;
		@Pc(47) int local47;
		if (Static277.anInt5091 < 100) {
			local35 = arg4 + arg0 / 2;
			local47 = arg5 + arg1 / 2 - 18 - 20;
			arg3.J(arg4, arg5, arg0, arg1, -16777216, 0);
			arg3.method7170(local35 - 152, local47, 304, 34, Static122.aColorArray1[Static250.anInt4577].getRGB(), 0);
			arg3.J(local35 - 150, local47 + 2, Static277.anInt5091 * 3, 30, Static359.aColorArray3[Static250.anInt4577].getRGB(), 0);
			Static480.aClass117_9.method7655(local47 + 20, -1, local35, Static48.aClass33_20.method797(Static131.anInt2839), Static122.aColorArray2[Static250.anInt4577].getRGB());
			return;
		}
		@Pc(113) int local113 = Static319.anInt5778 - (int) ((float) arg0 / Static284.aFloat160);
		local35 = (int) ((float) arg1 / Static284.aFloat160) + Static236.anInt4460;
		local47 = (int) ((float) arg0 / Static284.aFloat160) + Static319.anInt5778;
		Static430.anInt7144 = Static319.anInt5778 - (int) ((float) arg0 / Static284.aFloat160);
		Static483.anInt7807 = Static236.anInt4460 - (int) ((float) arg1 / Static284.aFloat160);
		@Pc(156) int local156 = Static236.anInt4460 - (int) ((float) arg1 / Static284.aFloat160);
		Static474.anInt7706 = (int) ((float) (arg1 * 2) / Static284.aFloat160);
		Static592.anInt9396 = (int) ((float) (arg0 * 2) / Static284.aFloat160);
		Static284.method6645(Static284.anInt7863 + local113, Static284.anInt7865 + local35, local47 + Static284.anInt7863, Static284.anInt7865 + local156, arg4, arg5, arg4 + arg0, arg1 + 1 + arg5);
		Static284.method6644(arg3);
		@Pc(201) Class130 local201 = Static284.method6632(arg3);
		Static433.method6086(arg3, local201);
		if (Static440.anInt4098 > 0) {
			Static474.anInt7705--;
			if (Static474.anInt7705 == 0) {
				Static440.anInt4098--;
				Static474.anInt7705 = 20;
			}
		}
		if (!Static537.aBoolean334) {
			return;
		}
		@Pc(229) int local229 = arg0 + arg4 - 5;
		@Pc(236) int local236 = arg5 + arg1 - 8;
		Static49.aClass117_1.method7659(16776960, local229, -1, "Fps:" + Static306.anInt5563, local236);
		@Pc(251) int local251 = local236 - 15;
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(265) int local265 = 16776960;
		if (local263 > 65536) {
			local265 = 16711680;
		}
		Static49.aClass117_1.method7659(local265, local229, -1, "Mem:" + local263 + "k", local251);
		local236 = local251 - 15;
	}
}
