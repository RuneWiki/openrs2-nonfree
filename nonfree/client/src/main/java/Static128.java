import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "Lclient!le;")
	public static Class2_Sub2_Sub1 aClass2_Sub2_Sub1_2 = new Class2_Sub2_Sub1(5000);

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1774 = Static107.method1838("Drop");

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1771 = aClass28_1774;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "[I")
	public static int[] anIntArray273 = new int[4000];

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1772 = Static107.method1838("Texturen geladen)3");

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1773 = Static107.method1838("gelb:");

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method2073() {
		aClass2_Sub2_Sub1_2 = null;
		anIntArray273 = null;
		aClass28_1772 = null;
		aClass28_1774 = null;
		aClass28_1773 = null;
		aClass28_1771 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
	public static void method2074() {
		if (Static82.anInt2102 > 1) {
			Static82.anInt2102--;
		}
		if (Static75.anInt1953 > 0) {
			Static75.anInt1953--;
		}
		if (Static62.aBoolean85) {
			Static62.aBoolean85 = false;
			Static13.method385();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static79.method1435(); local27++) {
		}
		if (Static124.anInt2924 != 30) {
			return;
		}
		Static4.method133(aClass2_Sub2_Sub1_2);
		@Pc(51) Object local51 = Static105.aClass83_1.anObject4;
		@Pc(88) int local88;
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(111) int local111;
		@Pc(106) int local106;
		synchronized (Static105.aClass83_1.anObject4) {
			if (!Static40.aBoolean48) {
				Static105.aClass83_1.anInt3797 = 0;
			} else if (Static142.anInt3248 != 0 || Static105.aClass83_1.anInt3797 >= 40) {
				aClass2_Sub2_Sub1_2.method1711(215);
				aClass2_Sub2_Sub1_2.method1700(0);
				local85 = 0;
				local88 = aClass2_Sub2_Sub1_2.anInt2385;
				for (local90 = 0; local90 < Static105.aClass83_1.anInt3797 && aClass2_Sub2_Sub1_2.anInt2385 - local88 < 240; local90++) {
					local85++;
					local106 = Static105.aClass83_1.anIntArray356[local90];
					local111 = Static105.aClass83_1.anIntArray355[local90];
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 502) {
						local111 = 502;
					}
					if (local106 < 0) {
						local106 = 0;
					} else if (local106 > 764) {
						local106 = 764;
					}
					@Pc(150) int local150 = local111 * 765 + local106;
					if (Static105.aClass83_1.anIntArray355[local90] == -1 && Static105.aClass83_1.anIntArray356[local90] == -1) {
						local111 = -1;
						local150 = 524287;
						local106 = -1;
					}
					if (local106 != Static110.anInt2684 || local111 != Static178.anInt3960) {
						@Pc(195) int local195 = local106 - Static110.anInt2684;
						Static110.anInt2684 = local106;
						@Pc(202) int local202 = local111 - Static178.anInt3960;
						Static178.anInt3960 = local111;
						if (Static117.anInt2841 < 8 && local195 >= -32 && local195 <= 31 && local202 >= -32 && local202 <= 31) {
							local202 += 32;
							local195 += 32;
							aClass2_Sub2_Sub1_2.method1696(local202 + (local195 << 6) + (Static117.anInt2841 << 12));
							Static117.anInt2841 = 0;
						} else if (Static117.anInt2841 < 8) {
							aClass2_Sub2_Sub1_2.method1691(local150 + (Static117.anInt2841 << 19) + 8388608);
							Static117.anInt2841 = 0;
						} else {
							aClass2_Sub2_Sub1_2.method1710((Static117.anInt2841 << 19) + local150 - 1073741824);
							Static117.anInt2841 = 0;
						}
					} else if (Static117.anInt2841 < 2047) {
						Static117.anInt2841++;
					}
				}
				aClass2_Sub2_Sub1_2.method1682(aClass2_Sub2_Sub1_2.anInt2385 - local88);
				if (Static105.aClass83_1.anInt3797 > local85) {
					Static105.aClass83_1.anInt3797 -= local85;
					for (local111 = 0; local111 < Static105.aClass83_1.anInt3797; local111++) {
						Static105.aClass83_1.anIntArray356[local111] = Static105.aClass83_1.anIntArray356[local85 + local111];
						Static105.aClass83_1.anIntArray355[local111] = Static105.aClass83_1.anIntArray355[local85 + local111];
					}
				} else {
					Static105.aClass83_1.anInt3797 = 0;
				}
			}
		}
		if (Static142.anInt3248 != 0) {
			@Pc(352) long local352 = (Static112.aLong100 - Static54.aLong50) / 50L;
			local88 = Static130.anInt3042;
			if (local352 > 4095L) {
				local352 = 4095L;
			}
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 502) {
				local88 = 502;
			}
			Static54.aLong50 = Static112.aLong100;
			local85 = Static101.anInt449;
			local106 = (int) local352;
			@Pc(389) byte local389 = 0;
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 764) {
				local85 = 764;
			}
			if (Static142.anInt3248 == 2) {
				local389 = 1;
			}
			aClass2_Sub2_Sub1_2.method1711(99);
			local90 = local85 + local88 * 765;
			aClass2_Sub2_Sub1_2.method1678((local106 << 20) + (local389 << 19) + local90);
		}
		if (Static9.aBooleanArray6[96] || Static9.aBooleanArray6[97] || Static9.aBooleanArray6[98] || Static9.aBooleanArray6[99]) {
			Static58.aBoolean77 = true;
		}
		if (Static76.anInt1963 > 0) {
			Static76.anInt1963--;
		}
		if (Static58.aBoolean77 && Static76.anInt1963 <= 0) {
			Static58.aBoolean77 = false;
			Static76.anInt1963 = 20;
			aClass2_Sub2_Sub1_2.method1711(147);
			aClass2_Sub2_Sub1_2.method1696(Static83.anInt2112);
			aClass2_Sub2_Sub1_2.method1688(Static66.anInt1789);
		}
		if (Static131.aBoolean138 && !Static93.aBoolean115) {
			Static93.aBoolean115 = true;
			aClass2_Sub2_Sub1_2.method1711(7);
			aClass2_Sub2_Sub1_2.method1700(1);
		}
		if (!Static131.aBoolean138 && Static93.aBoolean115) {
			Static93.aBoolean115 = false;
			aClass2_Sub2_Sub1_2.method1711(7);
			aClass2_Sub2_Sub1_2.method1700(0);
		}
		Static93.method1629();
		if (Static124.anInt2924 != 30) {
			return;
		}
		Static179.method2880();
		Static172.method2693();
		Static84.anInt2129++;
		if (Static84.anInt2129 > 750) {
			Static13.method385();
			return;
		}
		Static135.method2133();
		Static136.method2144();
		Static174.method2722();
		Static119.anInt2853++;
		if (Static6.anInt366 != 0) {
			Static164.anInt3646 += 20;
			if (Static164.anInt3646 >= 400) {
				Static6.anInt366 = 0;
			}
		}
		if (Static146.aClass24_10 != null) {
			Static104.anInt2592++;
			if (Static104.anInt2592 >= 15) {
				Static104.method1828(Static146.aClass24_10);
				Static146.aClass24_10 = null;
			}
		}
		@Pc(685) Class24 local685;
		if (Static83.aClass24_4 != null) {
			Static104.method1828(Static83.aClass24_4);
			Static69.anInt1837++;
			if (Static164.anInt3642 + 5 < Static93.anInt2353 || Static93.anInt2353 < Static164.anInt3642 - 5 || Static169.anInt3798 > Static82.anInt2099 + 5 || Static82.anInt2099 - 5 > Static169.anInt3798) {
				Static16.aBoolean18 = true;
			}
			if (Static152.anInt3425 == 0) {
				if (Static16.aBoolean18 && Static69.anInt1837 >= 5) {
					if (Static83.aClass24_4 == Static13.aClass24_2 && Static149.anInt3355 != Static14.anInt609) {
						local685 = Static83.aClass24_4;
						@Pc(687) byte local687 = 0;
						if (Static180.anInt4028 == 1 && local685.anInt1388 == 206) {
							local687 = 1;
						}
						if (local685.anIntArray120[Static14.anInt609] <= 0) {
							local687 = 0;
						}
						if (Static29.method597(Static10.method323(local685))) {
							local88 = Static149.anInt3355;
							local85 = Static14.anInt609;
							local685.anIntArray120[local85] = local685.anIntArray120[local88];
							local685.anIntArray119[local85] = local685.anIntArray119[local88];
							local685.anIntArray120[local88] = -1;
							local685.anIntArray119[local88] = 0;
						} else if (local687 == 1) {
							local85 = Static14.anInt609;
							local88 = Static149.anInt3355;
							while (local85 != local88) {
								if (local88 > local85) {
									local685.method980(local88, local88 - 1);
									local88--;
								} else if (local85 > local88) {
									local685.method980(local88, local88 + 1);
									local88++;
								}
							}
						} else {
							local685.method980(Static149.anInt3355, Static14.anInt609);
						}
						aClass2_Sub2_Sub1_2.method1711(253);
						aClass2_Sub2_Sub1_2.method1688(Static149.anInt3355);
						aClass2_Sub2_Sub1_2.method1678(Static83.aClass24_4.anInt1367);
						aClass2_Sub2_Sub1_2.method1696(Static14.anInt609);
						aClass2_Sub2_Sub1_2.method1695(local687);
					}
				} else if ((Static164.anInt3647 == 1 || Static116.method1949(Static150.anInt3365 - 1)) && Static150.anInt3365 > 2) {
					Static167.method2619();
				} else if (Static150.anInt3365 > 0) {
					Static107.method1839(Static150.anInt3365 - 1);
				}
				Static83.aClass24_4 = null;
				Static104.anInt2592 = 10;
				Static142.anInt3248 = 0;
			}
		}
		Static129.aBoolean136 = false;
		Static127.anInt3011 = 0;
		@Pc(830) Class24 local830 = Static105.aClass24_6;
		Static105.aClass24_6 = null;
		local685 = Static11.aClass24_1;
		Static146.aBoolean147 = false;
		Static11.aClass24_1 = null;
		Static98.aClass24_5 = null;
		while (Static150.method2328() && Static127.anInt3011 < 128) {
			Static133.anIntArray280[Static127.anInt3011] = Static108.anInt2635;
			Static172.anIntArray360[Static127.anInt3011] = Static99.anInt2499;
			Static127.anInt3011++;
		}
		if (Static118.anInt4001 != -1) {
			Static176.method2746(0, 0, 0, 765, Static118.anInt4001, 503, 0);
		}
		Static70.anInt1853++;
		while (true) {
			@Pc(881) Class2_Sub21 local881;
			@Pc(899) Class24 local899;
			@Pc(886) Class24 local886;
			do {
				local881 = (Class2_Sub21) Static147.aClass65_14.method2118();
				if (local881 == null) {
					while (true) {
						do {
							local881 = (Class2_Sub21) Static147.aClass65_15.method2118();
							if (local881 == null) {
								while (true) {
									do {
										local881 = (Class2_Sub21) Static141.aClass65_13.method2118();
										if (local881 == null) {
											if (Static177.aClass24_13 != null) {
												Static30.method633();
											}
											if (Static177.anInt3920 != -1) {
												local88 = Static177.anInt3920;
												local85 = Static18.anInt3710;
												@Pc(1044) boolean local1044 = Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 0, 0, 0, local88, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local85, true, 0);
												Static177.anInt3920 = -1;
												if (local1044) {
													Static49.anInt1287 = Static130.anInt3042;
													Static33.anInt945 = Static101.anInt449;
													Static6.anInt366 = 1;
													Static164.anInt3646 = 0;
												}
											}
											Static8.method294();
											if (Static11.aClass24_1 != local685) {
												if (local685 != null) {
													Static104.method1828(local685);
												}
												if (Static11.aClass24_1 != null) {
													Static104.method1828(Static11.aClass24_1);
												}
											}
											if (Static105.aClass24_6 != local830 && Static149.anInt3356 == Static42.anInt1090) {
												if (local830 != null) {
													Static104.method1828(local830);
												}
												if (Static105.aClass24_6 != null) {
													Static104.method1828(Static105.aClass24_6);
												}
											}
											if (Static105.aClass24_6 == null) {
												if (Static42.anInt1090 > 0) {
													Static42.anInt1090--;
												}
											} else if (Static42.anInt1090 < Static149.anInt3356) {
												Static42.anInt1090++;
												if (Static149.anInt3356 == Static42.anInt1090) {
													Static104.method1828(Static105.aClass24_6);
												}
											}
											Static177.method2759();
											if (Static79.aBoolean99) {
												Static101.method290();
											}
											for (local88 = 0; local88 < 5; local88++) {
												@Pc(1141) int local1141 = Static28.anIntArray69[local88]++;
											}
											local85 = Static135.method2134();
											local90 = Static29.method604();
											if (local85 > 4500 && local90 > 4500) {
												Static75.anInt1953 = 250;
												Static170.method2890(4000);
												aClass2_Sub2_Sub1_2.method1711(42);
											}
											Static8.anInt455++;
											Static177.anInt3922++;
											if (Static177.anInt3922 > 500) {
												Static177.anInt3922 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x4) == 4) {
													Static85.anInt2160 += Static146.anInt3297;
												}
												if ((local111 & 0x2) == 2) {
													Static157.anInt3496 += Static93.anInt2343;
												}
												if ((local111 & 0x1) == 1) {
													Static170.anInt4068 += Static29.anInt879;
												}
											}
											Static145.anInt3285++;
											if (Static157.anInt3496 < -55) {
												Static93.anInt2343 = 2;
											}
											if (Static145.anInt3285 > 500) {
												Static145.anInt3285 = 0;
												local111 = (int) (Math.random() * 8.0D);
												if ((local111 & 0x1) == 1) {
													Static110.anInt2692 += Static87.anInt2200;
												}
												if ((local111 & 0x2) == 2) {
													Static178.anInt3957 += Static127.anInt3003;
												}
											}
											if (Static110.anInt2692 < -60) {
												Static87.anInt2200 = 2;
											}
											if (Static178.anInt3957 < -20) {
												Static127.anInt3003 = 1;
											}
											if (Static170.anInt4068 < -50) {
												Static29.anInt879 = 2;
											}
											if (Static178.anInt3957 > 10) {
												Static127.anInt3003 = -1;
											}
											if (Static85.anInt2160 < -40) {
												Static146.anInt3297 = 1;
											}
											if (Static85.anInt2160 > 40) {
												Static146.anInt3297 = -1;
											}
											if (Static170.anInt4068 > 50) {
												Static29.anInt879 = -2;
											}
											if (Static110.anInt2692 > 60) {
												Static87.anInt2200 = -2;
											}
											if (Static157.anInt3496 > 55) {
												Static93.anInt2343 = -2;
											}
											if (Static8.anInt455 > 50) {
												aClass2_Sub2_Sub1_2.method1711(82);
											}
											try {
												if (Static155.aClass22_4 != null && aClass2_Sub2_Sub1_2.anInt2385 > 0) {
													Static155.aClass22_4.method965(aClass2_Sub2_Sub1_2.anInt2385, aClass2_Sub2_Sub1_2.aByteArray35);
													Static8.anInt455 = 0;
													aClass2_Sub2_Sub1_2.anInt2385 = 0;
													return;
												}
												return;
											} catch (@Pc(1355) IOException local1355) {
												Static13.method385();
												return;
											}
										}
										local886 = local881.aClass24_9;
										if (local886.anInt1409 < 0) {
											break;
										}
										local899 = Static58.method1035(local886.anInt1382);
									} while (local899 == null || local899.aClass24Array1 == null || local886.anInt1409 >= local899.aClass24Array1.length || local886 != local899.aClass24Array1[local886.anInt1409]);
									Static118.method2854(local881);
								}
							}
							local886 = local881.aClass24_9;
							if (local886.anInt1409 < 0) {
								break;
							}
							local899 = Static58.method1035(local886.anInt1382);
						} while (local899 == null || local899.aClass24Array1 == null || local899.aClass24Array1.length <= local886.anInt1409 || local899.aClass24Array1[local886.anInt1409] != local886);
						Static118.method2854(local881);
					}
				}
				local886 = local881.aClass24_9;
				if (local886.anInt1409 < 0) {
					break;
				}
				local899 = Static58.method1035(local886.anInt1382);
			} while (local899 == null || local899.aClass24Array1 == null || local899.aClass24Array1.length <= local886.anInt1409 || local886 != local899.aClass24Array1[local886.anInt1409]);
			Static118.method2854(local881);
		}
	}
}
