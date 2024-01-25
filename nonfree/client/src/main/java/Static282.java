import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "Lclient!cd;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray15;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!ml;")
	public static final Class223 aClass223_9 = new Class223("", 17);

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	public static int anInt4895 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B[II[[[BI[II[III[IIZZ[IIII)V")
	public static void method4520(@OriginalArg(0) byte arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(17) int arg15) {
		if (Static76.anInt1404 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static316.aClass13_10.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static76.anInt1404 == 1) {
			local31 = (int) ((double) Static519.anInt8360 * (double) local25 / (double) Static454.anInt5692);
			local33 = (int) ((double) Static519.anInt8360 * (double) local29 / (double) Static454.anInt5692);
		}
		if (!Static27.aBoolean42) {
			if (Static76.anInt1404 == 1) {
				Static599.method8395();
			}
			@Pc(67) int local67 = arg15 - Static618.anInt9905;
			@Pc(72) int local72 = arg2 - Static201.anInt3955;
			@Pc(76) int local76 = arg4 - Static283.anInt4899;
			@Pc(98) int local98 = (int) ((Static45.aDouble3 * (double) local72 + (double) local67 * Static255.aDouble10 + Static207.aDouble6 * (double) local76) * (double) local31 / (double) arg6);
			@Pc(120) int local120 = (int) ((double) local33 * (Static596.aDouble31 * (double) local67 + Static269.aDouble11 * (double) local72 + Static488.aDouble26 * (double) local76) / (double) arg6);
			@Pc(135) double local135 = (double) local67 * Static467.aDouble23 + Static575.aDouble30 * (double) local72 + Static323.aDouble9 * (double) local76;
			@Pc(142) int local142 = local98 + Static489.anInt8083 - Static212.anInt9676;
			@Pc(149) int local149 = Static609.anInt9830 + local120 - Static142.anInt2870;
			@Pc(153) int local153 = local142 + Static617.anInt9892;
			@Pc(157) int local157 = Static519.anInt8360 + local149;
			if (local142 >= 0 && local149 >= 0 && local153 <= Static561.anInt9112 && local157 <= Static454.anInt5692 || Static76.anInt1404 == 2) {
				Static125.anInt2572 = local142;
				Static485.anInt8031 = local149;
				if (Static76.anInt1404 == 2) {
					Static354.aDouble12 = -local135;
				}
			} else if (local153 > 0 && local157 > 0 && local142 < Static561.anInt9112 && local149 < Static454.anInt5692) {
				@Pc(230) int local230 = local142 - Static489.anInt8083;
				@Pc(235) int local235 = local149 - Static609.anInt9830;
				@Pc(237) int local237 = 0;
				@Pc(239) int local239 = 0;
				@Pc(241) int local241 = 0;
				@Pc(243) int local243 = 0;
				@Pc(245) double local245 = 0.0D;
				if (Static76.anInt1404 == 0) {
					local245 = Static354.aDouble12 + local135;
					local237 = local230;
					local239 = local235;
				} else if (Static76.anInt1404 == 1) {
					local241 = local230 / Static336.anInt5533;
					local243 = local235 / Static9.anInt105;
					local239 = local243 * Static9.anInt105;
					local237 = Static336.anInt5533 * local241;
					local245 = (Static354.aDouble12 + local135) * (double) (local237 * local230 + local239 * local235) / (double) (local230 * local230 + local235 * local235);
				}
				local245 = -local245;
				@Pc(305) int local305 = 0;
				@Pc(307) int local307 = 0;
				@Pc(309) int local309 = 0;
				@Pc(311) int local311 = 0;
				@Pc(313) int local313 = 0;
				@Pc(315) int local315 = 0;
				@Pc(319) int local319;
				@Pc(324) int local324;
				@Pc(340) int local340;
				@Pc(338) int local338;
				if (local237 >= 0) {
					local319 = 0;
					local324 = Static561.anInt9112 - local237;
					if (Static76.anInt1404 == 1) {
						local313 = local241;
						local309 = Static153.anInt3033 - local241;
					}
					local338 = local237;
					local340 = local324;
				} else {
					local324 = Static561.anInt9112 + local237;
					local340 = 0;
					local319 = -local237;
					if (Static76.anInt1404 == 1) {
						local313 = -local241;
						local309 = 0;
					}
					local338 = local319;
				}
				@Pc(371) int local371;
				@Pc(369) int local369;
				@Pc(393) int local393;
				@Pc(391) int local391;
				@Pc(373) int local373;
				if (local239 >= 0) {
					local369 = Static454.anInt5692 - local239;
					local371 = 0;
					local373 = 0;
					if (Static76.anInt1404 == 1) {
						local311 = 0;
						local305 = Static37.anInt839 - local243;
						local307 = local243;
						local315 = local305;
					}
					local391 = local239;
					local393 = local369;
				} else {
					local393 = 0;
					local369 = local239 + Static454.anInt5692;
					local371 = -local239;
					local391 = local371;
					if (Static76.anInt1404 == 1) {
						local307 = -local243;
						local305 = 0;
						local315 = Static37.anInt839 + local243;
						local311 = local307;
					}
					local373 = local371;
				}
				@Pc(430) Class371 local430 = Static24.aClass321_1.aClass371_7;
				@Pc(444) int local444;
				for (@Pc(435) Class28_Sub3 local435 = (Class28_Sub3) local430.method8911(); local435 != null; local435 = (Class28_Sub3) local430.method8917()) {
					@Pc(440) Class28_Sub8[] local440 = local435.aClass28_Sub8Array1;
					@Pc(442) boolean local442 = true;
					for (local444 = 0; local444 < local440.length; local444++) {
						@Pc(450) Class28_Sub8 local450 = local440[local444];
						@Pc(453) int local453 = local450.anInt9151;
						@Pc(456) int local456 = local450.anInt9152;
						@Pc(459) int local459 = local450.anInt9153;
						@Pc(462) int local462 = local450.anInt9150;
						@Pc(468) int local468;
						local450.anInt9151 = local468 = local453 - local237;
						@Pc(472) int local472 = local450.anInt9149;
						@Pc(479) int local479;
						local450.anInt9152 = local479 = local456 - local239;
						@Pc(487) int local487;
						local450.anInt9153 = local487 = local459 - local237;
						@Pc(494) int local494;
						local450.anInt9150 = local494 = local462 - local239;
						if (local442) {
							@Pc(506) int local506 = (local468 < local487 ? local468 : local487) - local472;
							if (Static561.anInt9112 >= local506) {
								@Pc(523) int local523 = (local494 <= local479 ? local494 : local479) - local472;
								if (local523 <= Static454.anInt5692) {
									@Pc(539) int local539 = (local487 <= local468 ? local468 : local487) + local472;
									if (local539 >= 0) {
										@Pc(553) int local553 = (local494 <= local479 ? local479 : local494) + local472;
										if (local553 >= 0) {
											local442 = false;
										}
									}
								}
							}
						}
					}
					if (local442) {
						local435.method9276();
						Static519.method7297(local435);
					}
				}
				if (Static76.anInt1404 == 0) {
					Static316.aClass13_10.method8519(Static163.anInterface26_1);
				}
				Static316.aClass13_10.F(-local237, -local239);
				Static316.aClass13_10.b(local319, local371, local324, local369, local245);
				Static341.method5109(Static354.aDouble12 + local245);
				Static160.aDouble5 = local245 + Static354.aDouble12;
				if (Static76.anInt1404 == 1) {
					Static503.anInt8161 = local33;
					Static97.anInt642 = local31;
					Static173.anInt3444 = local21 - Static142.anInt2870 - local239;
					Static31.anInt617 = local17 - Static212.anInt9676 - local237;
					Static316.aClass13_10.DA(Static31.anInt617, Static173.anInt3444, Static97.anInt642, Static503.anInt8161);
				} else {
					Static503.anInt8161 = local33;
					Static31.anInt617 = Static489.anInt8083 + local17 - Static212.anInt9676 - local237;
					Static173.anInt3444 = local21 + Static609.anInt9830 - Static142.anInt2870 - local239;
					Static97.anInt642 = local31;
					Static316.aClass13_10.DA(Static31.anInt617, Static173.anInt3444, Static97.anInt642, Static503.anInt8161);
				}
				Static670.method8253(Static24.aClass321_1);
				if (local391 > 0) {
					Static316.aClass13_10.KA(0, local393, Static561.anInt9112, local391 + local393);
					Static316.aClass13_10.ya();
					Static316.aClass13_10.GA(Static107.anInt2222);
					Static169.method3082(arg11, arg15, arg2, arg4, arg3, arg5, arg13, arg10, arg1, arg7, arg8, arg0, arg9, arg14, arg12, arg6, 1, false);
				}
				if (local338 > 0) {
					Static316.aClass13_10.KA(local340, local373, local338 + local340, local373 - -local369);
					Static316.aClass13_10.ya();
					Static316.aClass13_10.GA(Static107.anInt2222);
					Static169.method3082(arg11, arg15, arg2, arg4, arg3, arg5, arg13, arg10, arg1, arg7, arg8, arg0, arg9, arg14, arg12, arg6, 1, false);
				}
				Static316.aClass13_10.la();
				Static456.method8149();
				if (Static76.anInt1404 == 0) {
					Static316.aClass13_10.method8490();
				}
				Static212.anInt9676 += local237;
				Static142.anInt2870 += local239;
				Static354.aDouble12 += local245;
				Static485.anInt8031 = local120 + Static609.anInt9830 - Static142.anInt2870;
				Static125.anInt2572 = Static489.anInt8083 + local98 - Static212.anInt9676;
				if (Static76.anInt1404 == 1) {
					Static218.anInt4139 += local243;
					Static146.anInt2953 += local241;
					for (@Pc(791) int local791 = 0; local791 < Static37.anInt839; local791++) {
						@Pc(802) int local802 = Static431.method6190(Static37.anInt839, Static218.anInt4139 + local791) * Static153.anInt3033;
						for (local444 = 0; local444 < Static153.anInt3033; local444++) {
							@Pc(816) int local816 = local802 + Static431.method6190(Static153.anInt3033, local444 + Static146.anInt2953);
							@Pc(857) boolean local857 = local305 <= local791 && local791 < local307 + local305 || local791 >= local311 && local791 < local315 + local311 && local444 >= local309 && local309 + local313 > local444;
							Static534.anInterface26Array1[local816].method9016(local444 * Static336.anInt5533, Static9.anInt105 * local791, Static336.anInt5533, Static9.anInt105, local857);
						}
					}
				}
			} else {
				Static27.aBoolean42 = true;
			}
		}
		if (Static27.aBoolean42) {
			Static618.anInt9905 = arg15;
			Static212.anInt9676 = 0;
			Static354.aDouble12 = 0.0D;
			Static283.anInt4899 = arg4;
			Static142.anInt2870 = 0;
			Static201.anInt3955 = arg2;
			Static125.anInt2572 = Static489.anInt8083;
			Static485.anInt8031 = Static609.anInt9830;
			if (Static76.anInt1404 == 0) {
				Static316.aClass13_10.method8519(Static163.anInterface26_1);
			}
			Static316.aClass13_10.la();
			Static316.aClass13_10.ya();
			Static316.aClass13_10.GA(Static107.anInt2222);
			Static300.aClass239_4.method9237(Static618.anInt9905, Static201.anInt3955, Static283.anInt4899, Static523.anInt8394, Static566.anInt9181, Static458.anInt7577);
			Static316.aClass13_10.method8501(Static300.aClass239_4);
			if (Static76.anInt1404 == 1) {
				Static503.anInt8161 = local33;
				Static97.anInt642 = local31;
				Static173.anInt3444 = local21;
				Static31.anInt617 = local17;
				Static316.aClass13_10.DA(Static31.anInt617, Static173.anInt3444, Static97.anInt642, Static503.anInt8161);
			} else {
				Static173.anInt3444 = local21 + Static609.anInt9830;
				Static503.anInt8161 = local33;
				Static31.anInt617 = Static489.anInt8083 + local17;
				Static97.anInt642 = local31;
				Static316.aClass13_10.DA(Static31.anInt617, Static173.anInt3444, Static97.anInt642, Static503.anInt8161);
			}
			Static160.aDouble5 = 0.0D;
			Static24.aClass321_1.method7867();
			Static670.method8253(Static24.aClass321_1);
			Static169.method3082(arg11, arg15, arg2, arg4, arg3, arg5, arg13, arg10, arg1, arg7, arg8, arg0, arg9, arg14, arg12, arg6, 1, false);
			Static456.method8149();
			Static27.aBoolean42 = false;
			if (Static76.anInt1404 == 0) {
				Static316.aClass13_10.method8490();
			}
			if (Static76.anInt1404 == 1) {
				Static583.method8204();
			}
		}
		if (Static76.anInt1404 == 0) {
			Static163.anInterface26_1.method9017(Static125.anInt2572, Static485.anInt8031, Static617.anInt9892, Static519.anInt8360, 0, 0);
		}
		Static677.anInt10887++;
		Static341.method5109(Static354.aDouble12);
		Static433.aDouble27 = Static354.aDouble12;
		if (Static76.anInt1404 == 0 || Static76.anInt1404 == 2) {
			if (Static76.anInt1404 == 2) {
				Static316.aClass13_10.GA(Static107.anInt2222);
				Static316.aClass13_10.ya();
			}
			Static18.anInt438 = local17 + Static489.anInt8083 - Static125.anInt2572 - Static212.anInt9676;
			Static498.anInt10144 = Static609.anInt9830 + local21 - Static485.anInt8031 - Static142.anInt2870;
			Static519.anInt8358 = local31;
			Static372.anInt5975 = local33;
			Static316.aClass13_10.DA(Static18.anInt438, Static498.anInt10144, Static519.anInt8358, Static372.anInt5975);
		} else if (Static76.anInt1404 == 1) {
			Static519.anInt8358 = local31;
			Static498.anInt10144 = local21 - Static142.anInt2870;
			Static18.anInt438 = local17 - Static212.anInt9676;
			Static372.anInt5975 = local33;
			Static316.aClass13_10.DA(Static18.anInt438, Static498.anInt10144, Static519.anInt8358, Static372.anInt5975);
			Static316.aClass13_10.KA(Static125.anInt2572, Static485.anInt8031, Static617.anInt9892 + Static125.anInt2572, Static519.anInt8360 + Static485.anInt8031);
		}
		Static169.method3082(arg11, arg15, arg2, arg4, arg3, arg5, arg13, arg10, arg1, arg7, arg8, arg0, arg9, arg14, arg12, arg6, Static76.anInt1404 == 2 ? 0 : 2, Static76.anInt1404 == 1);
		Static316.aClass13_10.la();
		Static316.aClass13_10.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)I")
	public static int method4521(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(15) int local15 = local4 | local4 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!fg;I)V")
	public static void method4523(@OriginalArg(0) Class3_Sub23 arg0) {
		if (Static15.aClass164ArrayArrayArray5 == null) {
			return;
		}
		@Pc(15) Interface11 local15 = null;
		if (arg0.anInt3184 == 0) {
			local15 = (Interface11) Static583.method8200(arg0.anInt3177, arg0.anInt3189, arg0.anInt3188);
		}
		if (arg0.anInt3184 == 1) {
			local15 = (Interface11) Static358.method5269(arg0.anInt3177, arg0.anInt3189, arg0.anInt3188);
		}
		if (arg0.anInt3184 == 2) {
			local15 = (Interface11) Static318.method4861(arg0.anInt3177, arg0.anInt3189, arg0.anInt3188, he.class);
		}
		if (arg0.anInt3184 == 3) {
			local15 = (Interface11) Static280.method4469(arg0.anInt3177, arg0.anInt3189, arg0.anInt3188);
		}
		if (local15 == null) {
			arg0.anInt3178 = 0;
			arg0.anInt3183 = -1;
			arg0.anInt3182 = 0;
		} else {
			arg0.anInt3183 = local15.method9221();
			arg0.anInt3182 = local15.method9216();
			arg0.anInt3178 = local15.method9217();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!sw;)I")
	public static int method4524(@OriginalArg(1) Class327 arg0) {
		if (arg0 == Static357.aClass327_14) {
			return 6407;
		} else if (arg0 == Static419.aClass327_2) {
			return 6408;
		} else if (Static337.aClass327_12 == arg0) {
			return 6406;
		} else if (arg0 == Static276.aClass327_10) {
			return 6409;
		} else if (Static338.aClass327_13 == arg0) {
			return 6410;
		} else if (Static181.aClass327_5 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
