import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Lclient!mc;")
	public static Class1_Sub12 aClass1_Sub12_9;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!we;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!rc;")
	public static Class61 aClass61_12 = new Class61();

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1077 = Static106.method1849("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "J")
	public static long aLong75 = 0L;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Lclient!w;")
	public static Class79 aClass79_1 = new Class79();

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1078 = Static106.method1849("Sprites geladen)3");

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	public static int anInt2010 = 0;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1079 = Static106.method1849("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!n", name = "q", descriptor = "[I")
	public static int[] anIntArray319 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1083 = Static106.method1849("flash1:");

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1080 = aClass66_1083;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1081 = Static106.method1849("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1082 = aClass66_1083;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
	public static int method1397(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 - 1;
		@Pc(15) int local15 = local9 | local9 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1398() {
		if (Static49.anInt1513 > 1) {
			Static49.anInt1513--;
		}
		if (Static9.anInt347 > 0) {
			Static9.anInt347--;
		}
		if (Static14.aBoolean19) {
			Static14.aBoolean19 = false;
			Static36.method653();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static102.method1787(); local29++) {
		}
		if (Static11.anInt398 != 30) {
			return;
		}
		Static35.method636(Static127.aClass1_Sub12_Sub1_2);
		@Pc(55) Object local55 = Static59.aClass58_1.anObject5;
		@Pc(84) int local84;
		@Pc(67) int local67;
		@Pc(86) int local86;
		@Pc(102) int local102;
		@Pc(120) int local120;
		synchronized (Static59.aClass58_1.anObject5) {
			if (!Static11.aBoolean16) {
				Static59.aClass58_1.anInt2402 = 0;
			} else if (Static97.anInt2474 != 0 || Static59.aClass58_1.anInt2402 >= 40) {
				local67 = 0;
				Static127.aClass1_Sub12_Sub1_2.method1227(232);
				Static127.aClass1_Sub12_Sub1_2.method1197(0);
				local84 = Static127.aClass1_Sub12_Sub1_2.anInt1694;
				for (local86 = 0; Static59.aClass58_1.anInt2402 > local86 && Static127.aClass1_Sub12_Sub1_2.anInt1694 - local84 < 240; local86++) {
					local67++;
					local102 = Static59.aClass58_1.anIntArray404[local86];
					if (local102 < 0) {
						local102 = 0;
					} else if (local102 > 502) {
						local102 = 502;
					}
					local120 = Static59.aClass58_1.anIntArray405[local86];
					if (local120 < 0) {
						local120 = 0;
					} else if (local120 > 764) {
						local120 = 764;
					}
					@Pc(142) int local142 = local102 * 765 + local120;
					if (Static59.aClass58_1.anIntArray404[local86] == -1 && Static59.aClass58_1.anIntArray405[local86] == -1) {
						local120 = -1;
						local142 = 524287;
						local102 = -1;
					}
					if (local120 != Static84.anInt2222 || Static16.anInt481 != local102) {
						@Pc(185) int local185 = local120 - Static84.anInt2222;
						Static84.anInt2222 = local120;
						@Pc(192) int local192 = local102 - Static16.anInt481;
						Static16.anInt481 = local102;
						if (Static124.anInt2858 < 8 && local185 >= -32 && local185 <= 31 && local192 >= -32 && local192 <= 31) {
							local185 += 32;
							local192 += 32;
							Static127.aClass1_Sub12_Sub1_2.method1175((Static124.anInt2858 << 12) + (local185 << 6) + local192);
							Static124.anInt2858 = 0;
						} else if (Static124.anInt2858 < 8) {
							Static127.aClass1_Sub12_Sub1_2.method1170(local142 + (Static124.anInt2858 << 19) + 8388608);
							Static124.anInt2858 = 0;
						} else {
							Static127.aClass1_Sub12_Sub1_2.method1193((Static124.anInt2858 << 19) + (local142 - 1073741824));
							Static124.anInt2858 = 0;
						}
					} else if (Static124.anInt2858 < 2047) {
						Static124.anInt2858++;
					}
				}
				Static127.aClass1_Sub12_Sub1_2.method1191(Static127.aClass1_Sub12_Sub1_2.anInt1694 - local84);
				if (Static59.aClass58_1.anInt2402 <= local67) {
					Static59.aClass58_1.anInt2402 = 0;
				} else {
					Static59.aClass58_1.anInt2402 -= local67;
					for (local102 = 0; local102 < Static59.aClass58_1.anInt2402; local102++) {
						Static59.aClass58_1.anIntArray405[local102] = Static59.aClass58_1.anIntArray405[local102 + local67];
						Static59.aClass58_1.anIntArray404[local102] = Static59.aClass58_1.anIntArray404[local67 + local102];
					}
				}
			}
		}
		if (Static97.anInt2474 != 0) {
			@Pc(343) long local343 = (Static98.aLong105 - aLong75) / 50L;
			aLong75 = Static98.aLong105;
			if (local343 > 4095L) {
				local343 = 4095L;
			}
			local67 = Static35.anInt866;
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 764) {
				local67 = 764;
			}
			@Pc(369) byte local369 = 0;
			if (Static97.anInt2474 == 2) {
				local369 = 1;
			}
			local84 = Static6.anInt308;
			if (local84 < 0) {
				local84 = 0;
			} else if (local84 > 502) {
				local84 = 502;
			}
			local86 = local84 * 765 + local67;
			Static127.aClass1_Sub12_Sub1_2.method1227(1);
			local120 = (int) local343;
			Static127.aClass1_Sub12_Sub1_2.method1172((local120 << 20) + (local369 << 19) + local86);
		}
		if (Static122.aBooleanArray17[96] || Static122.aBooleanArray17[97] || Static122.aBooleanArray17[98] || Static122.aBooleanArray17[99]) {
			Static54.aBoolean70 = true;
		}
		if (Static2.anInt86 > 0) {
			Static2.anInt86--;
		}
		if (Static54.aBoolean70 && Static2.anInt86 <= 0) {
			Static54.aBoolean70 = false;
			Static2.anInt86 = 20;
			Static127.aClass1_Sub12_Sub1_2.method1227(58);
			Static127.aClass1_Sub12_Sub1_2.method1200(Static75.anInt2076);
			Static127.aClass1_Sub12_Sub1_2.method1217(Static65.anInt1950);
		}
		if (Static16.aBoolean20 && !Static41.aBoolean43) {
			Static41.aBoolean43 = true;
			Static127.aClass1_Sub12_Sub1_2.method1227(188);
			Static127.aClass1_Sub12_Sub1_2.method1197(1);
		}
		if (!Static16.aBoolean20 && Static41.aBoolean43) {
			Static41.aBoolean43 = false;
			Static127.aClass1_Sub12_Sub1_2.method1227(188);
			Static127.aClass1_Sub12_Sub1_2.method1197(0);
		}
		Static109.method1854();
		if (Static11.anInt398 != 30) {
			return;
		}
		Static90.method1291();
		Static32.method624();
		Static40.anInt1278++;
		if (Static40.anInt1278 > 750) {
			Static36.method653();
			return;
		}
		Static127.method2031();
		Static41.method902();
		Static6.method268();
		if (Static104.anInt2550 != 0) {
			Static56.anInt1780 += 20;
			if (Static56.anInt1780 >= 400) {
				Static104.anInt2550 = 0;
			}
		}
		Static130.anInt2924++;
		if (Static28.aClass1_Sub10_4 != null) {
			Static132.anInt2930++;
			if (Static132.anInt2930 >= 15) {
				Static70.method537(Static28.aClass1_Sub10_4);
				Static28.aClass1_Sub10_4 = null;
			}
		}
		@Pc(694) Class1_Sub10 local694;
		if (Static92.aClass1_Sub10_11 != null) {
			Static70.method537(Static92.aClass1_Sub10_11);
			Static104.anInt2555++;
			if (Static82.anInt2193 + 5 < Static50.anInt1542 || Static50.anInt1542 < Static82.anInt2193 - 5 || Static2.anInt87 + 5 < Static13.anInt462 || Static13.anInt462 < Static2.anInt87 - 5) {
				Static58.aBoolean72 = true;
			}
			if (Static122.anInt2828 == 0) {
				if (Static58.aBoolean72 && Static104.anInt2555 >= 5) {
					if (Static93.aClass1_Sub10_12 == Static92.aClass1_Sub10_11 && Static66.anInt538 != Static134.anInt2954) {
						local694 = Static92.aClass1_Sub10_11;
						@Pc(696) byte local696 = 0;
						if (Static83.anInt2202 == 1 && local694.anInt1329 == 206) {
							local696 = 1;
						}
						if (local694.anIntArray201[Static134.anInt2954] <= 0) {
							local696 = 0;
						}
						if (Static27.method548(Static61.method1301(local694))) {
							local84 = Static66.anInt538;
							local67 = Static134.anInt2954;
							local694.anIntArray201[local67] = local694.anIntArray201[local84];
							local694.anIntArray206[local67] = local694.anIntArray206[local84];
							local694.anIntArray201[local84] = -1;
							local694.anIntArray206[local84] = 0;
						} else if (local696 == 1) {
							local84 = Static66.anInt538;
							local67 = Static134.anInt2954;
							while (local67 != local84) {
								if (local67 < local84) {
									local694.method952(local84, local84 - 1);
									local84--;
								} else if (local84 < local67) {
									local694.method952(local84, local84 + 1);
									local84++;
								}
							}
						} else {
							local694.method952(Static66.anInt538, Static134.anInt2954);
						}
						Static127.aClass1_Sub12_Sub1_2.method1227(166);
						Static127.aClass1_Sub12_Sub1_2.method1193(Static92.aClass1_Sub10_11.anInt1348);
						Static127.aClass1_Sub12_Sub1_2.method1175(Static66.anInt538);
						Static127.aClass1_Sub12_Sub1_2.method1177(local696);
						Static127.aClass1_Sub12_Sub1_2.method1204(Static134.anInt2954);
					}
				} else if ((Static39.anInt1007 == 1 || Static111.method1878(Static5.anInt228 - 1)) && Static5.anInt228 > 2) {
					Static5.method160();
				} else if (Static5.anInt228 > 0) {
					Static19.method487(Static5.anInt228 - 1);
				}
				Static92.aClass1_Sub10_11 = null;
				Static132.anInt2930 = 10;
				Static97.anInt2474 = 0;
			}
		}
		Static22.aClass1_Sub10_3 = null;
		Static11.aBoolean17 = false;
		Static4.aBoolean9 = false;
		@Pc(850) Class1_Sub10 local850 = Static45.aClass1_Sub10_8;
		Static45.aClass1_Sub10_8 = null;
		local694 = Static51.aClass1_Sub10_9;
		Static51.aClass1_Sub10_9 = null;
		for (Static114.anInt2712 = 0; Static18.method469() && Static114.anInt2712 < 128; Static114.anInt2712++) {
			Static9.anIntArray57[Static114.anInt2712] = Static2.anInt85;
			Static100.anIntArray420[Static114.anInt2712] = Static23.anInt666;
		}
		Static125.method2016(0, 503, 0, 0, 765, 0, Static22.anInt637);
		Static112.anInt2674++;
		while (true) {
			@Pc(896) Class1_Sub5 local896;
			@Pc(911) Class1_Sub10 local911;
			@Pc(901) Class1_Sub10 local901;
			do {
				local896 = (Class1_Sub5) Static53.aClass61_11.method1756();
				if (local896 == null) {
					while (true) {
						do {
							local896 = (Class1_Sub5) Static23.aClass61_6.method1756();
							if (local896 == null) {
								while (true) {
									do {
										local896 = (Class1_Sub5) Static87.aClass61_14.method1756();
										if (local896 == null) {
											if (Static35.aClass1_Sub10_6 != null) {
												Static112.method1881();
											}
											if (Static10.anInt377 != -1) {
												local84 = Static10.anInt377;
												local67 = Static10.anInt357;
												@Pc(1065) boolean local1065 = Static35.method633(local84, 0, 0, 0, 0, local67, 0, true, Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0], 0);
												Static10.anInt377 = -1;
												if (local1065) {
													Static14.anInt477 = Static6.anInt308;
													Static131.anInt2694 = Static35.anInt866;
													Static56.anInt1780 = 0;
													Static104.anInt2550 = 1;
												}
											}
											Static57.method1254();
											if (Static51.aClass1_Sub10_9 != local694) {
												if (local694 != null) {
													Static70.method537(local694);
												}
												if (Static51.aClass1_Sub10_9 != null) {
													Static70.method537(Static51.aClass1_Sub10_9);
												}
											}
											if (Static45.aClass1_Sub10_8 != local850 && Static86.anInt2287 == Static22.anInt638) {
												if (local850 != null) {
													Static70.method537(local850);
												}
												if (Static45.aClass1_Sub10_8 != null) {
													Static70.method537(Static45.aClass1_Sub10_8);
												}
											}
											if (Static45.aClass1_Sub10_8 == null) {
												if (Static22.anInt638 > 0) {
													Static22.anInt638--;
												}
											} else if (Static86.anInt2287 > Static22.anInt638) {
												Static22.anInt638++;
												if (Static86.anInt2287 == Static22.anInt638) {
													Static70.method537(Static45.aClass1_Sub10_8);
												}
											}
											Static35.method638();
											if (Static109.aBoolean111) {
												Static60.method1295();
											}
											for (local84 = 0; local84 < 5; local84++) {
												@Pc(1155) int local1155 = Static18.anIntArray82[local84]++;
											}
											local67 = Static9.method302();
											local86 = Static121.method1989();
											if (local67 > 4500 && local86 > 4500) {
												Static9.anInt347 = 250;
												Static93.method1707(4000);
												Static127.aClass1_Sub12_Sub1_2.method1227(134);
											}
											Static32.anInt846++;
											Static27.anInt729++;
											Static134.anInt2952++;
											if (Static27.anInt729 > 500) {
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x1) == 1) {
													Static121.anInt2809 += Static43.anInt1336;
												}
												if ((local102 & 0x4) == 4) {
													Static86.anInt2293 += Static111.anInt2665;
												}
												Static27.anInt729 = 0;
												if ((local102 & 0x2) == 2) {
													Static103.anInt2544 += Static26.anInt697;
												}
											}
											if (Static32.anInt846 > 500) {
												local102 = (int) (Math.random() * 8.0D);
												if ((local102 & 0x2) == 2) {
													Static70.anInt712 += Static102.anInt2535;
												}
												if ((local102 & 0x1) == 1) {
													Static38.anInt2851 += Static61.anInt1874;
												}
												Static32.anInt846 = 0;
											}
											if (Static86.anInt2293 < -40) {
												Static111.anInt2665 = 1;
											}
											if (Static121.anInt2809 < -50) {
												Static43.anInt1336 = 2;
											}
											if (Static38.anInt2851 < -60) {
												Static61.anInt1874 = 2;
											}
											if (Static38.anInt2851 > 60) {
												Static61.anInt1874 = -2;
											}
											if (Static70.anInt712 < -20) {
												Static102.anInt2535 = 1;
											}
											if (Static70.anInt712 > 10) {
												Static102.anInt2535 = -1;
											}
											if (Static86.anInt2293 > 40) {
												Static111.anInt2665 = -1;
											}
											if (Static121.anInt2809 > 50) {
												Static43.anInt1336 = -2;
											}
											if (Static103.anInt2544 < -55) {
												Static26.anInt697 = 2;
											}
											if (Static103.anInt2544 > 55) {
												Static26.anInt697 = -2;
											}
											if (Static134.anInt2952 > 50) {
												Static127.aClass1_Sub12_Sub1_2.method1227(152);
											}
											try {
												if (Static49.aClass34_3 != null && Static127.aClass1_Sub12_Sub1_2.anInt1694 > 0) {
													Static49.aClass34_3.method1098(Static127.aClass1_Sub12_Sub1_2.aByteArray12, Static127.aClass1_Sub12_Sub1_2.anInt1694);
													Static127.aClass1_Sub12_Sub1_2.anInt1694 = 0;
													Static134.anInt2952 = 0;
													return;
												}
												return;
											} catch (@Pc(1374) IOException local1374) {
												Static36.method653();
												return;
											}
										}
										local901 = local896.aClass1_Sub10_1;
										if (local901.anInt1371 < 0) {
											break;
										}
										local911 = Static38.method2002(local901.anInt1375);
									} while (local911 == null || local911.aClass1_Sub10Array2 == null || local901.anInt1371 >= local911.aClass1_Sub10Array2.length || local911.aClass1_Sub10Array2[local901.anInt1371] != local901);
									Static38.method2005(local896);
								}
							}
							local901 = local896.aClass1_Sub10_1;
							if (local901.anInt1371 < 0) {
								break;
							}
							local911 = Static38.method2002(local901.anInt1375);
						} while (local911 == null || local911.aClass1_Sub10Array2 == null || local901.anInt1371 >= local911.aClass1_Sub10Array2.length || local901 != local911.aClass1_Sub10Array2[local901.anInt1371]);
						Static38.method2005(local896);
					}
				}
				local901 = local896.aClass1_Sub10_1;
				if (local901.anInt1371 < 0) {
					break;
				}
				local911 = Static38.method2002(local901.anInt1375);
			} while (local911 == null || local911.aClass1_Sub10Array2 == null || local911.aClass1_Sub10Array2.length <= local901.anInt1371 || local911.aClass1_Sub10Array2[local901.anInt1371] != local901);
			Static38.method2005(local896);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1399() {
		aClass66_1079 = null;
		aClass1_Sub12_9 = null;
		aClass66_1083 = null;
		aClass83_1 = null;
		aClass66_1077 = null;
		aClass66_1082 = null;
		anIntArray319 = null;
		aClass61_12 = null;
		aCRC32_1 = null;
		aClass66_1081 = null;
		aClass66_1080 = null;
		aClass66_1078 = null;
		aClass79_1 = null;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public static void method1400() {
		if (Static49.aClass34_3 != null) {
			Static49.aClass34_3.method1104();
			Static49.aClass34_3 = null;
		}
		Static99.method909();
		Static129.aClass9_1.method318();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static83.aClass13Array1[local18].method473();
		}
		System.gc();
		Static101.method1767();
		Static117.anInt2749 = -1;
		Static53.aBoolean68 = false;
		Static5.method164();
		Static18.method468(10);
	}
}
