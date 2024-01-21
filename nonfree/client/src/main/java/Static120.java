import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array9;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!t;")
	public static Class2_Sub17_Sub1 aClass2_Sub17_Sub1_3 = new Class2_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1166 = Static2.method59("Choose Option");

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1169 = Static2.method59("You have only just left another world)3");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1167 = aClass80_1169;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1168 = Static2.method59("p11_full");

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
	public static int anInt3077 = 0;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!i;")
	public static Class32 aClass32_55 = new Class32(64);

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1170 = aClass80_1166;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1171 = Static2.method59("Members only world");

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1172 = aClass80_1171;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public static int anInt3078 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method1953() {
		try {
			if (Static74.anInt1962 == 0) {
				if (Static44.aClass10_2 != null) {
					Static44.aClass10_2.method255();
					Static44.aClass10_2 = null;
				}
				Static74.anInt1962 = 1;
				Static83.anInt2044 = 0;
				Static53.aClass56_4 = null;
				Static85.aBoolean155 = false;
			}
			if (Static74.anInt1962 == 1) {
				if (Static53.aClass56_4 == null) {
					Static53.aClass56_4 = Static9.aClass74_1.method1868(Static42.anInt1256, Static65.aString1);
				}
				if (Static53.aClass56_4.anInt2056 == 2) {
					throw new IOException();
				}
				if (Static53.aClass56_4.anInt2056 == 1) {
					Static44.aClass10_2 = new Class10((Socket) Static53.aClass56_4.anObject2, Static9.aClass74_1);
					Static53.aClass56_4 = null;
					Static74.anInt1962 = 2;
				}
			}
			if (Static74.anInt1962 == 2) {
				@Pc(72) long local72 = Static30.aLong28 = Static79.aClass80_786.method2023();
				aClass2_Sub17_Sub1_3.anInt2799 = 0;
				aClass2_Sub17_Sub1_3.method1769(14);
				@Pc(86) int local86 = (int) (local72 >> 16 & 0x1FL);
				aClass2_Sub17_Sub1_3.method1769(local86);
				Static44.aClass10_2.method256(aClass2_Sub17_Sub1_3.aByteArray38, 2);
				Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
				Static74.anInt1962 = 3;
			}
			@Pc(119) int local119;
			if (Static74.anInt1962 == 3) {
				if (Static107.aClass29_2 != null) {
					Static107.aClass29_2.method1274();
				}
				if (Static1.aClass29_1 != null) {
					Static1.aClass29_1.method1274();
				}
				local119 = Static44.aClass10_2.method254();
				if (Static107.aClass29_2 != null) {
					Static107.aClass29_2.method1274();
				}
				if (Static1.aClass29_1 != null) {
					Static1.aClass29_1.method1274();
				}
				if (local119 != 0) {
					Static107.method1823(local119);
					return;
				}
				Static74.anInt1962 = 4;
				Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
			}
			if (Static74.anInt1962 == 4) {
				if (Static100.aClass2_Sub17_Sub1_1.anInt2799 < 8) {
					local119 = Static44.aClass10_2.method259();
					if (8 - Static100.aClass2_Sub17_Sub1_1.anInt2799 < local119) {
						local119 = 8 - Static100.aClass2_Sub17_Sub1_1.anInt2799;
					}
					if (local119 > 0) {
						Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, local119, Static100.aClass2_Sub17_Sub1_1.anInt2799);
						Static100.aClass2_Sub17_Sub1_1.anInt2799 += local119;
					}
				}
				if (Static100.aClass2_Sub17_Sub1_1.anInt2799 == 8) {
					Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
					Static2.aLong5 = Static100.aClass2_Sub17_Sub1_1.method1792();
					Static74.anInt1962 = 5;
				}
			}
			if (Static74.anInt1962 == 5) {
				aClass2_Sub17_Sub1_3.anInt2799 = 0;
				@Pc(209) int[] local209 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static2.aLong5 >> 32), (int) Static2.aLong5 };
				aClass2_Sub17_Sub1_3.method1769(10);
				aClass2_Sub17_Sub1_3.method1765(local209[0]);
				aClass2_Sub17_Sub1_3.method1765(local209[1]);
				aClass2_Sub17_Sub1_3.method1765(local209[2]);
				aClass2_Sub17_Sub1_3.method1765(local209[3]);
				aClass2_Sub17_Sub1_3.method1765(Static9.aClass74_1.anInt2952);
				aClass2_Sub17_Sub1_3.method1772(Static79.aClass80_786.method2023());
				aClass2_Sub17_Sub1_3.method1754(Static79.aClass80_794);
				aClass2_Sub17_Sub1_3.method1763(Static38.aBigInteger9, Static28.aBigInteger11);
				Static113.aClass2_Sub17_Sub1_2.anInt2799 = 0;
				if (Static114.anInt2934 == 40) {
					Static113.aClass2_Sub17_Sub1_2.method1769(18);
				} else {
					Static113.aClass2_Sub17_Sub1_2.method1769(16);
				}
				Static113.aClass2_Sub17_Sub1_2.method1769(aClass2_Sub17_Sub1_3.anInt2799 + 69);
				Static113.aClass2_Sub17_Sub1_2.method1765(454);
				Static113.aClass2_Sub17_Sub1_2.method1769(Static18.aBoolean51 ? 1 : 0);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static108.aClass11_Sub1_20.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static93.aClass11_Sub1_15.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static103.aClass11_Sub1_16.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static105.aClass11_Sub1_14.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static90.aClass11_Sub1_13.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static8.aClass11_Sub1_2.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static29.aClass11_Sub1_7.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static33.aClass11_Sub1_8.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static57.aClass11_Sub1_11.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static118.aClass11_Sub1_21.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static40.aClass11_Sub1_10.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static37.aClass11_Sub1_9.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static4.aClass11_Sub1_1.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static125.aClass11_Sub1_19.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static8.aClass11_Sub1_3.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1765(Static15.aClass11_Sub1_4.anInt720);
				Static113.aClass2_Sub17_Sub1_2.method1773(aClass2_Sub17_Sub1_3.aByteArray38, aClass2_Sub17_Sub1_3.anInt2799);
				Static44.aClass10_2.method256(Static113.aClass2_Sub17_Sub1_2.aByteArray38, Static113.aClass2_Sub17_Sub1_2.anInt2799);
				aClass2_Sub17_Sub1_3.method1811(local209);
				for (@Pc(422) int local422 = 0; local422 < 4; local422++) {
					local209[local422] += 50;
				}
				Static100.aClass2_Sub17_Sub1_1.method1811(local209);
				Static74.anInt1962 = 6;
			}
			if (Static74.anInt1962 == 6 && Static44.aClass10_2.method259() > 0) {
				local119 = Static44.aClass10_2.method254();
				if (local119 == 21 && Static114.anInt2934 == 20) {
					Static74.anInt1962 = 7;
				} else if (local119 == 2) {
					Static74.anInt1962 = 9;
				} else if (local119 == 15 && Static114.anInt2934 == 40) {
					Static28.method1424();
					return;
				} else if (local119 == 23 && Static6.anInt168 < 1) {
					Static6.anInt168++;
					Static74.anInt1962 = 0;
				} else {
					Static107.method1823(local119);
					return;
				}
			}
			if (Static74.anInt1962 == 7 && Static44.aClass10_2.method259() > 0) {
				Static55.anInt1306 = Static44.aClass10_2.method254() * 60 + 180;
				Static74.anInt1962 = 8;
			}
			if (Static74.anInt1962 == 8) {
				Static83.anInt2044 = 0;
				Static85.method1264(aClass80_1167, Static93.method1444(new Class80[] { Static28.method1422(Static55.anInt1306 / 60), Static85.aClass80_827 }), Static113.aClass80_1107);
				if (--Static55.anInt1306 <= 0) {
					Static74.anInt1962 = 0;
				}
			} else {
				if (Static74.anInt1962 == 9 && Static44.aClass10_2.method259() >= 8) {
					Static57.anInt1738 = Static44.aClass10_2.method254();
					Static98.aBoolean195 = Static44.aClass10_2.method254() == 1;
					Static28.anInt2311 = Static44.aClass10_2.method254();
					Static28.anInt2311 <<= 0x8;
					Static28.anInt2311 += Static44.aClass10_2.method254();
					Static6.anInt170 = Static44.aClass10_2.method254();
					Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, 1, 0);
					Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
					Static10.anInt298 = Static100.aClass2_Sub17_Sub1_1.method1809();
					Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, 2, 0);
					Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
					Static65.anInt1843 = Static100.aClass2_Sub17_Sub1_1.method1783();
					Static74.anInt1962 = 10;
				}
				if (Static74.anInt1962 != 10) {
					Static83.anInt2044++;
					if (Static83.anInt2044 > 2000) {
						if (Static6.anInt168 < 1) {
							Static6.anInt168++;
							if (Static29.anInt1069 == Static42.anInt1256) {
								Static42.anInt1256 = Static112.anInt2923;
							} else {
								Static42.anInt1256 = Static29.anInt1069;
							}
							Static74.anInt1962 = 0;
						} else {
							Static107.method1823(-3);
						}
					}
				} else if (Static44.aClass10_2.method259() >= Static65.anInt1843) {
					Static100.aClass2_Sub17_Sub1_1.anInt2799 = 0;
					Static44.aClass10_2.method257(Static100.aClass2_Sub17_Sub1_1.aByteArray38, Static65.anInt1843, 0);
					Static119.method1002();
					Static119.anInt1677 = -1;
					Static106.method1802(false);
					Static10.anInt298 = -1;
				}
			}
		} catch (@Pc(706) IOException local706) {
			if (Static6.anInt168 < 1) {
				if (Static29.anInt1069 == Static42.anInt1256) {
					Static42.anInt1256 = Static112.anInt2923;
				} else {
					Static42.anInt1256 = Static29.anInt1069;
				}
				Static6.anInt168++;
				Static74.anInt1962 = 0;
			} else {
				Static107.method1823(-2);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)V")
	public static void method1954() {
		aClass80_1167 = null;
		anIntArray402 = null;
		aClass2_Sub1_Sub9_Sub3Array9 = null;
		aClass32_55 = null;
		aClass80_1172 = null;
		aClass2_Sub17_Sub1_3 = null;
		aClass80_1168 = null;
		aClass80_1166 = null;
		aClass80_1169 = null;
		aClass80_1170 = null;
		aClass80_1171 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Z")
	public static boolean method1955(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	public static int method1956(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(15) int local15 = method1956(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			return local15;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}
}
