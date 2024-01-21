import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
	public static int anInt2640;

	@OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
	public static int anInt2639 = 0;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
	public static int anInt2641 = 0;

	@OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	public static void method1858() {
		if (Static98.aClass71_1 != null) {
			@Pc(3) Class71 local3 = Static98.aClass71_1;
			synchronized (Static98.aClass71_1) {
				Static98.aClass71_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ua;II)V")
	public static void method1859(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static114.aClass1_Sub18_4 == null) {
			Static58.method1041(255, 255, null, 0, (byte) 0, true);
			Static122.aClass62_Sub1Array1[arg1] = arg0;
		} else {
			Static114.aClass1_Sub18_4.anInt3078 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static114.aClass1_Sub18_4.method2185();
			@Pc(20) int local20 = Static114.aClass1_Sub18_4.method2185();
			arg0.method2030(local16, local20);
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 method1860() {
		@Pc(3) Class1_Sub1_Sub4_Sub1 local3 = new Class1_Sub1_Sub4_Sub1();
		local3.anInt873 = Static95.anInt2872;
		local3.anInt872 = Static113.anIntArray436[0];
		local3.aByteArray24 = Static81.aByteArrayArray8[0];
		local3.anInt871 = Static21.anIntArray107[0];
		local3.anInt870 = Static2.anIntArray21[0];
		local3.anInt869 = Static64.anIntArray244[0];
		local3.anIntArray126 = Static23.anIntArray116;
		local3.anInt874 = Static41.anInt3022;
		Static52.method964();
		return local3;
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(B)V")
	public static void method1861() {
		try {
			if (Static92.anInt2169 == 0) {
				if (Static29.aClass74_1 != null) {
					Static29.aClass74_1.method2047();
					Static29.aClass74_1 = null;
				}
				Static92.anInt2169 = 1;
				Static24.aBoolean67 = false;
				Static18.anInt617 = 0;
				Static54.aClass34_2 = null;
			}
			if (Static92.anInt2169 == 1) {
				if (Static54.aClass34_2 == null) {
					Static54.aClass34_2 = Static92.aClass79_2.method2089(Static72.anInt1808, Static25.aString1);
				}
				if (Static54.aClass34_2.anInt1567 == 2) {
					throw new IOException();
				}
				if (Static54.aClass34_2.anInt1567 == 1) {
					Static29.aClass74_1 = new Class74((Socket) Static54.aClass34_2.anObject2, Static92.aClass79_2);
					Static92.anInt2169 = 2;
					Static54.aClass34_2 = null;
				}
			}
			if (Static92.anInt2169 == 2) {
				@Pc(75) long local75 = Static33.aLong23 = Static38.aClass39_546.method1186();
				@Pc(82) int local82 = (int) (local75 >> 16 & 0x1FL);
				Static103.aClass1_Sub18_Sub1_5.anInt3078 = 0;
				Static103.aClass1_Sub18_Sub1_5.method2168(14);
				Static103.aClass1_Sub18_Sub1_5.method2168(local82);
				Static29.aClass74_1.method2055(Static103.aClass1_Sub18_Sub1_5.aByteArray96, 2);
				Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
				Static92.anInt2169 = 3;
			}
			@Pc(124) int local124;
			if (Static92.anInt2169 == 3) {
				if (Static65.aClass26_2 != null) {
					Static65.aClass26_2.method1926();
				}
				if (Static19.aClass26_1 != null) {
					Static19.aClass26_1.method1926();
				}
				local124 = Static29.aClass74_1.method2051();
				if (Static65.aClass26_2 != null) {
					Static65.aClass26_2.method1926();
				}
				if (Static19.aClass26_1 != null) {
					Static19.aClass26_1.method1926();
				}
				if (local124 != 0) {
					Static18.method357(local124);
					return;
				}
				Static92.anInt2169 = 4;
				Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
			}
			if (Static92.anInt2169 == 4) {
				if (Static79.aClass1_Sub18_Sub1_3.anInt3078 < 8) {
					local124 = Static29.aClass74_1.method2048();
					if (local124 > 8 - Static79.aClass1_Sub18_Sub1_3.anInt3078) {
						local124 = 8 - Static79.aClass1_Sub18_Sub1_3.anInt3078;
					}
					if (local124 > 0) {
						Static29.aClass74_1.method2049(Static79.aClass1_Sub18_Sub1_3.anInt3078, Static79.aClass1_Sub18_Sub1_3.aByteArray96, local124);
						Static79.aClass1_Sub18_Sub1_3.anInt3078 += local124;
					}
				}
				if (Static79.aClass1_Sub18_Sub1_3.anInt3078 == 8) {
					Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
					Static108.aLong87 = Static79.aClass1_Sub18_Sub1_3.method2182();
					Static92.anInt2169 = 5;
				}
			}
			if (Static92.anInt2169 == 5) {
				Static103.aClass1_Sub18_Sub1_5.anInt3078 = 0;
				@Pc(214) int[] local214 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static108.aLong87 >> 32), (int) Static108.aLong87 };
				Static103.aClass1_Sub18_Sub1_5.method2168(10);
				Static103.aClass1_Sub18_Sub1_5.method2149(local214[0]);
				Static103.aClass1_Sub18_Sub1_5.method2149(local214[1]);
				Static103.aClass1_Sub18_Sub1_5.method2149(local214[2]);
				Static103.aClass1_Sub18_Sub1_5.method2149(local214[3]);
				Static103.aClass1_Sub18_Sub1_5.method2149(Static92.aClass79_2.anInt3006);
				Static103.aClass1_Sub18_Sub1_5.method2179(Static38.aClass39_546.method1186());
				Static103.aClass1_Sub18_Sub1_5.method2165(Static38.aClass39_535);
				Static103.aClass1_Sub18_Sub1_5.method2136(Static98.aBigInteger2, Static34.aBigInteger1);
				Static100.aClass1_Sub18_Sub1_4.anInt3078 = 0;
				if (Static1.anInt62 == 40) {
					Static100.aClass1_Sub18_Sub1_4.method2168(18);
				} else {
					Static100.aClass1_Sub18_Sub1_4.method2168(16);
				}
				Static100.aClass1_Sub18_Sub1_4.method2168(Static103.aClass1_Sub18_Sub1_5.anInt3078 + 69);
				Static100.aClass1_Sub18_Sub1_4.method2149(457);
				Static100.aClass1_Sub18_Sub1_4.method2168(Static68.aBoolean149 ? 1 : 0);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static40.aClass62_Sub1_32.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static129.aClass62_Sub1_77.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static31.aClass62_Sub1_26.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static34.aClass62_Sub1_28.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static103.aClass62_Sub1_66.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static126.aClass62_Sub1_75.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static77.aClass62_Sub1_53.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static120.aClass62_Sub1_76.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static4.aClass62_Sub1_7.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static35.aClass62_Sub1_29.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static9.aClass62_Sub1_73.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static29.aClass62_Sub1_24.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static75.aClass62_Sub1_50.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static68.aClass62_Sub1_47.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static20.aClass62_Sub1_18.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2149(Static57.aClass62_Sub1_42.anInt2877);
				Static100.aClass1_Sub18_Sub1_4.method2176(Static103.aClass1_Sub18_Sub1_5.anInt3078, Static103.aClass1_Sub18_Sub1_5.aByteArray96);
				Static29.aClass74_1.method2055(Static100.aClass1_Sub18_Sub1_4.aByteArray96, Static100.aClass1_Sub18_Sub1_4.anInt3078);
				Static103.aClass1_Sub18_Sub1_5.method2194(local214);
				for (@Pc(425) int local425 = 0; local425 < 4; local425++) {
					local214[local425] += 50;
				}
				Static79.aClass1_Sub18_Sub1_3.method2194(local214);
				Static92.anInt2169 = 6;
			}
			if (Static92.anInt2169 == 6 && Static29.aClass74_1.method2048() > 0) {
				local124 = Static29.aClass74_1.method2051();
				if (local124 == 21 && Static1.anInt62 == 20) {
					Static92.anInt2169 = 7;
				} else if (local124 == 2) {
					Static92.anInt2169 = 9;
				} else if (local124 == 15 && Static1.anInt62 == 40) {
					Static1.method44();
					return;
				} else if (local124 == 23 && Static95.anInt2898 < 1) {
					Static95.anInt2898++;
					Static92.anInt2169 = 0;
				} else {
					Static18.method357(local124);
					return;
				}
			}
			if (Static92.anInt2169 == 7 && Static29.aClass74_1.method2048() > 0) {
				Static67.anInt1739 = (Static29.aClass74_1.method2051() + 3) * 60;
				Static92.anInt2169 = 8;
			}
			if (Static92.anInt2169 == 8) {
				Static18.anInt617 = 0;
				Static38.method688(Static66.aClass39_847, Static30.method601(new Class39[] { Static69.method1226(Static67.anInt1739 / 60), Static127.aClass39_1535 }), Static20.aClass39_350);
				if (--Static67.anInt1739 <= 0) {
					Static92.anInt2169 = 0;
				}
			} else {
				if (Static92.anInt2169 == 9 && Static29.aClass74_1.method2048() >= 8) {
					Static58.anInt1566 = Static29.aClass74_1.method2051();
					Static90.aBoolean177 = Static29.aClass74_1.method2051() == 1;
					Static69.anInt1770 = Static29.aClass74_1.method2051();
					Static69.anInt1770 <<= 0x8;
					Static69.anInt1770 += Static29.aClass74_1.method2051();
					anInt2641 = Static29.aClass74_1.method2051();
					Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, 1);
					Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
					Static121.anInt2967 = Static79.aClass1_Sub18_Sub1_3.method2201();
					Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, 2);
					Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
					Static72.anInt1801 = Static79.aClass1_Sub18_Sub1_3.method2156();
					Static92.anInt2169 = 10;
				}
				if (Static92.anInt2169 != 10) {
					Static18.anInt617++;
					if (Static18.anInt617 > 2000) {
						if (Static95.anInt2898 < 1) {
							Static92.anInt2169 = 0;
							Static95.anInt2898++;
							if (Static30.anInt1001 == Static72.anInt1808) {
								Static72.anInt1808 = Static21.anInt738;
							} else {
								Static72.anInt1808 = Static30.anInt1001;
							}
						} else {
							Static18.method357(-3);
						}
					}
				} else if (Static29.aClass74_1.method2048() >= Static72.anInt1801) {
					Static79.aClass1_Sub18_Sub1_3.anInt3078 = 0;
					Static29.aClass74_1.method2049(0, Static79.aClass1_Sub18_Sub1_3.aByteArray96, Static72.anInt1801);
					Static26.method513();
					Static8.anInt430 = -1;
					Static89.method1477(false);
					Static121.anInt2967 = -1;
				}
			}
		} catch (@Pc(697) IOException local697) {
			if (Static95.anInt2898 < 1) {
				Static92.anInt2169 = 0;
				if (Static30.anInt1001 == Static72.anInt1808) {
					Static72.anInt1808 = Static21.anInt738;
				} else {
					Static72.anInt1808 = Static30.anInt1001;
				}
				Static95.anInt2898++;
			} else {
				Static18.method357(-2);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Lclient!wa;")
	public static Class1_Sub1_Sub18 method1862(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub18 local6 = (Class1_Sub1_Sub18) Static85.aClass33_30.method1038((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static55.aClass62_16.method2008(arg0, 6);
		local6 = new Class1_Sub1_Sub18();
		local6.anInt3027 = arg0;
		if (local20 != null) {
			local6.method2112(new Class1_Sub18(local20));
		}
		local6.method2116();
		if (local6.aBoolean246) {
			local6.anInt3033 = 0;
			local6.aBoolean243 = false;
		}
		Static85.aClass33_30.method1042(local6, (long) arg0);
		return local6;
	}
}
