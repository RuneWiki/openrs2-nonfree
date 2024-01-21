import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
	public static int anInt4336;

	@OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
	public static int anInt4345;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1496 = Static151.method2243("(Y<)4col>");

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_24 = new Class53(64);

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1498 = Static151.method2243("Starting 3d library");

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1497 = aClass62_1498;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ii;I)V")
	public static void method3033(@OriginalArg(0) Class47 arg0) {
		@Pc(15) int local15 = arg0.anInt1861 == 0 ? arg0.anInt1910 : arg0.anInt1861;
		@Pc(24) int local24 = arg0.anInt1911 == 0 ? arg0.anInt1858 : arg0.anInt1911;
		Static149.method2219(arg0.anInt1886, local15, local24, Static89.aClass47ArrayArray1[arg0.anInt1886 >> 16]);
		if (arg0.aClass47Array1 != null) {
			Static149.method2219(arg0.anInt1886, local15, local24, arg0.aClass47Array1);
		}
		@Pc(62) Class2_Sub7 local62 = (Class2_Sub7) Static49.aClass58_7.method1704((long) arg0.anInt1886);
		if (local62 != null) {
			Static152.method2258(local24, local62.anInt1410, local15);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIBII)V")
	public static void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static176.anInt3717 = -1;
		Static186.anInt3885 = -1;
		Static50.anInt1085 = Static104.anInt2340 * arg0 / arg1;
		Static142.anInt3025 = arg2 * Static173.anInt3686 / arg3;
		Static26.method2655();
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)V")
	public static void method3037() {
		try {
			if (Static15.anInt354 == 0) {
				if (Static151.aClass36_3 != null) {
					Static151.aClass36_3.method862();
					Static151.aClass36_3 = null;
				}
				Static15.anInt354 = 1;
				Static43.aBoolean41 = false;
				Static166.anInt3523 = 0;
				Static123.aClass56_19 = null;
			}
			if (Static15.anInt354 == 1) {
				if (Static123.aClass56_19 == null) {
					Static123.aClass56_19 = Static170.aClass41_3.method1046(anInt4336, Static209.aString6);
				}
				if (Static123.aClass56_19.anInt2418 == 2) {
					throw new IOException();
				}
				if (Static123.aClass56_19.anInt2418 == 1) {
					Static151.aClass36_3 = new Class36((Socket) Static123.aClass56_19.anObject2, Static170.aClass41_3);
					Static15.anInt354 = 2;
					Static123.aClass56_19 = null;
				}
			}
			if (Static15.anInt354 == 2) {
				@Pc(76) long local76 = Static73.aLong56 = Static137.aClass62_1026.method1843();
				@Pc(83) int local83 = (int) (local76 >> 16 & 0x1FL);
				Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1565(14);
				Static58.aClass2_Sub11_Sub1_2.method1565(local83);
				Static151.aClass36_3.method858(Static58.aClass2_Sub11_Sub1_2.aByteArray26, 2);
				Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
				Static15.anInt354 = 3;
			}
			@Pc(123) int local123;
			if (Static15.anInt354 == 3) {
				if (Static96.aClass3_1 != null) {
					Static96.aClass3_1.method97();
				}
				if (Static174.aClass3_2 != null) {
					Static174.aClass3_2.method97();
				}
				local123 = Static151.aClass36_3.method859();
				if (Static96.aClass3_1 != null) {
					Static96.aClass3_1.method97();
				}
				if (Static174.aClass3_2 != null) {
					Static174.aClass3_2.method97();
				}
				if (local123 != 0) {
					Static52.method771(local123);
					return;
				}
				Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
				Static15.anInt354 = 4;
			}
			if (Static15.anInt354 == 4) {
				if (Static108.aClass2_Sub11_Sub1_3.anInt2235 < 8) {
					local123 = Static151.aClass36_3.method863();
					if (8 - Static108.aClass2_Sub11_Sub1_3.anInt2235 < local123) {
						local123 = 8 - Static108.aClass2_Sub11_Sub1_3.anInt2235;
					}
					if (local123 > 0) {
						Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, Static108.aClass2_Sub11_Sub1_3.anInt2235, local123);
						Static108.aClass2_Sub11_Sub1_3.anInt2235 += local123;
					}
				}
				if (Static108.aClass2_Sub11_Sub1_3.anInt2235 == 8) {
					Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
					Static96.aLong74 = Static108.aClass2_Sub11_Sub1_3.method1580();
					Static15.anInt354 = 5;
				}
			}
			if (Static15.anInt354 == 5) {
				Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
				@Pc(213) int[] local213 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static96.aLong74 >> 32), (int) Static96.aLong74 };
				Static58.aClass2_Sub11_Sub1_2.method1565(10);
				Static58.aClass2_Sub11_Sub1_2.method1544(local213[0]);
				Static58.aClass2_Sub11_Sub1_2.method1544(local213[1]);
				Static58.aClass2_Sub11_Sub1_2.method1544(local213[2]);
				Static58.aClass2_Sub11_Sub1_2.method1544(local213[3]);
				Static58.aClass2_Sub11_Sub1_2.method1527(Static137.aClass62_1026.method1843());
				Static58.aClass2_Sub11_Sub1_2.method1540(Static137.aClass62_1030);
				Static58.aClass2_Sub11_Sub1_2.method1539(Static84.aBigInteger2, Static189.aBigInteger3);
				Static57.aClass2_Sub11_Sub1_1.anInt2235 = 0;
				if (Static87.anInt1821 == 40) {
					Static57.aClass2_Sub11_Sub1_1.method1565(18);
				} else {
					Static57.aClass2_Sub11_Sub1_1.method1565(16);
				}
				Static57.aClass2_Sub11_Sub1_1.method1565(Static58.aClass2_Sub11_Sub1_2.anInt2235 + Static157.method2319(Static66.aClass62_466) + 129);
				Static57.aClass2_Sub11_Sub1_1.method1544(496);
				Static57.aClass2_Sub11_Sub1_1.method1565(Static60.aBoolean52 ? 1 : 0);
				Static214.method3140(Static57.aClass2_Sub11_Sub1_1);
				Static57.aClass2_Sub11_Sub1_1.method1540(Static66.aClass62_466);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static173.anInt3687);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static49.aClass71_Sub1_1.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static146.aClass71_Sub1_15.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static157.aClass71_Sub1_19.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static173.aClass71_Sub1_21.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static126.aClass71_Sub1_13.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static153.aClass71_Sub1_16.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static63.aClass71_Sub1_5.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static126.aClass71_Sub1_14.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static59.aClass71_Sub1_4.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static101.aClass71_Sub1_11.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static56.aClass71_Sub1_3.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static156.aClass71_Sub1_18.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static179.aClass71_Sub1_23.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static86.aClass71_Sub1_20.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static65.aClass71_Sub1_6.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static71.aClass71_Sub1_7.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static92.aClass71_Sub1_9.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static203.aClass71_Sub1_26.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static96.aClass71_Sub1_10.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static191.aClass71_Sub1_24.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static55.aClass71_Sub1_2.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static153.aClass71_Sub1_17.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static200.aClass71_Sub1_25.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1544(Static203.aClass71_Sub1_27.anInt2995);
				Static57.aClass2_Sub11_Sub1_1.method1560(Static58.aClass2_Sub11_Sub1_2.anInt2235, Static58.aClass2_Sub11_Sub1_2.aByteArray26);
				Static151.aClass36_3.method858(Static57.aClass2_Sub11_Sub1_1.aByteArray26, Static57.aClass2_Sub11_Sub1_1.anInt2235);
				Static58.aClass2_Sub11_Sub1_2.method1592(local213);
				for (@Pc(476) int local476 = 0; local476 < 4; local476++) {
					local213[local476] += 50;
				}
				Static108.aClass2_Sub11_Sub1_3.method1592(local213);
				Static15.anInt354 = 6;
			}
			if (Static15.anInt354 == 6 && Static151.aClass36_3.method863() > 0) {
				local123 = Static151.aClass36_3.method859();
				if (local123 == 21 && Static87.anInt1821 == 20) {
					Static15.anInt354 = 7;
				} else if (local123 == 2) {
					Static15.anInt354 = 9;
				} else if (local123 == 15 && Static87.anInt1821 == 40) {
					Static103.method1555();
					return;
				} else if (local123 == 23 && Static68.anInt1422 < 1) {
					Static68.anInt1422++;
					Static15.anInt354 = 0;
				} else {
					Static52.method771(local123);
					return;
				}
			}
			if (Static15.anInt354 == 7 && Static151.aClass36_3.method863() > 0) {
				Static141.anInt1520 = Static151.aClass36_3.method859() * 60 + 180;
				Static15.anInt354 = 8;
			}
			if (Static15.anInt354 == 8) {
				Static166.anInt3523 = 0;
				Static43.method676(Static169.method2460(new Class62[] { Static119.method1865(Static141.anInt1520 / 60), Static186.aClass62_1363 }), Static135.aClass62_1015, Static28.aClass62_198);
				if (--Static141.anInt1520 <= 0) {
					Static15.anInt354 = 0;
				}
			} else {
				if (Static15.anInt354 == 9 && Static151.aClass36_3.method863() >= 9) {
					Static154.anInt3306 = Static151.aClass36_3.method859();
					Static210.anInt4408 = Static151.aClass36_3.method859();
					Static85.aBoolean86 = Static151.aClass36_3.method859() == 1;
					Static59.anInt1225 = Static151.aClass36_3.method859();
					Static59.anInt1225 <<= 0x8;
					Static59.anInt1225 += Static151.aClass36_3.method859();
					Static139.anInt2935 = Static151.aClass36_3.method859();
					Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, 1);
					Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
					Static158.anInt3381 = Static108.aClass2_Sub11_Sub1_3.method1587();
					Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, 2);
					Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
					Static35.anInt838 = Static108.aClass2_Sub11_Sub1_3.method1557();
					Static15.anInt354 = 10;
				}
				if (Static15.anInt354 != 10) {
					Static166.anInt3523++;
					if (Static166.anInt3523 > 2000) {
						if (Static68.anInt1422 < 1) {
							if (anInt4336 == Static5.anInt171) {
								anInt4336 = Static104.anInt2343;
							} else {
								anInt4336 = Static5.anInt171;
							}
							Static15.anInt354 = 0;
							Static68.anInt1422++;
						} else {
							Static52.method771(-3);
						}
					}
				} else if (Static151.aClass36_3.method863() >= Static35.anInt838) {
					Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
					Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, Static35.anInt838);
					Static30.method534();
					Static64.anInt1337 = -1;
					Static150.method2138(false);
					Static158.anInt3381 = -1;
				}
			}
		} catch (@Pc(762) IOException local762) {
			if (Static68.anInt1422 < 1) {
				if (anInt4336 == Static5.anInt171) {
					anInt4336 = Static104.anInt2343;
				} else {
					anInt4336 = Static5.anInt171;
				}
				Static15.anInt354 = 0;
				Static68.anInt1422++;
			} else {
				Static52.method771(-2);
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
	public static boolean method3038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static131.method1030(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static123.method3147(local10 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg2] + arg3, local14 + 1) && Static123.method3147(local10 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static123.method3147(local10 + 128 - 1, Static72.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static123.method3147(local10 + 1, Static72.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[Lclient!ii;)V")
	public static void method3039(@OriginalArg(0) int arg0, @OriginalArg(2) Class47[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class47 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt1870 == 0) {
					if (local9.aClass47Array1 != null) {
						method3039(arg0, local9.aClass47Array1);
					}
					@Pc(30) Class2_Sub7 local30 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local9.anInt1886);
					if (local30 != null) {
						Static204.method2973(local30.anInt1410, arg0);
					}
				}
				@Pc(46) Class2_Sub13 local46;
				if (arg0 == 0 && local9.anObjectArray12 != null) {
					local46 = new Class2_Sub13();
					local46.aClass47_12 = local9;
					local46.anObjectArray27 = local9.anObjectArray12;
					Static140.method2145(local46);
				}
				if (arg0 == 1 && local9.anObjectArray11 != null) {
					if (local9.anInt1860 >= 0) {
						@Pc(70) Class47 local70 = Static143.method2159(local9.anInt1886);
						if (local70 == null || local70.aClass47Array1 == null || local70.aClass47Array1.length <= local9.anInt1860 || local9 != local70.aClass47Array1[local9.anInt1860]) {
							continue;
						}
					}
					local46 = new Class2_Sub13();
					local46.anObjectArray27 = local9.anObjectArray11;
					local46.aClass47_12 = local9;
					Static140.method2145(local46);
				}
			}
		}
	}
}
