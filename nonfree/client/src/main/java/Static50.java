import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int anInt1470 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray5 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_715 = Static9.method266("AUS");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_716 = Static9.method266("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public static int anInt1475 = 0;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_717 = Static9.method266("(Udns");

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_718 = Static9.method266("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
	public static int[] anIntArray153 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!h;Lclient!h;B)V")
	public static void method912(@OriginalArg(0) Class1_Sub1_Sub2_Sub3_Sub1 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3_Sub1 arg1) {
		if (Static124.aClass1_Sub1_Sub2_Sub1Array9 == null) {
			Static124.aClass1_Sub1_Sub2_Sub1Array9 = Static27.method548(Static100.aClass34_1252, Static120.aClass34_1469, Static51.aClass35_Sub1_13);
		}
		if (Static34.aClass1_Sub1_Sub2_Sub2Array2 == null) {
			Static34.aClass1_Sub1_Sub2_Sub2Array2 = Static101.method1690(Static51.aClass35_Sub1_13, Static118.aClass34_1436, Static120.aClass34_1469);
		}
		if (Static93.aClass1_Sub1_Sub2_Sub2Array9 == null) {
			Static93.aClass1_Sub1_Sub2_Sub2Array9 = Static101.method1690(Static51.aClass35_Sub1_13, Static14.aClass34_306, Static120.aClass34_1469);
		}
		if (Static34.aClass1_Sub1_Sub2_Sub2Array1 == null) {
			Static34.aClass1_Sub1_Sub2_Sub2Array1 = Static101.method1690(Static51.aClass35_Sub1_13, Static43.aClass34_594, Static120.aClass34_1469);
		}
		Static111.method1747(0, 23, 765, 480, 0);
		Static111.method1765(0, 0, 125, 23, 12425273, 9135624);
		Static111.method1765(125, 0, 640, 23, 5197647, 2697513);
		arg0.method848(Static130.aClass34_735, 62, 15, 0, -1);
		if (Static34.aClass1_Sub1_Sub2_Sub2Array1 != null) {
			Static34.aClass1_Sub1_Sub2_Sub2Array1[1].method542(140, 1);
			arg1.method839(Static105.aClass34_1302, 152, 10, 16777215, -1);
			Static34.aClass1_Sub1_Sub2_Sub2Array1[0].method542(140, 12);
			arg1.method839(Static114.aClass34_1375, 152, 21, 16777215, -1);
		}
		if (Static93.aClass1_Sub1_Sub2_Sub2Array9 != null) {
			if (Static24.anIntArray82[0] == 0 && Static92.anIntArray306[0] == 0) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[2].method542(280, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[0].method542(280, 4);
			}
			if (Static24.anIntArray82[0] == 0 && Static92.anIntArray306[0] == 1) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[3].method542(295, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[1].method542(295, 4);
			}
			arg0.method839(Static98.aClass34_1245, 312, 17, 16777215, -1);
			if (Static24.anIntArray82[0] == 1 && Static92.anIntArray306[0] == 0) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[2].method542(390, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[0].method542(390, 4);
			}
			if (Static24.anIntArray82[0] == 1 && Static92.anIntArray306[0] == 1) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[3].method542(405, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[1].method542(405, 4);
			}
			arg0.method839(Static71.aClass34_874, 422, 17, 16777215, -1);
			if (Static24.anIntArray82[0] == 2 && Static92.anIntArray306[0] == 0) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[2].method542(500, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[0].method542(500, 4);
			}
			if (Static24.anIntArray82[0] == 2 && Static92.anIntArray306[0] == 1) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[3].method542(515, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[1].method542(515, 4);
			}
			arg0.method839(Static65.aClass34_813, 532, 17, 16777215, -1);
			if (Static24.anIntArray82[0] == 3 && Static92.anIntArray306[0] == 0) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[2].method542(610, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[0].method542(610, 4);
			}
			if (Static24.anIntArray82[0] == 3 && Static92.anIntArray306[0] == 1) {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[3].method542(625, 4);
			} else {
				Static93.aClass1_Sub1_Sub2_Sub2Array9[1].method542(625, 4);
			}
			arg0.method839(Static84.aClass34_1106, 642, 17, 16777215, -1);
		}
		Static111.method1747(708, 4, 50, 16, 0);
		arg1.method848(Static30.aClass34_447, 733, 16, 16777215, -1);
		Static8.anInt438 = -1;
		if (Static124.aClass1_Sub1_Sub2_Sub1Array9 != null) {
			@Pc(390) int local390 = 8;
			@Pc(396) int local396 = 24;
			@Pc(398) int local398;
			@Pc(400) int local400;
			do {
				local398 = local396;
				local400 = local390;
				if ((local390 - 1) * local396 >= Static43.anInt1240) {
					local390--;
				}
				if (Static43.anInt1240 <= (local396 - 1) * local390) {
					local396--;
				}
				if ((local396 - 1) * local390 >= Static43.anInt1240) {
					local396--;
				}
			} while (local396 != local398 || local390 != local400);
			local398 = (765 - local390 * 88) / (local390 + 1);
			if (local398 > 5) {
				local398 = 5;
			}
			@Pc(476) int local476 = (765 - local390 * 88 - local398 * (local390 + -1)) / 2;
			local400 = (480 - local396 * 19) / (local396 + 1);
			if (local400 > 5) {
				local400 = 5;
			}
			@Pc(496) int local496 = local476;
			@Pc(498) int local498 = 0;
			@Pc(513) int local513 = (480 - local396 * 19 - local400 * (local396 - 1)) / 2;
			@Pc(517) int local517 = local513 + 23;
			for (@Pc(519) int local519 = 0; local519 < Static43.anInt1240; local519++) {
				@Pc(525) Class18 local525 = Static71.aClass18Array1[local519];
				@Pc(530) Class34 local530 = Static85.method1456(local525.anInt894);
				@Pc(532) boolean local532 = true;
				if (local525.anInt894 == -1) {
					local530 = Static3.aClass34_124;
					local532 = false;
				} else if (local525.anInt894 > 1980) {
					local530 = Static95.aClass34_1204;
					local532 = false;
				}
				if (Static39.anInt1143 >= local496 && local517 <= Static19.anInt658 && local496 + 88 > Static39.anInt1143 && local517 + 19 > Static19.anInt658 && local532) {
					Static8.anInt438 = local519;
					Static124.aClass1_Sub1_Sub2_Sub1Array9[local525.aBoolean45 ? 1 : 0].method174(local496, local517);
				} else {
					Static124.aClass1_Sub1_Sub2_Sub1Array9[local525.aBoolean45 ? 1 : 0].method192(local496, local517);
				}
				if (Static34.aClass1_Sub1_Sub2_Sub2Array2 != null) {
					Static34.aClass1_Sub1_Sub2_Sub2Array2[local525.anInt892 + (local525.aBoolean45 ? 8 : 0)].method542(local496 + 29, local517);
				}
				arg0.method848(Static85.method1456(local525.anInt886), local496 + 15, local517 + 14, 0, -1);
				arg1.method848(local530, local496 + 60, 5 + 9 + local517, 268435455, -1);
				local517 += local400 + 19;
				local498++;
				if (local396 <= local498) {
					local517 = local513 + 23;
					local496 += local398 + 88;
					local498 = 0;
				}
			}
		}
		try {
			@Pc(686) Graphics local686 = Static7.aCanvas1.getGraphics();
			Static62.aClass6_1.method1355(local686);
		} catch (@Pc(694) Exception local694) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZII)V")
	public static void method913(@OriginalArg(1) boolean arg0) {
		Static121.aBoolean163 = arg0;
		Static55.anInt1571 = 2;
		Static12.anInt553 = 22050;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public static void method914(@OriginalArg(1) boolean arg0) {
		if (Static44.anInt1248 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7 && Static54.anInt1521 == Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7) {
			Static44.anInt1248 = 0;
		}
		@Pc(34) int local34 = Static40.anInt1154;
		if (arg0) {
			local34 = 1;
		}
		for (@Pc(40) int local40 = 0; local40 < local34; local40++) {
			@Pc(46) Class1_Sub1_Sub1_Sub1_Sub1 local46;
			@Pc(48) int local48;
			if (arg0) {
				local46 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1;
				local48 = 33538048;
			} else {
				local48 = Static102.anIntArray321[local40] << 14;
				local46 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[Static102.anIntArray321[local40]];
			}
			if (local46 != null && local46.method901()) {
				local46.aBoolean13 = false;
				@Pc(76) int local76 = local46.anInt1405 >> 7;
				@Pc(81) int local81 = local46.anInt1428 >> 7;
				if ((Static21.aBoolean39 && Static40.anInt1154 > 50 || Static40.anInt1154 > 200) && !arg0 && local46.anInt1446 == local46.anInt1409) {
					local46.aBoolean13 = true;
				}
				if (local81 >= 0 && local81 < 104 && local76 >= 0 && local76 < 104) {
					if (local46.aClass1_Sub1_Sub1_Sub2_1 == null || local46.anInt261 > Static73.anInt1947 || local46.anInt259 <= Static73.anInt1947) {
						if ((local46.anInt1428 & 0x7F) == 64 && (local46.anInt1405 & 0x7F) == 64) {
							if (Static13.anIntArrayArray1[local81][local76] == Static22.anInt778) {
								continue;
							}
							Static13.anIntArrayArray1[local81][local76] = Static22.anInt778;
						}
						local46.anInt255 = Static45.method1845(Static42.anInt1208, local46.anInt1405, local46.anInt1428);
						Static39.aClass44_1.method1150(Static42.anInt1208, local46.anInt1428, local46.anInt1405, local46.anInt255, 60, local46, local46.anInt1436, local48, local46.aBoolean80);
					} else {
						local46.aBoolean13 = false;
						local46.anInt255 = Static45.method1845(Static42.anInt1208, local46.anInt1405, local46.anInt1428);
						Static39.aClass44_1.method1173(Static42.anInt1208, local46.anInt1428, local46.anInt1405, local46.anInt255, local46, local46.anInt1436, local48, local46.anInt258, local46.anInt249, local46.anInt257, local46.anInt262);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method915() {
		try {
			if (Static38.anInt1131 == 0) {
				if (Static3.aClass51_1 != null) {
					Static3.aClass51_1.method1361();
					Static3.aClass51_1 = null;
				}
				Static38.anInt1131 = 1;
				Static72.aClass73_10 = null;
				anInt1470 = 0;
				Static100.aBoolean133 = false;
			}
			if (Static38.anInt1131 == 1) {
				if (Static72.aClass73_10 == null) {
					Static72.aClass73_10 = Static100.aClass15_4.method483(Static78.anInt2088, Static51.aString5);
				}
				if (Static72.aClass73_10.anInt2813 == 2) {
					throw new IOException();
				}
				if (Static72.aClass73_10.anInt2813 == 1) {
					Static3.aClass51_1 = new Class51((Socket) Static72.aClass73_10.anObject4, Static100.aClass15_4);
					Static72.aClass73_10 = null;
					Static38.anInt1131 = 2;
				}
			}
			if (Static38.anInt1131 == 2) {
				@Pc(68) long local68 = Static109.aLong161 = Static120.aClass34_1461.method965();
				@Pc(75) int local75 = (int) (local68 >> 16 & 0x1FL);
				Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
				Static21.aClass1_Sub19_Sub1_1.method2061(14);
				Static21.aClass1_Sub19_Sub1_1.method2061(local75);
				Static3.aClass51_1.method1362(Static21.aClass1_Sub19_Sub1_1.aByteArray42, 2);
				Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
				Static38.anInt1131 = 3;
			}
			@Pc(115) int local115;
			if (Static38.anInt1131 == 3) {
				if (Static98.aClass22_4 != null) {
					Static98.aClass22_4.method936();
				}
				if (Static127.aClass22_3 != null) {
					Static127.aClass22_3.method936();
				}
				local115 = Static3.aClass51_1.method1371();
				if (Static98.aClass22_4 != null) {
					Static98.aClass22_4.method936();
				}
				if (Static127.aClass22_3 != null) {
					Static127.aClass22_3.method936();
				}
				if (local115 != 0) {
					Static29.method552(local115);
					return;
				}
				Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
				Static38.anInt1131 = 4;
			}
			if (Static38.anInt1131 == 4) {
				if (Static51.aClass1_Sub19_Sub1_4.anInt3111 < 8) {
					local115 = Static3.aClass51_1.method1367();
					if (local115 > 8 - Static51.aClass1_Sub19_Sub1_4.anInt3111) {
						local115 = 8 - Static51.aClass1_Sub19_Sub1_4.anInt3111;
					}
					if (local115 > 0) {
						Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, local115, Static51.aClass1_Sub19_Sub1_4.anInt3111);
						Static51.aClass1_Sub19_Sub1_4.anInt3111 += local115;
					}
				}
				if (Static51.aClass1_Sub19_Sub1_4.anInt3111 == 8) {
					Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
					Static129.aLong158 = Static51.aClass1_Sub19_Sub1_4.method2089();
					Static38.anInt1131 = 5;
				}
			}
			if (Static38.anInt1131 == 5) {
				Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static129.aLong158 >> 32), (int) Static129.aLong158 };
				Static21.aClass1_Sub19_Sub1_1.method2061(10);
				Static21.aClass1_Sub19_Sub1_1.method2062(local215[0]);
				Static21.aClass1_Sub19_Sub1_1.method2062(local215[1]);
				Static21.aClass1_Sub19_Sub1_1.method2062(local215[2]);
				Static21.aClass1_Sub19_Sub1_1.method2062(local215[3]);
				Static21.aClass1_Sub19_Sub1_1.method2062(Static100.aClass15_4.anInt818);
				Static21.aClass1_Sub19_Sub1_1.method2073(Static120.aClass34_1461.method965());
				Static21.aClass1_Sub19_Sub1_1.method2050(Static120.aClass34_1468);
				Static21.aClass1_Sub19_Sub1_1.method2079(Static121.aBigInteger2, Static93.aBigInteger1);
				Static130.aClass1_Sub19_Sub1_5.anInt3111 = 0;
				if (Static44.anInt1247 == 40) {
					Static130.aClass1_Sub19_Sub1_5.method2061(18);
				} else {
					Static130.aClass1_Sub19_Sub1_5.method2061(16);
				}
				Static130.aClass1_Sub19_Sub1_5.method2061(Static21.aClass1_Sub19_Sub1_1.anInt3111 + 69);
				Static130.aClass1_Sub19_Sub1_5.method2062(463);
				Static130.aClass1_Sub19_Sub1_5.method2061(Static21.aBoolean39 ? 1 : 0);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static102.aClass35_Sub1_24.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static9.aClass35_Sub1_7.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static115.aClass35_Sub1_27.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static106.aClass35_Sub1_25.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static133.aClass35_Sub1_29.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static10.aClass35_Sub1_8.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static32.aClass35_Sub1_12.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static74.aClass35_Sub1_16.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static51.aClass35_Sub1_13.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static10.aClass35_Sub1_9.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static128.aClass35_Sub1_28.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static80.aClass35_Sub1_17.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static81.aClass35_Sub1_19.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static42.aClass35_Sub1_10.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static6.aClass35_Sub1_6.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2062(Static45.aClass35_Sub1_26.anInt2387);
				Static130.aClass1_Sub19_Sub1_5.method2045(Static21.aClass1_Sub19_Sub1_1.anInt3111, Static21.aClass1_Sub19_Sub1_1.aByteArray42);
				Static3.aClass51_1.method1362(Static130.aClass1_Sub19_Sub1_5.aByteArray42, Static130.aClass1_Sub19_Sub1_5.anInt3111);
				Static21.aClass1_Sub19_Sub1_1.method2103(local215);
				for (@Pc(426) int local426 = 0; local426 < 4; local426++) {
					local215[local426] += 50;
				}
				Static51.aClass1_Sub19_Sub1_4.method2103(local215);
				Static38.anInt1131 = 6;
			}
			if (Static38.anInt1131 == 6 && Static3.aClass51_1.method1367() > 0) {
				local115 = Static3.aClass51_1.method1371();
				if (local115 == 21 && Static44.anInt1247 == 20) {
					Static38.anInt1131 = 7;
				} else if (local115 == 2) {
					Static38.anInt1131 = 9;
				} else if (local115 == 15 && Static44.anInt1247 == 40) {
					Static105.method1720();
					return;
				} else if (local115 == 23 && Static46.anInt1326 < 1) {
					Static46.anInt1326++;
					Static38.anInt1131 = 0;
				} else {
					Static29.method552(local115);
					return;
				}
			}
			if (Static38.anInt1131 == 7 && Static3.aClass51_1.method1367() > 0) {
				Static62.anInt1671 = (Static3.aClass51_1.method1371() + 3) * 60;
				Static38.anInt1131 = 8;
			}
			if (Static38.anInt1131 == 8) {
				anInt1470 = 0;
				Static14.method345(Static91.method1554(new Class34[] { Static85.method1456(Static62.anInt1671 / 60), Static26.aClass34_416 }), Static39.aClass34_540, Static38.aClass34_527);
				if (--Static62.anInt1671 <= 0) {
					Static38.anInt1131 = 0;
				}
			} else {
				if (Static38.anInt1131 == 9 && Static3.aClass51_1.method1367() >= 8) {
					Static94.anInt2431 = Static3.aClass51_1.method1371();
					Static17.aBoolean30 = Static3.aClass51_1.method1371() == 1;
					Static119.anInt2838 = Static3.aClass51_1.method1371();
					Static119.anInt2838 <<= 0x8;
					Static119.anInt2838 += Static3.aClass51_1.method1371();
					Static70.anInt1850 = Static3.aClass51_1.method1371();
					Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, 1, 0);
					Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
					Static87.anInt2260 = Static51.aClass1_Sub19_Sub1_4.method2100();
					Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, 2, 0);
					Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
					Static81.anInt2134 = Static51.aClass1_Sub19_Sub1_4.method2051();
					Static38.anInt1131 = 10;
				}
				if (Static38.anInt1131 != 10) {
					anInt1470++;
					if (anInt1470 > 2000) {
						if (Static46.anInt1326 < 1) {
							Static46.anInt1326++;
							if (Static78.anInt2088 == Static55.anInt1525) {
								Static78.anInt2088 = Static106.anInt2604;
							} else {
								Static78.anInt2088 = Static55.anInt1525;
							}
							Static38.anInt1131 = 0;
						} else {
							Static29.method552(-3);
						}
					}
				} else if (Static3.aClass51_1.method1367() >= Static81.anInt2134) {
					Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
					Static3.aClass51_1.method1366(Static51.aClass1_Sub19_Sub1_4.aByteArray42, Static81.anInt2134, 0);
					Static9.method268();
					Static89.anInt1976 = -1;
					Static38.method679(false);
					Static87.anInt2260 = -1;
				}
			}
		} catch (@Pc(705) IOException local705) {
			if (Static46.anInt1326 < 1) {
				if (Static78.anInt2088 == Static55.anInt1525) {
					Static78.anInt2088 = Static106.anInt2604;
				} else {
					Static78.anInt2088 = Static55.anInt1525;
				}
				Static38.anInt1131 = 0;
				Static46.anInt1326++;
			} else {
				Static29.method552(-2);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
	public static void method916() {
		aShortArrayArray5 = null;
		aClass34_716 = null;
		aClass34_718 = null;
		anIntArray153 = null;
		aLongArray5 = null;
		aClass34_717 = null;
		anIntArrayArrayArray1 = null;
		aClass34_715 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!dd;BLclient!of;)V")
	public static void method917(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(3) Class1_Sub19 arg2) {
		@Pc(9) Class1_Sub2 local9 = new Class1_Sub2();
		local9.anInt439 = arg2.method2072();
		local9.anInt437 = arg2.method2046();
		local9.anIntArray34 = new int[local9.anInt439];
		local9.aByteArrayArrayArray4 = new byte[local9.anInt439][][];
		local9.anIntArray33 = new int[local9.anInt439];
		local9.aClass73Array1 = new Class73[local9.anInt439];
		local9.anIntArray32 = new int[local9.anInt439];
		local9.aClass73Array2 = new Class73[local9.anInt439];
		for (@Pc(58) int local58 = 0; local58 < local9.anInt439; local58++) {
			try {
				@Pc(64) int local64 = arg2.method2072();
				@Pc(94) String local94;
				@Pc(103) String local103;
				@Pc(107) int local107;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local94 = new String(arg2.method2084().method975());
					local103 = new String(arg2.method2084().method975());
					local107 = 0;
					if (local64 == 1) {
						local107 = arg2.method2046();
					}
					local9.anIntArray33[local58] = local64;
					local9.anIntArray34[local58] = local107;
					local9.aClass73Array1[local58] = arg1.method487(local103, Static23.method466(local94));
				} else if (local64 == 3 || local64 == 4) {
					local94 = new String(arg2.method2084().method975());
					local103 = new String(arg2.method2084().method975());
					local107 = arg2.method2072();
					@Pc(110) String[] local110 = new String[local107];
					for (@Pc(112) int local112 = 0; local112 < local107; local112++) {
						local110[local112] = new String(arg2.method2084().method975());
					}
					@Pc(132) byte[][] local132 = new byte[local107][];
					@Pc(145) int local145;
					if (local64 == 3) {
						for (@Pc(139) int local139 = 0; local139 < local107; local139++) {
							local145 = arg2.method2046();
							local132[local139] = new byte[local145];
							arg2.method2068(local145, local132[local139]);
						}
					}
					@Pc(169) Class[] local169 = new Class[local107];
					local9.anIntArray33[local58] = local64;
					for (local145 = 0; local145 < local107; local145++) {
						local169[local145] = Static23.method466(local110[local145]);
					}
					local9.aClass73Array2[local58] = arg1.method482(local103, Static23.method466(local94), local169);
					local9.aByteArrayArrayArray4[local58] = local132;
				}
			} catch (@Pc(259) ClassNotFoundException local259) {
				local9.anIntArray32[local58] = -1;
			} catch (@Pc(266) SecurityException local266) {
				local9.anIntArray32[local58] = -2;
			} catch (@Pc(273) NullPointerException local273) {
				local9.anIntArray32[local58] = -3;
			} catch (@Pc(280) Exception local280) {
				local9.anIntArray32[local58] = -4;
			} catch (@Pc(287) Throwable local287) {
				local9.anIntArray32[local58] = -5;
			}
		}
		Static97.aClass38_21.method1046(local9);
	}
}
