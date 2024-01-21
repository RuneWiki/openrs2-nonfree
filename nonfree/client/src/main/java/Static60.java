import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_Sub1_103;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray109;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1660 = Static169.method2903("Cabbage");

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1661 = Static169.method2903("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[I")
	public static int[] anIntArray610 = new int[128];

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1662 = Static169.method2903("Take");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
	public static int[] anIntArray611 = new int[2048];

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt4358 = 0;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1663 = aClass23_1662;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt4362 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)V")
	public static void method3140(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static49.method916(arg1)) {
			Static1.method96(Static9.aClass60ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method3143() {
		aByteArrayArrayArray109 = null;
		anIntArray610 = null;
		aClass23_1662 = null;
		aClass23_1660 = null;
		aClass23_1663 = null;
		aClass1_Sub1_Sub1_Sub1_Sub1_103 = null;
		aClass23_1661 = null;
		anIntArray611 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method3144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static150.method3022(arg0, arg1, arg0 + arg2, arg1 + arg3);
		Static121.method2142();
		Static104.anInt2667++;
		Static71.method1277(true);
		Static73.method1336(true);
		Static71.method1277(false);
		Static73.method1336(false);
		Static138.method2426();
		Static144.method2507();
		@Pc(46) int local46;
		@Pc(44) int local44;
		if (!Static106.aBoolean133) {
			local44 = Static127.anInt3355 + Static134.anInt3412 & 0x7FF;
			local46 = Static80.anInt2162;
			if (Static65.anInt3662 / 256 > local46) {
				local46 = Static65.anInt3662 / 256;
			}
			if (Static99.aBooleanArray13[4] && Static123.anIntArray428[4] + 128 > local46) {
				local46 = Static123.anIntArray428[4] + 128;
			}
			Static4.method161(local46 * 3 + 600, local46, Static93.anInt2444, Static99.method1680(aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1825, aClass1_Sub1_Sub1_Sub1_Sub1_103.anInt1838, Static85.anInt2267) - 50, Static162.anInt4002, local44);
		}
		if (Static106.aBoolean133) {
			local46 = Static123.method2193();
		} else {
			local46 = Static127.method2274();
		}
		@Pc(104) int local104 = Static163.anInt4011;
		@Pc(106) int local106 = Static46.anInt4326;
		@Pc(108) int local108 = Static29.anInt886;
		local44 = Static162.anInt3999;
		@Pc(112) int local112 = Static166.anInt4090;
		@Pc(156) int local156;
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			if (Static99.aBooleanArray13[local114]) {
				local156 = (int) ((double) -Static20.anIntArray87[local114] + (double) (Static20.anIntArray87[local114] * 2 + 1) * Math.random() + Math.sin((double) Static100.anIntArray321[local114] / 100.0D * (double) Static139.anIntArray471[local114]) * (double) Static123.anIntArray428[local114]);
				if (local114 == 2) {
					Static166.anInt4090 += local156;
				}
				if (local114 == 3) {
					Static29.anInt886 = Static29.anInt886 + local156 & 0x7FF;
				}
				if (local114 == 4) {
					Static46.anInt4326 += local156;
					if (Static46.anInt4326 < 128) {
						Static46.anInt4326 = 128;
					}
					if (Static46.anInt4326 > 383) {
						Static46.anInt4326 = 383;
					}
				}
				if (local114 == 1) {
					Static163.anInt4011 += local156;
				}
				if (local114 == 0) {
					Static162.anInt3999 += local156;
				}
			}
		}
		local156 = Static163.anInt4014;
		@Pc(224) int local224 = Static96.anInt2484;
		if (local156 >= arg0 && arg2 + arg0 > local156 && arg1 <= local224 && local224 < arg3 + arg1) {
			Static175.anInt1621 = 0;
			Static175.aBoolean80 = true;
			Static175.anInt1620 = Static163.anInt4014 - arg0;
			Static175.anInt1624 = Static96.anInt2484 - arg1;
		} else {
			Static175.anInt1621 = 0;
			Static175.aBoolean80 = false;
		}
		Static38.method622();
		Static150.method3024(arg0, arg1, arg2, arg3, 0);
		Static38.method622();
		Static123.aClass80_1.method2674(Static162.anInt3999, Static163.anInt4011, Static166.anInt4090, Static46.anInt4326, Static29.anInt886, local46);
		Static38.method622();
		Static123.aClass80_1.method2694();
		Static132.method2792(arg3, arg2, arg1, arg0);
		Static113.method2006(arg0, arg1);
		((Class2) Static121.anInterface1_1).method117(Static58.anInt1635);
		Static32.method570(arg3, arg0, arg2, arg1);
		Static163.anInt4011 = local104;
		Static166.anInt4090 = local112;
		Static29.anInt886 = local108;
		Static46.anInt4326 = local106;
		Static162.anInt3999 = local44;
		if (Static137.aBoolean176 && Static169.method2902() == 0) {
			Static137.aBoolean176 = false;
		}
		if (Static137.aBoolean176) {
			Static150.method3024(arg0, arg1, arg2, arg3, 0);
			Static5.method3152(false, Static177.aClass23_1604);
		}
		if (!Static137.aBoolean176 && !Static164.aBoolean201 && arg0 <= local156 && arg0 + arg2 > local156 && local224 >= arg1 && local224 < arg3 + arg1) {
			Static34.method582(arg0, local156, arg1, local224);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)Lclient!ed;")
	public static Class23 method3145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static162.aClass23_1523;
		} else if (local7 < -6) {
			return Static23.aClass23_252;
		} else if (local7 < -3) {
			return Static75.aClass23_737;
		} else if (local7 < 0) {
			return Static13.aClass23_169;
		} else if (local7 > 9) {
			return Static154.aClass23_1451;
		} else if (local7 > 6) {
			return Static101.aClass23_1005;
		} else if (local7 > 3) {
			return Static26.aClass23_289;
		} else if (local7 > 0) {
			return Static4.aClass23_108;
		} else {
			return Static15.aClass23_180;
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method3146() {
		try {
			if (Static15.anInt477 == 0) {
				if (Static43.aClass44_4 != null) {
					Static43.aClass44_4.method1417();
					Static43.aClass44_4 = null;
				}
				Static15.anInt477 = 1;
				Static37.aBoolean47 = false;
				Static119.aClass63_4 = null;
				Static68.anInt1788 = 0;
			}
			if (Static15.anInt477 == 1) {
				if (Static119.aClass63_4 == null) {
					Static119.aClass63_4 = Static29.aClass74_2.method2478(Static79.anInt2148, Static27.aString1);
				}
				if (Static119.aClass63_4.anInt3324 == 2) {
					throw new IOException();
				}
				if (Static119.aClass63_4.anInt3324 == 1) {
					Static43.aClass44_4 = new Class44((Socket) Static119.aClass63_4.anObject3, Static29.aClass74_2);
					Static119.aClass63_4 = null;
					Static15.anInt477 = 2;
				}
			}
			if (Static15.anInt477 == 2) {
				@Pc(77) long local77 = Static8.aLong10 = Static61.aClass23_612.method643();
				@Pc(84) int local84 = (int) (local77 >> 16 & 0x1FL);
				Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
				Static25.aClass1_Sub8_Sub1_1.method862(14);
				Static25.aClass1_Sub8_Sub1_1.method862(local84);
				Static43.aClass44_4.method1419(Static25.aClass1_Sub8_Sub1_1.aByteArray12, 2);
				Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
				Static15.anInt477 = 3;
			}
			@Pc(126) int local126;
			if (Static15.anInt477 == 3) {
				if (Static74.aClass40_1 != null) {
					Static74.aClass40_1.method2522();
				}
				if (Static149.aClass40_2 != null) {
					Static149.aClass40_2.method2522();
				}
				local126 = Static43.aClass44_4.method1420();
				if (Static74.aClass40_1 != null) {
					Static74.aClass40_1.method2522();
				}
				if (Static149.aClass40_2 != null) {
					Static149.aClass40_2.method2522();
				}
				if (local126 != 0) {
					Static149.method2568(local126);
					return;
				}
				Static15.anInt477 = 4;
				Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
			}
			if (Static15.anInt477 == 4) {
				if (Static35.aClass1_Sub8_Sub1_2.anInt1357 < 8) {
					local126 = Static43.aClass44_4.method1418();
					if (8 - Static35.aClass1_Sub8_Sub1_2.anInt1357 < local126) {
						local126 = 8 - Static35.aClass1_Sub8_Sub1_2.anInt1357;
					}
					if (local126 > 0) {
						Static43.aClass44_4.method1421(local126, Static35.aClass1_Sub8_Sub1_2.anInt1357, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
						Static35.aClass1_Sub8_Sub1_2.anInt1357 += local126;
					}
				}
				if (Static35.aClass1_Sub8_Sub1_2.anInt1357 == 8) {
					Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
					Static157.aLong121 = Static35.aClass1_Sub8_Sub1_2.method884();
					Static15.anInt477 = 5;
				}
			}
			if (Static15.anInt477 == 5) {
				Static25.aClass1_Sub8_Sub1_1.anInt1357 = 0;
				@Pc(217) int[] local217 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static157.aLong121 >> 32), (int) Static157.aLong121 };
				Static25.aClass1_Sub8_Sub1_1.method862(10);
				Static25.aClass1_Sub8_Sub1_1.method904(local217[0]);
				Static25.aClass1_Sub8_Sub1_1.method904(local217[1]);
				Static25.aClass1_Sub8_Sub1_1.method904(local217[2]);
				Static25.aClass1_Sub8_Sub1_1.method904(local217[3]);
				Static25.aClass1_Sub8_Sub1_1.method873(Static61.aClass23_612.method643());
				Static25.aClass1_Sub8_Sub1_1.method858(Static61.aClass23_608);
				Static25.aClass1_Sub8_Sub1_1.method876(Static180.aBigInteger2, Static141.aBigInteger1);
				Static161.aClass1_Sub8_Sub1_3.anInt1357 = 0;
				if (Static156.anInt3821 == 40) {
					Static161.aClass1_Sub8_Sub1_3.method862(18);
				} else {
					Static161.aClass1_Sub8_Sub1_3.method862(16);
				}
				Static161.aClass1_Sub8_Sub1_3.method862(Static25.aClass1_Sub8_Sub1_1.anInt1357 + 93);
				Static161.aClass1_Sub8_Sub1_3.method904(478);
				Static161.aClass1_Sub8_Sub1_3.method862(Static8.aBoolean17 ? 1 : 0);
				Static106.method1841(Static161.aClass1_Sub8_Sub1_3);
				Static161.aClass1_Sub8_Sub1_3.method904(Static33.aClass30_Sub1_3.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static140.aClass30_Sub1_15.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static129.aClass30_Sub1_13.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static29.aClass30_Sub1_2.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static161.aClass30_Sub1_16.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static4.aClass30_Sub1_1.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static167.aClass30_Sub1_18.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static99.aClass30_Sub1_9.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static140.aClass30_Sub1_14.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static42.aClass30_Sub1_4.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static52.aClass30_Sub1_6.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static72.aClass30_Sub1_7.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static115.aClass30_Sub1_10.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static162.aClass30_Sub1_17.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static85.aClass30_Sub1_8.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method904(Static120.aClass30_Sub1_11.anInt1954);
				Static161.aClass1_Sub8_Sub1_3.method865(Static25.aClass1_Sub8_Sub1_1.aByteArray12, Static25.aClass1_Sub8_Sub1_1.anInt1357);
				Static43.aClass44_4.method1419(Static161.aClass1_Sub8_Sub1_3.aByteArray12, Static161.aClass1_Sub8_Sub1_3.anInt1357);
				Static25.aClass1_Sub8_Sub1_1.method910(local217);
				for (@Pc(440) int local440 = 0; local440 < 4; local440++) {
					local217[local440] += 50;
				}
				Static35.aClass1_Sub8_Sub1_2.method910(local217);
				Static15.anInt477 = 6;
			}
			if (Static15.anInt477 == 6 && Static43.aClass44_4.method1418() > 0) {
				local126 = Static43.aClass44_4.method1420();
				if (local126 == 21 && Static156.anInt3821 == 20) {
					Static15.anInt477 = 7;
				} else if (local126 == 2) {
					Static15.anInt477 = 9;
				} else if (local126 == 15 && Static156.anInt3821 == 40) {
					Static112.method1986();
					return;
				} else if (local126 == 23 && Static9.anInt378 < 1) {
					Static9.anInt378++;
					Static15.anInt477 = 0;
				} else {
					Static149.method2568(local126);
					return;
				}
			}
			if (Static15.anInt477 == 7 && Static43.aClass44_4.method1418() > 0) {
				Static119.anInt3100 = (Static43.aClass44_4.method1420() + 3) * 60;
				Static15.anInt477 = 8;
			}
			if (Static15.anInt477 == 8) {
				Static68.anInt1788 = 0;
				Static76.method1369(Static149.method2571(new Class23[] { Static27.method498(Static119.anInt3100 / 60), Static132.aClass23_1515 }), Static13.aClass23_172, Static101.aClass23_1002);
				if (--Static119.anInt3100 <= 0) {
					Static15.anInt477 = 0;
				}
			} else {
				if (Static15.anInt477 == 9 && Static43.aClass44_4.method1418() >= 9) {
					Static129.anInt3382 = Static43.aClass44_4.method1420();
					Static153.anInt3776 = Static43.aClass44_4.method1420();
					Static52.aBoolean99 = Static43.aClass44_4.method1420() == 1;
					Static72.anInt1984 = Static43.aClass44_4.method1420();
					Static72.anInt1984 <<= 0x8;
					Static72.anInt1984 += Static43.aClass44_4.method1420();
					Static61.anInt1648 = Static43.aClass44_4.method1420();
					Static43.aClass44_4.method1421(1, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
					Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
					Static15.anInt475 = Static35.aClass1_Sub8_Sub1_2.method917();
					Static43.aClass44_4.method1421(2, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
					Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
					Static103.anInt2645 = Static35.aClass1_Sub8_Sub1_2.method878();
					Static15.anInt477 = 10;
				}
				if (Static15.anInt477 != 10) {
					Static68.anInt1788++;
					if (Static68.anInt1788 > 2000) {
						if (Static9.anInt378 < 1) {
							if (Static79.anInt2148 == Static48.anInt1280) {
								Static79.anInt2148 = Static132.anInt3971;
							} else {
								Static79.anInt2148 = Static48.anInt1280;
							}
							Static15.anInt477 = 0;
							Static9.anInt378++;
						} else {
							Static149.method2568(-3);
						}
					}
				} else if (Static43.aClass44_4.method1418() >= Static103.anInt2645) {
					Static35.aClass1_Sub8_Sub1_2.anInt1357 = 0;
					Static43.aClass44_4.method1421(Static103.anInt2645, 0, Static35.aClass1_Sub8_Sub1_2.aByteArray12);
					Static129.method2296();
					Static46.anInt4332 = -1;
					Static69.method1227(false);
					Static15.anInt475 = -1;
				}
			}
		} catch (@Pc(722) IOException local722) {
			if (Static9.anInt378 < 1) {
				Static15.anInt477 = 0;
				Static9.anInt378++;
				if (Static79.anInt2148 == Static48.anInt1280) {
					Static79.anInt2148 = Static132.anInt3971;
				} else {
					Static79.anInt2148 = Static48.anInt1280;
				}
			} else {
				Static149.method2568(-2);
			}
		}
	}
}
