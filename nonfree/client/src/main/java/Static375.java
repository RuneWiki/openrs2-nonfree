import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
	public static int anInt8461;

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	public static int anInt8464 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!av;ZI)V")
	public static void method7393(@OriginalArg(0) Class20_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static197.anInt4015 >= 400) {
			return;
		}
		if (Static107.aClass20_Sub1_Sub1_Sub1_1 != arg0) {
			@Pc(184) String local184;
			@Pc(112) int local112;
			if (arg0.anInt675 == 0) {
				@Pc(65) boolean local65 = true;
				if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt676 != -1 && arg0.anInt676 != -1) {
					@Pc(90) int local90 = arg0.anInt668 >= Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668 ? arg0.anInt668 : Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668;
					@Pc(101) int local101 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt676 >= arg0.anInt676 ? arg0.anInt676 : Static107.aClass20_Sub1_Sub1_Sub1_1.anInt676;
					local112 = local90 * 10 / 100 + local101 + 5;
					@Pc(119) int local119 = Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668 - arg0.anInt668;
					if (local119 < 0) {
						local119 = -local119;
					}
					if (local112 < local119) {
						local65 = false;
					}
				}
				@Pc(149) String local149 = Static116.aClass250_2 == Static332.aClass250_4 ? Static219.aClass45_63.method1474(Static544.anInt7853) : Static299.aClass45_90.method1474(Static544.anInt7853);
				if (arg0.anInt668 >= arg0.anInt682) {
					local184 = arg0.method724() + (local65 ? Static338.method3568(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668, arg0.anInt668) : "<col=ffffff>") + " (" + local149 + arg0.anInt668 + ")";
				} else {
					local184 = arg0.method724() + (local65 ? Static338.method3568(Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668, arg0.anInt668) : "<col=ffffff>") + " (" + local149 + arg0.anInt668 + "+" + (arg0.anInt682 - arg0.anInt668) + ")";
				}
			} else {
				local184 = arg0.method724() + " (" + Static38.aClass45_20.method1474(Static544.anInt7853) + arg0.anInt675 + ")";
			}
			if (Static181.aBoolean310) {
				if (!arg1 && (Static59.anInt1479 & 0x8) != 0) {
					Static18.method539(10, true, 0, Static266.anInt5103, 0, Static201.aString84 + " -> <col=ffffff>" + local184, Static151.aString116, (long) arg0.anInt8969, false, -1);
				}
			} else if (arg1) {
				Static18.method539(-1, false, 0, -1, 0, "", "<col=cccccc>" + local184, 0L, true, 0);
			} else {
				for (@Pc(255) int local255 = 7; local255 >= 0; local255--) {
					if (Static74.aStringArray8[local255] != null) {
						@Pc(263) short local263 = 0;
						if (Static332.aClass250_4 == Static71.aClass250_1 && Static74.aStringArray8[local255].equalsIgnoreCase(Static215.aClass45_61.method1474(Static544.anInt7853))) {
							if (arg0.anInt668 > Static107.aClass20_Sub1_Sub1_Sub1_1.anInt668) {
								local263 = 2000;
							}
							if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt662 != 0 && arg0.anInt662 != 0) {
								if (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt662 == arg0.anInt662) {
									local263 = 2000;
								} else {
									local263 = 0;
								}
							}
						} else if (Static142.aBooleanArray5[local255]) {
							local263 = 2000;
						}
						@Pc(324) short local324 = (short) (local263 + Static406.aShortArray112[local255]);
						local112 = Static200.anIntArray315[local255] == -1 ? Static92.anInt2926 : Static200.anIntArray315[local255];
						Static18.method539(local324, true, 0, local112, 0, "<col=ffffff>" + local184, Static74.aStringArray8[local255], (long) arg0.anInt8969, false, -1);
					}
				}
			}
			if (!arg1) {
				for (@Pc(432) Class1_Sub25 local432 = (Class1_Sub25) Static105.aClass295_10.method7543(); local432 != null; local432 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
					if (local432.anInt4365 == 11) {
						local432.aString95 = "<col=ffffff>" + local184;
						return;
					}
				}
			}
		} else if (Static181.aBoolean310 && (Static59.anInt1479 & 0x10) != 0) {
			Static18.method539(58, true, 0, Static266.anInt5103, 0, Static201.aString84 + " -> <col=ffffff>" + Static49.aClass45_26.method1474(Static544.anInt7853), Static151.aString116, 0L, false, -1);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!qa;Lclient!wt;Lclient!di;I)Z")
	public static boolean method7394(@OriginalArg(2) Class4 arg0, @OriginalArg(3) Class1_Sub51 arg1, @OriginalArg(4) Class65 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray125 != null) {
			local13 = Static335.anInt4945 - (Static335.anInt4945 - Static335.anInt4942) * (-Static335.anInt4934 + arg1.anInt9569 + arg2.anInt1910) / (Static335.anInt4936 - Static335.anInt4934);
			local11 = Static335.anInt4945 - (arg1.anInt9569 + arg2.anInt1900 - Static335.anInt4934) * (Static335.anInt4945 + -Static335.anInt4942) / (Static335.anInt4936 - Static335.anInt4934);
			local7 = Static335.anInt4944 + (arg2.anInt1891 + arg1.anInt9571 - Static335.anInt4939) * (Static335.anInt4937 - Static335.anInt4944) / (Static335.anInt4940 - Static335.anInt4939);
			local9 = (Static335.anInt4937 - Static335.anInt4944) * (arg1.anInt9571 + arg2.anInt1899 - Static335.anInt4939) / (Static335.anInt4940 - Static335.anInt4939) + Static335.anInt4944;
		}
		@Pc(99) Class104 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (arg2.anInt1903 != -1) {
			if (arg1.aBoolean709 && arg2.anInt1922 != -1) {
				local99 = arg2.method1823(arg0, true);
			} else {
				local99 = arg2.method1823(arg0, false);
			}
			if (local99 != null) {
				local101 = arg1.anInt9567 - (local99.EA() + 1 >> 1);
				local103 = arg1.anInt9567 + (local99.EA() + 1 >> 1);
				if (local101 < local7) {
					local7 = local101;
				}
				if (local9 < local103) {
					local9 = local103;
				}
				local105 = arg1.anInt9570 - (local99.ma() + 1 >> 1);
				if (local105 < local11) {
					local11 = local105;
				}
				local107 = arg1.anInt9570 + (local99.ma() + 1 >> 1);
				if (local13 < local107) {
					local13 = local107;
				}
			}
		}
		@Pc(204) Class66 local204 = null;
		@Pc(206) int local206 = 0;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(268) int local268;
		@Pc(291) int local291;
		if (arg2.aString37 != null) {
			local204 = Static228.method4100(arg2.anInt1920);
			if (local204 != null) {
				local206 = Static379.aClass96_12.method2371(arg2.aString37, Static513.aStringArray37, null, null);
				local208 = arg1.anInt9570;
				if (local99 == null) {
					local208 -= local204.method1829() * local206 / 2;
				} else {
					local208 -= (local99.ma() >> 1) + (local204.method1827() * local206);
				}
				for (local268 = 0; local268 < local206; local268++) {
					@Pc(274) String local274 = Static513.aStringArray37[local268];
					if (local268 < local206 - 1) {
						local274 = local274.substring(0, local274.length() - 4);
					}
					local291 = local204.method1833(local274);
					if (local291 > local210) {
						local210 = local291;
					}
				}
				local212 = arg1.anInt9567 - local210 / 2;
				local214 = local210 / 2 + arg1.anInt9567;
				if (local212 < local7) {
					local7 = local212;
				}
				if (local214 > local9) {
					local9 = local214;
				}
				local216 = local208;
				local218 = local208 + local204.method1827() * local206;
				if (local11 > local216) {
					local11 = local216;
				}
				if (local13 < local218) {
					local13 = local218;
				}
			}
		}
		if (Static335.anInt4944 > local9 || local7 > Static335.anInt4937 || local13 < Static335.anInt4942 || local11 > Static335.anInt4945) {
			return true;
		}
		@Pc(403) int local403;
		if (arg2.anIntArray125 != null) {
			@Pc(401) int[] local401 = new int[arg2.anIntArray125.length];
			for (local403 = 0; local403 < local401.length / 2; local403++) {
				local291 = arg1.anInt9571 + arg2.anIntArray125[local403 * 2];
				@Pc(427) int local427 = arg1.anInt9569 + arg2.anIntArray125[local403 * 2 + 1];
				local401[local403 * 2] = Static335.anInt4944 + (local291 - Static335.anInt4939) * (Static335.anInt4937 + -Static335.anInt4944) / (Static335.anInt4940 - Static335.anInt4939);
				local401[local403 * 2 + 1] = Static335.anInt4945 - (Static335.anInt4945 - Static335.anInt4942) * (local427 - Static335.anInt4934) / (Static335.anInt4936 - Static335.anInt4934);
			}
			Static182.method3542(arg0, local401, arg2.anInt1907);
			for (local291 = 0; local291 < local401.length / 2 - 1; local291++) {
				arg0.method7194(local401[local291 * 2], arg2.anInt1895, local401[(local291 + 1) * 2], local401[(local291 + 1) * 2 + 1], local401[local291 * 2 + 1]);
			}
			arg0.method7194(local401[local401.length - 2], arg2.anInt1895, local401[0], local401[1], local401[local401.length - 1]);
		}
		if (local99 != null) {
			if (Static360.anInt6507 > 0 && (Static39.anInt1113 != -1 && arg1.anInt9566 == Static39.anInt1113 || Static9.anInt229 != -1 && arg2.anInt1915 == Static9.anInt229)) {
				if (Static486.anInt8594 > 50) {
					local268 = 200 - Static486.anInt8594 * 2;
				} else {
					local268 = Static486.anInt8594 * 2;
				}
				local403 = local268 << 24 | 0xFFFF00;
				arg0.method7155(arg1.anInt9567, arg1.anInt9570, local403, local99.c() / 2 + 7);
				arg0.method7155(arg1.anInt9567, arg1.anInt9570, local403, local99.c() / 2 + 5);
				arg0.method7155(arg1.anInt9567, arg1.anInt9570, local403, local99.c() / 2 + 3);
				arg0.method7155(arg1.anInt9567, arg1.anInt9570, local403, local99.c() / 2 + 1);
				arg0.method7155(arg1.anInt9567, arg1.anInt9570, local403, local99.c() / 2);
			}
			local99.method7716(arg1.anInt9567 - (local99.EA() >> 1), arg1.anInt9570 + -(local99.ma() >> 1));
		}
		if (arg2.aString37 != null && local204 != null) {
			Static537.method8135(arg2, arg0, local210, local206, local208, local204, arg1);
		}
		if (arg2.anInt1903 != -1 || arg2.aString37 != null) {
			@Pc(717) Class1_Sub6 local717 = new Class1_Sub6(arg1);
			local717.anInt1404 = local216;
			local717.anInt1401 = local218;
			local717.anInt1408 = local214;
			local717.anInt1400 = local103;
			local717.anInt1403 = local107;
			local717.anInt1407 = local212;
			local717.anInt1406 = local105;
			local717.anInt1405 = local101;
			Static18.aClass295_4.method7533(local717);
		}
		return false;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)Z")
	public static boolean method7395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}
