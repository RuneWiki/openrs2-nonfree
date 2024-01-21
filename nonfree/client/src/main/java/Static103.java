import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
	public static int anInt2582;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1416 = Static33.method650("Stufe)2");

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static int[] anIntArray222 = new int[1000];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1417 = Static33.method650("Menge eingeben:");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
	public static long aLong81 = 0L;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public static int anInt2583 = 0;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1418 = Static33.method650("null");

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1419 = Static33.method650("");

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "[J")
	public static long[] aLongArray29 = new long[32];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	private static void method1731() {
		for (@Pc(7) int local7 = 0; local7 < Static106.anInt2625; local7++) {
			@Pc(13) int local13 = Static12.anIntArray26[local7]--;
			if (Static12.anIntArray26[local7] >= -10) {
				@Pc(86) Class73 local86 = Static23.aClass73Array1[local7];
				if (local86 == null) {
					local86 = Static133.method1882(Static12.aClass44_Sub1_15, Static53.anIntArray106[local7]);
					if (local86 == null) {
						continue;
					}
					Static12.anIntArray26[local7] += local86.method1881();
					Static23.aClass73Array1[local7] = local86;
				}
				if (Static12.anIntArray26[local7] < 0) {
					@Pc(123) int local123;
					if (Static113.anIntArray288[local7] == 0) {
						local123 = Static28.anInt840;
					} else {
						@Pc(133) int local133 = Static113.anIntArray288[local7] >> 16 & 0xFF;
						@Pc(141) int local141 = (Static113.anIntArray288[local7] & 0xFF) * 128;
						@Pc(149) int local149 = Static113.anIntArray288[local7] >> 8 & 0xFF;
						@Pc(159) int local159 = local133 * 128 + 64 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187;
						@Pc(169) int local169 = local149 * 128 + 64 - Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196;
						if (local159 < 0) {
							local159 = -local159;
						}
						if (local169 < 0) {
							local169 = -local169;
						}
						@Pc(188) int local188 = local169 + local159 - 128;
						if (local188 > local141) {
							Static12.anIntArray26[local7] = -100;
							continue;
						}
						if (local188 < 0) {
							local188 = 0;
						}
						local123 = (local141 - local188) * Static126.anInt3091 / local141;
					}
					if (local123 > 0) {
						@Pc(220) Class3_Sub4_Sub1 local220 = local86.method1879().method1678(Static42.aClass13_1);
						@Pc(225) Class3_Sub3_Sub3 local225 = Static132.method1583(local220, local123);
						local225.method1564(Static40.anIntArray69[local7] - 1);
						Static68.aClass3_Sub3_Sub4_2.method2068(local225);
					}
					Static12.anIntArray26[local7] = -100;
				}
			} else {
				Static106.anInt2625--;
				for (@Pc(29) int local29 = local7; local29 < Static106.anInt2625; local29++) {
					Static53.anIntArray106[local29] = Static53.anIntArray106[local29 + 1];
					Static23.aClass73Array1[local29] = Static23.aClass73Array1[local29 + 1];
					Static40.anIntArray69[local29] = Static40.anIntArray69[local29 + 1];
					Static12.anIntArray26[local29] = Static12.anIntArray26[local29 + 1];
					Static113.anIntArray288[local29] = Static113.anIntArray288[local29 + 1];
				}
				local7--;
			}
		}
		if (Static7.aBoolean18 && !method1733()) {
			if (Static24.anInt703 != 0 && Static69.anInt1913 != -1) {
				Static81.method1430(Static69.anInt1913, 0, Static24.anInt703, Static100.aClass44_Sub1_65);
			}
			Static7.aBoolean18 = false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1732() {
		if (Static61.anInt1799 > 0) {
			Static61.anInt1799--;
		}
		if (Static106.anInt2633 > 1) {
			Static106.anInt2633--;
		}
		if (Static17.aBoolean20) {
			Static17.aBoolean20 = false;
			Static97.method1706();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static56.method1064(); local29++) {
		}
		if (Static44.anInt1156 != 30 && Static44.anInt1156 != 35) {
			return;
		}
		if (Static40.aBoolean52 && Static44.anInt1156 == 30) {
			Static31.anInt928 = 0;
			Static36.anInt1014 = 0;
			while (Static48.method883()) {
			}
			for (@Pc(68) int local68 = 0; local68 < Static71.aBooleanArray8.length; local68++) {
				Static71.aBooleanArray8[local68] = false;
			}
		}
		Static82.method1471(Static111.aClass3_Sub2_Sub1_4);
		@Pc(90) Object local90 = Static17.aClass36_1.anObject1;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(144) int local144;
		synchronized (Static17.aClass36_1.anObject1) {
			if (!Static27.aBoolean42) {
				Static17.aClass36_1.anInt1503 = 0;
			} else if (Static36.anInt1014 != 0 || Static17.aClass36_1.anInt1503 >= 40) {
				Static111.aClass3_Sub2_Sub1_4.method325(64);
				Static111.aClass3_Sub2_Sub1_4.method303(0);
				local120 = Static111.aClass3_Sub2_Sub1_4.anInt413;
				local122 = 0;
				@Pc(138) int local138;
				for (local124 = 0; local124 < Static17.aClass36_1.anInt1503 && Static111.aClass3_Sub2_Sub1_4.anInt413 - local120 < 240; local124++) {
					local138 = Static17.aClass36_1.anIntArray104[local124];
					local122++;
					local144 = Static17.aClass36_1.anIntArray105[local124];
					if (local144 < 0) {
						local144 = 0;
					} else if (local144 > 764) {
						local144 = 764;
					}
					if (local138 < 0) {
						local138 = 0;
					} else if (local138 > 502) {
						local138 = 502;
					}
					@Pc(177) int local177 = local138 * 765 + local144;
					if (Static17.aClass36_1.anIntArray104[local124] == -1 && Static17.aClass36_1.anIntArray105[local124] == -1) {
						local138 = -1;
						local177 = 524287;
						local144 = -1;
					}
					if (local144 != Static32.anInt953 || Static8.anInt208 != local138) {
						@Pc(220) int local220 = local144 - Static32.anInt953;
						Static32.anInt953 = local144;
						@Pc(227) int local227 = local138 - Static8.anInt208;
						Static8.anInt208 = local138;
						if (Static104.anInt2594 < 8 && local220 >= -32 && local220 <= 31 && local227 >= -32 && local227 <= 31) {
							local227 += 32;
							local220 += 32;
							Static111.aClass3_Sub2_Sub1_4.method289((local220 << 6) + (Static104.anInt2594 << 12) + local227);
							Static104.anInt2594 = 0;
						} else if (Static104.anInt2594 < 8) {
							Static111.aClass3_Sub2_Sub1_4.method282((Static104.anInt2594 << 19) + local177 + 8388608);
							Static104.anInt2594 = 0;
						} else {
							Static111.aClass3_Sub2_Sub1_4.method280((Static104.anInt2594 << 19) + local177 - 1073741824);
							Static104.anInt2594 = 0;
						}
					} else if (Static104.anInt2594 < 2047) {
						Static104.anInt2594++;
					}
				}
				Static111.aClass3_Sub2_Sub1_4.method275(Static111.aClass3_Sub2_Sub1_4.anInt413 - local120);
				if (local122 >= Static17.aClass36_1.anInt1503) {
					Static17.aClass36_1.anInt1503 = 0;
				} else {
					Static17.aClass36_1.anInt1503 -= local122;
					for (local138 = 0; local138 < Static17.aClass36_1.anInt1503; local138++) {
						Static17.aClass36_1.anIntArray105[local138] = Static17.aClass36_1.anIntArray105[local138 + local122];
						Static17.aClass36_1.anIntArray104[local138] = Static17.aClass36_1.anIntArray104[local138 + local122];
					}
				}
			}
		}
		if (Static36.anInt1014 != 0) {
			@Pc(380) long local380 = (Static44.aLong32 - Static75.aLong55) / 50L;
			local120 = Static71.anInt1970;
			Static75.aLong55 = Static44.aLong32;
			local122 = Static127.anInt3209;
			if (local122 < 0) {
				local122 = 0;
			} else if (local122 > 764) {
				local122 = 764;
			}
			if (local380 > 4095L) {
				local380 = 4095L;
			}
			if (local120 < 0) {
				local120 = 0;
			} else if (local120 > 502) {
				local120 = 502;
			}
			local124 = local122 + local120 * 765;
			local144 = (int) local380;
			@Pc(435) byte local435 = 0;
			if (Static36.anInt1014 == 2) {
				local435 = 1;
			}
			Static111.aClass3_Sub2_Sub1_4.method325(163);
			Static111.aClass3_Sub2_Sub1_4.method309(local124 + (local144 << 20) + (local435 << 19));
		}
		if (Static71.aBooleanArray8[96] || Static71.aBooleanArray8[97] || Static71.aBooleanArray8[98] || Static71.aBooleanArray8[99]) {
			Static17.aBoolean21 = true;
		}
		if (Static83.anInt2254 > 0) {
			Static83.anInt2254--;
		}
		if (Static17.aBoolean21 && Static83.anInt2254 <= 0) {
			Static83.anInt2254 = 20;
			Static17.aBoolean21 = false;
			Static111.aClass3_Sub2_Sub1_4.method325(147);
			Static111.aClass3_Sub2_Sub1_4.method285(Static22.anInt686);
			Static111.aClass3_Sub2_Sub1_4.method290(Static106.anInt2632);
		}
		if (Static82.aBoolean101 && !Static98.aBoolean119) {
			Static98.aBoolean119 = true;
			Static111.aClass3_Sub2_Sub1_4.method325(224);
			Static111.aClass3_Sub2_Sub1_4.method303(1);
		}
		if (!Static82.aBoolean101 && Static98.aBoolean119) {
			Static98.aBoolean119 = false;
			Static111.aClass3_Sub2_Sub1_4.method325(224);
			Static111.aClass3_Sub2_Sub1_4.method303(0);
		}
		Static127.method2049();
		if (Static44.anInt1156 != 30 && Static44.anInt1156 != 35) {
			return;
		}
		Static83.method1512();
		method1731();
		Static8.anInt210++;
		if (Static8.anInt210 > 750) {
			Static97.method1706();
			return;
		}
		Static83.method1510();
		Static43.method799();
		Static52.method994();
		if (Static69.anInt1924 != 0) {
			Static24.anInt705 += 20;
			if (Static24.anInt705 >= 400) {
				Static69.anInt1924 = 0;
			}
		}
		if (Static1.anInt9 != 0) {
			Static4.anInt60++;
			if (Static4.anInt60 >= 15) {
				if (Static1.anInt9 == 3) {
					Static12.aBoolean17 = true;
				}
				if (Static1.anInt9 == 2) {
					Static115.aBoolean157 = true;
				}
				Static1.anInt9 = 0;
			}
		}
		Static44.anInt1163++;
		if (Static31.anInt920 != 0) {
			if (Static97.anInt2548 + 5 < Static36.anInt1021 || Static36.anInt1021 < Static97.anInt2548 - 5 || Static102.anInt3222 > Static94.anInt2471 + 5 || Static94.anInt2471 - 5 > Static102.anInt3222) {
				Static2.aBoolean3 = true;
			}
			Static17.anInt473++;
			if (Static31.anInt928 == 0) {
				if (Static31.anInt920 == 3) {
					Static12.aBoolean17 = true;
				}
				if (Static31.anInt920 == 2) {
					Static115.aBoolean157 = true;
				}
				Static31.anInt920 = 0;
				if (Static2.aBoolean3 && Static17.anInt473 >= 5) {
					Static86.anInt2356 = -1;
					Static46.method1519();
					if (Static86.anInt2356 == Static100.anInt2570 && Static46.anInt2263 != Static110.anInt2762) {
						@Pc(713) Class3_Sub1_Sub16 local713 = Static96.method1688(Static100.anInt2570);
						@Pc(715) byte local715 = 0;
						if (Static105.anInt2613 == 1 && local713.anInt2811 == 206) {
							local715 = 1;
						}
						if (local713.anIntArray267[Static46.anInt2263] <= 0) {
							local715 = 0;
						}
						if (Static97.method1705(Static34.method652(local713))) {
							local120 = Static110.anInt2762;
							local122 = Static46.anInt2263;
							local713.anIntArray267[local122] = local713.anIntArray267[local120];
							local713.anIntArray265[local122] = local713.anIntArray265[local120];
							local713.anIntArray267[local120] = -1;
							local713.anIntArray265[local120] = 0;
						} else if (local715 == 1) {
							local120 = Static110.anInt2762;
							local122 = Static46.anInt2263;
							while (local122 != local120) {
								if (local120 > local122) {
									local713.method1855(local120, local120 - 1);
									local120--;
								} else if (local122 > local120) {
									local713.method1855(local120, local120 + 1);
									local120++;
								}
							}
						} else {
							local713.method1855(Static110.anInt2762, Static46.anInt2263);
						}
						Static111.aClass3_Sub2_Sub1_4.method325(82);
						Static111.aClass3_Sub2_Sub1_4.method289(Static46.anInt2263);
						Static111.aClass3_Sub2_Sub1_4.method292(local715);
						Static111.aClass3_Sub2_Sub1_4.method262(Static110.anInt2762);
						Static111.aClass3_Sub2_Sub1_4.method280(Static100.anInt2570);
					}
				} else if ((Static92.anInt2426 == 1 || Static81.method1452(Static66.anInt559 - 1)) && Static66.anInt559 > 2) {
					Static25.method534();
				} else if (Static66.anInt559 > 0) {
					Static18.method354(Static66.anInt559 - 1);
				}
				Static36.anInt1014 = 0;
				Static4.anInt60 = 10;
			}
		}
		if (Static63.anInt1818 == -1) {
			if (Static57.anInt1607 != -1) {
				Static94.method1666(Static57.anInt1607, 4, 338, 516, 0, 4, 34);
			} else if (Static109.anInt1693 != -1) {
				Static94.method1666(Static109.anInt1693, 4, 338, 516, 0, 4, 34);
			}
			if (Static111.anInt2804 != -1) {
				Static94.method1666(Static111.anInt2804, 205, 466, 743, 1, 553, 34);
			} else if (Static44.anIntArray79[Static27.anInt798] != -1) {
				Static94.method1666(Static44.anIntArray79[Static27.anInt798], 205, 466, 743, 1, 553, 34);
			}
			if (Static57.anInt1609 != -1) {
				Static94.method1666(Static57.anInt1609, 357, 453, 496, 2, 17, 34);
			} else if (Static69.anInt1918 != -1) {
				Static94.method1666(Static69.anInt1918, 357, 453, 496, 2, 17, 34);
			}
		} else {
			Static94.method1666(Static63.anInt1818, 0, 503, 765, 3, 0, 34);
			if (Static88.anInt2370 != -1) {
				Static94.method1666(Static88.anInt2370, 0, 503, 765, 3, 0, 34);
			}
		}
		if (Static63.anInt1818 == -1) {
			if (Static57.anInt1607 != -1) {
				Static94.method1666(Static57.anInt1607, 4, 338, 516, 0, 4, -35);
			} else if (Static109.anInt1693 != -1) {
				Static94.method1666(Static109.anInt1693, 4, 338, 516, 0, 4, -35);
			}
			if (Static111.anInt2804 != -1) {
				Static94.method1666(Static111.anInt2804, 205, 466, 743, 1, 553, -35);
			} else if (Static44.anIntArray79[Static27.anInt798] != -1) {
				Static94.method1666(Static44.anIntArray79[Static27.anInt798], 205, 466, 743, 1, 553, -35);
			}
			if (Static57.anInt1609 != -1) {
				Static94.method1666(Static57.anInt1609, 357, 453, 496, 2, 17, -35);
			} else if (Static69.anInt1918 != -1) {
				Static94.method1666(Static69.anInt1918, 357, 453, 496, 2, 17, -35);
			}
		} else {
			Static94.method1666(Static63.anInt1818, 0, 503, 765, 3, 0, -35);
			if (Static88.anInt2370 != -1) {
				Static94.method1666(Static88.anInt2370, 0, 503, 765, 3, 0, -35);
			}
		}
		Static106.method1763();
		@Pc(1157) int local1157;
		if (Static20.anInt601 != -1) {
			local1157 = Static20.anInt601;
			local120 = Static20.anInt595;
			@Pc(1179) boolean local1179 = Static26.method538(0, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray332[0], 0, 0, true, local120, local1157, 0, Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anIntArray336[0], 0);
			if (local1179) {
				Static9.anInt224 = Static71.anInt1970;
				Static91.anInt2390 = Static127.anInt3209;
				Static24.anInt705 = 0;
				Static69.anInt1924 = 1;
			}
			Static20.anInt601 = -1;
		}
		if (Static36.anInt1014 == 1 && Static34.aClass56_531 != null) {
			Static12.aBoolean17 = true;
			Static36.anInt1014 = 0;
			Static34.aClass56_531 = null;
		}
		Static113.method1868();
		if (Static63.anInt1818 == -1) {
			Static14.method250();
			Static70.method1282();
			Static109.method1158();
		}
		if (Static31.anInt928 == 1 || Static36.anInt1014 == 1) {
			Static49.anInt1493++;
		}
		if (Static53.anInt1525 == -1 && Static102.anInt3219 == -1 && Static77.anInt3140 == -1) {
			if (Static63.anInt1817 > 0) {
				Static63.anInt1817--;
			}
		} else if (Static60.anInt1738 > Static63.anInt1817) {
			Static63.anInt1817++;
			if (Static60.anInt1738 == Static63.anInt1817) {
				if (Static53.anInt1525 != -1) {
					Static12.aBoolean17 = true;
				}
				if (Static102.anInt3219 != -1) {
					Static115.aBoolean157 = true;
				}
			}
		}
		Static34.method653();
		if (Static27.aBoolean43) {
			Static40.method752();
		}
		for (local1157 = 0; local1157 < 5; local1157++) {
			@Pc(1280) int local1280 = Static84.anIntArray192[local1157]++;
		}
		Static11.method237();
		local120 = Static61.method1202();
		local122 = Static47.method878();
		if (local120 > 4500 && local122 > 4500) {
			Static61.anInt1799 = 250;
			Static18.method350(4000);
			Static111.aClass3_Sub2_Sub1_4.method325(52);
		}
		Static81.anInt2156++;
		if (Static81.anInt2156 > 500) {
			Static81.anInt2156 = 0;
			local124 = (int) (Math.random() * 8.0D);
			if ((local124 & 0x2) == 2) {
				Static15.anInt434 += Static102.anInt3216;
			}
			if ((local124 & 0x4) == 4) {
				Static92.anInt2425 += Static5.anInt64;
			}
			if ((local124 & 0x1) == 1) {
				anInt2583 += Static27.anInt812;
			}
		}
		if (Static15.anInt434 < -55) {
			Static102.anInt3216 = 2;
		}
		if (Static92.anInt2425 < -40) {
			Static5.anInt64 = 1;
		}
		if (Static15.anInt434 > 55) {
			Static102.anInt3216 = -2;
		}
		Static43.anInt1146++;
		if (Static43.anInt1146 > 500) {
			Static43.anInt1146 = 0;
			local124 = (int) (Math.random() * 8.0D);
			if ((local124 & 0x2) == 2) {
				Static62.anInt1804 += Static102.anInt3220;
			}
			if ((local124 & 0x1) == 1) {
				Static18.anInt493 += Static57.anInt1605;
			}
		}
		Static1.anInt3++;
		if (Static62.anInt1804 < -20) {
			Static102.anInt3220 = 1;
		}
		if (Static92.anInt2425 > 40) {
			Static5.anInt64 = -1;
		}
		if (Static18.anInt493 < -60) {
			Static57.anInt1605 = 2;
		}
		if (anInt2583 < -50) {
			Static27.anInt812 = 2;
		}
		if (anInt2583 > 50) {
			Static27.anInt812 = -2;
		}
		if (Static62.anInt1804 > 10) {
			Static102.anInt3220 = -1;
		}
		if (Static18.anInt493 > 60) {
			Static57.anInt1605 = -2;
		}
		if (Static1.anInt3 > 50) {
			Static111.aClass3_Sub2_Sub1_4.method325(74);
		}
		try {
			if (Static117.aClass17_4 != null && Static111.aClass3_Sub2_Sub1_4.anInt413 > 0) {
				Static117.aClass17_4.method493(Static111.aClass3_Sub2_Sub1_4.aByteArray7, Static111.aClass3_Sub2_Sub1_4.anInt413);
				Static111.aClass3_Sub2_Sub1_4.anInt413 = 0;
				Static1.anInt3 = 0;
			}
		} catch (@Pc(1498) IOException local1498) {
			Static97.method1706();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Z")
	private static boolean method1733() {
		return Static57.anInt1621 == 0 ? Static48.aClass3_Sub3_Sub2_2.method1232() : true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method1736() {
		aLongArray29 = null;
		aClass56_1417 = null;
		aClass56_1416 = null;
		aClass56_1419 = null;
		aByteArrayArray9 = null;
		aClass56_1418 = null;
		anIntArray222 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!tb;)V")
	public static void method1737(@OriginalArg(1) Class44 arg0) {
		Static79.aClass44_47 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZII)V")
	public static void method1739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
			for (local15 = 0; local15 < 8; local15++) {
				Static22.anIntArrayArrayArray4[arg1][local11 + arg0][arg2 + local15] = 0;
			}
		}
		if (arg0 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static22.anIntArrayArrayArray4[arg1][arg0][local15 + arg2] = Static22.anIntArrayArrayArray4[arg1][arg0 - 1][local15 + arg2];
			}
		}
		if (arg2 > 0) {
			for (local15 = 1; local15 < 8; local15++) {
				Static22.anIntArrayArrayArray4[arg1][local15 + arg0][arg2] = Static22.anIntArrayArrayArray4[arg1][arg0 + local15][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static22.anIntArrayArrayArray4[arg1][arg0 - 1][arg2] != 0) {
			Static22.anIntArrayArrayArray4[arg1][arg0][arg2] = Static22.anIntArrayArrayArray4[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static22.anIntArrayArrayArray4[arg1][arg0][arg2 - 1] != 0) {
			Static22.anIntArrayArrayArray4[arg1][arg0][arg2] = Static22.anIntArrayArrayArray4[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static22.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static22.anIntArrayArrayArray4[arg1][arg0][arg2] = Static22.anIntArrayArrayArray4[arg1][arg0 - 1][arg2 - 1];
		}
	}
}
