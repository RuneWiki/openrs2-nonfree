import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!i", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!i", name = "Z", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!i", name = "bb", descriptor = "[Lclient!hb;")
	public static Class3_Sub9[] aClass3_Sub9Array1;

	@OriginalMember(owner = "client!i", name = "K", descriptor = "Lclient!sf;")
	public static Class66 aClass66_14 = new Class66(64);

	@OriginalMember(owner = "client!i", name = "L", descriptor = "Lclient!he;")
	public static Class26 aClass26_732 = Static6.method100("me");

	@OriginalMember(owner = "client!i", name = "M", descriptor = "I")
	public static int anInt1411 = 0;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "Lclient!he;")
	private static Class26 aClass26_737 = Static6.method100("flash1:");

	@OriginalMember(owner = "client!i", name = "S", descriptor = "Lclient!he;")
	public static Class26 aClass26_733 = aClass26_737;

	@OriginalMember(owner = "client!i", name = "U", descriptor = "Lclient!he;")
	public static Class26 aClass26_734 = Static6.method100("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!i", name = "W", descriptor = "Lclient!he;")
	public static Class26 aClass26_735 = Static6.method100("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!i", name = "X", descriptor = "I")
	public static volatile int anInt1414 = -1;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "Lclient!he;")
	public static Class26 aClass26_736 = aClass26_737;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method884(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static124.aClass70_1);
		arg0.removeMouseMotionListener(Static124.aClass70_1);
		arg0.removeFocusListener(Static124.aClass70_1);
		Static67.anInt2790 = 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
	public static void method886(@OriginalArg(0) int arg0) {
		Static3.anInt72 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(B)V")
	public static void method887() {
		try {
			if (Static5.anInt3221 == 0) {
				if (Static118.aClass76_4 != null) {
					Static118.aClass76_4.method2183();
					Static118.aClass76_4 = null;
				}
				Static58.anInt1799 = 0;
				Static4.aBoolean13 = false;
				Static27.aClass22_2 = null;
				Static5.anInt3221 = 1;
			}
			if (Static5.anInt3221 == 1) {
				if (Static27.aClass22_2 == null) {
					Static27.aClass22_2 = Static67.aClass75_4.method2178(Static42.aString2, Static105.anInt2845);
				}
				if (Static27.aClass22_2.anInt1200 == 2) {
					throw new IOException();
				}
				if (Static27.aClass22_2.anInt1200 == 1) {
					Static118.aClass76_4 = new Class76((Socket) Static27.aClass22_2.anObject3, Static67.aClass75_4);
					Static27.aClass22_2 = null;
					Static5.anInt3221 = 2;
				}
			}
			if (Static5.anInt3221 == 2) {
				@Pc(76) long local76 = Static40.aLong36 = Static55.aClass26_832.method820();
				@Pc(83) int local83 = (int) (local76 >> 16 & 0x1FL);
				Static107.aClass3_Sub11_Sub1_3.anInt1562 = 0;
				Static107.aClass3_Sub11_Sub1_3.method992(14);
				Static107.aClass3_Sub11_Sub1_3.method992(local83);
				Static118.aClass76_4.method2185(2, Static107.aClass3_Sub11_Sub1_3.aByteArray13);
				Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
				Static5.anInt3221 = 3;
			}
			@Pc(125) int local125;
			if (Static5.anInt3221 == 3) {
				if (Static19.aClass43_1 != null) {
					Static19.aClass43_1.method1909();
				}
				if (Static42.aClass43_2 != null) {
					Static42.aClass43_2.method1909();
				}
				local125 = Static118.aClass76_4.method2186();
				if (Static19.aClass43_1 != null) {
					Static19.aClass43_1.method1909();
				}
				if (Static42.aClass43_2 != null) {
					Static42.aClass43_2.method1909();
				}
				if (local125 != 0) {
					Static14.method244(local125);
					return;
				}
				Static5.anInt3221 = 4;
				Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
			}
			if (Static5.anInt3221 == 4) {
				if (Static33.aClass3_Sub11_Sub1_2.anInt1562 < 8) {
					local125 = Static118.aClass76_4.method2191();
					if (8 - Static33.aClass3_Sub11_Sub1_2.anInt1562 < local125) {
						local125 = 8 - Static33.aClass3_Sub11_Sub1_2.anInt1562;
					}
					if (local125 > 0) {
						Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, Static33.aClass3_Sub11_Sub1_2.anInt1562, local125);
						Static33.aClass3_Sub11_Sub1_2.anInt1562 += local125;
					}
				}
				if (Static33.aClass3_Sub11_Sub1_2.anInt1562 == 8) {
					Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
					Static30.aLong26 = Static33.aClass3_Sub11_Sub1_2.method980();
					Static5.anInt3221 = 5;
				}
			}
			if (Static5.anInt3221 == 5) {
				Static107.aClass3_Sub11_Sub1_3.anInt1562 = 0;
				@Pc(219) int[] local219 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static30.aLong26 >> 32), (int) Static30.aLong26 };
				Static107.aClass3_Sub11_Sub1_3.method992(10);
				Static107.aClass3_Sub11_Sub1_3.method1001(local219[0]);
				Static107.aClass3_Sub11_Sub1_3.method1001(local219[1]);
				Static107.aClass3_Sub11_Sub1_3.method1001(local219[2]);
				Static107.aClass3_Sub11_Sub1_3.method1001(local219[3]);
				Static107.aClass3_Sub11_Sub1_3.method1001(Static67.aClass75_4.anInt3184);
				Static107.aClass3_Sub11_Sub1_3.method1020(Static55.aClass26_832.method820());
				Static107.aClass3_Sub11_Sub1_3.method1024(Static55.aClass26_829);
				Static107.aClass3_Sub11_Sub1_3.method998(Static18.aBigInteger1, Static78.aBigInteger2);
				Static7.aClass3_Sub11_Sub1_1.anInt1562 = 0;
				if (Static89.anInt2466 == 40) {
					Static7.aClass3_Sub11_Sub1_1.method992(18);
				} else {
					Static7.aClass3_Sub11_Sub1_1.method992(16);
				}
				Static7.aClass3_Sub11_Sub1_1.method992(Static107.aClass3_Sub11_Sub1_3.anInt1562 + 69);
				Static7.aClass3_Sub11_Sub1_1.method1001(464);
				Static7.aClass3_Sub11_Sub1_1.method992(Static98.aBoolean151 ? 1 : 0);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static121.aClass16_Sub1_18.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static7.aClass16_Sub1_1.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static7.aClass16_Sub1_2.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static95.aClass16_Sub1_14.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static107.aClass16_Sub1_16.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static42.aClass16_Sub1_6.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static89.aClass16_Sub1_12.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static119.aClass16_Sub1_17.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static20.aClass16_Sub1_3.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static29.aClass16_Sub1_4.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static125.aClass16_Sub1_19.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static39.aClass16_Sub1_5.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static90.aClass16_Sub1_13.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static42.aClass16_Sub1_7.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static95.aClass16_Sub1_15.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method1001(Static66.aClass16_Sub1_11.anInt938);
				Static7.aClass3_Sub11_Sub1_1.method997(Static107.aClass3_Sub11_Sub1_3.aByteArray13, Static107.aClass3_Sub11_Sub1_3.anInt1562);
				Static118.aClass76_4.method2185(Static7.aClass3_Sub11_Sub1_1.anInt1562, Static7.aClass3_Sub11_Sub1_1.aByteArray13);
				Static107.aClass3_Sub11_Sub1_3.method1038(local219);
				for (@Pc(452) int local452 = 0; local452 < 4; local452++) {
					local219[local452] += 50;
				}
				Static33.aClass3_Sub11_Sub1_2.method1038(local219);
				Static5.anInt3221 = 6;
			}
			if (Static5.anInt3221 == 6 && Static118.aClass76_4.method2191() > 0) {
				local125 = Static118.aClass76_4.method2186();
				if (local125 == 21 && Static89.anInt2466 == 20) {
					Static5.anInt3221 = 7;
				} else if (local125 == 2) {
					Static5.anInt3221 = 9;
				} else if (local125 == 15 && Static89.anInt2466 == 40) {
					Static93.method1687();
					return;
				} else if (local125 == 23 && Static98.anInt2631 < 1) {
					Static5.anInt3221 = 0;
					Static98.anInt2631++;
				} else {
					Static14.method244(local125);
					return;
				}
			}
			if (Static5.anInt3221 == 7 && Static118.aClass76_4.method2191() > 0) {
				Static13.anInt353 = (Static118.aClass76_4.method2186() + 3) * 60;
				Static5.anInt3221 = 8;
			}
			if (Static5.anInt3221 == 8) {
				Static58.anInt1799 = 0;
				Static63.method1249(Static5.aClass26_1752, Static94.aClass26_1364, Static119.method2136(new Class26[] { Static122.method2170(Static13.anInt353 / 60), Static88.aClass26_1273 }));
				if (--Static13.anInt353 <= 0) {
					Static5.anInt3221 = 0;
				}
			} else {
				if (Static5.anInt3221 == 9 && Static118.aClass76_4.method2191() >= 8) {
					Static25.anInt3164 = Static118.aClass76_4.method2186();
					Static89.aBoolean136 = Static118.aClass76_4.method2186() == 1;
					Static4.anInt133 = Static118.aClass76_4.method2186();
					Static4.anInt133 <<= 0x8;
					Static4.anInt133 += Static118.aClass76_4.method2186();
					Static5.anInt3226 = Static118.aClass76_4.method2186();
					Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, 1);
					Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
					Static72.anInt2056 = Static33.aClass3_Sub11_Sub1_2.method1030();
					Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, 2);
					Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
					Static104.anInt2841 = Static33.aClass3_Sub11_Sub1_2.method974();
					Static5.anInt3221 = 10;
				}
				if (Static5.anInt3221 != 10) {
					Static58.anInt1799++;
					if (Static58.anInt1799 > 2000) {
						if (Static98.anInt2631 < 1) {
							Static98.anInt2631++;
							Static5.anInt3221 = 0;
							if (Static79.anInt2136 == Static105.anInt2845) {
								Static105.anInt2845 = Static43.anInt2678;
							} else {
								Static105.anInt2845 = Static79.anInt2136;
							}
						} else {
							Static14.method244(-3);
						}
					}
				} else if (Static118.aClass76_4.method2191() >= Static104.anInt2841) {
					Static33.aClass3_Sub11_Sub1_2.anInt1562 = 0;
					Static118.aClass76_4.method2188(Static33.aClass3_Sub11_Sub1_2.aByteArray13, 0, Static104.anInt2841);
					Static40.method784();
					Static88.anInt2447 = -1;
					Static110.method2002(false);
					Static72.anInt2056 = -1;
				}
			}
		} catch (@Pc(725) IOException local725) {
			if (Static98.anInt2631 < 1) {
				if (Static105.anInt2845 == Static79.anInt2136) {
					Static105.anInt2845 = Static43.anInt2678;
				} else {
					Static105.anInt2845 = Static79.anInt2136;
				}
				Static5.anInt3221 = 0;
				Static98.anInt2631++;
			} else {
				Static14.method244(-2);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(B)V")
	public static void method888() {
		aClass26_733 = null;
		aClass66_14 = null;
		anIntArray148 = null;
		aClass26_736 = null;
		aClass26_737 = null;
		aClass3_Sub9Array1 = null;
		aClass26_734 = null;
		aClass26_735 = null;
		aClass26_732 = null;
		aShortArrayArray3 = null;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(B)V")
	public static void method889() {
		Static52.aClass17_8 = new Class17(32);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!ae;")
	public static Class3_Sub1_Sub2 method891(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = (Class3_Sub1_Sub2) Static73.aClass66_18.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static15.aClass16_22.method566(1, arg0);
		local10 = new Class3_Sub1_Sub2();
		if (local20 != null) {
			local10.method97(arg0, new Class3_Sub11(local20));
		}
		local10.method104();
		Static73.aClass66_18.method1969((long) arg0, local10);
		return local10;
	}
}
