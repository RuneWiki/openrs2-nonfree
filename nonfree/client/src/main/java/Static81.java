import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!cb;")
	public static Class50 aClass50_20;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
	public static boolean aBoolean103 = true;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wq;IIIIIIIIIII)V")
	public static void method1266(@OriginalArg(0) Class394[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class394 local6 = arg0[local1];
			if (local6 != null && local6.anInt10530 == arg1) {
				@Pc(17) int local17 = local6.anInt10494 + arg6;
				@Pc(22) int local22 = local6.anInt10486 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt10479 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt10536;
					local45 = local22 + local6.anInt10532;
					if (local6.anInt10479 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt10479 == 0 || local6.aBoolean777 || method1268(local6).anInt7813 != 0 || local6 == Static96.aClass394_1 || local6.anInt10477 == Static63.anInt998 || local6.anInt10477 == Static180.anInt2968) {
					if (!method1279(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static305.aBoolean315) {
							local40 = Static304.method4150();
							local45 = Static563.method7702();
						}
						if (local6 == Static610.aClass394_12 && Static530.method7400(Static610.aClass394_12) != null) {
							Static335.aBoolean440 = true;
							Static336.anInt6063 = local17;
							Static116.anInt2040 = local22;
						}
						if (local6.aBoolean783 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean786 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class5_Sub28 local168 = (Class5_Sub28) Static259.aClass124_40.method2572(); local168 != null; local168 = (Class5_Sub28) Static259.aClass124_40.method2569()) {
									if (local168.aBoolean267) {
										local168.method8829();
										local168.aClass394_2.aBoolean785 = false;
									}
								}
								if (Static512.anInt8633 == 0) {
									Static610.aClass394_12 = null;
									Static96.aClass394_1 = null;
								}
								Static429.anInt7587 = 0;
								Static368.aBoolean461 = false;
								Static275.aBoolean285 = false;
								if (!Static423.aBoolean549) {
									Static301.method4088();
								}
							}
							@Pc(232) boolean local232;
							if (Static178.aClass111_1.method8703() + local40 >= local28 && Static178.aClass111_1.method8696() + local45 >= local30 && Static178.aClass111_1.method8703() + local40 < local32 && Static178.aClass111_1.method8696() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static386.aBoolean482 && local232) {
								if (local6.anInt10489 >= 0) {
									Static54.anInt8558 = local6.anInt10489;
								} else if (local6.aBoolean786) {
									Static54.anInt8558 = -1;
								}
							}
							if (!Static423.aBoolean549 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static629.method8372(arg10 - local17, arg11 - local22, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static178.aClass111_1.method8700() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class5_Sub25 local291 = (Class5_Sub25) Static598.aClass124_96.method2572();
							if (local291 != null && local291.method3318() == 0 && local291.method3315() + local40 >= local28 && local291.method3313() + local45 >= local30 && local291.method3315() + local40 < local32 && local291.method3313() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray108 != null && !Static384.method5635()) {
								for (local335 = 0; local335 < local6.aByteArray108.length; local335++) {
									if (Static176.aClass157_1.method3300(local6.aByteArray108[local335])) {
										if (local6.anIntArray602 == null || Static421.anInt7434 >= local6.anIntArray602[local335]) {
											@Pc(367) byte local367 = local6.aByteArray109[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static176.aClass157_1.method3300(86) && !Static176.aClass157_1.method3300(82) && !Static176.aClass157_1.method3300(81)) && ((local367 & 0x2) == 0 || Static176.aClass157_1.method3300(86)) && ((local367 & 0x1) == 0 || Static176.aClass157_1.method3300(82)) && ((local367 & 0x4) == 0 || Static176.aClass157_1.method3300(81))) {
												if (local335 < 10) {
													Static633.method8421(-1, local335 + 1, "", local6.anInt10490);
												} else if (local335 == 10) {
													Static355.method5247();
													@Pc(438) Class5_Sub42 local438 = method1268(local6);
													Static63.method936(local6, local438.anInt7814, local438.method6629());
													Static11.aString1 = Static326.method5086(local6);
													if (Static11.aString1 == null) {
														Static11.aString1 = "Null";
													}
													Static116.aString18 = local6.aString116 + "<col=ffffff>";
												}
												local469 = local6.anIntArray608[local335];
												if (local6.anIntArray602 == null) {
													local6.anIntArray602 = new int[local6.aByteArray108.length];
												}
												if (local469 == 0) {
													local6.anIntArray602[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray602[local335] = Static421.anInt7434 + local469;
												}
											}
										}
									} else if (local6.anIntArray602 != null) {
										local6.anIntArray602[local335] = 0;
									}
								}
							}
							if (local286) {
								Static468.method6908(local40 + local291.method3315() - local17, local6, local45 + local291.method3313() - local22);
							}
							if (Static610.aClass394_12 != null && Static610.aClass394_12 != local6 && local232 && method1268(local6).method6627()) {
								Static522.aClass394_9 = local6;
							}
							if (local6 == Static96.aClass394_1) {
								Static254.aBoolean280 = true;
								Static364.anInt6380 = local17;
								Static42.anInt602 = local22;
							}
							if (local6.aBoolean777 || local6.anInt10477 != 0) {
								@Pc(558) Class5_Sub28 local558;
								if (local232 && Static145.anInt2413 != 0 && local6.anObjectArray7 != null) {
									local558 = new Class5_Sub28();
									local558.aBoolean267 = true;
									local558.aClass394_2 = local6;
									local558.anInt3840 = Static145.anInt2413;
									local558.anObjectArray2 = local6.anObjectArray7;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static610.aClass394_12 != null || Static423.aBoolean549 || local6.anInt10477 != Static589.anInt9654 && Static429.anInt7587 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt10477 != 0) {
									if (local6.anInt10477 == Static542.anInt8895 || local6.anInt10477 == Static263.anInt4211) {
										Static463.aClass394_6 = local6;
										if (Static366.aClass116_2 != null) {
											Static366.aClass116_2.method2422(local6.anInt10532, Static563.aClass143_13);
										}
										if (local6.anInt10477 == Static542.anInt8895) {
											if (Static423.aBoolean549 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static199.method2813(arg8, Static563.aClass143_13, arg9);
											@Pc(641) Class41_Sub2 local641 = (Class41_Sub2) Static447.aClass102_6.method2062();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt1409 && arg10 < local641.anInt1404 && arg11 >= local641.anInt1407 && arg11 < local641.anInt1406) {
													Static301.method4088();
													Static539.method7465(local641.aClass41_Sub1_Sub1_Sub3_1);
												}
												local641 = (Class41_Sub2) Static447.aClass102_6.method2054();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt10477 == Static63.anInt998) {
										if (local6.method8731(Static563.aClass143_13) == null || Static514.anInt8684 != 0 && Static514.anInt8684 != 3 || Static423.aBoolean549 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray610[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray604[local708]) {
											continue;
										}
										local335 -= local6.anInt10536 / 2;
										local708 -= local6.anInt10532 / 2;
										if (Static133.anInt2254 == 4) {
											local747 = (int) Static495.aFloat161 & 0x3FFF;
										} else {
											local747 = (int) Static495.aFloat161 + Static538.anInt8846 & 0x3FFF;
										}
										@Pc(759) int local759 = Class242.anIntArray384[local747];
										@Pc(763) int local763 = Class242.anIntArray383[local747];
										if (Static133.anInt2254 != 4) {
											local759 = local759 * (Static342.anInt6178 + 256) >> 8;
											local763 = local763 * (Static342.anInt6178 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static133.anInt2254 == 4) {
											local813 = (Static476.anInt8263 >> 9) + (local792 >> 2);
											local821 = (Static170.anInt2808 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() - 1) * 256;
											local813 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 - local830 >> 9) + (local792 >> 2);
											local821 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 - local830 >> 9) - (local802 >> 2);
										}
										if (Static386.aBoolean482 && (Static2.anInt22 & 0x40) != 0) {
											@Pc(863) Class394 local863 = Static622.method7590(Static537.anInt10359, Static404.anInt6945);
											if (local863 == null) {
												Static355.method5247();
											} else {
												Static244.method3492(12, " ->", true, local6.anInt10469, Static11.aString1, Static476.anInt8267, (long) (local6.anInt10502 << 0 | local6.anInt10490), false, true, local813, local821, 1L);
											}
											continue;
										}
										if (Static591.aClass174_7 == Static478.aClass174_6) {
											Static244.method3492(44, "", true, -1, Static49.aClass42_27.method730(Static259.anInt4113), -1, 0L, false, true, local813, local821, 1L);
										}
										Static244.method3492(18, "", true, -1, Static90.aString13, Static14.anInt209, 0L, false, true, local813, local821, 1L);
										continue;
									}
									if (local6.anInt10477 == Static589.anInt9654) {
										Static413.aClass394_4 = local6;
										if (local232) {
											Static368.aBoolean461 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method3315() - local17 - local6.anInt10536 / 2) * 2.0D / (double) Static407.aFloat125);
											local708 = (int) -((double) (local45 + local291.method3313() - local22 - local6.anInt10532 / 2) * 2.0D / (double) Static407.aFloat125);
											local469 = Static255.anInt4085 + local335 + Static407.anInt6543;
											local747 = Static361.anInt6318 + local708 + Static407.anInt6539;
											@Pc(994) Class5_Sub2_Sub18 local994 = Static199.method2810();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method6512(local999, local469, local747);
											if (local999 != null) {
												if (Static176.aClass157_1.method3300(82) && Static281.anInt4403 > 0) {
													Static319.method4827(local999[1], local999[0], local999[2]);
													continue;
												}
												Static275.aBoolean285 = true;
												Static363.anInt6348 = local999[0];
												Static459.anInt7993 = local999[1];
												Static434.anInt7656 = local999[2];
											}
											Static429.anInt7587 = 1;
											Static481.aBoolean61 = false;
											Static546.anInt8936 = Static178.aClass111_1.method8703();
											Static127.anInt2189 = Static178.aClass111_1.method8696();
											continue;
										}
										if (local276 && Static429.anInt7587 > 0) {
											if (Static429.anInt7587 == 1 && (Static546.anInt8936 != Static178.aClass111_1.method8703() || Static127.anInt2189 != Static178.aClass111_1.method8696())) {
												Static496.anInt8474 = Static255.anInt4085;
												Static28.anInt388 = Static361.anInt6318;
												Static429.anInt7587 = 2;
											}
											if (Static429.anInt7587 == 2) {
												Static481.aBoolean61 = true;
												Static368.method5403(Static496.anInt8474 + (int) ((double) (Static546.anInt8936 - Static178.aClass111_1.method8703()) * 2.0D / (double) Static407.aFloat126));
												Static23.method334(Static28.anInt388 - (int) ((double) (Static127.anInt2189 - Static178.aClass111_1.method8696()) * 2.0D / (double) Static407.aFloat126));
											}
											continue;
										}
										if (Static429.anInt7587 > 0 && !Static481.aBoolean61) {
											if ((Static171.anInt2827 == 1 || Static360.method5299()) && Static223.anInt3566 > 2) {
												Static634.method8425(Static127.anInt2189, Static546.anInt8936);
											} else if (Static562.method7688()) {
												Static634.method8425(Static127.anInt2189, Static546.anInt8936);
											}
										}
										Static429.anInt7587 = 0;
										continue;
									}
									if (local6.anInt10477 == Static55.anInt890) {
										if (local276) {
											Static1.method5882(local40 + Static178.aClass111_1.method8703() - local17, local6.anInt10532, local6.anInt10536, local45 + Static178.aClass111_1.method8696() - local22);
										}
										continue;
									}
									if (local6.anInt10477 == Static180.anInt2968) {
										Static178.method2615(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean778 && local286) {
									local6.aBoolean778 = true;
									if (local6.anObjectArray6 != null) {
										local558 = new Class5_Sub28();
										local558.aBoolean267 = true;
										local558.aClass394_2 = local6;
										local558.anInt3839 = local40 + local291.method3315() - local17;
										local558.anInt3840 = local45 + local291.method3313() - local22;
										local558.anObjectArray2 = local6.anObjectArray6;
										Static259.aClass124_40.method2574(local558);
									}
								}
								if (local6.aBoolean778 && local276 && local6.anObjectArray8 != null) {
									local558 = new Class5_Sub28();
									local558.aBoolean267 = true;
									local558.aClass394_2 = local6;
									local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
									local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
									local558.anObjectArray2 = local6.anObjectArray8;
									Static259.aClass124_40.method2574(local558);
								}
								if (local6.aBoolean778 && !local276) {
									local6.aBoolean778 = false;
									if (local6.lb != null) {
										local558 = new Class5_Sub28();
										local558.aBoolean267 = true;
										local558.aClass394_2 = local6;
										local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
										local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
										local558.anObjectArray2 = local6.lb;
										Static311.aClass124_49.method2574(local558);
									}
								}
								if (local276 && local6.anObjectArray4 != null) {
									local558 = new Class5_Sub28();
									local558.aBoolean267 = true;
									local558.aClass394_2 = local6;
									local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
									local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
									local558.anObjectArray2 = local6.anObjectArray4;
									Static259.aClass124_40.method2574(local558);
								}
								if (!local6.aBoolean785 && local232) {
									local6.aBoolean785 = true;
									if (local6.anObjectArray21 != null) {
										local558 = new Class5_Sub28();
										local558.aBoolean267 = true;
										local558.aClass394_2 = local6;
										local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
										local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
										local558.anObjectArray2 = local6.anObjectArray21;
										Static259.aClass124_40.method2574(local558);
									}
								}
								if (local6.aBoolean785 && local232 && local6.anObjectArray16 != null) {
									local558 = new Class5_Sub28();
									local558.aBoolean267 = true;
									local558.aClass394_2 = local6;
									local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
									local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
									local558.anObjectArray2 = local6.anObjectArray16;
									Static259.aClass124_40.method2574(local558);
								}
								if (local6.aBoolean785 && !local232) {
									local6.aBoolean785 = false;
									if (local6.anObjectArray9 != null) {
										local558 = new Class5_Sub28();
										local558.aBoolean267 = true;
										local558.aClass394_2 = local6;
										local558.anInt3839 = local40 + Static178.aClass111_1.method8703() - local17;
										local558.anInt3840 = local45 + Static178.aClass111_1.method8696() - local22;
										local558.anObjectArray2 = local6.anObjectArray9;
										Static311.aClass124_49.method2574(local558);
									}
								}
								if (local6.anObjectArray22 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray22;
									Static102.aClass124_14.method2574(local558);
								}
								@Pc(1570) Class5_Sub28 local1570;
								if (local6.anObjectArray32 != null && Static10.anInt179 > local6.anInt10521) {
									if (local6.anIntArray609 == null || Static10.anInt179 - local6.anInt10521 > 32) {
										local558 = new Class5_Sub28();
										local558.aClass394_2 = local6;
										local558.anObjectArray2 = local6.anObjectArray32;
										Static259.aClass124_40.method2574(local558);
									} else {
										label699: for (local335 = local6.anInt10521; local335 < Static10.anInt179; local335++) {
											local708 = Static244.anIntArray241[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray609.length; local469++) {
												if (local6.anIntArray609[local469] == local708) {
													local1570 = new Class5_Sub28();
													local1570.aClass394_2 = local6;
													local1570.anObjectArray2 = local6.anObjectArray32;
													Static259.aClass124_40.method2574(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt10521 = Static10.anInt179;
								}
								if (local6.anObjectArray31 != null && Static624.anInt10014 > local6.anInt10458) {
									if (local6.anIntArray605 == null || Static624.anInt10014 - local6.anInt10458 > 32) {
										local558 = new Class5_Sub28();
										local558.aClass394_2 = local6;
										local558.anObjectArray2 = local6.anObjectArray31;
										Static259.aClass124_40.method2574(local558);
									} else {
										label675: for (local335 = local6.anInt10458; local335 < Static624.anInt10014; local335++) {
											local708 = Static566.anIntArray509[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray605.length; local469++) {
												if (local6.anIntArray605[local469] == local708) {
													local1570 = new Class5_Sub28();
													local1570.aClass394_2 = local6;
													local1570.anObjectArray2 = local6.anObjectArray31;
													Static259.aClass124_40.method2574(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt10458 = Static624.anInt10014;
								}
								if (local6.anObjectArray19 != null && Static599.anInt9730 > local6.anInt10520) {
									if (local6.anIntArray606 == null || Static599.anInt9730 - local6.anInt10520 > 32) {
										local558 = new Class5_Sub28();
										local558.aClass394_2 = local6;
										local558.anObjectArray2 = local6.anObjectArray19;
										Static259.aClass124_40.method2574(local558);
									} else {
										label651: for (local335 = local6.anInt10520; local335 < Static599.anInt9730; local335++) {
											local708 = Static259.anIntArray251[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray606.length; local469++) {
												if (local6.anIntArray606[local469] == local708) {
													local1570 = new Class5_Sub28();
													local1570.aClass394_2 = local6;
													local1570.anObjectArray2 = local6.anObjectArray19;
													Static259.aClass124_40.method2574(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt10520 = Static599.anInt9730;
								}
								if (local6.anObjectArray27 != null && Static496.anInt8473 > local6.anInt10497) {
									if (local6.anIntArray607 == null || Static496.anInt8473 - local6.anInt10497 > 32) {
										local558 = new Class5_Sub28();
										local558.aClass394_2 = local6;
										local558.anObjectArray2 = local6.anObjectArray27;
										Static259.aClass124_40.method2574(local558);
									} else {
										label627: for (local335 = local6.anInt10497; local335 < Static496.anInt8473; local335++) {
											local708 = Static348.anIntArray434[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray607.length; local469++) {
												if (local6.anIntArray607[local469] == local708) {
													local1570 = new Class5_Sub28();
													local1570.aClass394_2 = local6;
													local1570.anObjectArray2 = local6.anObjectArray27;
													Static259.aClass124_40.method2574(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt10497 = Static496.anInt8473;
								}
								if (local6.anObjectArray25 != null && Static6.anInt143 > local6.anInt10531) {
									if (local6.anIntArray611 == null || Static6.anInt143 - local6.anInt10531 > 32) {
										local558 = new Class5_Sub28();
										local558.aClass394_2 = local6;
										local558.anObjectArray2 = local6.anObjectArray25;
										Static259.aClass124_40.method2574(local558);
									} else {
										label603: for (local335 = local6.anInt10531; local335 < Static6.anInt143; local335++) {
											local708 = Static316.anIntArray454[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray611.length; local469++) {
												if (local6.anIntArray611[local469] == local708) {
													local1570 = new Class5_Sub28();
													local1570.aClass394_2 = local6;
													local1570.anObjectArray2 = local6.anObjectArray25;
													Static259.aClass124_40.method2574(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt10531 = Static6.anInt143;
								}
								if (Static649.anInt10250 > local6.anInt10444 && local6.anObjectArray3 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray3;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static223.anInt3567 > local6.anInt10444 && local6.anObjectArray23 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray23;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static554.anInt3882 > local6.anInt10444 && local6.anObjectArray15 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray15;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static675.anInt10641 > local6.anInt10444 && local6.anObjectArray13 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray13;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static605.anInt9763 > local6.anInt10444 && local6.anObjectArray18 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray18;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static552.anInt10276 > local6.anInt10444 && local6.anObjectArray28 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray28;
									Static259.aClass124_40.method2574(local558);
								}
								if (Static658.anInt9448 > local6.anInt10444 && local6.anObjectArray11 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray11;
									Static259.aClass124_40.method2574(local558);
								}
								local6.anInt10444 = Static293.anInt4549;
								if (local6.anObjectArray26 != null) {
									for (local335 = 0; local335 < Static358.anInt6287; local335++) {
										@Pc(2082) Class5_Sub28 local2082 = new Class5_Sub28();
										local2082.aClass394_2 = local6;
										local2082.anInt3836 = Static90.anInterface18Array1[local335].method5314();
										local2082.anInt3833 = Static90.anInterface18Array1[local335].method5313();
										local2082.anObjectArray2 = local6.anObjectArray26;
										Static259.aClass124_40.method2574(local2082);
									}
								}
								if (Static494.aBoolean613 && local6.anObjectArray34 != null) {
									local558 = new Class5_Sub28();
									local558.aClass394_2 = local6;
									local558.anObjectArray2 = local6.anObjectArray34;
									Static259.aClass124_40.method2574(local558);
								}
							}
							if (local6.anInt10479 == 5 && local6.anInt10488 != -1) {
								local6.method8742(Static1.aClass286_5, Static117.aClass64_1).method2422(local6.anInt10532, Static563.aClass143_13);
							}
							Static253.method3554(local6);
							if (local6.anInt10479 == 0) {
								method1266(arg0, local6.anInt10490, local28, local30, local32, local34, local17 - local6.anInt10506, local22 - local6.anInt10448, arg8, arg9, arg10, arg11);
								if (local6.aClass394Array2 != null) {
									method1266(local6.aClass394Array2, local6.anInt10490, local28, local30, local32, local34, local17 - local6.anInt10506, local22 - local6.anInt10448, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class5_Sub4 local2208 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local6.anInt10490);
								if (local2208 != null) {
									if (Static591.aClass174_7 == Static137.aClass174_1 && local2208.anInt259 == 0 && !Static423.aBoolean549 && local232 && !Static292.aBoolean301) {
										Static301.method4088();
									}
									Static284.method3904(local34, arg10, local28, local30, local22, local2208.anInt257, local17, arg8, local32, arg9, arg11);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static253.method3554(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wq;)Lclient!pda;")
	public static Class5_Sub42 method1268(@OriginalArg(0) Class394 arg0) {
		@Pc(13) Class5_Sub42 local13 = (Class5_Sub42) Static67.aClass335_8.method7766(((long) arg0.anInt10490 << 32) + (long) arg0.anInt10502);
		return local13 == null ? arg0.aClass5_Sub42_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method1269(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static72.anInt9084;
		@Pc(3) int[] local3 = Static388.anIntArray381;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static386.anInt6720; local5++) {
			@Pc(15) Class41_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local3[local5]];
			} else {
				local15 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local5 - local1])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			}
			if (local15.aByte149 == arg0 && local15.anInt9473 >= 0) {
				@Pc(39) int local39 = local15.method7917();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10366 & 0x1FF) != 0 || (local15.anInt10367 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10366 & 0x1FF) != 256 || (local15.anInt10367 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10366 >> 9;
					local80 = local15.anInt10367 >> 9;
					if (local15.anInt9473 > Static54.anIntArrayArray68[local75][local80]) {
						Static54.anIntArrayArray68[local75][local80] = local15.anInt9473;
						Static244.anIntArrayArray36[local75][local80] = 1;
					} else if (local15.anInt9473 == Static54.anIntArrayArray68[local75][local80]) {
						local116 = Static244.anIntArrayArray36[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10366 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10367 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10366 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10367 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt9473 > Static54.anIntArrayArray68[local158][local161]) {
								Static54.anIntArrayArray68[local158][local161] = local15.anInt9473;
								Static244.anIntArrayArray36[local158][local161] = 1;
							} else if (local15.anInt9473 == Static54.anIntArrayArray68[local158][local161]) {
								local116 = Static244.anIntArrayArray36[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method1270() {
		Static26.aClass394Array1 = null;
		if (Static305.aBoolean315 && Static581.method7952() != 1) {
			Static540.method7467(Static574.method7841(), Static539.anInt8853 == 3 || Static539.anInt8853 == 7, 0, Static609.method8191(), 0);
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static305.aBoolean315) {
			local38 = Static304.method4150();
			local40 = Static563.method7702();
		}
		Static389.method572(-1, local38, local40, local38 + Static563.anInt9176, Static131.anInt2222, local40, Static316.anInt8165 + local40, local38);
		if (Static26.aClass394Array1 != null) {
			Static269.method3785(Static503.anInt8533, Static26.aClass394Array1, true, -1412584499, local38 + Static563.anInt9176, Static96.aClass394_1.anInt10449, local38, Static316.anInt8165 + local40, Static244.anInt3955, local40);
			Static26.aClass394Array1 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1271() {
		@Pc(1) int local1 = Static72.anInt9084;
		@Pc(3) int[] local3 = Static388.anIntArray381;
		@Pc(8) int local8 = Static655.aClass5_Sub36_29.aClass2_Sub26_1.method8525();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class41_Sub1_Sub1_Sub3_Sub2 local32 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local3[local25]];
			if (!local32.method7937()) {
				local32.anInt9473 = -1;
			} else if (local32.aBoolean696) {
				local32.anInt9473 = -1;
			} else {
				local32.method7909();
				if (local32.aShort109 >= 0 && local32.aShort108 >= 0 && local32.aShort107 < Static124.anInt2150 && local32.aShort110 < Static64.anInt1015) {
					local32.aBoolean700 = local32.aBoolean690 ? local23 : false;
					if (local32 == Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1) {
						local32.anInt9473 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean692) {
							local85++;
						}
						if (local32.anInt9522 > Static421.anInt7434) {
							local85 += 2;
						}
						local85 += 5 - local32.method7917() << 2;
						if (local32.aBoolean698 || local32.aBoolean697) {
							local85 += 512;
						} else {
							if (Static534.anInt10371 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt9473 = local85 + 1;
					}
				} else {
					local32.anInt9473 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static386.anInt6720; local129++) {
			@Pc(140) Class41_Sub1_Sub1_Sub3_Sub1 local140 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local129])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (local140.method4718() && local140.aClass311_1.method7329(Static413.aClass63_1)) {
				local140.method7909();
				if (local140.aShort109 >= 0 && local140.aShort108 >= 0 && local140.aShort107 < Static124.anInt2150 && local140.aShort110 < Static64.anInt1015) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean692) {
						local177++;
					}
					if (local140.anInt9522 > Static421.anInt7434) {
						local177 += 2;
					}
					local177 += 5 - local140.method7917() << 2;
					if (Static534.anInt10371 == 0) {
						if (local140.aClass311_1.aBoolean629) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static534.anInt10371 == 1) {
						if (local140.aClass311_1.aBoolean629) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass311_1.aBoolean626) {
						local177 += 1024;
					} else if (!local140.aClass311_1.aBoolean627) {
						local177 += 256;
					}
					local140.anInt9473 = local177 + 1;
				} else {
					local140.anInt9473 = -1;
				}
			} else {
				local140.anInt9473 = -1;
			}
		}
		for (local85 = 0; local85 < Static217.aClass358Array1.length; local85++) {
			@Pc(243) Class358 local243 = Static217.aClass358Array1[local85];
			if (local243 != null) {
				if (local243.anInt9736 == 1) {
					@Pc(257) Class5_Sub34 local257 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local243.anInt9743);
					if (local257 != null) {
						@Pc(262) Class41_Sub1_Sub1_Sub3_Sub1 local262 = local257.aClass41_Sub1_Sub1_Sub3_Sub1_1;
						if (local262.anInt9473 >= 0) {
							local262.anInt9473 += 2048;
						}
					}
				} else if (local243.anInt9736 == 10) {
					@Pc(281) Class41_Sub1_Sub1_Sub3_Sub2 local281 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local243.anInt9743];
					if (local281 != null && local281 != Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 && local281.anInt9473 >= 0) {
						local281.anInt9473 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wq;)Lclient!wq;")
	public static Class394 method1272(@OriginalArg(0) Class394 arg0) {
		@Pc(4) int local4 = method1268(arg0).method6628();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static238.method3422(arg0.anInt10530);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1273(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static72.anInt9084;
		@Pc(3) int[] local3 = Static388.anIntArray381;
		@Pc(11) int local11 = Static210.aBoolean233 ? local1 : local1 + Static386.anInt6720;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class41_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local13 - local1])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			}
			if (local23.aByte149 == arg0) {
				local23.anInt9506 = 0;
				if (local23.anInt9473 < 0) {
					local23.aBoolean692 = false;
				} else {
					@Pc(54) int local54 = local23.method7917();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10366 & 0x1FF) != 0 || (local23.anInt10367 & 0x1FF) != 0) {
							local23.aBoolean692 = false;
							continue;
						}
					} else if ((local23.anInt10366 & 0x1FF) != 256 || (local23.anInt10367 & 0x1FF) != 256) {
						local23.aBoolean692 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10366 >> 9;
						local101 = local23.anInt10367 >> 9;
						if (local23.anInt9473 != Static54.anIntArrayArray68[local96][local101]) {
							local23.aBoolean692 = true;
							continue;
						}
						if (Static244.anIntArrayArray36[local96][local101] > 1) {
							local126 = Static244.anIntArrayArray36[local96][local101]--;
							local23.aBoolean692 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10366 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10367 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10366 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10367 + local96 >> 9;
						if (!Static225.method3193(local23.anInt9473, local101, local169, local155, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt9473 == Static54.anIntArrayArray68[local180][local183]) {
										local126 = Static244.anIntArrayArray36[local180][local183]--;
									}
								}
							}
							local23.aBoolean692 = true;
							continue;
						}
					}
					local23.aBoolean692 = false;
					local23.anInt10370 = Static161.method1246(local23.aByte149, local23.anInt10367, local23.anInt10366);
					Static213.method3080(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1276() {
		Static251.anInt3743 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static386.anInt6720; local3++) {
			@Pc(14) Class41_Sub1_Sub1_Sub3_Sub1 local14 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local3])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			if (local14.aBoolean692 && local14.method7913() != -1) {
				@Pc(32) int local32 = (local14.method7917() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10366 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10367 - local32 >> 9;
				@Pc(53) Class41_Sub1_Sub1_Sub3 local53 = Static232.method3324(local14.aByte149, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt9469;
					if (local53 instanceof Class41_Sub1_Sub1_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt9506 == 0 && local53.method7913() != -1) {
						Static553.anIntArray496[Static251.anInt3743] = local58;
						Static434.anIntArray428[Static251.anInt3743] = local58;
						Static251.anInt3743++;
						local53.anInt9506++;
					}
					Static553.anIntArray496[Static251.anInt3743] = local58;
					Static434.anIntArray428[Static251.anInt3743] = local14.anInt9469 + 2048;
					Static251.anInt3743++;
					local53.anInt9506++;
				}
			}
		}
		Static644.method8506(Static553.anIntArray496, Static434.anIntArray428, Static251.anInt3743 - 1, 0);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wq;)Z")
	public static boolean method1279(@OriginalArg(0) Class394 arg0) {
		if (Static292.aBoolean301) {
			if (method1268(arg0).anInt7813 != 0) {
				return false;
			}
			if (arg0.anInt10479 == 0) {
				return false;
			}
		}
		return arg0.aBoolean780;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1280() {
		@Pc(1) int local1 = Static72.anInt9084;
		@Pc(3) int[] local3 = Static388.anIntArray381;
		@Pc(11) int local11 = Static210.aBoolean233 ? local1 : local1 + Static386.anInt6720;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class41_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local3[local13]];
			} else {
				local23 = ((Class5_Sub34) Static223.aClass335_19.method7766((long) Static662.anIntArray600[local13 - local1])).aClass41_Sub1_Sub1_Sub3_Sub1_1;
			}
			if (local23.anInt9473 >= 0) {
				@Pc(43) int local43 = local23.method7917();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10366 & 0x1FF) == 0 && (local23.anInt10367 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10366 & 0x1FF) == 256 && (local23.anInt10367 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10370 = Static161.method1246(local23.aByte149, local23.anInt10367, local23.anInt10366);
				Static213.method3080(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1281() {
		for (@Pc(1) int local1 = 0; local1 < Static124.anInt2150; local1++) {
			@Pc(6) int[] local6 = Static54.anIntArrayArray68[local1];
			for (@Pc(8) int local8 = 0; local8 < Static64.anInt1015; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
