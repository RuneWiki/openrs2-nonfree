import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!db;")
	public static final Class64 aClass64_70 = new Class64(94, 4);

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt1428 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!gba;IIIIIIIII)V")
	public static void method1218(@OriginalArg(0) Class115[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class115 local6 = arg0[local1];
			if (local6 != null && local6.anInt3441 == arg1) {
				@Pc(17) int local17 = local6.anInt3456 + arg6;
				@Pc(22) int local22 = local6.anInt3458 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3519 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3474;
					@Pc(45) int local45 = local22 + local6.anInt3481;
					if (local6.anInt3519 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt3519 == 0 || local6.aBoolean276 || method1233(local6).anInt5878 != 0 || local6 == Static107.aClass115_13 || local6.anInt3509 == Static441.anInt7529) {
					if (!method1229(local6)) {
						if (local6 == Static287.aClass115_12 && Static109.method2320(Static287.aClass115_12) != null) {
							Static6.aBoolean5 = true;
							Static125.anInt2918 = local17;
							Static61.anInt1147 = local22;
						}
						if (local6.aBoolean277 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean274 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class4_Sub12 local152 = (Class4_Sub12) Static577.aClass124_67.method3267(); local152 != null; local152 = (Class4_Sub12) Static577.aClass124_67.method3273()) {
									if (local152.aBoolean198) {
										local152.method8013();
										local152.aClass115_5.aBoolean270 = false;
									}
								}
								if (Static302.anInt5525 == 0) {
									Static287.aClass115_12 = null;
									Static107.aClass115_13 = null;
								}
								Static171.anInt3692 = 0;
								Static313.aBoolean426 = false;
								Static384.aBoolean506 = false;
								if (!Static325.aBoolean431) {
									Static161.method3169();
								}
							}
							@Pc(208) boolean local208;
							if (Static86.aClass50_1.method7100() >= local28 && Static86.aClass50_1.method7102() >= local30 && Static86.aClass50_1.method7100() < local32 && Static86.aClass50_1.method7102() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static524.aBoolean617 && local208) {
								if (local6.anInt3499 >= 0) {
									Static485.anInt8162 = local6.anInt3499;
								} else if (local6.aBoolean274) {
									Static485.anInt8162 = -1;
								}
							}
							if (!Static325.aBoolean431 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static532.method7403(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static86.aClass50_1.method7107() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class4_Sub22 local267 = (Class4_Sub22) Static324.aClass124_28.method3267();
							if (local267 != null && local267.method7272() == 0 && local267.method7271() >= local28 && local267.method7270() >= local30 && local267.method7271() < local32 && local267.method7270() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray40 != null && !Static252.method4230()) {
								for (local303 = 0; local303 < local6.aByteArray40.length; local303++) {
									if (Static12.aClass173_1.method6259(local6.aByteArray40[local303])) {
										if (local6.anIntArray314 == null || Static237.anInt7561 >= local6.anIntArray314[local303]) {
											@Pc(335) byte local335 = local6.aByteArray41[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static12.aClass173_1.method6259(86) && !Static12.aClass173_1.method6259(82) && !Static12.aClass173_1.method6259(81)) && ((local335 & 0x2) == 0 || Static12.aClass173_1.method6259(86)) && ((local335 & 0x1) == 0 || Static12.aClass173_1.method6259(82)) && ((local335 & 0x4) == 0 || Static12.aClass173_1.method6259(81))) {
												if (local303 < 10) {
													Static32.method567(-1, local303 + 1, local6.anInt3464, "");
												} else if (local303 == 10) {
													Static400.method5802();
													@Pc(406) Class4_Sub31 local406 = method1233(local6);
													Static533.method7420(local406.method4973(), local406.anInt5881, local6);
													Static404.aString82 = Static511.method843(local6);
													if (Static404.aString82 == null) {
														Static404.aString82 = "Null";
													}
													Static238.aString94 = local6.aString33 + "<col=ffffff>";
												}
												local437 = local6.anIntArray315[local303];
												if (local6.anIntArray314 == null) {
													local6.anIntArray314 = new int[local6.aByteArray40.length];
												}
												if (local437 == 0) {
													local6.anIntArray314[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray314[local303] = Static237.anInt7561 + local437;
												}
											}
										}
									} else if (local6.anIntArray314 != null) {
										local6.anIntArray314[local303] = 0;
									}
								}
							}
							if (local262) {
								Static44.method732(local267.method7271() - local17, local6, local267.method7270() - local22);
							}
							if (Static287.aClass115_12 != null && Static287.aClass115_12 != local6 && local208 && method1233(local6).method4970()) {
								Static149.aClass115_7 = local6;
							}
							if (local6 == Static107.aClass115_13) {
								Static347.aBoolean454 = true;
								Static129.anInt2966 = local17;
								Static200.anInt4233 = local22;
							}
							if (local6.aBoolean276 || local6.anInt3509 != 0) {
								@Pc(522) Class4_Sub12 local522;
								if (local208 && Static551.anInt9250 != 0 && local6.anObjectArray32 != null) {
									local522 = new Class4_Sub12();
									local522.aBoolean198 = true;
									local522.aClass115_5 = local6;
									local522.anInt2451 = Static551.anInt9250;
									local522.anObjectArray3 = local6.anObjectArray32;
									Static577.aClass124_67.method3275(local522);
								}
								if (Static287.aClass115_12 != null || Static325.aBoolean431 || local6.anInt3509 != Static339.anInt5939 && Static171.anInt3692 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt3509 != 0) {
									if (local6.anInt3509 == Static413.anInt7159 || local6.anInt3509 == Static314.anInt9414) {
										Static92.aClass115_3 = local6;
										if (Static122.aClass255_3 != null) {
											Static122.aClass255_3.method5704(local6.anInt3481, Static185.aClass66_14);
										}
										if (local6.anInt3509 == Static413.anInt7159) {
											if (!Static325.aBoolean431 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static567.method7777(Static185.aClass66_14, arg8, arg9);
												for (@Pc(605) Class26_Sub8 local605 = (Class26_Sub8) Static517.aClass8_8.method110(); local605 != null; local605 = (Class26_Sub8) Static517.aClass8_8.method113()) {
													if (arg8 >= local605.anInt8130 && arg8 < local605.anInt8131 && arg9 >= local605.anInt8133 && arg9 < local605.anInt8128) {
														Static161.method3169();
														Static25.method447(local605.aClass10_Sub1_Sub2_1);
													}
												}
											}
											Static501.method7139(local6, local22, local17);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt3509 == Static441.anInt7529) {
										if (local6.method3150(Static185.aClass66_14) == null || Static451.anInt9796 != 0 && Static451.anInt9796 != 3 || Static325.aBoolean431 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray319[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray320[local677]) {
											continue;
										}
										local303 -= local6.anInt3474 / 2;
										local677 -= local6.anInt3481 / 2;
										if (Static555.anInt9335 == 4) {
											local716 = (int) Static477.aFloat164 & 0x3FFF;
										} else {
											local716 = (int) Static477.aFloat164 + Static402.anInt6978 & 0x3FFF;
										}
										@Pc(728) int local728 = Class4_Sub11.anIntArray148[local716];
										@Pc(732) int local732 = Class4_Sub11.anIntArray147[local716];
										if (Static555.anInt9335 != 4) {
											local728 = local728 * (Static380.anInt6751 + 256) >> 8;
											local732 = local732 * (Static380.anInt6751 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static555.anInt9335 == 4) {
											local782 = (Static460.anInt7816 >> 9) + (local761 >> 2);
											local790 = (Static391.anInt6854 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static129.aClass10_Sub1_Sub2_Sub2_1.method7021() - 1) * 256;
											local782 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8934 - local799 >> 9) + (local761 >> 2);
											local790 = (Static129.aClass10_Sub1_Sub2_Sub2_1.anInt8929 - local799 >> 9) - (local771 >> 2);
										}
										if (Static524.aBoolean617 && (Static360.anInt6361 & 0x40) != 0) {
											@Pc(832) Class115 local832 = Static279.method4432(Static539.anInt9099, Static143.anInt3245);
											if (local832 == null) {
												Static400.method5802();
											} else {
												Static100.method7901(local790, false, true, " ->", 1L, 17, local782, local6.anInt3510, Static178.anInt3780, Static404.aString82);
											}
											continue;
										}
										if (Static538.aClass263_5 == Static27.aClass263_1) {
											Static100.method7901(local790, false, true, "", 1L, 2, local782, -1, -1, Static275.aClass198_26.method4407(Static56.anInt953));
										}
										Static100.method7901(local790, false, true, "", 1L, 58, local782, -1, Static528.anInt8988, Static245.aString59);
										continue;
									}
									if (local6.anInt3509 == Static339.anInt5939) {
										Static593.aClass115_15 = local6;
										if (local208) {
											Static313.aBoolean426 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method7271() - local17 - local6.anInt3474 / 2) * 2.0D / (double) Static392.aFloat188);
											local677 = (int) -((double) (local267.method7270() - local22 - local6.anInt3481 / 2) * 2.0D / (double) Static392.aFloat188);
											local437 = Static397.anInt6936 + local303 + Static392.anInt8797;
											local716 = Static470.anInt7923 + local677 + Static392.anInt8804;
											@Pc(946) Class4_Sub7_Sub13 local946 = Static453.method6410();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method5524(local951, local437, local716);
											if (local951 != null) {
												if (Static12.aClass173_1.method6259(82) && Static540.anInt9129 > 0) {
													Static460.method6469(local951[2], local951[0], local951[1]);
													continue;
												}
												Static384.aBoolean506 = true;
												Static249.anInt4943 = local951[0];
												Static219.anInt4468 = local951[1];
												Static23.anInt445 = local951[2];
											}
											Static171.anInt3692 = 1;
											Static10.aBoolean37 = false;
											Static399.anInt6953 = Static86.aClass50_1.method7100();
											Static563.anInt9432 = Static86.aClass50_1.method7102();
											continue;
										}
										if (local252 && Static171.anInt3692 > 0) {
											if (Static171.anInt3692 == 1 && (Static399.anInt6953 != Static86.aClass50_1.method7100() || Static563.anInt9432 != Static86.aClass50_1.method7102())) {
												Static55.anInt950 = Static397.anInt6936;
												Static300.anInt5727 = Static470.anInt7923;
												Static171.anInt3692 = 2;
											}
											if (Static171.anInt3692 == 2) {
												Static10.aBoolean37 = true;
												Static129.method2715(Static55.anInt950 + (int) ((double) (Static399.anInt6953 - Static86.aClass50_1.method7100()) * 2.0D / (double) Static392.aFloat187));
												Static378.method5645(Static300.anInt5727 - (int) ((double) (Static563.anInt9432 - Static86.aClass50_1.method7102()) * 2.0D / (double) Static392.aFloat187));
											}
											continue;
										}
										if (Static171.anInt3692 > 0 && !Static10.aBoolean37) {
											if ((Static7.anInt104 == 1 || Static317.method4845()) && Static300.anInt5730 > 2) {
												Static303.method4689(Static399.anInt6953, Static563.anInt9432);
											} else if (Static122.method6948()) {
												Static303.method4689(Static399.anInt6953, Static563.anInt9432);
											}
										}
										Static171.anInt3692 = 0;
										continue;
									}
									if (local6.anInt3509 == Static390.anInt6850) {
										if (local252) {
											Static403.method5825(Static86.aClass50_1.method7102() - local22, local6.anInt3481, Static86.aClass50_1.method7100() - local17, local6.anInt3474);
										}
										continue;
									}
									if (local6.anInt3509 == Static489.anInt9741) {
										Static387.method7906(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean268 && local262) {
									local6.aBoolean268 = true;
									if (local6.anObjectArray12 != null) {
										local522 = new Class4_Sub12();
										local522.aBoolean198 = true;
										local522.aClass115_5 = local6;
										local522.anInt2447 = local267.method7271() - local17;
										local522.anInt2451 = local267.method7270() - local22;
										local522.anObjectArray3 = local6.anObjectArray12;
										Static577.aClass124_67.method3275(local522);
									}
								}
								if (local6.aBoolean268 && local252 && local6.anObjectArray11 != null) {
									local522 = new Class4_Sub12();
									local522.aBoolean198 = true;
									local522.aClass115_5 = local6;
									local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
									local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
									local522.anObjectArray3 = local6.anObjectArray11;
									Static577.aClass124_67.method3275(local522);
								}
								if (local6.aBoolean268 && !local252) {
									local6.aBoolean268 = false;
									if (local6.anObjectArray17 != null) {
										local522 = new Class4_Sub12();
										local522.aBoolean198 = true;
										local522.aClass115_5 = local6;
										local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
										local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
										local522.anObjectArray3 = local6.anObjectArray17;
										Static436.aClass124_46.method3275(local522);
									}
								}
								if (local252 && local6.anObjectArray24 != null) {
									local522 = new Class4_Sub12();
									local522.aBoolean198 = true;
									local522.aClass115_5 = local6;
									local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
									local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
									local522.anObjectArray3 = local6.anObjectArray24;
									Static577.aClass124_67.method3275(local522);
								}
								if (!local6.aBoolean270 && local208) {
									local6.aBoolean270 = true;
									if (local6.anObjectArray21 != null) {
										local522 = new Class4_Sub12();
										local522.aBoolean198 = true;
										local522.aClass115_5 = local6;
										local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
										local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
										local522.anObjectArray3 = local6.anObjectArray21;
										Static577.aClass124_67.method3275(local522);
									}
								}
								if (local6.aBoolean270 && local208 && local6.anObjectArray15 != null) {
									local522 = new Class4_Sub12();
									local522.aBoolean198 = true;
									local522.aClass115_5 = local6;
									local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
									local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
									local522.anObjectArray3 = local6.anObjectArray15;
									Static577.aClass124_67.method3275(local522);
								}
								if (local6.aBoolean270 && !local208) {
									local6.aBoolean270 = false;
									if (local6.anObjectArray9 != null) {
										local522 = new Class4_Sub12();
										local522.aBoolean198 = true;
										local522.aClass115_5 = local6;
										local522.anInt2447 = Static86.aClass50_1.method7100() - local17;
										local522.anInt2451 = Static86.aClass50_1.method7102() - local22;
										local522.anObjectArray3 = local6.anObjectArray9;
										Static436.aClass124_46.method3275(local522);
									}
								}
								if (local6.anObjectArray19 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray19;
									Static413.aClass124_45.method3275(local522);
								}
								@Pc(1490) Class4_Sub12 local1490;
								if (local6.anObjectArray35 != null && Static104.anInt2561 > local6.anInt3498) {
									if (local6.anIntArray318 == null || Static104.anInt2561 - local6.anInt3498 > 32) {
										local522 = new Class4_Sub12();
										local522.aClass115_5 = local6;
										local522.anObjectArray3 = local6.anObjectArray35;
										Static577.aClass124_67.method3275(local522);
									} else {
										label681: for (local303 = local6.anInt3498; local303 < Static104.anInt2561; local303++) {
											local677 = Static333.anIntArray484[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray318.length; local437++) {
												if (local6.anIntArray318[local437] == local677) {
													local1490 = new Class4_Sub12();
													local1490.aClass115_5 = local6;
													local1490.anObjectArray3 = local6.anObjectArray35;
													Static577.aClass124_67.method3275(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt3498 = Static104.anInt2561;
								}
								if (local6.anObjectArray29 != null && Static174.anInt3756 > local6.anInt3490) {
									if (local6.anIntArray316 == null || Static174.anInt3756 - local6.anInt3490 > 32) {
										local522 = new Class4_Sub12();
										local522.aClass115_5 = local6;
										local522.anObjectArray3 = local6.anObjectArray29;
										Static577.aClass124_67.method3275(local522);
									} else {
										label657: for (local303 = local6.anInt3490; local303 < Static174.anInt3756; local303++) {
											local677 = Static386.anIntArray546[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray316.length; local437++) {
												if (local6.anIntArray316[local437] == local677) {
													local1490 = new Class4_Sub12();
													local1490.aClass115_5 = local6;
													local1490.anObjectArray3 = local6.anObjectArray29;
													Static577.aClass124_67.method3275(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt3490 = Static174.anInt3756;
								}
								if (local6.anObjectArray18 != null && Static501.anInt8685 > local6.anInt3450) {
									if (local6.anIntArray317 == null || Static501.anInt8685 - local6.anInt3450 > 32) {
										local522 = new Class4_Sub12();
										local522.aClass115_5 = local6;
										local522.anObjectArray3 = local6.anObjectArray18;
										Static577.aClass124_67.method3275(local522);
									} else {
										label633: for (local303 = local6.anInt3450; local303 < Static501.anInt8685; local303++) {
											local677 = Static456.anIntArray625[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray317.length; local437++) {
												if (local6.anIntArray317[local437] == local677) {
													local1490 = new Class4_Sub12();
													local1490.aClass115_5 = local6;
													local1490.anObjectArray3 = local6.anObjectArray18;
													Static577.aClass124_67.method3275(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt3450 = Static501.anInt8685;
								}
								if (local6.anObjectArray28 != null && Static83.anInt9715 > local6.anInt3518) {
									if (local6.anIntArray311 == null || Static83.anInt9715 - local6.anInt3518 > 32) {
										local522 = new Class4_Sub12();
										local522.aClass115_5 = local6;
										local522.anObjectArray3 = local6.anObjectArray28;
										Static577.aClass124_67.method3275(local522);
									} else {
										label609: for (local303 = local6.anInt3518; local303 < Static83.anInt9715; local303++) {
											local677 = Static481.anIntArray641[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray311.length; local437++) {
												if (local6.anIntArray311[local437] == local677) {
													local1490 = new Class4_Sub12();
													local1490.aClass115_5 = local6;
													local1490.anObjectArray3 = local6.anObjectArray28;
													Static577.aClass124_67.method3275(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt3518 = Static83.anInt9715;
								}
								if (local6.anObjectArray22 != null && Static164.anInt3572 > local6.anInt3465) {
									if (local6.anIntArray312 == null || Static164.anInt3572 - local6.anInt3465 > 32) {
										local522 = new Class4_Sub12();
										local522.aClass115_5 = local6;
										local522.anObjectArray3 = local6.anObjectArray22;
										Static577.aClass124_67.method3275(local522);
									} else {
										label585: for (local303 = local6.anInt3465; local303 < Static164.anInt3572; local303++) {
											local677 = Static74.anIntArray202[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray312.length; local437++) {
												if (local6.anIntArray312[local437] == local677) {
													local1490 = new Class4_Sub12();
													local1490.aClass115_5 = local6;
													local1490.anObjectArray3 = local6.anObjectArray22;
													Static577.aClass124_67.method3275(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt3465 = Static164.anInt3572;
								}
								if (Static535.anInt9060 > local6.anInt3457 && local6.anObjectArray20 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray20;
									Static577.aClass124_67.method3275(local522);
								}
								if (Static506.anInt8762 > local6.anInt3457 && local6.anObjectArray23 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray23;
									Static577.aClass124_67.method3275(local522);
								}
								if (Static335.anInt6553 > local6.anInt3457 && local6.anObjectArray16 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray16;
									Static577.aClass124_67.method3275(local522);
								}
								if (Static221.anInt4543 > local6.anInt3457 && local6.anObjectArray5 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray5;
									Static577.aClass124_67.method3275(local522);
								}
								if (Static204.anInt4280 > local6.anInt3457 && local6.anObjectArray10 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray10;
									Static577.aClass124_67.method3275(local522);
								}
								local6.anInt3457 = Static191.anInt5895;
								if (local6.anObjectArray14 != null) {
									for (local303 = 0; local303 < Static176.anInt3771; local303++) {
										@Pc(1958) Class4_Sub12 local1958 = new Class4_Sub12();
										local1958.aClass115_5 = local6;
										local1958.anInt2450 = Static247.anInterface24Array1[local303].method6739();
										local1958.anInt2448 = Static247.anInterface24Array1[local303].method6735();
										local1958.anObjectArray3 = local6.anObjectArray14;
										Static577.aClass124_67.method3275(local1958);
									}
								}
								if (Static301.aBoolean414 && local6.anObjectArray30 != null) {
									local522 = new Class4_Sub12();
									local522.aClass115_5 = local6;
									local522.anObjectArray3 = local6.anObjectArray30;
									Static577.aClass124_67.method3275(local522);
								}
							}
							if (local6.anInt3519 == 5 && local6.anInt3452 != -1) {
								local6.method3143(Static5.aClass60_1, Static276.aClass110_1).method5704(local6.anInt3481, Static185.aClass66_14);
							}
							Static297.method4644(local6);
							if (local6.anInt3519 == 0) {
								method1218(arg0, local6.anInt3464, local28, local30, local32, local34, local17 - local6.anInt3485, local22 - local6.anInt3526, arg8, arg9);
								if (local6.aClass115Array1 != null) {
									method1218(local6.aClass115Array1, local6.anInt3464, local28, local30, local32, local34, local17 - local6.anInt3485, local22 - local6.anInt3526, arg8, arg9);
								}
								@Pc(2080) Class4_Sub49 local2080 = (Class4_Sub49) Static543.aClass183_39.method4289((long) local6.anInt3464);
								if (local2080 != null) {
									if (Static538.aClass263_5 == Static379.aClass263_4 && local2080.anInt9334 == 0 && !Static325.aBoolean431 && local208 && !Static126.aBoolean235) {
										Static161.method3169();
									}
									Static368.method5537(local28, local32, local22, local17, local2080.anInt9337, arg8, local30, arg9, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static297.method4644(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1219(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static272.anInt5182;
		@Pc(3) int[] local3 = Static362.anIntArray519;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static428.anInt7363; local5++) {
			@Pc(15) Class10_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local5 - local1])).aClass10_Sub1_Sub2_Sub1_1;
			}
			if (local15.aByte101 == arg0 && local15.anInt8511 >= 0) {
				@Pc(39) int local39 = local15.method7021();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8934 & 0x1FF) != 0 || (local15.anInt8929 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8934 & 0x1FF) != 256 || (local15.anInt8929 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8934 >> 9;
					local80 = local15.anInt8929 >> 9;
					if (local15.anInt8511 > Static246.anIntArrayArray54[local75][local80]) {
						Static246.anIntArrayArray54[local75][local80] = local15.anInt8511;
						Static459.anIntArrayArray67[local75][local80] = 1;
					} else if (local15.anInt8511 == Static246.anIntArrayArray54[local75][local80]) {
						local116 = Static459.anIntArrayArray67[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8934 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8929 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8934 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8929 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt8511 > Static246.anIntArrayArray54[local158][local161]) {
								Static246.anIntArrayArray54[local158][local161] = local15.anInt8511;
								Static459.anIntArrayArray67[local158][local161] = 1;
							} else if (local15.anInt8511 == Static246.anIntArrayArray54[local158][local161]) {
								local116 = Static459.anIntArrayArray67[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1220(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static272.anInt5182;
		@Pc(3) int[] local3 = Static362.anIntArray519;
		@Pc(11) int local11 = Static36.aBoolean64 ? local1 : local1 + Static428.anInt7363;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class10_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local13 - local1])).aClass10_Sub1_Sub2_Sub1_1;
			}
			if (local23.aByte101 == arg0) {
				local23.anInt8477 = 0;
				if (local23.anInt8511 < 0) {
					local23.aBoolean591 = false;
				} else {
					@Pc(54) int local54 = local23.method7021();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8934 & 0x1FF) != 0 || (local23.anInt8929 & 0x1FF) != 0) {
							local23.aBoolean591 = false;
							continue;
						}
					} else if ((local23.anInt8934 & 0x1FF) != 256 || (local23.anInt8929 & 0x1FF) != 256) {
						local23.aBoolean591 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8934 >> 9;
						local101 = local23.anInt8929 >> 9;
						if (local23.anInt8511 != Static246.anIntArrayArray54[local96][local101]) {
							local23.aBoolean591 = true;
							continue;
						}
						if (Static459.anIntArrayArray67[local96][local101] > 1) {
							local126 = Static459.anIntArrayArray67[local96][local101]--;
							local23.aBoolean591 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8934 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8929 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8934 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8929 + local96 >> 9;
						if (!Static423.method6071(local162, local155, local169, local101, local23.anInt8511)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt8511 == Static246.anIntArrayArray54[local180][local183]) {
										local126 = Static459.anIntArrayArray67[local180][local183]--;
									}
								}
							}
							local23.aBoolean591 = true;
							continue;
						}
					}
					if (local23 instanceof Class10_Sub1_Sub2_Sub2 && local23.aClass4_Sub44_3 != null && Static237.anInt7561 >= local23.aClass4_Sub44_3.anInt8046 && Static237.anInt7561 < local23.aClass4_Sub44_3.anInt8040) {
						((Class10_Sub1_Sub2_Sub2) local23).aBoolean597 = false;
					}
					local23.aBoolean591 = false;
					local23.anInt8931 = Static160.method3164(local23.anInt8934, local23.aByte101, local23.anInt8929);
					Static314.method7738(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1221() {
		@Pc(1) int local1 = Static272.anInt5182;
		@Pc(3) int[] local3 = Static362.anIntArray519;
		@Pc(20) boolean local20 = Static189.aClass4_Sub2_Sub1_1.anInt9302 == 1 && local1 > 200 || Static189.aClass4_Sub2_Sub1_1.anInt9302 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class10_Sub1_Sub2_Sub2 local29 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local3[local22]];
			if (local29.method7040()) {
				local29.method7344();
				if (local29.aShort116 >= 0 && local29.aShort117 >= 0 && local29.aShort118 < Static38.anInt740 && local29.aShort115 < Static38.anInt741) {
					local29.aBoolean597 = local29.aBoolean592 ? local20 : false;
					if (local29 == Static129.aClass10_Sub1_Sub2_Sub2_1) {
						local29.anInt8511 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean591) {
							local75++;
						}
						if (local29.anInt8505 > Static237.anInt7561) {
							local75 += 2;
						}
						local75 += 5 - local29.method7021() << 2;
						if (local29.aBoolean598) {
							local75 += 512;
						} else {
							if (Static187.anInt8848 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt8511 = local75 + 1;
					}
				} else {
					local29.anInt8511 = -1;
				}
			} else {
				local29.anInt8511 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static428.anInt7363; local116++) {
			@Pc(127) Class10_Sub1_Sub2_Sub1 local127 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local116])).aClass10_Sub1_Sub2_Sub1_1;
			if (local127.method3532() && local127.aClass54_1.method1107(Static511.aClass335_2)) {
				local127.method7344();
				if (local127.aShort116 >= 0 && local127.aShort117 >= 0 && local127.aShort118 < Static38.anInt740 && local127.aShort115 < Static38.anInt741) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean591) {
						local164++;
					}
					if (local127.anInt8505 > Static237.anInt7561) {
						local164 += 2;
					}
					local164 += 5 - local127.method7021() << 2;
					if (Static187.anInt8848 == 0) {
						if (local127.aClass54_1.aBoolean99) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static187.anInt8848 == 1) {
						if (local127.aClass54_1.aBoolean99) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass54_1.aBoolean97) {
						local164 += 1024;
					} else if (!local127.aClass54_1.aBoolean94) {
						local164 += 256;
					}
					local127.anInt8511 = local164 + 1;
				} else {
					local127.anInt8511 = -1;
				}
			} else {
				local127.anInt8511 = -1;
			}
		}
		for (local75 = 0; local75 < Static186.aClass18Array1.length; local75++) {
			@Pc(230) Class18 local230 = Static186.aClass18Array1[local75];
			if (local230 != null) {
				if (local230.anInt388 == 1) {
					@Pc(244) Class4_Sub50 local244 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local230.anInt387);
					if (local244 != null) {
						@Pc(249) Class10_Sub1_Sub2_Sub1 local249 = local244.aClass10_Sub1_Sub2_Sub1_1;
						if (local249.anInt8511 >= 0) {
							local249.anInt8511 += 2048;
						}
					}
				} else if (local230.anInt388 == 10) {
					@Pc(268) Class10_Sub1_Sub2_Sub2 local268 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local230.anInt387];
					if (local268 != null && local268 != Static129.aClass10_Sub1_Sub2_Sub2_1 && local268.anInt8511 >= 0) {
						local268.anInt8511 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z")
	public static boolean method1224(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1225() {
		@Pc(1) int local1 = Static272.anInt5182;
		@Pc(3) int[] local3 = Static362.anIntArray519;
		@Pc(11) int local11 = Static36.aBoolean64 ? local1 : local1 + Static428.anInt7363;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class10_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static246.aClass10_Sub1_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local13 - local1])).aClass10_Sub1_Sub2_Sub1_1;
			}
			if (local23.anInt8511 >= 0) {
				@Pc(43) int local43 = local23.method7021();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8934 & 0x1FF) == 0 && (local23.anInt8929 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8934 & 0x1FF) == 256 && (local23.anInt8929 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class10_Sub1_Sub2_Sub2 && local23.aClass4_Sub44_3 != null && Static237.anInt7561 >= local23.aClass4_Sub44_3.anInt8046 && Static237.anInt7561 < local23.aClass4_Sub44_3.anInt8040) {
					((Class10_Sub1_Sub2_Sub2) local23).aBoolean597 = false;
				}
				local23.anInt8931 = Static160.method3164(local23.anInt8934, local23.aByte101, local23.anInt8929);
				Static314.method7738(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1228() {
		Static486.anInt8198 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static428.anInt7363; local3++) {
			@Pc(14) Class10_Sub1_Sub2_Sub1 local14 = ((Class4_Sub50) Static106.aClass183_8.method4289((long) Static444.anIntArray617[local3])).aClass10_Sub1_Sub2_Sub1_1;
			if (local14.aBoolean591 && local14.method7037() != -1) {
				@Pc(32) int local32 = (local14.method7021() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8934 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8929 - local32 >> 9;
				@Pc(53) Class10_Sub1_Sub2 local53 = Static455.method6418(local39, local46, local14.aByte101);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt8531;
					if (local53 instanceof Class10_Sub1_Sub2_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt8477 == 0 && local53.method7037() != -1) {
						Static278.anIntArray452[Static486.anInt8198] = local58;
						Static263.anIntArray635[Static486.anInt8198] = local58;
						Static486.anInt8198++;
						local53.anInt8477++;
					}
					Static278.anIntArray452[Static486.anInt8198] = local58;
					Static263.anIntArray635[Static486.anInt8198] = local14.anInt8531 + 2048;
					Static486.anInt8198++;
					local53.anInt8477++;
				}
			}
		}
		Static489.method7983(Static278.anIntArray452, 0, Static486.anInt8198 - 1, Static263.anIntArray635);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gba;)Z")
	public static boolean method1229(@OriginalArg(0) Class115 arg0) {
		if (Static126.aBoolean235) {
			if (method1233(arg0).anInt5878 != 0) {
				return false;
			}
			if (arg0.anInt3519 == 0) {
				return false;
			}
		}
		return arg0.aBoolean283;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1230() {
		for (@Pc(1) int local1 = 0; local1 < Static38.anInt740; local1++) {
			@Pc(6) int[] local6 = Static246.anIntArrayArray54[local1];
			for (@Pc(8) int local8 = 0; local8 < Static38.anInt741; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!gba;)Lclient!mk;")
	public static Class4_Sub31 method1233(@OriginalArg(0) Class115 arg0) {
		@Pc(13) Class4_Sub31 local13 = (Class4_Sub31) Static446.aClass183_31.method4289(((long) arg0.anInt3464 << 32) + (long) arg0.anInt3517);
		return local13 == null ? arg0.aClass4_Sub31_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!gba;)Lclient!gba;")
	public static Class115 method1234(@OriginalArg(0) Class115 arg0) {
		@Pc(4) int local4 = method1233(arg0).method4968();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static92.method2118(arg0.anInt3441);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
