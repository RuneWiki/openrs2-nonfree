import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public static void method3691() {
		Static338.aClass26_33.method876();
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)J")
	public static long method3693() {
		return Static24.aClass37_1.method3585();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!aa;Lclient!sr;B)V")
	public static void method3695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static342.aClass1_Sub1_Sub12_2 == null) {
			return;
		}
		if (Static24.anInt671 < 10) {
			if (!Static342.aClass165_43.method4494(Static342.aClass1_Sub1_Sub12_2.aString112)) {
				Static24.anInt671 = Static119.aClass165_41.method4501(Static342.aClass1_Sub1_Sub12_2.aString112) / 10;
				return;
			}
			Static107.method2010();
			Static24.anInt671 = 10;
		}
		if (Static24.anInt671 == 10) {
			Static342.anInt2144 = Static342.aClass1_Sub1_Sub12_2.anInt2824 >> 6 << 6;
			Static342.anInt2150 = Static342.aClass1_Sub1_Sub12_2.anInt2825 >> 6 << 6;
			Static342.anInt2146 = (Static342.aClass1_Sub1_Sub12_2.anInt2830 >> 6 << 6) - (Static342.anInt2150 - 64);
			Static342.anInt2148 = (Static342.aClass1_Sub1_Sub12_2.anInt2829 >> 6 << 6) + 64 - Static342.anInt2144;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static342.aClass1_Sub1_Sub12_2.method2737(Static182.anInt3775 + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7), local76, Static285.anInt5511, Static161.anInt3315 + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7))) {
				local80 = local76[2] - Static342.anInt2150;
				local78 = local76[1] - Static342.anInt2144;
			}
			if (!Static176.aBoolean308 && local78 >= 0 && Static342.anInt2148 > local78 && local80 >= 0 && Static342.anInt2146 > local80) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static90.anInt1760 = local78;
				Static185.anInt1061 = local80;
			} else if (Static243.anInt4737 == -1 || Static33.anInt806 == -1) {
				Static342.aClass1_Sub1_Sub12_2.method2743(Static342.aClass1_Sub1_Sub12_2.anInt2834 & 0x3FFF, Static342.aClass1_Sub1_Sub12_2.anInt2834 >> 14 & 0x3FFF, local76);
				Static90.anInt1760 = local76[1] - Static342.anInt2144;
				Static185.anInt1061 = local76[2] - Static342.anInt2150;
			} else {
				Static342.aClass1_Sub1_Sub12_2.method2743(Static33.anInt806, Static243.anInt4737, local76);
				if (local76 != null) {
					Static90.anInt1760 = local76[1] - Static342.anInt2144;
					Static185.anInt1061 = local76[2] - Static342.anInt2150;
				}
				Static33.anInt806 = -1;
				Static243.anInt4737 = -1;
				Static176.aBoolean308 = false;
			}
			if (Static342.aClass1_Sub1_Sub12_2.anInt2826 == 37) {
				Static342.aFloat37 = 3.0F;
				Static342.aFloat38 = 3.0F;
			} else if (Static342.aClass1_Sub1_Sub12_2.anInt2826 == 50) {
				Static342.aFloat37 = 4.0F;
				Static342.aFloat38 = 4.0F;
			} else if (Static342.aClass1_Sub1_Sub12_2.anInt2826 == 75) {
				Static342.aFloat37 = 6.0F;
				Static342.aFloat38 = 6.0F;
			} else if (Static342.aClass1_Sub1_Sub12_2.anInt2826 == 100) {
				Static342.aFloat37 = 8.0F;
				Static342.aFloat38 = 8.0F;
			} else if (Static342.aClass1_Sub1_Sub12_2.anInt2826 == 200) {
				Static342.aFloat37 = 16.0F;
				Static342.aFloat38 = 16.0F;
			} else {
				Static342.aFloat37 = 8.0F;
				Static342.aFloat38 = 8.0F;
			}
			Static342.anInt2137 = (int) Static342.aFloat37 >> 1;
			Static342.aByteArrayArrayArray3 = Static144.method2744(Static342.anInt2137);
			Static346.method5645();
			Static342.method1963();
			Static185.aClass195_5 = new Class195();
			Static342.anInt2138 += (int) (Math.random() * 5.0D) - 2;
			if (Static342.anInt2138 < -8) {
				Static342.anInt2138 = -8;
			}
			if (Static342.anInt2138 > 8) {
				Static342.anInt2138 = 8;
			}
			Static342.anInt2139 += (int) (Math.random() * 5.0D) - 2;
			if (Static342.anInt2139 < -16) {
				Static342.anInt2139 = -16;
			}
			if (Static342.anInt2139 > 16) {
				Static342.anInt2139 = 16;
			}
			Static342.method1970(arg1, Static342.anInt2138 >> 2 << 10, Static342.anInt2139 >> 1);
			Static187.method3638(1024, 256);
			Static178.method3484(256, 256);
			Static25.method754(4096);
			Static309.method5205(256);
			Static24.anInt671 = 20;
		} else if (Static24.anInt671 == 20) {
			Static111.method2071(true);
			Static342.method1968(arg0, Static342.anInt2138, Static342.anInt2139);
			Static24.anInt671 = 60;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 60) {
			if (Static342.aClass165_43.method4481(Static342.aClass1_Sub1_Sub12_2.aString112 + "_staticelements")) {
				if (!Static342.aClass165_43.method4494(Static342.aClass1_Sub1_Sub12_2.aString112 + "_staticelements")) {
					return;
				}
				Static342.aClass6_3 = Static300.method5116(Static220.aBoolean369, Static342.aClass1_Sub1_Sub12_2.aString112 + "_staticelements", Static342.aClass165_43);
			} else {
				Static342.aClass6_3 = new Class6(0);
			}
			Static342.method1964();
			Static24.anInt671 = 70;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 70) {
			Static85.aClass16_7 = new Class16(arg0, 11, true, Static261.aCanvas4);
			Static24.anInt671 = 73;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 73) {
			Static253.aClass16_18 = new Class16(arg0, 12, true, Static261.aCanvas4);
			Static24.anInt671 = 76;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 76) {
			Static281.aClass16_22 = new Class16(arg0, 14, true, Static261.aCanvas4);
			Static24.anInt671 = 79;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 79) {
			Static251.aClass16_27 = new Class16(arg0, 17, true, Static261.aCanvas4);
			Static24.anInt671 = 82;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 82) {
			Static177.aClass16_15 = new Class16(arg0, 19, true, Static261.aCanvas4);
			Static24.anInt671 = 85;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 85) {
			Static311.aClass16_24 = new Class16(arg0, 22, true, Static261.aCanvas4);
			Static24.anInt671 = 88;
			Static111.method2071(true);
			Static72.method1432();
		} else if (Static24.anInt671 == 88) {
			Static258.aClass16_20 = new Class16(arg0, 26, true, Static261.aCanvas4);
			Static24.anInt671 = 91;
			Static111.method2071(true);
			Static72.method1432();
		} else {
			Static215.aClass16_16 = new Class16(arg0, 30, true, Static261.aCanvas4);
			Static24.anInt671 = 100;
			Static111.method2071(true);
			Static72.method1432();
			System.gc();
		}
	}
}
