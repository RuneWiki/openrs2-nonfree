import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "F")
	public static float aFloat130 = 0.0F;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(II)I")
	public static int method4844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static206.aShortArrayArray11 == null ? 0 : Static206.aShortArrayArray11[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BLclient!mj;)Lclient!mj;")
	public static Class238 method4846(@OriginalArg(1) Class238 arg0) {
		@Pc(30) Class238 local30 = Static73.method1227(arg0);
		if (local30 == null) {
			local30 = arg0.aClass238_10;
		}
		return local30;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIZI[[[BI[IIBI[IZ[IZ[II[II)V")
	public static void method4847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int[] arg11, @OriginalArg(14) int[] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int arg15) {
		if (Static181.anInt3401 == -1) {
			return;
		}
		@Pc(18) int[] local18 = Static548.aClass100_13.Y();
		@Pc(22) int local22 = local18[0];
		@Pc(26) int local26 = local18[1];
		@Pc(30) int local30 = local18[2];
		@Pc(34) int local34 = local18[3];
		@Pc(36) int local36 = local30;
		@Pc(38) int local38 = local34;
		if (Static181.anInt3401 == 1) {
			local38 = (int) ((double) local34 * (double) Static144.anInt2845 / (double) Static166.anInt3251);
			local36 = (int) ((double) local30 * (double) Static144.anInt2845 / (double) Static166.anInt3251);
		}
		if (!Static597.aBoolean675) {
			if (Static181.anInt3401 == 1) {
				Static600.method8242();
			}
			@Pc(81) int local81 = arg15 - Static627.anInt10019;
			@Pc(85) int local85 = arg0 - Static187.anInt3477;
			@Pc(90) int local90 = arg4 - Static318.anInt5441;
			@Pc(112) int local112 = (int) (((double) local90 * Static237.aDouble8 + (double) local85 * Static475.aDouble35 + Static554.aDouble30 * (double) local81) * (double) local36 / (double) arg1);
			@Pc(134) int local134 = (int) ((double) local38 * ((double) local85 * Static343.aDouble13 + Static633.aDouble34 * (double) local81 + (double) local90 * Static602.aDouble33) / (double) arg1);
			@Pc(149) double local149 = (double) local81 * Static549.aDouble29 + (double) local85 * Static367.aDouble16 + Static356.aDouble14 * (double) local90;
			@Pc(156) int local156 = Static519.anInt8230 + local112 - Static502.anInt8074;
			@Pc(162) int local162 = local134 + Static287.anInt5049 - Static47.anInt817;
			@Pc(166) int local166 = local156 + Static558.anInt8797;
			@Pc(171) int local171 = local162 + Static144.anInt2845;
			if (local156 >= 0 && local162 >= 0 && Static95.anInt1605 >= local166 && local171 <= Static166.anInt3251 || Static181.anInt3401 == 2) {
				Static251.anInt4580 = local162;
				if (Static181.anInt3401 == 2) {
					Static572.aDouble31 = -local149;
				}
				Static208.anInt3698 = local156;
			} else if (local166 > 0 && local171 > 0 && Static95.anInt1605 > local156 && Static166.anInt3251 > local162) {
				@Pc(253) int local253 = local156 - Static519.anInt8230;
				@Pc(258) int local258 = local162 - Static287.anInt5049;
				@Pc(260) int local260 = 0;
				@Pc(262) int local262 = 0;
				@Pc(264) int local264 = 0;
				@Pc(266) int local266 = 0;
				@Pc(268) double local268 = 0.0D;
				if (Static181.anInt3401 == 0) {
					local268 = local149 + Static572.aDouble31;
					local260 = local253;
					local262 = local258;
				} else if (Static181.anInt3401 == 1) {
					local264 = local253 / Static659.anInt10729;
					local266 = local258 / Static122.anInt2024;
					local260 = Static659.anInt10729 * local264;
					local262 = Static122.anInt2024 * local266;
					local268 = (local149 + Static572.aDouble31) * (double) (local260 * local253 + local262 * local258) / (double) (local253 * local253 + local258 * local258);
				}
				local268 = -local268;
				@Pc(330) int local330 = 0;
				@Pc(332) int local332 = 0;
				@Pc(334) int local334 = 0;
				@Pc(336) int local336 = 0;
				@Pc(338) int local338 = 0;
				@Pc(347) int local347;
				@Pc(345) int local345;
				@Pc(363) int local363;
				@Pc(349) int local349;
				if (local260 >= 0) {
					local345 = Static95.anInt1605 - local260;
					local347 = 0;
					local349 = local260;
					if (Static181.anInt3401 == 1) {
						local338 = local264;
						local334 = Static492.anInt7974 - local264;
					}
					local363 = local345;
				} else {
					local347 = -local260;
					local345 = local260 + Static95.anInt1605;
					local363 = 0;
					if (Static181.anInt3401 == 1) {
						local334 = 0;
						local338 = -local264;
					}
					local349 = local347;
				}
				@Pc(388) int local388 = 0;
				@Pc(402) int local402;
				@Pc(397) int local397;
				@Pc(399) int local399;
				@Pc(404) int local404;
				@Pc(406) int local406;
				if (local262 < 0) {
					local397 = local262 + Static166.anInt3251;
					local399 = 0;
					local402 = -local262;
					local404 = local402;
					local406 = local402;
					if (Static181.anInt3401 == 1) {
						local332 = -local266;
						local330 = 0;
						local388 = Static58.anInt7090 + local266;
						local336 = local332;
					}
				} else {
					local397 = Static166.anInt3251 - local262;
					local402 = 0;
					local399 = local397;
					local406 = 0;
					if (Static181.anInt3401 == 1) {
						local336 = 0;
						local332 = local266;
						local330 = Static58.anInt7090 - local266;
						local388 = local330;
					}
					local404 = local262;
				}
				@Pc(459) Class387 local459 = Static590.aClass321_1.aClass387_5;
				@Pc(473) int local473;
				for (@Pc(464) Class4_Sub6 local464 = (Class4_Sub6) local459.method9018(); local464 != null; local464 = (Class4_Sub6) local459.method9016()) {
					@Pc(469) Class4_Sub8[] local469 = local464.aClass4_Sub8Array1;
					@Pc(471) boolean local471 = true;
					for (local473 = 0; local473 < local469.length; local473++) {
						@Pc(479) Class4_Sub8 local479 = local469[local473];
						@Pc(482) int local482 = local479.anInt8408;
						@Pc(485) int local485 = local479.anInt8405;
						@Pc(488) int local488 = local479.anInt8406;
						@Pc(491) int local491 = local479.anInt8404;
						@Pc(498) int local498;
						local479.anInt8406 = local498 = local488 - local260;
						@Pc(506) int local506;
						local479.anInt8408 = local506 = local482 - local260;
						@Pc(510) int local510 = local479.anInt8407;
						@Pc(517) int local517;
						local479.anInt8404 = local517 = local491 - local262;
						@Pc(525) int local525;
						local479.anInt8405 = local525 = local485 - local262;
						if (local471) {
							@Pc(541) int local541 = (local506 >= local498 ? local498 : local506) - local510;
							if (local541 <= Static95.anInt1605) {
								@Pc(564) int local564 = (local517 <= local525 ? local517 : local525) - local510;
								if (local564 <= Static166.anInt3251) {
									@Pc(587) int local587 = (local498 <= local506 ? local506 : local498) + local510;
									if (local587 >= 0) {
										@Pc(606) int local606 = (local525 >= local517 ? local525 : local517) + local510;
										if (local606 >= 0) {
											local471 = false;
										}
									}
								}
							}
						}
					}
					if (local471) {
						local464.method8570();
						Static474.method6691(local464);
					}
				}
				if (Static181.anInt3401 == 0) {
					Static548.aClass100_13.method8594(Static682.anInterface24_1);
				}
				Static548.aClass100_13.F(-local260, -local262);
				Static548.aClass100_13.b(local347, local402, local345, local397, local268);
				Static294.method4653(Static572.aDouble31 + local268);
				Static209.aDouble7 = Static572.aDouble31 + local268;
				if (Static181.anInt3401 == 1) {
					Static426.anInt7112 = local22 - Static502.anInt8074 - local260;
					Static252.anInt4588 = local26 - Static47.anInt817 - local262;
					Static75.anInt1326 = local38;
					Static494.anInt7987 = local36;
					Static548.aClass100_13.DA(Static426.anInt7112, Static252.anInt4588, Static494.anInt7987, Static75.anInt1326);
				} else {
					Static426.anInt7112 = Static519.anInt8230 + local22 - local260 - Static502.anInt8074;
					Static75.anInt1326 = local38;
					Static252.anInt4588 = Static287.anInt5049 + local26 - local262 - Static47.anInt817;
					Static494.anInt7987 = local36;
					Static548.aClass100_13.DA(Static426.anInt7112, Static252.anInt4588, Static494.anInt7987, Static75.anInt1326);
				}
				Static686.method2954(Static590.aClass321_1);
				if (local404 > 0) {
					Static548.aClass100_13.KA(0, local399, Static95.anInt1605, local404 + local399);
					Static548.aClass100_13.ya();
					Static548.aClass100_13.GA(Static390.anInt6574);
					Static2.method20(arg6, arg15, arg0, arg4, arg3, arg9, arg5, arg14, arg12, arg11, arg8, arg7, arg2, arg13, arg10, arg1, 1, false);
				}
				if (local349 > 0) {
					Static548.aClass100_13.KA(local363, local406, local363 + local349, local406 - -local397);
					Static548.aClass100_13.ya();
					Static548.aClass100_13.GA(Static390.anInt6574);
					Static2.method20(arg6, arg15, arg0, arg4, arg3, arg9, arg5, arg14, arg12, arg11, arg8, arg7, arg2, arg13, arg10, arg1, 1, false);
				}
				Static548.aClass100_13.la();
				Static289.method4591();
				if (Static181.anInt3401 == 0) {
					Static548.aClass100_13.method8648();
				}
				Static502.anInt8074 += local260;
				Static47.anInt817 += local262;
				Static572.aDouble31 += local268;
				Static251.anInt4580 = Static287.anInt5049 + local134 - Static47.anInt817;
				Static208.anInt3698 = Static519.anInt8230 + local112 - Static502.anInt8074;
				if (Static181.anInt3401 == 1) {
					Static488.anInt7901 += local266;
					Static111.anInt1795 += local264;
					for (@Pc(865) int local865 = 0; local865 < Static58.anInt7090; local865++) {
						@Pc(876) int local876 = Static461.method6497(Static58.anInt7090, Static488.anInt7901 + local865) * Static492.anInt7974;
						for (local473 = 0; local473 < Static492.anInt7974; local473++) {
							@Pc(890) int local890 = local876 + Static461.method6497(Static492.anInt7974, Static111.anInt1795 + local473);
							@Pc(942) boolean local942 = local330 <= local865 && local330 + local332 > local865 || local865 >= local336 && local336 + local388 > local865 && local473 >= local334 && local334 + local338 > local473;
							Static111.anInterface24Array1[local890].method8998(Static659.anInt10729 * local473, local865 * Static122.anInt2024, Static659.anInt10729, Static122.anInt2024, local942);
						}
					}
				}
			} else {
				Static597.aBoolean675 = true;
			}
		}
		if (Static597.aBoolean675) {
			Static572.aDouble31 = 0.0D;
			Static502.anInt8074 = 0;
			Static251.anInt4580 = Static287.anInt5049;
			Static627.anInt10019 = arg15;
			Static318.anInt5441 = arg4;
			Static187.anInt3477 = arg0;
			Static47.anInt817 = 0;
			Static208.anInt3698 = Static519.anInt8230;
			if (Static181.anInt3401 == 0) {
				Static548.aClass100_13.method8594(Static682.anInterface24_1);
			}
			Static548.aClass100_13.la();
			Static548.aClass100_13.ya();
			Static548.aClass100_13.GA(Static390.anInt6574);
			Static500.aClass10_9.method4220(Static627.anInt10019, Static187.anInt3477, Static318.anInt5441, Static518.anInt8219, Static110.anInt9536, Static503.anInt9738);
			Static548.aClass100_13.method8590(Static500.aClass10_9);
			if (Static181.anInt3401 == 1) {
				Static75.anInt1326 = local38;
				Static494.anInt7987 = local36;
				Static426.anInt7112 = local22;
				Static252.anInt4588 = local26;
				Static548.aClass100_13.DA(Static426.anInt7112, Static252.anInt4588, Static494.anInt7987, Static75.anInt1326);
			} else {
				Static75.anInt1326 = local38;
				Static426.anInt7112 = Static519.anInt8230 + local22;
				Static252.anInt4588 = local26 + Static287.anInt5049;
				Static494.anInt7987 = local36;
				Static548.aClass100_13.DA(Static426.anInt7112, Static252.anInt4588, Static494.anInt7987, Static75.anInt1326);
			}
			Static209.aDouble7 = 0.0D;
			Static590.aClass321_1.method7352();
			Static686.method2954(Static590.aClass321_1);
			Static2.method20(arg6, arg15, arg0, arg4, arg3, arg9, arg5, arg14, arg12, arg11, arg8, arg7, arg2, arg13, arg10, arg1, 1, false);
			Static289.method4591();
			Static597.aBoolean675 = false;
			if (Static181.anInt3401 == 0) {
				Static548.aClass100_13.method8648();
			}
			if (Static181.anInt3401 == 1) {
				Static630.method8667();
			}
		}
		if (Static181.anInt3401 == 0) {
			Static682.anInterface24_1.method8997(Static208.anInt3698, Static251.anInt4580, Static558.anInt8797, Static144.anInt2845, 0, 0);
		}
		Static662.anInt10762++;
		Static294.method4653(Static572.aDouble31);
		Static193.aDouble6 = Static572.aDouble31;
		if (Static181.anInt3401 == 0 || Static181.anInt3401 == 2) {
			if (Static181.anInt3401 == 2) {
				Static548.aClass100_13.GA(Static390.anInt6574);
				Static548.aClass100_13.ya();
			}
			Static47.anInt816 = local22 + Static519.anInt8230 - Static208.anInt3698 - Static502.anInt8074;
			Static173.anInt9672 = local26 + Static287.anInt5049 - Static47.anInt817 - Static251.anInt4580;
			Static347.anInt5728 = local38;
			Static160.anInt8867 = local36;
			Static548.aClass100_13.DA(Static47.anInt816, Static173.anInt9672, Static160.anInt8867, Static347.anInt5728);
		} else if (Static181.anInt3401 == 1) {
			Static160.anInt8867 = local36;
			Static347.anInt5728 = local38;
			Static173.anInt9672 = local26 - Static47.anInt817;
			Static47.anInt816 = local22 - Static502.anInt8074;
			Static548.aClass100_13.DA(Static47.anInt816, Static173.anInt9672, Static160.anInt8867, Static347.anInt5728);
			Static548.aClass100_13.KA(Static208.anInt3698, Static251.anInt4580, Static208.anInt3698 + Static558.anInt8797, Static251.anInt4580 - -Static144.anInt2845);
		}
		Static2.method20(arg6, arg15, arg0, arg4, arg3, arg9, arg5, arg14, arg12, arg11, arg8, arg7, arg2, arg13, arg10, arg1, Static181.anInt3401 == 2 ? 0 : 2, Static181.anInt3401 == 1);
		Static548.aClass100_13.la();
		Static548.aClass100_13.DA(local22, local26, local30, local34);
	}
}
