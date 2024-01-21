import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Lclient!ob;")
	public static Class3_Sub7 aClass3_Sub7_7;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public static int anInt2422;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "J")
	public static long aLong77;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "Lclient!na;")
	private static Class53 aClass53_1205 = Static109.method1737("scroll:");

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_1203 = aClass53_1205;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Lclient!na;")
	private static Class53 aClass53_1204 = Static109.method1737(" is already on your friend list");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!na;")
	private static Class53 aClass53_1206 = Static109.method1737("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_1207 = aClass53_1205;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1208 = aClass53_1204;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_1209 = aClass53_1206;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	public static void method1696() {
		try {
			if (Static29.anInt1007 == 0) {
				if (Static40.aClass37_2 != null) {
					Static40.aClass37_2.method948();
					Static40.aClass37_2 = null;
				}
				Static31.anInt1070 = 0;
				Static29.anInt1007 = 1;
				Static41.aBoolean42 = false;
				Static88.aClass22_7 = null;
			}
			if (Static29.anInt1007 == 1) {
				if (Static88.aClass22_7 == null) {
					Static88.aClass22_7 = Static4.aClass6_1.method128(Static107.aString5, Static5.anInt191);
				}
				if (Static88.aClass22_7.anInt864 == 2) {
					throw new IOException();
				}
				if (Static88.aClass22_7.anInt864 == 1) {
					Static40.aClass37_2 = new Class37((Socket) Static88.aClass22_7.anObject2, Static4.aClass6_1);
					Static88.aClass22_7 = null;
					Static29.anInt1007 = 2;
				}
			}
			if (Static29.anInt1007 == 2) {
				@Pc(77) long local77 = Static22.aLong29 = Static122.aClass53_1409.method1286();
				Static115.aClass3_Sub7_Sub1_3.anInt964 = 0;
				Static115.aClass3_Sub7_Sub1_3.method625(14);
				@Pc(91) int local91 = (int) (local77 >> 16 & 0x1FL);
				Static115.aClass3_Sub7_Sub1_3.method625(local91);
				Static40.aClass37_2.method953(2, Static115.aClass3_Sub7_Sub1_3.aByteArray15);
				Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
				Static29.anInt1007 = 3;
			}
			@Pc(126) int local126;
			if (Static29.anInt1007 == 3) {
				if (Static42.aClass1_1 != null) {
					Static42.aClass1_1.method1396();
				}
				if (Static95.aClass1_2 != null) {
					Static95.aClass1_2.method1396();
				}
				local126 = Static40.aClass37_2.method947();
				if (Static42.aClass1_1 != null) {
					Static42.aClass1_1.method1396();
				}
				if (Static95.aClass1_2 != null) {
					Static95.aClass1_2.method1396();
				}
				if (local126 != 0) {
					Static10.method165(local126);
					return;
				}
				Static29.anInt1007 = 4;
				Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
			}
			if (Static29.anInt1007 == 4) {
				if (Static62.aClass3_Sub7_Sub1_2.anInt964 < 8) {
					local126 = Static40.aClass37_2.method949();
					if (local126 > 8 - Static62.aClass3_Sub7_Sub1_2.anInt964) {
						local126 = 8 - Static62.aClass3_Sub7_Sub1_2.anInt964;
					}
					if (local126 > 0) {
						Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, local126, Static62.aClass3_Sub7_Sub1_2.anInt964);
						Static62.aClass3_Sub7_Sub1_2.anInt964 += local126;
					}
				}
				if (Static62.aClass3_Sub7_Sub1_2.anInt964 == 8) {
					Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
					Static38.aLong43 = Static62.aClass3_Sub7_Sub1_2.method607();
					Static29.anInt1007 = 5;
				}
			}
			if (Static29.anInt1007 == 5) {
				@Pc(219) int[] local219 = new int[] { 0, (int) (Math.random() * 9.9999999E7D), (int) (Static38.aLong43 >> 32), (int) Static38.aLong43 };
				Static115.aClass3_Sub7_Sub1_3.anInt964 = 0;
				local219[0] = (int) (Math.random() * 9.9999999E7D);
				Static115.aClass3_Sub7_Sub1_3.method625(10);
				Static115.aClass3_Sub7_Sub1_3.method642(local219[0]);
				Static115.aClass3_Sub7_Sub1_3.method642(local219[1]);
				Static115.aClass3_Sub7_Sub1_3.method642(local219[2]);
				Static115.aClass3_Sub7_Sub1_3.method642(local219[3]);
				Static115.aClass3_Sub7_Sub1_3.method642(Static4.aClass6_1.anInt193);
				Static115.aClass3_Sub7_Sub1_3.method633(Static122.aClass53_1409.method1286());
				Static115.aClass3_Sub7_Sub1_3.method598(Static122.aClass53_1406);
				Static115.aClass3_Sub7_Sub1_3.method609(Static70.aBigInteger2, Static35.aBigInteger1);
				Static5.aClass3_Sub7_Sub1_1.anInt964 = 0;
				if (Static78.anInt1957 == 40) {
					Static5.aClass3_Sub7_Sub1_1.method625(18);
				} else {
					Static5.aClass3_Sub7_Sub1_1.method625(16);
				}
				Static5.aClass3_Sub7_Sub1_1.method625(Static115.aClass3_Sub7_Sub1_3.anInt964 + 69);
				Static5.aClass3_Sub7_Sub1_1.method642(453);
				Static5.aClass3_Sub7_Sub1_1.method625(Static45.aBoolean47 ? 1 : 0);
				Static5.aClass3_Sub7_Sub1_1.method642(Static98.aClass62_Sub1_13.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static108.aClass62_Sub1_16.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static68.aClass62_Sub1_11.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static16.aClass62_Sub1_4.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static125.aClass62_Sub1_18.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static7.aClass62_Sub1_2.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static109.aClass62_Sub1_17.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static9.aClass62_Sub1_3.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static58.aClass62_Sub1_9.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static7.aClass62_Sub1_1.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static69.aClass62_Sub1_12.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static66.aClass62_Sub1_10.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static103.aClass62_Sub1_15.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static45.aClass62_Sub1_8.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static38.aClass62_Sub1_7.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method642(Static18.aClass62_Sub1_5.anInt2180);
				Static5.aClass3_Sub7_Sub1_1.method601(Static115.aClass3_Sub7_Sub1_3.anInt964, Static115.aClass3_Sub7_Sub1_3.aByteArray15);
				Static40.aClass37_2.method953(Static5.aClass3_Sub7_Sub1_1.anInt964, Static5.aClass3_Sub7_Sub1_1.aByteArray15);
				Static115.aClass3_Sub7_Sub1_3.method665(local219);
				for (@Pc(437) int local437 = 0; local437 < 4; local437++) {
					local219[local437] += 50;
				}
				Static62.aClass3_Sub7_Sub1_2.method665(local219);
				Static29.anInt1007 = 6;
			}
			if (Static29.anInt1007 == 6 && Static40.aClass37_2.method949() > 0) {
				local126 = Static40.aClass37_2.method947();
				if (local126 == 21 && Static78.anInt1957 == 20) {
					Static29.anInt1007 = 7;
				} else if (local126 == 2) {
					Static29.anInt1007 = 9;
				} else if (local126 == 15 && Static78.anInt1957 == 40) {
					Static51.method945();
					return;
				} else if (local126 == 23 && Static60.anInt1560 < 1) {
					Static60.anInt1560++;
					Static29.anInt1007 = 0;
				} else {
					Static10.method165(local126);
					return;
				}
			}
			if (Static29.anInt1007 == 7 && Static40.aClass37_2.method949() > 0) {
				Static8.anInt215 = Static40.aClass37_2.method947() * 60 + 180;
				Static29.anInt1007 = 8;
			}
			if (Static29.anInt1007 == 8) {
				Static31.anInt1070 = 0;
				Static88.method1454(Static18.aClass53_178, Static103.method1689(new Class53[] { Static108.method1725(Static8.anInt215 / 60), Static23.aClass53_293 }), Static56.aClass53_669);
				if (--Static8.anInt215 <= 0) {
					Static29.anInt1007 = 0;
				}
			} else {
				if (Static29.anInt1007 == 9 && Static40.aClass37_2.method949() >= 8) {
					Static105.anInt2436 = Static40.aClass37_2.method947();
					Static88.aBoolean82 = Static40.aClass37_2.method947() == 1;
					Static78.anInt1959 = Static40.aClass37_2.method947();
					Static78.anInt1959 <<= 0x8;
					Static78.anInt1959 += Static40.aClass37_2.method947();
					Static46.anInt2869 = Static40.aClass37_2.method947();
					Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, 1, 0);
					Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
					Static51.anInt1329 = Static62.aClass3_Sub7_Sub1_2.method656();
					Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, 2, 0);
					Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
					Static37.anInt2211 = Static62.aClass3_Sub7_Sub1_2.method602();
					Static29.anInt1007 = 10;
				}
				if (Static29.anInt1007 != 10) {
					Static31.anInt1070++;
					if (Static31.anInt1070 > 2000) {
						if (Static60.anInt1560 < 1) {
							Static60.anInt1560++;
							Static29.anInt1007 = 0;
							if (Static5.anInt191 == Static120.anInt2798) {
								Static5.anInt191 = Static41.anInt1209;
							} else {
								Static5.anInt191 = Static120.anInt2798;
							}
						} else {
							Static10.method165(-3);
						}
					}
				} else if (Static40.aClass37_2.method949() >= Static37.anInt2211) {
					Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
					Static40.aClass37_2.method955(Static62.aClass3_Sub7_Sub1_2.aByteArray15, Static37.anInt2211, 0);
					Static32.method701();
					Static15.anInt339 = -1;
					Static31.method695(false);
					Static51.anInt1329 = -1;
				}
			}
		} catch (@Pc(721) IOException local721) {
			if (Static60.anInt1560 < 1) {
				Static60.anInt1560++;
				if (Static5.anInt191 == Static120.anInt2798) {
					Static5.anInt191 = Static41.anInt1209;
				} else {
					Static5.anInt191 = Static120.anInt2798;
				}
				Static29.anInt1007 = 0;
			} else {
				Static10.method165(-2);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	public static void method1698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static108.anInt2484 = -1;
			Static96.anInt1433 = -1;
			return;
		}
		@Pc(40) int local40 = Static77.method1355(arg1, Static72.anInt1813, arg2) - arg0;
		@Pc(44) int local44 = Class3_Sub1_Sub5_Sub1.anIntArray86[Static48.anInt1302];
		@Pc(48) int local48 = local40 - Static95.anInt2273;
		@Pc(52) int local52 = arg1 - Static115.anInt2618;
		@Pc(56) int local56 = Class3_Sub1_Sub5_Sub1.anIntArray84[Static48.anInt1302];
		@Pc(60) int local60 = arg2 - Static39.anInt1177;
		@Pc(64) int local64 = Class3_Sub1_Sub5_Sub1.anIntArray86[Static72.anInt1807];
		@Pc(68) int local68 = Class3_Sub1_Sub5_Sub1.anIntArray84[Static72.anInt1807];
		@Pc(79) int local79 = local64 * local52 + local60 * local68 >> 16;
		@Pc(90) int local90 = local52 * local68 - local64 * local60 >> 16;
		@Pc(92) int local92 = local79;
		@Pc(103) int local103 = local56 * local48 - local44 * local90 >> 16;
		@Pc(113) int local113 = local56 * local90 + local48 * local44 >> 16;
		if (local113 >= 50) {
			Static108.anInt2484 = (local103 << 9) / local113 + 167;
			Static96.anInt1433 = (local92 << 9) / local113 + 256;
		} else {
			Static108.anInt2484 = -1;
			Static96.anInt1433 = -1;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method1699() {
		aClass53_1204 = null;
		aClass53_1205 = null;
		aClass53_1207 = null;
		aClass3_Sub7_7 = null;
		aClass53_1208 = null;
		aClass53_1206 = null;
		aClass53_1209 = null;
		aClass53_1203 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lclient!ie;")
	public static Class3_Sub1_Sub6 method1700(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub1_Sub6 local15 = (Class3_Sub1_Sub6) Static108.aClass75_68.method1728((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static102.method1672(arg0, Static123.aClass62_26, Static101.aClass62_22);
		if (local15 != null) {
			Static108.aClass75_68.method1730(local15, (long) arg0);
		}
		return local15;
	}
}
