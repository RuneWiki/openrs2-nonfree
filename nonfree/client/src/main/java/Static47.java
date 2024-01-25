import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!ae;")
	public static Class4 aClass4_2;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_20 = new Class265(32, 14);

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_6 = new Class14();

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!em;IIIIIIIII)V")
	public static void method779(@OriginalArg(0) Class68[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class68 local6 = arg0[local1];
			if (local6 != null && local6.anInt2221 == arg1) {
				@Pc(17) int local17 = local6.anInt2244 + arg6;
				@Pc(22) int local22 = local6.anInt2214 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2249 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2188;
					@Pc(45) int local45 = local22 + local6.anInt2252;
					if (local6.anInt2249 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2249 == 0 || local6.aBoolean144 || method787(local6).anInt6837 != 0 || local6 == Static225.aClass68_9 || local6.anInt2236 == Static64.anInt1452) {
					if (!method781(local6)) {
						if (local6 == Static182.aClass68_7) {
							Static362.aBoolean435 = true;
							Static174.anInt3459 = local17;
							Static56.anInt1210 = local22;
						}
						if (local6.aBoolean158 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean147 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class2_Sub30 local148 = (Class2_Sub30) Static293.aClass14_39.method309(); local148 != null; local148 = (Class2_Sub30) Static293.aClass14_39.method311()) {
									if (local148.aBoolean379) {
										local148.method5866();
										local148.aClass68_12.aBoolean148 = false;
									}
								}
								if (Static383.anInt6438 == 0) {
									Static182.aClass68_7 = null;
									Static225.aClass68_9 = null;
								}
								Static110.anInt2578 = 0;
								Static266.aBoolean372 = false;
								Static211.aBoolean301 = false;
								if (!Static123.aBoolean212) {
									Static372.method2348();
								}
							}
							@Pc(204) boolean local204;
							if (Static109.aClass1_2.method702() >= local28 && Static109.aClass1_2.method698() >= local30 && Static109.aClass1_2.method702() < local32 && Static109.aClass1_2.method698() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static385.aBoolean441 && local204) {
								if (local6.anInt2219 >= 0) {
									Static54.anInt1162 = local6.anInt2219;
								} else if (local6.aBoolean147) {
									Static54.anInt1162 = -1;
								}
							}
							if (!Static123.aBoolean212 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static320.method4496(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static109.aClass1_2.method700() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class2_Sub15 local263 = (Class2_Sub15) Static360.aClass14_47.method309();
							if (local263 != null && local263.method2337() == 0 && local263.method2334() >= local28 && local263.method2336() >= local30 && local263.method2334() < local32 && local263.method2336() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray45 != null) {
								for (local296 = 0; local296 < local6.aByteArray45.length; local296++) {
									if (Static334.aClass226_1.method4977(local6.aByteArray45[local296])) {
										if (local6.anIntArray164 == null || Static131.anInt2821 >= local6.anIntArray164[local296]) {
											@Pc(328) byte local328 = local6.aByteArray46[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static334.aClass226_1.method4977(86) && !Static334.aClass226_1.method4977(82) && !Static334.aClass226_1.method4977(81)) && ((local328 & 0x2) == 0 || Static334.aClass226_1.method4977(86)) && ((local328 & 0x1) == 0 || Static334.aClass226_1.method4977(82)) && ((local328 & 0x4) == 0 || Static334.aClass226_1.method4977(81))) {
												if (local296 < 10) {
													Static108.method2000(local6.anInt2229, "", -1, local296 + 1);
												} else if (local296 == 10) {
													Static237.method3667();
													@Pc(399) Class2_Sub42 local399 = method787(local6);
													Static454.method5861(local6, local399.method5400(), local399.anInt6838);
													Static118.aString34 = Static209.method3317(local6);
													if (Static118.aString34 == null) {
														Static118.aString34 = "Null";
													}
													Static254.aString46 = local6.aString23 + "<col=ffffff>";
												}
												local430 = local6.anIntArray165[local296];
												if (local6.anIntArray164 == null) {
													local6.anIntArray164 = new int[local6.aByteArray45.length];
												}
												if (local430 == 0) {
													local6.anIntArray164[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray164[local296] = Static131.anInt2821 + local430;
												}
											}
										}
									} else if (local6.anIntArray164 != null) {
										local6.anIntArray164[local296] = 0;
									}
								}
							}
							if (local258) {
								Static5.method155(local263.method2334() - local17, local6, local263.method2336() - local22);
							}
							if (Static182.aClass68_7 != null && Static182.aClass68_7 != local6 && local204 && method787(local6).method5401()) {
								Static256.aClass68_10 = local6;
							}
							if (local6 == Static225.aClass68_9) {
								Static130.aBoolean218 = true;
								Static420.anInt7046 = local17;
								Static34.anInt678 = local22;
							}
							if (local6.aBoolean144 || local6.anInt2236 != 0) {
								@Pc(515) Class2_Sub30 local515;
								if (local204 && Static411.anInt6846 != 0 && local6.anObjectArray17 != null) {
									local515 = new Class2_Sub30();
									local515.aBoolean379 = true;
									local515.aClass68_12 = local6;
									local515.anInt5103 = Static411.anInt6846;
									local515.anObjectArray35 = local6.anObjectArray17;
									Static293.aClass14_39.method300(local515);
								}
								if (Static182.aClass68_7 != null || Static123.aBoolean212 || local6.anInt2236 != Static357.anInt6062 && Static110.anInt2578 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2236 != 0) {
									if (local6.anInt2236 == Static363.anInt6252 || local6.anInt2236 == Static128.anInt2667) {
										Static48.aClass68_1 = local6;
										if (Static441.aClass242_2 != null) {
											Static441.aClass242_2.method5219(Static33.aClass49_1, local6.anInt2252);
										}
										if (local6.anInt2236 == Static363.anInt6252) {
											if (!Static123.aBoolean212 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static208.method3307(Static33.aClass49_1, arg8, arg9);
												for (@Pc(598) Class8_Sub7 local598 = (Class8_Sub7) Static121.aClass112_7.method2553(); local598 != null; local598 = (Class8_Sub7) Static121.aClass112_7.method2550()) {
													if (arg8 >= local598.anInt5820 && arg8 < local598.anInt5821 && arg9 >= local598.anInt5819 && arg9 < local598.anInt5823) {
														Static372.method2348();
														Static39.method624(local598.aClass3_Sub2_Sub1_1);
													}
												}
											}
											Static428.method5624(local17, local6, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2236 == Static64.anInt1452) {
										if (local6.method1751(Static33.aClass49_1) == null || Static393.anInt6568 != 0 && Static393.anInt6568 != 3 || Static123.aBoolean212 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray163[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray161[local670]) {
											continue;
										}
										local296 -= local6.anInt2188 / 2;
										local670 -= local6.anInt2252 / 2;
										if (Static159.anInt3195 == 4) {
											local709 = (int) Static202.aFloat62 & 0x3FFF;
										} else {
											local709 = (int) Static202.aFloat62 + Static166.anInt3321 & 0x3FFF;
										}
										@Pc(721) int local721 = Class162.anIntArray388[local709];
										@Pc(725) int local725 = Class162.anIntArray387[local709];
										if (Static159.anInt3195 != 4) {
											local721 = local721 * (Static261.anInt4889 + 256) >> 8;
											local725 = local725 * (Static261.anInt4889 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static159.anInt3195 == 4) {
											local775 = (Static405.anInt6749 >> 7) + (local754 >> 2);
											local783 = (Static186.anInt3613 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() - 1) * 64;
											local775 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 - local792 >> 7) + (local754 >> 2);
											local783 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 - local792 >> 7) - (local764 >> 2);
										}
										if (Static385.aBoolean441 && (Static201.anInt3539 & 0x40) != 0) {
											@Pc(825) Class68 local825 = Static259.method3899(Static154.anInt3161, Static142.anInt3047);
											if (local825 == null) {
												Static237.method3667();
											} else {
												Static172.method2802(51, Static323.anInt5618, true, 1L, Static118.aString34, local775, " ->", local6.anInt2208, false, local783);
											}
											continue;
										}
										if (Static320.aClass10_28 == Static423.aClass10_43) {
											Static172.method2802(44, -1, true, 1L, Static13.aClass209_12.method4562(Static388.anInt6533), local775, "", -1, false, local783);
										}
										Static172.method2802(59, Static417.anInt7005, true, 1L, Static95.aString28, local775, "", -1, false, local783);
										continue;
									}
									if (local6.anInt2236 == Static357.anInt6062) {
										Static193.aClass68_8 = local6;
										if (local204) {
											Static266.aBoolean372 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method2334() - local17 - local6.anInt2188 / 2) * 2.0D / (double) Static88.aFloat67);
											local670 = (int) -((double) (local263.method2336() - local22 - local6.anInt2252 / 2) * 2.0D / (double) Static88.aFloat67);
											local430 = Static133.anInt2851 + local296 + Static88.anInt4520;
											local709 = Static129.anInt2786 + local670 + Static88.anInt4515;
											@Pc(939) Class2_Sub5_Sub12 local939 = Static275.method4058();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method4147(local944, local430, local709);
											if (local944 != null) {
												if (Static334.aClass226_1.method4977(82) && Static193.anInt3710 > 0) {
													Static379.method5082(local944[0], local944[1], local944[2]);
													continue;
												}
												Static211.aBoolean301 = true;
												Static432.anInt7161 = local944[0];
												Static297.anInt5331 = local944[1];
												Static317.anInt5576 = local944[2];
											}
											Static110.anInt2578 = 1;
											Static451.aBoolean487 = false;
											Static350.anInt5952 = Static109.aClass1_2.method702();
											Static74.anInt1617 = Static109.aClass1_2.method698();
											continue;
										}
										if (local248 && Static110.anInt2578 > 0) {
											if (Static110.anInt2578 == 1 && (Static350.anInt5952 != Static109.aClass1_2.method702() || Static74.anInt1617 != Static109.aClass1_2.method698())) {
												Static119.anInt2682 = Static133.anInt2851;
												Static91.anInt2263 = Static129.anInt2786;
												Static110.anInt2578 = 2;
											}
											if (Static110.anInt2578 == 2) {
												Static451.aBoolean487 = true;
												Static150.method3425(Static119.anInt2682 + (int) ((double) (Static350.anInt5952 - Static109.aClass1_2.method702()) * 2.0D / (double) Static88.aFloat68));
												Static128.method2090(Static91.anInt2263 - (int) ((double) (Static74.anInt1617 - Static109.aClass1_2.method698()) * 2.0D / (double) Static88.aFloat68));
											}
											continue;
										}
										if (Static110.anInt2578 > 0 && !Static451.aBoolean487) {
											if ((Class64_Sub1.lb == 1 || Static387.method5126()) && Static373.anInt4900 > 2) {
												Static257.method3886(Static74.anInt1617, Static350.anInt5952);
											} else if (Static344.method4737()) {
												Static257.method3886(Static74.anInt1617, Static350.anInt5952);
											}
										}
										Static110.anInt2578 = 0;
										continue;
									}
									if (local6.anInt2236 == Static86.anInt4390) {
										if (local248) {
											Static14.method296(Static109.aClass1_2.method702() - local17, local6.anInt2188, local6.anInt2252, Static109.aClass1_2.method698() - local22);
										}
										continue;
									}
									if (local6.anInt2236 == Static305.anInt5418) {
										Static130.method2223(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean146 && local258) {
									local6.aBoolean146 = true;
									if (local6.anObjectArray23 != null) {
										local515 = new Class2_Sub30();
										local515.aBoolean379 = true;
										local515.aClass68_12 = local6;
										local515.anInt5102 = local263.method2334() - local17;
										local515.anInt5103 = local263.method2336() - local22;
										local515.anObjectArray35 = local6.anObjectArray23;
										Static293.aClass14_39.method300(local515);
									}
								}
								if (local6.aBoolean146 && local248 && local6.anObjectArray27 != null) {
									local515 = new Class2_Sub30();
									local515.aBoolean379 = true;
									local515.aClass68_12 = local6;
									local515.anInt5102 = Static109.aClass1_2.method702() - local17;
									local515.anInt5103 = Static109.aClass1_2.method698() - local22;
									local515.anObjectArray35 = local6.anObjectArray27;
									Static293.aClass14_39.method300(local515);
								}
								if (local6.aBoolean146 && !local248) {
									local6.aBoolean146 = false;
									if (local6.anObjectArray31 != null) {
										local515 = new Class2_Sub30();
										local515.aBoolean379 = true;
										local515.aClass68_12 = local6;
										local515.anInt5102 = Static109.aClass1_2.method702() - local17;
										local515.anInt5103 = Static109.aClass1_2.method698() - local22;
										local515.anObjectArray35 = local6.anObjectArray31;
										Static179.aClass14_31.method300(local515);
									}
								}
								if (local248 && local6.anObjectArray6 != null) {
									local515 = new Class2_Sub30();
									local515.aBoolean379 = true;
									local515.aClass68_12 = local6;
									local515.anInt5102 = Static109.aClass1_2.method702() - local17;
									local515.anInt5103 = Static109.aClass1_2.method698() - local22;
									local515.anObjectArray35 = local6.anObjectArray6;
									Static293.aClass14_39.method300(local515);
								}
								if (!local6.aBoolean148 && local204) {
									local6.aBoolean148 = true;
									if (local6.anObjectArray25 != null) {
										local515 = new Class2_Sub30();
										local515.aBoolean379 = true;
										local515.aClass68_12 = local6;
										local515.anInt5102 = Static109.aClass1_2.method702() - local17;
										local515.anInt5103 = Static109.aClass1_2.method698() - local22;
										local515.anObjectArray35 = local6.anObjectArray25;
										Static293.aClass14_39.method300(local515);
									}
								}
								if (local6.aBoolean148 && local204 && local6.anObjectArray18 != null) {
									local515 = new Class2_Sub30();
									local515.aBoolean379 = true;
									local515.aClass68_12 = local6;
									local515.anInt5102 = Static109.aClass1_2.method702() - local17;
									local515.anInt5103 = Static109.aClass1_2.method698() - local22;
									local515.anObjectArray35 = local6.anObjectArray18;
									Static293.aClass14_39.method300(local515);
								}
								if (local6.aBoolean148 && !local204) {
									local6.aBoolean148 = false;
									if (local6.anObjectArray5 != null) {
										local515 = new Class2_Sub30();
										local515.aBoolean379 = true;
										local515.aClass68_12 = local6;
										local515.anInt5102 = Static109.aClass1_2.method702() - local17;
										local515.anInt5103 = Static109.aClass1_2.method698() - local22;
										local515.anObjectArray35 = local6.anObjectArray5;
										Static179.aClass14_31.method300(local515);
									}
								}
								if (local6.anObjectArray3 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray3;
									Static156.aClass14_30.method300(local515);
								}
								@Pc(1483) Class2_Sub30 local1483;
								if (local6.anObjectArray20 != null && Static334.anInt5795 > local6.anInt2211) {
									if (local6.anIntArray169 == null || Static334.anInt5795 - local6.anInt2211 > 32) {
										local515 = new Class2_Sub30();
										local515.aClass68_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray20;
										Static293.aClass14_39.method300(local515);
									} else {
										label678: for (local296 = local6.anInt2211; local296 < Static334.anInt5795; local296++) {
											local670 = Static176.anIntArray17[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray169.length; local430++) {
												if (local6.anIntArray169[local430] == local670) {
													local1483 = new Class2_Sub30();
													local1483.aClass68_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray20;
													Static293.aClass14_39.method300(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2211 = Static334.anInt5795;
								}
								if (local6.anObjectArray11 != null && Static265.anInt4940 > local6.anInt2241) {
									if (local6.anIntArray168 == null || Static265.anInt4940 - local6.anInt2241 > 32) {
										local515 = new Class2_Sub30();
										local515.aClass68_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray11;
										Static293.aClass14_39.method300(local515);
									} else {
										label654: for (local296 = local6.anInt2241; local296 < Static265.anInt4940; local296++) {
											local670 = Static294.anIntArray424[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray168.length; local430++) {
												if (local6.anIntArray168[local430] == local670) {
													local1483 = new Class2_Sub30();
													local1483.aClass68_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray11;
													Static293.aClass14_39.method300(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2241 = Static265.anInt4940;
								}
								if (local6.anObjectArray21 != null && Static214.anInt4155 > local6.anInt2204) {
									if (local6.anIntArray166 == null || Static214.anInt4155 - local6.anInt2204 > 32) {
										local515 = new Class2_Sub30();
										local515.aClass68_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray21;
										Static293.aClass14_39.method300(local515);
									} else {
										label630: for (local296 = local6.anInt2204; local296 < Static214.anInt4155; local296++) {
											local670 = Static170.anIntArray301[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray166.length; local430++) {
												if (local6.anIntArray166[local430] == local670) {
													local1483 = new Class2_Sub30();
													local1483.aClass68_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray21;
													Static293.aClass14_39.method300(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2204 = Static214.anInt4155;
								}
								if (local6.anObjectArray29 != null && Static147.anInt6563 > local6.anInt2190) {
									if (local6.anIntArray170 == null || Static147.anInt6563 - local6.anInt2190 > 32) {
										local515 = new Class2_Sub30();
										local515.aClass68_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray29;
										Static293.aClass14_39.method300(local515);
									} else {
										label606: for (local296 = local6.anInt2190; local296 < Static147.anInt6563; local296++) {
											local670 = Static417.anIntArray590[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray170.length; local430++) {
												if (local6.anIntArray170[local430] == local670) {
													local1483 = new Class2_Sub30();
													local1483.aClass68_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray29;
													Static293.aClass14_39.method300(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2190 = Static147.anInt6563;
								}
								if (local6.anObjectArray22 != null && Static394.anInt6578 > local6.anInt2212) {
									if (local6.anIntArray167 == null || Static394.anInt6578 - local6.anInt2212 > 32) {
										local515 = new Class2_Sub30();
										local515.aClass68_12 = local6;
										local515.anObjectArray35 = local6.anObjectArray22;
										Static293.aClass14_39.method300(local515);
									} else {
										label582: for (local296 = local6.anInt2212; local296 < Static394.anInt6578; local296++) {
											local670 = Static104.anIntArray191[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray167.length; local430++) {
												if (local6.anIntArray167[local430] == local670) {
													local1483 = new Class2_Sub30();
													local1483.aClass68_12 = local6;
													local1483.anObjectArray35 = local6.anObjectArray22;
													Static293.aClass14_39.method300(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2212 = Static394.anInt6578;
								}
								if (Static58.anInt1319 > local6.anInt2184 && local6.anObjectArray12 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray12;
									Static293.aClass14_39.method300(local515);
								}
								if (Static118.anInt2673 > local6.anInt2184 && local6.anObjectArray30 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray30;
									Static293.aClass14_39.method300(local515);
								}
								if (Static379.anInt6423 > local6.anInt2184 && local6.anObjectArray24 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray24;
									Static293.aClass14_39.method300(local515);
								}
								if (Static71.anInt1572 > local6.anInt2184 && local6.anObjectArray32 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray32;
									Static293.aClass14_39.method300(local515);
								}
								if (Static453.anInt7434 > local6.anInt2184 && local6.anObjectArray28 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray28;
									Static293.aClass14_39.method300(local515);
								}
								local6.anInt2184 = Static37.anInt715;
								if (local6.anObjectArray7 != null) {
									for (local296 = 0; local296 < Static222.anInt4305; local296++) {
										@Pc(1951) Class2_Sub30 local1951 = new Class2_Sub30();
										local1951.aClass68_12 = local6;
										local1951.anInt5109 = Static23.aClass141Array1[local296].method4288();
										local1951.anInt5100 = Static23.aClass141Array1[local296].method4290();
										local1951.anObjectArray35 = local6.anObjectArray7;
										Static293.aClass14_39.method300(local1951);
									}
								}
								if (Static144.aBoolean234 && local6.anObjectArray13 != null) {
									local515 = new Class2_Sub30();
									local515.aClass68_12 = local6;
									local515.anObjectArray35 = local6.anObjectArray13;
									Static293.aClass14_39.method300(local515);
								}
							}
							if (local6.anInt2249 == 5 && local6.anInt2230 != -1) {
								local6.method1737(Static154.aClass252_1, Static318.aClass131_5).method5219(Static33.aClass49_1, local6.anInt2252);
							}
							Static282.method4104(local6);
							if (local6.anInt2249 == 0) {
								method779(arg0, local6.anInt2229, local28, local30, local32, local34, local17 - local6.anInt2176, local22 - local6.anInt2172, arg8, arg9);
								if (local6.aClass68Array1 != null) {
									method779(local6.aClass68Array1, local6.anInt2229, local28, local30, local32, local34, local17 - local6.anInt2176, local22 - local6.anInt2172, arg8, arg9);
								}
								@Pc(2073) Class2_Sub35 local2073 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local6.anInt2229);
								if (local2073 != null) {
									if (Static320.aClass10_28 == Static199.aClass10_22 && local2073.anInt5541 == 0 && !Static123.aBoolean212 && local204 && !Static154.aBoolean245) {
										Static372.method2348();
									}
									Static13.method292(local32, local34, local17, local28, local2073.anInt5537, local30, local22, arg8, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static282.method4104(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method780() {
		@Pc(1) int local1 = Static337.anInt5822;
		@Pc(3) int[] local3 = Static203.anIntArray384;
		@Pc(20) boolean local20 = Static12.aClass79_Sub1_1.anInt4925 == 1 && local1 > 200 || Static12.aClass79_Sub1_1.anInt4925 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class3_Sub2_Sub1_Sub2 local29 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local3[local22]];
			if (local29.method4941()) {
				local29.method4918();
				if (local29.aShort85 >= 0 && local29.aShort86 >= 0 && local29.aShort87 < Static229.anInt4427 && local29.aShort88 < Static379.anInt6422) {
					local29.aBoolean433 = local29.aBoolean429 ? local20 : false;
					if (local29 == Static375.aClass3_Sub2_Sub1_Sub2_7) {
						local29.anInt6143 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean428) {
							local75++;
						}
						if (local29.anInt6156 > Static131.anInt2821) {
							local75 += 2;
						}
						local75 += 5 - local29.method4935() << 2;
						if (local29.aBoolean432) {
							local75 += 512;
						} else {
							if (Static413.anInt6881 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6143 = local75 + 1;
					}
				} else {
					local29.anInt6143 = -1;
				}
			} else {
				local29.anInt6143 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static62.anInt1371; local116++) {
			@Pc(123) Class3_Sub2_Sub1_Sub1 local123 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local116]];
			if (local123.method1429() && local123.aClass65_1.method1708(Static344.aClass108_1)) {
				local123.method4918();
				if (local123.aShort85 >= 0 && local123.aShort86 >= 0 && local123.aShort87 < Static229.anInt4427 && local123.aShort88 < Static379.anInt6422) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean428) {
						local160++;
					}
					if (local123.anInt6156 > Static131.anInt2821) {
						local160 += 2;
					}
					local160 += 5 - local123.method4935() << 2;
					if (Static413.anInt6881 == 0) {
						if (local123.aClass65_1.aBoolean142) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static413.anInt6881 == 1) {
						if (local123.aClass65_1.aBoolean142) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass65_1.aBoolean140) {
						local160 += 1024;
					} else if (!local123.aClass65_1.aBoolean141) {
						local160 += 256;
					}
					local123.anInt6143 = local160 + 1;
				} else {
					local123.anInt6143 = -1;
				}
			} else {
				local123.anInt6143 = -1;
			}
		}
		for (local75 = 0; local75 < Static20.aClass237Array1.length; local75++) {
			@Pc(226) Class237 local226 = Static20.aClass237Array1[local75];
			if (local226 != null) {
				if (local226.anInt6468 == 1) {
					@Pc(237) Class3_Sub2_Sub1_Sub1 local237 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local226.anInt6464];
					if (local237 != null && local237.anInt6143 >= 0) {
						local237.anInt6143 += 2048;
					}
				} else if (local226.anInt6468 == 10) {
					@Pc(258) Class3_Sub2_Sub1_Sub2 local258 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local226.anInt6464];
					if (local258 != null && local258 != Static375.aClass3_Sub2_Sub1_Sub2_7 && local258.anInt6143 >= 0) {
						local258.anInt6143 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!em;)Z")
	public static boolean method781(@OriginalArg(0) Class68 arg0) {
		if (Static154.aBoolean245) {
			if (method787(arg0).anInt6837 != 0) {
				return false;
			}
			if (arg0.anInt2249 == 0) {
				return false;
			}
		}
		return arg0.aBoolean151;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	public static void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static8.anInt223 <= arg2 - arg1 && Static184.anInt3600 >= arg2 + arg1 && arg3 - arg1 >= Static430.anInt7123 && arg1 + arg3 <= Static181.anInt3543) {
			Static92.method2440(arg0, arg2, arg3, arg1);
		} else {
			Static296.method4259(arg0, arg2, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method784() {
		Static149.anInt3097 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static62.anInt1371; local3++) {
			@Pc(10) Class3_Sub2_Sub1_Sub1 local10 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local3]];
			if (local10.aBoolean428 && local10.method4932() != -1) {
				@Pc(28) int local28 = (local10.method4935() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6119 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6121 - local28 >> 7;
				@Pc(49) Class3_Sub2_Sub1 local49 = Static223.method3510(local42, local35, local10.aByte89);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6137;
					if (local49 instanceof Class3_Sub2_Sub1_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt6153 == 0 && local49.method4932() != -1) {
						Static283.anIntArray134[Static149.anInt3097] = local54;
						Static233.anIntArray380[Static149.anInt3097] = local54;
						Static149.anInt3097++;
						local49.anInt6153++;
					}
					Static283.anIntArray134[Static149.anInt3097] = local54;
					Static233.anIntArray380[Static149.anInt3097] = local10.anInt6137 + 2048;
					Static149.anInt3097++;
					local49.anInt6153++;
				}
			}
		}
		Static234.method3658(Static149.anInt3097 - 1, 0, Static283.anIntArray134, Static233.anIntArray380);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!em;)Lclient!uu;")
	public static Class2_Sub42 method787(@OriginalArg(0) Class68 arg0) {
		@Pc(13) Class2_Sub42 local13 = (Class2_Sub42) Static157.aClass163_18.method3769(((long) arg0.anInt2229 << 32) + (long) arg0.anInt2215);
		return local13 == null ? arg0.aClass2_Sub42_3 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method788() {
		for (@Pc(1) int local1 = 0; local1 < Static229.anInt4427; local1++) {
			@Pc(6) int[] local6 = Static5.anIntArrayArray1[local1];
			for (@Pc(8) int local8 = 0; local8 < Static379.anInt6422; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method789(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static337.anInt5822;
		@Pc(3) int[] local3 = Static203.anIntArray384;
		@Pc(11) int local11 = Static333.aBoolean405 ? local1 : local1 + Static62.anInt1371;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local13 - local1]];
			}
			if (local23.aByte89 == arg0) {
				local23.anInt6153 = 0;
				if (local23.anInt6143 < 0) {
					local23.aBoolean428 = false;
				} else {
					@Pc(50) int local50 = local23.method4935();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6119 & 0x7F) != 0 || (local23.anInt6121 & 0x7F) != 0) {
							local23.aBoolean428 = false;
							continue;
						}
					} else if ((local23.anInt6119 & 0x7F) != 64 || (local23.anInt6121 & 0x7F) != 64) {
						local23.aBoolean428 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6119 >> 7;
						local97 = local23.anInt6121 >> 7;
						if (local23.anInt6143 != Static5.anIntArrayArray1[local92][local97]) {
							local23.aBoolean428 = true;
							continue;
						}
						if (Static250.anIntArrayArray47[local92][local97] > 1) {
							local122 = Static250.anIntArrayArray47[local92][local97]--;
							local23.aBoolean428 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6119 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6121 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6119 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6121 + local92 >> 7;
						if (!Static70.method1327(local23.anInt6143, local151, local158, local97, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6143 == Static5.anIntArrayArray1[local176][local179]) {
										local122 = Static250.anIntArrayArray47[local176][local179]--;
									}
								}
							}
							local23.aBoolean428 = true;
							continue;
						}
					}
					if (local23 instanceof Class3_Sub2_Sub1_Sub2 && local23.aClass2_Sub13_3 != null && Static131.anInt2821 >= local23.aClass2_Sub13_3.anInt2347 && Static131.anInt2821 < local23.aClass2_Sub13_3.anInt2350) {
						((Class3_Sub2_Sub1_Sub2) local23).aBoolean433 = false;
					}
					local23.aBoolean428 = false;
					local23.anInt6120 = Static85.method1695(local23.aByte89, local23.anInt6121, local23.anInt6119);
					Static313.method4402(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method790(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static337.anInt5822;
		@Pc(3) int[] local3 = Static203.anIntArray384;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static62.anInt1371; local5++) {
			@Pc(15) Class3_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local5 - local1]];
			}
			if (local15.aByte89 == arg0 && local15.anInt6143 >= 0) {
				@Pc(35) int local35 = local15.method4935();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6119 & 0x7F) != 0 || (local15.anInt6121 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6119 & 0x7F) != 64 || (local15.anInt6121 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6119 >> 7;
					local76 = local15.anInt6121 >> 7;
					if (local15.anInt6143 > Static5.anIntArrayArray1[local71][local76]) {
						Static5.anIntArrayArray1[local71][local76] = local15.anInt6143;
						Static250.anIntArrayArray47[local71][local76] = 1;
					} else if (local15.anInt6143 == Static5.anIntArrayArray1[local71][local76]) {
						local112 = Static250.anIntArrayArray47[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6119 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6121 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6119 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6121 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6143 > Static5.anIntArrayArray1[local154][local157]) {
								Static5.anIntArrayArray1[local154][local157] = local15.anInt6143;
								Static250.anIntArrayArray47[local154][local157] = 1;
							} else if (local15.anInt6143 == Static5.anIntArrayArray1[local154][local157]) {
								local112 = Static250.anIntArrayArray47[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!em;)Lclient!em;")
	public static Class68 method791(@OriginalArg(0) Class68 arg0) {
		@Pc(4) int local4 = method787(arg0).method5398();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static165.method2704(arg0.anInt2221);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!sk;II)V")
	public static void method795(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt6163 == arg2 && arg2 != -1) {
			@Pc(87) Class250 local87 = Static338.aClass12_2.method255(arg2);
			@Pc(90) int local90 = local87.anInt7015;
			if (local90 == 1) {
				arg0.anInt6149 = 0;
				arg0.anInt6178 = 0;
				arg0.anInt6139 = arg1;
				arg0.anInt6182 = 0;
				arg0.anInt6169 = 1;
				Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, local87, arg0.anInt6149);
			}
			if (local90 == 2) {
				arg0.anInt6182 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt6163 == -1 || Static338.aClass12_2.method255(arg2).anInt7019 >= Static338.aClass12_2.method255(arg0.anInt6163).anInt7019) {
			arg0.anInt6149 = 0;
			arg0.anInt6204 = arg0.anInt6206;
			arg0.anInt6182 = 0;
			arg0.anInt6163 = arg2;
			arg0.anInt6169 = 1;
			arg0.anInt6178 = 0;
			arg0.anInt6139 = arg1;
			if (arg0.anInt6163 != -1) {
				Static131.method2230(arg0.anInt6119, arg0.anInt6121, arg0.aByte89, Static375.aClass3_Sub2_Sub1_Sub2_7 == arg0, Static338.aClass12_2.method255(arg0.anInt6163), arg0.anInt6149);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method796() {
		@Pc(1) int local1 = Static337.anInt5822;
		@Pc(3) int[] local3 = Static203.anIntArray384;
		@Pc(11) int local11 = Static333.aBoolean405 ? local1 : local1 + Static62.anInt1371;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local13 - local1]];
			}
			if (local23.anInt6143 >= 0) {
				@Pc(39) int local39 = local23.method4935();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6119 & 0x7F) == 0 && (local23.anInt6121 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6119 & 0x7F) == 64 && (local23.anInt6121 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class3_Sub2_Sub1_Sub2 && local23.aClass2_Sub13_3 != null && Static131.anInt2821 >= local23.aClass2_Sub13_3.anInt2347 && Static131.anInt2821 < local23.aClass2_Sub13_3.anInt2350) {
					((Class3_Sub2_Sub1_Sub2) local23).aBoolean433 = false;
				}
				local23.anInt6120 = Static85.method1695(local23.aByte89, local23.anInt6121, local23.anInt6119);
				Static313.method4402(local23, true);
			}
		}
	}
}
