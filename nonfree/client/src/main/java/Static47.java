import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_17 = new Class146(68, 3);

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[128][128];

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
	public static int anInt739 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method616(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static327.method4301(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILclient!ya;I)V")
	public static void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class135 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static156.anInt2885 == 0 || Static3.anInt50 == 0) {
			return;
		}
		arg2.H(Static306.anInt5011, Static262.anInt4696, Static156.anInt2885, Static3.anInt50);
		arg2.OA(Static130.anInt2342, Static268.anInt4434, Static156.anInt2885, Static3.anInt50);
		@Pc(37) Class35 local37 = arg2.method5400();
		local37.s(Static76.anInt1530, Static339.anInt5517, Static136.anInt2489, Static206.anInt4097, Static379.anInt6161, Static380.anInt6187);
		arg2.ea(local37);
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static228.aClass41Array2 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(57) int local57 = arg2.a();
			local66 = (arg0 - Static306.anInt5011) * local57 / Static156.anInt2885;
			local75 = (arg1 - Static262.anInt4696) * local57 / Static3.anInt50;
			local78 = arg2.YA();
			local87 = local78 * (arg0 - Static306.anInt5011) / Static156.anInt2885;
			local96 = (arg1 - Static262.anInt4696) * local78 / Static3.anInt50;
			local111 = new int[] { local66, local75, local57 };
			local37.m(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local78 };
			local37.m(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(161) int local161 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local111[0] + local134 * (float) local143);
				@Pc(178) int local178 = local174 >> 7;
				@Pc(189) int local189 = (int) ((float) local161 * local134 + (float) local111[2]);
				@Pc(193) int local193 = local189 >> 7;
				if (local178 > 0 && local193 > 0 && Static337.anInt5497 > local178 && local193 < Static282.anInt4644) {
					@Pc(210) int local210 = Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99;
					if (local210 < 3 && (Static4.aByteArrayArrayArray1[1][local178][local193] & 0x2) != 0) {
						local210++;
					}
					if ((float) Static228.aClass41Array2[local210].a(local174, local189) < (float) local111[1] + local134 * (float) local152) {
						local52 = local174 + (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() - 1 << 6) >> 7;
						local54 = (Static401.aClass8_Sub3_Sub1_Sub1_2.method5894() - 1 << 6) + local189 >> 7;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static70.aBoolean94 && (Static115.anInt2115 & 0x40) != 0) {
					@Pc(335) Class110 local335 = Static220.method2992(Static259.anInt4347, Static270.anInt4512);
					if (local335 == null) {
						Static4.method74();
					} else {
						Static391.method5158(0L, -1, local54, local52, Static111.anInt2085, " ->", 60, false, Static304.aString54, true);
					}
				} else {
					if (Static15.aClass6_1 == Static231.aClass6_7) {
						Static391.method5158(0L, -1, local54, local52, -1, "", 17, false, Static313.aClass15_91.method180(Static429.anInt6999), true);
					}
					Static391.method5158(0L, -1, local54, local52, Static77.anInt1542, "", 15, false, Static71.aString73, true);
				}
			}
		}
		@Pc(355) Class248 local355 = Static301.aClass248_6;
		for (@Pc(360) Class20_Sub5 local360 = (Class20_Sub5) local355.method5583(); local360 != null; local360 = (Class20_Sub5) local355.method5577()) {
			if ((Static7.aBoolean4 || Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local360.anInt3903) && local360.method3083(arg0, arg2, arg1)) {
				@Pc(485) int local485;
				if (local360.aClass8_1 instanceof Class8_Sub3_Sub1_Sub1) {
					@Pc(388) Class8_Sub3_Sub1_Sub1 local388 = (Class8_Sub3_Sub1_Sub1) local360.aClass8_1;
					local66 = local388.method5894();
					if ((local66 & 0x1) == 0 && (local388.anInt7339 & 0x7F) == 0 && (local388.anInt7343 & 0x7F) == 0 || (local66 & 0x1) == 1 && (local388.anInt7339 & 0x7F) == 64 && (local388.anInt7343 & 0x7F) == 64) {
						local75 = local388.anInt7339 - (local388.method5894() - 1 << 6);
						local78 = local388.anInt7343 - (local388.method5894() - 1 << 6);
						@Pc(497) int local497;
						for (local87 = 0; local87 < Static148.anInt2692; local87++) {
							@Pc(462) Class8_Sub3_Sub1_Sub2 local462 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local87]];
							if (local462 != null && Static265.anInt4371 != local462.anInt7385 && local462.aBoolean522) {
								local485 = local462.anInt7339 - (local462.aClass78_1.anInt1885 - 1 << 6);
								local497 = local462.anInt7343 - (local462.aClass78_1.anInt1885 - 1 << 6);
								if (local75 <= local485 && local462.aClass78_1.anInt1885 <= local388.method5894() - (local485 - local75 >> 7) && local497 >= local78 && local462.aClass78_1.anInt1885 <= local388.method5894() - (local497 - local78 >> 7)) {
									Static350.method4632(Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 != local360.anInt3903, local462);
									local462.anInt7385 = Static265.anInt4371;
								}
							}
						}
						local96 = Static438.anInt2796;
						local111 = Static78.anIntArray114;
						for (local497 = 0; local497 < local96; local497++) {
							@Pc(568) Class8_Sub3_Sub1_Sub1 local568 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local111[local497]];
							if (local568 != null && local568.anInt7385 != Static265.anInt4371 && local568 != local388 && local568.aBoolean522) {
								local143 = local568.anInt7339 - (local568.method5894() - 1 << 6);
								local152 = local568.anInt7343 - (local568.method5894() - 1 << 6);
								if (local143 >= local75 && local568.method5894() <= local388.method5894() - (local143 - local75 >> 7) && local78 <= local152 && local568.method5894() <= local388.method5894() - (local152 - local78 >> 7)) {
									Static281.method3697(local568, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 != local360.anInt3903);
									local568.anInt7385 = Static265.anInt4371;
								}
							}
						}
					}
					if (local388.anInt7385 == Static265.anInt4371) {
						continue;
					}
					Static281.method3697(local388, local360.anInt3903 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99);
					local388.anInt7385 = Static265.anInt4371;
				}
				if (local360.aClass8_1 instanceof Class8_Sub3_Sub1_Sub2) {
					@Pc(713) Class8_Sub3_Sub1_Sub2 local713 = (Class8_Sub3_Sub1_Sub2) local360.aClass8_1;
					if (local713.aClass78_1 != null) {
						if ((local713.aClass78_1.anInt1885 & 0x1) == 0 && (local713.anInt7339 & 0x7F) == 0 && (local713.anInt7343 & 0x7F) == 0 || (local713.aClass78_1.anInt1885 & 0x1) == 1 && (local713.anInt7339 & 0x7F) == 64 && (local713.anInt7343 & 0x7F) == 64) {
							local66 = local713.anInt7339 - (local713.aClass78_1.anInt1885 - 1 << 6);
							local75 = local713.anInt7343 - (local713.aClass78_1.anInt1885 - 1 << 6);
							for (local78 = 0; local78 < Static148.anInt2692; local78++) {
								@Pc(790) Class8_Sub3_Sub1_Sub2 local790 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local78]];
								if (local790 != null && local790.anInt7385 != Static265.anInt4371 && local790 != local713 && local790.aBoolean522) {
									local96 = local790.anInt7339 - (local790.aClass78_1.anInt1885 - 1 << 6);
									local485 = local790.anInt7343 - (local790.aClass78_1.anInt1885 - 1 << 6);
									if (local96 >= local66 && local713.aClass78_1.anInt1885 - (local96 - local66 >> 7) >= local790.aClass78_1.anInt1885 && local485 >= local75 && local790.aClass78_1.anInt1885 <= local713.aClass78_1.anInt1885 - (local485 - local75 >> 7)) {
										Static350.method4632(local360.anInt3903 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, local790);
										local790.anInt7385 = Static265.anInt4371;
									}
								}
							}
							local87 = Static438.anInt2796;
							@Pc(895) int[] local895 = Static78.anIntArray114;
							for (local485 = 0; local485 < local87; local485++) {
								@Pc(905) Class8_Sub3_Sub1_Sub1 local905 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local895[local485]];
								if (local905 != null && local905.anInt7385 != Static265.anInt4371 && local905.aBoolean522) {
									@Pc(928) int local928 = local905.anInt7339 - (local905.method5894() - 1 << 6);
									local143 = local905.anInt7343 - (local905.method5894() - 1 << 6);
									if (local66 <= local928 && local905.method5894() <= local713.aClass78_1.anInt1885 - (local928 - local66 >> 7) && local75 <= local143 && local905.method5894() <= local713.aClass78_1.anInt1885 - (local143 - local75 >> 7)) {
										Static281.method3697(local905, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 != local360.anInt3903);
										local905.anInt7385 = Static265.anInt4371;
									}
								}
							}
						}
						if (local713.anInt7385 == Static265.anInt4371) {
							continue;
						}
						Static350.method4632(local360.anInt3903 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, local713);
						local713.anInt7385 = Static265.anInt4371;
					}
				}
				if (local360.aClass8_1 instanceof Class8_Sub1_Sub1) {
					@Pc(1057) Class4_Sub6 local1057 = (Class4_Sub6) Static41.aClass67_2.method1429((long) (local360.anInt3903 << 28 | local360.anInt3906 << 14 | local360.anInt3908));
					if (local1057 != null) {
						for (@Pc(1065) Class4_Sub36 local1065 = (Class4_Sub36) local1057.aClass244_3.method5267(); local1065 != null; local1065 = (Class4_Sub36) local1057.aClass244_3.method5275()) {
							@Pc(1073) Class80 local1073 = Static416.aClass64_2.method1372(local1065.anInt5276);
							if (!Static70.aBoolean94) {
								if (local360.anInt3903 == Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99) {
									@Pc(1145) String[] local1145 = local1073.aStringArray17;
									for (local87 = 4; local87 >= 0; local87--) {
										if (local1145 != null && local1145[local87] != null) {
											@Pc(1157) byte local1157 = 0;
											if (local87 == 0) {
												local1157 = 51;
											}
											local485 = Static211.anInt3677;
											if (local87 == 1) {
												local1157 = 18;
											}
											if (local87 == 2) {
												local1157 = 57;
											}
											if (local87 == 3) {
												local1157 = 45;
											}
											if (local87 == 4) {
												local1157 = 9;
											}
											if (local87 == local1073.anInt1963) {
												local485 = local1073.anInt2000;
											}
											if (local1073.anInt1961 == local87) {
												local485 = local1073.anInt2004;
											}
											Static391.method5158((long) local1065.anInt5276, -1, local360.anInt3906, local360.anInt3908, local485, "<col=ff9040>" + local1073.aString10, local1157, false, local1145[local87], true);
										}
									}
								}
								Static391.method5158((long) local1065.anInt5276, -1, local360.anInt3906, local360.anInt3908, Static204.anInt3608, "<col=ff9040>" + local1073.aString10, 1001, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 != local360.anInt3903, Static308.aClass15_89.method180(Static429.anInt6999), true);
							} else if (Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local360.anInt3903) {
								@Pc(1090) Class247 local1090 = Static134.anInt2452 == -1 ? null : Static435.aClass240_2.method5128(Static134.anInt2452);
								if ((Static115.anInt2115 & 0x1) != 0 && (local1090 == null || local1073.method1605(local1090.anInt6901, Static134.anInt2452) != local1090.anInt6901)) {
									Static391.method5158((long) local1065.anInt5276, -1, local360.anInt3906, local360.anInt3908, Static111.anInt2085, Static368.aString66 + " -> <col=ff9040>" + local1073.aString10, 48, false, Static304.aString54, true);
								}
							}
						}
					}
				}
				if (local360.aClass8_1 instanceof Interface4) {
					@Pc(1300) Interface4 local1300 = (Interface4) local360.aClass8_1;
					@Pc(1307) Class114 local1307 = Static51.aClass151_1.method2917(local1300.method5603());
					if (local1307.anIntArray235 != null) {
						local1307 = local1307.method2181(Static52.aClass81_1);
					}
					if (local1307 != null) {
						if (!Static70.aBoolean94) {
							if (Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local360.anInt3903) {
								@Pc(1331) String[] local1331 = local1307.aStringArray26;
								if (local1331 != null) {
									for (local78 = 4; local78 >= 0; local78--) {
										if (local1331[local78] != null) {
											@Pc(1343) short local1343 = 0;
											local96 = Static211.anInt3677;
											if (local78 == 0) {
												local1343 = 3;
											}
											if (local78 == 1) {
												local1343 = 59;
											}
											if (local78 == 2) {
												local1343 = 46;
											}
											if (local78 == 3) {
												local1343 = 6;
											}
											if (local1307.anInt2841 == local78) {
												local96 = local1307.anInt2860;
											}
											if (local78 == 4) {
												local1343 = 1002;
											}
											if (local78 == local1307.anInt2836) {
												local96 = local1307.anInt2852;
											}
											Static391.method5158(Static121.method1723(local1300, local360.anInt3906, local360.anInt3908), -1, local360.anInt3906, local360.anInt3908, local96, "<col=00ffff>" + local1307.aString24, local1343, false, local1331[local78], true);
										}
									}
								}
							}
							Static391.method5158((long) local1307.anInt2875, -1, local360.anInt3906, local360.anInt3908, Static204.anInt3608, "<col=00ffff>" + local1307.aString24, 1004, local360.anInt3903 != Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, Static308.aClass15_89.method180(Static429.anInt6999), true);
						} else if (Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local360.anInt3903) {
							@Pc(1490) Class247 local1490 = Static134.anInt2452 == -1 ? null : Static435.aClass240_2.method5128(Static134.anInt2452);
							if ((Static115.anInt2115 & 0x4) != 0 && (local1490 == null || local1307.method2187(local1490.anInt6901, Static134.anInt2452) != local1490.anInt6901)) {
								Static391.method5158(Static121.method1723(local1300, local360.anInt3906, local360.anInt3908), -1, local360.anInt3906, local360.anInt3908, Static111.anInt2085, Static368.aString66 + " -> <col=00ffff>" + local1307.aString24, 44, false, Static304.aString54, true);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
	public static void method618(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static56.aClass4_Sub9_Sub2_1.method5070(Static313.anInt5082) >= 15) {
				@Pc(17) int local17 = Static56.aClass4_Sub9_Sub2_1.method5071(15);
				if (local17 != 32767) {
					@Pc(22) boolean local22 = false;
					if (Static367.aClass8_Sub3_Sub1_Sub2Array1[local17] == null) {
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local17] = new Class8_Sub3_Sub1_Sub2();
						local22 = true;
						Static367.aClass8_Sub3_Sub1_Sub2Array1[local17].anInt7391 = local17;
					}
					@Pc(43) Class8_Sub3_Sub1_Sub2 local43 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local17];
					Static106.anIntArray150[Static148.anInt2692++] = local17;
					local43.anInt7354 = Static265.anInt4371;
					if (local43.aClass78_1 != null && local43.aClass78_1.method1552()) {
						Static277.method3671(local43);
					}
					@Pc(76) int local76 = (Static56.aClass4_Sub9_Sub2_1.method5071(3) + 4 & 0xD5200007) << 11;
					@Pc(83) int local83;
					if (arg0) {
						local83 = Static56.aClass4_Sub9_Sub2_1.method5071(8);
						if (local83 > 127) {
							local83 -= 256;
						}
					} else {
						local83 = Static56.aClass4_Sub9_Sub2_1.method5071(5);
						if (local83 > 15) {
							local83 -= 32;
						}
					}
					@Pc(105) int local105 = Static56.aClass4_Sub9_Sub2_1.method5071(2);
					local43.method5907(Static120.aClass115_2.method2201(Static56.aClass4_Sub9_Sub2_1.method5071(14)));
					@Pc(122) int local122;
					if (arg0) {
						local122 = Static56.aClass4_Sub9_Sub2_1.method5071(8);
						if (local122 > 127) {
							local122 -= 256;
						}
					} else {
						local122 = Static56.aClass4_Sub9_Sub2_1.method5071(5);
						if (local122 > 15) {
							local122 -= 32;
						}
					}
					@Pc(144) int local144 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
					if (local144 == 1) {
						Static351.anIntArray459[Static119.anInt5695++] = local17;
					}
					@Pc(162) int local162 = Static56.aClass4_Sub9_Sub2_1.method5071(1);
					local43.method5901(local43.aClass78_1.anInt1885);
					local43.anInt7406 = local43.aClass78_1.anInt1884 << 3;
					if (local43.anInt7406 == 0) {
						local43.method5889(0);
					} else if (local22) {
						local43.method5889(local76);
					}
					local43.method5905(local162 == 1, local43.method5894(), local105, Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray559[0] + local83, Static401.aClass8_Sub3_Sub1_Sub1_2.anIntArray560[0] - -local122);
					if (local43.aClass78_1.method1552()) {
						Static353.method4676(null, local43.anIntArray559[0], 0, null, local43.anIntArray560[0], local43.aByte99, local43);
					}
					continue;
				}
			}
			Static56.aClass4_Sub9_Sub2_1.method5074();
			return;
		}
	}
}
