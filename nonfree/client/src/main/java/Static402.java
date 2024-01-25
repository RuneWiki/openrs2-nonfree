import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "Z")
	public static boolean aBoolean543;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "Lclient!aaa;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	public static int anInt7080;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_54 = new Class277(8);

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_103 = new Class252(29, 8);

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "S")
	public static short aShort90 = 320;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(14) int local14 = arg6 + arg2;
		for (@Pc(16) int local16 = arg6; local16 < local14; local16++) {
			Static313.method5430(arg0, arg1, Static143.anIntArrayArray33[local16], arg3);
		}
		@Pc(35) int local35 = arg0 - arg2;
		@Pc(39) int local39 = arg2 + arg3;
		for (@Pc(41) int local41 = arg4; local41 > local10; local41--) {
			Static313.method5430(arg0, arg1, Static143.anIntArrayArray33[local41], arg3);
		}
		for (@Pc(57) int local57 = local14; local57 <= local10; local57++) {
			@Pc(75) int[] local75 = Static143.anIntArrayArray33[local57];
			Static313.method5430(local39, arg1, local75, arg3);
			Static313.method5430(local35, arg5, local75, local39);
			Static313.method5430(arg0, arg1, local75, local35);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method6385() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static258.aBooleanArray17[local3] = true;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII[Lclient!et;IIIII)V")
	public static void method6388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class91[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
		for (@Pc(20) int local20 = 0; local20 < arg4.length; local20++) {
			@Pc(26) Class91 local26 = arg4[local20];
			if (local26 != null && (local26.anInt2375 == arg5 || arg5 == -1412584499 && local26 == Static360.aClass91_10)) {
				@Pc(65) int local65;
				if (arg3 == -1) {
					Class194.aRectangleArray2[Static260.anInt5066].setBounds(arg6 + local26.anInt2423, local26.anInt2409 + arg1, local26.anInt2399, local26.anInt2378);
					local65 = Static260.anInt5066++;
				} else {
					local65 = arg3;
				}
				local26.anInt2403 = Static445.anInt7791;
				local26.anInt2433 = local65;
				if (!Static63.method1575(local26)) {
					if (local26.anInt2429 != 0) {
						Static484.method7506(local26);
					}
					@Pc(89) int local89 = arg6 + local26.anInt2423;
					@Pc(95) int local95 = local26.anInt2409 + arg1;
					@Pc(98) int local98 = local26.anInt2439;
					if (Static428.aBoolean561 && (Static63.method1580(local26).anInt1806 != 0 || local26.anInt2452 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (Static360.aClass91_10 == local26) {
						if (arg5 != -1412584499 && (local26.anInt2389 == Static31.anInt8141 || Static65.anInt1634 == local26.anInt2389)) {
							Static165.anInt3315 = arg6;
							Static388.anInt6884 = arg1;
							Static491.aClass91Array1 = arg4;
							continue;
						}
						if (Static218.aBoolean336 && Static276.aBoolean647) {
							local152 = Static10.aClass99_1.method6618();
							local156 = Static10.aClass99_1.method6619();
							local156 -= Static121.anInt2499;
							local152 -= Static342.anInt6325;
							if (local152 < Static497.anInt1561) {
								local152 = Static497.anInt1561;
							}
							if (local156 < Static67.anInt1732) {
								local156 = Static67.anInt1732;
							}
							if (local26.anInt2399 + local152 > Static441.aClass91_13.anInt2399 + Static497.anInt1561) {
								local152 = Static497.anInt1561 + Static441.aClass91_13.anInt2399 - local26.anInt2399;
							}
							local89 = local152;
							if (local26.anInt2378 + local156 > Static67.anInt1732 - -Static441.aClass91_13.anInt2378) {
								local156 = Static441.aClass91_13.anInt2378 + Static67.anInt1732 - local26.anInt2378;
							}
							local95 = local156;
						}
						if (local26.anInt2389 == Static65.anInt1634) {
							local98 = 128;
						}
					}
					@Pc(251) int local251;
					@Pc(245) int local245;
					@Pc(259) int local259;
					@Pc(264) int local264;
					if (local26.anInt2452 == 2) {
						local245 = arg8;
						local152 = arg2;
						local156 = arg0;
						local251 = arg7;
					} else {
						local259 = local89 + local26.anInt2399;
						local264 = local26.anInt2378 + local95;
						if (local26.anInt2452 == 9) {
							local264++;
							local259++;
						}
						local152 = arg2 >= local89 ? arg2 : local89;
						local156 = local95 > arg0 ? local95 : arg0;
						local245 = local264 < arg8 ? local264 : arg8;
						local251 = local259 >= arg7 ? arg7 : local259;
					}
					if (local251 > local152 && local156 < local245) {
						@Pc(536) int local536;
						@Pc(547) int local547;
						@Pc(642) int local642;
						@Pc(503) int local503;
						@Pc(534) int local534;
						if (local26.anInt2429 != 0) {
							if (local26.anInt2429 == Static429.anInt7441 || local26.anInt2429 == Static274.anInt5247) {
								Static74.method1731(local95, local26.anInt2399, Static274.anInt5247 == local26.anInt2429, local89, local26.anInt2378);
								Static258.aBooleanArray17[local65] = true;
								Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
								continue;
							}
							if (local26.anInt2429 == Static155.anInt3070) {
								if (local26.method2287(Static455.aClass4_11) != null) {
									Static422.method6584();
									Static503.method5026(local26, local89, local95, Static455.aClass4_11);
									Static266.aBooleanArray18[local65] = true;
									Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
								}
								continue;
							}
							if (local26.anInt2429 == Static262.anInt5078) {
								if (local26.method2287(Static455.aClass4_11) != null) {
									Static431.method6701(local89, local95, local26);
									Static266.aBooleanArray18[local65] = true;
									Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
								}
								continue;
							}
							if (local26.anInt2429 == Static215.anInt4291) {
								Static262.method4708(Static455.aClass4_11, local26.anInt2378, Static67.anInterface13_6, local89, local95, local26.anInt2399);
								Static258.aBooleanArray17[local65] = true;
								Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
								continue;
							}
							if (local26.anInt2429 == Static197.anInt4012) {
								Static534.method8126(local26.anInt2378, Static455.aClass4_11, local26.anInt2399, local89, local95);
								Static258.aBooleanArray17[local65] = true;
								Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
								continue;
							}
							if (Static365.anInt6585 == local26.anInt2429) {
								if (!Static520.aBoolean687 && !Static148.aBoolean251) {
									continue;
								}
								local259 = local89 + local26.anInt2399;
								local264 = local95 + 15;
								if (Static520.aBoolean687) {
									local503 = -256;
									if (Static10.anInt280 < 20) {
										local503 = -65536;
									}
									Static186.aClass36_1.method7949("Fps:" + Static10.anInt280, local503, local259, local264);
									local264 += 15;
									@Pc(525) Runtime local525 = Runtime.getRuntime();
									local534 = (int) ((local525.totalMemory() - local525.freeMemory()) / 1024L);
									local536 = -256;
									if (local534 > 65536) {
										local536 = -65536;
										if (Static23.aBoolean55) {
											Static341.method5720();
											for (local547 = 0; local547 < 10; local547++) {
												System.gc();
											}
											local534 = (int) ((local525.totalMemory() - local525.freeMemory()) / 1024L);
											if (local534 > 65536) {
												Static484.method7507("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static186.aClass36_1.method7949("Mem:" + local534 + "k", local536, local259, local264);
									local264 += 15;
									Static186.aClass36_1.method7949("In:" + Static282.anInt5383 + "B/s Out:" + Static175.anInt3472 + "B/s", -256, local259, local264);
									local264 += 15;
									local547 = Static455.aClass4_11.U() / 1024;
									Static186.aClass36_1.method7949("Offheap:" + local547 + "k", local547 <= 65536 ? -256 : -65536, local259, local264);
									local264 += 15;
									local642 = 0;
									@Pc(644) int local644 = 0;
									@Pc(646) int local646 = 0;
									for (@Pc(648) int local648 = 0; local648 < 32; local648++) {
										local642 += Static161.aClass235_Sub1Array1[local648].method6225();
										local644 += Static161.aClass235_Sub1Array1[local648].method6223();
										local646 += Static161.aClass235_Sub1Array1[local648].method6224();
									}
									@Pc(684) int local684 = local646 * 100 / local642;
									@Pc(690) int local690 = local644 * 10000 / local642;
									@Pc(710) String local710 = "Cache:" + Static405.method6457((long) local690, true, 0, 2) + "% (" + local684 + "%)";
									Static403.aClass36_3.method7949(local710, -256, local259, local264);
									local264 += 12;
								}
								if (Static460.anInt7966 > 0) {
									Static403.aClass36_3.method7949("Particles: " + Static437.anInt4598 + " / " + Static460.anInt7966, -256, local259, local264);
								}
								local264 += 12;
								if (Static148.aBoolean251) {
									Static403.aClass36_3.method7949("Polys: " + Static455.aClass4_11.YA() + " Models: " + Static455.aClass4_11.ba(), -256, local259, local264);
									local264 += 12;
									Static403.aClass36_3.method7949("Ls: " + Static23.anInt670 + " La: " + Static342.anInt6315 + " NPC: " + Static253.anInt4946 + " Pl: " + Static144.anInt2851, -256, local259, local264);
									Static329.method5605();
									local264 += 12;
								}
								Static258.aBooleanArray17[local65] = true;
								continue;
							}
						}
						if (local26.anInt2452 == 0) {
							if (local26.anInt2429 == Static213.anInt4240 && Static455.aClass4_11.method7182()) {
								Static455.aClass4_11.method7169(local89, local95, local26.anInt2399, local26.anInt2378);
							}
							method6388(local156, local95 - local26.anInt2406, local152, local65, arg4, local26.anInt2368, local89 - local26.anInt2449, local251, local245);
							if (local26.lb != null) {
								method6388(local156, local95 - local26.anInt2406, local152, local65, local26.lb, local26.anInt2368, local89 - local26.anInt2449, local251, local245);
							}
							@Pc(878) Class1_Sub35 local878 = (Class1_Sub35) Static362.aClass230_45.method6144((long) local26.anInt2368);
							if (local878 != null) {
								Static111.method2223(local65, local878.anInt5502, local152, local89, local156, local245, local251, local95);
							}
							if (local26.anInt2429 == Static213.anInt4240 && Static455.aClass4_11.method7182()) {
								Static455.aClass4_11.method7161();
								Static27.aBoolean62 = true;
							}
							Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
						}
						if (Static272.aBooleanArray19[local65] || Static44.anInt9301 > 1) {
							if (local26.anInt2452 == 3) {
								if (local98 == 0) {
									if (local26.aBoolean199) {
										Static455.aClass4_11.f(local89, local95, local26.anInt2399, local26.anInt2378, local26.anInt2394, 0);
									} else {
										Static455.aClass4_11.method7181(local89, local95, local26.anInt2399, local26.anInt2378, local26.anInt2394, 0);
									}
								} else if (local26.aBoolean199) {
									Static455.aClass4_11.f(local89, local95, local26.anInt2399, local26.anInt2378, 255 - (local98 & 0xFF) << 24 | local26.anInt2394 & 0xFFFFFF, 1);
								} else {
									Static455.aClass4_11.method7181(local89, local95, local26.anInt2399, local26.anInt2378, 255 - (local98 & 0xFF) << 24 | local26.anInt2394 & 0xFFFFFF, 1);
								}
							} else if (local26.anInt2452 == 4) {
								@Pc(1018) Class36 local1018 = local26.method2289(Static455.aClass4_11);
								if (local1018 != null) {
									local264 = local26.anInt2394;
									@Pc(1033) String local1033 = local26.aString51;
									if (local26.anInt2391 != -1) {
										@Pc(1043) Class180 local1043 = Static181.aClass316_1.method8107(local26.anInt2391);
										local1033 = local1043.aString121;
										if (local1033 == null) {
											local1033 = "null";
										}
										if ((local1043.anInt5433 == 1 || local26.anInt2434 != 1) && local26.anInt2434 != -1) {
											local1033 = "<col=ff9040>" + local1033 + "</col> x" + Static533.method8113(local26.anInt2434);
										}
									}
									if (Static447.aClass91_14 == local26) {
										local1033 = Static292.aClass45_86.method1474(Static544.anInt7853);
										local264 = local26.anInt2394;
									}
									if (Static212.aBoolean334) {
										Static455.aClass4_11.F(local89, local95, local89 + local26.anInt2399, local95 - -local26.anInt2378);
									}
									local1018.method7962(null, 0, Static62.aClass104Array15, local26.aBoolean198 ? 255 - (local98 & 0xFF) << 24 : -1, local95, local26.anInt2402, local26.anInt2378, local1033, local89, 0, null, local26.anInt2384, local26.anInt2364, local26.anInt2399, local26.anInt2447, 255 - (local98 & 0xFF) << 24 | local264);
									if (Static212.aBoolean334) {
										Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
									}
								} else if (Static425.aBoolean560) {
									Static243.method4316(local26);
								}
							} else {
								@Pc(1268) int local1268;
								if (local26.anInt2452 == 5) {
									if (local26.anInt2418 >= 0) {
										local26.method2272(Static435.aClass280_1, aClass2_1).method1795(local26.anInt2387 << 3, local26.anInt2378, local26.anInt2388 << 3, 0, Static455.aClass4_11, local95, 0, local26.anInt2399, local89);
									} else {
										@Pc(1227) Class104 local1227;
										if (local26.anInt2391 == -1) {
											local1227 = local26.method2278(Static455.aClass4_11);
										} else {
											@Pc(1209) Class225 local1209 = local26.aBoolean195 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null;
											local1227 = Static181.aClass316_1.method8103(local26.anInt2434, local26.anInt2391, Static455.aClass4_11, local26.anInt2428 | 0xFF000000, local26.anInt2451, local26.anInt2408, local1209);
										}
										if (local1227 != null) {
											local264 = local1227.EA();
											local503 = local1227.ma();
											local1268 = (local26.anInt2394 == 0 ? 16777215 : local26.anInt2394 & 0xFFFFFF) | 255 - (local98 & 0xFF) << 24;
											if (local26.aBoolean196) {
												Static455.aClass4_11.F(local89, local95, local26.anInt2399 + local89, local95 + local26.anInt2378);
												if (local26.anInt2437 != 0) {
													local534 = (local26.anInt2399 + local264 - 1) / local264;
													local536 = (local26.anInt2378 + local503 - 1) / local503;
													for (local547 = 0; local547 < local534; local547++) {
														for (local642 = 0; local642 < local536; local642++) {
															if (local26.anInt2394 == 0) {
																local1227.method7714((float) local264 / 2.0F + (float) (local547 * local264 + local89), (float) (local95 + local642 * local503) + (float) local503 / 2.0F, 4096, local26.anInt2437);
															} else {
																local1227.method7708((float) local264 / 2.0F + (float) (local89 + local264 * local547), (float) local503 / 2.0F + (float) (local642 * local503 + local95), 4096, local26.anInt2437, local1268);
															}
														}
													}
												} else if (local26.anInt2394 == 0 && local98 == 0) {
													local1227.method7712(local89, local95, local26.anInt2399, local26.anInt2378);
												} else {
													local1227.i(local89, local95, local26.anInt2399, local26.anInt2378, 0, local1268, 1);
												}
												Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
											} else if (local26.anInt2394 == 0 && local98 == 0) {
												if (local26.anInt2437 != 0) {
													local1227.method7714((float) local89 + (float) local26.anInt2399 / 2.0F, (float) local26.anInt2378 / 2.0F + (float) local95, local26.anInt2399 * 4096 / local264, local26.anInt2437);
												} else if (local264 == local26.anInt2399 && local503 == local26.anInt2378) {
													local1227.method7716(local89, local95);
												} else {
													local1227.method7707(local89, local95, local26.anInt2399, local26.anInt2378);
												}
											} else if (local26.anInt2437 != 0) {
												local1227.method7708((float) local26.anInt2399 / 2.0F + (float) local89, (float) local95 + (float) local26.anInt2378 / 2.0F, local26.anInt2399 * 4096 / local264, local26.anInt2437, local1268);
											} else if (local26.anInt2399 == local264 && local503 == local26.anInt2378) {
												local1227.DA(local89, local95, 0, local1268, 1);
											} else {
												local1227.ra(local89, local95, local26.anInt2399, local26.anInt2378, 0, local1268, 1);
											}
										} else if (Static425.aBoolean560) {
											Static243.method4316(local26);
										}
									}
								} else if (local26.anInt2452 == 6) {
									Static197.method3753();
									@Pc(1569) Class97 local1569 = null;
									local264 = 0;
									@Pc(1603) Class176 local1603;
									@Pc(1611) Class225 local1611;
									if (local26.anInt2391 != -1) {
										@Pc(1582) Class180 local1582 = Static181.aClass316_1.method8107(local26.anInt2391);
										if (local1582 != null) {
											local1582 = local1582.method4969(local26.anInt2434);
											local1603 = local26.anInt2424 == -1 ? null : Static35.aClass152_1.method4045(local26.anInt2424);
											local1611 = local26.aBoolean195 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null;
											local1569 = local1582.method4981(2048, local26.anInt2381, local1603, local1611, local26.anInt2393, local26.anInt2369, Static455.aClass4_11, 1);
											if (local1569 == null) {
												Static243.method4316(local26);
											} else {
												local264 = -local1569.TA() >> 1;
											}
										}
									} else if (local26.anInt2405 == 5) {
										local503 = local26.anInt2401;
										if (local503 >= 0 && local503 < 2048) {
											@Pc(1663) Class20_Sub1_Sub1_Sub1 local1663 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local503];
											@Pc(1675) Class176 local1675 = local26.anInt2424 == -1 ? null : Static35.aClass152_1.method4045(local26.anInt2424);
											if (local1663 != null && (local503 == Static16.anInt9513 || method6391(local1663.aString13) == local26.anInt2455)) {
												local1569 = local1663.aClass225_1.method5976(0, Static358.aClass95_1, local26.anInt2369, Static35.aClass152_1, -1, null, Static398.aClass167_1, 0, Static181.aClass316_1, Static455.aClass4_11, Static10.aClass179_1, 2048, Static417.aClass10_1, local26.anInt2381, local26.anInt2393, local1675, null);
											}
										}
									} else if (local26.anInt2405 == 8 || local26.anInt2405 == 9) {
										@Pc(1732) Class1_Sub8 local1732 = Static271.method4828(local26.anInt2401, false);
										local1603 = local26.anInt2424 == -1 ? null : Static35.aClass152_1.method4045(local26.anInt2424);
										if (local1732 != null) {
											local1611 = local26.aBoolean195 ? Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1 : null;
											local1569 = local1732.method1693(local26.anInt2381, local26.anInt2405 == 9, local26.anInt2393, local26.anInt2369, local1611, Static455.aClass4_11, local26.anInt2455, local1603);
										}
									} else if (local26.anInt2424 == -1) {
										local1569 = local26.method2279(0, Static417.aClass10_1, Static10.aClass179_1, Static455.aClass4_11, 2048, Static181.aClass316_1, Static35.aClass152_1, Static358.aClass95_1, -1, null, Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1, Static398.aClass167_1, -1);
										if (local1569 == null && Static425.aBoolean560) {
											Static243.method4316(local26);
										}
									} else {
										@Pc(1790) Class176 local1790 = Static35.aClass152_1.method4045(local26.anInt2424);
										local1569 = local26.method2279(local26.anInt2393, Static417.aClass10_1, Static10.aClass179_1, Static455.aClass4_11, 2048, Static181.aClass316_1, Static35.aClass152_1, Static358.aClass95_1, local26.anInt2381, local1790, Static107.aClass20_Sub1_Sub1_Sub1_1.aClass225_1, Static398.aClass167_1, local26.anInt2369);
										if (local1569 == null && Static425.aBoolean560) {
											Static243.method4316(local26);
										}
									}
									if (local1569 != null) {
										if (local26.anInt2416 > 0) {
											local503 = (local26.anInt2399 << 9) / local26.anInt2416;
										} else {
											local503 = 512;
										}
										if (local26.anInt2454 <= 0) {
											local1268 = 512;
										} else {
											local1268 = (local26.anInt2378 << 9) / local26.anInt2454;
										}
										local534 = local26.anInt2399 / 2 + local89 + (local26.anInt2413 * local503 >> 9);
										local536 = local26.anInt2378 / 2 + local95 + (local1268 * local26.anInt2442 >> 9);
										Static224.aClass128_5.ha();
										Static455.aClass4_11.method7198(Static224.aClass128_5);
										Static455.aClass4_11.b(local534, local536, local503, local1268);
										Static455.aClass4_11.la((float) (local26.anInt2438 << 0), local26.aBoolean203 ? (float) (local26.anInt2404 << 0) : (float) (local26.anInt2404 << 0) * 1.5F);
										if (arg5 == -1412584499 || Static27.aBoolean62) {
											Static455.aClass4_11.n();
											Static455.aClass4_11.method7202();
											Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
											Static27.aBoolean62 = false;
										}
										if (local26.aBoolean205) {
											Static455.aClass4_11.method7214(false);
										}
										local547 = Class200_Sub1.lb[local26.anInt2448 << 3] * (local26.anInt2426 << 0) >> 15;
										local642 = (local26.anInt2426 << 0) * Class200_Sub1.anIntArray576[local26.anInt2448 << 3] >> 15;
										Static437.aClass128_7.ta(-local26.anInt2430 << 3);
										Static437.aClass128_7.XA(local26.anInt2366 << 3);
										Static437.aClass128_7.TA(local26.anInt2412 << 0, local264 + local547 + (local26.anInt2380 << 0), local642 + (local26.anInt2380 << 0));
										Static437.aClass128_7.k(local26.anInt2448 << 3);
										if (Static212.aBoolean334) {
											Static455.aClass4_11.F(local89, local95, local26.anInt2399 + local89, local95 - -local26.anInt2378);
										}
										if (local26.aBoolean203) {
											local1569.method6778(Static437.aClass128_7, null, local26.anInt2426 << 0);
										} else {
											local1569.method6773(Static437.aClass128_7, null, 1);
										}
										if (Static212.aBoolean334) {
											Static455.aClass4_11.N(arg2, arg0, arg7, arg8);
										}
										if (local26.aBoolean205) {
											Static455.aClass4_11.method7214(true);
										}
										Static455.aClass4_11.la(0.0F, 0.0F);
									}
								} else if (local26.anInt2452 == 9) {
									if (local26.aBoolean202) {
										local264 = local26.anInt2378 + local95;
										local503 = local26.anInt2399 + local89;
										local1268 = local95;
									} else {
										local1268 = local26.anInt2378 + local95;
										local264 = local95;
										local503 = local89 + local26.anInt2399;
									}
									if (local26.anInt2371 == 1) {
										Static455.aClass4_11.method7203(local89, local264, local503, local1268, local26.anInt2394, 0);
									} else {
										Static455.aClass4_11.method7176(local89, local264, local503, local1268, local26.anInt2394, local26.anInt2371);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6391(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			local18 = arg0.charAt(local20) + (local18 << 5) - local18;
		}
		return local18;
	}
}
