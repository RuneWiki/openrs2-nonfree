import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_98;

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
	public static int anInt2831;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "Lclient!ke;")
	public static final Class1_Sub13 aClass1_Sub13_1 = new Class1_Sub13(0, 0);

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_852 = Static81.method1507(" from your friend list first)3");

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "Lclient!dj;")
	public static Class24 aClass24_851 = aClass24_852;

	@OriginalMember(owner = "client!nd", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_853 = Static81.method1507("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_854 = Static81.method1507("blaugr-Un:");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method2154() {
		try {
			if (Static202.anInt4523 == 0) {
				if (Static91.aClass53_2 != null) {
					Static91.aClass53_2.method1713();
					Static91.aClass53_2 = null;
				}
				Static36.anInt987 = 0;
				Static16.aClass82_1 = null;
				Static202.anInt4523 = 1;
				Static75.aBoolean230 = false;
			}
			if (Static202.anInt4523 == 1) {
				if (Static16.aClass82_1 == null) {
					Static16.aClass82_1 = Static76.aClass99_1.method3422(Static2.aString1, Static73.anInt1755);
				}
				if (Static16.aClass82_1.anInt3421 == 2) {
					throw new IOException();
				}
				if (Static16.aClass82_1.anInt3421 == 1) {
					Static91.aClass53_2 = new Class53((Socket) Static16.aClass82_1.anObject2, Static76.aClass99_1);
					Static202.anInt4523 = 2;
					Static16.aClass82_1 = null;
				}
			}
			if (Static202.anInt4523 == 2) {
				@Pc(77) long local77 = Static91.aLong64 = Static159.aClass24_1036.method747();
				@Pc(84) int local84 = (int) (local77 >> 16 & 0x1FL);
				Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
				Static176.aClass1_Sub7_Sub1_34.method2753(14);
				Static176.aClass1_Sub7_Sub1_34.method2753(local84);
				Static91.aClass53_2.method1717(Static176.aClass1_Sub7_Sub1_34.aByteArray38, 2);
				Static202.anInt4523 = 3;
				Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
			}
			@Pc(124) int local124;
			if (Static202.anInt4523 == 3) {
				if (Static36.aClass42_1 != null) {
					Static36.aClass42_1.method2422();
				}
				if (Static42.aClass42_2 != null) {
					Static42.aClass42_2.method2422();
				}
				local124 = Static91.aClass53_2.method1716();
				if (Static36.aClass42_1 != null) {
					Static36.aClass42_1.method2422();
				}
				if (Static42.aClass42_2 != null) {
					Static42.aClass42_2.method2422();
				}
				if (local124 != 0) {
					Static176.method3555(local124);
					return;
				}
				Static202.anInt4523 = 4;
				Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
			}
			if (Static202.anInt4523 == 4) {
				if (Static192.aClass1_Sub7_Sub1_31.anInt3592 < 8) {
					local124 = Static91.aClass53_2.method1718();
					if (8 - Static192.aClass1_Sub7_Sub1_31.anInt3592 < local124) {
						local124 = 8 - Static192.aClass1_Sub7_Sub1_31.anInt3592;
					}
					if (local124 > 0) {
						Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, Static192.aClass1_Sub7_Sub1_31.anInt3592, local124);
						Static192.aClass1_Sub7_Sub1_31.anInt3592 += local124;
					}
				}
				if (Static192.aClass1_Sub7_Sub1_31.anInt3592 == 8) {
					Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
					Static199.aLong92 = Static192.aClass1_Sub7_Sub1_31.method2756();
					Static202.anInt4523 = 5;
				}
			}
			if (Static202.anInt4523 == 5) {
				Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
				@Pc(221) int[] local221 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static199.aLong92 >> 32), (int) Static199.aLong92 };
				Static176.aClass1_Sub7_Sub1_34.method2753(10);
				Static176.aClass1_Sub7_Sub1_34.method2754(local221[0]);
				Static176.aClass1_Sub7_Sub1_34.method2754(local221[1]);
				Static176.aClass1_Sub7_Sub1_34.method2754(local221[2]);
				Static176.aClass1_Sub7_Sub1_34.method2754(local221[3]);
				Static176.aClass1_Sub7_Sub1_34.method2801(Static159.aClass24_1036.method747());
				Static176.aClass1_Sub7_Sub1_34.method2757(Static159.aClass24_1031);
				Static176.aClass1_Sub7_Sub1_34.method2768(Static183.aBigInteger1, Static190.aBigInteger2);
				Static31.aClass1_Sub7_Sub1_6.anInt3592 = 0;
				if (Static160.anInt4679 == 40) {
					Static31.aClass1_Sub7_Sub1_6.method2753(18);
				} else {
					Static31.aClass1_Sub7_Sub1_6.method2753(16);
				}
				Static31.aClass1_Sub7_Sub1_6.method2753(Static176.aClass1_Sub7_Sub1_34.anInt3592 + Static29.method576(Static93.aClass24_639) + 129);
				Static31.aClass1_Sub7_Sub1_6.method2754(494);
				Static31.aClass1_Sub7_Sub1_6.method2753(Static30.aBoolean35 ? 1 : 0);
				Static159.method2711(Static31.aClass1_Sub7_Sub1_6);
				Static31.aClass1_Sub7_Sub1_6.method2757(Static93.aClass24_639);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static65.anInt1649);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static18.aClass69_Sub1_128.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static98.aClass69_Sub1_72.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static201.aClass69_Sub1_151.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static177.aClass69_Sub1_130.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static57.aClass69_Sub1_49.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static184.aClass69_Sub1_139.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static186.aClass69_Sub1_26.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static74.aClass69_Sub1_56.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static44.aClass69_Sub1_34.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static176.aClass69_Sub1_162.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static101.aClass69_Sub1_75.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static92.aClass69_Sub1_68.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static56.aClass69_Sub1_48.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(aClass69_Sub1_98.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static145.aClass69_Sub1_112.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static93.aClass69_Sub1_69.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static160.aClass69_Sub1_163.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static32.aClass69_Sub1_28.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static156.aClass69_Sub1_118.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static53.aClass69_Sub1_46.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static200.aClass69_Sub1_149.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static108.aClass69_Sub1_84.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static209.aClass69_Sub1_160.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2754(Static129.aClass69_Sub1_99.anInt2891);
				Static31.aClass1_Sub7_Sub1_6.method2763(Static176.aClass1_Sub7_Sub1_34.aByteArray38, Static176.aClass1_Sub7_Sub1_34.anInt3592);
				Static91.aClass53_2.method1717(Static31.aClass1_Sub7_Sub1_6.aByteArray38, Static31.aClass1_Sub7_Sub1_6.anInt3592);
				Static176.aClass1_Sub7_Sub1_34.method2810(local221);
				for (@Pc(482) int local482 = 0; local482 < 4; local482++) {
					local221[local482] += 50;
				}
				Static192.aClass1_Sub7_Sub1_31.method2810(local221);
				Static202.anInt4523 = 6;
			}
			if (Static202.anInt4523 == 6 && Static91.aClass53_2.method1718() > 0) {
				local124 = Static91.aClass53_2.method1716();
				if (local124 == 21 && Static160.anInt4679 == 20) {
					Static202.anInt4523 = 7;
				} else if (local124 == 2) {
					Static202.anInt4523 = 9;
				} else if (local124 == 15 && Static160.anInt4679 == 40) {
					Static194.method3312();
					return;
				} else if (local124 == 23 && Static133.anInt2970 < 1) {
					Static202.anInt4523 = 0;
					Static133.anInt2970++;
				} else {
					Static176.method3555(local124);
					return;
				}
			}
			if (Static202.anInt4523 == 7 && Static91.aClass53_2.method1718() > 0) {
				Static13.anInt306 = (Static91.aClass53_2.method1716() + 3) * 60;
				Static202.anInt4523 = 8;
			}
			if (Static202.anInt4523 == 8) {
				Static36.anInt987 = 0;
				Static167.method2843(Static63.method1281(new Class24[] { Static175.method3020(Static13.anInt306 / 60), Static127.aClass24_844 }), Static170.aClass24_1093, Static115.aClass24_767);
				if (--Static13.anInt306 <= 0) {
					Static202.anInt4523 = 0;
				}
			} else {
				if (Static202.anInt4523 == 9 && Static91.aClass53_2.method1718() >= 9) {
					Static27.anInt728 = Static91.aClass53_2.method1716();
					Static74.anInt1790 = Static91.aClass53_2.method1716();
					Static116.aBoolean119 = Static91.aClass53_2.method1716() == 1;
					Static111.anInt2534 = Static91.aClass53_2.method1716();
					Static111.anInt2534 <<= 0x8;
					Static111.anInt2534 += Static91.aClass53_2.method1716();
					Static25.anInt665 = Static91.aClass53_2.method1716();
					Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, 1);
					Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
					Static39.anInt1027 = Static192.aClass1_Sub7_Sub1_31.method2802();
					Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, 2);
					Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
					Static80.anInt1916 = Static192.aClass1_Sub7_Sub1_31.method2765();
					Static202.anInt4523 = 10;
				}
				if (Static202.anInt4523 != 10) {
					Static36.anInt987++;
					if (Static36.anInt987 > 2000) {
						if (Static133.anInt2970 < 1) {
							if (Static147.anInt3278 == Static73.anInt1755) {
								Static73.anInt1755 = Static93.anInt2157;
							} else {
								Static73.anInt1755 = Static147.anInt3278;
							}
							Static202.anInt4523 = 0;
							Static133.anInt2970++;
						} else {
							Static176.method3555(-3);
						}
					}
				} else if (Static91.aClass53_2.method1718() >= Static80.anInt1916) {
					Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
					Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, Static80.anInt1916);
					Static9.method236();
					Static120.anInt2672 = -1;
					Static212.method3583(false);
					Static39.anInt1027 = -1;
				}
			}
		} catch (@Pc(762) IOException local762) {
			if (Static133.anInt2970 < 1) {
				Static202.anInt4523 = 0;
				if (Static73.anInt1755 == Static147.anInt3278) {
					Static73.anInt1755 = Static93.anInt2157;
				} else {
					Static73.anInt1755 = Static147.anInt3278;
				}
				Static133.anInt2970++;
			} else {
				Static176.method3555(-2);
			}
		}
	}
}
