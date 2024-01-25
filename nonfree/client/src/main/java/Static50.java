import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_10 = new Class212(76, 2);

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!sn;")
	public static final Class235 aClass235_4 = new Class235("runescape", 0);

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_4 = new Class96(16);

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static final int[] anIntArray78 = new int[14];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tf;IIIIIIIII)V")
	public static void method1126(@OriginalArg(0) Class240[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class240 local6 = arg0[local1];
			if (local6 != null && local6.anInt6917 == arg1) {
				@Pc(17) int local17 = local6.anInt6862 + arg6;
				@Pc(22) int local22 = local6.anInt6879 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6873 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6904;
					@Pc(45) int local45 = local22 + local6.anInt6894;
					if (local6.anInt6873 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6873 == 0 || local6.aBoolean506 || method1146(local6).anInt7357 != 0 || local6 == Static186.aClass240_10 || local6.anInt6882 == Static34.anInt596) {
					if (!method1133(local6)) {
						if (local6 == Static65.aClass240_4 && Static156.method5964(Static65.aClass240_4) != null) {
							Static62.aBoolean112 = true;
							Static302.anInt5615 = local17;
							Static251.anInt4843 = local22;
						}
						if (local6.aBoolean504 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean510 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class4_Sub10 local152 = (Class4_Sub10) Static459.aClass91_53.method2584(); local152 != null; local152 = (Class4_Sub10) Static459.aClass91_53.method2586()) {
									if (local152.aBoolean122) {
										local152.method6330();
										local152.aClass240_5.aBoolean507 = false;
									}
								}
								if (Static422.anInt7303 == 0) {
									Static65.aClass240_4 = null;
									Static186.aClass240_10 = null;
								}
								Static128.anInt3397 = 0;
								Static310.aBoolean419 = false;
								Static406.aBoolean480 = false;
								if (!Static87.aBoolean142) {
									Static311.method4738();
								}
							}
							@Pc(208) boolean local208;
							if (Static329.aClass95_1.method5170() >= local28 && Static329.aClass95_1.method5175() >= local30 && Static329.aClass95_1.method5170() < local32 && Static329.aClass95_1.method5175() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static449.aBoolean564 && local208) {
								if (local6.anInt6872 >= 0) {
									Static457.anInt7815 = local6.anInt6872;
								} else if (local6.aBoolean510) {
									Static457.anInt7815 = -1;
								}
							}
							if (!Static87.aBoolean142 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static142.method2616(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static329.aClass95_1.method5174() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class4_Sub15 local267 = (Class4_Sub15) Static296.aClass91_50.method2584();
							if (local267 != null && local267.method5048() == 0 && local267.method5049() >= local28 && local267.method5050() >= local30 && local267.method5049() < local32 && local267.method5050() < local34) {
								local262 = true;
							}
							@Pc(300) int local300;
							@Pc(434) int local434;
							if (local6.aByteArray89 != null) {
								for (local300 = 0; local300 < local6.aByteArray89.length; local300++) {
									if (Static115.aClass173_1.method4895(local6.aByteArray89[local300])) {
										if (local6.anIntArray547 == null || Static277.anInt2834 >= local6.anIntArray547[local300]) {
											@Pc(332) byte local332 = local6.aByteArray88[local300];
											if (local332 == 0 || ((local332 & 0x8) == 0 || !Static115.aClass173_1.method4895(86) && !Static115.aClass173_1.method4895(82) && !Static115.aClass173_1.method4895(81)) && ((local332 & 0x2) == 0 || Static115.aClass173_1.method4895(86)) && ((local332 & 0x1) == 0 || Static115.aClass173_1.method4895(82)) && ((local332 & 0x4) == 0 || Static115.aClass173_1.method4895(81))) {
												if (local300 < 10) {
													Static168.method2939(local300 + 1, -1, local6.anInt6909, "");
												} else if (local300 == 10) {
													Static294.method4500();
													@Pc(403) Class4_Sub45 local403 = method1146(local6);
													Static288.method4458(local403.method5906(), local6, local403.anInt7348);
													Static198.aString26 = Static26.method401(local6);
													if (Static198.aString26 == null) {
														Static198.aString26 = "Null";
													}
													Static168.aString24 = local6.aString59 + "<col=ffffff>";
												}
												local434 = local6.anIntArray552[local300];
												if (local6.anIntArray547 == null) {
													local6.anIntArray547 = new int[local6.aByteArray89.length];
												}
												if (local434 == 0) {
													local6.anIntArray547[local300] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray547[local300] = Static277.anInt2834 + local434;
												}
											}
										}
									} else if (local6.anIntArray547 != null) {
										local6.anIntArray547[local300] = 0;
									}
								}
							}
							if (local262) {
								Static5.method62(local267.method5050() - local22, local267.method5049() - local17, local6);
							}
							if (Static65.aClass240_4 != null && Static65.aClass240_4 != local6 && local208 && method1146(local6).method5907()) {
								Static47.aClass240_1 = local6;
							}
							if (local6 == Static186.aClass240_10) {
								Static77.aBoolean131 = true;
								Static458.anInt7818 = local17;
								Static4.anInt49 = local22;
							}
							if (local6.aBoolean506 || local6.anInt6882 != 0) {
								@Pc(519) Class4_Sub10 local519;
								if (local208 && Static278.anInt5205 != 0 && local6.anObjectArray30 != null) {
									local519 = new Class4_Sub10();
									local519.aBoolean122 = true;
									local519.aClass240_5 = local6;
									local519.anInt1686 = Static278.anInt5205;
									local519.anObjectArray4 = local6.anObjectArray30;
									Static459.aClass91_53.method2587(local519);
								}
								if (Static65.aClass240_4 != null || Static87.aBoolean142 || local6.anInt6882 != Static367.anInt7458 && Static128.anInt3397 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(674) int local674;
								if (local6.anInt6882 != 0) {
									if (local6.anInt6882 == Static431.anInt7389 || local6.anInt6882 == Static76.anInt1858) {
										Static197.aClass240_11 = local6;
										if (Static91.aClass265_1 != null) {
											Static91.aClass265_1.method6065(Static30.aClass30_3, local6.anInt6894);
										}
										if (local6.anInt6882 == Static431.anInt7389) {
											if (!Static87.aBoolean142 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static181.method3321(arg9, Static30.aClass30_3, arg8);
												for (@Pc(602) Class71_Sub8 local602 = (Class71_Sub8) Static353.aClass273_4.method6246(); local602 != null; local602 = (Class71_Sub8) Static353.aClass273_4.method6249()) {
													if (arg8 >= local602.anInt7782 && arg8 < local602.anInt7780 && arg9 >= local602.anInt7781 && arg9 < local602.anInt7777) {
														Static311.method4738();
														Static65.method1480(local602.aClass11_Sub5_Sub2_1);
													}
												}
											}
											Static429.method5910(local22, local6, local17);
											continue;
										}
									}
									@Pc(713) int local713;
									if (local6.anInt6882 == Static34.anInt596) {
										if (local6.method5528(Static30.aClass30_3) == null || Static431.anInt7385 != 0 && Static431.anInt7385 != 3 || Static87.aBoolean142 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local300 = arg8 - local17;
										local674 = arg9 - local22;
										local434 = local6.anIntArray555[local674];
										if (local300 < local434 || local300 > local434 + local6.anIntArray553[local674]) {
											continue;
										}
										local300 -= local6.anInt6904 / 2;
										local674 -= local6.anInt6894 / 2;
										if (Static275.anInt5173 == 4) {
											local713 = (int) Static322.aFloat82 & 0x3FFF;
										} else {
											local713 = (int) Static322.aFloat82 + Static53.anInt4624 & 0x3FFF;
										}
										@Pc(725) int local725 = Class4_Sub13.anIntArray497[local713];
										@Pc(729) int local729 = Class4_Sub13.anIntArray496[local713];
										if (Static275.anInt5173 != 4) {
											local725 = local725 * (Static437.anInt7473 + 256) >> 8;
											local729 = local729 * (Static437.anInt7473 + 256) >> 8;
										}
										@Pc(758) int local758 = local674 * local725 + local300 * local729 >> 15;
										@Pc(768) int local768 = local674 * local729 - local300 * local725 >> 15;
										@Pc(779) int local779;
										@Pc(787) int local787;
										if (Static275.anInt5173 == 4) {
											local779 = (Static3.anInt1340 >> 7) + (local758 >> 2);
											local787 = (Static373.anInt6559 >> 7) - (local768 >> 2);
										} else {
											@Pc(796) int local796 = (Static52.aClass11_Sub5_Sub2_Sub1_2.method5302() - 1) * 64;
											local779 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 - local796 >> 7) + (local758 >> 2);
											local787 = (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 - local796 >> 7) - (local768 >> 2);
										}
										if (Static449.aBoolean564 && (Static353.anInt6237 & 0x40) != 0) {
											@Pc(829) Class240 local829 = Static231.method3929(Static383.anInt6696, Static344.anInt6075);
											if (local829 == null) {
												Static294.method4500();
											} else {
												Static12.method4708(49, 1L, local779, false, true, Static281.anInt5275, " ->", Static198.aString26, local6.anInt6876, local787);
											}
											continue;
										}
										if (Static332.aClass235_6 == Static323.aClass235_5) {
											Static12.method4708(45, 1L, local779, false, true, -1, "", Static134.aClass21_35.method362(Static168.anInt3290), -1, local787);
										}
										Static12.method4708(21, 1L, local779, false, true, Static87.anInt1988, "", Static424.aString76, -1, local787);
										continue;
									}
									if (local6.anInt6882 == Static367.anInt7458) {
										Static89.aClass240_7 = local6;
										if (local208) {
											Static310.aBoolean419 = true;
										}
										if (local262) {
											local300 = (int) ((double) (local267.method5049() - local17 - local6.anInt6904 / 2) * 2.0D / (double) Static425.aFloat64);
											local674 = (int) -((double) (local267.method5050() - local22 - local6.anInt6894 / 2) * 2.0D / (double) Static425.aFloat64);
											local434 = Static97.anInt2096 + local300 + Static425.anInt3657;
											local713 = Static241.anInt4715 + local674 + Static425.anInt3658;
											@Pc(943) Class4_Sub1_Sub18 local943 = Static290.method4476();
											if (local943 == null) {
												continue;
											}
											@Pc(948) int[] local948 = new int[3];
											local943.method5563(local948, local434, local713);
											if (local948 != null) {
												if (Static115.aClass173_1.method4895(82) && Static70.anInt1720 > 0) {
													Static328.method4877(local948[1], local948[0], local948[2]);
													continue;
												}
												Static406.aBoolean480 = true;
												Static85.anInt1971 = local948[0];
												Static157.anInt3218 = local948[1];
												Static65.anInt1620 = local948[2];
											}
											Static128.anInt3397 = 1;
											Static270.aBoolean440 = false;
											Static255.anInt4930 = Static329.aClass95_1.method5170();
											Static270.anInt5898 = Static329.aClass95_1.method5175();
											continue;
										}
										if (local252 && Static128.anInt3397 > 0) {
											if (Static128.anInt3397 == 1 && (Static255.anInt4930 != Static329.aClass95_1.method5170() || Static270.anInt5898 != Static329.aClass95_1.method5175())) {
												Static138.anInt2856 = Static97.anInt2096;
												Static438.anInt7474 = Static241.anInt4715;
												Static128.anInt3397 = 2;
											}
											if (Static128.anInt3397 == 2) {
												Static270.aBoolean440 = true;
												Static77.method1647(Static138.anInt2856 + (int) ((double) (Static255.anInt4930 - Static329.aClass95_1.method5170()) * 2.0D / (double) Static425.aFloat65));
												Static399.method5644(Static438.anInt7474 - (int) ((double) (Static270.anInt5898 - Static329.aClass95_1.method5175()) * 2.0D / (double) Static425.aFloat65));
											}
											continue;
										}
										if (Static128.anInt3397 > 0 && !Static270.aBoolean440) {
											if ((Static80.anInt1921 == 1 || Static145.method2647()) && Static352.anInt6233 > 2) {
												Static210.method3696(Static255.anInt4930, Static270.anInt5898);
											} else if (Static170.method2989()) {
												Static210.method3696(Static255.anInt4930, Static270.anInt5898);
											}
										}
										Static128.anInt3397 = 0;
										continue;
									}
									if (local6.anInt6882 == Static160.anInt3258) {
										if (local252) {
											Static114.method2204(local6.anInt6894, Static329.aClass95_1.method5170() - local17, local6.anInt6904, Static329.aClass95_1.method5175() - local22);
										}
										continue;
									}
									if (local6.anInt6882 == Static212.anInt4315) {
										Static335.method4925(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean509 && local262) {
									local6.aBoolean509 = true;
									if (local6.anObjectArray7 != null) {
										local519 = new Class4_Sub10();
										local519.aBoolean122 = true;
										local519.aClass240_5 = local6;
										local519.anInt1688 = local267.method5049() - local17;
										local519.anInt1686 = local267.method5050() - local22;
										local519.anObjectArray4 = local6.anObjectArray7;
										Static459.aClass91_53.method2587(local519);
									}
								}
								if (local6.aBoolean509 && local252 && local6.anObjectArray28 != null) {
									local519 = new Class4_Sub10();
									local519.aBoolean122 = true;
									local519.aClass240_5 = local6;
									local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
									local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
									local519.anObjectArray4 = local6.anObjectArray28;
									Static459.aClass91_53.method2587(local519);
								}
								if (local6.aBoolean509 && !local252) {
									local6.aBoolean509 = false;
									if (local6.anObjectArray25 != null) {
										local519 = new Class4_Sub10();
										local519.aBoolean122 = true;
										local519.aClass240_5 = local6;
										local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
										local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
										local519.anObjectArray4 = local6.anObjectArray25;
										Static274.aClass91_30.method2587(local519);
									}
								}
								if (local252 && local6.anObjectArray18 != null) {
									local519 = new Class4_Sub10();
									local519.aBoolean122 = true;
									local519.aClass240_5 = local6;
									local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
									local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
									local519.anObjectArray4 = local6.anObjectArray18;
									Static459.aClass91_53.method2587(local519);
								}
								if (!local6.aBoolean507 && local208) {
									local6.aBoolean507 = true;
									if (local6.anObjectArray5 != null) {
										local519 = new Class4_Sub10();
										local519.aBoolean122 = true;
										local519.aClass240_5 = local6;
										local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
										local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
										local519.anObjectArray4 = local6.anObjectArray5;
										Static459.aClass91_53.method2587(local519);
									}
								}
								if (local6.aBoolean507 && local208 && local6.anObjectArray35 != null) {
									local519 = new Class4_Sub10();
									local519.aBoolean122 = true;
									local519.aClass240_5 = local6;
									local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
									local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
									local519.anObjectArray4 = local6.anObjectArray35;
									Static459.aClass91_53.method2587(local519);
								}
								if (local6.aBoolean507 && !local208) {
									local6.aBoolean507 = false;
									if (local6.anObjectArray19 != null) {
										local519 = new Class4_Sub10();
										local519.aBoolean122 = true;
										local519.aClass240_5 = local6;
										local519.anInt1688 = Static329.aClass95_1.method5170() - local17;
										local519.anInt1686 = Static329.aClass95_1.method5175() - local22;
										local519.anObjectArray4 = local6.anObjectArray19;
										Static274.aClass91_30.method2587(local519);
									}
								}
								if (local6.anObjectArray8 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray8;
									Static331.aClass91_37.method2587(local519);
								}
								@Pc(1487) Class4_Sub10 local1487;
								if (local6.anObjectArray32 != null && Static282.anInt5283 > local6.anInt6846) {
									if (local6.anIntArray549 == null || Static282.anInt5283 - local6.anInt6846 > 32) {
										local519 = new Class4_Sub10();
										local519.aClass240_5 = local6;
										local519.anObjectArray4 = local6.anObjectArray32;
										Static459.aClass91_53.method2587(local519);
									} else {
										label680: for (local300 = local6.anInt6846; local300 < Static282.anInt5283; local300++) {
											local674 = Static170.anIntArray272[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray549.length; local434++) {
												if (local6.anIntArray549[local434] == local674) {
													local1487 = new Class4_Sub10();
													local1487.aClass240_5 = local6;
													local1487.anObjectArray4 = local6.anObjectArray32;
													Static459.aClass91_53.method2587(local1487);
													break label680;
												}
											}
										}
									}
									local6.anInt6846 = Static282.anInt5283;
								}
								if (local6.anObjectArray24 != null && Static160.anInt3257 > local6.anInt6842) {
									if (local6.anIntArray557 == null || Static160.anInt3257 - local6.anInt6842 > 32) {
										local519 = new Class4_Sub10();
										local519.aClass240_5 = local6;
										local519.anObjectArray4 = local6.anObjectArray24;
										Static459.aClass91_53.method2587(local519);
									} else {
										label656: for (local300 = local6.anInt6842; local300 < Static160.anInt3257; local300++) {
											local674 = Static353.anIntArray502[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray557.length; local434++) {
												if (local6.anIntArray557[local434] == local674) {
													local1487 = new Class4_Sub10();
													local1487.aClass240_5 = local6;
													local1487.anObjectArray4 = local6.anObjectArray24;
													Static459.aClass91_53.method2587(local1487);
													break label656;
												}
											}
										}
									}
									local6.anInt6842 = Static160.anInt3257;
								}
								if (local6.anObjectArray27 != null && Static295.anInt5429 > local6.anInt6852) {
									if (local6.anIntArray550 == null || Static295.anInt5429 - local6.anInt6852 > 32) {
										local519 = new Class4_Sub10();
										local519.aClass240_5 = local6;
										local519.anObjectArray4 = local6.anObjectArray27;
										Static459.aClass91_53.method2587(local519);
									} else {
										label632: for (local300 = local6.anInt6852; local300 < Static295.anInt5429; local300++) {
											local674 = Static399.anIntArray570[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray550.length; local434++) {
												if (local6.anIntArray550[local434] == local674) {
													local1487 = new Class4_Sub10();
													local1487.aClass240_5 = local6;
													local1487.anObjectArray4 = local6.anObjectArray27;
													Static459.aClass91_53.method2587(local1487);
													break label632;
												}
											}
										}
									}
									local6.anInt6852 = Static295.anInt5429;
								}
								if (local6.anObjectArray14 != null && Static452.anInt7748 > local6.anInt6866) {
									if (local6.anIntArray551 == null || Static452.anInt7748 - local6.anInt6866 > 32) {
										local519 = new Class4_Sub10();
										local519.aClass240_5 = local6;
										local519.anObjectArray4 = local6.anObjectArray14;
										Static459.aClass91_53.method2587(local519);
									} else {
										label608: for (local300 = local6.anInt6866; local300 < Static452.anInt7748; local300++) {
											local674 = Static390.anIntArray544[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray551.length; local434++) {
												if (local6.anIntArray551[local434] == local674) {
													local1487 = new Class4_Sub10();
													local1487.aClass240_5 = local6;
													local1487.anObjectArray4 = local6.anObjectArray14;
													Static459.aClass91_53.method2587(local1487);
													break label608;
												}
											}
										}
									}
									local6.anInt6866 = Static452.anInt7748;
								}
								if (local6.anObjectArray33 != null && Static74.anInt1842 > local6.anInt6848) {
									if (local6.anIntArray554 == null || Static74.anInt1842 - local6.anInt6848 > 32) {
										local519 = new Class4_Sub10();
										local519.aClass240_5 = local6;
										local519.anObjectArray4 = local6.anObjectArray33;
										Static459.aClass91_53.method2587(local519);
									} else {
										label584: for (local300 = local6.anInt6848; local300 < Static74.anInt1842; local300++) {
											local674 = Static416.anIntArray590[local300 & 0x1F];
											for (local434 = 0; local434 < local6.anIntArray554.length; local434++) {
												if (local6.anIntArray554[local434] == local674) {
													local1487 = new Class4_Sub10();
													local1487.aClass240_5 = local6;
													local1487.anObjectArray4 = local6.anObjectArray33;
													Static459.aClass91_53.method2587(local1487);
													break label584;
												}
											}
										}
									}
									local6.anInt6848 = Static74.anInt1842;
								}
								if (Static188.anInt3791 > local6.anInt6889 && local6.anObjectArray23 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray23;
									Static459.aClass91_53.method2587(local519);
								}
								if (Static368.anInt6378 > local6.anInt6889 && local6.anObjectArray11 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray11;
									Static459.aClass91_53.method2587(local519);
								}
								if (Static184.anInt3736 > local6.anInt6889 && local6.anObjectArray9 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray9;
									Static459.aClass91_53.method2587(local519);
								}
								if (Static189.anInt3810 > local6.anInt6889 && local6.anObjectArray20 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray20;
									Static459.aClass91_53.method2587(local519);
								}
								if (Static234.anInt4636 > local6.anInt6889 && local6.anObjectArray10 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray10;
									Static459.aClass91_53.method2587(local519);
								}
								local6.anInt6889 = Static446.anInt7635;
								if (local6.anObjectArray34 != null) {
									for (local300 = 0; local300 < Static299.anInt5551; local300++) {
										@Pc(1955) Class4_Sub10 local1955 = new Class4_Sub10();
										local1955.aClass240_5 = local6;
										local1955.anInt1687 = Static433.anInterface5Array3[local300].method2832();
										local1955.anInt1689 = Static433.anInterface5Array3[local300].method2833();
										local1955.anObjectArray4 = local6.anObjectArray34;
										Static459.aClass91_53.method2587(local1955);
									}
								}
								if (Static440.aBoolean551 && local6.anObjectArray22 != null) {
									local519 = new Class4_Sub10();
									local519.aClass240_5 = local6;
									local519.anObjectArray4 = local6.anObjectArray22;
									Static459.aClass91_53.method2587(local519);
								}
							}
							if (local6.anInt6873 == 5 && local6.anInt6925 != -1) {
								local6.method5527(Static348.aClass237_1, Static104.aClass180_1).method6065(Static30.aClass30_3, local6.anInt6894);
							}
							Static188.method3410(local6);
							if (local6.anInt6873 == 0) {
								method1126(arg0, local6.anInt6909, local28, local30, local32, local34, local17 - local6.anInt6897, local22 - local6.anInt6845, arg8, arg9);
								if (local6.aClass240Array2 != null) {
									method1126(local6.aClass240Array2, local6.anInt6909, local28, local30, local32, local34, local17 - local6.anInt6897, local22 - local6.anInt6845, arg8, arg9);
								}
								@Pc(2077) Class4_Sub39 local2077 = (Class4_Sub39) Static157.aClass96_22.method2797((long) local6.anInt6909);
								if (local2077 != null) {
									if (Static332.aClass235_6 == aClass235_4 && local2077.anInt6722 == 0 && !Static87.aBoolean142 && local208 && !Static341.aBoolean453) {
										Static311.method4738();
									}
									Static381.method5394(local17, local28, local2077.anInt6721, local22, arg8, arg9, local30, local34, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static188.method3410(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1130(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static402.anInt7091;
		@Pc(3) int[] local3 = Static144.anIntArray244;
		@Pc(11) int local11 = Static54.aBoolean90 ? local1 : local1 + Static77.anInt1870;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local13 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local23.aByte100 == arg0) {
				local23.anInt6546 = 0;
				if (local23.anInt6514 < 0) {
					local23.aBoolean477 = false;
				} else {
					@Pc(54) int local54 = local23.method5302();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7514 & 0x7F) != 0 || (local23.anInt7515 & 0x7F) != 0) {
							local23.aBoolean477 = false;
							continue;
						}
					} else if ((local23.anInt7514 & 0x7F) != 64 || (local23.anInt7515 & 0x7F) != 64) {
						local23.aBoolean477 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7514 >> 7;
						local101 = local23.anInt7515 >> 7;
						if (local23.anInt6514 != Static352.anIntArrayArray44[local96][local101]) {
							local23.aBoolean477 = true;
							continue;
						}
						if (Static224.anIntArrayArray30[local96][local101] > 1) {
							local126 = Static224.anIntArrayArray30[local96][local101]--;
							local23.aBoolean477 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7514 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7515 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7514 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7515 + local96 >> 7;
						if (!Static386.method6039(local23.anInt6514, local169, local101, local155, local162)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6514 == Static352.anIntArrayArray44[local180][local183]) {
										local126 = Static224.anIntArrayArray30[local180][local183]--;
									}
								}
							}
							local23.aBoolean477 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass4_Sub46_3 != null && Static277.anInt2834 >= local23.aClass4_Sub46_3.anInt7373 && Static277.anInt2834 < local23.aClass4_Sub46_3.anInt7379) {
						((Class11_Sub5_Sub2_Sub1) local23).aBoolean261 = false;
					}
					local23.aBoolean477 = false;
					local23.anInt7511 = Static21.method356(local23.anInt7514, local23.anInt7515, local23.aByte100);
					Static72.method1589(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tf;)Lclient!tf;")
	public static Class240 method1131(@OriginalArg(0) Class240 arg0) {
		@Pc(4) int local4 = method1146(arg0).method5909();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static92.method1820(arg0.anInt6917);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tf;)Z")
	public static boolean method1133(@OriginalArg(0) Class240 arg0) {
		if (Static341.aBoolean453) {
			if (method1146(arg0).anInt7357 != 0) {
				return false;
			}
			if (arg0.anInt6873 == 0) {
				return false;
			}
		}
		return arg0.aBoolean502;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZLclient!uc;ILclient!uc;)V")
	public static void method1134(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) Class11_Sub5_Sub2 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class11_Sub5_Sub2 arg6) {
		@Pc(7) int local7 = arg4.method5296();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class2 local21 = (Class2) Static138.aClass83_23.method2338((long) local7);
		if (local21 == null) {
			@Pc(28) Class98[] local28 = Static472.method2843(Static143.aClass38_30, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static30.aClass30_3.method2031(local28[0]);
			Static138.aClass83_23.method2337(local21, (long) local7);
		}
		Static183.method3347(arg1 >> 1, arg5 >> 1, arg6.method5302() * 64, arg6.anInt7514, 0, arg6.aByte100, arg6.anInt7515);
		@Pc(75) int local75 = arg3 + Static402.anIntArray573[0] - 18;
		@Pc(86) int local86 = arg0 + Static402.anIntArray573[1] - 16 - 54;
		@Pc(94) int local94 = local75 + arg2 / 4 * 18;
		@Pc(102) int local102 = local86 + arg2 % 4 * 18;
		local21.method5921(local94, local102);
		if (arg6 == arg4) {
			Static30.aClass30_3.method2095(local102 - 1, local94 + -1, -256, 18, 18);
		}
		@Pc(131) Class71_Sub8 local131 = Static248.method4080();
		local131.aClass11_Sub5_Sub2_1 = arg4;
		local131.anInt7780 = local94 + 16;
		local131.anInt7777 = local102 + 16;
		local131.anInt7782 = local94;
		local131.anInt7781 = local102;
		Static353.aClass273_4.method6247(local131);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1137() {
		for (@Pc(1) int local1 = 0; local1 < Static193.anInt3853; local1++) {
			@Pc(6) int[] local6 = Static352.anIntArrayArray44[local1];
			for (@Pc(8) int local8 = 0; local8 < Static301.anInt5585; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	public static void method1139(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static402.anInt7091;
		@Pc(3) int[] local3 = Static144.anIntArray244;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static77.anInt1870; local5++) {
			@Pc(15) Class11_Sub5_Sub2 local15;
			if (local5 < local1) {
				local15 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local5 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local15.aByte100 == arg0 && local15.anInt6514 >= 0) {
				@Pc(39) int local39 = local15.method5302();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7514 & 0x7F) != 0 || (local15.anInt7515 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7514 & 0x7F) != 64 || (local15.anInt7515 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7514 >> 7;
					local80 = local15.anInt7515 >> 7;
					if (local15.anInt6514 > Static352.anIntArrayArray44[local75][local80]) {
						Static352.anIntArrayArray44[local75][local80] = local15.anInt6514;
						Static224.anIntArrayArray30[local75][local80] = 1;
					} else if (local15.anInt6514 == Static352.anIntArrayArray44[local75][local80]) {
						local116 = Static224.anIntArrayArray30[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7514 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7515 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7514 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7515 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6514 > Static352.anIntArrayArray44[local158][local161]) {
								Static352.anIntArrayArray44[local158][local161] = local15.anInt6514;
								Static224.anIntArrayArray30[local158][local161] = 1;
							} else if (local15.anInt6514 == Static352.anIntArrayArray44[local158][local161]) {
								local116 = Static224.anIntArrayArray30[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class169 local14 = Static195.aClass169ArrayArray2[arg1][arg2];
		Static140.method2588(local14 == null ? Static206.aClass169_2 : local14, arg0);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1141() {
		Static382.anInt3956 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static77.anInt1870; local3++) {
			@Pc(14) Class11_Sub5_Sub2_Sub2 local14 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local3])).aClass11_Sub5_Sub2_Sub2_2;
			if (local14.aBoolean477 && local14.method5296() != -1) {
				@Pc(32) int local32 = (local14.method5302() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7514 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7515 - local32 >> 7;
				@Pc(53) Class11_Sub5_Sub2 local53 = Static303.method4680(local39, local14.aByte100, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6518;
					if (local53 instanceof Class11_Sub5_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt6546 == 0 && local53.method5296() != -1) {
						Static300.anIntArray452[Static382.anInt3956] = local58;
						Static183.anIntArray290[Static382.anInt3956] = local58;
						Static382.anInt3956++;
						local53.anInt6546++;
					}
					Static300.anIntArray452[Static382.anInt3956] = local58;
					Static183.anIntArray290[Static382.anInt3956] = local14.anInt6518 + 2048;
					Static382.anInt3956++;
					local53.anInt6546++;
				}
			}
		}
		Static436.method6003(Static382.anInt3956 - 1, 0, Static300.anIntArray452, Static183.anIntArray290);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)V")
	public static void method1143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(6, arg1);
		local8.method521();
		local8.anInt621 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1145() {
		@Pc(1) int local1 = Static402.anInt7091;
		@Pc(3) int[] local3 = Static144.anIntArray244;
		@Pc(20) boolean local20 = Static157.aClass185_Sub1_1.anInt5571 == 1 && local1 > 200 || Static157.aClass185_Sub1_1.anInt5571 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub5_Sub2_Sub1 local29 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local3[local22]];
			if (local29.method3620()) {
				local29.method6040();
				if (local29.aShort95 >= 0 && local29.aShort93 >= 0 && local29.aShort94 < Static193.anInt3853 && local29.aShort92 < Static301.anInt5585) {
					local29.aBoolean261 = local29.aBoolean475 ? local20 : false;
					if (local29 == Static52.aClass11_Sub5_Sub2_Sub1_2) {
						local29.anInt6514 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean477) {
							local75++;
						}
						if (local29.anInt6542 > Static277.anInt2834) {
							local75 += 2;
						}
						local75 += 5 - local29.method5302() << 2;
						if (local29.aBoolean262) {
							local75 += 512;
						} else {
							if (Static460.anInt7848 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6514 = local75 + 1;
					}
				} else {
					local29.anInt6514 = -1;
				}
			} else {
				local29.anInt6514 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static77.anInt1870; local116++) {
			@Pc(127) Class11_Sub5_Sub2_Sub2 local127 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local116])).aClass11_Sub5_Sub2_Sub2_2;
			if (local127.method5315() && local127.aClass241_1.method5602(Static67.aClass224_1)) {
				local127.method6040();
				if (local127.aShort95 >= 0 && local127.aShort93 >= 0 && local127.aShort94 < Static193.anInt3853 && local127.aShort92 < Static301.anInt5585) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean477) {
						local164++;
					}
					if (local127.anInt6542 > Static277.anInt2834) {
						local164 += 2;
					}
					local164 += 5 - local127.method5302() << 2;
					if (Static460.anInt7848 == 0) {
						if (local127.aClass241_1.aBoolean521) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static460.anInt7848 == 1) {
						if (local127.aClass241_1.aBoolean521) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass241_1.aBoolean517) {
						local164 += 1024;
					} else if (!local127.aClass241_1.aBoolean516) {
						local164 += 256;
					}
					local127.anInt6514 = local164 + 1;
				} else {
					local127.anInt6514 = -1;
				}
			} else {
				local127.anInt6514 = -1;
			}
		}
		for (local75 = 0; local75 < Static209.aClass51Array1.length; local75++) {
			@Pc(230) Class51 local230 = Static209.aClass51Array1[local75];
			if (local230 != null) {
				if (local230.anInt1749 == 1) {
					@Pc(244) Class4_Sub44 local244 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local230.anInt1740);
					if (local244 != null) {
						@Pc(249) Class11_Sub5_Sub2_Sub2 local249 = local244.aClass11_Sub5_Sub2_Sub2_2;
						if (local249.anInt6514 >= 0) {
							local249.anInt6514 += 2048;
						}
					}
				} else if (local230.anInt1749 == 10) {
					@Pc(268) Class11_Sub5_Sub2_Sub1 local268 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local230.anInt1740];
					if (local268 != null && local268 != Static52.aClass11_Sub5_Sub2_Sub1_2 && local268.anInt6514 >= 0) {
						local268.anInt6514 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tf;)Lclient!uw;")
	public static Class4_Sub45 method1146(@OriginalArg(0) Class240 arg0) {
		@Pc(13) Class4_Sub45 local13 = (Class4_Sub45) Static135.aClass96_15.method2797(((long) arg0.anInt6909 << 32) + (long) arg0.anInt6885);
		return local13 == null ? arg0.aClass4_Sub45_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1147() {
		@Pc(1) int local1 = Static402.anInt7091;
		@Pc(3) int[] local3 = Static144.anIntArray244;
		@Pc(11) int local11 = Static54.aBoolean90 ? local1 : local1 + Static77.anInt1870;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class4_Sub44) Static80.aClass96_8.method2797((long) Static2.anIntArray1[local13 - local1])).aClass11_Sub5_Sub2_Sub2_2;
			}
			if (local23.anInt6514 >= 0) {
				@Pc(43) int local43 = local23.method5302();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7514 & 0x7F) == 0 && (local23.anInt7515 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7514 & 0x7F) == 64 && (local23.anInt7515 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass4_Sub46_3 != null && Static277.anInt2834 >= local23.aClass4_Sub46_3.anInt7373 && Static277.anInt2834 < local23.aClass4_Sub46_3.anInt7379) {
					((Class11_Sub5_Sub2_Sub1) local23).aBoolean261 = false;
				}
				local23.anInt7511 = Static21.method356(local23.anInt7514, local23.anInt7515, local23.aByte100);
				Static72.method1589(local23, true);
			}
		}
	}
}
