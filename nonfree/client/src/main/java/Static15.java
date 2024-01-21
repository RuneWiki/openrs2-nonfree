import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1 aClass6_Sub2_Sub2_Sub1_5;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Lclient!pb;")
	public static Class40 aClass40_14;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "Lclient!rc;")
	private static Class55 aClass55_280 = Static34.method846("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!d", name = "lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_281 = Static34.method846("Duell akzeptieren");

	@OriginalMember(owner = "client!d", name = "rb", descriptor = "[Lclient!ta;")
	public static Class6_Sub2_Sub3_Sub1_Sub2[] aClass6_Sub2_Sub3_Sub1_Sub2Array1 = new Class6_Sub2_Sub3_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!d", name = "Wb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_288 = Static34.method846("Create a free account");

	@OriginalMember(owner = "client!d", name = "ub", descriptor = "Lclient!rc;")
	public static Class55 aClass55_282 = aClass55_288;

	@OriginalMember(owner = "client!d", name = "yb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_283 = aClass55_280;

	@OriginalMember(owner = "client!d", name = "zb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_284 = Static34.method846("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!d", name = "Gb", descriptor = "J")
	public static long aLong30 = 0L;

	@OriginalMember(owner = "client!d", name = "Jb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_285 = Static34.method846("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!d", name = "Ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_286 = Static34.method846("scrollbar");

	@OriginalMember(owner = "client!d", name = "Pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_287 = Static34.method846("@yel@");

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
	public static void method534() {
		aClass40_14 = null;
		aClass55_286 = null;
		aClass55_288 = null;
		aClass55_281 = null;
		aClass55_287 = null;
		aClass55_284 = null;
		aClass55_283 = null;
		aClass55_280 = null;
		aClass55_285 = null;
		aClass55_282 = null;
		aClass6_Sub2_Sub3_Sub1_Sub2Array1 = null;
		aClass6_Sub2_Sub2_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
	public static void method539() {
		try {
			if (Static38.anInt1387 == 0) {
				if (Static19.aClass65_1 != null) {
					Static19.aClass65_1.method2012();
					Static19.aClass65_1 = null;
				}
				Static17.aClass25_2 = null;
				Static81.anInt2297 = 0;
				Static38.anInt1387 = 1;
				Static5.aBoolean103 = false;
			}
			if (Static38.anInt1387 == 1) {
				if (Static17.aClass25_2 == null) {
					Static17.aClass25_2 = Static102.aClass20_4.method719(Static4.anInt2363);
				}
				if (Static17.aClass25_2.anInt1212 == 2) {
					throw new IOException();
				}
				if (Static17.aClass25_2.anInt1212 == 1) {
					Static19.aClass65_1 = new Class65((Socket) Static17.aClass25_2.anObject3, Static102.aClass20_4);
					Static38.anInt1387 = 2;
					Static17.aClass25_2 = null;
				}
			}
			if (Static38.anInt1387 == 2) {
				@Pc(71) long local71 = Static65.aLong69 = Static29.aClass55_429.method1639();
				@Pc(78) int local78 = (int) (local71 >> 16 & 0x1FL);
				Static51.aClass6_Sub1_Sub1_3.anInt2209 = 0;
				Static51.aClass6_Sub1_Sub1_3.method1501(14);
				Static51.aClass6_Sub1_Sub1_3.method1501(local78);
				Static19.aClass65_1.method2009(Static51.aClass6_Sub1_Sub1_3.aByteArray11, 2);
				Static38.anInt1387 = 3;
				Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
			}
			@Pc(112) int local112;
			if (Static38.anInt1387 == 3) {
				local112 = Static19.aClass65_1.method2008();
				if (local112 != 0) {
					Static65.method1342(local112);
					return;
				}
				Static38.anInt1387 = 4;
				Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
			}
			if (Static38.anInt1387 == 4) {
				if (Static13.aClass6_Sub1_Sub1_2.anInt2209 < 8) {
					local112 = Static19.aClass65_1.method2007();
					if (local112 > 8 - Static13.aClass6_Sub1_Sub1_2.anInt2209) {
						local112 = 8 - Static13.aClass6_Sub1_Sub1_2.anInt2209;
					}
					if (local112 > 0) {
						Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, local112, Static13.aClass6_Sub1_Sub1_2.anInt2209);
						Static13.aClass6_Sub1_Sub1_2.anInt2209 += local112;
					}
				}
				if (Static13.aClass6_Sub1_Sub1_2.anInt2209 == 8) {
					Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
					Static71.aLong74 = Static13.aClass6_Sub1_Sub1_2.method1470();
					Static38.anInt1387 = 5;
				}
			}
			if (Static38.anInt1387 == 5) {
				@Pc(193) int[] local193 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static71.aLong74 >> 32), (int) Static71.aLong74 };
				Static51.aClass6_Sub1_Sub1_3.anInt2209 = 0;
				Static51.aClass6_Sub1_Sub1_3.method1501(10);
				Static51.aClass6_Sub1_Sub1_3.method1499(local193[0]);
				Static51.aClass6_Sub1_Sub1_3.method1499(local193[1]);
				Static51.aClass6_Sub1_Sub1_3.method1499(local193[2]);
				Static51.aClass6_Sub1_Sub1_3.method1499(local193[3]);
				Static51.aClass6_Sub1_Sub1_3.method1499(Static102.aClass20_4.anInt1124);
				Static51.aClass6_Sub1_Sub1_3.method1463(Static29.aClass55_429.method1639());
				Static51.aClass6_Sub1_Sub1_3.method1493(Static29.aClass55_425);
				Static51.aClass6_Sub1_Sub1_3.method1488(Static70.aBigInteger1, Static112.aBigInteger2);
				Static77.aClass6_Sub1_Sub1_4.anInt2209 = 0;
				if (Static61.anInt1879 == 40) {
					Static77.aClass6_Sub1_Sub1_4.method1501(18);
				} else {
					Static77.aClass6_Sub1_Sub1_4.method1501(16);
				}
				Static77.aClass6_Sub1_Sub1_4.method1501(Static51.aClass6_Sub1_Sub1_3.anInt2209 + 57);
				Static77.aClass6_Sub1_Sub1_4.method1499(439);
				Static77.aClass6_Sub1_Sub1_4.method1501(Static90.aBoolean119 ? 1 : 0);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static87.aClass40_Sub1_29.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static41.aClass40_Sub1_17.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static88.aClass40_Sub1_44.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static24.aClass40_Sub1_12.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static55.aClass40_Sub1_24.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static9.aClass40_Sub1_5.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static43.aClass40_Sub1_19.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static51.aClass40_Sub1_22.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static92.aClass40_Sub1_33.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static33.aClass40_Sub1_15.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static72.aClass40_Sub1_27.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static109.aClass40_Sub1_42.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1499(Static105.aClass40_Sub1_40.anInt1797);
				Static77.aClass6_Sub1_Sub1_4.method1477(Static51.aClass6_Sub1_Sub1_3.aByteArray11, Static51.aClass6_Sub1_Sub1_3.anInt2209);
				Static19.aClass65_1.method2009(Static77.aClass6_Sub1_Sub1_4.aByteArray11, Static77.aClass6_Sub1_Sub1_4.anInt2209);
				Static51.aClass6_Sub1_Sub1_3.method1522(local193);
				for (@Pc(393) int local393 = 0; local393 < 4; local393++) {
					local193[local393] += 50;
				}
				Static13.aClass6_Sub1_Sub1_2.method1522(local193);
				Static38.anInt1387 = 6;
			}
			if (Static38.anInt1387 == 6 && Static19.aClass65_1.method2007() > 0) {
				local112 = Static19.aClass65_1.method2008();
				if (local112 == 21 && Static61.anInt1879 == 20) {
					Static38.anInt1387 = 7;
				} else if (local112 == 2) {
					Static38.anInt1387 = 9;
				} else if (local112 == 15 && Static61.anInt1879 == 40) {
					Static92.method1748();
					return;
				} else if (local112 == 23 && Static44.anInt2759 < 1) {
					Static44.anInt2759++;
					Static38.anInt1387 = 0;
				} else {
					Static65.method1342(local112);
					return;
				}
			}
			if (Static38.anInt1387 == 7 && Static19.aClass65_1.method2007() > 0) {
				Static110.anInt3148 = Static19.aClass65_1.method2008() * 60 + 180;
				Static38.anInt1387 = 8;
			}
			if (Static38.anInt1387 == 8) {
				Static81.anInt2297 = 0;
				Static45.method987(Static71.aClass55_860, Static7.aClass55_121, Static89.method1698(new Class55[] { Static58.method1196(Static110.anInt3148 / 60), Static44.aClass55_1151 }));
				if (--Static110.anInt3148 <= 0) {
					Static38.anInt1387 = 0;
				}
			} else {
				if (Static38.anInt1387 == 9 && Static19.aClass65_1.method2007() >= 8) {
					Static91.anInt2554 = Static19.aClass65_1.method2008();
					Static68.aBoolean92 = Static19.aClass65_1.method2008() == 1;
					Static41.anInt1401 = Static19.aClass65_1.method2008();
					Static41.anInt1401 <<= 0x8;
					Static41.anInt1401 += Static19.aClass65_1.method2008();
					Static55.anInt1704 = Static19.aClass65_1.method2008();
					Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, 1, 0);
					Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
					Static47.anInt1514 = Static13.aClass6_Sub1_Sub1_2.method1513();
					Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, 2, 0);
					Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
					Static63.anInt1889 = Static13.aClass6_Sub1_Sub1_2.method1500();
					Static38.anInt1387 = 10;
				}
				if (Static38.anInt1387 != 10) {
					Static81.anInt2297++;
					if (Static81.anInt2297 > 2000) {
						if (Static44.anInt2759 < 1) {
							Static38.anInt1387 = 0;
							if (Static9.anInt418 == Static4.anInt2363) {
								Static4.anInt2363 = Static106.anInt2345;
							} else {
								Static4.anInt2363 = Static9.anInt418;
							}
							Static44.anInt2759++;
						} else {
							Static65.method1342(-3);
						}
					}
				} else if (Static19.aClass65_1.method2007() >= Static63.anInt1889) {
					Static13.aClass6_Sub1_Sub1_2.anInt2209 = 0;
					Static19.aClass65_1.method2015(Static13.aClass6_Sub1_Sub1_2.aByteArray11, Static63.anInt1889, 0);
					Static9.method356();
					Static35.anInt1334 = -1;
					Static47.method1019(false);
					Static47.anInt1514 = -1;
				}
			}
		} catch (@Pc(669) IOException local669) {
			if (Static44.anInt2759 < 1) {
				Static38.anInt1387 = 0;
				if (Static9.anInt418 == Static4.anInt2363) {
					Static4.anInt2363 = Static106.anInt2345;
				} else {
					Static4.anInt2363 = Static9.anInt418;
				}
				Static44.anInt2759++;
			} else {
				Static65.method1342(-2);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public static void method540(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub13 local11 = (Class6_Sub13) Static12.aClass38_8.method1183((long) arg0);
		if (local11 != null) {
			local11.method2083();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method544(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(3) String local3 = "";
			if (arg1 != null) {
				local3 = Static72.method1432(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local3 = local3 + " | ";
				}
				local3 = local3 + arg0;
			}
			System.out.println("Error: " + local3);
			local3 = local3.replace(':', '.');
			local3 = local3.replace('@', '_');
			local3 = local3.replace('&', '_');
			local3 = local3.replace('#', '_');
			@Pc(96) Class25 local96 = Static13.aClass20_2.method724(new URL(Static13.aClass20_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static46.anInt3209 + "&u=" + Static65.aLong69 + "&v1=" + Static25.aString4 + "&v2=" + Static25.aString1 + "&e=" + local3));
			while (local96.anInt1212 == 0) {
				Static58.method1193(1L);
			}
			if (local96.anInt1212 == 1) {
				@Pc(119) DataInputStream local119 = (DataInputStream) local96.anObject3;
				local119.read();
				local119.close();
			}
		} catch (@Pc(126) Exception local126) {
		}
	}
}
