import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!sf", name = "S", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1481 = Static32.method683("Please enter your password)3");

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1479 = aClass49_1481;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1482 = Static32.method683("This world is full)3");

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1480 = aClass49_1482;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	public static int anInt3279 = 0;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1483 = Static32.method683(":tradereq:");

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method2523() {
		aClass49_1482 = null;
		aClass49_1481 = null;
		aClass49_1480 = null;
		aClass49_1479 = null;
		aClass49_1483 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIII[Lclient!vg;I)V")
	public static void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class85[] arg7, @OriginalArg(9) int arg8) {
		Static10.method1856(arg8, arg0, arg6, arg2);
		Static109.method1865();
		for (@Pc(17) int local17 = 0; local17 < arg7.length; local17++) {
			@Pc(23) Class85 local23 = arg7[local17];
			if (local23 != null && (local23.anInt3851 == arg1 || arg1 == -1412584499 && Static160.aClass85_14 == local23)) {
				@Pc(43) int local43;
				if (arg3 == -1) {
					Static55.anIntArray111[Static100.anInt2133] = arg5 + local23.anInt3827;
					Static25.anIntArray48[Static100.anInt2133] = arg4 + local23.anInt3886;
					Static176.anIntArray361[Static100.anInt2133] = local23.anInt3858;
					Static62.anIntArray164[Static100.anInt2133] = local23.anInt3867;
					local43 = Static100.anInt2133++;
				} else {
					local43 = arg3;
				}
				local23.anInt3879 = Static127.anInt2757;
				local23.anInt3842 = local43;
				if (!local23.aBoolean171 || !Static100.method1729(local23)) {
					if (local23.anInt3876 > 0) {
						Static131.method2839(local23);
					}
					@Pc(100) int local100 = local23.anInt3841;
					@Pc(106) int local106 = local23.anInt3827 + arg5;
					@Pc(111) int local111 = arg4 + local23.anInt3886;
					@Pc(141) int local141;
					@Pc(147) int local147;
					if (Static160.aClass85_14 == local23) {
						if (arg1 != -1412584499 && !local23.aBoolean165) {
							Static102.anInt2158 = arg4;
							Static20.anInt442 = arg5;
							Static129.aClass85Array1 = arg7;
							continue;
						}
						if (!local23.aBoolean165) {
							local100 = 128;
						}
						if (Static123.aBoolean118 && Static25.aBoolean20) {
							local141 = Static20.anInt449;
							local141 -= Static143.anInt3033;
							local147 = Static96.anInt2022;
							local147 -= Static131.anInt3736;
							if (local147 < Static170.anInt3721) {
								local147 = Static170.anInt3721;
							}
							if (Static170.anInt3721 + Static42.aClass85_2.anInt3867 < local147 + local23.anInt3867) {
								local147 = Static42.aClass85_2.anInt3867 + Static170.anInt3721 - local23.anInt3867;
							}
							local111 = local147;
							if (Static20.anInt443 > local141) {
								local141 = Static20.anInt443;
							}
							if (local23.anInt3858 + local141 > Static42.aClass85_2.anInt3858 + Static20.anInt443) {
								local141 = Static42.aClass85_2.anInt3858 + Static20.anInt443 - local23.anInt3858;
							}
							local106 = local141;
						}
					}
					@Pc(272) int local272;
					@Pc(287) int local287;
					@Pc(214) int local214;
					@Pc(216) int local216;
					@Pc(222) int local222;
					@Pc(240) int local240;
					if (local23.anInt3855 == 2) {
						local272 = arg6;
						local147 = arg0;
						local287 = arg2;
						local141 = arg8;
					} else if (local23.anInt3855 == 9) {
						local214 = local106;
						local216 = local111;
						local222 = local106 + local23.anInt3858;
						if (local222 < local106) {
							local214 = local222;
							local222 = local106;
						}
						local240 = local23.anInt3867 + local111;
						local222++;
						local141 = local214 <= arg8 ? arg8 : local214;
						if (local240 < local111) {
							local216 = local240;
							local240 = local111;
						}
						local272 = local222 >= arg6 ? arg6 : local222;
						local147 = arg0 < local216 ? local216 : arg0;
						local240++;
						local287 = arg2 <= local240 ? arg2 : local240;
					} else {
						local147 = arg0 < local111 ? local111 : arg0;
						local214 = local23.anInt3858 + local106;
						local141 = local106 > arg8 ? local106 : arg8;
						local272 = arg6 <= local214 ? arg6 : local214;
						local216 = local23.anInt3867 + local111;
						local287 = local216 >= arg2 ? arg2 : local216;
					}
					if (!local23.aBoolean171 || local272 > local141 && local147 < local287) {
						if (local23.anInt3876 != 0) {
							if (local23.anInt3876 == 1337) {
								Static118.anInt2474 = local106;
								Static62.anInt1349 = local111;
								Static138.method2288(local111, local23.anInt3858, local23.anInt3867, local106);
								Static10.method1856(arg8, arg0, arg6, arg2);
								continue;
							}
							if (local23.anInt3876 == 1338) {
								if (local23.method2889()) {
									Static51.method909(local43, local106, local23, local111);
									Static10.method1856(arg8, arg0, arg6, arg2);
								}
								continue;
							}
							if (local23.anInt3876 == 1339) {
								if (local23.method2889()) {
									Static71.method1182(local43, local106, local111, local23);
									Static10.method1856(arg8, arg0, arg6, arg2);
								}
								continue;
							}
						}
						local214 = Static20.anInt449;
						local216 = Static96.anInt2022;
						if (!Static47.aBoolean40 && local141 <= local214 && local216 >= local147 && local214 < local272 && local216 < local287) {
							Static178.method2907(local23, local216 - local111, local214 + -local106);
						}
						if (local23.anInt3855 == 0) {
							if (!local23.aBoolean171 && Static100.method1729(local23) && Static184.aClass85_16 != local23) {
								continue;
							}
							if (!local23.aBoolean171) {
								if (local23.anInt3839 - local23.anInt3867 < local23.anInt3891) {
									local23.anInt3891 = local23.anInt3839 - local23.anInt3867;
								}
								if (local23.anInt3891 < 0) {
									local23.anInt3891 = 0;
								}
							}
							method2524(local147, local23.anInt3849, local287, local43, local111 - local23.anInt3891, local106 + -local23.anInt3822, local272, arg7, local141);
							if (local23.aClass85Array2 != null) {
								method2524(local147, local23.anInt3849, local287, local43, local111 - local23.anInt3891, -local23.anInt3822 + local106, local272, local23.aClass85Array2, local141);
							}
							@Pc(572) Class2_Sub8 local572 = (Class2_Sub8) Static100.aClass25_7.method836((long) local23.anInt3849);
							if (local572 != null) {
								if (local572.anInt1204 == 0 && Static20.anInt449 >= local141 && local147 <= Static96.anInt2022 && Static20.anInt449 < local272 && local287 > Static96.anInt2022 && !Static47.aBoolean40 && !Static140.aBoolean127) {
									Static30.aShortArray1[0] = 1001;
									Static133.anInt3713 = 1;
									Static102.aClass49Array15[0] = Static53.aClass49_595;
									Static161.aClass49Array19[0] = Static154.aClass49_1489;
								}
								Static41.method796(local111, local272, local43, local572.anInt1201, local141, local147, local106, local287);
							}
							Static10.method1856(arg8, arg0, arg6, arg2);
							Static109.method1865();
						}
						if (Static115.aBooleanArray11[local43] || Static153.anInt3281 > 1) {
							if (local23.anInt3855 == 0 && !local23.aBoolean171 && local23.anInt3839 > local23.anInt3867) {
								Static145.method2395(local111, local23.anInt3891, local23.anInt3839, local23.anInt3858 + local106, local23.anInt3867);
							}
							if (local23.anInt3855 != 1) {
								@Pc(689) int local689;
								@Pc(709) int local709;
								@Pc(853) int local853;
								@Pc(744) int local744;
								@Pc(902) int local902;
								@Pc(904) int local904;
								@Pc(928) int local928;
								@Pc(700) int local700;
								@Pc(848) int local848;
								if (local23.anInt3855 == 2) {
									local222 = 0;
									for (local240 = 0; local240 < local23.anInt3867; local240++) {
										for (local689 = 0; local689 < local23.anInt3858; local689++) {
											local700 = local240 * (local23.anInt3892 + 32) + local111;
											local709 = local106 + (local23.anInt3829 + 32) * local689;
											if (local222 < 20) {
												local700 += local23.anIntArray356[local222];
												local709 += local23.anIntArray352[local222];
											}
											if (local23.anIntArray358[local222] > 0) {
												local744 = local23.anIntArray358[local222] - 1;
												if (local709 + 32 > arg8 && arg6 > local709 && arg0 < local700 + 32 && arg2 > local700 || local23 == Static154.aClass85_13 && local222 == Static9.anInt165) {
													@Pc(799) Class2_Sub2_Sub2_Sub3 local799;
													if (Static124.anInt2746 == 1 && Static43.anInt1036 == local222 && Static87.anInt2931 == local23.anInt3849) {
														local799 = Static13.method197(local23.anIntArray357[local222], local744, 0, 2, false);
													} else {
														local799 = Static13.method197(local23.anIntArray357[local222], local744, 3153952, 1, false);
													}
													if (local799 == null) {
														Static102.method1756(local23);
													} else if (Static154.aClass85_13 == local23 && Static9.anInt165 == local222) {
														local848 = Static20.anInt449 - Static57.anInt1208;
														local853 = Static96.anInt2022 - Static37.anInt941;
														if (local848 < 5 && local848 > -5) {
															local848 = 0;
														}
														if (local853 < 5 && local853 > -5) {
															local853 = 0;
														}
														if (Static146.anInt3093 < 5) {
															local848 = 0;
															local853 = 0;
														}
														local799.method1543(local709 + local848, local700 - -local853, 128);
														if (arg1 != -1) {
															@Pc(900) Class85 local900 = arg7[arg1 & 0xFFFF];
															local902 = Static10.anInt2273;
															local904 = Static10.anInt2277;
															if (local902 > local700 + local853 && local900.anInt3891 > 0) {
																local928 = (local902 - local853 - local700) * Static170.anInt3724 / 3;
																if (local928 > Static170.anInt3724 * 10) {
																	local928 = Static170.anInt3724 * 10;
																}
																if (local900.anInt3891 < local928) {
																	local928 = local900.anInt3891;
																}
																local900.anInt3891 -= local928;
																Static37.anInt941 += local928;
																Static102.method1756(local900);
															}
															if (local904 < local853 + local700 + 32 && local900.anInt3891 < local900.anInt3839 - local900.anInt3867) {
																local928 = (local853 + local700 + 32 - local904) * Static170.anInt3724 / 3;
																if (local928 > Static170.anInt3724 * 10) {
																	local928 = Static170.anInt3724 * 10;
																}
																if (local900.anInt3839 - local900.anInt3891 - local900.anInt3867 < local928) {
																	local928 = local900.anInt3839 - local900.anInt3867 - local900.anInt3891;
																}
																local900.anInt3891 += local928;
																Static37.anInt941 -= local928;
																Static102.method1756(local900);
															}
														}
													} else if (Static94.aClass85_7 == local23 && local222 == Static71.anInt1467) {
														local799.method1543(local709, local700, 128);
													} else {
														local799.method1518(local709, local700);
													}
												}
											} else if (local23.anIntArray359 != null && local222 < 20) {
												@Pc(1058) Class2_Sub2_Sub2_Sub3 local1058 = local23.method2898(local222);
												if (local1058 != null) {
													local1058.method1518(local709, local700);
												} else if (Static70.aBoolean59) {
													Static102.method1756(local23);
												}
											}
											local222++;
										}
									}
								} else if (local23.anInt3855 == 3) {
									if (Static22.method401(local23)) {
										local222 = local23.anInt3848;
										if (local23 == Static184.aClass85_16 && local23.anInt3873 != 0) {
											local222 = local23.anInt3873;
										}
									} else {
										local222 = local23.anInt3837;
										if (local23 == Static184.aClass85_16 && local23.anInt3835 != 0) {
											local222 = local23.anInt3835;
										}
									}
									if (local100 == 0) {
										if (local23.aBoolean169) {
											Static10.method1861(local106, local111, local23.anInt3858, local23.anInt3867, local222);
										} else {
											Static10.method1854(local106, local111, local23.anInt3858, local23.anInt3867, local222);
										}
									} else if (local23.aBoolean169) {
										Static10.method1850(local106, local111, local23.anInt3858, local23.anInt3867, local222, 256 - (local100 & 0xFF));
									} else {
										Static10.method1860(local106, local111, local23.anInt3858, local23.anInt3867, local222, 256 - (local100 & 0xFF));
									}
								} else {
									@Pc(1194) Class2_Sub2_Sub2_Sub1_Sub1 local1194;
									if (local23.anInt3855 == 4) {
										local1194 = local23.method2897(Static129.aClass2_Sub2_Sub2_Sub2Array8);
										if (local1194 != null) {
											@Pc(1206) Class49 local1206 = local23.aClass49_1716;
											if (Static22.method401(local23)) {
												local240 = local23.anInt3848;
												if (Static184.aClass85_16 == local23 && local23.anInt3873 != 0) {
													local240 = local23.anInt3873;
												}
												if (local23.aClass49_1713.method1653() > 0) {
													local1206 = local23.aClass49_1713;
												}
											} else {
												local240 = local23.anInt3837;
												if (local23 == Static184.aClass85_16 && local23.anInt3835 != 0) {
													local240 = local23.anInt3835;
												}
											}
											if (local23.aBoolean171 && local23.anInt3826 != -1) {
												@Pc(1263) Class2_Sub2_Sub10 local1263 = Static113.method1913(local23.anInt3826);
												local1206 = local1263.aClass49_834;
												if (local1206 == null) {
													local1206 = Static31.aClass49_428;
												}
												if ((local1263.anInt1586 == 1 || local23.anInt3821 != 1) && local23.anInt3821 != -1) {
													local1206 = Static33.method692(new Class49[] { Static73.aClass49_797, local1206, Static154.aClass49_1488, Static182.method3024(local23.anInt3821) });
												}
											}
											if (local23 == Static141.aClass85_12) {
												local1206 = Static121.aClass49_1167;
												local240 = local23.anInt3837;
											}
											if (!local23.aBoolean171) {
												local1206 = Static110.method1888(local23, local1206);
											}
											local1194.method633(local1206, local106, local111, local23.anInt3858, local23.anInt3867, local240, local23.aBoolean167 ? 0 : -1, local23.anInt3830, local23.anInt3833, local23.anInt3890);
										} else if (Static70.aBoolean59) {
											Static102.method1756(local23);
										}
									} else if (local23.anInt3855 == 5) {
										@Pc(1365) Class2_Sub2_Sub2_Sub3 local1365;
										if (local23.aBoolean171) {
											if (local23.anInt3826 == -1) {
												local1365 = local23.method2895(false);
											} else {
												local1365 = Static13.method197(local23.anInt3821, local23.anInt3826, local23.anInt3882, local23.anInt3884, false);
											}
											if (local1365 != null) {
												local240 = local1365.anInt1889;
												local689 = local1365.anInt1887;
												if (local23.aBoolean162) {
													Static10.method1859(local106, local111, local23.anInt3858 + local106, local23.anInt3867 + local111);
													local709 = (local23.anInt3858 + local240 - 1) / local240;
													local700 = (local689 + local23.anInt3867 - 1) / local689;
													for (local848 = 0; local848 < local709; local848++) {
														for (local853 = 0; local853 < local700; local853++) {
															if (local23.anInt3846 != 0) {
																local1365.method1540(local240 / 2 + local240 * local848 + local106, local689 / 2 + local853 * local689 + local111, local23.anInt3846, 4096);
															} else if (local100 == 0) {
																local1365.method1518(local848 * local240 + local106, local111 - -(local853 * local689));
															} else {
																local1365.method1543(local106 + local848 * local240, local111 + local853 * local689, 256 - (local100 & 0xFF));
															}
														}
													}
													Static10.method1856(arg8, arg0, arg6, arg2);
												} else {
													local709 = local23.anInt3858 * 4096 / local240;
													if (local23.anInt3846 != 0) {
														local1365.method1540(local23.anInt3858 / 2 + local106, local111 + local23.anInt3867 / 2, local23.anInt3846, local709);
													} else if (local100 != 0) {
														local1365.method1542(local106, local111, local23.anInt3858, local23.anInt3867, 256 - (local100 & 0xFF));
													} else if (local23.anInt3858 == local240 && local23.anInt3867 == local689) {
														local1365.method1518(local106, local111);
													} else {
														local1365.method1535(local106, local111, local23.anInt3858, local23.anInt3867);
													}
												}
											} else if (Static70.aBoolean59) {
												Static102.method1756(local23);
											}
										} else {
											local1365 = local23.method2895(Static22.method401(local23));
											if (local1365 != null) {
												local1365.method1518(local106, local111);
											} else if (Static70.aBoolean59) {
												Static102.method1756(local23);
											}
										}
									} else {
										@Pc(1760) Class2_Sub2_Sub10 local1760;
										if (local23.anInt3855 == 6) {
											@Pc(1627) boolean local1627 = Static22.method401(local23);
											@Pc(1629) Class2_Sub2_Sub3_Sub4 local1629 = null;
											if (local1627) {
												local240 = local23.anInt3844;
											} else {
												local240 = local23.anInt3863;
											}
											local709 = 0;
											if (local23.anInt3826 != -1) {
												local1760 = Static113.method1913(local23.anInt3826);
												if (local1760 != null) {
													local1760 = local1760.method1244(local23.anInt3821);
													local1629 = local1760.method1245(null, 0, 1);
													if (local1629 == null) {
														Static102.method1756(local23);
													} else {
														local1629.method1042();
														local709 = -local1629.aShort34 / 2;
													}
												}
											} else if (local23.anInt3864 == 5) {
												if (local23.anInt3885 == -1) {
													local1629 = Static128.aClass10_1.method208(-1, -1, null, null);
												} else {
													local700 = local23.anInt3885 & 0x7FF;
													if (Static54.anInt1191 == local700) {
														local700 = 2047;
													}
													@Pc(1669) Class2_Sub2_Sub3_Sub7_Sub2 local1669 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local700];
													@Pc(1678) Class2_Sub2_Sub4 local1678 = local240 == -1 ? null : Static29.method543(local240);
													if (local1669 != null && (int) local1669.aClass49_1606.method1651() << 11 == (local23.anInt3885 & 0xFFFFF800)) {
														local1629 = local1669.aClass10_2.method208(0, local23.anInt3888, local1678, null);
													}
												}
											} else if (local240 == -1) {
												local1629 = local23.method2888(local1627, -1, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2, null);
												if (local1629 == null && Static70.aBoolean59) {
													Static102.method1756(local23);
												}
											} else {
												@Pc(1737) Class2_Sub2_Sub4 local1737 = Static29.method543(local240);
												local1629 = local23.method2888(local1627, local23.anInt3888, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2, local1737);
												if (local1629 == null && Static70.aBoolean59) {
													Static102.method1756(local23);
												}
											}
											if (local1629 != null) {
												Static109.method1882(local23.anInt3858 / 2 + local106 + local23.anInt3825, local23.anInt3850 + local23.anInt3867 / 2 + local111);
												local700 = local23.anInt3874 * Class2_Sub2_Sub2_Sub4.anIntArray217[local23.anInt3853] >> 16;
												local848 = Class2_Sub2_Sub2_Sub4.anIntArray218[local23.anInt3853] * local23.anInt3874 >> 16;
												if (!local23.aBoolean171) {
													local1629.method1055(local23.anInt3862, 0, local23.anInt3853, 0, local700, local848);
												} else if (local23.aBoolean164) {
													local1629.method1052(local23.anInt3862, local23.anInt3871, local23.anInt3853, local23.anInt3856, local23.anInt3843 + local700 + local709, local23.anInt3843 + local848, local23.anInt3874);
												} else {
													local1629.method1055(local23.anInt3862, local23.anInt3871, local23.anInt3853, local23.anInt3856, local700 + local709 + local23.anInt3843, local848 - -local23.anInt3843);
												}
												Static109.method1877();
											}
										} else {
											if (local23.anInt3855 == 7) {
												local1194 = local23.method2897(Static129.aClass2_Sub2_Sub2_Sub2Array8);
												if (local1194 == null) {
													if (Static70.aBoolean59) {
														Static102.method1756(local23);
													}
													continue;
												}
												local240 = 0;
												for (local689 = 0; local689 < local23.anInt3867; local689++) {
													for (local709 = 0; local709 < local23.anInt3858; local709++) {
														if (local23.anIntArray358[local240] > 0) {
															local1760 = Static113.method1913(local23.anIntArray358[local240] - 1);
															@Pc(1975) Class49 local1975;
															if (local1760.anInt1586 != 1 && local23.anIntArray357[local240] == 1) {
																local1975 = Static33.method692(new Class49[] { Static73.aClass49_797, local1760.aClass49_834, Static66.aClass49_733 });
															} else {
																local1975 = Static33.method692(new Class49[] { Static73.aClass49_797, local1760.aClass49_834, Static154.aClass49_1488, Static182.method3024(local23.anIntArray357[local240]) });
															}
															local744 = (local23.anInt3892 + 12) * local689 + local111;
															local853 = (local23.anInt3829 + 115) * local709 + local106;
															if (local23.anInt3830 == 0) {
																local1194.method610(local1975, local853, local744, local23.anInt3837, local23.aBoolean167 ? 0 : -1);
															} else if (local23.anInt3830 == 1) {
																local1194.method631(local1975, local853 + local23.anInt3858 / 2, local744, local23.anInt3837, local23.aBoolean167 ? 0 : -1);
															} else {
																local1194.method620(local1975, local23.anInt3858 + local853 - 1, local744, local23.anInt3837, local23.aBoolean167 ? 0 : -1);
															}
														}
														local240++;
													}
												}
											}
											@Pc(2287) int local2287;
											if (local23.anInt3855 == 8 && local23 == Static84.aClass85_6 && Static154.anInt3327 == Static163.anInt693) {
												local222 = 0;
												local240 = 0;
												@Pc(2130) Class2_Sub2_Sub2_Sub1_Sub1 local2130 = Static84.aClass2_Sub2_Sub2_Sub1_Sub1_4;
												@Pc(2133) Class49 local2133 = local23.aClass49_1716;
												local2133 = Static110.method1888(local23, local2133);
												@Pc(2155) Class49 local2155;
												while (local2133.method1653() > 0) {
													local848 = local2133.method1666(Static185.aClass49_1762);
													if (local848 == -1) {
														local2155 = local2133;
														local2133 = Static154.aClass49_1489;
													} else {
														local2155 = local2133.method1661(local848, 0);
														local2133 = local2133.method1665(local848 + 4);
													}
													local853 = local2130.method614(local2155);
													local240 += local2130.anInt774 + 1;
													if (local853 > local222) {
														local222 = local853;
													}
												}
												local240 += 7;
												local222 += 6;
												local848 = local23.anInt3858 + local106 - local222 - 5;
												local853 = local111 + local23.anInt3867 + 5;
												if (local853 + local240 > arg2) {
													local853 = arg2 - local240;
												}
												if (local106 + 5 > local848) {
													local848 = local106 + 5;
												}
												if (arg6 < local222 + local848) {
													local848 = arg6 - local222;
												}
												Static10.method1861(local848, local853, local222, local240, 16777120);
												Static10.method1854(local848, local853, local222, local240, 0);
												local744 = local2130.anInt774 + local853 + 2;
												local2133 = local23.aClass49_1716;
												local2133 = Static110.method1888(local23, local2133);
												while (local2133.method1653() > 0) {
													local2287 = local2133.method1666(Static185.aClass49_1762);
													if (local2287 == -1) {
														local2155 = local2133;
														local2133 = Static154.aClass49_1489;
													} else {
														local2155 = local2133.method1661(local2287, 0);
														local2133 = local2133.method1665(local2287 + 4);
													}
													local2130.method610(local2155, local848 + 3, local744, 0, -1);
													local744 += local2130.anInt774 + 1;
												}
											}
											if (local23.anInt3855 == 9) {
												if (local23.anInt3887 == 1) {
													Static10.method1848(local106, local111, local23.anInt3858 + local106, local23.anInt3867 + local111, local23.anInt3837);
												} else {
													local240 = local23.anInt3867 < 0 ? -local23.anInt3867 : local23.anInt3867;
													local222 = local23.anInt3858 >= 0 ? local23.anInt3858 : -local23.anInt3858;
													local689 = local222;
													if (local240 > local222) {
														local689 = local240;
													}
													if (local689 != 0) {
														local709 = (local23.anInt3858 << 16) / local689;
														local700 = (local23.anInt3867 << 16) / local689;
														if (local709 >= local700) {
															local709 = -local709;
														} else {
															local700 = -local700;
														}
														local848 = local700 * local23.anInt3887 >> 17;
														local853 = local700 * local23.anInt3887 + 1 >> 17;
														local744 = local709 * local23.anInt3887 >> 17;
														local2287 = local709 * local23.anInt3887 + 1 >> 17;
														@Pc(2443) int local2443 = local106 - arg8;
														@Pc(2452) int local2452 = local2443 + local23.anInt3858 - local853;
														local904 = local848 + local2443;
														local902 = local111 - arg0;
														@Pc(2468) int local2468 = local848 + local23.anInt3858 + local2443;
														@Pc(2472) int local2472 = local744 + local902;
														local928 = local2443 - local853;
														@Pc(2482) int local2482 = local902 - local2287;
														@Pc(2489) int local2489 = local902 + local23.anInt3867 - local2287;
														@Pc(2496) int local2496 = local23.anInt3867 + local902 + local744;
														Static109.method1875(local904, local928, local2452);
														Static109.method1871(local2472, local2482, local2489, local904, local928, local2452, local23.anInt3837);
														Static109.method1875(local904, local2452, local2468);
														Static109.method1871(local2472, local2489, local2496, local904, local2452, local2468, local23.anInt3837);
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
	}
}
