import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_48 = new Class242(29, 3);

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "Z")
	public static boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!za;II)V")
	public static void method2594(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static14.anInt247 == 0 || Static437.anInt6906 == 0) {
			return;
		}
		arg0.GA(Static67.anInt7117, Static58.anInt923, Static14.anInt247, Static437.anInt6906);
		arg0.ba(Static441.anInt4982, Static61.anInt7288, Static14.anInt247, Static437.anInt6906);
		@Pc(38) Class34 local38 = arg0.method5717();
		local38.YA(Static413.anInt6623, Static203.anInt3767, Static116.anInt2825, Static308.anInt5111, Static355.anInt5734, Static133.anInt2063);
		arg0.SA(local38);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(153) int local153;
		if (Static157.aClass139Array1 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg0.AA();
			local67 = local58 * (arg2 - Static67.anInt7117) / Static14.anInt247;
			local76 = local58 * (arg1 - Static58.anInt923) / Static437.anInt6906;
			local79 = arg0.r();
			local88 = (arg2 - Static67.anInt7117) * local79 / Static14.anInt247;
			local97 = local79 * (arg1 - Static58.anInt923) / Static437.anInt6906;
			local112 = new int[] { local67, local76, local58 };
			local38.wa(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local38.wa(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			@Pc(162) int local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(175) int local175 = (int) ((float) local112[0] + local135 * (float) local144);
				@Pc(179) int local179 = local175 >> 7;
				@Pc(190) int local190 = (int) ((float) local162 * local135 + (float) local112[2]);
				@Pc(194) int local194 = local190 >> 7;
				if (local179 > 0 && local194 > 0 && Static147.anInt2300 > local179 && local194 < Static293.anInt4886) {
					@Pc(214) int local214 = Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90;
					if (local214 < 3 && (Static278.aByteArrayArrayArray16[1][local179][local194] & 0x2) != 0) {
						local214++;
					}
					if ((float) Static157.aClass139Array1[local214].ca(local175, local190) < local135 * (float) local153 + (float) local112[1]) {
						local53 = (Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() - 1 << 6) + local175 >> 7;
						local55 = local190 + (Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() - 1 << 6) >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static290.aBoolean449 && (Static226.anInt4102 & 0x40) != 0) {
					@Pc(339) Class107 local339 = Static220.method3163(Static403.anInt6355, Static276.anInt4734);
					if (local339 == null) {
						Static403.method5125();
					} else {
						Static213.method3090(0L, Static28.aString5, " ->", local53, Static313.anInt5165, false, local55, 23, true, -1);
					}
				} else {
					if (Static93.aClass148_2 == Static94.aClass148_3) {
						Static213.method3090(0L, Static402.aClass142_101.method3118(Static63.anInt981), "", local53, -1, false, local55, 5, true, -1);
					}
					Static213.method3090(0L, Static305.aString60, "", local53, Static176.anInt3165, false, local55, 6, true, -1);
				}
			}
		}
		@Pc(364) Class63 local364 = Static181.aClass63_2;
		for (@Pc(369) Class111_Sub3 local369 = (Class111_Sub3) local364.method1019(); local369 != null; local369 = (Class111_Sub3) local364.method1022()) {
			if ((Static344.aBoolean511 || local369.anInt3923 == Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90) && local369.method3061(arg2, arg0, arg1)) {
				@Pc(508) int local508;
				@Pc(520) int local520;
				if (local369.aClass11_1 instanceof Class11_Sub1_Sub3_Sub2) {
					@Pc(393) Class11_Sub1_Sub3_Sub2 local393 = (Class11_Sub1_Sub3_Sub2) local369.aClass11_1;
					local67 = local393.method2635();
					if ((local67 & 0x1) == 0 && (local393.anInt6428 & 0x7F) == 0 && (local393.anInt6430 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local393.anInt6428 & 0x7F) == 64 && (local393.anInt6430 & 0x7F) == 64) {
						local76 = local393.anInt6428 - (local393.method2635() - 1 << 6);
						local79 = local393.anInt6430 - (local393.method2635() - 1 << 6);
						for (local88 = 0; local88 < Static137.anInt2142; local88++) {
							@Pc(478) Class1_Sub44 local478 = (Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local88]);
							if (local478 != null) {
								@Pc(483) Class11_Sub1_Sub3_Sub1 local483 = local478.aClass11_Sub1_Sub3_Sub1_2;
								if (local483.anInt3295 != Static98.anInt1304 && local483.aBoolean324) {
									local508 = local483.anInt6428 - (local483.aClass272_1.anInt7346 - 1 << 6);
									local520 = local483.anInt6430 - (local483.aClass272_1.anInt7346 - 1 << 6);
									if (local76 <= local508 && local483.aClass272_1.anInt7346 <= local393.method2635() - (local508 - local76 >> 7) && local520 >= local79 && local483.aClass272_1.anInt7346 <= local393.method2635() - (local520 - local79 >> 7)) {
										Static210.method5860(local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local483);
										local483.anInt3295 = Static98.anInt1304;
									}
								}
							}
						}
						local97 = Static103.anInt6434;
						local112 = Static56.anIntArray110;
						for (local508 = 0; local508 < local97; local508++) {
							@Pc(594) Class11_Sub1_Sub3_Sub2 local594 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local112[local508]];
							if (local594 != null && local594.anInt3295 != Static98.anInt1304 && local594 != local393 && local594.aBoolean324) {
								local144 = local594.anInt6428 - (local594.method2635() - 1 << 6);
								local153 = local594.anInt6430 - (local594.method2635() - 1 << 6);
								if (local144 >= local76 && local594.method2635() <= local393.method2635() - (local144 - local76 >> 7) && local153 >= local79 && local594.method2635() <= local393.method2635() - (local153 - local79 >> 7)) {
									Static222.method3205(local594, local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
									local594.anInt3295 = Static98.anInt1304;
								}
							}
						}
					}
					if (Static98.anInt1304 == local393.anInt3295) {
						continue;
					}
					Static222.method3205(local393, local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90);
					local393.anInt3295 = Static98.anInt1304;
				}
				@Pc(846) int local846;
				if (local369.aClass11_1 instanceof Class11_Sub1_Sub3_Sub1) {
					@Pc(729) Class11_Sub1_Sub3_Sub1 local729 = (Class11_Sub1_Sub3_Sub1) local369.aClass11_1;
					if (local729.aClass272_1 != null) {
						if ((local729.aClass272_1.anInt7346 & 0x1) == 0 && (local729.anInt6428 & 0x7F) == 0 && (local729.anInt6430 & 0x7F) == 0 || (local729.aClass272_1.anInt7346 & 0x1) == 1 && (local729.anInt6428 & 0x7F) == 64 && (local729.anInt6430 & 0x7F) == 64) {
							local67 = local729.anInt6428 - (local729.aClass272_1.anInt7346 - 1 << 6);
							local76 = local729.anInt6430 - (local729.aClass272_1.anInt7346 - 1 << 6);
							for (local79 = 0; local79 < Static137.anInt2142; local79++) {
								@Pc(813) Class1_Sub44 local813 = (Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local79]);
								if (local813 != null) {
									@Pc(818) Class11_Sub1_Sub3_Sub1 local818 = local813.aClass11_Sub1_Sub3_Sub1_2;
									if (Static98.anInt1304 != local818.anInt3295 && local729 != local818 && local818.aBoolean324) {
										local846 = local818.anInt6428 - (local818.aClass272_1.anInt7346 - 1 << 6);
										local508 = local818.anInt6430 - (local818.aClass272_1.anInt7346 - 1 << 6);
										if (local846 >= local67 && local818.aClass272_1.anInt7346 <= local729.aClass272_1.anInt7346 - (local846 - local67 >> 7) && local76 <= local508 && local729.aClass272_1.anInt7346 - (local508 - local76 >> 7) >= local818.aClass272_1.anInt7346) {
											Static210.method5860(Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 != local369.anInt3923, local818);
											local818.anInt3295 = Static98.anInt1304;
										}
									}
								}
							}
							local88 = Static103.anInt6434;
							@Pc(923) int[] local923 = Static56.anIntArray110;
							for (local846 = 0; local846 < local88; local846++) {
								@Pc(933) Class11_Sub1_Sub3_Sub2 local933 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local923[local846]];
								if (local933 != null && Static98.anInt1304 != local933.anInt3295 && local933.aBoolean324) {
									local520 = local933.anInt6428 - (local933.method2635() - 1 << 6);
									local144 = local933.anInt6430 - (local933.method2635() - 1 << 6);
									if (local67 <= local520 && local933.method2635() <= local729.aClass272_1.anInt7346 - (local520 - local67 >> 7) && local76 <= local144 && local933.method2635() <= local729.aClass272_1.anInt7346 - (local144 - local76 >> 7)) {
										Static222.method3205(local933, Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 != local369.anInt3923);
										local933.anInt3295 = Static98.anInt1304;
									}
								}
							}
						}
						if (local729.anInt3295 == Static98.anInt1304) {
							continue;
						}
						Static210.method5860(local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local729);
						local729.anInt3295 = Static98.anInt1304;
					}
				}
				if (local369.aClass11_1 instanceof Class11_Sub5_Sub1) {
					local58 = Static315.anInt5207 + local369.anInt3920;
					local67 = Static47.anInt676 + local369.anInt3921;
					@Pc(1084) Class1_Sub32 local1084 = (Class1_Sub32) Static402.aClass208_37.method4405((long) (local58 | local369.anInt3923 << 28 | local67 << 14));
					if (local1084 != null) {
						for (@Pc(1092) Class1_Sub39 local1092 = (Class1_Sub39) local1084.aClass14_26.method210(); local1092 != null; local1092 = (Class1_Sub39) local1084.aClass14_26.method215()) {
							@Pc(1100) Class135 local1100 = Static285.aClass226_2.method4788(local1092.anInt5803);
							if (!Static290.aBoolean449) {
								if (local369.anInt3923 == Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90) {
									@Pc(1183) String[] local1183 = local1100.aStringArray28;
									for (local846 = 4; local846 >= 0; local846--) {
										if (local1183 != null && local1183[local846] != null) {
											@Pc(1195) byte local1195 = 0;
											if (local846 == 0) {
												local1195 = 15;
											}
											local520 = Static93.anInt1257;
											if (local846 == 1) {
												local1195 = 2;
											}
											if (local846 == 2) {
												local1195 = 59;
											}
											if (local846 == 3) {
												local1195 = 49;
											}
											if (local846 == 4) {
												local1195 = 13;
											}
											if (local1100.anInt3850 == local846) {
												local520 = local1100.anInt3843;
											}
											if (local846 == local1100.anInt3822) {
												local520 = local1100.anInt3867;
											}
											Static213.method3090((long) local1092.anInt5803, local1183[local846], "<col=ff9040>" + local1100.aString41, local369.anInt3920, local520, false, local369.anInt3921, local1195, true, -1);
										}
									}
								}
								Static213.method3090((long) local1092.anInt5803, Static355.aClass142_88.method3118(Static63.anInt981), "<col=ff9040>" + local1100.aString41, local369.anInt3920, Static52.anInt742, local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local369.anInt3921, 1006, true, -1);
							} else if (Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local369.anInt3923) {
								@Pc(1121) Class45 local1121 = Static228.anInt5703 == -1 ? null : Static256.aClass136_1.method3016(Static228.anInt5703);
								if ((Static226.anInt4102 & 0x1) != 0 && (local1121 == null || local1100.method2993(local1121.anInt953, Static228.anInt5703) != local1121.anInt953)) {
									Static213.method3090((long) local1092.anInt5803, Static28.aString5, Static392.aString62 + " -> <col=ff9040>" + local1100.aString41, local369.anInt3920, Static313.anInt5165, false, local369.anInt3921, 47, true, -1);
								}
							}
						}
					}
				}
				if (local369.aClass11_1 instanceof Interface7) {
					@Pc(1324) Interface7 local1324 = (Interface7) local369.aClass11_1;
					@Pc(1331) Class87 local1331 = Static86.aClass248_7.method5246(local1324.method4895());
					if (local1331.anIntArray170 != null) {
						local1331 = local1331.method1571(Static32.aClass4_1);
					}
					if (local1331 != null) {
						if (!Static290.aBoolean449) {
							if (Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local369.anInt3923) {
								@Pc(1351) String[] local1351 = local1331.aStringArray11;
								if (local1351 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1351[local79] != null) {
											@Pc(1363) short local1363 = 0;
											if (local79 == 0) {
												local1363 = 45;
											}
											local97 = Static93.anInt1257;
											if (local79 == 1) {
												local1363 = 60;
											}
											if (local79 == 2) {
												local1363 = 4;
											}
											if (local79 == 3) {
												local1363 = 18;
											}
											if (local79 == 4) {
												local1363 = 1001;
											}
											if (local79 == local1331.anInt1919) {
												local97 = local1331.anInt1949;
											}
											if (local1331.anInt1943 == local79) {
												local97 = local1331.anInt1934;
											}
											Static213.method3090(Static235.method3356(local369.anInt3921, local1324, local369.anInt3920), local1351[local79], "<col=00ffff>" + local1331.aString17, local369.anInt3920, local97, false, local369.anInt3921, local1363, true, -1);
										}
									}
								}
							}
							Static213.method3090((long) local1331.anInt1925, Static355.aClass142_88.method3118(Static63.anInt981), "<col=00ffff>" + local1331.aString17, local369.anInt3920, Static52.anInt742, local369.anInt3923 != Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local369.anInt3921, 1002, true, -1);
						} else if (Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90 == local369.anInt3923) {
							@Pc(1496) Class45 local1496 = Static228.anInt5703 == -1 ? null : Static256.aClass136_1.method3016(Static228.anInt5703);
							if ((Static226.anInt4102 & 0x4) != 0 && (local1496 == null || local1331.method1573(local1496.anInt953, Static228.anInt5703) != local1496.anInt953)) {
								Static213.method3090(Static235.method3356(local369.anInt3921, local1324, local369.anInt3920), Static28.aString5, Static392.aString62 + " -> <col=00ffff>" + local1331.aString17, local369.anInt3920, Static313.anInt5165, false, local369.anInt3921, 8, true, -1);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIB)Z")
	public static boolean method2596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static344.method4573(arg0, arg1) | Static446.method5652(arg1, arg0) | Static440.method2582(arg1, arg0)) & Static92.method3325(arg0, arg1);
	}
}
