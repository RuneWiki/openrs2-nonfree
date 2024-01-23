import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt3353 = 20;

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
	public static int[] anIntArray346 = new int[500];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([Lclient!q;IIZIIIIII)V")
	public static void method2315(@OriginalArg(0) Class80[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static64.method1166(arg1, arg2, arg8, arg4);
		Static155.method2532();
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(24) Class80 local24 = arg0[local18];
			if (local24 != null && (arg7 == local24.anInt3697 || arg7 == -1412584499 && local24 == Static160.aClass80_13)) {
				@Pc(75) int local75;
				if (arg3 == -1) {
					Static71.anIntArray175[Static182.anInt4210] = arg5 + local24.anInt3627;
					Static117.anIntArray303[Static182.anInt4210] = local24.anInt3671 + arg6;
					Static118.anIntArray306[Static182.anInt4210] = local24.anInt3635;
					Static70.anIntArray173[Static182.anInt4210] = local24.anInt3660;
					local75 = Static182.anInt4210++;
				} else {
					local75 = arg3;
				}
				local24.anInt3629 = Static103.anInt2511;
				local24.anInt3636 = local75;
				if (!local24.aBoolean215 || !Static63.method1161(local24)) {
					if (local24.anInt3670 > 0) {
						Static15.method302(local24);
					}
					@Pc(103) int local103 = local24.anInt3627 + arg5;
					@Pc(109) int local109 = local24.anInt3671 + arg6;
					@Pc(112) int local112 = local24.anInt3684;
					if (Static102.aBoolean133 && (Static70.method1287(local24) != 0 || local24.anInt3640 == 0) && local112 > 127) {
						local112 = 127;
					}
					@Pc(161) int local161;
					@Pc(200) int local200;
					if (local24 == Static160.aClass80_13) {
						if (arg7 != -1412584499 && !local24.aBoolean217) {
							Static5.anInt279 = arg6;
							Static160.aClass80Array2 = arg0;
							Static82.anInt2105 = arg5;
							continue;
						}
						if (!local24.aBoolean217) {
							local112 = 128;
						}
						if (Static179.aBoolean258 && Static27.aBoolean122) {
							local161 = Static26.anInt663;
							local161 -= Static133.anInt3047;
							if (Static112.anInt2697 > local161) {
								local161 = Static112.anInt2697;
							}
							if (Static45.aClass80_4.anInt3635 + Static112.anInt2697 < local24.anInt3635 + local161) {
								local161 = Static112.anInt2697 + Static45.aClass80_4.anInt3635 - local24.anInt3635;
							}
							local103 = local161;
							local200 = Static212.anInt4711;
							local200 -= Static183.anInt1328;
							if (Static26.anInt658 > local200) {
								local200 = Static26.anInt658;
							}
							if (local200 + local24.anInt3660 > Static26.anInt658 - -Static45.aClass80_4.anInt3660) {
								local200 = Static45.aClass80_4.anInt3660 + Static26.anInt658 - local24.anInt3660;
							}
							local109 = local200;
						}
					}
					@Pc(242) int local242;
					@Pc(244) int local244;
					@Pc(271) int local271;
					@Pc(277) int local277;
					if (local24.anInt3640 == 2) {
						local200 = arg2;
						local242 = arg8;
						local244 = arg4;
						local161 = arg1;
					} else {
						local200 = local109 <= arg2 ? arg2 : local109;
						local161 = arg1 >= local103 ? arg1 : local103;
						local271 = local24.anInt3635 + local103;
						local277 = local109 + local24.anInt3660;
						if (local24.anInt3640 == 9) {
							local277++;
							local271++;
						}
						local244 = local277 >= arg4 ? arg4 : local277;
						local242 = arg8 <= local271 ? arg8 : local271;
					}
					if (!local24.aBoolean215 || local161 < local242 && local200 < local244) {
						if (local24.anInt3670 != 0) {
							if (local24.anInt3670 == 1337) {
								Static53.anInt1532 = local103;
								Static118.anInt2858 = local109;
								Static35.method682(local24.anInt3635, local103, local24.anInt3660, local109);
								Static64.method1166(arg1, arg2, arg8, arg4);
								continue;
							}
							if (local24.anInt3670 == 1338) {
								if (local24.method2543()) {
									Static107.method1819(local24, local75, local103, local109);
									Static64.method1166(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (local24.anInt3670 == 1339) {
								if (local24.method2543()) {
									Static95.method1654(local75, local103, local109, local24);
									Static64.method1166(arg1, arg2, arg8, arg4);
								}
								continue;
							}
							if (local24.anInt3670 == 1400) {
								Static91.method1601(local24.anInt3635, local24.anInt3660, local103, local109);
								Static199.aBooleanArray23[local75] = true;
								Static187.aBooleanArray22[local75] = true;
								Static64.method1166(arg1, arg2, arg8, arg4);
								continue;
							}
							if (local24.anInt3670 == 1401) {
								Static214.method3267(local109, local103, local24.anInt3635, local24.anInt3660);
								Static199.aBooleanArray23[local75] = true;
								Static187.aBooleanArray22[local75] = true;
								Static64.method1166(arg1, arg2, arg8, arg4);
								continue;
							}
						}
						local271 = Static26.anInt663;
						if (local24.anInt3640 == 0 && local24.aBoolean222 && local161 <= Static26.anInt663 && Static212.anInt4711 >= local200 && local242 > Static26.anInt663 && Static212.anInt4711 < local244 && !Static94.aBoolean123 && !Static102.aBoolean133) {
							Static179.anInt4150 = 1;
							Static59.aClass41Array24[0] = Static5.aClass41_50;
							Static177.aClass41Array63[0] = Static156.aClass41_981;
							Static48.aShortArray34[0] = 1007;
						}
						local277 = Static212.anInt4711;
						if (!Static94.aBoolean123 && local271 >= local161 && local277 >= local200 && local271 < local242 && local244 > local277) {
							Static11.method289(local277 - local109, -local103 + local271, local24);
						}
						if (local24.anInt3640 == 0) {
							if (!local24.aBoolean215 && Static63.method1161(local24) && local24 != Static58.aClass80_7) {
								continue;
							}
							if (!local24.aBoolean215) {
								if (local24.anInt3655 > local24.anInt3632 - local24.anInt3660) {
									local24.anInt3655 = local24.anInt3632 - local24.anInt3660;
								}
								if (local24.anInt3655 < 0) {
									local24.anInt3655 = 0;
								}
							}
							method2315(arg0, local161, local200, local75, local244, local103 - local24.anInt3642, -local24.anInt3655 + local109, local24.anInt3661, local242);
							if (local24.aClass80Array1 != null) {
								method2315(local24.aClass80Array1, local161, local200, local75, local244, local103 - local24.anInt3642, -local24.anInt3655 + local109, local24.anInt3661, local242);
							}
							@Pc(632) Class2_Sub21 local632 = (Class2_Sub21) Static113.aClass70_8.method2205((long) local24.anInt3661);
							if (local632 != null) {
								if (local632.anInt3439 == 0 && local161 <= Static26.anInt663 && local200 <= Static212.anInt4711 && Static26.anInt663 < local242 && Static212.anInt4711 < local244 && !Static94.aBoolean123 && !Static102.aBoolean133) {
									Static48.aShortArray34[0] = 1007;
									Static179.anInt4150 = 1;
									Static59.aClass41Array24[0] = Static5.aClass41_50;
									Static177.aClass41Array63[0] = Static156.aClass41_981;
								}
								Static48.method965(local244, local632.anInt3435, local200, local75, local109, local161, local103, local242);
							}
							Static64.method1166(arg1, arg2, arg8, arg4);
							Static155.method2532();
						}
						if (Static99.aBooleanArray13[local75] || Static119.anInt2867 > 1) {
							if (local24.anInt3640 == 0 && !local24.aBoolean215 && local24.anInt3660 < local24.anInt3632) {
								Static214.method3269(local24.anInt3655, local24.anInt3660, local109, local24.anInt3632, local103 + local24.anInt3635);
							}
							if (local24.anInt3640 != 1) {
								@Pc(740) int local740;
								@Pc(744) int local744;
								@Pc(766) int local766;
								@Pc(951) int local951;
								@Pc(830) int local830;
								@Pc(738) int local738;
								@Pc(946) int local946;
								@Pc(756) int local756;
								if (local24.anInt3640 == 2) {
									local738 = 0;
									for (local740 = 0; local740 < local24.anInt3658; local740++) {
										for (local744 = 0; local744 < local24.anInt3696; local744++) {
											local756 = local109 + (local24.anInt3699 + 32) * local740;
											local766 = local103 + local744 * (local24.anInt3677 + 32);
											if (local738 < 20) {
												local766 += local24.anIntArray389[local738];
												local756 += local24.anIntArray382[local738];
											}
											if (local24.anIntArray380[local738] > 0) {
												local830 = local24.anIntArray380[local738] - 1;
												if (local766 + 32 > arg1 && local766 < arg8 && arg2 < local756 + 32 && local756 < arg4 || Static120.aClass80_11 == local24 && local738 == Static17.anInt473) {
													@Pc(886) Class2_Sub2_Sub16 local886;
													if (Static26.anInt665 == 1 && local738 == Static53.anInt1534 && local24.anInt3661 == Static185.anInt4248) {
														local886 = Static20.method430(2, local830, local24.anIntArray390[local738], local24.aBoolean220, 0);
													} else {
														local886 = Static20.method430(1, local830, local24.anIntArray390[local738], local24.aBoolean220, 3153952);
													}
													if (Static155.aBoolean211) {
														Static199.aBooleanArray23[local75] = true;
													}
													if (local886 == null) {
														Static176.method2833(local24);
													} else if (local24 == Static120.aClass80_11 && Static17.anInt473 == local738) {
														local946 = Static26.anInt663 - Static194.anInt4770;
														local951 = Static212.anInt4711 - Static44.anInt1329;
														if (local946 < 5 && local946 > -5) {
															local946 = 0;
														}
														if (local951 < 5 && local951 > -5) {
															local951 = 0;
														}
														if (Static220.anInt4800 < 5) {
															local946 = 0;
															local951 = 0;
														}
														local886.method2404(local946 + local766, local951 + local756, 128);
														if (arg7 != -1) {
															@Pc(1001) Class80 local1001 = arg0[arg7 & 0xFFFF];
															@Pc(1003) int local1003 = Static64.anInt1700;
															@Pc(1005) int local1005 = Static64.anInt1699;
															@Pc(1033) int local1033;
															if (local756 + local951 < local1005 && local1001.anInt3655 > 0) {
																local1033 = Static16.anInt432 * (local1005 - local951 - local756) / 3;
																if (Static16.anInt432 * 10 < local1033) {
																	local1033 = Static16.anInt432 * 10;
																}
																if (local1001.anInt3655 < local1033) {
																	local1033 = local1001.anInt3655;
																}
																local1001.anInt3655 -= local1033;
																Static44.anInt1329 += local1033;
																Static176.method2833(local1001);
															}
															if (local951 + local756 + 32 > local1003 && local1001.anInt3632 - local1001.anInt3660 > local1001.anInt3655) {
																local1033 = Static16.anInt432 * (local756 + local951 + 32 - local1003) / 3;
																if (Static16.anInt432 * 10 < local1033) {
																	local1033 = Static16.anInt432 * 10;
																}
																if (local1001.anInt3632 - local1001.anInt3655 - local1001.anInt3660 < local1033) {
																	local1033 = local1001.anInt3632 - local1001.anInt3655 - local1001.anInt3660;
																}
																local1001.anInt3655 += local1033;
																Static44.anInt1329 -= local1033;
																Static176.method2833(local1001);
															}
														}
													} else if (Static52.aClass80_6 == local24 && local738 == Static81.anInt2075) {
														local886.method2404(local766, local756, 128);
													} else {
														local886.method2407(local766, local756);
													}
												}
											} else if (local24.anIntArray381 != null && local738 < 20) {
												@Pc(804) Class2_Sub2_Sub16 local804 = local24.method2545(local738);
												if (local804 != null) {
													local804.method2407(local766, local756);
												} else if (Static220.aBoolean292) {
													Static176.method2833(local24);
												}
											}
											local738++;
										}
									}
								} else if (local24.anInt3640 == 3) {
									if (Static70.method1290(local24)) {
										local738 = local24.anInt3701;
										if (local24 == Static58.aClass80_7 && local24.anInt3631 != 0) {
											local738 = local24.anInt3631;
										}
									} else {
										local738 = local24.anInt3654;
										if (Static58.aClass80_7 == local24 && local24.anInt3666 != 0) {
											local738 = local24.anInt3666;
										}
									}
									if (local112 == 0) {
										if (local24.aBoolean227) {
											Static64.method1164(local103, local109, local24.anInt3635, local24.anInt3660, local738);
										} else {
											Static64.method1162(local103, local109, local24.anInt3635, local24.anInt3660, local738);
										}
									} else if (local24.aBoolean227) {
										Static64.method1183(local103, local109, local24.anInt3635, local24.anInt3660, local738, 256 - (local112 & 0xFF));
									} else {
										Static64.method1170(local103, local109, local24.anInt3635, local24.anInt3660, local738, 256 - (local112 & 0xFF));
									}
								} else {
									@Pc(1270) Class2_Sub2_Sub4 local1270;
									if (local24.anInt3640 == 4) {
										local1270 = local24.method2549(Static32.aClass60Array8);
										if (local1270 != null) {
											@Pc(1282) Class41 local1282 = local24.aClass41_979;
											if (Static70.method1290(local24)) {
												local740 = local24.anInt3701;
												if (Static58.aClass80_7 == local24 && local24.anInt3631 != 0) {
													local740 = local24.anInt3631;
												}
												if (local24.aClass41_980.method1393() > 0) {
													local1282 = local24.aClass41_980;
												}
											} else {
												local740 = local24.anInt3654;
												if (Static58.aClass80_7 == local24 && local24.anInt3666 != 0) {
													local740 = local24.anInt3666;
												}
											}
											if (local24.aBoolean215 && local24.anInt3645 != -1) {
												@Pc(1341) Class2_Sub2_Sub15 local1341 = Static63.method1158(local24.anInt3645);
												local1282 = local1341.aClass41_858;
												if (local1282 == null) {
													local1282 = Static161.aClass41_1008;
												}
												if ((local1341.anInt3106 == 1 || local24.anInt3685 != 1) && local24.anInt3685 != -1) {
													local1282 = Static149.method2324(new Class41[] { Static121.aClass41_1282, local1282, Static29.aClass41_200, Static129.method408(local24.anInt3685) });
												}
											}
											if (Static48.aClass80_5 == local24) {
												local1282 = Static128.aClass41_842;
												local740 = local24.anInt3654;
											}
											if (!local24.aBoolean215) {
												local1282 = Static146.method2255(local1282, local24);
											}
											local1270.method783(local1282, local103, local109, local24.anInt3635, local24.anInt3660, local740, local24.aBoolean218 ? 0 : -1, local24.anInt3683, local24.anInt3679, local24.anInt3644);
										} else if (Static220.aBoolean292) {
											Static176.method2833(local24);
										}
									} else if (local24.anInt3640 == 5) {
										@Pc(1453) Class2_Sub2_Sub16 local1453;
										if (local24.aBoolean215) {
											if (local24.anInt3645 == -1) {
												local1453 = local24.method2546(false);
											} else {
												local1453 = Static20.method430(local24.anInt3664, local24.anInt3645, local24.anInt3685, local24.aBoolean220, local24.anInt3663);
											}
											if (local1453 != null) {
												local740 = local1453.anInt3489;
												local744 = local1453.anInt3486;
												if (local24.aBoolean216) {
													local766 = (local740 + local24.anInt3635 - 1) / local740;
													local756 = (local24.anInt3660 + local744 - 1) / local744;
													Static64.method1179(local103, local109, local24.anInt3635 + local103, local24.anInt3660 + local109);
													for (local946 = 0; local946 < local766; local946++) {
														for (local951 = 0; local951 < local756; local951++) {
															if (local24.anInt3669 != 0) {
																local1453.method2398(local744 / 2 + local951 * local744 + local109, local103 + local740 * local946 - -(local740 / 2), 4096, local24.anInt3669);
															} else if (local112 == 0) {
																local1453.method2407(local103 + local946 * local740, local109 + local951 * local744);
															} else {
																local1453.method2404(local946 * local740 + local103, local951 * local744 + local109, 256 - (local112 & 0xFF));
															}
														}
													}
													Static64.method1166(arg1, arg2, arg8, arg4);
												} else {
													local766 = local24.anInt3635 * 4096 / local740;
													if (local24.anInt3669 != 0) {
														local1453.method2398(local109 + local24.anInt3660 / 2, local103 - -(local24.anInt3635 / 2), local766, local24.anInt3669);
													} else if (local112 != 0) {
														local1453.method2401(local103, local109, local24.anInt3635, local24.anInt3660, 256 - (local112 & 0xFF));
													} else if (local24.anInt3635 == local740 && local24.anInt3660 == local744) {
														local1453.method2407(local103, local109);
													} else {
														local1453.method2395(local103, local109, local24.anInt3635, local24.anInt3660);
													}
												}
											} else if (Static220.aBoolean292) {
												Static176.method2833(local24);
											}
										} else {
											local1453 = local24.method2546(Static70.method1290(local24));
											if (local1453 != null) {
												local1453.method2407(local103, local109);
											} else if (Static220.aBoolean292) {
												Static176.method2833(local24);
											}
										}
									} else {
										@Pc(1847) Class2_Sub2_Sub15 local1847;
										@Pc(1962) int local1962;
										if (local24.anInt3640 == 6) {
											@Pc(1714) boolean local1714 = Static70.method1290(local24);
											local766 = 0;
											@Pc(1718) Class12_Sub2 local1718 = null;
											if (local1714) {
												local740 = local24.anInt3639;
											} else {
												local740 = local24.anInt3647;
											}
											if (local24.anInt3645 != -1) {
												local1847 = Static63.method1158(local24.anInt3645);
												if (local1847 != null) {
													local1847 = local1847.method2153(local24.anInt3685);
													local1718 = local1847.method2157(1, 0, null);
													if (local1718 == null) {
														Static176.method2833(local24);
													} else {
														local766 = -local1718.method2718() / 2;
													}
												}
											} else if (local24.anInt3665 == 5) {
												if (local24.anInt3651 == -1) {
													local1718 = Static115.aClass91_3.method2930(null, -1, -1, null);
												} else {
													local756 = local24.anInt3651 & 0x7FF;
													if (Static195.anInt4428 == local756) {
														local756 = 2047;
													}
													@Pc(1808) Class12_Sub3_Sub1 local1808 = Static216.aClass12_Sub3_Sub1Array1[local756];
													@Pc(1817) Class2_Sub2_Sub9 local1817 = local740 == -1 ? null : Static14.method299(local740);
													if (local1808 != null && (int) local1808.aClass41_362.method1419() << 11 == (local24.anInt3651 & 0xFFFFF800)) {
														local1718 = local1808.aClass91_1.method2930(null, local24.anInt3634, 0, local1817);
													}
												}
											} else if (local740 == -1) {
												local1718 = local24.method2542(null, Static213.aClass12_Sub3_Sub1_1.aClass91_1, -1, local1714);
												if (local1718 == null && Static220.aBoolean292) {
													Static176.method2833(local24);
												}
											} else {
												@Pc(1763) Class2_Sub2_Sub9 local1763 = Static14.method299(local740);
												local1718 = local24.method2542(local1763, Static213.aClass12_Sub3_Sub1_1.aClass91_1, local24.anInt3634, local1714);
												if (local1718 == null && Static220.aBoolean292) {
													Static176.method2833(local24);
												}
											}
											if (local1718 != null) {
												if (local24.anInt3657 <= 0) {
													local946 = 256;
												} else {
													local946 = (local24.anInt3660 << 8) / local24.anInt3657;
												}
												if (local24.anInt3678 <= 0) {
													local756 = 256;
												} else {
													local756 = (local24.anInt3635 << 8) / local24.anInt3678;
												}
												local951 = local24.anInt3635 / 2 + local103 + (local756 * local24.anInt3667 >> 8);
												local830 = (local946 * local24.anInt3648 >> 8) + local24.anInt3660 / 2 + local109;
												Static155.method2525(local951, local830);
												@Pc(1952) int local1952 = local24.anInt3686 * Class79.anIntArray375[local24.anInt3674] >> 16;
												local1962 = Class79.anIntArray377[local24.anInt3674] * local24.anInt3686 >> 16;
												if (!local24.aBoolean215) {
													local1718.method1862(local24.anInt3700, 0, local24.anInt3674, 0, local1962, local1952);
												} else if (local24.aBoolean214) {
													((Class12_Sub2_Sub1) local1718).method1879(local24.anInt3700, local24.anInt3704, local24.anInt3674, local24.anInt3626, local766 + local1962 + local24.anInt3693, local1952 + local24.anInt3693, local24.anInt3686);
												} else {
													local1718.method1862(local24.anInt3700, local24.anInt3704, local24.anInt3674, local24.anInt3626, local24.anInt3693 + local1962 + local766, local24.anInt3693 + local1952);
												}
												Static155.method2536();
											}
										} else {
											if (local24.anInt3640 == 7) {
												local1270 = local24.method2549(Static32.aClass60Array8);
												if (local1270 == null) {
													if (Static220.aBoolean292) {
														Static176.method2833(local24);
													}
													continue;
												}
												local740 = 0;
												for (local744 = 0; local744 < local24.anInt3658; local744++) {
													for (local766 = 0; local766 < local24.anInt3696; local766++) {
														if (local24.anIntArray380[local740] > 0) {
															local1847 = Static63.method1158(local24.anIntArray380[local740] - 1);
															@Pc(2115) Class41 local2115;
															if (local1847.anInt3106 != 1 && local24.anIntArray390[local740] == 1) {
																local2115 = Static149.method2324(new Class41[] { Static121.aClass41_1282, local1847.aClass41_858, Static106.aClass41_760 });
															} else {
																local2115 = Static149.method2324(new Class41[] { Static121.aClass41_1282, local1847.aClass41_858, Static29.aClass41_200, Static129.method408(local24.anIntArray390[local740]) });
															}
															local951 = (local24.anInt3677 + 115) * local766 + local103;
															local830 = local109 + local744 * (local24.anInt3699 + 12);
															if (local24.anInt3683 == 0) {
																local1270.method784(local2115, local951, local830, local24.anInt3654, local24.aBoolean218 ? 0 : -1);
															} else if (local24.anInt3683 == 1) {
																local1270.method771(local2115, local951 + 57, local830, local24.anInt3654, local24.aBoolean218 ? 0 : -1);
															} else {
																local1270.method780(local2115, local951 + 115 - 1, local830, local24.anInt3654, local24.aBoolean218 ? 0 : -1);
															}
														}
														local740++;
													}
												}
											}
											if (local24.anInt3640 == 8 && Static34.aClass80_1 == local24 && Static123.anInt1020 == Static42.anInt265) {
												local738 = 0;
												@Pc(2251) Class41 local2251 = local24.aClass41_979;
												@Pc(2253) Class2_Sub2_Sub4 local2253 = Static3.aClass2_Sub2_Sub4_1;
												local2251 = Static146.method2255(local2251, local24);
												local740 = 0;
												@Pc(2272) Class41 local2272;
												while (local2251.method1393() > 0) {
													local946 = local2251.method1406(Static127.aClass41_831);
													if (local946 == -1) {
														local2272 = local2251;
														local2251 = Static156.aClass41_981;
													} else {
														local2272 = local2251.method1412(0, local946);
														local2251 = local2251.method1424(local946 + 4);
													}
													local951 = local2253.method788(local2272);
													if (local951 > local738) {
														local738 = local951;
													}
													local740 += local2253.anInt1008 + 1;
												}
												local738 += 6;
												local740 += 7;
												local946 = local24.anInt3635 + local103 - local738 - 5;
												if (local946 < local103 + 5) {
													local946 = local103 + 5;
												}
												if (local946 + local738 > arg8) {
													local946 = arg8 - local738;
												}
												local951 = local24.anInt3660 + local109 + 5;
												if (arg4 < local951 + local740) {
													local951 = arg4 - local740;
												}
												Static64.method1164(local946, local951, local738, local740, 16777120);
												Static64.method1162(local946, local951, local738, local740, 0);
												local830 = local2253.anInt1008 + local951 + 2;
												local2251 = local24.aClass41_979;
												local2251 = Static146.method2255(local2251, local24);
												while (local2251.method1393() > 0) {
													local1962 = local2251.method1406(Static127.aClass41_831);
													if (local1962 == -1) {
														local2272 = local2251;
														local2251 = Static156.aClass41_981;
													} else {
														local2272 = local2251.method1412(0, local1962);
														local2251 = local2251.method1424(local1962 + 4);
													}
													local2253.method784(local2272, local946 + 3, local830, 0, -1);
													local830 += local2253.anInt1008 + 1;
												}
											}
											if (local24.anInt3640 == 9) {
												if (local24.aBoolean226) {
													local740 = local24.anInt3660 + local109;
													local766 = local109;
													local744 = local103 + local24.anInt3635;
												} else {
													local766 = local109 + local24.anInt3660;
													local744 = local24.anInt3635 + local103;
													local740 = local109;
												}
												if (local24.anInt3692 == 1) {
													Static64.method1163(local103, local740, local744, local766, local24.anInt3654);
												} else {
													Static64.method1171(local103, local740, local744, local766, local24.anInt3654, local24.anInt3692);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!i;)V")
	public static void method2316(@OriginalArg(1) Class41 arg0) {
		if (Static111.aClass83_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) Class41 local13 = Static201.aClass41_1207.method1397(Static111.aClass83_2.anApplet1);
			@Pc(19) Class41 local19 = Static219.aClass41_1285.method1397(Static111.aClass83_2.anApplet1);
			@Pc(44) Class41 local44 = Static149.method2324(new Class41[] { local13, Static34.aClass41_251, arg0, Static49.aClass41_416, local19 });
			if (arg0.method1393() == 0) {
				local44 = Static149.method2324(new Class41[] { local44, Static45.aClass41_391 });
			} else {
				local44 = Static149.method2324(new Class41[] { local44, Static95.aClass41_697, method2323(Static182.method2903() + 94608000000L), Static83.aClass41_628, Static208.method3217(94608000L) });
			}
			Static149.method2324(new Class41[] { Static151.aClass41_940, local44, Static32.aClass41_224 }).method1425(Static111.aClass83_2.anApplet1);
		} catch (@Pc(122) Throwable local122) {
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lclient!i;II)Lclient!i;")
	public static Class41 method2317(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[local9 + arg2] == null) {
				arg1[arg2 + local9] = Static14.aClass41_88;
			}
			local3 += arg1[local9 + arg2].anInt2012;
		}
		@Pc(43) int local43 = 0;
		@Pc(46) byte[] local46 = new byte[local3];
		@Pc(56) Class41 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg1[local48 + arg2];
			Static225.method1839(local56.aByteArray26, 0, local46, local43, local56.anInt2012);
			local43 += local56.anInt2012;
		}
		local56 = new Class41();
		local56.aByteArray26 = local46;
		local56.anInt2012 = local3;
		return local56;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!nb;Lclient!pg;Lclient!nb;Lclient!nb;)Z")
	public static boolean method2318(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class2_Sub6_Sub3 arg1, @OriginalArg(3) Class15 arg2, @OriginalArg(4) Class15 arg3) {
		Static28.aClass2_Sub6_Sub3_1 = arg1;
		Static75.aClass15_35 = arg0;
		Static138.aClass15_29 = arg2;
		Static11.aClass15_1 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)Lclient!i;")
	public static Class41 method2319(@OriginalArg(0) int arg0) {
		@Pc(7) Class41 local7 = new Class41();
		local7.anInt2012 = 0;
		local7.aByteArray26 = new byte[arg0];
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method2321(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static111.anInt2664 = Static95.anInt2353 * arg2 / arg0;
		Static142.anInt3263 = Static40.anInt1214 * arg1 / arg3;
		Static32.anInt850 = -1;
		Static167.anInt3886 = -1;
		Static217.method3296();
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILclient!i;)V")
	public static void method2322(@OriginalArg(1) Class41 arg0) {
		try {
			Static50.anApplet_Sub1_3.getAppletContext().showDocument(arg0.method1421(Static50.anApplet_Sub1_3.getCodeBase()), "_blank");
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(JI)Lclient!i;")
	private static Class41 method2323(@OriginalArg(0) long arg0) {
		Static220.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static220.aCalendar2.get(7);
		@Pc(22) int local22 = Static220.aCalendar2.get(5);
		@Pc(26) int local26 = Static220.aCalendar2.get(2);
		@Pc(30) int local30 = Static220.aCalendar2.get(1);
		@Pc(34) int local34 = Static220.aCalendar2.get(11);
		@Pc(38) int local38 = Static220.aCalendar2.get(12);
		@Pc(42) int local42 = Static220.aCalendar2.get(13);
		return Static149.method2324(new Class41[] { Static78.aClass41Array29[local13 - 1], Static173.aClass41_1074, Static152.method2471(local22 / 10), Static152.method2471(local22 % 10), Static147.aClass41_926, Static34.aClass41Array11[local26], Static147.aClass41_926, Static152.method2471(local30), Static201.aClass41_1206, Static152.method2471(local34 / 10), Static152.method2471(local34 % 10), Static95.aClass41_692, Static152.method2471(local38 / 10), Static152.method2471(local38 % 10), Static95.aClass41_692, Static152.method2471(local42 / 10), Static152.method2471(local42 % 10), Static5.aClass41_51 });
	}
}
