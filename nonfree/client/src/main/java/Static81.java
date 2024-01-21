import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
	public static int anInt2487;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt2488;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "[S")
	public static short[] aShortArray21;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ea;")
	private static Class18 aClass18_593 = Static8.method128("Please enter your username)3");

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!ea;")
	private static Class18 aClass18_594 = Static8.method128("Connection lost)3");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "[B")
	public static byte[] aByteArray29 = new byte[520];

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_595 = Static8.method128("blaugr-Un:");

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public static int anInt2485 = 0;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_596 = Static8.method128("Hierhin gehen");

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_597 = Static8.method128("lila:");

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "Lclient!ea;")
	public static Class18 aClass18_598 = aClass18_593;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_599 = Static8.method128("Null");

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_600 = aClass18_594;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([BB)[B")
	public static byte[] method1794(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub6 local4 = new Class1_Sub6(arg0);
		@Pc(15) int local15 = local4.method544();
		@Pc(23) int local23 = local4.method499();
		if (local23 < 0 || Static110.anInt3243 != 0 && Static110.anInt3243 < local23) {
			throw new RuntimeException();
		} else if (local15 == 0) {
			@Pc(86) byte[] local86 = new byte[local23];
			local4.method534(local23, local86);
			return local86;
		} else {
			@Pc(43) int local43 = local4.method499();
			if (local43 < 0 || Static110.anInt3243 != 0 && Static110.anInt3243 < local43) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local43];
			if (local15 == 1) {
				Static68.method1432(local64, local43, arg0, local23);
			} else {
				Static6.aClass7_1.method273(local64, local4);
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ob;Lclient!s;I)V")
	public static void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1 arg1, @OriginalArg(2) Class69 arg2) {
		@Pc(7) Class1_Sub7 local7 = new Class1_Sub7();
		local7.aClass69_2 = arg2;
		local7.aClass16_Sub1_14 = arg1;
		local7.anInt1089 = 1;
		local7.aLong139 = arg0;
		@Pc(22) Class59 local22 = Static164.aClass59_58;
		synchronized (Static164.aClass59_58) {
			Static164.aClass59_58.method2411(local7);
		}
		Static48.method1037();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1796() {
		aShortArray21 = null;
		aClass18_593 = null;
		aClass18_600 = null;
		aClass18_598 = null;
		aClass18_599 = null;
		aByteArray29 = null;
		aClass18_594 = null;
		aClass18_595 = null;
		aClass18_597 = null;
		aClass18_596 = null;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method1797() {
		try {
			if (Static54.anInt1731 == 0) {
				if (Static35.aClass21_2 != null) {
					Static35.aClass21_2.method1029();
					Static35.aClass21_2 = null;
				}
				Static117.aBoolean145 = false;
				anInt2484 = 0;
				Static54.anInt1731 = 1;
				Static116.aClass26_7 = null;
			}
			if (Static54.anInt1731 == 1) {
				if (Static116.aClass26_7 == null) {
					Static116.aClass26_7 = Static162.aClass53_4.method2269(Static43.aString2, Static17.anInt3606);
				}
				if (Static116.aClass26_7.anInt1788 == 2) {
					throw new IOException();
				}
				if (Static116.aClass26_7.anInt1788 == 1) {
					Static35.aClass21_2 = new Class21((Socket) Static116.aClass26_7.anObject2, Static162.aClass53_4);
					Static54.anInt1731 = 2;
					Static116.aClass26_7 = null;
				}
			}
			if (Static54.anInt1731 == 2) {
				@Pc(78) long local78 = Static164.aLong130 = Static163.aClass18_1154.method727();
				@Pc(85) int local85 = (int) (local78 >> 16 & 0x1FL);
				Static95.aClass1_Sub6_Sub1_1.anInt839 = 0;
				Static95.aClass1_Sub6_Sub1_1.method530(14);
				Static95.aClass1_Sub6_Sub1_1.method530(local85);
				Static35.aClass21_2.method1024(Static95.aClass1_Sub6_Sub1_1.aByteArray3, 2);
				Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
				Static54.anInt1731 = 3;
			}
			@Pc(127) int local127;
			if (Static54.anInt1731 == 3) {
				if (Static177.aClass25_12 != null) {
					Static177.aClass25_12.method1561();
				}
				if (Static47.aClass25_11 != null) {
					Static47.aClass25_11.method1561();
				}
				local127 = Static35.aClass21_2.method1025();
				if (Static177.aClass25_12 != null) {
					Static177.aClass25_12.method1561();
				}
				if (Static47.aClass25_11 != null) {
					Static47.aClass25_11.method1561();
				}
				if (local127 != 0) {
					Static36.method757(local127);
					return;
				}
				Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
				Static54.anInt1731 = 4;
			}
			if (Static54.anInt1731 == 4) {
				if (Static167.aClass1_Sub6_Sub1_3.anInt839 < 8) {
					local127 = Static35.aClass21_2.method1026();
					if (local127 > 8 - Static167.aClass1_Sub6_Sub1_3.anInt839) {
						local127 = 8 - Static167.aClass1_Sub6_Sub1_3.anInt839;
					}
					if (local127 > 0) {
						Static35.aClass21_2.method1028(local127, Static167.aClass1_Sub6_Sub1_3.anInt839, Static167.aClass1_Sub6_Sub1_3.aByteArray3);
						Static167.aClass1_Sub6_Sub1_3.anInt839 += local127;
					}
				}
				if (Static167.aClass1_Sub6_Sub1_3.anInt839 == 8) {
					Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
					Static58.aLong50 = Static167.aClass1_Sub6_Sub1_3.method537();
					Static54.anInt1731 = 5;
				}
			}
			if (Static54.anInt1731 == 5) {
				@Pc(218) int[] local218 = new int[] { (int) (Math.random() * 9.9999999E7D), 0, (int) (Static58.aLong50 >> 32), (int) Static58.aLong50 };
				Static95.aClass1_Sub6_Sub1_1.anInt839 = 0;
				local218[1] = (int) (Math.random() * 9.9999999E7D);
				Static95.aClass1_Sub6_Sub1_1.method530(10);
				Static95.aClass1_Sub6_Sub1_1.method513(local218[0]);
				Static95.aClass1_Sub6_Sub1_1.method513(local218[1]);
				Static95.aClass1_Sub6_Sub1_1.method513(local218[2]);
				Static95.aClass1_Sub6_Sub1_1.method513(local218[3]);
				Static95.aClass1_Sub6_Sub1_1.method515(Static163.aClass18_1154.method727());
				Static95.aClass1_Sub6_Sub1_1.method543(Static163.aClass18_1153);
				Static95.aClass1_Sub6_Sub1_1.method524(Static149.aBigInteger2, Static58.aBigInteger1);
				Static123.aClass1_Sub6_Sub1_2.anInt839 = 0;
				if (Static73.anInt1886 == 40) {
					Static123.aClass1_Sub6_Sub1_2.method530(18);
				} else {
					Static123.aClass1_Sub6_Sub1_2.method530(16);
				}
				Static123.aClass1_Sub6_Sub1_2.method530(Static95.aClass1_Sub6_Sub1_1.anInt839 + 93);
				Static123.aClass1_Sub6_Sub1_2.method513(474);
				Static123.aClass1_Sub6_Sub1_2.method530(Static27.aBoolean26 ? 1 : 0);
				Static57.method1172(Static123.aClass1_Sub6_Sub1_2);
				Static123.aClass1_Sub6_Sub1_2.method513(Static142.aClass16_Sub1_45.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static142.aClass16_Sub1_44.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static26.aClass16_Sub1_11.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static69.aClass16_Sub1_24.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static12.aClass16_Sub1_51.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static42.aClass16_Sub1_16.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static115.aClass16_Sub1_36.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static64.aClass16_Sub1_22.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static127.aClass16_Sub1_41.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static24.aClass16_Sub1_10.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static107.aClass16_Sub1_35.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static82.aClass16_Sub1_29.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static164.aClass16_Sub1_50.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static14.aClass16_Sub1_6.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static149.aClass16_Sub1_46.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method513(Static106.aClass16_Sub1_34.anInt3198);
				Static123.aClass1_Sub6_Sub1_2.method520(Static95.aClass1_Sub6_Sub1_1.anInt839, Static95.aClass1_Sub6_Sub1_1.aByteArray3);
				Static35.aClass21_2.method1024(Static123.aClass1_Sub6_Sub1_2.aByteArray3, Static123.aClass1_Sub6_Sub1_2.anInt839);
				Static95.aClass1_Sub6_Sub1_1.method556(local218);
				for (@Pc(438) int local438 = 0; local438 < 4; local438++) {
					local218[local438] += 50;
				}
				Static167.aClass1_Sub6_Sub1_3.method556(local218);
				Static54.anInt1731 = 6;
			}
			if (Static54.anInt1731 == 6 && Static35.aClass21_2.method1026() > 0) {
				local127 = Static35.aClass21_2.method1025();
				if (local127 == 21 && Static73.anInt1886 == 20) {
					Static54.anInt1731 = 7;
				} else if (local127 == 2) {
					Static54.anInt1731 = 9;
				} else if (local127 == 15 && Static73.anInt1886 == 40) {
					Static72.method1549();
					return;
				} else if (local127 == 23 && Static129.anInt3680 < 1) {
					Static129.anInt3680++;
					Static54.anInt1731 = 0;
				} else {
					Static36.method757(local127);
					return;
				}
			}
			if (Static54.anInt1731 == 7 && Static35.aClass21_2.method1026() > 0) {
				Static20.anInt573 = Static35.aClass21_2.method1025() * 60 + 180;
				Static54.anInt1731 = 8;
			}
			if (Static54.anInt1731 == 8) {
				anInt2484 = 0;
				Static30.method659(Static144.method2735(new Class18[] { Static132.method2564(Static20.anInt573 / 60), Static62.aClass18_476 }), Static168.aClass18_1183, Static33.aClass18_275);
				if (--Static20.anInt573 <= 0) {
					Static54.anInt1731 = 0;
				}
			} else {
				if (Static54.anInt1731 == 9 && Static35.aClass21_2.method1026() >= 8) {
					Static114.anInt3306 = Static35.aClass21_2.method1025();
					Static91.aBoolean112 = Static35.aClass21_2.method1025() == 1;
					Static40.anInt1308 = Static35.aClass21_2.method1025();
					Static40.anInt1308 <<= 0x8;
					Static40.anInt1308 += Static35.aClass21_2.method1025();
					Static65.anInt1964 = Static35.aClass21_2.method1025();
					Static35.aClass21_2.method1028(1, 0, Static167.aClass1_Sub6_Sub1_3.aByteArray3);
					Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
					Static94.anInt2924 = Static167.aClass1_Sub6_Sub1_3.method552();
					Static35.aClass21_2.method1028(2, 0, Static167.aClass1_Sub6_Sub1_3.aByteArray3);
					Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
					Static12.anInt4661 = Static167.aClass1_Sub6_Sub1_3.method546();
					Static54.anInt1731 = 10;
				}
				if (Static54.anInt1731 != 10) {
					anInt2484++;
					if (anInt2484 > 2000) {
						if (Static129.anInt3680 < 1) {
							if (Static17.anInt3606 == Static156.anInt4308) {
								Static17.anInt3606 = Static54.anInt1732;
							} else {
								Static17.anInt3606 = Static156.anInt4308;
							}
							Static54.anInt1731 = 0;
							Static129.anInt3680++;
						} else {
							Static36.method757(-3);
						}
					}
				} else if (Static35.aClass21_2.method1026() >= Static12.anInt4661) {
					Static167.aClass1_Sub6_Sub1_3.anInt839 = 0;
					Static35.aClass21_2.method1028(Static12.anInt4661, 0, Static167.aClass1_Sub6_Sub1_3.aByteArray3);
					Static115.method2313();
					Static48.anInt1566 = -1;
					Static59.method500(false);
					Static94.anInt2924 = -1;
				}
			}
		} catch (@Pc(718) IOException local718) {
			if (Static129.anInt3680 < 1) {
				if (Static156.anInt4308 == Static17.anInt3606) {
					Static17.anInt3606 = Static54.anInt1732;
				} else {
					Static17.anInt3606 = Static156.anInt4308;
				}
				Static129.anInt3680++;
				Static54.anInt1731 = 0;
			} else {
				Static36.method757(-2);
			}
		}
	}
}
