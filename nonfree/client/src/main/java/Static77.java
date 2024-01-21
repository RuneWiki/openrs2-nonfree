import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!bc;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1161 = Static107.method1838(" has logged in)3");

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "[J")
	public static long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1162 = Static107.method1838(" <col=ffffff>");

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
	public static int[] anIntArray190 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1163 = aClass28_1161;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public static void method1381() {
		try {
			if (Static36.anInt976 == 0) {
				if (Static155.aClass22_4 != null) {
					Static155.aClass22_4.method962();
					Static155.aClass22_4 = null;
				}
				Static36.anInt976 = 1;
				Static62.aBoolean85 = false;
				Static172.aClass41_8 = null;
				Static16.anInt633 = 0;
			}
			if (Static36.anInt976 == 1) {
				if (Static172.aClass41_8 == null) {
					Static172.aClass41_8 = Static76.aClass66_2.method2129(Static167.anInt3751, Static79.aString2);
				}
				if (Static172.aClass41_8.anInt2096 == 2) {
					throw new IOException();
				}
				if (Static172.aClass41_8.anInt2096 == 1) {
					Static155.aClass22_4 = new Class22((Socket) Static172.aClass41_8.anObject2, Static76.aClass66_2);
					Static36.anInt976 = 2;
					Static172.aClass41_8 = null;
				}
			}
			if (Static36.anInt976 == 2) {
				@Pc(71) long local71 = Static103.aLong91 = Static138.aClass28_1854.method1129();
				@Pc(78) int local78 = (int) (local71 >> 16 & 0x1FL);
				Static128.aClass2_Sub2_Sub1_2.anInt2385 = 0;
				Static128.aClass2_Sub2_Sub1_2.method1700(14);
				Static128.aClass2_Sub2_Sub1_2.method1700(local78);
				Static155.aClass22_4.method965(2, Static128.aClass2_Sub2_Sub1_2.aByteArray35);
				Static36.anInt976 = 3;
				Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
			}
			@Pc(122) int local122;
			if (Static36.anInt976 == 3) {
				if (Static165.aClass21_2 != null) {
					Static165.aClass21_2.method1340();
				}
				if (Static120.aClass21_1 != null) {
					Static120.aClass21_1.method1340();
				}
				local122 = Static155.aClass22_4.method969();
				if (Static165.aClass21_2 != null) {
					Static165.aClass21_2.method1340();
				}
				if (Static120.aClass21_1 != null) {
					Static120.aClass21_1.method1340();
				}
				if (local122 != 0) {
					Static110.method1873(local122);
					return;
				}
				Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
				Static36.anInt976 = 4;
			}
			if (Static36.anInt976 == 4) {
				if (Static151.aClass2_Sub2_Sub1_3.anInt2385 < 8) {
					local122 = Static155.aClass22_4.method963();
					if (8 - Static151.aClass2_Sub2_Sub1_3.anInt2385 < local122) {
						local122 = 8 - Static151.aClass2_Sub2_Sub1_3.anInt2385;
					}
					if (local122 > 0) {
						Static155.aClass22_4.method967(Static151.aClass2_Sub2_Sub1_3.anInt2385, local122, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
						Static151.aClass2_Sub2_Sub1_3.anInt2385 += local122;
					}
				}
				if (Static151.aClass2_Sub2_Sub1_3.anInt2385 == 8) {
					Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
					Static128.aLong110 = Static151.aClass2_Sub2_Sub1_3.method1655();
					Static36.anInt976 = 5;
				}
			}
			if (Static36.anInt976 == 5) {
				Static128.aClass2_Sub2_Sub1_2.anInt2385 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static128.aLong110 >> 32), (int) Static128.aLong110 };
				Static128.aClass2_Sub2_Sub1_2.method1700(10);
				Static128.aClass2_Sub2_Sub1_2.method1710(local215[0]);
				Static128.aClass2_Sub2_Sub1_2.method1710(local215[1]);
				Static128.aClass2_Sub2_Sub1_2.method1710(local215[2]);
				Static128.aClass2_Sub2_Sub1_2.method1710(local215[3]);
				Static128.aClass2_Sub2_Sub1_2.method1666(Static138.aClass28_1854.method1129());
				Static128.aClass2_Sub2_Sub1_2.method1699(Static138.aClass28_1856);
				Static128.aClass2_Sub2_Sub1_2.method1697(Static138.aBigInteger2, Static23.aBigInteger1);
				Static90.aClass2_Sub2_Sub1_1.anInt2385 = 0;
				if (Static124.anInt2924 == 40) {
					Static90.aClass2_Sub2_Sub1_1.method1700(18);
				} else {
					Static90.aClass2_Sub2_Sub1_1.method1700(16);
				}
				Static90.aClass2_Sub2_Sub1_1.method1700(Static128.aClass2_Sub2_Sub1_2.anInt2385 + 93);
				Static90.aClass2_Sub2_Sub1_1.method1710(480);
				Static90.aClass2_Sub2_Sub1_1.method1700(Static177.aBoolean170 ? 1 : 0);
				Static72.method1309(Static90.aClass2_Sub2_Sub1_1);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static140.aClass40_Sub1_98.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static169.aClass40_Sub1_117.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static160.aClass40_Sub1_107.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static159.aClass40_Sub1_125.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static99.aClass40_Sub1_73.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static47.aClass40_Sub1_49.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static10.aClass40_Sub1_18.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static18.aClass40_Sub1_114.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static101.aClass40_Sub1_16.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static17.aClass40_Sub1_23.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static29.aClass40_Sub1_30.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static122.aClass40_Sub1_89.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static102.aClass40_Sub1_74.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static151.aClass40_Sub1_103.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static131.aClass40_Sub1_94.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1710(Static78.aClass40_Sub1_57.anInt2533);
				Static90.aClass2_Sub2_Sub1_1.method1706(Static128.aClass2_Sub2_Sub1_2.anInt2385, Static128.aClass2_Sub2_Sub1_2.aByteArray35);
				Static155.aClass22_4.method965(Static90.aClass2_Sub2_Sub1_1.anInt2385, Static90.aClass2_Sub2_Sub1_1.aByteArray35);
				Static128.aClass2_Sub2_Sub1_2.method1721(local215);
				for (@Pc(426) int local426 = 0; local426 < 4; local426++) {
					local215[local426] += 50;
				}
				Static151.aClass2_Sub2_Sub1_3.method1721(local215);
				Static36.anInt976 = 6;
			}
			if (Static36.anInt976 == 6 && Static155.aClass22_4.method963() > 0) {
				local122 = Static155.aClass22_4.method969();
				if (local122 == 21 && Static124.anInt2924 == 20) {
					Static36.anInt976 = 7;
				} else if (local122 == 2) {
					Static36.anInt976 = 9;
				} else if (local122 == 15 && Static124.anInt2924 == 40) {
					Static145.method2278();
					return;
				} else if (local122 == 23 && Static98.anInt2453 < 1) {
					Static36.anInt976 = 0;
					Static98.anInt2453++;
				} else {
					Static110.method1873(local122);
					return;
				}
			}
			if (Static36.anInt976 == 7 && Static155.aClass22_4.method963() > 0) {
				Static59.anInt1542 = (Static155.aClass22_4.method969() + 3) * 60;
				Static36.anInt976 = 8;
			}
			if (Static36.anInt976 == 8) {
				Static16.anInt633 = 0;
				Static169.method2647(Static116.aClass28_1656, Static83.method1481(new Class28[] { Static158.method2411(Static59.anInt1542 / 60), Static124.aClass28_1722 }), Static51.aClass28_1148);
				if (--Static59.anInt1542 <= 0) {
					Static36.anInt976 = 0;
				}
			} else {
				if (Static36.anInt976 == 9 && Static155.aClass22_4.method963() >= 9) {
					Static172.anInt3843 = Static155.aClass22_4.method969();
					Static30.anInt936 = Static155.aClass22_4.method969();
					Static40.aBoolean48 = Static155.aClass22_4.method969() == 1;
					Static50.anInt1313 = Static155.aClass22_4.method969();
					Static50.anInt1313 <<= 0x8;
					Static50.anInt1313 += Static155.aClass22_4.method969();
					Static13.anInt588 = Static155.aClass22_4.method969();
					Static155.aClass22_4.method967(0, 1, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
					Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
					Static113.anInt2734 = Static151.aClass2_Sub2_Sub1_3.method1720();
					Static155.aClass22_4.method967(0, 2, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
					Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
					Static103.anInt2571 = Static151.aClass2_Sub2_Sub1_3.method1680();
					Static36.anInt976 = 10;
				}
				if (Static36.anInt976 != 10) {
					Static16.anInt633++;
					if (Static16.anInt633 > 2000) {
						if (Static98.anInt2453 < 1) {
							Static36.anInt976 = 0;
							Static98.anInt2453++;
							if (Static167.anInt3751 == Static151.anInt3389) {
								Static167.anInt3751 = Static180.anInt4033;
							} else {
								Static167.anInt3751 = Static151.anInt3389;
							}
						} else {
							Static110.method1873(-3);
						}
					}
				} else if (Static155.aClass22_4.method963() >= Static103.anInt2571) {
					Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
					Static155.aClass22_4.method967(0, Static103.anInt2571, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
					Static104.method1824();
					Static142.anInt3243 = -1;
					Static30.method634(false);
					Static113.anInt2734 = -1;
				}
			}
		} catch (@Pc(706) IOException local706) {
			if (Static98.anInt2453 < 1) {
				Static36.anInt976 = 0;
				if (Static151.anInt3389 == Static167.anInt3751) {
					Static167.anInt3751 = Static180.anInt4033;
				} else {
					Static167.anInt3751 = Static151.anInt3389;
				}
				Static98.anInt2453++;
			} else {
				Static110.method1873(-2);
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method1382(@OriginalArg(1) Class2_Sub8 arg0) {
		arg0.aBoolean142 = false;
		if (arg0.aClass2_Sub18_5 != null) {
			arg0.aClass2_Sub18_5.anInt2661 = 0;
		}
		for (@Pc(19) Class2_Sub8 local19 = arg0.method2178(); local19 != null; local19 = arg0.method2179()) {
			method1382(local19);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public static void method1383() {
		aClass28_1161 = null;
		anIntArray190 = null;
		aLongArray7 = null;
		aClass28_1163 = null;
		aClass28_1162 = null;
		aClass5_3 = null;
	}
}
