import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!bc", name = "gc", descriptor = "Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4 aClass1_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!bc", name = "hc", descriptor = "I")
	public static int anInt234;

	@OriginalMember(owner = "client!bc", name = "jc", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!bc", name = "kc", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_2;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "Lclient!mc;")
	private static Class42 aClass42_119 = Static23.method501("Checking for updates )2 ");

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Lclient!mc;")
	public static Class42 aClass42_118 = aClass42_119;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "Lclient!oa;")
	private static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!bc", name = "Rb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_121 = Static23.method501("redstone3");

	@OriginalMember(owner = "client!bc", name = "ac", descriptor = "Lclient!mc;")
	public static Class42 aClass42_122 = Static23.method501("Benutzen");

	@OriginalMember(owner = "client!bc", name = "bc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_123 = Static23.method501("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!bc", name = "cc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_124 = Static23.method501("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!bc", name = "ec", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!bc", name = "fc", descriptor = "Lclient!mc;")
	private static Class42 aClass42_125 = Static23.method501("Members object");

	@OriginalMember(owner = "client!bc", name = "ic", descriptor = "Lclient!mc;")
	public static Class42 aClass42_126 = aClass42_125;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method147() {
		aClass42_123 = null;
		aClass42_124 = null;
		aClass33_Sub1_1 = null;
		aClass1_Sub8_Sub1_1 = null;
		aClass1_Sub1_Sub1_Sub4_1 = null;
		aClass33_Sub1_2 = null;
		aClass42_121 = null;
		aClass42_126 = null;
		aClass42_119 = null;
		aClass42_125 = null;
		aClass42_118 = null;
		aClass42_122 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public static void method150() {
		Static16.method407();
		if (Static91.anInt2400 != 10) {
			return;
		}
		@Pc(13) int local13 = Static80.anInt2104;
		@Pc(21) int local21 = Static8.anInt247 - 202;
		@Pc(25) int local25 = Static59.anInt1998 - 171;
		if (Static74.anInt1897 == 0) {
			if (local13 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 100 && local25 <= 140) {
				Static74.anInt1897 = 3;
				Static20.anInt646 = 0;
			}
			if (local13 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 100 && local25 <= 140) {
				Static74.anInt1897 = 2;
				Static20.anInt646 = 0;
				Static39.aClass42_236 = Static29.aClass42_439;
				Static39.aClass42_242 = Static79.aClass42_1083;
				Static39.aClass42_240 = Static79.aClass42_1067;
				return;
			}
			return;
		}
		if (Static74.anInt1897 == 2) {
			@Pc(120) byte local120 = 60;
			@Pc(121) int local121 = local120 + 30;
			if (local13 == 1 && local25 >= 75 && local25 < 90) {
				Static20.anInt646 = 0;
			}
			local121 += 15;
			if (local13 == 1 && local25 >= 90 && local25 < 105) {
				Static20.anInt646 = 1;
			}
			local121 += 15;
			if (local13 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 130 && local25 <= 170) {
				Static39.aClass42_238 = Static39.aClass42_238.method1038().method1058();
				Static75.method995(Static79.aClass42_1084, Static39.aClass42_231, Static79.aClass42_1086);
				Static12.method278(20);
				return;
			}
			if (local13 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 130 && local25 <= 170) {
				Static39.aClass42_233 = Static39.aClass42_239;
				Static39.aClass42_238 = Static39.aClass42_239;
				Static74.anInt1897 = 0;
			}
			while (true) {
				@Pc(254) boolean local254;
				label138: do {
					while (Static80.method1479()) {
						local254 = false;
						for (@Pc(256) int local256 = 0; local256 < Static87.aClass42_1218.method1027(); local256++) {
							if (Static87.anInt2274 == Static87.aClass42_1218.method1062(local256)) {
								local254 = true;
								break;
							}
						}
						if (Static20.anInt646 != 0) {
							continue label138;
						}
						if (Static31.anInt2249 == 85 && Static39.aClass42_238.method1027() > 0) {
							Static39.aClass42_238 = Static39.aClass42_238.method1053(0, Static39.aClass42_238.method1027() - 1);
						}
						if (Static31.anInt2249 == 84 || Static31.anInt2249 == 80) {
							Static20.anInt646 = 1;
						}
						if (local254 && Static39.aClass42_238.method1027() < 12) {
							Static39.aClass42_238 = Static39.aClass42_238.method1052(Static87.anInt2274);
						}
					}
					return;
				} while (Static20.anInt646 != 1);
				if (Static31.anInt2249 == 85 && Static39.aClass42_233.method1027() > 0) {
					Static39.aClass42_233 = Static39.aClass42_233.method1053(0, Static39.aClass42_233.method1027() - 1);
				}
				if (Static31.anInt2249 == 84 || Static31.anInt2249 == 80) {
					Static20.anInt646 = 0;
				}
				if (local254 && Static39.aClass42_233.method1027() < 20) {
					Static39.aClass42_233 = Static39.aClass42_233.method1052(Static87.anInt2274);
				}
			}
		}
		if (Static74.anInt1897 != 3 || local13 != 1 || local21 < 105 || local21 > 255 || local25 < 130 || local25 > 170) {
			return;
		}
		Static74.anInt1897 = 0;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	public static void method153() {
		for (@Pc(1) int local1 = 0; local1 < Static63.anInt1520; local1++) {
			@Pc(14) int local14 = Static77.anIntArray313[local1];
			@Pc(18) Class1_Sub1_Sub8_Sub1_Sub2 local18 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = Static80.aClass1_Sub8_Sub1_2.method1186();
			if ((local22 & 0x4) != 0) {
				local22 += Static80.aClass1_Sub8_Sub1_2.method1186() << 8;
			}
			Static84.method1532(local22, local14, local18);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZIZIZ)Lclient!p;")
	public static Class33_Sub1 method154(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class8 local10 = null;
		if (Static56.aClass44_4 != null) {
			local10 = new Class8(arg2, Static56.aClass44_4, Static30.aClass44Array1[arg2], 1000000);
		}
		return new Class33_Sub1(local10, Static23.aClass8_1, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V")
	public static void method155() {
		if (Static30.anInt828 != 0) {
			return;
		}
		@Pc(13) int local13 = Static80.anInt2104;
		if (Static12.anInt362 == 1 && Static8.anInt247 >= 516 && Static59.anInt1998 >= 160 && Static8.anInt247 <= 765 && Static59.anInt1998 <= 205) {
			local13 = 0;
		}
		@Pc(45) int local45;
		@Pc(43) int local43;
		@Pc(116) int local116;
		if (!Static10.aBoolean13) {
			if (local13 == 1 && Static83.anInt2216 > 0) {
				local45 = Static1.anIntArray1[Static83.anInt2216 - 1];
				if (local45 == 39 || local45 == 51 || local45 == 53 || local45 == 40 || local45 == 11 || local45 == 56 || local45 == 50 || local45 == 9 || local45 == 18 || local45 == 38 || local45 == 46 || local45 == 1001) {
					local43 = Static104.anIntArray398[Static83.anInt2216 - 1];
					local116 = Static70.anIntArray248[Static83.anInt2216 - 1];
					@Pc(289) Class1_Sub1_Sub12 local289 = Static33.method578(local116);
					if (local289.aBoolean120 || local289.aBoolean121) {
						Static16.aBoolean25 = false;
						Static13.anInt459 = Static8.anInt247;
						Static25.anInt729 = local116;
						Static109.anInt2754 = local43;
						Static91.anInt2401 = 0;
						Static5.anInt138 = Static59.anInt1998;
						Static30.anInt828 = 2;
						if (Static108.anInt2743 == local116 >> 16) {
							Static30.anInt828 = 1;
						}
						if (Static108.anInt2745 == local116 >> 16) {
							Static30.anInt828 = 3;
						}
						return;
					}
				}
			}
			if (local13 == 1 && (Static64.anInt1564 == 1 || Static99.method1730(Static83.anInt2216 - 1)) && Static83.anInt2216 > 2) {
				local13 = 2;
			}
			if (local13 == 1 && Static83.anInt2216 > 0) {
				Static37.method621(Static83.anInt2216 - 1);
			}
			if (local13 != 2 || Static83.anInt2216 <= 0) {
				return;
			}
			Static2.method86();
			return;
		}
		if (local13 != 1) {
			local43 = Static38.anInt948;
			local45 = Static73.anInt1884;
			if (Static73.anInt1891 == 0) {
				local43 -= 4;
				local45 -= 4;
			}
			if (Static73.anInt1891 == 1) {
				local45 -= 553;
				local43 -= 205;
			}
			if (Static73.anInt1891 == 2) {
				local45 -= 17;
				local43 -= 357;
			}
			if (local45 < Static91.anInt2407 - 10 || Static91.anInt2407 + Static81.anInt2119 + 10 < local45 || Static50.anInt1724 - 10 > local43 || Static27.anInt792 + Static50.anInt1724 + 10 < local43) {
				Static10.aBoolean13 = false;
				if (Static73.anInt1891 == 1) {
					Static89.aBoolean132 = true;
				}
				if (Static73.anInt1891 == 2) {
					Static28.aBoolean41 = true;
				}
			}
		}
		if (local13 != 1) {
			return;
		}
		local45 = Static91.anInt2407;
		local43 = Static50.anInt1724;
		@Pc(112) int local112 = Static8.anInt247;
		@Pc(114) int local114 = Static59.anInt1998;
		local116 = Static81.anInt2119;
		if (Static73.anInt1891 == 0) {
			local112 -= 4;
			local114 -= 4;
		}
		if (Static73.anInt1891 == 1) {
			local112 -= 553;
			local114 -= 205;
		}
		@Pc(132) int local132 = -1;
		if (Static73.anInt1891 == 2) {
			local114 -= 357;
			local112 -= 17;
		}
		for (@Pc(139) int local139 = 0; local139 < Static83.anInt2216; local139++) {
			@Pc(154) int local154 = (Static83.anInt2216 - local139 - 1) * 15 + local43 + 31;
			if (local112 > local45 && local116 + local45 > local112 && local154 - 13 < local114 && local154 + 3 > local114) {
				local132 = local139;
			}
		}
		if (local132 != -1) {
			Static37.method621(local132);
		}
		if (Static73.anInt1891 == 2) {
			Static28.aBoolean41 = true;
		}
		Static10.aBoolean13 = false;
		if (Static73.anInt1891 == 1) {
			Static89.aBoolean132 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILclient!aa;I)V")
	public static void method157(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static80.anInt2116 + Static36.anInt897 & 0x7FF;
		@Pc(21) int local21 = arg2 * arg2 + arg0 * arg0;
		if (local21 > 6400) {
			return;
		}
		@Pc(29) int local29 = Static76.anIntArray301[local12];
		@Pc(37) int local37 = local29 * 256 / (Static74.anInt1894 + 256);
		@Pc(41) int local41 = Static76.anIntArray306[local12];
		@Pc(49) int local49 = local41 * 256 / (Static74.anInt1894 + 256);
		@Pc(59) int local59 = local37 * arg0 + arg2 * local49 >> 16;
		@Pc(70) int local70 = arg0 * local49 - arg2 * local37 >> 16;
		if (local21 <= 2500) {
			arg1.method82(local59 + 4 + 94 - arg1.anInt89 / 2, -local70 + 83 - (arg1.anInt88 / 2 - -4));
		} else {
			arg1.method84(Static75.aClass1_Sub1_Sub1_Sub4_14, local59 + 4 + 94 - arg1.anInt89 / 2, -(arg1.anInt88 / 2) + -4 + -local70 + 83);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ja;III)Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 method160(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static67.method1153(arg2, arg0, arg1) ? Static53.method1837() : null;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(Z)V")
	public static void method162() {
		try {
			if (Static3.anInt119 == 0) {
				if (Static58.aClass47_17 != null) {
					Static58.aClass47_17.method1338();
					Static58.aClass47_17 = null;
				}
				Static49.anInt1281 = 0;
				Static3.anInt119 = 1;
				Static27.aBoolean37 = false;
				Static87.aClass59_5 = null;
			}
			if (Static3.anInt119 == 1) {
				if (Static87.aClass59_5 == null) {
					Static87.aClass59_5 = Static64.aClass60_3.method1804(Static93.anInt2454);
				}
				if (Static87.aClass59_5.anInt2522 == 2) {
					throw new IOException();
				}
				if (Static87.aClass59_5.anInt2522 == 1) {
					Static58.aClass47_17 = new Class47((Socket) Static87.aClass59_5.anObject3, Static64.aClass60_3);
					Static87.aClass59_5 = null;
					Static3.anInt119 = 2;
				}
			}
			if (Static3.anInt119 == 2) {
				@Pc(73) long local73 = Static99.aLong80 = Static39.aClass42_238.method1049();
				Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1185(14);
				@Pc(87) int local87 = (int) (local73 >> 16 & 0x1FL);
				Static98.aClass1_Sub8_Sub1_3.method1185(local87);
				Static58.aClass47_17.method1343(2, Static98.aClass1_Sub8_Sub1_3.aByteArray24);
				Static3.anInt119 = 3;
				Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
			}
			@Pc(110) int local110;
			if (Static3.anInt119 == 3) {
				local110 = Static58.aClass47_17.method1341();
				if (local110 != 0) {
					Static93.method1681(local110);
					return;
				}
				Static3.anInt119 = 4;
				Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
			}
			if (Static3.anInt119 == 4) {
				if (Static80.aClass1_Sub8_Sub1_2.anInt1692 < 8) {
					local110 = Static58.aClass47_17.method1335();
					if (8 - Static80.aClass1_Sub8_Sub1_2.anInt1692 < local110) {
						local110 = 8 - Static80.aClass1_Sub8_Sub1_2.anInt1692;
					}
					if (local110 > 0) {
						Static58.aClass47_17.method1342(Static80.aClass1_Sub8_Sub1_2.anInt1692, Static80.aClass1_Sub8_Sub1_2.aByteArray24, local110);
						Static80.aClass1_Sub8_Sub1_2.anInt1692 += local110;
					}
				}
				if (Static80.aClass1_Sub8_Sub1_2.anInt1692 == 8) {
					Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
					Static60.aLong44 = Static80.aClass1_Sub8_Sub1_2.method1224();
					Static3.anInt119 = 5;
				}
			}
			if (Static3.anInt119 == 5) {
				@Pc(187) int[] local187 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static60.aLong44 >> 32), (int) Static60.aLong44 };
				Static98.aClass1_Sub8_Sub1_3.anInt1692 = 0;
				Static98.aClass1_Sub8_Sub1_3.method1185(10);
				Static98.aClass1_Sub8_Sub1_3.method1218(local187[0]);
				Static98.aClass1_Sub8_Sub1_3.method1218(local187[1]);
				Static98.aClass1_Sub8_Sub1_3.method1218(local187[2]);
				Static98.aClass1_Sub8_Sub1_3.method1218(local187[3]);
				Static98.aClass1_Sub8_Sub1_3.method1218(Static64.aClass60_3.anInt2662);
				Static98.aClass1_Sub8_Sub1_3.method1193(Static39.aClass42_238.method1049());
				Static98.aClass1_Sub8_Sub1_3.method1204(Static39.aClass42_233);
				Static98.aClass1_Sub8_Sub1_3.method1212(Static34.aBigInteger1, Static69.aBigInteger2);
				aClass1_Sub8_Sub1_1.anInt1692 = 0;
				if (Static91.anInt2400 == 40) {
					aClass1_Sub8_Sub1_1.method1185(18);
				} else {
					aClass1_Sub8_Sub1_1.method1185(16);
				}
				aClass1_Sub8_Sub1_1.method1185(Static98.aClass1_Sub8_Sub1_3.anInt1692 + 53);
				aClass1_Sub8_Sub1_1.method1218(419);
				aClass1_Sub8_Sub1_1.method1185(Static75.aBoolean85 ? 1 : 0);
				aClass1_Sub8_Sub1_1.method1218(Static59.aClass33_Sub1_15.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static24.aClass33_Sub1_9.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static103.aClass33_Sub1_20.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static93.aClass33_Sub1_19.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(aClass33_Sub1_1.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static33.aClass33_Sub1_11.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(aClass33_Sub1_2.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static38.aClass33_Sub1_12.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static8.aClass33_Sub1_5.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static47.aClass33_Sub1_18.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static25.aClass33_Sub1_10.anInt1854);
				aClass1_Sub8_Sub1_1.method1218(Static83.aClass33_Sub1_16.anInt1854);
				aClass1_Sub8_Sub1_1.method1229(Static98.aClass1_Sub8_Sub1_3.anInt1692, Static98.aClass1_Sub8_Sub1_3.aByteArray24);
				Static58.aClass47_17.method1343(aClass1_Sub8_Sub1_1.anInt1692, aClass1_Sub8_Sub1_1.aByteArray24);
				Static98.aClass1_Sub8_Sub1_3.method1237(local187);
				for (@Pc(383) int local383 = 0; local383 < 4; local383++) {
					local187[local383] += 50;
				}
				Static80.aClass1_Sub8_Sub1_2.method1237(local187);
				Static3.anInt119 = 6;
			}
			if (Static3.anInt119 == 6 && Static58.aClass47_17.method1335() > 0) {
				local110 = Static58.aClass47_17.method1341();
				if (local110 == 21 && Static91.anInt2400 == 20) {
					Static3.anInt119 = 7;
				} else if (local110 == 2) {
					Static3.anInt119 = 9;
				} else if (local110 == 15 && Static91.anInt2400 == 40) {
					Static6.method123();
					return;
				} else if (local110 == 23 && Static68.anInt1657 < 1) {
					Static68.anInt1657++;
					Static3.anInt119 = 0;
				} else {
					Static93.method1681(local110);
					return;
				}
			}
			if (Static3.anInt119 == 7 && Static58.aClass47_17.method1335() > 0) {
				Static70.anInt1794 = Static58.aClass47_17.method1341() * 60 + 180;
				Static3.anInt119 = 8;
			}
			if (Static3.anInt119 == 8) {
				Static49.anInt1281 = 0;
				Static75.method995(Static74.aClass42_991, Static20.aClass42_356, Static57.method1822(new Class42[] { Static38.method642(Static70.anInt1794 / 60), Static56.aClass42_771 }));
				if (--Static70.anInt1794 <= 0) {
					Static3.anInt119 = 0;
				}
			} else {
				if (Static3.anInt119 == 9 && Static58.aClass47_17.method1335() >= 8) {
					Static25.anInt736 = Static58.aClass47_17.method1341();
					Static95.aBoolean137 = Static58.aClass47_17.method1341() == 1;
					Static75.anInt1420 = Static58.aClass47_17.method1341();
					Static75.anInt1420 <<= 0x8;
					Static75.anInt1420 += Static58.aClass47_17.method1341();
					Static24.anInt717 = Static58.aClass47_17.method1341();
					Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, 1);
					Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
					Static88.anInt2328 = Static80.aClass1_Sub8_Sub1_2.method1243();
					Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, 2);
					Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
					Static20.anInt644 = Static80.aClass1_Sub8_Sub1_2.method1199();
					Static3.anInt119 = 10;
				}
				if (Static3.anInt119 != 10) {
					Static49.anInt1281++;
					if (Static49.anInt1281 > 2000) {
						if (Static68.anInt1657 < 1) {
							Static68.anInt1657++;
							Static3.anInt119 = 0;
							if (Static83.anInt2218 == Static93.anInt2454) {
								Static93.anInt2454 = Static65.anInt1584;
							} else {
								Static93.anInt2454 = Static83.anInt2218;
							}
						} else {
							Static93.method1681(-3);
						}
					}
				} else if (Static58.aClass47_17.method1335() >= Static20.anInt644) {
					Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
					Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, Static20.anInt644);
					Static15.method402();
					Static2.anInt98 = -1;
					Static81.method1488(false);
					Static88.anInt2328 = -1;
				}
			}
		} catch (@Pc(665) IOException local665) {
			if (Static68.anInt1657 < 1) {
				if (Static83.anInt2218 == Static93.anInt2454) {
					Static93.anInt2454 = Static65.anInt1584;
				} else {
					Static93.anInt2454 = Static83.anInt2218;
				}
				Static68.anInt1657++;
				Static3.anInt119 = 0;
			} else {
				Static93.method1681(-2);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ka;IB)Lclient!mc;")
	public static Class42 method163(@OriginalArg(0) Class1_Sub8 arg0) {
		try {
			@Pc(12) Class42 local12 = new Class42();
			local12.anInt1468 = arg0.method1190();
			if (local12.anInt1468 > 32767) {
				local12.anInt1468 = 32767;
			}
			local12.aByteArray17 = new byte[local12.anInt1468];
			arg0.anInt1692 += Static31.aClass28_5.method588(local12.aByteArray17, 0, local12.anInt1468, arg0.aByteArray24, arg0.anInt1692);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static77.aClass42_1042;
		}
	}
}
