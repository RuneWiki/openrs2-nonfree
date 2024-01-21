import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dc", name = "fb", descriptor = "Lclient!dd;")
	public static Class14 aClass14_6;

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
	public static int anInt712;

	@OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!dc", name = "rb", descriptor = "Z")
	public static boolean aBoolean34;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_348 = Static56.method816("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
	public static int anInt722 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method415() {
		aBooleanArray2 = null;
		aClass14_6 = null;
		aClass34_348 = null;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public static void method420() {
		if (Static31.anInt863 > 0) {
			Static31.anInt863--;
		}
		if (Static104.anInt2385 > 1) {
			Static104.anInt2385--;
		}
		if (Static107.aBoolean97) {
			Static107.aBoolean97 = false;
			Static100.method1457();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static30.method527(); local32++) {
		}
		if (Static61.anInt1587 != 30) {
			return;
		}
		Static129.method1994(Static106.aClass8_Sub20_Sub1_3);
		@Pc(56) Object local56 = Static134.aClass33_1.anObject3;
		@Pc(83) int local83;
		@Pc(70) int local70;
		@Pc(85) int local85;
		@Pc(100) int local100;
		@Pc(121) int local121;
		synchronized (Static134.aClass33_1.anObject3) {
			if (!Static129.aBoolean111) {
				Static134.aClass33_1.anInt1373 = 0;
			} else if (Static39.anInt964 != 0 || Static134.aClass33_1.anInt1373 >= 40) {
				local70 = 0;
				Static106.aClass8_Sub20_Sub1_3.method1907(110);
				Static106.aClass8_Sub20_Sub1_3.method1883(0);
				local83 = Static106.aClass8_Sub20_Sub1_3.anInt2853;
				for (local85 = 0; local85 < Static134.aClass33_1.anInt1373 && Static106.aClass8_Sub20_Sub1_3.anInt2853 - local83 < 240; local85++) {
					local70++;
					local100 = Static134.aClass33_1.anIntArray173[local85];
					if (local100 < 0) {
						local100 = 0;
					} else if (local100 > 502) {
						local100 = 502;
					}
					local121 = Static134.aClass33_1.anIntArray172[local85];
					if (local121 < 0) {
						local121 = 0;
					} else if (local121 > 764) {
						local121 = 764;
					}
					@Pc(141) int local141 = local100 * 765 + local121;
					if (Static134.aClass33_1.anIntArray173[local85] == -1 && Static134.aClass33_1.anIntArray172[local85] == -1) {
						local100 = -1;
						local141 = 524287;
						local121 = -1;
					}
					if (Static100.anInt2352 != local121 || Static68.anInt1675 != local100) {
						@Pc(191) int local191 = local121 - Static100.anInt2352;
						Static100.anInt2352 = local121;
						@Pc(198) int local198 = local100 - Static68.anInt1675;
						Static68.anInt1675 = local100;
						if (Static19.anInt600 < 8 && local191 >= -32 && local191 <= 31 && local198 >= -32 && local198 <= 31) {
							local198 += 32;
							local191 += 32;
							Static106.aClass8_Sub20_Sub1_3.method1884((local191 << 6) + (Static19.anInt600 << 12) + local198);
							Static19.anInt600 = 0;
						} else if (Static19.anInt600 < 8) {
							Static106.aClass8_Sub20_Sub1_3.method1887((Static19.anInt600 << 19) + local141 + 8388608);
							Static19.anInt600 = 0;
						} else {
							Static106.aClass8_Sub20_Sub1_3.method1873(local141 + (Static19.anInt600 << 19) - 1073741824);
							Static19.anInt600 = 0;
						}
					} else if (Static19.anInt600 < 2047) {
						Static19.anInt600++;
					}
				}
				Static106.aClass8_Sub20_Sub1_3.method1893(Static106.aClass8_Sub20_Sub1_3.anInt2853 - local83);
				if (Static134.aClass33_1.anInt1373 <= local70) {
					Static134.aClass33_1.anInt1373 = 0;
				} else {
					Static134.aClass33_1.anInt1373 -= local70;
					for (local100 = 0; local100 < Static134.aClass33_1.anInt1373; local100++) {
						Static134.aClass33_1.anIntArray172[local100] = Static134.aClass33_1.anIntArray172[local70 + local100];
						Static134.aClass33_1.anIntArray173[local100] = Static134.aClass33_1.anIntArray173[local70 + local100];
					}
				}
			}
		}
		if (Static39.anInt964 != 0) {
			@Pc(369) long local369 = (Static123.aLong98 - Static8.aLong8) / 50L;
			Static8.aLong8 = Static123.aLong98;
			if (local369 > 4095L) {
				local369 = 4095L;
			}
			local83 = Static74.anInt1781;
			if (local83 < 0) {
				local83 = 0;
			} else if (local83 > 502) {
				local83 = 502;
			}
			local70 = Static3.anInt51;
			@Pc(398) byte local398 = 0;
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 764) {
				local70 = 764;
			}
			local121 = (int) local369;
			if (Static39.anInt964 == 2) {
				local398 = 1;
			}
			local85 = local83 * 765 + local70;
			Static106.aClass8_Sub20_Sub1_3.method1907(193);
			Static106.aClass8_Sub20_Sub1_3.method1873((local121 << 20) + (local398 << 19) + local85);
		}
		if (Static87.aBooleanArray17[96] || Static87.aBooleanArray17[97] || Static87.aBooleanArray17[98] || Static87.aBooleanArray17[99]) {
			Static94.aBoolean87 = true;
		}
		if (Static84.anInt2109 > 0) {
			Static84.anInt2109--;
		}
		if (Static94.aBoolean87 && Static84.anInt2109 <= 0) {
			Static94.aBoolean87 = false;
			Static84.anInt2109 = 20;
			Static106.aClass8_Sub20_Sub1_3.method1907(66);
			Static106.aClass8_Sub20_Sub1_3.method1869(Static59.anInt1552);
			Static106.aClass8_Sub20_Sub1_3.method1843(Static72.anInt1744);
		}
		if (Static108.aBoolean99 && !Static52.aBoolean53) {
			Static52.aBoolean53 = true;
			Static106.aClass8_Sub20_Sub1_3.method1907(32);
			Static106.aClass8_Sub20_Sub1_3.method1883(1);
		}
		if (!Static108.aBoolean99 && Static52.aBoolean53) {
			Static52.aBoolean53 = false;
			Static106.aClass8_Sub20_Sub1_3.method1907(32);
			Static106.aClass8_Sub20_Sub1_3.method1883(0);
		}
		Static19.method359();
		if (Static61.anInt1587 != 30) {
			return;
		}
		Static130.method2000();
		Static118.method1649();
		Static128.anInt3020++;
		if (Static128.anInt3020 > 750) {
			Static100.method1457();
			return;
		}
		Static79.method1135();
		Static95.method1353();
		Static62.method939();
		Static69.anInt1683++;
		if (Static16.anInt393 != 0) {
			Static133.anInt3067 += 20;
			if (Static133.anInt3067 >= 400) {
				Static16.anInt393 = 0;
			}
		}
		if (Static123.aClass8_Sub24_15 != null) {
			Static44.anInt1059++;
			if (Static44.anInt1059 >= 15) {
				Static40.method608(Static123.aClass8_Sub24_15);
				Static123.aClass8_Sub24_15 = null;
			}
		}
		@Pc(667) Class8_Sub24 local667;
		if (Static115.aClass8_Sub24_10 != null) {
			Static40.method608(Static115.aClass8_Sub24_10);
			if (Static86.anInt2180 + 5 < Static14.anInt366 || Static14.anInt366 < Static86.anInt2180 - 5 || Static60.anInt1579 + 5 < Static121.anInt2909 || Static121.anInt2909 < Static60.anInt1579 - 5) {
				Static27.aBoolean39 = true;
			}
			Static27.anInt796++;
			if (Static134.anInt3170 == 0) {
				if (Static27.aBoolean39 && Static27.anInt796 >= 5) {
					if (Static115.aClass8_Sub24_10 == Static51.aClass8_Sub24_5 && Static86.anInt2181 != Static38.anInt928) {
						local667 = Static115.aClass8_Sub24_10;
						@Pc(669) byte local669 = 0;
						if (Static30.anInt846 == 1 && local667.anInt3143 == 206) {
							local669 = 1;
						}
						if (local667.anIntArray414[Static38.anInt928] <= 0) {
							local669 = 0;
						}
						if (Static72.method1077(Static99.method1445(local667))) {
							local83 = Static86.anInt2181;
							local70 = Static38.anInt928;
							local667.anIntArray414[local70] = local667.anIntArray414[local83];
							local667.anIntArray410[local70] = local667.anIntArray410[local83];
							local667.anIntArray414[local83] = -1;
							local667.anIntArray410[local83] = 0;
						} else if (local669 == 1) {
							local70 = Static38.anInt928;
							local83 = Static86.anInt2181;
							while (local70 != local83) {
								if (local70 < local83) {
									local667.method2022(local83, local83 - 1);
									local83--;
								} else if (local83 < local70) {
									local667.method2022(local83, local83 + 1);
									local83++;
								}
							}
						} else {
							local667.method2022(Static86.anInt2181, Static38.anInt928);
						}
						Static106.aClass8_Sub20_Sub1_3.method1907(250);
						Static106.aClass8_Sub20_Sub1_3.method1841(Static115.aClass8_Sub24_10.anInt3124);
						Static106.aClass8_Sub20_Sub1_3.method1881(Static86.anInt2181);
						Static106.aClass8_Sub20_Sub1_3.method1866(local669);
						Static106.aClass8_Sub20_Sub1_3.method1881(Static38.anInt928);
					}
				} else if ((Static113.anInt2574 == 1 || Static76.method1106(Static96.anInt552 - 1)) && Static96.anInt552 > 2) {
					Static22.method1612();
				} else if (Static96.anInt552 > 0) {
					Static28.method499(Static96.anInt552 - 1);
				}
				Static115.aClass8_Sub24_10 = null;
				Static44.anInt1059 = 10;
				Static39.anInt964 = 0;
			}
		}
		Static102.anInt3086 = 0;
		local667 = Static15.aClass8_Sub24_4;
		Static107.aClass8_Sub24_9 = null;
		Static15.aClass8_Sub24_4 = null;
		@Pc(847) Class8_Sub24 local847 = Static123.aClass8_Sub24_14;
		Static58.aBoolean60 = false;
		Static123.aClass8_Sub24_14 = null;
		Static24.aBoolean71 = false;
		while (Static80.method1168() && Static102.anInt3086 < 128) {
			Static33.anIntArray114[Static102.anInt3086] = Static21.anInt656;
			Static38.anIntArray130[Static102.anInt3086] = Static103.anInt2375;
			Static102.anInt3086++;
		}
		Static25.method455(0, 0, 503, 765, Static107.anInt2463, 0, 0);
		Static86.anInt2177++;
		while (true) {
			@Pc(893) Class8_Sub19 local893;
			@Pc(911) Class8_Sub24 local911;
			@Pc(898) Class8_Sub24 local898;
			do {
				local893 = (Class8_Sub19) Static50.aClass49_6.method1116();
				if (local893 == null) {
					while (true) {
						do {
							local893 = (Class8_Sub19) Static44.aClass49_5.method1116();
							if (local893 == null) {
								while (true) {
									do {
										local893 = (Class8_Sub19) Static128.aClass49_15.method1116();
										if (local893 == null) {
											if (Static93.aClass8_Sub24_7 != null) {
												Static36.method571();
											}
											if (Static98.anInt2291 != -1) {
												local83 = Static98.anInt2291;
												local70 = Static98.anInt2284;
												@Pc(1067) boolean local1067 = Static105.method1480(0, 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0], 0, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0], 0, 0, local83, local70, 0, true);
												if (local1067) {
													Static81.anInt1954 = Static74.anInt1781;
													Static16.anInt393 = 1;
													Static132.anInt2817 = Static3.anInt51;
													Static133.anInt3067 = 0;
												}
												Static98.anInt2291 = -1;
											}
											Static36.method574();
											if (local667 != Static15.aClass8_Sub24_4) {
												if (local667 != null) {
													Static40.method608(local667);
												}
												if (Static15.aClass8_Sub24_4 != null) {
													Static40.method608(Static15.aClass8_Sub24_4);
												}
											}
											if (local847 != Static123.aClass8_Sub24_14 && Static3.anInt50 == Static78.anInt1854) {
												if (local847 != null) {
													Static40.method608(local847);
												}
												if (Static123.aClass8_Sub24_14 != null) {
													Static40.method608(Static123.aClass8_Sub24_14);
												}
											}
											if (Static123.aClass8_Sub24_14 == null) {
												if (Static78.anInt1854 > 0) {
													Static78.anInt1854--;
												}
											} else if (Static3.anInt50 > Static78.anInt1854) {
												Static78.anInt1854++;
												if (Static78.anInt1854 == Static3.anInt50) {
													Static40.method608(Static123.aClass8_Sub24_14);
												}
											}
											Static72.method1074();
											if (Static112.aBoolean100) {
												Static82.method1197();
											}
											for (local83 = 0; local83 < 5; local83++) {
												@Pc(1160) int local1160 = Static13.anIntArray48[local83]++;
											}
											local70 = Static90.method192();
											local85 = Static51.method767();
											if (local70 > 4500 && local85 > 4500) {
												Static31.anInt863 = 250;
												Static45.method682(4000);
												Static106.aClass8_Sub20_Sub1_3.method1907(12);
											}
											Static31.anInt862++;
											Static32.anInt869++;
											if (Static32.anInt869 > 500) {
												Static32.anInt869 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x2) == 2) {
													Static34.anInt908 += Static38.anInt926;
												}
												if ((local100 & 0x4) == 4) {
													Static129.anInt3042 += Static64.anInt2042;
												}
												if ((local100 & 0x1) == 1) {
													Static14.anInt364 += Static93.anInt2209;
												}
											}
											if (Static14.anInt364 < -50) {
												Static93.anInt2209 = 2;
											}
											Static132.anInt2860++;
											if (Static129.anInt3042 < -40) {
												Static64.anInt2042 = 1;
											}
											if (Static34.anInt908 < -55) {
												Static38.anInt926 = 2;
											}
											if (Static14.anInt364 > 50) {
												Static93.anInt2209 = -2;
											}
											if (Static132.anInt2860 > 500) {
												Static132.anInt2860 = 0;
												local100 = (int) (Math.random() * 8.0D);
												if ((local100 & 0x1) == 1) {
													Static111.anInt3027 += Static62.anInt1590;
												}
												if ((local100 & 0x2) == 2) {
													Static47.anInt1268 += Static93.anInt2208;
												}
											}
											if (Static111.anInt3027 < -60) {
												Static62.anInt1590 = 2;
											}
											if (Static129.anInt3042 > 40) {
												Static64.anInt2042 = -1;
											}
											if (Static111.anInt3027 > 60) {
												Static62.anInt1590 = -2;
											}
											if (Static34.anInt908 > 55) {
												Static38.anInt926 = -2;
											}
											if (Static47.anInt1268 < -20) {
												Static93.anInt2208 = 1;
											}
											if (Static47.anInt1268 > 10) {
												Static93.anInt2208 = -1;
											}
											if (Static31.anInt862 > 50) {
												Static106.aClass8_Sub20_Sub1_3.method1907(85);
											}
											try {
												if (Static93.aClass25_4 != null && Static106.aClass8_Sub20_Sub1_3.anInt2853 > 0) {
													Static93.aClass25_4.method586(Static106.aClass8_Sub20_Sub1_3.anInt2853, Static106.aClass8_Sub20_Sub1_3.aByteArray44);
													Static106.aClass8_Sub20_Sub1_3.anInt2853 = 0;
													Static31.anInt862 = 0;
													return;
												}
												return;
											} catch (@Pc(1383) IOException local1383) {
												Static100.method1457();
												return;
											}
										}
										local898 = local893.aClass8_Sub24_13;
										if (local898.anInt3122 < 0) {
											break;
										}
										local911 = Static113.method1614(local898.anInt3166);
									} while (local911 == null || local911.aClass8_Sub24Array2 == null || local911.aClass8_Sub24Array2.length <= local898.anInt3122 || local898 != local911.aClass8_Sub24Array2[local898.anInt3122]);
									Static106.method1497(local893);
								}
							}
							local898 = local893.aClass8_Sub24_13;
							if (local898.anInt3122 < 0) {
								break;
							}
							local911 = Static113.method1614(local898.anInt3166);
						} while (local911 == null || local911.aClass8_Sub24Array2 == null || local898.anInt3122 >= local911.aClass8_Sub24Array2.length || local911.aClass8_Sub24Array2[local898.anInt3122] != local898);
						Static106.method1497(local893);
					}
				}
				local898 = local893.aClass8_Sub24_13;
				if (local898.anInt3122 < 0) {
					break;
				}
				local911 = Static113.method1614(local898.anInt3166);
			} while (local911 == null || local911.aClass8_Sub24Array2 == null || local898.anInt3122 >= local911.aClass8_Sub24Array2.length || local911.aClass8_Sub24Array2[local898.anInt3122] != local898);
			Static106.method1497(local893);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
	public static int method423(@OriginalArg(0) int arg0) {
		@Pc(7) Class8_Sub1_Sub17 local7 = Static120.method1896(arg0);
		@Pc(10) int local10 = local7.anInt2495;
		@Pc(18) int local18 = local7.anInt2492;
		@Pc(21) int local21 = local7.anInt2494;
		@Pc(28) int local28 = Class23.anIntArray127[local21 - local18];
		return local28 & Static78.anIntArray238[local10] >> local18;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method424() {
		Static48.aClass48_56.method1101();
	}
}
