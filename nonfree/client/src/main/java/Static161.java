import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "F")
	public static float aFloat34 = 0.0F;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public static int anInt3798 = -1;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString242 = "Unable to find ";

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "[I")
	public static int[] anIntArray281 = new int[500];

	@OriginalMember(owner = "client!nj", name = "w", descriptor = "S")
	public static short aShort18 = 32767;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method2823() {
		if (Static238.anInt5145 == 0 || Static238.anInt5145 == 5) {
			return;
		}
		try {
			if (++Static37.anInt1009 > 2000) {
				if (Static34.aClass109_2 != null) {
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
				}
				if (Static89.anInt2483 >= 1) {
					Static169.anInt3963 = -5;
					Static238.anInt5145 = 0;
					return;
				}
				Static89.anInt2483++;
				Static238.anInt5145 = 1;
				if (Static8.anInt151 == Static45.anInt1360) {
					Static45.anInt1360 = Static79.anInt2161;
				} else {
					Static45.anInt1360 = Static8.anInt151;
				}
				Static37.anInt1009 = 0;
			}
			if (Static238.anInt5145 == 1) {
				Static152.aClass145_6 = Static38.aClass28_1.method718(Static45.anInt1360, Static70.aString115);
				Static238.anInt5145 = 2;
			}
			if (Static238.anInt5145 == 2) {
				if (Static152.aClass145_6.anInt5354 == 2) {
					throw new IOException();
				}
				if (Static152.aClass145_6.anInt5354 != 1) {
					return;
				}
				Static34.aClass109_2 = new Class109((Socket) Static152.aClass145_6.anObject7, Static38.aClass28_1);
				Static152.aClass145_6 = null;
				@Pc(106) long local106 = Static148.aLong16 = Static93.method2008(Static60.aString96);
				Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
				@Pc(116) int local116 = (int) (local106 >> 16 & 0x1FL);
				Static171.aClass1_Sub13_Sub1_3.method1766(14);
				Static171.aClass1_Sub13_Sub1_3.method1766(local116);
				Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, 2);
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				@Pc(149) int local149 = Static34.aClass109_2.method3142();
				if (Static90.aClass55_1 != null) {
					Static90.aClass55_1.method3217();
				}
				if (Static239.aClass55_2 != null) {
					Static239.aClass55_2.method3217();
				}
				if (local149 != 0) {
					Static169.anInt3963 = local149;
					Static238.anInt5145 = 0;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					return;
				}
				Static238.anInt5145 = 3;
			}
			if (Static238.anInt5145 == 3) {
				if (Static34.aClass109_2.method3143() < 8) {
					return;
				}
				Static34.aClass109_2.method3146(8, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
				Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
				@Pc(197) int[] local197 = new int[4];
				Static48.aLong43 = Static58.aClass1_Sub13_Sub1_1.method1810();
				Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
				local197[1] = (int) (Math.random() * 9.9999999E7D);
				local197[3] = (int) Static48.aLong43;
				local197[2] = (int) (Static48.aLong43 >> 32);
				local197[0] = (int) (Math.random() * 9.9999999E7D);
				Static171.aClass1_Sub13_Sub1_3.method1766(10);
				Static171.aClass1_Sub13_Sub1_3.method1754(local197[0]);
				Static171.aClass1_Sub13_Sub1_3.method1754(local197[1]);
				Static171.aClass1_Sub13_Sub1_3.method1754(local197[2]);
				Static171.aClass1_Sub13_Sub1_3.method1754(local197[3]);
				Static171.aClass1_Sub13_Sub1_3.method1770(Static93.method2008(Static60.aString96));
				Static171.aClass1_Sub13_Sub1_3.method1791(Static150.aString251);
				Static171.aClass1_Sub13_Sub1_3.method1804(Static101.aBigInteger1, Static208.aBigInteger2);
				Static110.aClass1_Sub13_Sub1_2.anInt2395 = 0;
				if (Static224.anInt4922 == 40) {
					Static110.aClass1_Sub13_Sub1_2.method1766(18);
				} else {
					Static110.aClass1_Sub13_Sub1_2.method1766(16);
				}
				Static110.aClass1_Sub13_Sub1_2.method1789(Static171.aClass1_Sub13_Sub1_3.anInt2395 + Static201.method3338(Static135.aString214) + 163);
				Static110.aClass1_Sub13_Sub1_2.method1754(535);
				Static110.aClass1_Sub13_Sub1_2.method1766(Static86.anInt2433);
				Static110.aClass1_Sub13_Sub1_2.method1766(Static121.aBoolean169 ? 1 : 0);
				Static110.aClass1_Sub13_Sub1_2.method1766(0);
				Static110.aClass1_Sub13_Sub1_2.method1766(Static110.method2246());
				Static110.aClass1_Sub13_Sub1_2.method1789(Static200.anInt4411);
				Static110.aClass1_Sub13_Sub1_2.method1789(Static251.anInt5352);
				Static110.aClass1_Sub13_Sub1_2.method1766(Static44.anInt1342);
				Static145.method2631(Static110.aClass1_Sub13_Sub1_2);
				Static110.aClass1_Sub13_Sub1_2.method1791(Static135.aString214);
				Static110.aClass1_Sub13_Sub1_2.method1754(Static145.anInt3517);
				Static110.aClass1_Sub13_Sub1_2.method1754(Static124.method2395());
				Static2.aBoolean2 = true;
				Static110.aClass1_Sub13_Sub1_2.method1789(Static175.anInt4027);
				Static110.aClass1_Sub13_Sub1_2.method1754(Static252.aClass51_81.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static37.aClass51_13.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static198.aClass51_67.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static215.aClass51_69.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static146.aClass51_48.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static251.aClass51_80.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static258.aClass51_83.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static197.aClass51_28.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static24.aClass51_10.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static12.aClass51_2.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static97.aClass51_49.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static218.aClass51_71.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static118.aClass51_39.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static218.aClass51_70.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static21.aClass51_9.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static262.aClass51_87.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static174.aClass51_58.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static109.aClass51_35.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static48.aClass51_19.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static35.aClass51_12.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static124.aClass51_44.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static226.aClass51_73.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static109.aClass51_36.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static5.aClass51_1.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static137.aClass51_45.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static232.aClass51_77.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static153.aClass51_51.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static247.aClass51_79.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1754(Static198.aClass51_66.method1856());
				Static110.aClass1_Sub13_Sub1_2.method1771(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				Static34.aClass109_2.method3150(Static110.aClass1_Sub13_Sub1_2.aByteArray29, Static110.aClass1_Sub13_Sub1_2.anInt2395);
				Static171.aClass1_Sub13_Sub1_3.method1823(local197);
				for (@Pc(603) int local603 = 0; local603 < 4; local603++) {
					local197[local603] += 50;
				}
				Static58.aClass1_Sub13_Sub1_1.method1823(local197);
				Static238.anInt5145 = 4;
			}
			if (Static238.anInt5145 == 4) {
				if (Static34.aClass109_2.method3143() < 1) {
					return;
				}
				@Pc(637) int local637 = Static34.aClass109_2.method3142();
				if (local637 == 21) {
					Static238.anInt5145 = 7;
				} else if (local637 == 29) {
					Static238.anInt5145 = 10;
				} else if (local637 == 1) {
					Static238.anInt5145 = 5;
					Static169.anInt3963 = local637;
					return;
				} else if (local637 == 2) {
					Static238.anInt5145 = 8;
				} else if (local637 == 15) {
					Static238.anInt5145 = 0;
					Static169.anInt3963 = local637;
					return;
				} else if (local637 == 23 && Static89.anInt2483 < 1) {
					Static238.anInt5145 = 1;
					Static89.anInt2483++;
					Static37.anInt1009 = 0;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					return;
				} else {
					Static238.anInt5145 = 0;
					Static169.anInt3963 = local637;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
					return;
				}
			}
			if (Static238.anInt5145 == 6) {
				Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
				Static171.aClass1_Sub13_Sub1_3.method1825(17);
				Static34.aClass109_2.method3150(Static171.aClass1_Sub13_Sub1_3.aByteArray29, Static171.aClass1_Sub13_Sub1_3.anInt2395);
				Static238.anInt5145 = 4;
			} else if (Static238.anInt5145 == 7) {
				if (Static34.aClass109_2.method3143() >= 1) {
					Static176.anInt4046 = Static34.aClass109_2.method3142() * 60 + 180;
					Static238.anInt5145 = 0;
					Static169.anInt3963 = 21;
					Static34.aClass109_2.method3141();
					Static34.aClass109_2 = null;
				}
			} else if (Static238.anInt5145 != 10) {
				if (Static238.anInt5145 == 8) {
					if (Static34.aClass109_2.method3143() < 14) {
						return;
					}
					Static34.aClass109_2.method3146(14, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
					Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
					Static203.anInt4493 = Static58.aClass1_Sub13_Sub1_1.method1772();
					Static66.anInt1838 = Static58.aClass1_Sub13_Sub1_1.method1772();
					Static123.aBoolean66 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static60.aBoolean92 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static249.aBoolean271 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static148.aBoolean24 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static213.aBoolean227 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static243.anInt5251 = Static58.aClass1_Sub13_Sub1_1.method1764();
					Static115.aBoolean165 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static48.aBoolean81 = Static58.aClass1_Sub13_Sub1_1.method1772() == 1;
					Static239.method3934(Static48.aBoolean81);
					Static219.method3585(Static48.aBoolean81);
					if (!Static121.aBoolean169) {
						if (Static123.aBoolean66 && !Static249.aBoolean271 || Static115.aBoolean165) {
							try {
								Static267.method82("zap", Static38.aClass28_1.anApplet1);
							} catch (@Pc(929) Throwable local929) {
							}
						} else {
							try {
								Static267.method82("unzap", Static38.aClass28_1.anApplet1);
							} catch (@Pc(919) Throwable local919) {
							}
						}
					}
					try {
						Static267.method82("loggedin", Static38.aClass28_1.anApplet1);
					} catch (@Pc(938) Throwable local938) {
					}
					Static117.anInt3040 = Static58.aClass1_Sub13_Sub1_1.method1822();
					Static149.anInt3579 = Static58.aClass1_Sub13_Sub1_1.method1764();
					Static238.anInt5145 = 9;
				}
				if (Static238.anInt5145 == 9 && Static34.aClass109_2.method3143() >= Static149.anInt3579) {
					Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
					Static34.aClass109_2.method3146(Static149.anInt3579, Static58.aClass1_Sub13_Sub1_1.aByteArray29, 0);
					Static169.anInt3963 = 2;
					Static238.anInt5145 = 0;
					Static164.method2862();
					Static165.anInt3877 = -1;
					Static14.method235(false);
					Static117.anInt3040 = -1;
				}
			} else if (Static34.aClass109_2.method3143() >= 1) {
				Static145.anInt3518 = Static34.aClass109_2.method3142();
				Static238.anInt5145 = 0;
				Static169.anInt3963 = 29;
				Static34.aClass109_2.method3141();
				Static34.aClass109_2 = null;
			}
		} catch (@Pc(990) IOException local990) {
			if (Static34.aClass109_2 != null) {
				Static34.aClass109_2.method3141();
				Static34.aClass109_2 = null;
			}
			if (Static89.anInt2483 < 1) {
				Static89.anInt2483++;
				Static238.anInt5145 = 1;
				if (Static8.anInt151 == Static45.anInt1360) {
					Static45.anInt1360 = Static79.anInt2161;
				} else {
					Static45.anInt1360 = Static8.anInt151;
				}
				Static37.anInt1009 = 0;
			} else {
				Static238.anInt5145 = 0;
				Static169.anInt3963 = -4;
			}
		}
	}
}
