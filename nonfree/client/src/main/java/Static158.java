import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "[Lclient!rc;")
	public static Class2_Sub2_Sub16[] aClass2_Sub2_Sub16Array16;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!i;")
	private static Class41 aClass41_996 = Static184.method2923("Members object");

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_995 = aClass41_996;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
	public static int anInt3725 = 0;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
	public static int anInt3732 = 0;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "Z")
	public static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!uj;")
	public static Class22 method2566(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class22_Sub2");
			@Pc(10) Class22 local10 = (Class22) local6.getDeclaredConstructor().newInstance();
			local10.method1214(arg2, arg0, arg1);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class22_Sub1 local28 = new Class22_Sub1();
			local28.method1214(arg2, arg0, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method2568() {
		try {
			if (Static103.anInt2513 == 0) {
				if (Static30.aClass63_1 != null) {
					Static30.aClass63_1.method2043();
					Static30.aClass63_1 = null;
				}
				Static5.anInt276 = 0;
				Static103.anInt2513 = 1;
				Static53.aBoolean83 = false;
				Static85.aClass75_4 = null;
			}
			if (Static103.anInt2513 == 1) {
				if (Static85.aClass75_4 == null) {
					Static85.aClass75_4 = Static111.aClass83_2.method2619(Static83.aString3, Static151.anInt3442);
				}
				if (Static85.aClass75_4.anInt3346 == 2) {
					throw new IOException();
				}
				if (Static85.aClass75_4.anInt3346 == 1) {
					Static30.aClass63_1 = new Class63((Socket) Static85.aClass75_4.anObject3, Static111.aClass83_2);
					Static103.anInt2513 = 2;
					Static85.aClass75_4 = null;
				}
			}
			if (Static103.anInt2513 == 2) {
				@Pc(68) long local68 = Static34.aLong23 = Static185.aClass41_1117.method1419();
				Static131.aClass2_Sub3_Sub1_2.anInt239 = 0;
				Static131.aClass2_Sub3_Sub1_2.method208(14);
				@Pc(82) int local82 = (int) (local68 >> 16 & 0x1FL);
				Static131.aClass2_Sub3_Sub1_2.method208(local82);
				Static30.aClass63_1.method2037(2, Static131.aClass2_Sub3_Sub1_2.aByteArray4);
				Static103.anInt2513 = 3;
				Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
			}
			@Pc(115) int local115;
			if (Static103.anInt2513 == 3) {
				if (Static25.aClass31_7 != null) {
					Static25.aClass31_7.method1502();
				}
				if (Static100.aClass31_4 != null) {
					Static100.aClass31_4.method1502();
				}
				local115 = Static30.aClass63_1.method2042();
				if (Static25.aClass31_7 != null) {
					Static25.aClass31_7.method1502();
				}
				if (Static100.aClass31_4 != null) {
					Static100.aClass31_4.method1502();
				}
				if (local115 != 0) {
					Static52.method1008(local115);
					return;
				}
				Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
				Static103.anInt2513 = 4;
			}
			if (Static103.anInt2513 == 4) {
				if (Static204.aClass2_Sub3_Sub1_3.anInt239 < 8) {
					local115 = Static30.aClass63_1.method2035();
					if (8 - Static204.aClass2_Sub3_Sub1_3.anInt239 < local115) {
						local115 = 8 - Static204.aClass2_Sub3_Sub1_3.anInt239;
					}
					if (local115 > 0) {
						Static30.aClass63_1.method2039(Static204.aClass2_Sub3_Sub1_3.anInt239, Static204.aClass2_Sub3_Sub1_3.aByteArray4, local115);
						Static204.aClass2_Sub3_Sub1_3.anInt239 += local115;
					}
				}
				if (Static204.aClass2_Sub3_Sub1_3.anInt239 == 8) {
					Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
					Static30.aLong18 = Static204.aClass2_Sub3_Sub1_3.method183();
					Static103.anInt2513 = 5;
				}
			}
			if (Static103.anInt2513 == 5) {
				Static131.aClass2_Sub3_Sub1_2.anInt239 = 0;
				@Pc(202) int[] local202 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static30.aLong18 >> 32), (int) Static30.aLong18 };
				Static131.aClass2_Sub3_Sub1_2.method208(10);
				Static131.aClass2_Sub3_Sub1_2.method200(local202[0]);
				Static131.aClass2_Sub3_Sub1_2.method200(local202[1]);
				Static131.aClass2_Sub3_Sub1_2.method200(local202[2]);
				Static131.aClass2_Sub3_Sub1_2.method200(local202[3]);
				Static131.aClass2_Sub3_Sub1_2.method190(Static185.aClass41_1117.method1419());
				Static131.aClass2_Sub3_Sub1_2.method198(Static185.aClass41_1118);
				Static131.aClass2_Sub3_Sub1_2.method173(Static29.aBigInteger1, Static53.aBigInteger2);
				Static28.aClass2_Sub3_Sub1_1.anInt239 = 0;
				if (Static203.anInt4533 == 40) {
					Static28.aClass2_Sub3_Sub1_1.method208(18);
				} else {
					Static28.aClass2_Sub3_Sub1_1.method208(16);
				}
				Static28.aClass2_Sub3_Sub1_1.method208(Static131.aClass2_Sub3_Sub1_2.anInt239 + Static14.method296(Static193.aClass41_1043) + 141);
				Static28.aClass2_Sub3_Sub1_1.method200(500);
				Static28.aClass2_Sub3_Sub1_1.method208(Static217.aBoolean290 ? 1 : 0);
				Static4.method80(Static28.aClass2_Sub3_Sub1_1);
				Static28.aClass2_Sub3_Sub1_1.method198(Static193.aClass41_1043);
				Static28.aClass2_Sub3_Sub1_1.method200(Static4.anInt108);
				Static28.aClass2_Sub3_Sub1_1.method200(Static60.aClass15_Sub1_138.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static198.aClass15_Sub1_122.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static74.aClass15_Sub1_48.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static78.aClass15_Sub1_49.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static11.aClass15_Sub1_12.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static25.aClass15_Sub1_137.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static86.aClass15_Sub1_57.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static207.aClass15_Sub1_130.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static200.aClass15_Sub1_125.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static59.aClass15_Sub1_40.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static8.aClass15_Sub1_10.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static118.aClass15_Sub1_75.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static17.aClass15_Sub1_15.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static85.aClass15_Sub1_56.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static17.aClass15_Sub1_14.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static132.aClass15_Sub1_79.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static95.aClass15_Sub1_62.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static168.aClass15_Sub1_103.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static146.aClass15_Sub1_88.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static220.aClass15_Sub1_139.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static173.aClass15_Sub1_109.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static16.aClass15_Sub1_13.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static211.aClass15_Sub1_134.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static115.aClass15_Sub1_105.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static18.aClass15_Sub1_17.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static179.aClass15_Sub1_111.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method200(Static140.aClass15_Sub1_85.anInt570);
				Static28.aClass2_Sub3_Sub1_1.method187(Static131.aClass2_Sub3_Sub1_2.anInt239, Static131.aClass2_Sub3_Sub1_2.aByteArray4);
				Static30.aClass63_1.method2037(Static28.aClass2_Sub3_Sub1_1.anInt239, Static28.aClass2_Sub3_Sub1_1.aByteArray4);
				Static131.aClass2_Sub3_Sub1_2.method227(local202);
				for (@Pc(481) int local481 = 0; local481 < 4; local481++) {
					local202[local481] += 50;
				}
				Static204.aClass2_Sub3_Sub1_3.method227(local202);
				Static103.anInt2513 = 6;
			}
			if (Static103.anInt2513 == 6 && Static30.aClass63_1.method2035() > 0) {
				local115 = Static30.aClass63_1.method2042();
				if (local115 == 21 && Static203.anInt4533 == 20) {
					Static103.anInt2513 = 7;
				} else if (local115 == 2) {
					Static103.anInt2513 = 9;
				} else if (local115 == 15 && Static203.anInt4533 == 40) {
					Static123.method796();
					return;
				} else if (local115 == 23 && Static173.anInt4080 < 1) {
					Static173.anInt4080++;
					Static103.anInt2513 = 0;
				} else {
					Static52.method1008(local115);
					return;
				}
			}
			if (Static103.anInt2513 == 7 && Static30.aClass63_1.method2035() > 0) {
				Static210.anInt4698 = (Static30.aClass63_1.method2042() + 3) * 60;
				Static103.anInt2513 = 8;
			}
			if (Static103.anInt2513 == 8) {
				Static5.anInt276 = 0;
				Static32.method629(Static149.method2324(new Class41[] { Static152.method2471(Static210.anInt4698 / 60), Static112.aClass41_776 }), Static96.aClass41_703, Static124.aClass41_829);
				if (--Static210.anInt4698 <= 0) {
					Static103.anInt2513 = 0;
				}
			} else {
				if (Static103.anInt2513 == 9 && Static30.aClass63_1.method2035() >= 9) {
					Static60.anInt4780 = Static30.aClass63_1.method2042();
					Static27.anInt2299 = Static30.aClass63_1.method2042();
					Static211.anInt4700 = Static30.aClass63_1.method2042();
					if (Static211.anInt4700 == 1) {
						try {
							Static54.aClass41_450.method1417(Static111.aClass83_2.anApplet1);
						} catch (@Pc(650) Throwable local650) {
						}
					} else {
						try {
							Static161.aClass41_1009.method1417(Static111.aClass83_2.anApplet1);
						} catch (@Pc(660) Throwable local660) {
						}
					}
					anInt3725 = Static30.aClass63_1.method2042();
					Static52.aBoolean76 = Static30.aClass63_1.method2042() == 1;
					Static195.anInt4428 = Static30.aClass63_1.method2042();
					Static195.anInt4428 <<= 0x8;
					Static195.anInt4428 += Static30.aClass63_1.method2042();
					Static5.anInt277 = Static30.aClass63_1.method2042();
					Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, 1);
					Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
					Static211.anInt4701 = Static204.aClass2_Sub3_Sub1_3.method224();
					Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, 2);
					Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
					Static202.anInt1733 = Static204.aClass2_Sub3_Sub1_3.method163();
					Static103.anInt2513 = 10;
				}
				if (Static103.anInt2513 != 10) {
					Static5.anInt276++;
					if (Static5.anInt276 > 2000) {
						if (Static173.anInt4080 < 1) {
							Static173.anInt4080++;
							Static103.anInt2513 = 0;
							if (Static195.anInt4421 == Static151.anInt3442) {
								Static151.anInt3442 = Static45.anInt1335;
							} else {
								Static151.anInt3442 = Static195.anInt4421;
							}
						} else {
							Static52.method1008(-3);
						}
					}
				} else if (Static30.aClass63_1.method2035() >= Static202.anInt1733) {
					Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
					Static30.aClass63_1.method2039(0, Static204.aClass2_Sub3_Sub1_3.aByteArray4, Static202.anInt1733);
					Static93.method1625();
					Static125.anInt1525 = -1;
					Static39.method822(false);
					Static211.anInt4701 = -1;
				}
			}
		} catch (@Pc(787) IOException local787) {
			if (Static173.anInt4080 < 1) {
				Static173.anInt4080++;
				Static103.anInt2513 = 0;
				if (Static195.anInt4421 == Static151.anInt3442) {
					Static151.anInt3442 = Static45.anInt1335;
				} else {
					Static151.anInt3442 = Static195.anInt4421;
				}
			} else {
				Static52.method1008(-2);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!nb;I)Lclient!sh;")
	public static Class2_Sub25 method2573(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method406(arg1);
		return local9 == null ? null : new Class2_Sub25(local9);
	}
}
