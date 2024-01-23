import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ae", name = "qb", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!ae", name = "N", descriptor = "Lclient!il;")
	public static Class86 aClass86_3 = new Class86(16);

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
	public static int anInt170 = 0;

	@OriginalMember(owner = "client!ae", name = "ub", descriptor = "Lclient!si;")
	public static Class157 aClass157_1 = null;

	@OriginalMember(owner = "client!ae", name = "xb", descriptor = "[I")
	public static int[] anIntArray16 = new int[500];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)I")
	public static int method72(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class87.anIntArray177[arg0 * 1024 / arg3] >> 1;
		return ((65536 - local12) * arg2 >> 16) + (arg1 * local12 >> 16);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method77() {
		if (Static129.anInt2552 == 0 || Static129.anInt2552 == 5) {
			return;
		}
		try {
			if (++Static48.anInt1077 > 2000) {
				if (Static97.aClass49_2 != null) {
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
				}
				if (Static133.anInt2640 >= 1) {
					Static129.anInt2552 = 0;
					Static13.anInt282 = -5;
					return;
				}
				Static133.anInt2640++;
				Static48.anInt1077 = 0;
				Static129.anInt2552 = 1;
				if (Static23.anInt472 == Static8.anInt235) {
					Static8.anInt235 = Static287.anInt5204;
				} else {
					Static8.anInt235 = Static23.anInt472;
				}
			}
			if (Static129.anInt2552 == 1) {
				Static224.aClass153_5 = Static222.aClass176_3.method4371(Static252.aString164, Static8.anInt235);
				Static129.anInt2552 = 2;
			}
			if (Static129.anInt2552 == 2) {
				if (Static224.aClass153_5.anInt4614 == 2) {
					throw new IOException();
				}
				if (Static224.aClass153_5.anInt4614 != 1) {
					return;
				}
				Static97.aClass49_2 = new Class49((Socket) Static224.aClass153_5.anObject6, Static222.aClass176_3);
				Static224.aClass153_5 = null;
				@Pc(109) long local109 = Static215.aLong152 = Static282.method4276(Static124.aString23);
				@Pc(116) int local116 = (int) (local109 >> 16 & 0x1FL);
				Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1822(14);
				Static116.aClass1_Sub13_Sub1_48.method1822(local116);
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, 2);
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				@Pc(149) int local149 = Static97.aClass49_2.method1301();
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				if (local149 != 0) {
					Static13.anInt282 = local149;
					Static129.anInt2552 = 0;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
				Static129.anInt2552 = 3;
			}
			if (Static129.anInt2552 == 3) {
				if (Static97.aClass49_2.method1300() < 8) {
					return;
				}
				@Pc(189) int[] local189 = new int[4];
				Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, 8);
				Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
				Static246.aLong179 = Static10.aClass1_Sub13_Sub1_117.method1833();
				local189[1] = (int) (Math.random() * 9.9999999E7D);
				Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
				local189[3] = (int) Static246.aLong179;
				local189[2] = (int) (Static246.aLong179 >> 32);
				local189[0] = (int) (Math.random() * 9.9999999E7D);
				Static116.aClass1_Sub13_Sub1_48.method1822(10);
				Static116.aClass1_Sub13_Sub1_48.method1851(local189[0]);
				Static116.aClass1_Sub13_Sub1_48.method1851(local189[1]);
				Static116.aClass1_Sub13_Sub1_48.method1851(local189[2]);
				Static116.aClass1_Sub13_Sub1_48.method1851(local189[3]);
				Static116.aClass1_Sub13_Sub1_48.method1857(Static282.method4276(Static124.aString23));
				Static116.aClass1_Sub13_Sub1_48.method1852(Static98.aString72);
				Static116.aClass1_Sub13_Sub1_48.method1854(Static299.aBigInteger2, Static265.aBigInteger1);
				Static195.aClass1_Sub13_Sub1_78.anInt2018 = 0;
				if (Static97.anInt2087 == 40) {
					Static195.aClass1_Sub13_Sub1_78.method1822(18);
				} else {
					Static195.aClass1_Sub13_Sub1_78.method1822(16);
				}
				Static195.aClass1_Sub13_Sub1_78.method1835(Static116.aClass1_Sub13_Sub1_48.anInt2018 + Static56.method1012(Static258.aString177) + 163);
				Static195.aClass1_Sub13_Sub1_78.method1851(548);
				Static195.aClass1_Sub13_Sub1_78.method1822(Static261.anInt4828);
				Static195.aClass1_Sub13_Sub1_78.method1822(Static258.aBoolean463 ? 1 : 0);
				Static195.aClass1_Sub13_Sub1_78.method1822(1);
				Static195.aClass1_Sub13_Sub1_78.method1822(Static269.method4147());
				Static195.aClass1_Sub13_Sub1_78.method1835(Static194.anInt3876);
				Static195.aClass1_Sub13_Sub1_78.method1835(Static288.anInt5232);
				Static195.aClass1_Sub13_Sub1_78.method1822(Static40.anInt844);
				Static164.method2823(Static195.aClass1_Sub13_Sub1_78);
				Static195.aClass1_Sub13_Sub1_78.method1852(Static258.aString177);
				Static195.aClass1_Sub13_Sub1_78.method1851(Static158.anInt3622);
				Static195.aClass1_Sub13_Sub1_78.method1851(Static148.method2590());
				Static164.aBoolean283 = true;
				Static195.aClass1_Sub13_Sub1_78.method1835(Static82.anInt1827);
				Static195.aClass1_Sub13_Sub1_78.method1851(Static270.aClass119_84.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static103.aClass119_39.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static160.aClass119_60.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static34.aClass119_13.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static125.aClass119_46.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static67.aClass119_20.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static197.aClass119_68.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static58.aClass119_18.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static45.aClass119_15.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static276.aClass119_86.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static121.aClass119_45.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static265.aClass119_83.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static21.aClass119_6.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static110.aClass119_42.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static68.aClass119_21.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static240.aClass119_77.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static25.aClass119_80.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static120.aClass119_44.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static197.aClass119_69.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static218.aClass119_74.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static18.aClass119_5.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static291.aClass119_89.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static314.aClass119_96.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static74.aClass119_28.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static68.aClass119_22.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static166.aClass119_61.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static167.aClass119_11.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static212.aClass119_73.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1851(Static145.aClass119_53.method3232());
				Static195.aClass1_Sub13_Sub1_78.method1864(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				Static97.aClass49_2.method1302(Static195.aClass1_Sub13_Sub1_78.aByteArray63, Static195.aClass1_Sub13_Sub1_78.anInt2018);
				Static116.aClass1_Sub13_Sub1_48.method1889(local189);
				for (@Pc(604) int local604 = 0; local604 < 4; local604++) {
					local189[local604] += 50;
				}
				Static10.aClass1_Sub13_Sub1_117.method1889(local189);
				Static129.anInt2552 = 4;
			}
			if (Static129.anInt2552 == 4) {
				if (Static97.aClass49_2.method1300() < 1) {
					return;
				}
				@Pc(639) int local639 = Static97.aClass49_2.method1301();
				if (local639 == 21) {
					Static129.anInt2552 = 7;
				} else if (local639 == 29) {
					Static129.anInt2552 = 10;
				} else if (local639 == 1) {
					Static129.anInt2552 = 5;
					Static13.anInt282 = local639;
					return;
				} else if (local639 == 2) {
					Static129.anInt2552 = 8;
				} else if (local639 == 15) {
					Static13.anInt282 = local639;
					Static129.anInt2552 = 0;
					return;
				} else if (local639 == 23 && Static133.anInt2640 < 1) {
					Static133.anInt2640++;
					Static48.anInt1077 = 0;
					Static129.anInt2552 = 1;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				} else {
					Static13.anInt282 = local639;
					Static129.anInt2552 = 0;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
			}
			if (Static129.anInt2552 == 6) {
				Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
				Static116.aClass1_Sub13_Sub1_48.method1887(17);
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				Static129.anInt2552 = 4;
				return;
			}
			if (Static129.anInt2552 == 7) {
				if (Static97.aClass49_2.method1300() >= 1) {
					Static120.anInt2454 = Static97.aClass49_2.method1301() * 60 + 180;
					Static129.anInt2552 = 0;
					Static13.anInt282 = 21;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
				return;
			}
			if (Static129.anInt2552 == 10) {
				if (Static97.aClass49_2.method1300() >= 1) {
					Static212.anInt4028 = Static97.aClass49_2.method1301();
					Static13.anInt282 = 29;
					Static129.anInt2552 = 0;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
				return;
			}
			if (Static129.anInt2552 == 8) {
				if (Static97.aClass49_2.method1300() < 14) {
					return;
				}
				Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, 14);
				Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
				Static142.anInt2785 = Static10.aClass1_Sub13_Sub1_117.method1853();
				Static143.anInt2794 = Static10.aClass1_Sub13_Sub1_117.method1853();
				Static287.aBoolean492 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static294.aBoolean110 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static94.aBoolean188 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static220.aBoolean372 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static248.aBoolean423 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static68.anInt1471 = Static10.aClass1_Sub13_Sub1_117.method1879();
				Static309.aBoolean525 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static217.aBoolean369 = Static10.aClass1_Sub13_Sub1_117.method1853() == 1;
				Static49.method908(Static217.aBoolean369);
				Static159.method2717(Static217.aBoolean369);
				Static265.method4107(Static217.aBoolean369);
				if (!Static258.aBoolean463) {
					if (Static287.aBoolean492 && !Static94.aBoolean188 || Static309.aBoolean525) {
						try {
							Static320.method2266("zap", Static222.aClass176_3.anApplet1);
						} catch (@Pc(939) Throwable local939) {
						}
					} else {
						try {
							Static320.method2266("unzap", Static222.aClass176_3.anApplet1);
						} catch (@Pc(929) Throwable local929) {
						}
					}
				}
				try {
					Static320.method2266("loggedin", Static222.aClass176_3.anApplet1);
				} catch (@Pc(947) Throwable local947) {
				}
				Static126.anInt1523 = Static10.aClass1_Sub13_Sub1_117.method1888();
				Static5.anInt204 = Static10.aClass1_Sub13_Sub1_117.method1879();
				Static129.anInt2552 = 9;
			}
			if (Static129.anInt2552 == 9) {
				if (Static97.aClass49_2.method1300() >= Static5.anInt204) {
					Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
					Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, Static5.anInt204);
					Static13.anInt282 = 2;
					Static129.anInt2552 = 0;
					Static194.method3362();
					Static130.anInt2581 = -1;
					Static100.method4618(false);
					Static126.anInt1523 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(1005) IOException local1005) {
			if (Static97.aClass49_2 != null) {
				Static97.aClass49_2.method1307();
				Static97.aClass49_2 = null;
			}
			if (Static133.anInt2640 < 1) {
				Static133.anInt2640++;
				Static48.anInt1077 = 0;
				Static129.anInt2552 = 1;
				if (Static23.anInt472 == Static8.anInt235) {
					Static8.anInt235 = Static287.anInt5204;
				} else {
					Static8.anInt235 = Static23.anInt472;
				}
			} else {
				Static13.anInt282 = -4;
				Static129.anInt2552 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIII)V")
	public static void method79(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		Static231.anInt4333 = 0;
		Static289.anInt5245 = arg0;
		Static188.anInt3598 = 0;
		Static218.anInt4086 = arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	public static int method85(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
