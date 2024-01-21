import java.awt.Component;
import java.awt.Frame;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt340;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "Lclient!v;")
	public static Class76 aClass76_145 = Static134.method2017("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!client", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_146 = Static134.method2017("Benutzername: ");

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!dd;")
	public static Class4_Sub8 aClass4_Sub8_1 = null;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!v;")
	public static Class76 aClass76_147 = Static134.method2017("sch-Utteln:");

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt341 = 0;

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
	public static boolean aBoolean19 = true;

	@OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
	public static void method229() {
		for (@Pc(10) Class4_Sub1 local10 = (Class4_Sub1) Static56.aClass78_6.method1916(); local10 != null; local10 = (Class4_Sub1) Static56.aClass78_6.method1920()) {
			if (local10.aClass4_Sub12_Sub3_1 != null) {
				Static14.aClass4_Sub12_Sub4_1.method1702(local10.aClass4_Sub12_Sub3_1);
				local10.aClass4_Sub12_Sub3_1 = null;
			}
			if (local10.aClass4_Sub12_Sub3_2 != null) {
				Static14.aClass4_Sub12_Sub4_1.method1702(local10.aClass4_Sub12_Sub3_2);
				local10.aClass4_Sub12_Sub3_2 = null;
			}
		}
		Static56.aClass78_6.method1923();
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method231() {
		Static30.anInt1437 = 0;
		Static32.anInt812 = 0;
		Static72.anInt1884 = -1;
		Static69.aClass4_Sub10_Sub1_2.anInt931 = 0;
		Static10.anInt206 = 0;
		Static62.anInt1613 = 0;
		Static5.anInt127 = -1;
		Static51.anInt2078 = 0;
		Static32.aBoolean56 = false;
		Static67.anInt1720 = 0;
		Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
		Static125.anInt2725 = -1;
		Static48.anInt1230 = -1;
		for (@Pc(43) int local43 = 0; local43 < Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1.length; local43++) {
			if (Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local43] != null) {
				Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local43].anInt1405 = -1;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1.length; local65++) {
			if (Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local65] != null) {
				Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local65].anInt1405 = -1;
			}
		}
		Static79.method584();
		Static73.method1363(30);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static70.aBooleanArray9[local88] = true;
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
	public static boolean method232() {
		@Pc(13) long local13 = Static42.method793();
		@Pc(19) int local19 = (int) (local13 - Static106.aLong81);
		if (local19 > 200) {
			local19 = 200;
		}
		Static106.aLong81 = local13;
		Static52.anInt1354 += local19;
		if (Static91.anInt2123 == 0 && Static121.anInt2620 == 0 && Static15.anInt255 == 0 && Static59.anInt1537 == 0) {
			return true;
		} else if (Static1.aClass75_1 == null) {
			return false;
		} else {
			try {
				if (Static52.anInt1354 > 30000) {
					throw new IOException();
				}
				@Pc(64) Class4_Sub4_Sub16 local64;
				@Pc(69) Class4_Sub10 local69;
				while (Static121.anInt2620 < 20 && Static59.anInt1537 > 0) {
					local64 = (Class4_Sub4_Sub16) Static111.aClass28_10.method775();
					local69 = new Class4_Sub10(4);
					local69.method600(1);
					local69.method577((int) local64.aLong99);
					Static1.aClass75_1.method1849(4, local69.aByteArray17);
					Static118.aClass28_13.method774(local64.aLong99, local64);
					Static59.anInt1537--;
					Static121.anInt2620++;
				}
				while (Static91.anInt2123 < 20 && Static15.anInt255 > 0) {
					local64 = (Class4_Sub4_Sub16) Static31.aClass83_1.method2023();
					local69 = new Class4_Sub10(4);
					local69.method600(0);
					local69.method577((int) local64.aLong99);
					Static1.aClass75_1.method1849(4, local69.aByteArray17);
					local64.method1944();
					Static94.aClass28_8.method774(local64.aLong99, local64);
					Static15.anInt255--;
					Static91.anInt2123++;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(168) int local168 = Static1.aClass75_1.method1844();
					if (local168 < 0) {
						throw new IOException();
					}
					if (local168 == 0) {
						break;
					}
					Static52.anInt1354 = 0;
					@Pc(183) byte local183 = 0;
					if (Static121.aClass4_Sub4_Sub16_1 == null) {
						local183 = 8;
					} else if (Static112.anInt2445 == 0) {
						local183 = 1;
					}
					@Pc(208) int local208;
					@Pc(212) int local212;
					@Pc(248) int local248;
					@Pc(319) int local319;
					if (local183 <= 0) {
						local208 = Static30.aClass4_Sub10_4.aByteArray17.length - Static121.aClass4_Sub4_Sub16_1.aByte8;
						local212 = 512 - Static112.anInt2445;
						if (local208 - Static30.aClass4_Sub10_4.anInt931 < local212) {
							local212 = local208 - Static30.aClass4_Sub10_4.anInt931;
						}
						if (local212 > local168) {
							local212 = local168;
						}
						Static1.aClass75_1.method1843(Static30.aClass4_Sub10_4.anInt931, Static30.aClass4_Sub10_4.aByteArray17, local212);
						if (Static61.aByte3 != 0) {
							for (local248 = 0; local248 < local212; local248++) {
								Static30.aClass4_Sub10_4.aByteArray17[Static30.aClass4_Sub10_4.anInt931 + local248] ^= Static61.aByte3;
							}
						}
						Static112.anInt2445 += local212;
						Static30.aClass4_Sub10_4.anInt931 += local212;
						if (Static30.aClass4_Sub10_4.anInt931 == local208) {
							if (Static121.aClass4_Sub4_Sub16_1.aLong99 == 16711935L) {
								Static34.aClass4_Sub10_3 = Static30.aClass4_Sub10_4;
								for (local248 = 0; local248 < 256; local248++) {
									@Pc(306) Class17_Sub1 local306 = Static32.aClass17_Sub1Array1[local248];
									if (local306 != null) {
										Static34.aClass4_Sub10_3.anInt931 = local248 * 8 + 5;
										local319 = Static34.aClass4_Sub10_3.method549();
										@Pc(323) int local323 = Static34.aClass4_Sub10_3.method549();
										local306.method305(local323, local319);
									}
								}
							} else {
								Static10.aCRC32_1.reset();
								Static10.aCRC32_1.update(Static30.aClass4_Sub10_4.aByteArray17, 0, local208);
								local248 = (int) Static10.aCRC32_1.getValue();
								if (Static121.aClass4_Sub4_Sub16_1.anInt2557 != local248) {
									try {
										Static1.aClass75_1.method1842();
									} catch (@Pc(357) Exception local357) {
									}
									Static1.aClass75_1 = null;
									Static115.anInt2500++;
									Static61.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static115.anInt2500 = 0;
								Static85.anInt2051 = 0;
								Static121.aClass4_Sub4_Sub16_1.aClass17_Sub1_19.method315(Static30.aClass4_Sub10_4.aByteArray17, (Static121.aClass4_Sub4_Sub16_1.aLong99 & 0xFF0000L) == 16711680L, (int) (Static121.aClass4_Sub4_Sub16_1.aLong99 & 0xFFFFL), Static56.aBoolean87);
							}
							Static121.aClass4_Sub4_Sub16_1.method2004();
							Static30.aClass4_Sub10_4 = null;
							Static121.aClass4_Sub4_Sub16_1 = null;
							if (Static56.aBoolean87) {
								Static121.anInt2620--;
							} else {
								Static91.anInt2123--;
							}
							Static112.anInt2445 = 0;
						} else {
							if (Static112.anInt2445 != 512) {
								break;
							}
							Static112.anInt2445 = 0;
						}
					} else {
						local208 = local183 - Static74.aClass4_Sub10_6.anInt931;
						if (local168 < local208) {
							local208 = local168;
						}
						Static1.aClass75_1.method1843(Static74.aClass4_Sub10_6.anInt931, Static74.aClass4_Sub10_6.aByteArray17, local208);
						if (Static61.aByte3 != 0) {
							for (local212 = 0; local212 < local208; local212++) {
								Static74.aClass4_Sub10_6.aByteArray17[local212 + Static74.aClass4_Sub10_6.anInt931] ^= Static61.aByte3;
							}
						}
						Static74.aClass4_Sub10_6.anInt931 += local208;
						if (Static74.aClass4_Sub10_6.anInt931 < local183) {
							break;
						}
						if (Static121.aClass4_Sub4_Sub16_1 == null) {
							Static74.aClass4_Sub10_6.anInt931 = 0;
							local212 = Static74.aClass4_Sub10_6.method599();
							local248 = Static74.aClass4_Sub10_6.method604();
							@Pc(523) int local523 = Static74.aClass4_Sub10_6.method599();
							local319 = Static74.aClass4_Sub10_6.method549();
							@Pc(534) long local534 = (long) (local248 + (local212 << 16));
							@Pc(540) Class4_Sub4_Sub16 local540 = (Class4_Sub4_Sub16) Static118.aClass28_13.method770(local534);
							Static56.aBoolean87 = true;
							if (local540 == null) {
								local540 = (Class4_Sub4_Sub16) Static94.aClass28_8.method770(local534);
								Static56.aBoolean87 = false;
							}
							if (local540 == null) {
								throw new IOException();
							}
							@Pc(564) int local564 = local523 == 0 ? 5 : 9;
							Static121.aClass4_Sub4_Sub16_1 = local540;
							Static30.aClass4_Sub10_4 = new Class4_Sub10(local319 + local564 + Static121.aClass4_Sub4_Sub16_1.aByte8);
							Static30.aClass4_Sub10_4.method600(local523);
							Static30.aClass4_Sub10_4.method597(local319);
							Static74.aClass4_Sub10_6.anInt931 = 0;
							Static112.anInt2445 = 8;
						} else if (Static112.anInt2445 == 0) {
							if (Static74.aClass4_Sub10_6.aByteArray17[0] == -1) {
								Static74.aClass4_Sub10_6.anInt931 = 0;
								Static112.anInt2445 = 1;
							} else {
								Static121.aClass4_Sub4_Sub16_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(621) IOException local621) {
				try {
					Static1.aClass75_1.method1842();
				} catch (@Pc(626) Exception local626) {
				}
				Static1.aClass75_1 = null;
				Static85.anInt2051++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)Lclient!mb;")
	public static Class4_Sub4_Sub5_Sub3_Sub1 method234(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class4_Sub4_Sub5_Sub3_Sub1 local23 = new Class4_Sub4_Sub5_Sub3_Sub1(arg0, Static31.anIntArray96, Static102.anIntArray321, Static34.anIntArray107, Static25.anIntArray80, Static49.anIntArray159, Static38.aByteArrayArray3);
			Static57.method1000();
			return local23;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method235(@OriginalArg(1) Component arg0) {
		@Pc(13) Method local13 = Static16.aMethod1;
		if (local13 != null) {
			try {
				local13.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(27) Throwable local27) {
			}
		}
		arg0.addKeyListener(Static6.aClass53_1);
		arg0.addFocusListener(Static6.aClass53_1);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method236() {
		aClass76_146 = null;
		aClass76_145 = null;
		aClass4_Sub8_1 = null;
		aFrame1 = null;
		aClass76_147 = null;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method237() {
		for (@Pc(13) int local13 = 0; local13 < Static48.anInt1228; local13++) {
			@Pc(19) int local19 = Static60.anIntArray201[local13];
			@Pc(23) Class4_Sub4_Sub3_Sub1_Sub1 local23 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local19];
			@Pc(27) int local27 = Static24.aClass4_Sub10_Sub1_1.method599();
			if ((local27 & 0x2) != 0) {
				local23.aClass76_607 = Static24.aClass4_Sub10_Sub1_1.method581();
				local23.anInt1381 = 100;
			}
			@Pc(50) int local50;
			@Pc(59) int local59;
			if ((local27 & 0x1) != 0) {
				local50 = Static24.aClass4_Sub10_Sub1_1.method604();
				if (local50 == 65535) {
					local50 = -1;
				}
				local59 = Static24.aClass4_Sub10_Sub1_1.method594();
				if (local50 == local23.anInt1390 && local50 != -1) {
					@Pc(75) int local75 = Static118.method1796(local50).anInt1563;
					if (local75 == 1) {
						local23.anInt1385 = 0;
						local23.anInt1415 = 0;
						local23.anInt1423 = 0;
						local23.anInt1417 = local59;
					}
					if (local75 == 2) {
						local23.anInt1423 = 0;
					}
				} else if (local50 == -1 || local23.anInt1390 == -1 || Static118.method1796(local50).anInt1552 >= Static118.method1796(local23.anInt1390).anInt1552) {
					local23.anInt1404 = local23.anInt1434;
					local23.anInt1390 = local50;
					local23.anInt1423 = 0;
					local23.anInt1415 = 0;
					local23.anInt1385 = 0;
					local23.anInt1417 = local59;
				}
			}
			if ((local27 & 0x4) != 0) {
				local23.anInt1439 = Static24.aClass4_Sub10_Sub1_1.method604();
				local50 = Static24.aClass4_Sub10_Sub1_1.method554();
				local23.anInt1394 = 0;
				local23.anInt1396 = Static78.anInt1981 + (local50 & 0xFFFF);
				local23.anInt1401 = local50 >> 16;
				if (local23.anInt1439 == 65535) {
					local23.anInt1439 = -1;
				}
				local23.anInt1428 = 0;
				if (Static78.anInt1981 < local23.anInt1396) {
					local23.anInt1428 = -1;
				}
			}
			if ((local27 & 0x10) != 0) {
				local23.anInt1414 = Static24.aClass4_Sub10_Sub1_1.method593();
				local23.anInt1418 = Static24.aClass4_Sub10_Sub1_1.method604();
			}
			if ((local27 & 0x8) != 0) {
				local23.aClass4_Sub4_Sub10_1 = Static88.method1465(Static24.aClass4_Sub10_Sub1_1.method593());
				local23.anInt1389 = local23.aClass4_Sub4_Sub10_1.anInt1698;
				local23.anInt1384 = local23.aClass4_Sub4_Sub10_1.anInt1692;
				local23.anInt1431 = local23.aClass4_Sub4_Sub10_1.anInt1708;
				local23.anInt1388 = local23.aClass4_Sub4_Sub10_1.anInt1701;
				local23.anInt1435 = local23.aClass4_Sub4_Sub10_1.anInt1702;
				local23.anInt1430 = local23.aClass4_Sub4_Sub10_1.anInt1697;
				local23.anInt1426 = local23.aClass4_Sub4_Sub10_1.anInt1717;
				local23.anInt1412 = local23.aClass4_Sub4_Sub10_1.anInt1716;
				local23.anInt1382 = local23.aClass4_Sub4_Sub10_1.anInt1706;
			}
			if ((local27 & 0x80) != 0) {
				local23.anInt1405 = Static24.aClass4_Sub10_Sub1_1.method563();
				if (local23.anInt1405 == 65535) {
					local23.anInt1405 = -1;
				}
			}
			if ((local27 & 0x40) != 0) {
				local50 = Static24.aClass4_Sub10_Sub1_1.method599();
				local59 = Static24.aClass4_Sub10_Sub1_1.method598();
				local23.method971(Static78.anInt1981, local59, local50);
				local23.anInt1380 = Static78.anInt1981 + 300;
				local23.anInt1383 = Static24.aClass4_Sub10_Sub1_1.method594();
				local23.anInt1411 = Static24.aClass4_Sub10_Sub1_1.method596();
			}
			if ((local27 & 0x20) != 0) {
				local50 = Static24.aClass4_Sub10_Sub1_1.method594();
				local59 = Static24.aClass4_Sub10_Sub1_1.method599();
				local23.method971(Static78.anInt1981, local59, local50);
				local23.anInt1380 = Static78.anInt1981 + 300;
				local23.anInt1383 = Static24.aClass4_Sub10_Sub1_1.method598();
				local23.anInt1411 = Static24.aClass4_Sub10_Sub1_1.method598();
			}
		}
	}
}
