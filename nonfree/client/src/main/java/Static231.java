import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "Lclient!jf;")
	public static Class96 aClass96_14 = null;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString264 = "Prepared sound engine";

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public static void method3970() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static266.anInt5101; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static339.anInt6352; local13++) {
				if (Static46.method1044(local7, true, Static138.aClass51ArrayArrayArray1, local9, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)V")
	public static void method3978() {
		if (Static109.anInt2324 == 0 || Static109.anInt2324 == 5) {
			return;
		}
		try {
			if (++Static303.anInt5835 > 2000) {
				if (Static95.aClass68_23 != null) {
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
				}
				if (Static259.anInt3206 >= 1) {
					Static29.anInt782 = -5;
					Static109.anInt2324 = 0;
					return;
				}
				Static109.anInt2324 = 1;
				Static259.anInt3206++;
				if (Static6.anInt195 == Static312.anInt5956) {
					Static312.anInt5956 = Static62.anInt1434;
				} else {
					Static312.anInt5956 = Static6.anInt195;
				}
				Static303.anInt5835 = 0;
			}
			if (Static109.anInt2324 == 1) {
				Static164.aClass60_6 = Static202.aClass10_3.method310(Static312.anInt5956, Static13.aString28);
				Static109.anInt2324 = 2;
			}
			if (Static109.anInt2324 == 2) {
				if (Static164.aClass60_6.anInt1838 == 2) {
					throw new IOException();
				}
				if (Static164.aClass60_6.anInt1838 != 1) {
					return;
				}
				Static95.aClass68_23 = new Class68((Socket) Static164.aClass60_6.anObject2, Static202.aClass10_3);
				Static164.aClass60_6 = null;
				@Pc(107) long local107 = Static49.aLong39 = Static204.method3630(Static354.aString382);
				Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
				@Pc(117) int local117 = (int) (local107 >> 16 & 0x1FL);
				Static335.aClass5_Sub1_Sub1_3.method1886(14);
				Static335.aClass5_Sub1_Sub1_3.method1886(local117);
				Static95.aClass68_23.method2002(2, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				@Pc(146) int local146 = Static95.aClass68_23.method2000();
				if (Static112.aClass14_1 != null) {
					Static112.aClass14_1.method5474();
				}
				if (Static244.aClass14_2 != null) {
					Static244.aClass14_2.method5474();
				}
				if (local146 != 0) {
					Static109.anInt2324 = 0;
					Static29.anInt782 = local146;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					return;
				}
				Static109.anInt2324 = 3;
			}
			if (Static109.anInt2324 == 3) {
				if (Static95.aClass68_23.method1999() < 8) {
					return;
				}
				Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, 8, 0);
				Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
				Static109.aLong85 = Static6.aClass5_Sub1_Sub1_1.method1884();
				@Pc(203) int[] local203 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static109.aLong85 >> 32), (int) Static109.aLong85 };
				Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
				Static335.aClass5_Sub1_Sub1_3.method1886(10);
				Static335.aClass5_Sub1_Sub1_3.method1851(local203[0]);
				Static335.aClass5_Sub1_Sub1_3.method1851(local203[1]);
				Static335.aClass5_Sub1_Sub1_3.method1851(local203[2]);
				Static335.aClass5_Sub1_Sub1_3.method1851(local203[3]);
				Static335.aClass5_Sub1_Sub1_3.method1871(Static204.method3630(Static354.aString382));
				Static335.aClass5_Sub1_Sub1_3.method1849(Static240.aString269);
				Static335.aClass5_Sub1_Sub1_3.method1859(Static180.aBigInteger2, Static44.aBigInteger3);
				Static211.aClass5_Sub1_Sub1_2.anInt2029 = 0;
				if (Static247.anInt3874 == 40) {
					Static211.aClass5_Sub1_Sub1_2.method1886(18);
				} else {
					Static211.aClass5_Sub1_Sub1_2.method1886(16);
				}
				Static211.aClass5_Sub1_Sub1_2.method1870(Static335.aClass5_Sub1_Sub1_3.anInt2029 + Static344.method954(Static31.aString51) + 161);
				Static211.aClass5_Sub1_Sub1_2.method1851(560);
				Static211.aClass5_Sub1_Sub1_2.method1886(Static40.anInt989);
				Static211.aClass5_Sub1_Sub1_2.method1886(Static315.method5371());
				Static211.aClass5_Sub1_Sub1_2.method1870(Static17.anInt5991);
				Static211.aClass5_Sub1_Sub1_2.method1870(Static246.anInt4801);
				Static211.aClass5_Sub1_Sub1_2.method1886(Static275.anInt5386);
				Static261.method4490(Static211.aClass5_Sub1_Sub1_2);
				Static211.aClass5_Sub1_Sub1_2.method1849(Static31.aString51);
				Static211.aClass5_Sub1_Sub1_2.method1851(Static255.anInt4972);
				Static211.aClass5_Sub1_Sub1_2.method1851(Static258.method4480());
				Static76.aBoolean414 = true;
				Static211.aClass5_Sub1_Sub1_2.method1870(Static339.anInt6356);
				Static211.aClass5_Sub1_Sub1_2.method1851(Static177.aClass170_50.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static350.aClass170_123.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static65.aClass170_36.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static309.aClass170_103.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static101.aClass170_44.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static2.aClass170_1.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static305.aClass170_102.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static276.aClass170_91.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static317.aClass170_114.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static247.aClass170_74.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static98.aClass170_42.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static226.aClass170_80.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static262.aClass170_90.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static202.aClass170_75.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static51.aClass170_13.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static92.aClass170_40.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static303.aClass170_101.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static101.aClass170_46.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static145.aClass170_118.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static176.aClass170_34.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static310.aClass170_107.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static183.aClass170_65.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static332.aClass170_119.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static117.aClass170_52.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static336.aClass170_94.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static297.aClass170_98.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static250.aClass170_89.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static130.aClass170_55.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1851(Static134.aClass170_59.method4558());
				Static211.aClass5_Sub1_Sub1_2.method1850(Static335.aClass5_Sub1_Sub1_3.aByteArray18, Static335.aClass5_Sub1_Sub1_3.anInt2029);
				Static95.aClass68_23.method2002(Static211.aClass5_Sub1_Sub1_2.anInt2029, Static211.aClass5_Sub1_Sub1_2.aByteArray18);
				Static335.aClass5_Sub1_Sub1_3.method173(local203);
				for (@Pc(546) int local546 = 0; local546 < 4; local546++) {
					local203[local546] += 50;
				}
				Static6.aClass5_Sub1_Sub1_1.method173(local203);
				Static109.anInt2324 = 4;
			}
			if (Static109.anInt2324 == 4) {
				if (Static95.aClass68_23.method1999() < 1) {
					return;
				}
				@Pc(580) int local580 = Static95.aClass68_23.method2000();
				if (local580 == 21) {
					Static109.anInt2324 = 7;
				} else if (local580 == 29) {
					Static109.anInt2324 = 10;
				} else if (local580 == 1) {
					Static109.anInt2324 = 5;
					Static29.anInt782 = local580;
					return;
				} else if (local580 == 2) {
					Static109.anInt2324 = 8;
				} else if (local580 == 15) {
					Static29.anInt782 = local580;
					Static109.anInt2324 = 0;
					return;
				} else if (local580 == 23 && Static259.anInt3206 < 1) {
					Static303.anInt5835 = 0;
					Static109.anInt2324 = 1;
					Static259.anInt3206++;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					return;
				} else {
					Static29.anInt782 = local580;
					Static109.anInt2324 = 0;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
					return;
				}
			}
			if (Static109.anInt2324 == 6) {
				Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
				Static335.aClass5_Sub1_Sub1_3.method174(17);
				Static95.aClass68_23.method2002(Static335.aClass5_Sub1_Sub1_3.anInt2029, Static335.aClass5_Sub1_Sub1_3.aByteArray18);
				Static109.anInt2324 = 4;
			} else if (Static109.anInt2324 == 7) {
				if (Static95.aClass68_23.method1999() >= 1) {
					Static5.anInt172 = Static95.aClass68_23.method2000() * 60 + 180;
					Static109.anInt2324 = 0;
					Static29.anInt782 = 21;
					Static95.aClass68_23.method1994();
					Static95.aClass68_23 = null;
				}
			} else if (Static109.anInt2324 != 10) {
				if (Static109.anInt2324 == 8) {
					if (Static95.aClass68_23.method1999() < 14) {
						return;
					}
					Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, 14, 0);
					Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
					Static70.anInt1768 = Static6.aClass5_Sub1_Sub1_1.method1832();
					Static276.anInt5396 = Static6.aClass5_Sub1_Sub1_1.method1832();
					Static343.aBoolean474 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static92.aBoolean136 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static117.aBoolean164 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static21.aBoolean465 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static105.aBoolean147 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static99.anInt2186 = Static6.aClass5_Sub1_Sub1_1.method1845();
					Static73.aBoolean122 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static32.aBoolean63 = Static6.aClass5_Sub1_Sub1_1.method1832() == 1;
					Static342.method5676(Static32.aBoolean63);
					Static19.method553(Static32.aBoolean63);
					Static203.method3627(Static32.aBoolean63);
					if (Static343.aBoolean474 && !Static117.aBoolean164 || Static73.aBoolean122) {
						try {
							Static367.method4779("zap", Static202.aClass10_3.anApplet1);
						} catch (@Pc(853) Throwable local853) {
						}
					} else {
						try {
							Static367.method4779("unzap", Static202.aClass10_3.anApplet1);
						} catch (@Pc(863) Throwable local863) {
						}
					}
					if (Static226.anInt4439 == 0) {
						try {
							Static367.method4779("loggedin", Static202.aClass10_3.anApplet1);
						} catch (@Pc(877) Throwable local877) {
						}
					}
					Static1.anInt4 = Static6.aClass5_Sub1_Sub1_1.method181();
					Static179.anInt3568 = Static6.aClass5_Sub1_Sub1_1.method1845();
					Static109.anInt2324 = 9;
				}
				if (Static109.anInt2324 == 9 && Static95.aClass68_23.method1999() >= Static179.anInt3568) {
					Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
					Static95.aClass68_23.method1993(Static6.aClass5_Sub1_Sub1_1.aByteArray18, Static179.anInt3568, 0);
					Static29.anInt782 = 2;
					Static109.anInt2324 = 0;
					Static224.method3897();
					Static63.anInt1492 = -1;
					Static207.method3697(false);
					Static1.anInt4 = -1;
				}
			} else if (Static95.aClass68_23.method1999() >= 1) {
				Static75.anInt1822 = Static95.aClass68_23.method2000();
				Static29.anInt782 = 29;
				Static109.anInt2324 = 0;
				Static95.aClass68_23.method1994();
				Static95.aClass68_23 = null;
			}
		} catch (@Pc(926) IOException local926) {
			if (Static95.aClass68_23 != null) {
				Static95.aClass68_23.method1994();
				Static95.aClass68_23 = null;
			}
			if (Static259.anInt3206 < 1) {
				if (Static6.anInt195 == Static312.anInt5956) {
					Static312.anInt5956 = Static62.anInt1434;
				} else {
					Static312.anInt5956 = Static6.anInt195;
				}
				Static259.anInt3206++;
				Static303.anInt5835 = 0;
				Static109.anInt2324 = 1;
			} else {
				Static109.anInt2324 = 0;
				Static29.anInt782 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method3980(@OriginalArg(1) Class170 arg0) {
		Static61.anInt1428 = arg0.method4555("titlebg");
		Static232.anInt4543 = arg0.method4555("logo");
	}
}
