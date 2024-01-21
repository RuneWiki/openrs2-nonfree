import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!hb", name = "W", descriptor = "Lclient!rf;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
	public static int[] anIntArray123 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public static int anInt1160 = 0;

	@OriginalMember(owner = "client!hb", name = "ob", descriptor = "Lclient!ja;")
	private static Class39 aClass39_699 = Static28.method504("Loading sprites )2 ");

	@OriginalMember(owner = "client!hb", name = "ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_689 = aClass39_699;

	@OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_695 = Static28.method504("skill)2");

	@OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_690 = aClass39_695;

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_691 = Static28.method504("Passwort: ");

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "Lclient!ja;")
	private static Class39 aClass39_692 = Static28.method504("Drop");

	@OriginalMember(owner = "client!hb", name = "hb", descriptor = "Lclient!ja;")
	private static Class39 aClass39_696 = Static28.method504(" is already on your friend list");

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_693 = aClass39_696;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_694 = Static28.method504("Benutzen");

	@OriginalMember(owner = "client!hb", name = "jb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_697 = aClass39_692;

	@OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_698 = Static28.method504("<col=ff3000>");

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ja;Lclient!ja;Lclient!pd;I)[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] method761(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class20 arg2) {
		@Pc(16) int local16 = arg2.method484(arg1);
		@Pc(22) int local22 = arg2.method475(arg0, local16);
		return Static129.method2184(local22, arg2, local16);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method762() {
		aClass39_698 = null;
		aClass39_695 = null;
		aClass39_697 = null;
		aClass39_690 = null;
		anIntArray123 = null;
		aClass39_694 = null;
		aClass39_696 = null;
		aClass39_689 = null;
		aClass69_2 = null;
		aClass39_692 = null;
		aClass39_699 = null;
		aClass39_693 = null;
		aClass39_691 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!he;)Lclient!he;")
	public static Class4_Sub5 method763(@OriginalArg(1) Class4_Sub5 arg0) {
		@Pc(3) Class4_Sub5 local3 = Static78.method1300(arg0);
		if (local3 == null) {
			local3 = arg0.aClass4_Sub5_27;
		}
		return local3;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!pd;)V")
	public static void method764(@OriginalArg(1) Class20 arg0) {
		Static71.aClass20_35 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V")
	public static void method765(@OriginalArg(0) boolean arg0) {
		if (Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 >> 7 == Static125.anInt3127 && Static22.anInt642 == Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 >> 7) {
			Static125.anInt3127 = 0;
		}
		@Pc(29) int local29 = Static122.anInt3021;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(41) Class4_Sub2_Sub1_Sub1_Sub1 local41;
			@Pc(43) int local43;
			if (arg0) {
				local41 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1;
				local43 = 33538048;
			} else {
				local43 = Static116.anIntArray312[local35] << 14;
				local41 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[Static116.anIntArray312[local35]];
			}
			if (local41 != null && local41.method1915()) {
				@Pc(68) int local68 = local41.anInt2643 >> 7;
				local41.aBoolean119 = false;
				if ((Static123.aBoolean150 && Static122.anInt3021 > 50 || Static122.anInt3021 > 200) && !arg0 && local41.anInt2691 == local41.anInt2679) {
					local41.aBoolean119 = true;
				}
				@Pc(100) int local100 = local41.anInt2641 >> 7;
				if (local68 >= 0 && local68 < 104 && local100 >= 0 && local100 < 104) {
					if (local41.aClass4_Sub2_Sub1_Sub6_1 == null || local41.anInt2450 > Static71.anInt1738 || Static71.anInt1738 >= local41.anInt2435) {
						if ((local41.anInt2643 & 0x7F) == 64 && (local41.anInt2641 & 0x7F) == 64) {
							if (Static98.anInt1019 == Static88.anIntArrayArray16[local68][local100]) {
								continue;
							}
							Static88.anIntArrayArray16[local68][local100] = Static98.anInt1019;
						}
						local41.anInt2438 = Static94.method1708(local41.anInt2643, local41.anInt2641, Static131.anInt3202);
						Static101.aClass43_1.method1105(Static131.anInt3202, local41.anInt2643, local41.anInt2641, local41.anInt2438, 60, local41, local41.anInt2670, local43, local41.aBoolean134);
					} else {
						local41.aBoolean119 = false;
						local41.anInt2438 = Static94.method1708(local41.anInt2643, local41.anInt2641, Static131.anInt3202);
						Static101.aClass43_1.method1084(Static131.anInt3202, local41.anInt2643, local41.anInt2641, local41.anInt2438, local41, local41.anInt2670, local43, local41.anInt2436, local41.anInt2453, local41.anInt2455, local41.anInt2430);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
	public static void method766() {
		try {
			if (Static18.anInt433 == 0) {
				if (Static49.aClass69_3 != null) {
					Static49.aClass69_3.method1859();
					Static49.aClass69_3 = null;
				}
				Static46.aBoolean53 = false;
				Static116.aClass16_9 = null;
				Static18.anInt433 = 1;
				Static83.anInt2075 = 0;
			}
			if (Static18.anInt433 == 1) {
				if (Static116.aClass16_9 == null) {
					Static116.aClass16_9 = Static126.aClass29_63.method605(Static35.aString1, Static123.anInt3044);
				}
				if (Static116.aClass16_9.anInt441 == 2) {
					throw new IOException();
				}
				if (Static116.aClass16_9.anInt441 == 1) {
					Static49.aClass69_3 = new Class69((Socket) Static116.aClass16_9.anObject2, Static126.aClass29_63);
					Static18.anInt433 = 2;
					Static116.aClass16_9 = null;
				}
			}
			if (Static18.anInt433 == 2) {
				@Pc(70) long local70 = Static120.aLong143 = Static6.aClass39_179.method941();
				@Pc(77) int local77 = (int) (local70 >> 16 & 0x1FL);
				Static114.aClass4_Sub16_Sub1_3.anInt2019 = 0;
				Static114.aClass4_Sub16_Sub1_3.method1459(14);
				Static114.aClass4_Sub16_Sub1_3.method1459(local77);
				Static49.aClass69_3.method1860(2, Static114.aClass4_Sub16_Sub1_3.aByteArray22);
				Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
				Static18.anInt433 = 3;
			}
			@Pc(117) int local117;
			if (Static18.anInt433 == 3) {
				if (Static74.aClass26_2 != null) {
					Static74.aClass26_2.method1799();
				}
				if (Static70.aClass26_1 != null) {
					Static70.aClass26_1.method1799();
				}
				local117 = Static49.aClass69_3.method1858();
				if (Static74.aClass26_2 != null) {
					Static74.aClass26_2.method1799();
				}
				if (Static70.aClass26_1 != null) {
					Static70.aClass26_1.method1799();
				}
				if (local117 != 0) {
					Static11.method222(local117);
					return;
				}
				Static18.anInt433 = 4;
				Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
			}
			if (Static18.anInt433 == 4) {
				if (Static35.aClass4_Sub16_Sub1_1.anInt2019 < 8) {
					local117 = Static49.aClass69_3.method1863();
					if (local117 > 8 - Static35.aClass4_Sub16_Sub1_1.anInt2019) {
						local117 = 8 - Static35.aClass4_Sub16_Sub1_1.anInt2019;
					}
					if (local117 > 0) {
						Static49.aClass69_3.method1855(local117, Static35.aClass4_Sub16_Sub1_1.anInt2019, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
						Static35.aClass4_Sub16_Sub1_1.anInt2019 += local117;
					}
				}
				if (Static35.aClass4_Sub16_Sub1_1.anInt2019 == 8) {
					Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
					Static19.aLong23 = Static35.aClass4_Sub16_Sub1_1.method1479();
					Static18.anInt433 = 5;
				}
			}
			if (Static18.anInt433 == 5) {
				Static114.aClass4_Sub16_Sub1_3.anInt2019 = 0;
				@Pc(210) int[] local210 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static19.aLong23 >> 32), (int) Static19.aLong23 };
				Static114.aClass4_Sub16_Sub1_3.method1459(10);
				Static114.aClass4_Sub16_Sub1_3.method1489(local210[0]);
				Static114.aClass4_Sub16_Sub1_3.method1489(local210[1]);
				Static114.aClass4_Sub16_Sub1_3.method1489(local210[2]);
				Static114.aClass4_Sub16_Sub1_3.method1489(local210[3]);
				Static114.aClass4_Sub16_Sub1_3.method1489(Static126.aClass29_63.anInt913);
				Static114.aClass4_Sub16_Sub1_3.method1457(Static6.aClass39_179.method941());
				Static114.aClass4_Sub16_Sub1_3.method1470(Static6.aClass39_183);
				Static114.aClass4_Sub16_Sub1_3.method1462(Static14.aBigInteger1, Static60.aBigInteger2);
				Static62.aClass4_Sub16_Sub1_2.anInt2019 = 0;
				if (Static88.anInt2205 == 40) {
					Static62.aClass4_Sub16_Sub1_2.method1459(18);
				} else {
					Static62.aClass4_Sub16_Sub1_2.method1459(16);
				}
				Static62.aClass4_Sub16_Sub1_2.method1459(Static114.aClass4_Sub16_Sub1_3.anInt2019 + 69);
				Static62.aClass4_Sub16_Sub1_2.method1489(460);
				Static62.aClass4_Sub16_Sub1_2.method1459(Static123.aBoolean150 ? 1 : 0);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static120.aClass20_Sub1_17.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static41.aClass20_Sub1_6.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static94.aClass20_Sub1_14.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static55.aClass20_Sub1_9.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static75.aClass20_Sub1_13.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static16.aClass20_Sub1_2.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static29.aClass20_Sub1_3.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static65.aClass20_Sub1_11.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static127.aClass20_Sub1_20.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static113.aClass20_Sub1_16.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static67.aClass20_Sub1_12.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static47.aClass20_Sub1_8.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static62.aClass20_Sub1_10.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static51.aClass20_Sub1_15.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static125.aClass20_Sub1_19.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1489(Static4.aClass20_Sub1_1.anInt731);
				Static62.aClass4_Sub16_Sub1_2.method1458(Static114.aClass4_Sub16_Sub1_3.anInt2019, Static114.aClass4_Sub16_Sub1_3.aByteArray22);
				Static49.aClass69_3.method1860(Static62.aClass4_Sub16_Sub1_2.anInt2019, Static62.aClass4_Sub16_Sub1_2.aByteArray22);
				Static114.aClass4_Sub16_Sub1_3.method1492(local210);
				for (@Pc(439) int local439 = 0; local439 < 4; local439++) {
					local210[local439] += 50;
				}
				Static35.aClass4_Sub16_Sub1_1.method1492(local210);
				Static18.anInt433 = 6;
			}
			if (Static18.anInt433 == 6 && Static49.aClass69_3.method1863() > 0) {
				local117 = Static49.aClass69_3.method1858();
				if (local117 == 21 && Static88.anInt2205 == 20) {
					Static18.anInt433 = 7;
				} else if (local117 == 2) {
					Static18.anInt433 = 9;
				} else if (local117 == 15 && Static88.anInt2205 == 40) {
					Static4.method69();
					return;
				} else if (local117 == 23 && Static85.anInt2125 < 1) {
					Static85.anInt2125++;
					Static18.anInt433 = 0;
				} else {
					Static11.method222(local117);
					return;
				}
			}
			if (Static18.anInt433 == 7 && Static49.aClass69_3.method1863() > 0) {
				Static75.anInt1797 = (Static49.aClass69_3.method1858() + 3) * 60;
				Static18.anInt433 = 8;
			}
			if (Static18.anInt433 == 8) {
				Static83.anInt2075 = 0;
				Static2.method7(Static93.aClass39_1793, Static32.aClass39_441, Static62.method1123(new Class39[] { Static29.method510(Static75.anInt1797 / 60), Static38.aClass39_502 }));
				if (--Static75.anInt1797 <= 0) {
					Static18.anInt433 = 0;
				}
			} else {
				if (Static18.anInt433 == 9 && Static49.aClass69_3.method1863() >= 8) {
					Static84.anInt2105 = Static49.aClass69_3.method1858();
					Static83.aBoolean105 = Static49.aClass69_3.method1858() == 1;
					Static30.anInt783 = Static49.aClass69_3.method1858();
					Static30.anInt783 <<= 0x8;
					Static30.anInt783 += Static49.aClass69_3.method1858();
					Static40.anInt992 = Static49.aClass69_3.method1858();
					Static49.aClass69_3.method1855(1, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
					Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
					Static103.anInt2562 = Static35.aClass4_Sub16_Sub1_1.method1495();
					Static49.aClass69_3.method1855(2, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
					Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
					Static97.anInt2446 = Static35.aClass4_Sub16_Sub1_1.method1490();
					Static18.anInt433 = 10;
				}
				if (Static18.anInt433 != 10) {
					Static83.anInt2075++;
					if (Static83.anInt2075 > 2000) {
						if (Static85.anInt2125 < 1) {
							if (Static103.anInt2560 == Static123.anInt3044) {
								Static123.anInt3044 = Static127.anInt3134;
							} else {
								Static123.anInt3044 = Static103.anInt2560;
							}
							Static85.anInt2125++;
							Static18.anInt433 = 0;
						} else {
							Static11.method222(-3);
						}
					}
				} else if (Static49.aClass69_3.method1863() >= Static97.anInt2446) {
					Static35.aClass4_Sub16_Sub1_1.anInt2019 = 0;
					Static49.aClass69_3.method1855(Static97.anInt2446, 0, Static35.aClass4_Sub16_Sub1_1.aByteArray22);
					Static53.method918();
					Static25.anInt3168 = -1;
					Static2.method9(false);
					Static103.anInt2562 = -1;
				}
			}
		} catch (@Pc(729) IOException local729) {
			if (Static85.anInt2125 < 1) {
				if (Static123.anInt3044 == Static103.anInt2560) {
					Static123.anInt3044 = Static127.anInt3134;
				} else {
					Static123.anInt3044 = Static103.anInt2560;
				}
				Static18.anInt433 = 0;
				Static85.anInt2125++;
			} else {
				Static11.method222(-2);
			}
		}
	}
}
