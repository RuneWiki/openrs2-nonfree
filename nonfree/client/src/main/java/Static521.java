import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
	public static final int anInt7906 = 1403;

	@OriginalMember(owner = "client!rh", name = "L", descriptor = "[Lclient!gfa;")
	public static final Class117[] aClass117Array2 = new Class117[4];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)I")
	public static int method6952(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(23) int local23 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCE) >>> 2);
		@Pc(40) int local40 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[II[FI[FI[IIIIII)V")
	public static void method6953(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(15) int local15 = arg3 * arg8 + arg7;
		@Pc(21) int local21 = arg5 + arg0 * arg11;
		@Pc(26) int local26 = arg3 - arg9;
		@Pc(30) int local30 = arg11 - arg9;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (arg6 == null) {
			for (local34 = 0; local34 < arg10; local34++) {
				local40 = local15 + arg9;
				while (local40 > local15) {
					arg4[local21++] = arg2[local15++];
				}
				local21 += local30;
				local15 += local26;
			}
		} else if (arg2 == null) {
			for (local34 = 0; local34 < arg10; local34++) {
				local40 = arg9 + local15;
				while (local15 < local40) {
					arg1[local21++] = arg6[local15++];
				}
				local21 += local30;
				local15 += local26;
			}
		} else {
			for (local34 = 0; local34 < arg10; local34++) {
				local40 = arg9 + local15;
				while (local40 > local15) {
					arg1[local21] = arg6[local15];
					arg4[local21++] = arg2[local15++];
				}
				local15 += local26;
				local21 += local30;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLclient!ha;)Lclient!eia;")
	public static Class88 method6955(@OriginalArg(0) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(9) Class368 local9 = Static43.method1103(arg1, true, arg0);
		return local9 == null ? null : local9.aClass88_21;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIII)V")
	public static void method6956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static393.anInt6147;
		@Pc(9) int[] local9 = Static430.anIntArray612;
		Static106.anInt2204 = 0;
		@Pc(177) int local177;
		@Pc(210) int local210;
		@Pc(255) int local255;
		@Pc(331) int local331;
		@Pc(334) int local334;
		@Pc(1138) int local1138;
		@Pc(1184) int local1184;
		@Pc(1186) int local1186;
		@Pc(436) int local436;
		@Pc(1045) int local1045;
		@Pc(561) int local561;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static561.anInt9114; local13++) {
			@Pc(17) Class300 local17 = null;
			@Pc(33) Class28_Sub1_Sub1_Sub1 local33;
			if (local13 >= local7) {
				local33 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) Static131.anIntArray226[local13 - local7])).aClass28_Sub1_Sub1_Sub1_Sub2_1;
				local17 = ((Class28_Sub1_Sub1_Sub1_Sub2) local33).aClass300_1;
				if (local17.anIntArray696 != null) {
					local17 = local17.method7258(Static131.aClass66_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9[local13]];
			}
			if (local33.anInt10803 >= 0 && (Static58.anInt1217 == local33.anInt10777 || local33.aByte174 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174)) {
				Static236.method3939(arg2 >> 1, local33.method9321(), arg3 >> 1, local33);
				if (Static396.anIntArray551[0] >= 0) {
					if (local33.aString125 != null && (local13 >= local7 || Static127.anInt2596 == 0 || Static127.anInt2596 == 3 || Static127.anInt2596 == 1 && Static44.method1111(((Class28_Sub1_Sub1_Sub1_Sub1) local33).aString123)) && Static218.anInt4138 > Static106.anInt2204) {
						Static218.anIntArray367[Static106.anInt2204] = Static59.aClass88_1.method2502(local33.aString125) / 2;
						Static218.anIntArray368[Static106.anInt2204] = Static396.anIntArray551[0];
						Static218.anIntArray369[Static106.anInt2204] = Static396.anIntArray551[1];
						Static218.anIntArray373[Static106.anInt2204] = local33.anInt10754;
						Static218.anIntArray370[Static106.anInt2204] = local33.anInt10794;
						Static218.anIntArray372[Static106.anInt2204] = local33.anInt10809;
						Static218.aStringArray12[Static106.anInt2204] = local33.aString125;
						Static106.anInt2204++;
					}
					local177 = Static396.anIntArray551[1] + arg0;
					@Pc(240) Class33[] local240;
					@Pc(247) Class97[] local247;
					@Pc(303) Class33 local303;
					if (local33.aBoolean819 || local33.anInt10793 <= Static588.anInt9467) {
						local177 -= Math.max(Static59.aClass88_1.anInt2733, Static624.aClass33Array24[0].method7662());
					} else {
						@Pc(192) byte local192 = 1;
						if (local7 > local13) {
							@Pc(205) Class28_Sub1_Sub1_Sub1_Sub1 local205 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9[local13]];
							local210 = local33.method9315().anInt10010;
							if (local205.aBoolean792) {
								local192 = 2;
							}
						} else {
							local210 = local17.anInt8317;
							if (local210 == -1) {
								local210 = local33.method9315().anInt10010;
							}
						}
						@Pc(230) Class33[] local230 = Static624.aClass33Array24;
						if (local210 != -1) {
							local240 = (Class33[]) Static349.aClass165_37.method4389((long) local210);
							if (local240 == null) {
								local247 = Static682.method2750(Static369.aClass15_97, local210);
								if (local247 != null) {
									local240 = new Class33[local247.length];
									for (local255 = 0; local255 < local247.length; local255++) {
										local240[local255] = Static674.aClass13_22.method8465(local247[local255], true);
									}
									Static349.aClass165_37.method4392(local240, (long) local210);
								}
							}
							if (local240 != null && local240.length >= 2) {
								local230 = local240;
							}
						}
						if (local230.length <= local192) {
							local192 = 1;
						}
						@Pc(299) Class33 local299 = local230[0];
						local303 = local230[local192];
						local177 -= Math.max(Static59.aClass88_1.anInt2733, local299.method7662());
						local255 = arg1 + Static396.anIntArray551[0] - (local299.method7659() >> 1);
						local331 = local299.method7659() * local33.anInt10799 / 255;
						local334 = local299.method7662();
						if (local33.anInt10799 > 0 && local331 < 2) {
							local331 = 2;
						}
						local299.method7654(local255, local177);
						Static674.aClass13_22.T(local255, local177, local331 + local255, local177 - -local334);
						local303.method7654(local255, local177);
						Static674.aClass13_22.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
						Static642.method8919(local299.method7645() + local255, local177 + local334, local177, local255);
					}
					local177 -= 2;
					if (!local33.aBoolean819) {
						@Pc(417) Class33 local417;
						@Pc(426) Class33 local426;
						if (local33.anInt10797 > Static588.anInt9467) {
							local417 = Static1.aClass33Array19[local33.aBoolean821 ? 2 : 0];
							local426 = Static1.aClass33Array19[local33.aBoolean821 ? 3 : 1];
							if (local33 instanceof Class28_Sub1_Sub1_Sub1_Sub2) {
								local436 = local17.anInt8304;
								if (local436 == -1) {
									local436 = local33.method9315().anInt10000;
								}
							} else {
								local436 = local33.method9315().anInt10000;
							}
							if (local436 != -1) {
								local240 = (Class33[]) Static291.aClass165_33.method4389((long) local436);
								if (local240 == null) {
									local247 = Static682.method2750(Static369.aClass15_97, local436);
									if (local247 != null) {
										local240 = new Class33[local247.length];
										for (local255 = 0; local255 < local247.length; local255++) {
											local240[local255] = Static674.aClass13_22.method8465(local247[local255], true);
										}
										Static291.aClass165_33.method4392(local240, (long) local436);
									}
								}
								if (local240 != null && local240.length == 4) {
									local417 = local240[local33.aBoolean821 ? 2 : 0];
									local426 = local240[local33.aBoolean821 ? 3 : 1];
								}
							}
							@Pc(527) int local527 = local33.anInt10797 - Static588.anInt9467;
							if (local33.anInt10790 < local527) {
								local527 -= local33.anInt10790;
								local255 = local33.anInt10787 == 0 ? 0 : (local33.anInt10785 - local527) / local33.anInt10787 * local33.anInt10787;
								local561 = local255 * local417.method7659() / local33.anInt10785;
							} else {
								local561 = local417.method7659();
							}
							local255 = local417.method7662();
							local177 -= local255;
							local331 = Static396.anIntArray551[0] + arg1 - (local417.method7659() >> 1);
							local417.method7654(local331, local177);
							Static674.aClass13_22.T(local331, local177, local331 + local561, local177 - -local255);
							local426.method7654(local331, local177);
							Static674.aClass13_22.KA(arg1, arg0, arg1 + arg3, arg0 - -arg2);
							Static642.method8919(local417.method7645() + local331, local177 + local255, local177, local331);
							local177 -= 2;
						}
						if (local7 > local13) {
							@Pc(638) Class28_Sub1_Sub1_Sub1_Sub1 local638 = (Class28_Sub1_Sub1_Sub1_Sub1) local33;
							if (local638.anInt10502 != -1) {
								local177 -= 25;
								local426 = Static65.aClass33Array8[local638.anInt10502];
								local426.method7654(Static396.anIntArray551[0] + arg1 - 12, local177);
								Static642.method8919(Static396.anIntArray551[0] + arg1 + local426.method7645() - 12, local426.method7658() + local177, local177, arg1 + Static396.anIntArray551[0] - 12);
								local177 -= 2;
							}
							if (local638.anInt10499 != -1) {
								local177 -= 25;
								local426 = Static46.aClass33Array5[local638.anInt10499];
								local426.method7654(Static396.anIntArray551[0] + arg1 - 12, local177);
								Static642.method8919(Static396.anIntArray551[0] + arg1 + local426.method7645() - 12, local426.method7658() + local177, local177, Static396.anIntArray551[0] + arg1 - 12);
								local177 -= 2;
							}
						} else if (local17.anInt8300 >= 0 && Static46.aClass33Array5.length > local17.anInt8300) {
							local177 -= 25;
							local417 = Static46.aClass33Array5[local17.anInt8300];
							local417.method7654(arg1 + Static396.anIntArray551[0] - (local417.method7659() >> 1), local177);
							Static642.method8919(arg1 + Static396.anIntArray551[0] - (local417.method7659() >> 1) + local417.method7645(), local177 + local417.method7658(), local177, arg1 + Static396.anIntArray551[0] - (local417.method7659() >> 1));
							local177 -= 2;
						}
					}
					@Pc(806) Class142[] local806;
					@Pc(814) Class142 local814;
					if (!(local33 instanceof Class28_Sub1_Sub1_Sub1_Sub1)) {
						local210 = 0;
						local806 = Static292.aClass142Array1;
						for (local436 = 0; local436 < local806.length; local436++) {
							local814 = local806[local436];
							if (local814 != null && local814.anInt4300 == 1 && Static131.anIntArray226[local13 - local7] == local814.anInt4302) {
								local303 = Static26.aClass33Array2[local814.anInt4303];
								if (local210 < local303.method7662()) {
									local210 = local303.method7662();
								}
								if (Static588.anInt9467 % 20 < 10) {
									local303.method7654(arg1 + Static396.anIntArray551[0] - 12, local177 - local303.method7662());
									Static642.method8919(arg1 + Static396.anIntArray551[0] + local303.method7645() - 12, local177 + -local303.method7662() - -local303.method7658(), local177 - local303.method7662(), Static396.anIntArray551[0] + -12 + arg1);
								}
							}
						}
						if (local210 > 0) {
						}
					} else if (local13 >= 0) {
						local210 = 0;
						local806 = Static292.aClass142Array1;
						for (local436 = 0; local436 < local806.length; local436++) {
							local814 = local806[local436];
							if (local814 != null && local814.anInt4300 == 10 && local9[local13] == local814.anInt4302) {
								local303 = Static26.aClass33Array2[local814.anInt4303];
								if (local210 < local303.method7662()) {
									local210 = local303.method7662();
								}
								local303.method7654(Static396.anIntArray551[0] + arg1 - 12, -local303.method7662() + local177);
								Static642.method8919(Static396.anIntArray551[0] + arg1 + local303.method7645() - 12, -local303.method7662() + (local177 - -local303.method7658()), local177 - local303.method7662(), Static396.anIntArray551[0] + -12 + arg1);
							}
						}
						if (local210 > 0) {
						}
					}
					for (local210 = 0; local210 < Static467.anInt7681; local210++) {
						local1045 = local33.anIntArray952[local210];
						local436 = local33.anIntArray950[local210];
						@Pc(1052) Class246 local1052 = null;
						local561 = 0;
						if (local436 >= 0) {
							if (local1045 <= Static588.anInt9467) {
								continue;
							}
							local1052 = Static138.aClass131_1.method3759(local33.anIntArray950[local210]);
							local561 = local1052.anInt6633;
						} else if (local1045 < 0) {
							continue;
						}
						local255 = local33.anIntArray949[local210];
						@Pc(1084) Class246 local1084 = null;
						if (local255 >= 0) {
							local1084 = Static138.aClass131_1.method3759(local255);
						}
						if (Static588.anInt9467 >= local1045 - local561) {
							local334 = local33.anIntArray951[local210];
							if (local334 >= 0) {
								local33.anInt10793 = Static588.anInt9467 + 300;
								local33.anInt10799 = local334;
								local33.anIntArray951[local210] = -1;
							}
							if (local1052 == null) {
								local33.anIntArray952[local210] = -1;
							} else {
								local1138 = local33.method9321() / 2;
								Static236.method3939(arg2 >> 1, local1138, arg3 >> 1, local33);
								if (Static396.anIntArray551[0] > -1) {
									Static396.anIntArray551[0] += Static192.anIntArray340[local210];
									Static396.anIntArray551[1] += Static382.anIntArray530[local210];
									local1184 = 0;
									local1186 = 0;
									@Pc(1188) int local1188 = 0;
									@Pc(1190) int local1190 = 0;
									@Pc(1192) int local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) Class33 local1200 = null;
									@Pc(1202) Class33 local1202 = null;
									@Pc(1204) Class33 local1204 = null;
									@Pc(1206) Class33 local1206 = null;
									@Pc(1208) int local1208 = 0;
									@Pc(1210) int local1210 = 0;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1220) int local1220 = 0;
									@Pc(1222) int local1222 = 0;
									@Pc(1224) int local1224 = 0;
									@Pc(1229) Class33 local1229 = local1052.method5916(Static674.aClass13_22);
									@Pc(1237) int local1237;
									if (local1229 != null) {
										local1184 = local1229.method7659();
										local1237 = local1229.method7662();
										local1229.method7657(Static270.anIntArray427);
										if (local1237 > 0) {
											local1224 = local1237;
										}
										local1192 = Static270.anIntArray427[0];
									}
									@Pc(1254) Class33 local1254 = local1052.method5913(Static674.aClass13_22);
									if (local1254 != null) {
										local1186 = local1254.method7659();
										local1237 = local1254.method7662();
										local1254.method7657(Static270.anIntArray427);
										if (local1237 > local1224) {
											local1224 = local1237;
										}
										local1194 = Static270.anIntArray427[0];
									}
									@Pc(1283) Class33 local1283 = local1052.method5920(Static674.aClass13_22);
									if (local1283 != null) {
										local1188 = local1283.method7659();
										local1237 = local1283.method7662();
										if (local1237 > local1224) {
											local1224 = local1237;
										}
										local1283.method7657(Static270.anIntArray427);
										local1196 = Static270.anIntArray427[0];
									}
									@Pc(1312) Class33 local1312 = local1052.method5911(Static674.aClass13_22);
									if (local1312 != null) {
										local1190 = local1312.method7659();
										local1237 = local1312.method7662();
										local1312.method7657(Static270.anIntArray427);
										if (local1237 > local1224) {
											local1224 = local1237;
										}
										local1198 = Static270.anIntArray427[0];
									}
									if (local1084 != null) {
										local1200 = local1084.method5916(Static674.aClass13_22);
										if (local1200 != null) {
											local1208 = local1200.method7659();
											local1237 = local1200.method7662();
											if (local1237 > local1224) {
												local1224 = local1237;
											}
											local1200.method7657(Static270.anIntArray427);
											local1216 = Static270.anIntArray427[0];
										}
										local1202 = local1084.method5913(Static674.aClass13_22);
										if (local1202 != null) {
											local1210 = local1202.method7659();
											local1237 = local1202.method7662();
											local1202.method7657(Static270.anIntArray427);
											if (local1237 > local1224) {
												local1224 = local1237;
											}
											local1218 = Static270.anIntArray427[0];
										}
										local1204 = local1084.method5920(Static674.aClass13_22);
										if (local1204 != null) {
											local1212 = local1204.method7659();
											local1237 = local1204.method7662();
											if (local1224 < local1237) {
												local1224 = local1237;
											}
											local1204.method7657(Static270.anIntArray427);
											local1220 = Static270.anIntArray427[0];
										}
										local1206 = local1084.method5911(Static674.aClass13_22);
										if (local1206 != null) {
											local1214 = local1206.method7659();
											local1237 = local1206.method7662();
											local1206.method7657(Static270.anIntArray427);
											if (local1224 < local1237) {
												local1224 = local1237;
											}
											local1222 = Static270.anIntArray427[0];
										}
									}
									@Pc(1444) Class69 local1444 = Static400.aClass69_9;
									@Pc(1446) Class69 local1446 = Static400.aClass69_9;
									@Pc(1448) Class88 local1448 = Static595.aClass88_20;
									local1237 = local1052.anInt6632;
									@Pc(1453) Class88 local1453 = Static595.aClass88_20;
									@Pc(1461) Class69 local1461;
									@Pc(1466) Class88 local1466;
									if (local1237 >= 0) {
										local1461 = Static611.method8673(Static674.aClass13_22, true, local1237);
										local1466 = method6955(local1237, Static674.aClass13_22);
										if (local1461 != null && local1466 != null) {
											local1448 = local1466;
											local1444 = local1461;
										}
									}
									if (local1084 != null) {
										local1237 = local1084.anInt6632;
										if (local1237 >= 0) {
											local1461 = Static611.method8673(Static674.aClass13_22, true, local1237);
											local1466 = method6955(local1237, Static674.aClass13_22);
											if (local1461 != null && local1466 != null) {
												local1453 = local1466;
												local1446 = local1461;
											}
										}
									}
									@Pc(1507) String local1507 = null;
									@Pc(1511) int local1511 = 0;
									@Pc(1519) String local1519 = local1052.method5912(local33.anIntArray948[local210]);
									@Pc(1524) int local1524 = local1448.method2502(local1519);
									if (local1084 != null) {
										local1507 = local1084.method5912(local33.anIntArray947[local210]);
										local1511 = local1453.method2502(local1507);
									}
									@Pc(1541) int local1541 = 0;
									@Pc(1543) int local1543 = 0;
									if (local1186 > 0) {
										local1541 = local1524 / local1186 + 1;
									}
									if (local1084 != null && local1210 > 0) {
										local1543 = local1511 / local1210 + 1;
									}
									@Pc(1569) int local1569 = 0;
									if (local1184 > 0) {
										local1569 = local1184;
									}
									local1569 += 2;
									@Pc(1580) int local1580 = local1569;
									if (local1188 > 0) {
										local1569 += local1188;
									}
									@Pc(1588) int local1588 = local1569;
									@Pc(1590) int local1590 = local1569;
									@Pc(1596) int local1596;
									if (local1186 > 0) {
										local1596 = local1186 * local1541;
										local1590 = local1569 + (local1596 - local1524) / 2;
										local1569 += local1596;
									} else {
										local1569 += local1524;
									}
									local1596 = local1569;
									if (local1190 > 0) {
										local1569 += local1190;
									}
									@Pc(1625) int local1625 = 0;
									@Pc(1627) int local1627 = 0;
									@Pc(1629) int local1629 = 0;
									@Pc(1631) int local1631 = 0;
									@Pc(1633) int local1633 = 0;
									@Pc(1666) int local1666;
									if (local1084 != null) {
										local1569 += 2;
										local1625 = local1569;
										if (local1208 > 0) {
											local1569 += local1208;
										}
										local1569 += 2;
										local1627 = local1569;
										if (local1212 > 0) {
											local1569 += local1212;
										}
										local1629 = local1569;
										local1633 = local1569;
										if (local1210 > 0) {
											local1666 = local1543 * local1210;
											local1569 += local1666;
											local1633 += (local1666 - local1511) / 2;
										} else {
											local1569 += local1511;
										}
										local1631 = local1569;
										if (local1214 > 0) {
											local1569 += local1214;
										}
									}
									local1666 = local33.anIntArray952[local210] - Static588.anInt9467;
									@Pc(1711) int local1711 = local1052.anInt6621 - local1052.anInt6621 * local1666 / local1052.anInt6633;
									@Pc(1723) int local1723 = local1052.anInt6626 * local1666 / local1052.anInt6633 - local1052.anInt6626;
									@Pc(1738) int local1738 = arg1 + Static396.anIntArray551[0] + local1711 - (local1569 >> 1);
									@Pc(1749) int local1749 = local1723 + arg0 + Static396.anIntArray551[1] - 12;
									@Pc(1751) int local1751 = local1749;
									@Pc(1755) int local1755 = local1224 + local1749;
									@Pc(1762) int local1762 = local1052.anInt6615 + local1749 + 15;
									@Pc(1768) int local1768 = local1762 - local1448.anInt2733;
									if (local1749 > local1768) {
										local1751 = local1768;
									}
									@Pc(1782) int local1782 = local1448.anInt2731 + local1762;
									if (local1755 < local1782) {
										local1755 = local1782;
									}
									@Pc(1789) int local1789 = 0;
									@Pc(1804) int local1804;
									@Pc(1818) int local1818;
									if (local1084 != null) {
										local1789 = local1084.anInt6615 + local1749 + 15;
										local1804 = local1789 - local1453.anInt2733;
										if (local1804 < local1751) {
											local1751 = local1804;
										}
										local1818 = local1453.anInt2731 + local1789;
										if (local1818 > local1755) {
											local1755 = local1818;
										}
									}
									local1804 = 255;
									if (local1052.anInt6637 >= 0) {
										local1804 = (local1666 << 8) / (local1052.anInt6633 - local1052.anInt6637);
									}
									if (local1804 >= 0 && local1804 < 255) {
										local1818 = local1804 << 24;
										@Pc(2003) int local2003 = local1818 | 0xFFFFFF;
										if (local1229 != null) {
											local1229.method7644(local1738 - local1192, local1749, 0, local2003, 1);
										}
										if (local1283 != null) {
											local1283.method7644(local1580 + local1738 - local1196, local1749, 0, local2003, 1);
										}
										@Pc(2034) int local2034;
										if (local1254 != null) {
											for (local2034 = 0; local2034 < local1541; local2034++) {
												local1254.method7644(local1588 + local1738 + local2034 * local1186 - local1194, local1749, 0, local2003, 1);
											}
										}
										if (local1312 != null) {
											local1312.method7644(local1596 + local1738 - local1198, local1749, 0, local2003, 1);
										}
										local1444.method8862(local1762, 0, local1519, local1052.anInt6636 | local1818, local1590 + local1738);
										if (local1084 != null) {
											if (local1200 != null) {
												local1200.method7644(local1738 + local1625 - local1216, local1749, 0, local2003, 1);
											}
											if (local1204 != null) {
												local1204.method7644(local1738 + local1627 - local1220, local1749, 0, local2003, 1);
											}
											if (local1202 != null) {
												for (local2034 = 0; local2034 < local1543; local2034++) {
													local1202.method7644(local1629 + local1738 + local2034 * local1210 - local1218, local1749, 0, local2003, 1);
												}
											}
											if (local1206 != null) {
												local1206.method7644(local1738 + local1631 - local1222, local1749, 0, local2003, 1);
											}
											local1446.method8862(local1789, 0, local1507, local1818 | local1084.anInt6636, local1633 + local1738);
										}
									} else {
										if (local1229 != null) {
											local1229.method7654(local1738 - local1192, local1749);
										}
										if (local1283 != null) {
											local1283.method7654(local1738 + local1580 - local1196, local1749);
										}
										if (local1254 != null) {
											for (local1818 = 0; local1818 < local1541; local1818++) {
												local1254.method7654(local1738 + local1588 + local1818 * local1186 - local1194, local1749);
											}
										}
										if (local1312 != null) {
											local1312.method7654(local1738 + local1596 - local1198, local1749);
										}
										local1444.method8862(local1762, 0, local1519, local1052.anInt6636 | 0xFF000000, local1590 + local1738);
										if (local1084 != null) {
											if (local1200 != null) {
												local1200.method7654(local1625 + local1738 - local1216, local1749);
											}
											if (local1204 != null) {
												local1204.method7654(local1627 + local1738 - local1220, local1749);
											}
											if (local1202 != null) {
												for (local1818 = 0; local1818 < local1543; local1818++) {
													local1202.method7654(local1629 + local1738 + local1818 * local1210 - local1218, local1749);
												}
											}
											if (local1206 != null) {
												local1206.method7654(local1738 + local1631 - local1222, local1749);
											}
											local1446.method8862(local1789, 0, local1507, local1084.anInt6636 | 0xFF000000, local1633 + local1738);
										}
									}
									Static642.method8919(local1738 + local1569, local1755 + 1, local1751, local1738);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2203) int local2203;
		for (@Pc(2197) int local2197 = 0; local2197 < Static37.anInt840; local2197++) {
			local2203 = Static304.anIntArray453[local2197];
			@Pc(2210) Class28_Sub1_Sub1_Sub1 local2210;
			if (local2203 < 2048) {
				local2210 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local2203];
			} else {
				local2210 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) (local2203 - 2048))).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
			local210 = Static460.anIntArray647[local2197];
			@Pc(2235) Class28_Sub1_Sub1_Sub1 local2235;
			if (local210 < 2048) {
				local2235 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local210];
			} else {
				local2235 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) (local210 - 2048))).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			}
			Static232.method3917(local2210, arg0, arg1, --local2210.anInt10770, arg3, arg2, local2235);
		}
		local2203 = Static59.aClass88_1.anInt2733 + Static59.aClass88_1.anInt2731 + 2;
		for (local177 = 0; local177 < Static106.anInt2204; local177++) {
			local210 = Static218.anIntArray368[local177];
			local1045 = Static218.anIntArray369[local177];
			local436 = Static218.anIntArray367[local177];
			@Pc(2299) boolean local2299 = true;
			while (local2299) {
				local2299 = false;
				for (local561 = 0; local561 < local177; local561++) {
					if (local1045 + 2 > Static218.anIntArray369[local561] + -local2203 && Static218.anIntArray369[local561] + 2 > -local2203 + local1045 && local210 - local436 < Static218.anIntArray367[local561] + Static218.anIntArray368[local561] && local210 + local436 > Static218.anIntArray368[local561] + -Static218.anIntArray367[local561] && Static218.anIntArray369[local561] - local2203 < local1045) {
						local1045 = Static218.anIntArray369[local561] - local2203;
						local2299 = true;
					}
				}
			}
			Static218.anIntArray369[local177] = local1045;
			@Pc(2393) String local2393 = Static218.aStringArray12[local177];
			local255 = Static59.aClass88_1.method2502(local2393);
			local331 = arg1 + local210;
			local334 = arg0 + local1045 - Static59.aClass88_1.anInt2733;
			local1138 = local331 + local255;
			@Pc(2423) int local2423 = arg0 + local1045 + Static59.aClass88_1.anInt2731;
			if (Static42.anInt973 == 0) {
				@Pc(2456) int local2456 = 16776960;
				if (Static218.anIntArray373[local177] < 6) {
					local2456 = Static259.anIntArray419[Static218.anIntArray373[local177]];
				}
				if (Static218.anIntArray373[local177] == 6) {
					local2456 = Static58.anInt1217 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static218.anIntArray373[local177] == 7) {
					local2456 = Static58.anInt1217 % 20 >= 10 ? 65535 : 255;
				}
				if (Static218.anIntArray373[local177] == 8) {
					local2456 = Static58.anInt1217 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2527) int local2527;
				if (Static218.anIntArray373[local177] == 9) {
					local2527 = 150 - Static218.anIntArray372[local177];
					if (local2527 < 50) {
						local2456 = local2527 * 1280 + 16711680;
					} else if (local2527 < 100) {
						local2456 = 16776960 - (local2527 - 50) * 327680;
					} else if (local2527 < 150) {
						local2456 = local2527 * 5 + 65280 - 500;
					}
				}
				if (Static218.anIntArray373[local177] == 10) {
					local2527 = 150 - Static218.anIntArray372[local177];
					if (local2527 < 50) {
						local2456 = local2527 * 5 + 16711680;
					} else if (local2527 < 100) {
						local2456 = 16384000 + 16711935 - local2527 * 327680;
					} else if (local2527 < 150) {
						local2456 = local2527 * 327680 + 500 + 255 - local2527 * 5 - 32768000;
					}
				}
				if (Static218.anIntArray373[local177] == 11) {
					local2527 = 150 - Static218.anIntArray372[local177];
					if (local2527 < 50) {
						local2456 = 16777215 - local2527 * 327685;
					} else if (local2527 < 100) {
						local2456 = (local2527 - 50) * 327685 + 65280;
					} else if (local2527 < 150) {
						local2456 = 16777215 - (local2527 - 100) * 327680;
					}
				}
				local2527 = local2456 | 0xFF000000;
				if (Static218.anIntArray370[local177] == 0) {
					local331 -= local255 >> 1;
					Static303.aClass69_6.method8858(arg1 + local210, -16777216, local2527, local2393, local1045 + arg0);
					local1138 -= local255 >> 1;
				}
				if (Static218.anIntArray370[local177] == 1) {
					local1138 -= local255 >> 1;
					local334 -= 5;
					local331 -= local255 >> 1;
					Static303.aClass69_6.method8855(Static58.anInt1217, arg0 + local1045, local2393, local2527, local210 + arg1);
					local2423 += 5;
				}
				if (Static218.anIntArray370[local177] == 2) {
					local1138 -= (local255 >> 1) - 5;
					local2423 += 5;
					local331 -= (local255 >> 1) + 5;
					Static303.aClass69_6.method8852(arg1 + local210, local2527, arg0 + local1045, local2393, Static58.anInt1217);
					local334 -= 5;
				}
				if (Static218.anIntArray370[local177] == 3) {
					local334 -= 7;
					local1138 -= local255 >> 1;
					local2423 += 7;
					Static303.aClass69_6.method8857(arg1 + local210, Static58.anInt1217, 150 - Static218.anIntArray372[local177], local2527, local1045 + arg0, local2393);
					local331 -= local255 >> 1;
				}
				@Pc(2838) int local2838;
				if (Static218.anIntArray370[local177] == 4) {
					local2838 = (150 - Static218.anIntArray372[local177]) * (Static59.aClass88_1.method2502(local2393) + 100) / 150;
					Static674.aClass13_22.T(arg1 + local210 - 50, arg0, local210 + arg1 + 50, arg2 + arg0);
					local1138 += 50 - local2838;
					Static303.aClass69_6.method8862(local1045 + arg0, -16777216, local2393, local2527, arg1 + local210 + 50 - local2838);
					local331 += 50 - local2838;
					Static674.aClass13_22.KA(arg1, arg0, arg1 + arg3, arg0 + arg2);
				}
				if (Static218.anIntArray370[local177] == 5) {
					local2838 = 150 - Static218.anIntArray372[local177];
					local1184 = 0;
					if (local2838 < 25) {
						local1184 = local2838 - 25;
					} else if (local2838 > 125) {
						local1184 = local2838 - 125;
					}
					local1186 = Static59.aClass88_1.anInt2731 + Static59.aClass88_1.anInt2733;
					Static674.aClass13_22.T(arg1, arg0 + local1045 - local1186 - 1, arg1 - -arg3, arg0 + local1045 + 5);
					local2423 += local1184;
					Static303.aClass69_6.method8858(local210 + arg1, -16777216, local2527, local2393, local1045 + arg0 + local1184);
					local331 -= local255 >> 1;
					local1138 -= local255 >> 1;
					local334 += local1184;
					Static674.aClass13_22.KA(arg1, arg0, arg1 + arg3, arg2 + arg0);
				}
			} else {
				Static303.aClass69_6.method8858(arg1 + local210, -16777216, -256, local2393, arg0 + local1045);
				local1138 -= local255 >> 1;
				local331 -= local255 >> 1;
			}
			Static642.method8919(local1138 + 1, local2423 + 1, local334, local331);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZIIIIBIF)[[I")
	public static int[][] method6957(@OriginalArg(8) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class3_Sub9_Sub7 local11 = new Class3_Sub9_Sub7();
		local11.anInt2250 = (int) (arg0 * 4096.0F);
		local11.anInt2252 = 4;
		local11.aBoolean186 = false;
		local11.anInt2261 = 4;
		local11.anInt2253 = 3;
		local11.method9163();
		Static230.method3909(64, 256);
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			local11.method2076(local7[local43], local43);
		}
		return local7;
	}
}
