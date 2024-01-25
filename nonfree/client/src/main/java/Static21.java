import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public static int anInt211;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject1;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!os;")
	public static final Class245 aClass245_6 = new Class245(1);

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public static int anInt214 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!fa;Lclient!r;I)V")
	public static void method220(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class31 arg1) {
		if (Static157.aClass3_Sub7_Sub1_3 == null) {
			return;
		}
		if (Static111.anInt2675 < 10) {
			if (!Static157.aClass284_35.method6352(Static157.aClass3_Sub7_Sub1_3.aString21)) {
				Static111.anInt2675 = Static332.aClass284_24.method6340(Static157.aClass3_Sub7_Sub1_3.aString21) / 10;
				return;
			}
			Static456.method6282();
			Static111.anInt2675 = 10;
		}
		if (Static111.anInt2675 == 10) {
			Static157.anInt2670 = Static157.aClass3_Sub7_Sub1_3.anInt361 >> 6 << 6;
			Static157.anInt2671 = Static157.aClass3_Sub7_Sub1_3.anInt366 >> 6 << 6;
			Static157.anInt2663 = (Static157.aClass3_Sub7_Sub1_3.anInt362 >> 6 << 6) + 64 - Static157.anInt2671;
			Static157.anInt2673 = (Static157.aClass3_Sub7_Sub1_3.anInt360 >> 6 << 6) + 64 - Static157.anInt2670;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static157.aClass3_Sub7_Sub1_3.method330(Static321.anInt5874 + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476 >> 9), local74, Static137.anInt3293 + (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482 >> 9), Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117)) {
				local78 = local74[2] - Static157.anInt2671;
				local76 = local74[1] - Static157.anInt2670;
			}
			if (!Static274.aBoolean348 && local76 >= 0 && local76 < Static157.anInt2673 && local78 >= 0 && Static157.anInt2663 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static79.anInt2117 = local76;
				Static461.anInt8061 = local78;
			} else if (Static46.anInt1248 == -1 || Static76.anInt4840 == -1) {
				Static157.aClass3_Sub7_Sub1_3.method334(Static157.aClass3_Sub7_Sub1_3.anInt359 & 0x3FFF, Static157.aClass3_Sub7_Sub1_3.anInt359 >> 14 & 0x3FFF, local74);
				Static461.anInt8061 = local74[2] - Static157.anInt2671;
				Static79.anInt2117 = local74[1] - Static157.anInt2670;
			} else {
				Static157.aClass3_Sub7_Sub1_3.method334(Static76.anInt4840, Static46.anInt1248, local74);
				if (local74 != null) {
					Static79.anInt2117 = local74[1] - Static157.anInt2670;
					Static461.anInt8061 = local74[2] - Static157.anInt2671;
				}
				Static76.anInt4840 = -1;
				Static46.anInt1248 = -1;
				Static274.aBoolean348 = false;
			}
			if (Static157.aClass3_Sub7_Sub1_3.anInt356 == 37) {
				Static157.aFloat71 = 3.0F;
				Static157.aFloat72 = 3.0F;
			} else if (Static157.aClass3_Sub7_Sub1_3.anInt356 == 50) {
				Static157.aFloat71 = 4.0F;
				Static157.aFloat72 = 4.0F;
			} else if (Static157.aClass3_Sub7_Sub1_3.anInt356 == 75) {
				Static157.aFloat71 = 6.0F;
				Static157.aFloat72 = 6.0F;
			} else if (Static157.aClass3_Sub7_Sub1_3.anInt356 == 100) {
				Static157.aFloat71 = 8.0F;
				Static157.aFloat72 = 8.0F;
			} else if (Static157.aClass3_Sub7_Sub1_3.anInt356 == 200) {
				Static157.aFloat71 = 16.0F;
				Static157.aFloat72 = 16.0F;
			} else {
				Static157.aFloat71 = 8.0F;
				Static157.aFloat72 = 8.0F;
			}
			Static157.anInt2659 = (int) Static157.aFloat71 >> 1;
			Static157.aByteArrayArrayArray3 = Static535.method7337(Static157.anInt2659);
			Static277.method4203();
			Static157.method2236();
			Static448.aClass244_72 = new Class244();
			Static157.anInt2661 += (int) (Math.random() * 5.0D) - 2;
			if (Static157.anInt2661 < -8) {
				Static157.anInt2661 = -8;
			}
			if (Static157.anInt2661 > 8) {
				Static157.anInt2661 = 8;
			}
			Static157.anInt2660 += (int) (Math.random() * 5.0D) - 2;
			if (Static157.anInt2660 < -16) {
				Static157.anInt2660 = -16;
			}
			if (Static157.anInt2660 > 16) {
				Static157.anInt2660 = 16;
			}
			Static157.method2240(arg0, Static157.anInt2661 >> 2 << 10, Static157.anInt2660 >> 1);
			Static157.aClass189_2.method4643(1024, 256);
			Static157.aClass296_3.method6526(256, 256);
			Static157.aClass146_2.method3724(4096);
			Static333.aClass177_1.method4303(256);
			Static111.anInt2675 = 20;
		} else if (Static111.anInt2675 == 20) {
			Static375.method5253(true);
			Static157.method2247(arg1, Static157.anInt2661, Static157.anInt2660);
			Static111.anInt2675 = 60;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 60) {
			if (Static157.aClass284_35.method6348(Static157.aClass3_Sub7_Sub1_3.aString21 + "_staticelements")) {
				if (!Static157.aClass284_35.method6352(Static157.aClass3_Sub7_Sub1_3.aString21 + "_staticelements")) {
					return;
				}
				Static157.aClass57_2 = Static274.method4157(Static157.aClass284_35, Static157.aClass3_Sub7_Sub1_3.aString21 + "_staticelements", Static150.aBoolean247);
			} else {
				Static157.aClass57_2 = new Class57(0);
			}
			Static157.method2245();
			Static111.anInt2675 = 70;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 70) {
			Static193.aClass262_4 = new Class262(arg1, 11, true, Static129.aCanvas6);
			Static111.anInt2675 = 73;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 73) {
			Static139.aClass262_5 = new Class262(arg1, 12, true, Static129.aCanvas6);
			Static111.anInt2675 = 76;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 76) {
			Static569.aClass262_9 = new Class262(arg1, 14, true, Static129.aCanvas6);
			Static111.anInt2675 = 79;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 79) {
			Static38.aClass262_1 = new Class262(arg1, 17, true, Static129.aCanvas6);
			Static111.anInt2675 = 82;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 82) {
			Static142.aClass262_3 = new Class262(arg1, 19, true, Static129.aCanvas6);
			Static111.anInt2675 = 85;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 85) {
			Static540.aClass262_8 = new Class262(arg1, 22, true, Static129.aCanvas6);
			Static111.anInt2675 = 88;
			Static375.method5253(true);
			Static288.method4330();
		} else if (Static111.anInt2675 == 88) {
			Static412.aClass262_6 = new Class262(arg1, 26, true, Static129.aCanvas6);
			Static111.anInt2675 = 91;
			Static375.method5253(true);
			Static288.method4330();
		} else {
			Static538.aClass262_7 = new Class262(arg1, 30, true, Static129.aCanvas6);
			Static111.anInt2675 = 100;
			Static375.method5253(true);
			Static288.method4330();
			System.gc();
		}
	}
}
