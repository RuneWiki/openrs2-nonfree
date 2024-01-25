import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	public static int anInt5582;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_199 = new Class48(54, 3);

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_146 = new Class211(24, 14);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!cp;Lclient!tq;)V")
	public static void method4798(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class164 arg1) {
		if (Static353.aClass1_Sub6_Sub4_2 == null) {
			return;
		}
		if (Static240.anInt4008 < 10) {
			if (!Static353.aClass230_37.method4958(Static353.aClass1_Sub6_Sub4_2.aString15)) {
				Static240.anInt4008 = Static314.aClass230_70.method4986(Static353.aClass1_Sub6_Sub4_2.aString15) / 10;
				return;
			}
			Static374.method5256();
			Static240.anInt4008 = 10;
		}
		if (Static240.anInt4008 == 10) {
			Static353.anInt2629 = Static353.aClass1_Sub6_Sub4_2.anInt1845 >> 6 << 6;
			Static353.anInt2623 = Static353.aClass1_Sub6_Sub4_2.anInt1848 >> 6 << 6;
			Static353.anInt2630 = (Static353.aClass1_Sub6_Sub4_2.anInt1858 >> 6 << 6) + 64 - Static353.anInt2623;
			Static353.anInt2621 = (Static353.aClass1_Sub6_Sub4_2.anInt1861 >> 6 << 6) + 64 - Static353.anInt2629;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static353.aClass1_Sub6_Sub4_2.method1499(Static256.anInt4410 + (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 >> 7), local76, (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 >> 7) + Static293.anInt5053, Static321.aClass25_Sub1_Sub1_Sub1_2.aByte70)) {
				local78 = local76[1] - Static353.anInt2629;
				local80 = local76[2] - Static353.anInt2623;
			}
			if (!Static213.aBoolean355 && local78 >= 0 && Static353.anInt2621 > local78 && local80 >= 0 && Static353.anInt2630 > local80) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static386.anInt6289 = local78;
				Static299.anInt6015 = local80;
			} else if (Static350.anInt5707 == -1 || Static39.anInt750 == -1) {
				Static353.aClass1_Sub6_Sub4_2.method1493(Static353.aClass1_Sub6_Sub4_2.anInt1855 & 0x3FFF, Static353.aClass1_Sub6_Sub4_2.anInt1855 >> 14 & 0x3FFF, local76);
				Static299.anInt6015 = local76[2] - Static353.anInt2623;
				Static386.anInt6289 = local76[1] - Static353.anInt2629;
			} else {
				Static353.aClass1_Sub6_Sub4_2.method1493(Static39.anInt750, Static350.anInt5707, local76);
				Static213.aBoolean355 = false;
				Static39.anInt750 = -1;
				Static350.anInt5707 = -1;
				if (local76 != null) {
					Static299.anInt6015 = local76[2] - Static353.anInt2623;
					Static386.anInt6289 = local76[1] - Static353.anInt2629;
				}
			}
			if (Static353.aClass1_Sub6_Sub4_2.anInt1854 == 37) {
				Static353.aFloat15 = 3.0F;
				Static353.aFloat16 = 3.0F;
			} else if (Static353.aClass1_Sub6_Sub4_2.anInt1854 == 50) {
				Static353.aFloat15 = 4.0F;
				Static353.aFloat16 = 4.0F;
			} else if (Static353.aClass1_Sub6_Sub4_2.anInt1854 == 75) {
				Static353.aFloat15 = 6.0F;
				Static353.aFloat16 = 6.0F;
			} else if (Static353.aClass1_Sub6_Sub4_2.anInt1854 == 100) {
				Static353.aFloat15 = 8.0F;
				Static353.aFloat16 = 8.0F;
			} else if (Static353.aClass1_Sub6_Sub4_2.anInt1854 == 200) {
				Static353.aFloat15 = 16.0F;
				Static353.aFloat16 = 16.0F;
			} else {
				Static353.aFloat15 = 8.0F;
				Static353.aFloat16 = 8.0F;
			}
			Static353.anInt2619 = (int) Static353.aFloat15 >> 1;
			Static353.aByteArrayArrayArray2 = Static344.method4809(Static353.anInt2619);
			Static201.method2874();
			Static353.method2108();
			Static35.aClass17_8 = new Class17();
			Static353.anInt2618 += (int) (Math.random() * 5.0D) - 2;
			if (Static353.anInt2618 < -8) {
				Static353.anInt2618 = -8;
			}
			Static353.anInt2617 += (int) (Math.random() * 5.0D) - 2;
			if (Static353.anInt2618 > 8) {
				Static353.anInt2618 = 8;
			}
			if (Static353.anInt2617 < -16) {
				Static353.anInt2617 = -16;
			}
			if (Static353.anInt2617 > 16) {
				Static353.anInt2617 = 16;
			}
			Static353.method2114(arg0, Static353.anInt2618 >> 2 << 10, Static353.anInt2617 >> 1);
			Static353.aClass249_4.method5523(1024, 256);
			Static353.aClass184_2.method4225(256, 256);
			Static353.aClass153_3.method3082(4096);
			Static371.aClass147_5.method2960(256);
			Static240.anInt4008 = 20;
		} else if (Static240.anInt4008 == 20) {
			Static41.method630(true);
			Static353.method2118(arg1, Static353.anInt2618, Static353.anInt2617);
			Static240.anInt4008 = 60;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 60) {
			if (Static353.aClass230_37.method4953(Static353.aClass1_Sub6_Sub4_2.aString15 + "_staticelements")) {
				if (!Static353.aClass230_37.method4958(Static353.aClass1_Sub6_Sub4_2.aString15 + "_staticelements")) {
					return;
				}
				Static353.aClass93_2 = Static314.method4648(Static353.aClass1_Sub6_Sub4_2.aString15 + "_staticelements", Static104.aBoolean157, Static353.aClass230_37);
			} else {
				Static353.aClass93_2 = new Class93(0);
			}
			Static353.method2113();
			Static240.anInt4008 = 70;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 70) {
			Static121.aClass79_4 = new Class79(arg1, 11, true, Static177.aCanvas3);
			Static240.anInt4008 = 73;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 73) {
			Static89.aClass79_3 = new Class79(arg1, 12, true, Static177.aCanvas3);
			Static240.anInt4008 = 76;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 76) {
			Static213.aClass79_7 = new Class79(arg1, 14, true, Static177.aCanvas3);
			Static240.anInt4008 = 79;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 79) {
			Static38.aClass79_1 = new Class79(arg1, 17, true, Static177.aCanvas3);
			Static240.anInt4008 = 82;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 82) {
			Static188.aClass79_5 = new Class79(arg1, 19, true, Static177.aCanvas3);
			Static240.anInt4008 = 85;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 85) {
			Static85.aClass79_2 = new Class79(arg1, 22, true, Static177.aCanvas3);
			Static240.anInt4008 = 88;
			Static41.method630(true);
			Static252.method3889();
		} else if (Static240.anInt4008 == 88) {
			Static270.aClass79_8 = new Class79(arg1, 26, true, Static177.aCanvas3);
			Static240.anInt4008 = 91;
			Static41.method630(true);
			Static252.method3889();
		} else {
			Static203.aClass79_6 = new Class79(arg1, 30, true, Static177.aCanvas3);
			Static240.anInt4008 = 100;
			Static41.method630(true);
			Static252.method3889();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method4800() {
		Static81.aClass227_12.method4871();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	public static void method4802() {
		Static281.aClass227_37.method4859(5);
	}
}
