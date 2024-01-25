import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
	public static int anInt9938;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "[J")
	public static final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public static int anInt9936 = 0;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
	public static final int[] anIntArray693 = new int[2];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILclient!rc;Lclient!rc;)V")
	public static void method8319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub3 arg3, @OriginalArg(4) Class11_Sub1_Sub3 arg4) {
		@Pc(4) Class217 local4 = Static334.method5171(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub3_1 = arg3;
		local4.aClass11_Sub1_Sub3_2 = arg4;
		@Pc(19) int local19 = Static331.aClass112Array3 == Static164.aClass112Array1 ? 1 : 0;
		if (!arg3.method8306()) {
			Static483.aClass11_Sub1ArrayArray3[local19][Static429.anIntArray527[local19]++] = arg3;
		} else if (arg3.method8310()) {
			Static146.aClass11_Sub1ArrayArray1[local19][Static442.anIntArray535[local19]++] = arg3;
		} else {
			Static317.aClass11_Sub1ArrayArray2[local19][Static336.anIntArray411[local19]++] = arg3;
			Static445.aBoolean594 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8306()) {
			if (arg4.method8310()) {
				Static146.aClass11_Sub1ArrayArray1[local19][Static442.anIntArray535[local19]++] = arg4;
				return;
			}
			Static317.aClass11_Sub1ArrayArray2[local19][Static336.anIntArray411[local19]++] = arg4;
			Static445.aBoolean594 = true;
			return;
		}
		Static483.aClass11_Sub1ArrayArray3[local19][Static429.anIntArray527[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static306.anInt5020 <= arg3 && arg5 <= Static252.anInt4988 && Static570.anInt9385 <= arg4 && arg1 <= Static177.anInt3963) {
			Static472.method6786(arg5, arg1, arg2, arg3, arg6, arg0, arg4);
		} else {
			Static371.method5589(arg5, arg2, arg0, arg3, arg4, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!ha;I)V")
	public static void method8322(@OriginalArg(0) Class87 arg0) {
		if (Static507.aBoolean636) {
			Static222.method7435(arg0);
		} else {
			Static33.method758(arg0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V")
	public static void method8323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static189.method3427(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(26) int local26 = local15;
		@Pc(33) int local33 = -local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static618.anIntArrayArray101[arg5];
		@Pc(45) int local45 = arg2 - local15;
		@Pc(49) int local49 = arg2 + local15;
		Static259.method4236(arg2 - arg0, local45, arg1, local41);
		Static259.method4236(local45, local49, arg3, local41);
		Static259.method4236(local49, arg2 + arg0, arg1, local41);
		while (local21 > local10) {
			local35 += 2;
			local37 += 2;
			local24 += local35;
			local33 += local37;
			if (local33 >= 0 && local26 >= 1) {
				Static29.anIntArray98[local26] = local10;
				local26--;
				local33 -= local26 << 1;
			}
			local10++;
			@Pc(117) int[] local117;
			@Pc(124) int[] local124;
			@Pc(128) int local128;
			@Pc(132) int local132;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			if (local24 >= 0) {
				local21--;
				if (local21 < local15) {
					local117 = Static618.anIntArrayArray101[local21 + arg5];
					local124 = Static618.anIntArrayArray101[arg5 - local21];
					local128 = Static29.anIntArray98[local21];
					local132 = local10 + arg2;
					local137 = arg2 - local10;
					local141 = local128 + arg2;
					local146 = arg2 - local128;
					Static259.method4236(local137, local146, arg1, local117);
					Static259.method4236(local146, local141, arg3, local117);
					Static259.method4236(local141, local132, arg1, local117);
					Static259.method4236(local137, local146, arg1, local124);
					Static259.method4236(local146, local141, arg3, local124);
					Static259.method4236(local141, local132, arg1, local124);
				} else {
					local117 = Static618.anIntArrayArray101[arg5 + local21];
					local124 = Static618.anIntArrayArray101[arg5 - local21];
					local128 = arg2 + local10;
					local132 = arg2 - local10;
					Static259.method4236(local132, local128, arg1, local117);
					Static259.method4236(local132, local128, arg1, local124);
				}
				local24 -= local21 << 1;
			}
			local117 = Static618.anIntArrayArray101[local10 + arg5];
			local124 = Static618.anIntArrayArray101[arg5 - local10];
			local128 = arg2 + local21;
			local132 = arg2 - local21;
			if (local10 >= local15) {
				Static259.method4236(local132, local128, arg1, local117);
				Static259.method4236(local132, local128, arg1, local124);
			} else {
				local137 = local26 >= local10 ? local26 : Static29.anIntArray98[local10];
				local141 = arg2 + local137;
				local146 = arg2 - local137;
				Static259.method4236(local132, local146, arg1, local117);
				Static259.method4236(local146, local141, arg3, local117);
				Static259.method4236(local141, local128, arg1, local117);
				Static259.method4236(local132, local146, arg1, local124);
				Static259.method4236(local146, local141, arg3, local124);
				Static259.method4236(local141, local128, arg1, local124);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIIII)V")
	public static void method8324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(5) int local5 = Static571.anInt9395;
		@Pc(7) int[] local7 = Static131.anIntArray213;
		Static317.anInt5736 = 0;
		@Pc(174) int local174;
		@Pc(214) int local214;
		@Pc(258) int local258;
		@Pc(333) int local333;
		@Pc(336) int local336;
		@Pc(427) int local427;
		@Pc(556) int local556;
		@Pc(1032) int local1032;
		for (@Pc(11) int local11 = 0; local11 < Static228.anInt4647 + local5; local11++) {
			@Pc(14) Class236 local14 = null;
			@Pc(33) Class11_Sub1_Sub1_Sub2 local33;
			if (local11 >= local5) {
				local33 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) Static160.anIntArray256[local11 - local5])).aClass11_Sub1_Sub1_Sub2_Sub2_2;
				local14 = ((Class11_Sub1_Sub1_Sub2_Sub2) local33).aClass236_1;
				if (local14.anIntArray462 != null) {
					local14 = local14.method5779(Static438.aClass198_1);
					if (local14 == null) {
						continue;
					}
				}
			} else {
				local33 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local7[local11]];
			}
			if (local33.anInt3245 >= 0 && (Static143.anInt3169 == local33.anInt3211 || Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 == local33.aByte124)) {
				Static328.method4911(local33, arg1 >> 1, local33.method2776(), arg0 >> 1);
				if (Static269.anIntArray354[0] >= 0) {
					if (local33.aString33 != null && (local11 >= local5 || Static339.anInt6232 == 0 || Static339.anInt6232 == 3 || Static339.anInt6232 == 1 && Static473.method6796(((Class11_Sub1_Sub1_Sub2_Sub1) local33).aString4)) && Static491.anInt8365 > Static317.anInt5736) {
						Static491.anIntArray576[Static317.anInt5736] = Static240.aClass114_19.method3015(local33.aString33) / 2;
						Static491.anIntArray574[Static317.anInt5736] = Static269.anIntArray354[0];
						Static491.anIntArray575[Static317.anInt5736] = Static269.anIntArray354[1];
						Static491.anIntArray572[Static317.anInt5736] = local33.anInt3277;
						Static491.anIntArray577[Static317.anInt5736] = local33.anInt3212;
						Static491.anIntArray573[Static317.anInt5736] = local33.anInt3249;
						Static491.aStringArray36[Static317.anInt5736] = local33.aString33;
						Static317.anInt5736++;
					}
					local174 = arg3 + Static269.anIntArray354[1];
					@Pc(243) Class20[] local243;
					@Pc(250) Class120[] local250;
					@Pc(305) Class20 local305;
					if (local33.aBoolean276 || Static325.anInt5888 >= local33.anInt3267) {
						local174 -= Math.max(Static240.aClass114_19.anInt3638, Static489.aClass20Array10[0].method4595());
					} else {
						@Pc(200) byte local200 = 1;
						if (local5 > local11) {
							@Pc(209) Class11_Sub1_Sub1_Sub2_Sub1 local209 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local7[local11]];
							local214 = local33.method2761().anInt4877;
							if (local209.aBoolean47) {
								local200 = 2;
							}
						} else {
							local214 = local14.anInt6894;
							if (local214 == -1) {
								local214 = local33.method2761().anInt4877;
							}
						}
						@Pc(233) Class20[] local233 = Static489.aClass20Array10;
						if (local214 != -1) {
							local243 = (Class20[]) Static394.aClass233_32.method5669((long) local214);
							if (local243 == null) {
								local250 = Static647.method3075(Static594.aClass97_144, local214);
								if (local250 != null) {
									local243 = new Class20[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static600.aClass87_15.method7969(local250[local258], true);
									}
									Static394.aClass233_32.method5662(local243, (long) local214);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local233 = local243;
							}
						}
						if (local233.length <= local200) {
							local200 = 1;
						}
						@Pc(301) Class20 local301 = local233[0];
						local305 = local233[local200];
						local174 -= Math.max(Static240.aClass114_19.anInt3638, local301.method4595());
						local258 = arg2 + Static269.anIntArray354[0] - (local301.method4579() >> 1);
						local333 = local301.method4579() * local33.anInt3260 / 255;
						local336 = local301.method4595();
						if (local33.anInt3260 > 0 && local333 < 2) {
							local333 = 2;
						}
						local301.method4582(local258, local174);
						Static600.aClass87_15.T(local258, local174, local258 + local333, local336 + local174);
						local305.method4582(local258, local174);
						Static600.aClass87_15.KA(arg2, arg3, arg0 + arg2, arg1 + arg3);
						Static233.method3884(local174 + local336, local174, local258, local301.method4588() + local258);
					}
					local174 -= 2;
					if (!local33.aBoolean276) {
						@Pc(408) Class20 local408;
						@Pc(417) Class20 local417;
						if (local33.anInt3276 > Static325.anInt5888) {
							local408 = Static316.aClass20Array8[local33.aBoolean277 ? 2 : 0];
							local417 = Static316.aClass20Array8[local33.aBoolean277 ? 3 : 1];
							if (local33 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
								local427 = local14.anInt6930;
								if (local427 == -1) {
									local427 = local33.method2761().anInt4878;
								}
							} else {
								local427 = local33.method2761().anInt4878;
							}
							if (local427 != -1) {
								local243 = (Class20[]) Static589.aClass233_57.method5669((long) local427);
								if (local243 == null) {
									local250 = Static647.method3075(Static594.aClass97_144, local427);
									if (local250 != null) {
										local243 = new Class20[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static600.aClass87_15.method7969(local250[local258], true);
										}
										Static589.aClass233_57.method5662(local243, (long) local427);
									}
								}
								if (local243 != null && local243.length == 4) {
									local408 = local243[local33.aBoolean277 ? 2 : 0];
									local417 = local243[local33.aBoolean277 ? 3 : 1];
								}
							}
							@Pc(519) int local519 = local33.anInt3276 - Static325.anInt5888;
							if (local519 > local33.anInt3286) {
								local519 -= local33.anInt3286;
								local258 = local33.anInt3207 == 0 ? 0 : local33.anInt3207 * ((local33.anInt3219 - local519) / local33.anInt3207);
								local556 = local258 * local408.method4579() / local33.anInt3219;
							} else {
								local556 = local408.method4579();
							}
							local258 = local408.method4595();
							local174 -= local258;
							local333 = arg2 + Static269.anIntArray354[0] - (local408.method4579() >> 1);
							local408.method4582(local333, local174);
							Static600.aClass87_15.T(local333, local174, local333 + local556, local174 + local258);
							local417.method4582(local333, local174);
							Static600.aClass87_15.KA(arg2, arg3, arg0 + arg2, arg1 + arg3);
							Static233.method3884(local174 + local258, local174, local333, local333 + local408.method4588());
							local174 -= 2;
						}
						if (local5 > local11) {
							@Pc(687) Class11_Sub1_Sub1_Sub2_Sub1 local687 = (Class11_Sub1_Sub1_Sub2_Sub1) local33;
							if (local687.anInt546 != -1) {
								local174 -= 25;
								local417 = Static536.aClass20Array12[local687.anInt546];
								local417.method4582(arg2 + Static269.anIntArray354[0] - 12, local174);
								Static233.method3884(local174 + local417.method4576(), local174, Static269.anIntArray354[0] + arg2 - 12, arg2 + (Static269.anIntArray354[0] + -12 - -local417.method4588()));
								local174 -= 2;
							}
							if (local687.anInt560 != -1) {
								local174 -= 25;
								local417 = Static553.aClass20Array14[local687.anInt560];
								local417.method4582(arg2 + Static269.anIntArray354[0] - 12, local174);
								Static233.method3884(local174 + local417.method4576(), local174, Static269.anIntArray354[0] + arg2 - 12, arg2 + -12 - -Static269.anIntArray354[0] - -local417.method4588());
								local174 -= 2;
							}
						} else if (local14.anInt6908 >= 0 && Static553.aClass20Array14.length > local14.anInt6908) {
							local174 -= 25;
							local408 = Static553.aClass20Array14[local14.anInt6908];
							local408.method4582(Static269.anIntArray354[0] + arg2 - (local408.method4579() >> 1), local174);
							Static233.method3884(local174 + local408.method4576(), local174, arg2 + Static269.anIntArray354[0] - (local408.method4579() >> 1), Static269.anIntArray354[0] + arg2 - (local408.method4579() >> 1) + local408.method4588());
							local174 -= 2;
						}
					}
					@Pc(793) Class60[] local793;
					@Pc(800) Class60 local800;
					if (!(local33 instanceof Class11_Sub1_Sub1_Sub2_Sub1)) {
						local214 = 0;
						local793 = Static388.aClass60Array1;
						for (local427 = 0; local427 < local793.length; local427++) {
							local800 = local793[local427];
							if (local800 != null && local800.anInt1599 == 1 && local800.anInt1606 == Static160.anIntArray256[local11 - local5]) {
								local305 = Static409.aClass20Array9[local800.anInt1605];
								if (local214 < local305.method4595()) {
									local214 = local305.method4595();
								}
								if (Static325.anInt5888 % 20 < 10) {
									local305.method4582(arg2 + Static269.anIntArray354[0] - 12, local174 + -local305.method4595());
									Static233.method3884(local174 - local305.method4595() + local305.method4576(), -local305.method4595() + local174, Static269.anIntArray354[0] + arg2 - 12, Static269.anIntArray354[0] + -12 + arg2 + local305.method4588());
								}
							}
						}
						if (local214 > 0) {
						}
					} else if (local11 >= 0) {
						local214 = 0;
						local793 = Static388.aClass60Array1;
						for (local427 = 0; local427 < local793.length; local427++) {
							local800 = local793[local427];
							if (local800 != null && local800.anInt1599 == 10 && local7[local11] == local800.anInt1606) {
								local305 = Static409.aClass20Array9[local800.anInt1605];
								if (local305.method4595() > local214) {
									local214 = local305.method4595();
								}
								local305.method4582(Static269.anIntArray354[0] + arg2 - 12, -local305.method4595() + local174);
								Static233.method3884(local174 - local305.method4595() + local305.method4576(), -local305.method4595() + local174, Static269.anIntArray354[0] + arg2 - 12, arg2 + Static269.anIntArray354[0] - 12 + local305.method4588());
							}
						}
						if (local214 > 0) {
						}
					}
					for (local214 = 0; local214 < 4; local214++) {
						if (Static325.anInt5888 < local33.anIntArray227[local214]) {
							local1032 = local33.method2776() / 2;
							Static328.method4911(local33, arg1 >> 1, local1032, arg0 >> 1);
							if (Static269.anIntArray354[0] > -1) {
								local427 = Static187.aClass20Array6[local33.anIntArray228[local214]].method4579();
								if (local214 == 1) {
									Static269.anIntArray354[1] -= 20;
								}
								if (local214 == 2) {
									Static269.anIntArray354[0] -= local427 - 9;
									Static269.anIntArray354[1] -= 10;
								}
								if (local214 == 3) {
									Static269.anIntArray354[0] += local427 - 9;
									Static269.anIntArray354[1] -= 10;
								}
								Static187.aClass20Array6[local33.anIntArray228[local214]].method4582(Static269.anIntArray354[0] + arg2 - (local427 >> 1), arg3 + Static269.anIntArray354[1] + -12);
								Static573.aClass64_15.method7493(Static269.anIntArray354[0] + arg2 - 1, arg3 + Static269.anIntArray354[1] + 3, Integer.toString(local33.anIntArray229[local214]), -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1173) int local1173;
		for (@Pc(1168) int local1168 = 0; local1168 < Static588.anInt9702; local1168++) {
			local1173 = Static458.anIntArray544[local1168];
			@Pc(1188) Class11_Sub1_Sub1_Sub2 local1188;
			if (local1173 >= 2048) {
				local1188 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) (local1173 - 2048))).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			} else {
				local1188 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local1173];
			}
			local214 = Static345.anIntArray417[local1168];
			@Pc(1210) Class11_Sub1_Sub1_Sub2 local1210;
			if (local214 >= 2048) {
				local1210 = ((Class2_Sub51) Static357.aClass222_23.method5468((long) (local214 - 2048))).aClass11_Sub1_Sub1_Sub2_Sub2_2;
			} else {
				local1210 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local214];
			}
			Static546.method7618(arg0, arg3, local1188, --local1188.anInt3265, local1210, arg1, arg2);
		}
		local1173 = Static240.aClass114_19.anInt3638 + Static240.aClass114_19.anInt3631 + 2;
		for (local174 = 0; local174 < Static317.anInt5736; local174++) {
			local214 = Static491.anIntArray574[local174];
			local1032 = Static491.anIntArray575[local174];
			local427 = Static491.anIntArray576[local174];
			@Pc(1270) boolean local1270 = true;
			while (local1270) {
				local1270 = false;
				for (local556 = 0; local556 < local174; local556++) {
					if (local1032 + 2 > -local1173 + Static491.anIntArray575[local556] && local1032 - local1173 < Static491.anIntArray575[local556] - -2 && local214 - local427 < Static491.anIntArray576[local556] + Static491.anIntArray574[local556] && local427 + local214 > -Static491.anIntArray576[local556] + Static491.anIntArray574[local556] && local1032 > Static491.anIntArray575[local556] - local1173) {
						local1270 = true;
						local1032 = Static491.anIntArray575[local556] - local1173;
					}
				}
			}
			Static491.anIntArray575[local174] = local1032;
			@Pc(1354) String local1354 = Static491.aStringArray36[local174];
			local258 = Static240.aClass114_19.method3015(local1354);
			local333 = arg2 + local214;
			local336 = arg3 + local1032 - Static240.aClass114_19.anInt3638;
			@Pc(1377) int local1377 = local258 + local333;
			@Pc(1385) int local1385 = local1032 + arg3 + Static240.aClass114_19.anInt3631;
			if (Static21.anInt690 == 0) {
				@Pc(1392) int local1392 = 16776960;
				if (Static491.anIntArray572[local174] < 6) {
					local1392 = Static194.anIntArray284[Static491.anIntArray572[local174]];
				}
				if (Static491.anIntArray572[local174] == 6) {
					local1392 = Static143.anInt3169 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static491.anIntArray572[local174] == 7) {
					local1392 = Static143.anInt3169 % 20 >= 10 ? 65535 : 255;
				}
				if (Static491.anIntArray572[local174] == 8) {
					local1392 = Static143.anInt3169 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(1470) int local1470;
				if (Static491.anIntArray572[local174] == 9) {
					local1470 = 150 - Static491.anIntArray573[local174];
					if (local1470 < 50) {
						local1392 = local1470 * 1280 + 16711680;
					} else if (local1470 < 100) {
						local1392 = 16384000 + 16776960 - local1470 * 327680;
					} else if (local1470 < 150) {
						local1392 = (local1470 - 100) * 5 + 65280;
					}
				}
				if (Static491.anIntArray572[local174] == 10) {
					local1470 = 150 - Static491.anIntArray573[local174];
					if (local1470 < 50) {
						local1392 = local1470 * 5 + 16711680;
					} else if (local1470 < 100) {
						local1392 = 16711935 + 16384000 - local1470 * 327680;
					} else if (local1470 < 150) {
						local1392 = (local1470 - 100) * 327680 + 500 + 255 - local1470 * 5;
					}
				}
				if (Static491.anIntArray572[local174] == 11) {
					local1470 = 150 - Static491.anIntArray573[local174];
					if (local1470 < 50) {
						local1392 = 16777215 - local1470 * 327685;
					} else if (local1470 < 100) {
						local1392 = local1470 * 327685 + 65280 - 16384250;
					} else if (local1470 < 150) {
						local1392 = 16777215 - (local1470 - 100) * 327680;
					}
				}
				local1470 = local1392 | 0xFF000000;
				if (Static491.anIntArray577[local174] == 0) {
					Static4.aClass64_1.method7493(arg2 + local214, arg3 + local1032, local1354, local1470, -16777216);
					local1377 -= local258 >> 1;
					local333 -= local258 >> 1;
				}
				if (Static491.anIntArray577[local174] == 1) {
					local333 -= local258 >> 1;
					local336 -= 5;
					Static4.aClass64_1.method7494(local1470, local1354, Static143.anInt3169, local1032 + arg3, arg2 + local214);
					local1385 += 5;
					local1377 -= local258 >> 1;
				}
				if (Static491.anIntArray577[local174] == 2) {
					Static4.aClass64_1.method7502(local1470, Static143.anInt3169, local214 + arg2, local1354, local1032 + arg3);
					local1385 += 5;
					local336 -= 5;
					local333 -= (local258 >> 1) + 5;
					local1377 -= (local258 >> 1) - 5;
				}
				if (Static491.anIntArray577[local174] == 3) {
					local1385 += 7;
					Static4.aClass64_1.method7503(local1032 + arg3, local1470, local214 + arg2, -Static491.anIntArray573[local174] + 150, Static143.anInt3169, local1354);
					local1377 -= local258 >> 1;
					local333 -= local258 >> 1;
					local336 -= 7;
				}
				@Pc(1782) int local1782;
				if (Static491.anIntArray577[local174] == 4) {
					local1782 = (150 - Static491.anIntArray573[local174]) * (Static240.aClass114_19.method3015(local1354) + 100) / 150;
					Static600.aClass87_15.T(local214 + arg2 - 50, arg3, local214 + arg2 + 50, arg1 + arg3);
					Static4.aClass64_1.method7508(arg3 + local1032, local1354, -16777216, local214 + arg2 + 50 - local1782, local1470);
					local1377 += 50 - local1782;
					local333 += 50 - local1782;
					Static600.aClass87_15.KA(arg2, arg3, arg2 + arg0, arg1 + arg3);
				}
				if (Static491.anIntArray577[local174] == 5) {
					local1782 = 150 - Static491.anIntArray573[local174];
					@Pc(1855) int local1855 = 0;
					if (local1782 < 25) {
						local1855 = local1782 - 25;
					} else if (local1782 > 125) {
						local1855 = local1782 - 125;
					}
					@Pc(1878) int local1878 = Static240.aClass114_19.anInt3638 + Static240.aClass114_19.anInt3631;
					Static600.aClass87_15.T(arg2, arg3 + local1032 - local1878 - 1, arg2 - -arg0, local1032 + arg3 + 5);
					local336 += local1855;
					local1377 -= local258 >> 1;
					Static4.aClass64_1.method7493(arg2 + local214, arg3 + local1032 + local1855, local1354, local1470, -16777216);
					local333 -= local258 >> 1;
					local1385 += local1855;
					Static600.aClass87_15.KA(arg2, arg3, arg2 + arg0, arg3 - -arg1);
				}
			} else {
				local1377 -= local258 >> 1;
				local333 -= local258 >> 1;
				Static4.aClass64_1.method7493(local214 + arg2, local1032 + arg3, local1354, -256, -16777216);
			}
			Static233.method3884(local1385 + 1, local336, local333, local1377 + 1);
		}
	}
}
