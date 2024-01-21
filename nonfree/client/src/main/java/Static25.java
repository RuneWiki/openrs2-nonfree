import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ec", name = "vb", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ec", name = "Ib", descriptor = "Lclient!wb;")
	public static Class68 aClass68_1;

	@OriginalMember(owner = "client!ec", name = "Lb", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!ec", name = "Rb", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!ec", name = "tb", descriptor = "Lclient!a;")
	private static Class1 aClass1_993 = Static94.method1596("Loading textures )2 ");

	@OriginalMember(owner = "client!ec", name = "Nb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1002 = Static94.method1596("level)2");

	@OriginalMember(owner = "client!ec", name = "wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_994 = aClass1_1002;

	@OriginalMember(owner = "client!ec", name = "Ab", descriptor = "Lclient!a;")
	public static Class1 aClass1_995 = Static94.method1596("::noclip");

	@OriginalMember(owner = "client!ec", name = "Bb", descriptor = "Lclient!a;")
	public static Class1 aClass1_996 = Static94.method1596("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ec", name = "Cb", descriptor = "Lclient!a;")
	public static Class1 aClass1_997 = Static94.method1596("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ec", name = "Eb", descriptor = "Lclient!a;")
	public static Class1 aClass1_998 = aClass1_993;

	@OriginalMember(owner = "client!ec", name = "Gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_999 = Static94.method1596("Nehmen");

	@OriginalMember(owner = "client!ec", name = "Jb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1001 = Static94.method1596("Loaded input handler");

	@OriginalMember(owner = "client!ec", name = "Hb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1000 = aClass1_1001;

	@OriginalMember(owner = "client!ec", name = "Mb", descriptor = "I")
	public static int anInt1019 = 0;

	@OriginalMember(owner = "client!ec", name = "Qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1003 = Static94.method1596(" )2> @yel@");

	@OriginalMember(owner = "client!ec", name = "Vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1004 = Static94.method1596("leuchten3:");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public static void method714() {
		aClass1_996 = null;
		aClass68_1 = null;
		aClass1_1000 = null;
		aClass1_993 = null;
		aClass2_Sub1_Sub2_Sub2Array5 = null;
		aClass2_Sub1_Sub2_Sub4_1 = null;
		aClass1_1001 = null;
		aClass1_1003 = null;
		aClass1_998 = null;
		aClass1_1004 = null;
		aClass1_995 = null;
		aClass1_994 = null;
		aClass1_1002 = null;
		aClass1_999 = null;
		aClass1_997 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!bd;BLclient!a;Lclient!a;)[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] method716(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class1 arg2) {
		@Pc(8) int local8 = arg0.method1695(arg1);
		@Pc(19) int local19 = arg0.method1691(local8, arg2);
		return Static45.method1020(arg0, local19, local8);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	public static void method718() {
		try {
			if (Static20.anInt908 == 0) {
				if (Static50.aClass65_1 != null) {
					Static50.aClass65_1.method1758();
					Static50.aClass65_1 = null;
				}
				Static65.aBoolean104 = false;
				Static20.anInt908 = 1;
				Static17.anInt771 = 0;
				Static46.aClass18_6 = null;
			}
			if (Static20.anInt908 == 1) {
				if (Static46.aClass18_6 == null) {
					Static46.aClass18_6 = Static34.aClass34_4.method1263(Static15.anInt694);
				}
				if (Static46.aClass18_6.anInt1028 == 2) {
					throw new IOException();
				}
				if (Static46.aClass18_6.anInt1028 == 1) {
					Static50.aClass65_1 = new Class65((Socket) Static46.aClass18_6.anObject3, Static34.aClass34_4);
					Static20.anInt908 = 2;
					Static46.aClass18_6 = null;
				}
			}
			if (Static20.anInt908 == 2) {
				@Pc(74) long local74 = Static62.aLong62 = Static104.aClass1_1593.method9();
				Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
				Static59.aClass2_Sub3_Sub1_2.method788(14);
				@Pc(88) int local88 = (int) (local74 >> 16 & 0x1FL);
				Static59.aClass2_Sub3_Sub1_2.method788(local88);
				Static50.aClass65_1.method1759(2, Static59.aClass2_Sub3_Sub1_2.aByteArray7);
				Static20.anInt908 = 3;
				Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
			}
			@Pc(113) int local113;
			if (Static20.anInt908 == 3) {
				local113 = Static50.aClass65_1.method1765();
				if (local113 != 0) {
					Static54.method1232(local113);
					return;
				}
				Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
				Static20.anInt908 = 4;
			}
			if (Static20.anInt908 == 4) {
				if (Static13.aClass2_Sub3_Sub1_1.anInt1168 < 8) {
					local113 = Static50.aClass65_1.method1763();
					if (local113 > 8 - Static13.aClass2_Sub3_Sub1_1.anInt1168) {
						local113 = 8 - Static13.aClass2_Sub3_Sub1_1.anInt1168;
					}
					if (local113 > 0) {
						Static50.aClass65_1.method1757(Static13.aClass2_Sub3_Sub1_1.anInt1168, local113, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
						Static13.aClass2_Sub3_Sub1_1.anInt1168 += local113;
					}
				}
				if (Static13.aClass2_Sub3_Sub1_1.anInt1168 == 8) {
					Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
					Static107.aLong89 = Static13.aClass2_Sub3_Sub1_1.method821();
					Static20.anInt908 = 5;
				}
			}
			if (Static20.anInt908 == 5) {
				@Pc(192) int[] local192 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static107.aLong89 >> 32), (int) Static107.aLong89 };
				Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
				Static59.aClass2_Sub3_Sub1_2.method788(10);
				Static59.aClass2_Sub3_Sub1_2.method829(local192[0]);
				Static59.aClass2_Sub3_Sub1_2.method829(local192[1]);
				Static59.aClass2_Sub3_Sub1_2.method829(local192[2]);
				Static59.aClass2_Sub3_Sub1_2.method829(local192[3]);
				Static59.aClass2_Sub3_Sub1_2.method829(Static34.aClass34_4.anInt1799);
				Static59.aClass2_Sub3_Sub1_2.method804(Static104.aClass1_1593.method9());
				Static59.aClass2_Sub3_Sub1_2.method828(Static104.aClass1_1582);
				Static59.aClass2_Sub3_Sub1_2.method789(Static67.aBigInteger4, Static31.aBigInteger3);
				Static102.aClass2_Sub3_Sub1_3.anInt1168 = 0;
				if (Static85.anInt2262 == 40) {
					Static102.aClass2_Sub3_Sub1_3.method788(18);
				} else {
					Static102.aClass2_Sub3_Sub1_3.method788(16);
				}
				Static102.aClass2_Sub3_Sub1_3.method788(Static59.aClass2_Sub3_Sub1_2.anInt1168 + 57);
				Static102.aClass2_Sub3_Sub1_3.method829(435);
				Static102.aClass2_Sub3_Sub1_3.method788(Static77.aBoolean113 ? 1 : 0);
				Static102.aClass2_Sub3_Sub1_3.method829(Static46.aClass8_Sub1_9.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static18.aClass8_Sub1_7.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static79.aClass8_Sub1_18.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static110.aClass8_Sub1_25.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static67.aClass8_Sub1_24.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static107.aClass8_Sub1_23.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static90.aClass8_Sub1_20.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static64.aClass8_Sub1_15.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static37.aClass8_Sub1_8.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static59.aClass8_Sub1_14.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static53.aClass8_Sub1_13.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static77.aClass8_Sub1_17.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method829(Static91.aClass8_Sub1_21.anInt2551);
				Static102.aClass2_Sub3_Sub1_3.method798(Static59.aClass2_Sub3_Sub1_2.anInt1168, Static59.aClass2_Sub3_Sub1_2.aByteArray7);
				Static50.aClass65_1.method1759(Static102.aClass2_Sub3_Sub1_3.anInt1168, Static102.aClass2_Sub3_Sub1_3.aByteArray7);
				Static59.aClass2_Sub3_Sub1_2.method842(local192);
				for (@Pc(392) int local392 = 0; local392 < 4; local392++) {
					local192[local392] += 50;
				}
				Static13.aClass2_Sub3_Sub1_1.method842(local192);
				Static20.anInt908 = 6;
			}
			if (Static20.anInt908 == 6 && Static50.aClass65_1.method1763() > 0) {
				local113 = Static50.aClass65_1.method1765();
				if (local113 == 21 && Static85.anInt2262 == 20) {
					Static20.anInt908 = 7;
				} else if (local113 == 2) {
					Static20.anInt908 = 9;
				} else if (local113 == 15 && Static85.anInt2262 == 40) {
					Static65.method1342();
					return;
				} else if (local113 == 23 && Static29.anInt1088 < 1) {
					Static29.anInt1088++;
					Static20.anInt908 = 0;
				} else {
					Static54.method1232(local113);
					return;
				}
			}
			if (Static20.anInt908 == 7 && Static50.aClass65_1.method1763() > 0) {
				Static60.anInt1832 = Static50.aClass65_1.method1765() * 60 + 180;
				Static20.anInt908 = 8;
			}
			if (Static20.anInt908 == 8) {
				Static17.anInt771 = 0;
				Static60.method1284(Static97.method1655(new Class1[] { Static43.method994(Static60.anInt1832 / 60), Static66.aClass1_2452 }), Static12.aClass1_2750, Static53.aClass1_1823);
				if (--Static60.anInt1832 <= 0) {
					Static20.anInt908 = 0;
				}
			} else {
				if (Static20.anInt908 == 9 && Static50.aClass65_1.method1763() >= 8) {
					Static32.anInt1240 = Static50.aClass65_1.method1765();
					Static40.aBoolean88 = Static50.aClass65_1.method1765() == 1;
					Static57.anInt1796 = Static50.aClass65_1.method1765();
					Static57.anInt1796 <<= 0x8;
					Static57.anInt1796 += Static50.aClass65_1.method1765();
					Static73.anInt1990 = Static50.aClass65_1.method1765();
					Static50.aClass65_1.method1757(0, 1, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
					Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
					Static93.anInt2359 = Static13.aClass2_Sub3_Sub1_1.method835();
					Static50.aClass65_1.method1757(0, 2, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
					Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
					Static83.anInt2224 = Static13.aClass2_Sub3_Sub1_1.method792();
					Static20.anInt908 = 10;
				}
				if (Static20.anInt908 != 10) {
					Static17.anInt771++;
					if (Static17.anInt771 > 2000) {
						if (Static29.anInt1088 < 1) {
							Static29.anInt1088++;
							if (Static29.anInt1100 == Static15.anInt694) {
								Static15.anInt694 = Static5.anInt405;
							} else {
								Static15.anInt694 = Static29.anInt1100;
							}
							Static20.anInt908 = 0;
						} else {
							Static54.method1232(-3);
						}
					}
				} else if (Static50.aClass65_1.method1763() >= Static83.anInt2224) {
					Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
					Static50.aClass65_1.method1757(0, Static83.anInt2224, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
					Static17.method504();
					Static85.anInt2263 = -1;
					Static46.method1045(false);
					Static93.anInt2359 = -1;
				}
			}
		} catch (@Pc(665) IOException local665) {
			if (Static29.anInt1088 < 1) {
				if (Static29.anInt1100 == Static15.anInt694) {
					Static15.anInt694 = Static5.anInt405;
				} else {
					Static15.anInt694 = Static29.anInt1100;
				}
				Static29.anInt1088++;
				Static20.anInt908 = 0;
			} else {
				Static54.method1232(-2);
			}
		}
	}
}
