import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public static int anInt2865;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "Lclient!ag;")
	public static Class4 aClass4_66;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array10;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
	public static int[] anIntArray266 = new int[2000];

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public static int anInt2854 = 0;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static int anInt2855 = 0;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_948 = Static161.method2971(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_949 = Static161.method2971("titlebutton");

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_950 = Static161.method2971("<col=ffffff>");

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_951 = Static161.method2971("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
	public static int[] anIntArray267 = new int[100];

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "Lclient!dd;")
	public static Class13 aClass13_952 = Static161.method2971("<)4col> x");

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Lclient!dd;")
	public static Class13 aClass13_953 = Static161.method2971("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Lclient!dd;")
	public static Class13 aClass13_954 = Static161.method2971("(U2");

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
	public static int anInt2871 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method2054() {
		try {
			if (Static79.anInt2248 == 0) {
				if (Static96.aClass62_4 != null) {
					Static96.aClass62_4.method2277();
					Static96.aClass62_4 = null;
				}
				Static133.aClass32_7 = null;
				Static79.anInt2248 = 1;
				Static97.anInt4167 = 0;
				Static47.aBoolean245 = false;
			}
			if (Static79.anInt2248 == 1) {
				if (Static133.aClass32_7 == null) {
					Static133.aClass32_7 = Static163.aClass16_5.method988(Static136.aString4, Static73.anInt2093);
				}
				if (Static133.aClass32_7.anInt1974 == 2) {
					throw new IOException();
				}
				if (Static133.aClass32_7.anInt1974 == 1) {
					Static96.aClass62_4 = new Class62((Socket) Static133.aClass32_7.anObject2, Static163.aClass16_5);
					Static79.anInt2248 = 2;
					Static133.aClass32_7 = null;
				}
			}
			if (Static79.anInt2248 == 2) {
				@Pc(73) long local73 = Static134.aLong112 = Static122.aClass13_1057.method878();
				Static1.aClass1_Sub8_Sub1_1.anInt2195 = 0;
				@Pc(83) int local83 = (int) (local73 >> 16 & 0x1FL);
				Static1.aClass1_Sub8_Sub1_1.method1643(14);
				Static1.aClass1_Sub8_Sub1_1.method1643(local83);
				Static96.aClass62_4.method2281(2, Static1.aClass1_Sub8_Sub1_1.aByteArray27);
				Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
				Static79.anInt2248 = 3;
			}
			@Pc(122) int local122;
			if (Static79.anInt2248 == 3) {
				if (Static20.aClass53_1 != null) {
					Static20.aClass53_1.method3055();
				}
				if (Static22.aClass53_3 != null) {
					Static22.aClass53_3.method3055();
				}
				local122 = Static96.aClass62_4.method2285();
				if (Static20.aClass53_1 != null) {
					Static20.aClass53_1.method3055();
				}
				if (Static22.aClass53_3 != null) {
					Static22.aClass53_3.method3055();
				}
				if (local122 != 0) {
					Static51.method1268(local122);
					return;
				}
				Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
				Static79.anInt2248 = 4;
			}
			if (Static79.anInt2248 == 4) {
				if (Static153.aClass1_Sub8_Sub1_2.anInt2195 < 8) {
					local122 = Static96.aClass62_4.method2280();
					if (8 - Static153.aClass1_Sub8_Sub1_2.anInt2195 < local122) {
						local122 = 8 - Static153.aClass1_Sub8_Sub1_2.anInt2195;
					}
					if (local122 > 0) {
						Static96.aClass62_4.method2279(local122, Static153.aClass1_Sub8_Sub1_2.aByteArray27, Static153.aClass1_Sub8_Sub1_2.anInt2195);
						Static153.aClass1_Sub8_Sub1_2.anInt2195 += local122;
					}
				}
				if (Static153.aClass1_Sub8_Sub1_2.anInt2195 == 8) {
					Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
					Static98.aLong134 = Static153.aClass1_Sub8_Sub1_2.method1616();
					Static79.anInt2248 = 5;
				}
			}
			if (Static79.anInt2248 == 5) {
				Static1.aClass1_Sub8_Sub1_1.anInt2195 = 0;
				@Pc(214) int[] local214 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static98.aLong134 >> 32), (int) Static98.aLong134 };
				Static1.aClass1_Sub8_Sub1_1.method1643(10);
				Static1.aClass1_Sub8_Sub1_1.method1635(local214[0]);
				Static1.aClass1_Sub8_Sub1_1.method1635(local214[1]);
				Static1.aClass1_Sub8_Sub1_1.method1635(local214[2]);
				Static1.aClass1_Sub8_Sub1_1.method1635(local214[3]);
				Static1.aClass1_Sub8_Sub1_1.method1625(Static122.aClass13_1057.method878());
				Static1.aClass1_Sub8_Sub1_1.method1639(Static122.aClass13_1065);
				Static1.aClass1_Sub8_Sub1_1.method1651(Static131.aBigInteger2, Static109.aBigInteger1);
				Static160.aClass1_Sub8_Sub1_3.anInt2195 = 0;
				if (Static2.anInt97 == 40) {
					Static160.aClass1_Sub8_Sub1_3.method1643(18);
				} else {
					Static160.aClass1_Sub8_Sub1_3.method1643(16);
				}
				Static160.aClass1_Sub8_Sub1_3.method1643(Static1.aClass1_Sub8_Sub1_1.anInt2195 + Static82.method1706(Static155.aClass13_1449) + 97);
				Static160.aClass1_Sub8_Sub1_3.method1635(487);
				Static160.aClass1_Sub8_Sub1_3.method1643(Static30.aBoolean72 ? 1 : 0);
				Static181.method2984(Static160.aClass1_Sub8_Sub1_3);
				Static160.aClass1_Sub8_Sub1_3.method1639(Static155.aClass13_1449);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static140.anInt3467);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static147.aClass4_Sub1_48.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static62.aClass4_Sub1_33.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static71.aClass4_Sub1_28.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static95.aClass4_Sub1_35.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static51.aClass4_Sub1_24.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static42.aClass4_Sub1_21.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static144.aClass4_Sub1_47.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static71.aClass4_Sub1_27.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static69.aClass4_Sub1_25.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static70.aClass4_Sub1_26.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static170.aClass4_Sub1_53.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static90.aClass4_Sub1_34.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static122.aClass4_Sub1_40.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static125.aClass4_Sub1_41.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static176.aClass4_Sub1_54.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1635(Static39.aClass4_Sub1_19.anInt3186);
				Static160.aClass1_Sub8_Sub1_3.method1623(Static1.aClass1_Sub8_Sub1_1.anInt2195, Static1.aClass1_Sub8_Sub1_1.aByteArray27);
				Static96.aClass62_4.method2281(Static160.aClass1_Sub8_Sub1_3.anInt2195, Static160.aClass1_Sub8_Sub1_3.aByteArray27);
				Static1.aClass1_Sub8_Sub1_1.method1660(local214);
				for (@Pc(437) int local437 = 0; local437 < 4; local437++) {
					local214[local437] += 50;
				}
				Static153.aClass1_Sub8_Sub1_2.method1660(local214);
				Static79.anInt2248 = 6;
			}
			if (Static79.anInt2248 == 6 && Static96.aClass62_4.method2280() > 0) {
				local122 = Static96.aClass62_4.method2285();
				if (local122 == 21 && Static2.anInt97 == 20) {
					Static79.anInt2248 = 7;
				} else if (local122 == 2) {
					Static79.anInt2248 = 9;
				} else if (local122 == 15 && Static2.anInt97 == 40) {
					Static157.method2693();
					return;
				} else if (local122 == 23 && Static141.anInt3501 < 1) {
					Static79.anInt2248 = 0;
					Static141.anInt3501++;
				} else {
					Static51.method1268(local122);
					return;
				}
			}
			if (Static79.anInt2248 == 7 && Static96.aClass62_4.method2280() > 0) {
				Static154.anInt3664 = Static96.aClass62_4.method2285() * 60 + 180;
				Static79.anInt2248 = 8;
			}
			if (Static79.anInt2248 == 8) {
				Static97.anInt4167 = 0;
				Static168.method2878(Static4.aClass13_36, Static46.aClass13_526, Static57.method1349(new Class13[] { Static3.method75(Static154.anInt3664 / 60), Static40.aClass13_448 }));
				if (--Static154.anInt3664 <= 0) {
					Static79.anInt2248 = 0;
				}
			} else {
				if (Static79.anInt2248 == 9 && Static96.aClass62_4.method2280() >= 9) {
					Static23.anInt1009 = Static96.aClass62_4.method2285();
					Static154.anInt3674 = Static96.aClass62_4.method2285();
					Static120.aBoolean234 = Static96.aClass62_4.method2285() == 1;
					Static26.anInt947 = Static96.aClass62_4.method2285();
					Static26.anInt947 <<= 0x8;
					Static26.anInt947 += Static96.aClass62_4.method2285();
					Static14.anInt485 = Static96.aClass62_4.method2285();
					Static96.aClass62_4.method2279(1, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
					Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
					Static184.anInt4077 = Static153.aClass1_Sub8_Sub1_2.method1663();
					Static96.aClass62_4.method2279(2, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
					Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
					Static89.anInt2506 = Static153.aClass1_Sub8_Sub1_2.method1642();
					Static79.anInt2248 = 10;
				}
				if (Static79.anInt2248 != 10) {
					Static97.anInt4167++;
					if (Static97.anInt4167 > 2000) {
						if (Static141.anInt3501 < 1) {
							if (Static73.anInt2093 == Static187.anInt4125) {
								Static73.anInt2093 = Static88.anInt2486;
							} else {
								Static73.anInt2093 = Static187.anInt4125;
							}
							Static141.anInt3501++;
							Static79.anInt2248 = 0;
						} else {
							Static51.method1268(-3);
						}
					}
				} else if (Static96.aClass62_4.method2280() >= Static89.anInt2506) {
					Static153.aClass1_Sub8_Sub1_2.anInt2195 = 0;
					Static96.aClass62_4.method2279(Static89.anInt2506, Static153.aClass1_Sub8_Sub1_2.aByteArray27, 0);
					Static6.method269();
					Static26.anInt960 = -1;
					Static40.method1044(false);
					Static184.anInt4077 = -1;
				}
			}
		} catch (@Pc(728) IOException local728) {
			if (Static141.anInt3501 < 1) {
				Static79.anInt2248 = 0;
				if (Static187.anInt4125 == Static73.anInt2093) {
					Static73.anInt2093 = Static88.anInt2486;
				} else {
					Static73.anInt2093 = Static187.anInt4125;
				}
				Static141.anInt3501++;
			} else {
				Static51.method1268(-2);
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method2057() {
		aClass13_950 = null;
		anIntArray267 = null;
		aClass1_Sub2_Sub1_Sub3Array10 = null;
		anIntArray266 = null;
		aClass13_952 = null;
		aClass13_949 = null;
		aClass13_948 = null;
		aClass13_953 = null;
		aClass13_954 = null;
		aClass13_951 = null;
		aClass4_66 = null;
	}
}
