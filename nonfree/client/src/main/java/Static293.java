import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "Lclient!ov;")
	public static Class261 aClass261_4;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public static int anInt5290 = 0;

	@OriginalMember(owner = "client!lfa", name = "s", descriptor = "[I")
	public static final int[] anIntArray308 = new int[5];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)I")
	public static int method4365() {
		return Static462.anInt8035;
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method4368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static75.anInt1461;
		@Pc(9) int[] local9 = Static167.anIntArray145;
		Static193.anInt3787 = 0;
		@Pc(168) int local168;
		@Pc(189) int local189;
		@Pc(244) int local244;
		@Pc(318) int local318;
		@Pc(407) int local407;
		@Pc(850) int local850;
		@Pc(509) int local509;
		for (@Pc(13) int local13 = 0; local13 < Static306.anInt4911 + local7; local13++) {
			@Pc(17) Class354 local17 = null;
			@Pc(37) Class11_Sub1_Sub1_Sub3 local37;
			if (local7 <= local13) {
				local37 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) Static11.anIntArray12[local13 - local7])).aClass11_Sub1_Sub1_Sub3_Sub2_2;
				local17 = ((Class11_Sub1_Sub1_Sub3_Sub2) local37).aClass354_1;
				if (local17.anIntArray597 != null) {
					local17 = local17.method7683(Static390.aClass353_29);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local37 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local9[local13]];
			}
			if (local37.anInt7597 >= 0 && (local37.anInt7564 == Static450.anInt7909 || local37.aByte113 == Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113)) {
				Static472.method6507(local37.method6061(), arg2 >> 1, local37, arg0 >> 1);
				if (Static70.anIntArray59[0] >= 0) {
					if (local37.aString86 != null && (local13 >= local7 || Static59.anInt1128 == 0 || Static59.anInt1128 == 3 || Static59.anInt1128 == 1 && Static359.method5308(((Class11_Sub1_Sub1_Sub3_Sub1) local37).aString35)) && Static177.anInt8813 > Static193.anInt3787) {
						Static177.anIntArray536[Static193.anInt3787] = Static88.aClass352_7.method7572(local37.aString86) / 2;
						Static177.anIntArray532[Static193.anInt3787] = Static70.anIntArray59[0];
						Static177.anIntArray535[Static193.anInt3787] = Static70.anIntArray59[1];
						Static177.anIntArray533[Static193.anInt3787] = local37.anInt7573;
						Static177.anIntArray534[Static193.anInt3787] = local37.anInt7546;
						Static177.anIntArray537[Static193.anInt3787] = local37.anInt7571;
						Static177.aStringArray35[Static193.anInt3787] = local37.aString86;
						Static193.anInt3787++;
					}
					local168 = arg3 + Static70.anIntArray59[1];
					@Pc(229) Class5[] local229;
					@Pc(236) Class282[] local236;
					@Pc(290) Class5 local290;
					if (local37.aBoolean577 || local37.anInt7537 <= Static518.anInt9331) {
						local168 -= Math.max(Static88.aClass352_7.anInt9290, Static11.aClass5Array1[0].u());
					} else {
						@Pc(183) byte local183 = 1;
						if (local13 >= local7) {
							local189 = local17.anInt9428;
							if (local189 == -1) {
								local189 = local37.method6073().anInt3011;
							}
						} else {
							@Pc(206) Class11_Sub1_Sub1_Sub3_Sub1 local206 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local9[local13]];
							local189 = local37.method6073().anInt3011;
							if (local206.aBoolean259) {
								local183 = 2;
							}
						}
						@Pc(218) Class5[] local218 = Static11.aClass5Array1;
						if (local189 != -1) {
							local229 = (Class5[]) Static148.aClass207_12.method4390((long) local189);
							if (local229 == null) {
								local236 = Static604.method6020(Static121.aClass308_48, local189);
								if (local236 != null) {
									local229 = new Class5[local236.length];
									for (local244 = 0; local244 < local236.length; local244++) {
										local229[local244] = Static31.aClass78_18.method6838(local236[local244], true);
									}
									Static148.aClass207_12.method4391((long) local189, local229);
								}
							}
							if (local229 != null && local229.length >= 2) {
								local218 = local229;
							}
						}
						if (local218.length <= local183) {
							local183 = 1;
						}
						@Pc(286) Class5 local286 = local218[0];
						local290 = local218[local183];
						local168 -= Math.max(Static88.aClass352_7.anInt9290, local286.u());
						local244 = Static70.anIntArray59[0] + arg1 - (local286.E() >> 1);
						local318 = local286.E() * local37.anInt7531 / 255;
						if (local37.anInt7531 > 0 && local318 < 2) {
							local318 = 2;
						}
						local286.method7795(local244, local168);
						Static31.aClass78_18.V(local244, local168, local318 + local244, local168 + local286.u());
						local290.method7795(local244, local168);
						Static31.aClass78_18.da(arg1, arg3, arg2 + arg1, arg3 + arg0);
					}
					local168 -= 2;
					if (!local37.aBoolean577) {
						@Pc(390) Class5 local390;
						if (Static518.anInt9331 < local37.lb) {
							local390 = Static404.aClass5Array16[local37.aBoolean576 ? 2 : 0];
							@Pc(399) Class5 local399 = Static404.aClass5Array16[local37.aBoolean576 ? 3 : 1];
							if (local37 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
								local407 = local17.anInt9423;
								if (local407 == -1) {
									local407 = local37.method6073().anInt3019;
								}
							} else {
								local407 = local37.method6073().anInt3019;
							}
							if (local407 != -1) {
								local229 = (Class5[]) Static318.aClass207_31.method4390((long) local407);
								if (local229 == null) {
									local236 = Static604.method6020(Static121.aClass308_48, local407);
									if (local236 != null) {
										local229 = new Class5[local236.length];
										for (local244 = 0; local244 < local236.length; local244++) {
											local229[local244] = Static31.aClass78_18.method6838(local236[local244], true);
										}
										Static318.aClass207_31.method4391((long) local407, local229);
									}
								}
								if (local229 != null && local229.length == 4) {
									local390 = local229[local37.aBoolean576 ? 2 : 0];
									local399 = local229[local37.aBoolean576 ? 3 : 1];
								}
							}
							@Pc(502) int local502 = local37.lb - Static518.anInt9331;
							if (local502 <= local37.anInt7581) {
								local509 = local390.E();
							} else {
								local502 -= local37.anInt7581;
								local244 = local37.anInt7534 == 0 ? 0 : (local37.anInt7550 - local502) / local37.anInt7534 * local37.anInt7534;
								local509 = local390.E() * local244 / local37.anInt7550;
							}
							local244 = local390.u();
							local168 -= local244;
							local318 = Static70.anIntArray59[0] + arg1 - (local390.E() >> 1);
							local390.method7795(local318, local168);
							Static31.aClass78_18.V(local318, local168, local509 + local318, local168 + local244);
							local399.method7795(local318, local168);
							local168 -= 2;
							Static31.aClass78_18.da(arg1, arg3, arg1 + arg2, arg3 + arg0);
						}
						if (local13 < local7) {
							@Pc(599) Class11_Sub1_Sub1_Sub3_Sub1 local599 = (Class11_Sub1_Sub1_Sub3_Sub1) local37;
							if (local599.anInt3599 != -1) {
								local168 -= 25;
								Static142.aClass5Array9[local599.anInt3599].method7795(Static70.anIntArray59[0] + arg1 - 12, local168);
								local168 -= 2;
							}
							if (local599.anInt3579 != -1) {
								local168 -= 25;
								Static309.aClass5Array15[local599.anInt3579].method7795(arg1 + Static70.anIntArray59[0] - 12, local168);
								local168 -= 2;
							}
						} else if (local17.anInt9434 >= 0 && Static309.aClass5Array15.length > local17.anInt9434) {
							local168 -= 25;
							local390 = Static309.aClass5Array15[local17.anInt9434];
							local390.method7795(Static70.anIntArray59[0] + arg1 - (local390.E() >> 1), local168);
							local168 -= 2;
						}
					}
					@Pc(681) Class358[] local681;
					@Pc(689) Class358 local689;
					if (!(local37 instanceof Class11_Sub1_Sub1_Sub3_Sub1)) {
						local189 = 0;
						local681 = Static243.aClass358Array1;
						for (local407 = 0; local407 < local681.length; local407++) {
							local689 = local681[local407];
							if (local689 != null && local689.anInt9530 == 1 && Static11.anIntArray12[local13 - local7] == local689.anInt9537) {
								local290 = Static99.aClass5Array6[local689.anInt9538];
								if (local189 < local290.u()) {
									local189 = local290.u();
								}
								if (Static518.anInt9331 % 20 < 10) {
									local290.method7795(Static70.anIntArray59[0] + arg1 - 12, -local290.u() + local168);
								}
							}
						}
						if (local189 > 0) {
						}
					} else if (local13 >= 0) {
						local189 = 0;
						local681 = Static243.aClass358Array1;
						for (local407 = 0; local407 < local681.length; local407++) {
							local689 = local681[local407];
							if (local689 != null && local689.anInt9530 == 10 && local689.anInt9537 == local9[local13]) {
								local290 = Static99.aClass5Array6[local689.anInt9538];
								if (local189 < local290.u()) {
									local189 = local290.u();
								}
								local290.method7795(arg1 + Static70.anIntArray59[0] - 12, local168 - local290.u());
							}
						}
						if (local189 > 0) {
						}
					}
					for (local189 = 0; local189 < 4; local189++) {
						if (Static518.anInt9331 < local37.anIntArray450[local189]) {
							local850 = local37.method6061() / 2;
							Static472.method6507(local850, arg2 >> 1, local37, arg0 >> 1);
							if (Static70.anIntArray59[0] > -1) {
								local407 = Static11.aClass5Array2[local37.anIntArray449[local189]].E();
								if (local189 == 1) {
									Static70.anIntArray59[1] -= 20;
								}
								if (local189 == 2) {
									Static70.anIntArray59[1] -= 10;
									Static70.anIntArray59[0] -= local407 - 9;
								}
								if (local189 == 3) {
									Static70.anIntArray59[0] += local407 - 9;
									Static70.anIntArray59[1] -= 10;
								}
								Static11.aClass5Array2[local37.anIntArray449[local189]].method7795(Static70.anIntArray59[0] + arg1 - (local407 >> 1), arg3 + -12 - -Static70.anIntArray59[1]);
								Static442.aClass96_12.method7252(0, Integer.toString(local37.anIntArray452[local189]), Static70.anIntArray59[1] + arg3 + 3, -1, -1 + Static70.anIntArray59[0] + arg1);
							}
						}
					}
				}
			}
		}
		@Pc(997) int local997;
		for (@Pc(991) int local991 = 0; local991 < Static1.anInt38; local991++) {
			local997 = Static594.anIntArray619[local991];
			@Pc(1012) Class11_Sub1_Sub1_Sub3 local1012;
			if (local997 >= 2048) {
				local1012 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) (local997 - 2048))).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			} else {
				local1012 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local997];
			}
			local189 = Static403.anIntArray430[local991];
			@Pc(1031) Class11_Sub1_Sub1_Sub3 local1031;
			if (local189 < 2048) {
				local1031 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local189];
			} else {
				local1031 = ((Class1_Sub33) Static372.aClass91_30.method2271((long) (local189 - 2048))).aClass11_Sub1_Sub1_Sub3_Sub2_2;
			}
			Static397.method5700(arg0, --local1012.anInt7523, arg1, arg3, arg2, local1031, local1012);
		}
		local997 = Static88.aClass352_7.anInt9290 + Static88.aClass352_7.anInt9302 + 2;
		for (local168 = 0; local168 < Static193.anInt3787; local168++) {
			local189 = Static177.anIntArray532[local168];
			local850 = Static177.anIntArray535[local168];
			local407 = Static177.anIntArray536[local168];
			@Pc(1095) boolean local1095 = true;
			while (local1095) {
				local1095 = false;
				for (local509 = 0; local509 < local168; local509++) {
					if (Static177.anIntArray535[local509] - local997 < local850 + 2 && Static177.anIntArray535[local509] + 2 > -local997 + local850 && Static177.anIntArray536[local509] + Static177.anIntArray532[local509] > local189 - local407 && local407 + local189 > -Static177.anIntArray536[local509] + Static177.anIntArray532[local509] && local850 > Static177.anIntArray535[local509] - local997) {
						local850 = Static177.anIntArray535[local509] - local997;
						local1095 = true;
					}
				}
			}
			Static177.anIntArray535[local168] = local850;
			@Pc(1191) String local1191 = Static177.aStringArray35[local168];
			if (Static416.anInt7352 == 0) {
				local244 = 16776960;
				if (Static177.anIntArray533[local168] < 6) {
					local244 = Static392.anIntArray410[Static177.anIntArray533[local168]];
				}
				if (Static177.anIntArray533[local168] == 6) {
					local244 = Static450.anInt7909 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static177.anIntArray533[local168] == 7) {
					local244 = Static450.anInt7909 % 20 >= 10 ? 65535 : 255;
				}
				if (Static177.anIntArray533[local168] == 8) {
					local244 = Static450.anInt7909 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static177.anIntArray533[local168] == 9) {
					local318 = 150 - Static177.anIntArray537[local168];
					if (local318 < 50) {
						local244 = local318 * 1280 + 16711680;
					} else if (local318 < 100) {
						local244 = 16776960 - (local318 - 50) * 327680;
					} else if (local318 < 150) {
						local244 = local318 * 5 + 65280 - 500;
					}
				}
				if (Static177.anIntArray533[local168] == 10) {
					local318 = 150 - Static177.anIntArray537[local168];
					if (local318 < 50) {
						local244 = local318 * 5 + 16711680;
					} else if (local318 < 100) {
						local244 = 16711935 - (local318 - 50) * 327680;
					} else if (local318 < 150) {
						local244 = local318 * 327680 + 255 - (local318 - 100) * 5 - 32768000;
					}
				}
				if (Static177.anIntArray533[local168] == 11) {
					local318 = 150 - Static177.anIntArray537[local168];
					if (local318 < 50) {
						local244 = 16777215 - local318 * 327685;
					} else if (local318 < 100) {
						local244 = (local318 - 50) * 327685 + 65280;
					} else if (local318 < 150) {
						local244 = 16777215 + 32768000 - local318 * 327680;
					}
				}
				local318 = local244 | 0xFF000000;
				if (Static177.anIntArray534[local168] == 0) {
					Static62.aClass96_4.method7252(-16777216, local1191, local850 + arg3, local318, local189 + arg1);
				}
				if (Static177.anIntArray534[local168] == 1) {
					Static62.aClass96_4.method7256(local318, arg1 + local189, local1191, local850 + arg3, Static450.anInt7909);
				}
				if (Static177.anIntArray534[local168] == 2) {
					Static62.aClass96_4.method7259(local1191, Static450.anInt7909, local189 + arg1, local318, local850 + arg3);
				}
				if (Static177.anIntArray534[local168] == 3) {
					Static62.aClass96_4.method7246(local189 + arg1, -Static177.anIntArray537[local168] + 150, Static450.anInt7909, local1191, local850 + arg3, local318);
				}
				@Pc(1528) int local1528;
				if (Static177.anIntArray534[local168] == 4) {
					local1528 = (150 - Static177.anIntArray537[local168]) * (Static88.aClass352_7.method7572(local1191) + 100) / 150;
					Static31.aClass78_18.V(arg1 + local189 - 50, arg3, arg1 + local189 + 50, arg0 + arg3);
					Static62.aClass96_4.method7257(local1191, arg1 + local189 + 50 - local1528, local318, arg3 + local850, -16777216);
					Static31.aClass78_18.da(arg1, arg3, arg1 + arg2, arg3 - -arg0);
				}
				if (Static177.anIntArray534[local168] == 5) {
					local1528 = 150 - Static177.anIntArray537[local168];
					@Pc(1587) int local1587 = 0;
					if (local1528 < 25) {
						local1587 = local1528 - 25;
					} else if (local1528 > 125) {
						local1587 = local1528 - 125;
					}
					@Pc(1609) int local1609 = Static88.aClass352_7.anInt9302 + Static88.aClass352_7.anInt9290;
					Static31.aClass78_18.V(arg1, local850 + arg3 - local1609 - 1, arg2 + arg1, local850 + arg3 + 5);
					Static62.aClass96_4.method7252(-16777216, local1191, local1587 + arg3 + local850, local318, arg1 + local189);
					Static31.aClass78_18.da(arg1, arg3, arg1 + arg2, arg0 + arg3);
				}
			} else {
				Static62.aClass96_4.method7252(-16777216, local1191, arg3 + local850, -256, local189 + arg1);
			}
		}
	}
}
