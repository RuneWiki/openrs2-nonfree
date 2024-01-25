import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "Lclient!vk;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "Lclient!at;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_11 = new Class11(63, -1);

	@OriginalMember(owner = "client!cd", name = "B", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_12 = new Class11(6, -1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIIIII)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static335.anInt5738;
		Static169.anInt3229 = 0;
		@Pc(11) int[] local11 = Static242.anIntArray933;
		@Pc(20) byte local20 = Static84.method1290() == 2 ? (byte) Static196.anInt4050 : 1;
		@Pc(84) int local84;
		@Pc(89) int local89;
		@Pc(276) int local276;
		@Pc(460) int local460;
		@Pc(583) int local583;
		@Pc(332) int local332;
		@Pc(700) int local700;
		@Pc(518) int local518;
		label434: for (@Pc(30) int local30 = 0; local30 < Static171.anInt3311 + local7; local30++) {
			@Pc(34) Class133 local34 = null;
			@Pc(46) Class1_Sub5_Sub1 local46;
			if (local30 >= local7) {
				local46 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local30 - local7]];
				local34 = ((Class1_Sub5_Sub1_Sub2) local46).aClass133_1;
				if (local34.anIntArray653 != null) {
					local34 = local34.method3094(Static321.aClass211_1);
					if (local34 == null) {
						continue;
					}
				}
			} else {
				local46 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local11[local30]];
			}
			if (local46.anInt6438 >= 0) {
				if (Static68.aByteArrayArrayArray1 != null && Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 < local46.aByte69) {
					for (local84 = local46.aShort96; local84 <= local46.aShort94; local84++) {
						for (local89 = local46.aShort97; local89 <= local46.aShort95; local89++) {
							if (local20 == Static68.aByteArrayArrayArray1[local46.aByte69][local84][local89]) {
								continue label434;
							}
						}
					}
				}
				Static63.method1048(arg3 >> 1, local46.method5553(), arg0 >> 1, local46);
				if (Static355.anIntArray1252[0] >= 0) {
					if (local46.aString66 != null && (local30 >= local7 || Static156.anInt3026 == 0 || Static156.anInt3026 == 3 || Static156.anInt3026 == 1 && Static202.method3436(((Class1_Sub5_Sub1_Sub1) local46).aString24)) && Static304.anInt6545 > Static169.anInt3229) {
						Static304.anIntArray1346[Static169.anInt3229] = Static238.aClass136_7.method3125(local46.aString66) / 2;
						Static304.anIntArray1349[Static169.anInt3229] = Static355.anIntArray1252[0];
						Static304.anIntArray1345[Static169.anInt3229] = Static355.anIntArray1252[1];
						Static304.anIntArray1344[Static169.anInt3229] = local46.anInt6434;
						Static304.anIntArray1347[Static169.anInt3229] = local46.anInt6393;
						Static304.anIntArray1348[Static169.anInt3229] = local46.anInt6449;
						Static304.aStringArray162[Static169.anInt3229] = local46.aString66;
						Static169.anInt3229++;
					}
					@Pc(220) Class18 local220 = Static139.aClass18Array5[0];
					local89 = arg1 + Static355.anIntArray1252[1] - Math.max(Static238.aClass136_7.anInt3408, local220.method4571());
					@Pc(244) Class18 local244;
					@Pc(344) int local344;
					if (!local46.aBoolean459 && Static253.anInt4469 < local46.anInt6421) {
						local244 = Static139.aClass18Array5[1];
						if (local46 instanceof Class1_Sub5_Sub1_Sub2) {
							@Pc(250) Class1_Sub5_Sub1_Sub2 local250 = (Class1_Sub5_Sub1_Sub2) local46;
							@Pc(259) Class18[] local259 = (Class18[]) Static293.aClass160_62.method3599((long) local250.aClass133_1.anInt3352);
							if (local259 == null) {
								@Pc(268) Class86[] local268 = Static397.method2332(Static263.aClass171_64, local250.aClass133_1.anInt3352);
								if (local268 != null) {
									local259 = new Class18[local268.length];
									for (local276 = 0; local276 < local268.length; local276++) {
										local259[local276] = Static111.aClass63_3.method2000(local268[local276]);
									}
									Static293.aClass160_62.method3602((long) local250.aClass133_1.anInt3352, local259);
								}
							}
							if (local259 != null && local259.length == 2) {
								local244 = local259[1];
								local220 = local259[0];
							}
						}
						local332 = Static355.anIntArray1252[0] + arg2 - (local220.method4563() >> 1);
						local220.method4558(local332, local89);
						local344 = local220.method4563() * local46.anInt6403 / 255;
						if (local46.anInt6403 > 0 && local344 < 2) {
							local344 = 2;
						}
						Static111.aClass63_3.method2008(local332, local89, local332 + local344, local220.method4571() + local89);
						local244.method4558(local332, local89);
						Static111.aClass63_3.method1958(arg2, arg1, arg2 + arg0, arg1 - -arg3);
					}
					local89 -= 2;
					if (!local46.aBoolean459) {
						if (Static253.anInt4469 < local46.anInt6447) {
							local244 = Static339.aClass18Array12[local46.aBoolean458 ? 2 : 0];
							@Pc(410) Class18 local410 = Static339.aClass18Array12[local46.aBoolean458 ? 3 : 1];
							if (local46 instanceof Class1_Sub5_Sub1_Sub2) {
								local344 = local34.anInt3367;
								if (local344 == -1) {
									local344 = local46.method5552().anInt2829;
								}
							} else {
								local344 = local46.method5552().anInt2829;
							}
							if (local344 != -1) {
								@Pc(445) Class18[] local445 = (Class18[]) Static295.aClass160_45.method3599((long) local344);
								if (local445 == null) {
									@Pc(452) Class86[] local452 = Static397.method2332(Static263.aClass171_64, local344);
									if (local452 != null) {
										local445 = new Class18[local452.length];
										for (local460 = 0; local460 < local452.length; local460++) {
											local445[local460] = Static111.aClass63_3.method2000(local452[local460]);
										}
										Static295.aClass160_45.method3602((long) local344, local445);
									}
								}
								if (local445 != null && local445.length == 4) {
									local244 = local445[local46.aBoolean458 ? 2 : 0];
									local410 = local445[local46.aBoolean458 ? 3 : 1];
								}
							}
							local518 = local46.anInt6447 - Static253.anInt4469;
							if (local518 > local46.anInt6446) {
								local518 -= local46.anInt6446;
								local460 = local46.anInt6424 == 0 ? 0 : (local46.anInt6401 - local518) / local46.anInt6424 * local46.anInt6424;
								local276 = local244.method4563() * local460 / local46.anInt6401;
							} else {
								local276 = local244.method4563();
							}
							local460 = local244.method4571();
							local89 -= local460;
							local583 = arg2 + Static355.anIntArray1252[0] - (local244.method4563() >> 1);
							local244.method4558(local583, local89);
							Static111.aClass63_3.method2008(local583, local89, local583 + local276, local460 + local89);
							local410.method4558(local583, local89);
							Static111.aClass63_3.method1958(arg2, arg1, arg2 + arg0, arg3 + arg1);
							local89 -= 2;
						}
						if (local30 < local7) {
							@Pc(620) Class1_Sub5_Sub1_Sub1 local620 = (Class1_Sub5_Sub1_Sub1) local46;
							if (local620.anInt2272 != -1) {
								local89 -= 25;
								Static58.aClass18Array2[local620.anInt2272].method4558(Static355.anIntArray1252[0] + arg2 - 12, local89);
								local89 -= 2;
							}
							if (local620.anInt2269 != -1) {
								local89 -= 25;
								Static382.aClass18Array15[local620.anInt2269].method4558(arg2 + Static355.anIntArray1252[0] - 12, local89);
								local89 -= 2;
							}
						} else if (local34.anInt3361 >= 0 && local34.anInt3361 < Static382.aClass18Array15.length) {
							local244 = Static382.aClass18Array15[local34.anInt3361];
							local89 -= 25;
							local244.method4558(arg2 + Static355.anIntArray1252[0] - (local244.method4563() >> 1), local89);
							local89 -= 2;
						}
					}
					@Pc(702) Class141[] local702;
					@Pc(710) Class141 local710;
					@Pc(727) Class18 local727;
					if (!(local46 instanceof Class1_Sub5_Sub1_Sub1)) {
						local700 = 0;
						local702 = Static335.aClass141Array1;
						for (local344 = 0; local344 < local702.length; local344++) {
							local710 = local702[local344];
							if (local710 != null && local710.anInt3559 == 1 && Static143.anIntArray583[local30 - local7] == local710.anInt3561) {
								local727 = Static164.aClass18Array7[local710.anInt3554];
								if (local700 < local727.method4571()) {
									local700 = local727.method4571();
								}
								if (Static253.anInt4469 % 20 < 10) {
									local727.method4558(Static355.anIntArray1252[0] + arg2 - 12, local89 - local727.method4571());
								}
							}
						}
						if (local700 > 0) {
						}
					} else if (local30 >= 0) {
						local700 = 0;
						local702 = Static335.aClass141Array1;
						for (local344 = 0; local344 < local702.length; local344++) {
							local710 = local702[local344];
							if (local710 != null && local710.anInt3559 == 10 && local11[local30] == local710.anInt3561) {
								local727 = Static164.aClass18Array7[local710.anInt3554];
								if (local700 < local727.method4571()) {
									local700 = local727.method4571();
								}
								local727.method4558(arg2 + Static355.anIntArray1252[0] - 12, local89 + -local727.method4571());
							}
						}
						if (local700 > 0) {
						}
					}
					for (local700 = 0; local700 < 4; local700++) {
						if (local46.anIntArray1320[local700] > Static253.anInt4469) {
							local332 = local46.method5553() / 2;
							Static63.method1048(arg3 >> 1, local332, arg0 >> 1, local46);
							if (Static355.anIntArray1252[0] > -1) {
								if (local700 == 1) {
									Static355.anIntArray1252[1] -= 20;
								}
								if (local700 == 2) {
									Static355.anIntArray1252[0] -= 15;
									Static355.anIntArray1252[1] -= 10;
								}
								if (local700 == 3) {
									Static355.anIntArray1252[0] += 15;
									Static355.anIntArray1252[1] -= 10;
								}
								Static230.aClass18Array10[local46.anIntArray1322[local700]].method4558(Static355.anIntArray1252[0] + arg2 - 12, Static355.anIntArray1252[1] + arg1 - 12);
								Static156.aClass9_1.method5054(Integer.toString(local46.anIntArray1321[local700]), -1, 0, Static355.anIntArray1252[1] + arg1 + 3, Static355.anIntArray1252[0] + arg2 + -1);
							}
						}
					}
				}
			}
		}
		@Pc(998) int local998;
		for (@Pc(992) int local992 = 0; local992 < Static80.anInt1468; local992++) {
			local998 = Static293.anIntArray1333[local992];
			@Pc(1007) Class1_Sub5_Sub1 local1007;
			if (local998 >= 2048) {
				local1007 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local998 - 2048];
			} else {
				local1007 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local998];
			}
			local89 = Static55.anIntArray226[local992];
			@Pc(1028) Class1_Sub5_Sub1 local1028;
			if (local89 >= 2048) {
				local1028 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local89 - 2048];
			} else {
				local1028 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local89];
			}
			Static140.method2663(--local1007.anInt6416, arg2, local1028, arg0, arg1, arg3, local1007);
		}
		local998 = Static238.aClass136_7.anInt3408 + Static238.aClass136_7.anInt3405 + 2;
		for (local84 = 0; local84 < Static169.anInt3229; local84++) {
			local89 = Static304.anIntArray1349[local84];
			local700 = Static304.anIntArray1345[local84];
			local332 = Static304.anIntArray1346[local84];
			@Pc(1081) boolean local1081 = true;
			while (local1081) {
				local1081 = false;
				for (local518 = 0; local518 < local84; local518++) {
					if (Static304.anIntArray1345[local518] - local998 < local700 + 2 && Static304.anIntArray1345[local518] + 2 > local700 - local998 && Static304.anIntArray1349[local518] + Static304.anIntArray1346[local518] > -local332 + local89 && local332 + local89 > Static304.anIntArray1349[local518] + -Static304.anIntArray1346[local518] && Static304.anIntArray1345[local518] - local998 < local700) {
						local1081 = true;
						local700 = Static304.anIntArray1345[local518] - local998;
					}
				}
			}
			Static304.anIntArray1345[local84] = local700;
			@Pc(1171) String local1171 = Static304.aStringArray162[local84];
			if (Static50.anInt1032 == 0) {
				local276 = 16776960;
				if (Static304.anIntArray1344[local84] < 6) {
					local276 = Static217.anIntArray773[Static304.anIntArray1344[local84]];
				}
				if (Static304.anIntArray1344[local84] == 6) {
					local276 = Static196.anInt4050 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static304.anIntArray1344[local84] == 7) {
					local276 = Static196.anInt4050 % 20 >= 10 ? 65535 : 255;
				}
				if (Static304.anIntArray1344[local84] == 8) {
					local276 = Static196.anInt4050 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static304.anIntArray1344[local84] == 9) {
					local460 = 150 - Static304.anIntArray1348[local84];
					if (local460 < 50) {
						local276 = local460 * 1280 + 16711680;
					} else if (local460 < 100) {
						local276 = 16776960 - (local460 - 50) * 327680;
					} else if (local460 < 150) {
						local276 = (local460 - 100) * 5 + 65280;
					}
				}
				if (Static304.anIntArray1344[local84] == 10) {
					local460 = 150 - Static304.anIntArray1348[local84];
					if (local460 < 50) {
						local276 = local460 * 5 + 16711680;
					} else if (local460 < 100) {
						local276 = 33095935 - local460 * 327680;
					} else if (local460 < 150) {
						local276 = (local460 - 100) * 327680 + 255 - (local460 - 100) * 5;
					}
				}
				if (Static304.anIntArray1344[local84] == 11) {
					local460 = 150 - Static304.anIntArray1348[local84];
					if (local460 < 50) {
						local276 = 16777215 - local460 * 327685;
					} else if (local460 < 100) {
						local276 = local460 * 327685 + 65280 - 16384250;
					} else if (local460 < 150) {
						local276 = 49545215 - local460 * 327680;
					}
				}
				local460 = local276 | 0xFF000000;
				if (Static304.anIntArray1347[local84] == 0) {
					Static340.aClass9_4.method5054(local1171, local460, -16777216, arg1 + local700, arg2 - -local89);
				}
				if (Static304.anIntArray1347[local84] == 1) {
					Static340.aClass9_4.method5056(local89 + arg2, local1171, arg1 + local700, Static196.anInt4050, local460);
				}
				if (Static304.anIntArray1347[local84] == 2) {
					Static340.aClass9_4.method5051(local1171, local700 + arg1, local460, Static196.anInt4050, local89 + arg2);
				}
				if (Static304.anIntArray1347[local84] == 3) {
					Static340.aClass9_4.method5050(local89 + arg2, local700 + arg1, local460, 150 - Static304.anIntArray1348[local84], Static196.anInt4050, local1171);
				}
				if (Static304.anIntArray1347[local84] == 4) {
					local583 = (150 - Static304.anIntArray1348[local84]) * (Static238.aClass136_7.method3125(local1171) + 100) / 150;
					Static111.aClass63_3.method2008(local89 + arg2 - 50, arg1, local89 + arg2 + 50, arg3 + arg1);
					Static340.aClass9_4.method5052(local460, arg1 + local700, local1171, -16777216, local89 + arg2 + 50 - local583);
					Static111.aClass63_3.method1958(arg2, arg1, arg2 + arg0, arg1 + arg3);
				}
				if (Static304.anIntArray1347[local84] == 5) {
					local583 = 150 - Static304.anIntArray1348[local84];
					@Pc(1568) int local1568 = 0;
					if (local583 < 25) {
						local1568 = local583 - 25;
					} else if (local583 > 125) {
						local1568 = local583 - 125;
					}
					@Pc(1593) int local1593 = Static238.aClass136_7.anInt3408 + Static238.aClass136_7.anInt3405;
					Static111.aClass63_3.method2008(arg2, arg1 + local700 - local1593 - 1, arg2 + arg0, arg1 + local700 + 5);
					Static340.aClass9_4.method5054(local1171, local460, -16777216, arg1 + local700 + local1568, arg2 - -local89);
					Static111.aClass63_3.method1958(arg2, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				Static340.aClass9_4.method5054(local1171, -256, -16777216, local700 + arg1, local89 + arg2);
			}
		}
	}
}
