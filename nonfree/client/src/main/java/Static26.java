import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_17;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	public static int anInt736 = 0;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "[Lclient!ng;")
	public static Class57[] aClass57Array1 = new Class57[50];

	@OriginalMember(owner = "client!client", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray7 = new int[5][5000];

	@OriginalMember(owner = "client!client", name = "U", descriptor = "Lclient!cd;")
	public static Class10 aClass10_341 = Static51.method932("::fpson");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!sa;")
	public static Class72 aClass72_5 = new Class72(64);

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
	public static void method587() {
		aClass72_5 = null;
		aClass10_341 = null;
		aClass57Array1 = null;
		anIntArrayArray7 = null;
		aClass29_Sub1_17 = null;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method588() {
		try {
			if (Static149.anInt3226 == 0) {
				if (Static98.aClass34_5 != null) {
					Static98.aClass34_5.method1136();
					Static98.aClass34_5 = null;
				}
				Static149.anInt3226 = 1;
				Static60.anInt1504 = 0;
				Static144.aClass15_8 = null;
				Static167.aBoolean86 = false;
			}
			if (Static149.anInt3226 == 1) {
				if (Static144.aClass15_8 == null) {
					Static144.aClass15_8 = Static57.aClass63_4.method1960(Static159.anInt3394, Static87.aString1);
				}
				if (Static144.aClass15_8.anInt821 == 2) {
					throw new IOException();
				}
				if (Static144.aClass15_8.anInt821 == 1) {
					Static98.aClass34_5 = new Class34((Socket) Static144.aClass15_8.anObject2, Static57.aClass63_4);
					Static149.anInt3226 = 2;
					Static144.aClass15_8 = null;
				}
			}
			if (Static149.anInt3226 == 2) {
				@Pc(68) long local68 = Static85.aLong66 = Static95.aClass10_951.method363();
				Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1439(14);
				@Pc(82) int local82 = (int) (local68 >> 16 & 0x1FL);
				Static141.aClass2_Sub11_Sub1_3.method1439(local82);
				Static98.aClass34_5.method1130(2, Static141.aClass2_Sub11_Sub1_3.aByteArray24);
				Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
				Static149.anInt3226 = 3;
			}
			@Pc(117) int local117;
			if (Static149.anInt3226 == 3) {
				if (Static71.aClass82_2 != null) {
					Static71.aClass82_2.method2638();
				}
				if (Static38.aClass82_1 != null) {
					Static38.aClass82_1.method2638();
				}
				local117 = Static98.aClass34_5.method1132();
				if (Static71.aClass82_2 != null) {
					Static71.aClass82_2.method2638();
				}
				if (Static38.aClass82_1 != null) {
					Static38.aClass82_1.method2638();
				}
				if (local117 != 0) {
					Static58.method1075(local117);
					return;
				}
				Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
				Static149.anInt3226 = 4;
			}
			if (Static149.anInt3226 == 4) {
				if (Static75.aClass2_Sub11_Sub1_1.anInt2077 < 8) {
					local117 = Static98.aClass34_5.method1135();
					if (local117 > 8 - Static75.aClass2_Sub11_Sub1_1.anInt2077) {
						local117 = 8 - Static75.aClass2_Sub11_Sub1_1.anInt2077;
					}
					if (local117 > 0) {
						Static98.aClass34_5.method1134(Static75.aClass2_Sub11_Sub1_1.anInt2077, local117, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
						Static75.aClass2_Sub11_Sub1_1.anInt2077 += local117;
					}
				}
				if (Static75.aClass2_Sub11_Sub1_1.anInt2077 == 8) {
					Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
					Static137.aLong105 = Static75.aClass2_Sub11_Sub1_1.method1476();
					Static149.anInt3226 = 5;
				}
			}
			if (Static149.anInt3226 == 5) {
				Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
				@Pc(206) int[] local206 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static137.aLong105 >> 32), (int) Static137.aLong105 };
				Static141.aClass2_Sub11_Sub1_3.method1439(10);
				Static141.aClass2_Sub11_Sub1_3.method1445(local206[0]);
				Static141.aClass2_Sub11_Sub1_3.method1445(local206[1]);
				Static141.aClass2_Sub11_Sub1_3.method1445(local206[2]);
				Static141.aClass2_Sub11_Sub1_3.method1445(local206[3]);
				Static141.aClass2_Sub11_Sub1_3.method1458(Static95.aClass10_951.method363());
				Static141.aClass2_Sub11_Sub1_3.method1450(Static95.aClass10_945);
				Static141.aClass2_Sub11_Sub1_3.method1468(Static89.aBigInteger1, Static124.aBigInteger2);
				Static100.aClass2_Sub11_Sub1_2.anInt2077 = 0;
				if (Static49.anInt1185 == 40) {
					Static100.aClass2_Sub11_Sub1_2.method1439(18);
				} else {
					Static100.aClass2_Sub11_Sub1_2.method1439(16);
				}
				Static100.aClass2_Sub11_Sub1_2.method1439(Static141.aClass2_Sub11_Sub1_3.anInt2077 + 93);
				Static100.aClass2_Sub11_Sub1_2.method1445(473);
				Static100.aClass2_Sub11_Sub1_2.method1439(Static170.aBoolean163 ? 1 : 0);
				Static47.method879(Static100.aClass2_Sub11_Sub1_2);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static117.aClass29_Sub1_39.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static20.aClass29_Sub1_13.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static58.aClass29_Sub1_24.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static14.aClass29_Sub1_10.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static102.aClass29_Sub1_50.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static76.aClass29_Sub1_27.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static170.aClass29_Sub1_51.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static56.aClass29_Sub1_23.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(aClass29_Sub1_17.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static1.aClass29_Sub1_1.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static101.aClass29_Sub1_34.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static115.aClass29_Sub1_37.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static7.aClass29_Sub1_7.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static162.aClass29_Sub1_48.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static148.aClass29_Sub1_46.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1445(Static8.aClass29_Sub1_8.anInt1389);
				Static100.aClass2_Sub11_Sub1_2.method1441(Static141.aClass2_Sub11_Sub1_3.anInt2077, Static141.aClass2_Sub11_Sub1_3.aByteArray24);
				Static98.aClass34_5.method1130(Static100.aClass2_Sub11_Sub1_2.anInt2077, Static100.aClass2_Sub11_Sub1_2.aByteArray24);
				Static141.aClass2_Sub11_Sub1_3.method1496(local206);
				for (@Pc(433) int local433 = 0; local433 < 4; local433++) {
					local206[local433] += 50;
				}
				Static75.aClass2_Sub11_Sub1_1.method1496(local206);
				Static149.anInt3226 = 6;
			}
			if (Static149.anInt3226 == 6 && Static98.aClass34_5.method1135() > 0) {
				local117 = Static98.aClass34_5.method1132();
				if (local117 == 21 && Static49.anInt1185 == 20) {
					Static149.anInt3226 = 7;
				} else if (local117 == 2) {
					Static149.anInt3226 = 9;
				} else if (local117 == 15 && Static49.anInt1185 == 40) {
					Static46.method877();
					return;
				} else if (local117 == 23 && Static81.anInt1870 < 1) {
					Static149.anInt3226 = 0;
					Static81.anInt1870++;
				} else {
					Static58.method1075(local117);
					return;
				}
			}
			if (Static149.anInt3226 == 7 && Static98.aClass34_5.method1135() > 0) {
				Static158.anInt3380 = (Static98.aClass34_5.method1132() + 3) * 60;
				Static149.anInt3226 = 8;
			}
			if (Static149.anInt3226 == 8) {
				Static60.anInt1504 = 0;
				Static160.method2426(Static178.aClass10_1615, Static3.method36(new Class10[] { Static164.method2485(Static158.anInt3380 / 60), Static178.aClass10_1614 }), Static32.aClass10_400);
				if (--Static158.anInt3380 <= 0) {
					Static149.anInt3226 = 0;
				}
			} else {
				if (Static149.anInt3226 == 9 && Static98.aClass34_5.method1135() >= 8) {
					Static92.anInt2191 = Static98.aClass34_5.method1132();
					Static1.aBoolean1 = Static98.aClass34_5.method1132() == 1;
					Static14.anInt385 = Static98.aClass34_5.method1132();
					Static14.anInt385 <<= 0x8;
					Static14.anInt385 += Static98.aClass34_5.method1132();
					Static163.anInt3514 = Static98.aClass34_5.method1132();
					Static98.aClass34_5.method1134(0, 1, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
					Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
					Static55.anInt1420 = Static75.aClass2_Sub11_Sub1_1.method1492();
					Static98.aClass34_5.method1134(0, 2, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
					Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
					Static174.anInt3743 = Static75.aClass2_Sub11_Sub1_1.method1456();
					Static149.anInt3226 = 10;
				}
				if (Static149.anInt3226 != 10) {
					Static60.anInt1504++;
					if (Static60.anInt1504 > 2000) {
						if (Static81.anInt1870 < 1) {
							Static149.anInt3226 = 0;
							if (Static63.anInt1563 == Static159.anInt3394) {
								Static159.anInt3394 = Static103.anInt2370;
							} else {
								Static159.anInt3394 = Static63.anInt1563;
							}
							Static81.anInt1870++;
						} else {
							Static58.method1075(-3);
						}
					}
				} else if (Static98.aClass34_5.method1135() >= Static174.anInt3743) {
					Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
					Static98.aClass34_5.method1134(0, Static174.anInt3743, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
					Static144.method2264();
					Static55.anInt1413 = -1;
					Static1.method6(false);
					Static55.anInt1420 = -1;
				}
			}
		} catch (@Pc(725) IOException local725) {
			if (Static81.anInt1870 < 1) {
				Static149.anInt3226 = 0;
				Static81.anInt1870++;
				if (Static63.anInt1563 == Static159.anInt3394) {
					Static159.anInt3394 = Static103.anInt2370;
				} else {
					Static159.anInt3394 = Static63.anInt1563;
				}
			} else {
				Static58.method1075(-2);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(II)Lclient!cd;")
	public static Class10 method590(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static164.method2485(arg0) : Static102.aClass10_1545;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(II)I")
	public static int method592(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub1_Sub14 local7 = Static15.method243(arg0);
		@Pc(10) int local10 = local7.anInt2948;
		@Pc(17) int local17 = local7.anInt2940;
		@Pc(20) int local20 = local7.anInt2945;
		@Pc(27) int local27 = Applet_Sub1.anIntArray59[local17 - local20];
		return local27 & Static51.anIntArray143[local10] >> local20;
	}
}
