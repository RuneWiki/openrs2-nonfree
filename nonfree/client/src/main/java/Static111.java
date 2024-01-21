import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!nf", name = "Kc", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1520 = Static122.method531("<img=1>");

	@OriginalMember(owner = "client!nf", name = "Mc", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!nf", name = "Wc", descriptor = "I")
	public static int anInt2709 = -1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
	public static void method2018(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static44.aBoolean70) {
			Static24.method502();
		} else if (arg0 != -1 && (Static164.anInt3564 != arg0 || !Static130.method2165()) && Static69.anInt1602 != 0 && !Static44.aBoolean70) {
			Static57.method996(arg0, Static69.anInt1602, Static11.aClass13_Sub1_4, 0);
		}
		Static164.anInt3564 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	public static void method2019() {
		anIntArray300 = null;
		aClass73_1520 = null;
	}

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "(I)V")
	public static void method2020() {
		Static173.anIntArray400 = new int[33];
		Static29.anIntArray73 = new int[151];
		Static88.anIntArray201 = new int[151];
		Static153.anIntArray370 = new int[33];
		@Pc(23) int local23;
		@Pc(25) int local25;
		@Pc(27) int local27;
		for (@Pc(19) int local19 = 0; local19 < 33; local19++) {
			local23 = 999;
			local25 = 0;
			for (local27 = 0; local27 < 34; local27++) {
				if (Static84.aClass3_Sub1_Sub3_Sub3_6.aByteArray17[local19 * Static84.aClass3_Sub1_Sub3_Sub3_6.anInt1917 + local27] == 0) {
					if (local23 == 999) {
						local23 = local27;
					}
				} else if (local23 != 999) {
					local25 = local27;
					break;
				}
			}
			Static173.anIntArray400[local19] = local23;
			Static153.anIntArray370[local19] = local25 - local23;
		}
		for (local23 = 5; local23 < 156; local23++) {
			local25 = 999;
			local27 = 0;
			for (@Pc(89) int local89 = 25; local89 < 172; local89++) {
				if (Static84.aClass3_Sub1_Sub3_Sub3_6.aByteArray17[local89 + local23 * Static84.aClass3_Sub1_Sub3_Sub3_6.anInt1917] == 0 && (local89 > 34 || local23 > 34)) {
					if (local25 == 999) {
						local25 = local89;
					}
				} else if (local25 != 999) {
					local27 = local89;
					break;
				}
			}
			Static88.anIntArray201[local23 - 5] = local25 - 25;
			Static29.anIntArray73[local23 - 5] = local27 - local25;
		}
	}

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "(I)V")
	public static void method2022() {
		if (Static94.anInt2079 > 1) {
			Static94.anInt2079--;
		}
		if (Static43.anInt1007 > 0) {
			Static43.anInt1007--;
		}
		if (Static14.aBoolean25) {
			Static14.aBoolean25 = false;
			Static10.method177();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static154.method2488(); local32++) {
		}
		if (Static25.anInt717 != 30) {
			return;
		}
		Static166.method2620(Static139.aClass3_Sub12_Sub1_3);
		@Pc(56) Object local56 = Static87.aClass54_1.anObject4;
		@Pc(88) int local88;
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(105) int local105;
		@Pc(110) int local110;
		synchronized (Static87.aClass54_1.anObject4) {
			if (!Static109.aBoolean174) {
				Static87.aClass54_1.anInt2296 = 0;
			} else if (Static2.anInt7 != 0 || Static87.aClass54_1.anInt2296 >= 40) {
				Static139.aClass3_Sub12_Sub1_3.method1400(119);
				Static139.aClass3_Sub12_Sub1_3.method1383(0);
				local85 = 0;
				local88 = Static139.aClass3_Sub12_Sub1_3.anInt1793;
				for (local90 = 0; local90 < Static87.aClass54_1.anInt2296 && Static139.aClass3_Sub12_Sub1_3.anInt1793 - local88 < 240; local90++) {
					local85++;
					local105 = Static87.aClass54_1.anIntArray232[local90];
					local110 = Static87.aClass54_1.anIntArray231[local90];
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > 764) {
						local110 = 764;
					}
					if (local105 < 0) {
						local105 = 0;
					} else if (local105 > 502) {
						local105 = 502;
					}
					@Pc(145) int local145 = local110 + local105 * 765;
					if (Static87.aClass54_1.anIntArray232[local90] == -1 && Static87.aClass54_1.anIntArray231[local90] == -1) {
						local110 = -1;
						local105 = -1;
						local145 = 524287;
					}
					if (local110 != Static173.anInt3799 || Static45.anInt1053 != local105) {
						@Pc(187) int local187 = local110 - Static173.anInt3799;
						Static173.anInt3799 = local110;
						@Pc(194) int local194 = local105 - Static45.anInt1053;
						Static45.anInt1053 = local105;
						if (Static170.anInt3710 < 8 && local187 >= -32 && local187 <= 31 && local194 >= -32 && local194 <= 31) {
							local187 += 32;
							local194 += 32;
							Static139.aClass3_Sub12_Sub1_3.method1361(local194 + (Static170.anInt3710 << 12) + (local187 << 6));
							Static170.anInt3710 = 0;
						} else if (Static170.anInt3710 < 8) {
							Static139.aClass3_Sub12_Sub1_3.method1346(local145 + (Static170.anInt3710 << 19) + 8388608);
							Static170.anInt3710 = 0;
						} else {
							Static139.aClass3_Sub12_Sub1_3.method1392((Static170.anInt3710 << 19) + local145 - 1073741824);
							Static170.anInt3710 = 0;
						}
					} else if (Static170.anInt3710 < 2047) {
						Static170.anInt3710++;
					}
				}
				Static139.aClass3_Sub12_Sub1_3.method1362(Static139.aClass3_Sub12_Sub1_3.anInt1793 - local88);
				if (Static87.aClass54_1.anInt2296 > local85) {
					Static87.aClass54_1.anInt2296 -= local85;
					for (local105 = 0; local105 < Static87.aClass54_1.anInt2296; local105++) {
						Static87.aClass54_1.anIntArray231[local105] = Static87.aClass54_1.anIntArray231[local105 + local85];
						Static87.aClass54_1.anIntArray232[local105] = Static87.aClass54_1.anIntArray232[local105 + local85];
					}
				} else {
					Static87.aClass54_1.anInt2296 = 0;
				}
			}
		}
		if (Static2.anInt7 != 0) {
			@Pc(347) long local347 = (Static126.aLong137 - Static132.aLong142) / 50L;
			Static132.aLong142 = Static126.aLong137;
			if (local347 > 4095L) {
				local347 = 4095L;
			}
			local85 = Static61.anInt1463;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 764) {
				local85 = 764;
			}
			local88 = Static51.anInt1243;
			@Pc(376) byte local376 = 0;
			if (Static2.anInt7 == 2) {
				local376 = 1;
			}
			Static139.aClass3_Sub12_Sub1_3.method1400(221);
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 502) {
				local88 = 502;
			}
			local90 = local88 * 765 + local85;
			local110 = (int) local347;
			Static139.aClass3_Sub12_Sub1_3.method1344(local90 + (local110 << 20) + (local376 << 19));
		}
		if (Static134.anInt3065 > 0) {
			Static134.anInt3065--;
		}
		if (Static172.aBooleanArray17[96] || Static172.aBooleanArray17[97] || Static172.aBooleanArray17[98] || Static172.aBooleanArray17[99]) {
			Static43.aBoolean68 = true;
		}
		if (Static43.aBoolean68 && Static134.anInt3065 <= 0) {
			Static134.anInt3065 = 20;
			Static43.aBoolean68 = false;
			Static139.aClass3_Sub12_Sub1_3.method1400(98);
			Static139.aClass3_Sub12_Sub1_3.method1353(Static25.anInt716);
			Static139.aClass3_Sub12_Sub1_3.method1363(Static84.anInt1889);
		}
		if (Static153.aBoolean226 && !Static99.aBoolean146) {
			Static99.aBoolean146 = true;
			Static139.aClass3_Sub12_Sub1_3.method1400(210);
			Static139.aClass3_Sub12_Sub1_3.method1383(1);
		}
		if (!Static153.aBoolean226 && Static99.aBoolean146) {
			Static99.aBoolean146 = false;
			Static139.aClass3_Sub12_Sub1_3.method1400(210);
			Static139.aClass3_Sub12_Sub1_3.method1383(0);
		}
		Static26.method556();
		if (Static25.anInt717 != 30) {
			return;
		}
		Static157.method2515();
		Static167.method2621();
		Static100.anInt2226++;
		if (Static100.anInt2226 > 750) {
			Static10.method177();
			return;
		}
		Static99.method1709();
		Static50.method904();
		Static38.method2262();
		if (Static171.anInt3765 != 0) {
			Static76.anInt1683 += 20;
			if (Static76.anInt1683 >= 400) {
				Static171.anInt3765 = 0;
			}
		}
		Static165.anInt320++;
		if (Static20.aClass83_6 != null) {
			Static100.anInt2212++;
			if (Static100.anInt2212 >= 15) {
				Static60.method1104(Static20.aClass83_6);
				Static20.aClass83_6 = null;
			}
		}
		@Pc(659) Class83 local659;
		if (Static139.aClass83_11 != null) {
			Static60.method1104(Static139.aClass83_11);
			if (Static37.anInt899 > Static31.anInt817 + 5 || Static37.anInt899 < Static31.anInt817 - 5 || Static33.anInt825 + 5 < Static5.anInt107 || Static33.anInt825 - 5 > Static5.anInt107) {
				Static113.aBoolean181 = true;
			}
			Static121.anInt2850++;
			if (Static45.anInt1056 == 0) {
				if (Static113.aBoolean181 && Static121.anInt2850 >= 5) {
					if (Static9.aClass83_2 == Static139.aClass83_11 && Static25.anInt715 != Static79.anInt1737) {
						local659 = Static139.aClass83_11;
						@Pc(661) byte local661 = 0;
						if (Static176.anInt3860 == 1 && local659.anInt3735 == 206) {
							local661 = 1;
						}
						if (local659.anIntArray388[Static25.anInt715] <= 0) {
							local661 = 0;
						}
						if (Static17.method2686(Static127.method484(local659))) {
							local85 = Static25.anInt715;
							local88 = Static79.anInt1737;
							local659.anIntArray388[local85] = local659.anIntArray388[local88];
							local659.anIntArray389[local85] = local659.anIntArray389[local88];
							local659.anIntArray388[local88] = -1;
							local659.anIntArray389[local88] = 0;
						} else if (local661 == 1) {
							local85 = Static25.anInt715;
							local88 = Static79.anInt1737;
							while (local88 != local85) {
								if (local88 > local85) {
									local659.method2652(local88, local88 - 1);
									local88--;
								} else if (local88 < local85) {
									local659.method2652(local88, local88 + 1);
									local88++;
								}
							}
						} else {
							local659.method2652(Static79.anInt1737, Static25.anInt715);
						}
						Static139.aClass3_Sub12_Sub1_3.method1400(251);
						Static139.aClass3_Sub12_Sub1_3.method1357(Static139.aClass83_11.anInt3676);
						Static139.aClass3_Sub12_Sub1_3.method1361(Static25.anInt715);
						Static139.aClass3_Sub12_Sub1_3.method1361(Static79.anInt1737);
						Static139.aClass3_Sub12_Sub1_3.method1358(local661);
					}
				} else if ((Static127.anInt605 == 1 || Static156.method2509(Static142.anInt3262 - 1)) && Static142.anInt3262 > 2) {
					Static175.method2699();
				} else if (Static142.anInt3262 > 0) {
					Static74.method1286(Static142.anInt3262 - 1);
				}
				Static139.aClass83_11 = null;
				Static2.anInt7 = 0;
				Static100.anInt2212 = 10;
			}
		}
		Static41.anInt999 = 0;
		Static85.aBoolean128 = false;
		Static104.aBoolean157 = false;
		local659 = Static142.aClass83_14;
		Static14.aClass83_4 = null;
		@Pc(832) Class83 local832 = Static3.aClass83_1;
		Static3.aClass83_1 = null;
		Static142.aClass83_14 = null;
		while (Static10.method179() && Static41.anInt999 < 128) {
			Static37.anIntArray91[Static41.anInt999] = Static68.anInt1572;
			Static155.anIntArray371[Static41.anInt999] = Static31.anInt814;
			Static41.anInt999++;
		}
		Static80.method1404(Static133.anInt3052, 503, 0, 0, 0, 0, 765);
		Static84.anInt1893++;
		while (true) {
			@Pc(876) Class3_Sub17 local876;
			@Pc(889) Class83 local889;
			@Pc(881) Class83 local881;
			do {
				local876 = (Class3_Sub17) Static45.aClass72_14.method2406();
				if (local876 == null) {
					while (true) {
						do {
							local876 = (Class3_Sub17) Static17.aClass72_49.method2406();
							if (local876 == null) {
								while (true) {
									do {
										local876 = (Class3_Sub17) Static5.aClass72_4.method2406();
										if (local876 == null) {
											if (Static16.aClass83_5 != null) {
												Static16.method299();
											}
											if (Static64.anInt1487 != -1) {
												local88 = Static64.anInt1487;
												local85 = Static64.anInt1506;
												@Pc(1039) boolean local1039 = Static6.method102(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray326[0], 0, 0, 0, local85, true, local88, 0, 0, Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.anIntArray329[0], 0);
												Static64.anInt1487 = -1;
												if (local1039) {
													Static171.anInt3768 = Static61.anInt1463;
													Static76.anInt1683 = 0;
													Static163.anInt3185 = Static51.anInt1243;
													Static171.anInt3765 = 1;
												}
											}
											Static58.method1012();
											if (Static142.aClass83_14 != local659) {
												if (local659 != null) {
													Static60.method1104(local659);
												}
												if (Static142.aClass83_14 != null) {
													Static60.method1104(Static142.aClass83_14);
												}
											}
											if (Static3.aClass83_1 != local832 && Static115.anInt2754 == Static144.anInt3457) {
												if (local832 != null) {
													Static60.method1104(local832);
												}
												if (Static3.aClass83_1 != null) {
													Static60.method1104(Static3.aClass83_1);
												}
											}
											if (Static3.aClass83_1 == null) {
												if (Static144.anInt3457 > 0) {
													Static144.anInt3457--;
												}
											} else if (Static115.anInt2754 > Static144.anInt3457) {
												Static144.anInt3457++;
												if (Static115.anInt2754 == Static144.anInt3457) {
													Static60.method1104(Static3.aClass83_1);
												}
											}
											Static123.method2101();
											if (Static22.aBoolean40) {
												Static57.method1001();
											}
											for (local88 = 0; local88 < 5; local88++) {
												@Pc(1128) int local1128 = Static43.anIntArray95[local88]++;
											}
											local85 = Static168.method2641();
											local90 = Static159.method2527();
											if (local85 > 4500 && local90 > 4500) {
												Static43.anInt1007 = 250;
												Static46.method811(4000);
												Static139.aClass3_Sub12_Sub1_3.method1400(38);
											}
											Static99.anInt2198++;
											Static115.anInt2751++;
											Static97.anInt2160++;
											if (Static115.anInt2751 > 500) {
												local105 = (int) (Math.random() * 8.0D);
												if ((local105 & 0x1) == 1) {
													Static150.anInt3587 += Static163.anInt3146;
												}
												if ((local105 & 0x4) == 4) {
													Static79.anInt1740 += Static23.anInt621;
												}
												Static115.anInt2751 = 0;
												if ((local105 & 0x2) == 2) {
													Static123.anInt2855 += Static170.anInt3744;
												}
											}
											if (Static97.anInt2160 > 500) {
												Static97.anInt2160 = 0;
												local105 = (int) (Math.random() * 8.0D);
												if ((local105 & 0x1) == 1) {
													Static120.anInt2841 += Static146.anInt3303;
												}
												if ((local105 & 0x2) == 2) {
													Static170.anInt3687 += Static168.anInt3653;
												}
											}
											if (Static123.anInt2855 < -55) {
												Static170.anInt3744 = 2;
											}
											if (Static170.anInt3687 < -20) {
												Static168.anInt3653 = 1;
											}
											if (Static123.anInt2855 > 55) {
												Static170.anInt3744 = -2;
											}
											if (Static150.anInt3587 < -50) {
												Static163.anInt3146 = 2;
											}
											if (Static79.anInt1740 < -40) {
												Static23.anInt621 = 1;
											}
											if (Static150.anInt3587 > 50) {
												Static163.anInt3146 = -2;
											}
											if (Static120.anInt2841 < -60) {
												Static146.anInt3303 = 2;
											}
											if (Static120.anInt2841 > 60) {
												Static146.anInt3303 = -2;
											}
											if (Static170.anInt3687 > 10) {
												Static168.anInt3653 = -1;
											}
											if (Static79.anInt1740 > 40) {
												Static23.anInt621 = -1;
											}
											if (Static99.anInt2198 > 50) {
												Static139.aClass3_Sub12_Sub1_3.method1400(118);
											}
											try {
												if (Static42.aClass2_2 != null && Static139.aClass3_Sub12_Sub1_3.anInt1793 > 0) {
													Static42.aClass2_2.method15(Static139.aClass3_Sub12_Sub1_3.anInt1793, Static139.aClass3_Sub12_Sub1_3.aByteArray16);
													Static99.anInt2198 = 0;
													Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
													return;
												}
												return;
											} catch (@Pc(1350) IOException local1350) {
												Static10.method177();
												return;
											}
										}
										local881 = local876.aClass83_13;
										if (local881.anInt3677 < 0) {
											break;
										}
										local889 = Static80.method1396(local881.anInt3702);
									} while (local889 == null || local889.aClass83Array2 == null || local881.anInt3677 >= local889.aClass83Array2.length || local889.aClass83Array2[local881.anInt3677] != local881);
									Static148.method2418(local876);
								}
							}
							local881 = local876.aClass83_13;
							if (local881.anInt3677 < 0) {
								break;
							}
							local889 = Static80.method1396(local881.anInt3702);
						} while (local889 == null || local889.aClass83Array2 == null || local881.anInt3677 >= local889.aClass83Array2.length || local889.aClass83Array2[local881.anInt3677] != local881);
						Static148.method2418(local876);
					}
				}
				local881 = local876.aClass83_13;
				if (local881.anInt3677 < 0) {
					break;
				}
				local889 = Static80.method1396(local881.anInt3702);
			} while (local889 == null || local889.aClass83Array2 == null || local889.aClass83Array2.length <= local881.anInt3677 || local881 != local889.aClass83Array2[local881.anInt3677]);
			Static148.method2418(local876);
		}
	}
}
