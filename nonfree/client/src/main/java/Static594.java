import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
	public static int anInt9913;

	@OriginalMember(owner = "client!vca", name = "K", descriptor = "Lclient!nga;")
	public static Class228 aClass228_10;

	@OriginalMember(owner = "client!vca", name = "M", descriptor = "D")
	public static double aDouble62;

	@OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
	public static int anInt9912 = 0;

	@OriginalMember(owner = "client!vca", name = "P", descriptor = "J")
	public static long aLong259 = 0L;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "()V")
	public static void method8138() {
		Static234.method4501(Static626.anInt10336);
	}

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "(I)V")
	public static void method8139() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static178.aBooleanArray12[local7] = true;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLclient!ha;Lclient!d;)V")
	public static void method8141(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Interface5 arg1) {
		if (Static361.aClass3_Sub1_Sub16_2 == null) {
			return;
		}
		if (Static102.anInt9953 < 10) {
			if (!Static361.aClass181_16.method5038(Static361.aClass3_Sub1_Sub16_2.aString75)) {
				Static102.anInt9953 = Static35.aClass181_4.method5036(Static361.aClass3_Sub1_Sub16_2.aString75) / 10;
				return;
			}
			Static371.method5921();
			Static102.anInt9953 = 10;
		}
		if (Static102.anInt9953 == 10) {
			Static361.anInt2229 = Static361.aClass3_Sub1_Sub16_2.anInt7073 >> 6 << 6;
			Static361.anInt2230 = Static361.aClass3_Sub1_Sub16_2.anInt7064 >> 6 << 6;
			Static361.anInt2226 = (Static361.aClass3_Sub1_Sub16_2.anInt7072 >> 6 << 6) + 64 - Static361.anInt2230;
			Static361.anInt2228 = (Static361.aClass3_Sub1_Sub16_2.anInt7069 >> 6 << 6) + 64 - Static361.anInt2229;
			@Pc(82) int[] local82 = new int[3];
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static361.aClass3_Sub1_Sub16_2.method5926(local82, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, Static124.anInt3150 + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424 >> 9), Static446.anInt8090 + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 >> 9))) {
				local84 = local82[1] - Static361.anInt2229;
				local86 = local82[2] - Static361.anInt2230;
			}
			if (!Static173.aBoolean847 && local84 >= 0 && local84 < Static361.anInt2228 && local86 >= 0 && Static361.anInt2226 > local86) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static353.anInt6903 = local84;
				Static386.anInt8408 = local86;
			} else if (Static291.anInt5922 == -1 || Static623.anInt10314 == -1) {
				Static361.aClass3_Sub1_Sub16_2.method5925(Static361.aClass3_Sub1_Sub16_2.anInt7065 & 0x3FFF, local82, Static361.aClass3_Sub1_Sub16_2.anInt7065 >> 14 & 0x3FFF);
				Static386.anInt8408 = local82[2] - Static361.anInt2230;
				Static353.anInt6903 = local82[1] - Static361.anInt2229;
			} else {
				Static361.aClass3_Sub1_Sub16_2.method5925(Static623.anInt10314, local82, Static291.anInt5922);
				Static623.anInt10314 = -1;
				Static291.anInt5922 = -1;
				if (local82 != null) {
					Static386.anInt8408 = local82[2] - Static361.anInt2230;
					Static353.anInt6903 = local82[1] - Static361.anInt2229;
				}
				Static173.aBoolean847 = false;
			}
			if (Static361.aClass3_Sub1_Sub16_2.anInt7068 == 37) {
				Static361.aFloat88 = 3.0F;
				Static361.aFloat89 = 3.0F;
			} else if (Static361.aClass3_Sub1_Sub16_2.anInt7068 == 50) {
				Static361.aFloat88 = 4.0F;
				Static361.aFloat89 = 4.0F;
			} else if (Static361.aClass3_Sub1_Sub16_2.anInt7068 == 75) {
				Static361.aFloat88 = 6.0F;
				Static361.aFloat89 = 6.0F;
			} else if (Static361.aClass3_Sub1_Sub16_2.anInt7068 == 100) {
				Static361.aFloat88 = 8.0F;
				Static361.aFloat89 = 8.0F;
			} else if (Static361.aClass3_Sub1_Sub16_2.anInt7068 == 200) {
				Static361.aFloat88 = 16.0F;
				Static361.aFloat89 = 16.0F;
			} else {
				Static361.aFloat88 = 8.0F;
				Static361.aFloat89 = 8.0F;
			}
			Static361.anInt2219 = (int) Static361.aFloat88 >> 1;
			Static361.aByteArrayArrayArray2 = Static601.method8191(Static361.anInt2219);
			Static249.method4696();
			Static361.method2173();
			Static529.aClass276_54 = new Class276();
			Static361.anInt2217 += (int) (Math.random() * 5.0D) - 2;
			if (Static361.anInt2217 < -8) {
				Static361.anInt2217 = -8;
			}
			if (Static361.anInt2217 > 8) {
				Static361.anInt2217 = 8;
			}
			Static361.anInt2218 += (int) (Math.random() * 5.0D) - 2;
			if (Static361.anInt2218 < -16) {
				Static361.anInt2218 = -16;
			}
			if (Static361.anInt2218 > 16) {
				Static361.anInt2218 = 16;
			}
			Static361.method2171(arg1, Static361.anInt2217 >> 2 << 10, Static361.anInt2218 >> 1);
			Static361.aClass115_3.method3755(1024, 256);
			Static361.aClass204_2.method5446(256, 256);
			Static361.aClass349_2.method8118(4096);
			Static390.aClass359_1.method8265(256);
			Static102.anInt9953 = 20;
		} else if (Static102.anInt9953 == 20) {
			Static111.method2712(true);
			Static361.method2161(arg0, Static361.anInt2217, Static361.anInt2218);
			Static102.anInt9953 = 60;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 60) {
			if (Static361.aClass181_16.method5034(Static361.aClass3_Sub1_Sub16_2.aString75 + "_staticelements")) {
				if (!Static361.aClass181_16.method5038(Static361.aClass3_Sub1_Sub16_2.aString75 + "_staticelements")) {
					return;
				}
				Static361.aClass57_2 = Static74.method1856(Static87.aBoolean195, Static361.aClass181_16, Static361.aClass3_Sub1_Sub16_2.aString75 + "_staticelements");
			} else {
				Static361.aClass57_2 = new Class57(0);
			}
			Static361.method2157();
			Static102.anInt9953 = 70;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 70) {
			Static168.aClass29_2 = new Class29(arg0, 11, true, Static177.aCanvas10);
			Static102.anInt9953 = 73;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 73) {
			Static274.aClass29_6 = new Class29(arg0, 12, true, Static177.aCanvas10);
			Static102.anInt9953 = 76;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 76) {
			Static483.aClass29_8 = new Class29(arg0, 14, true, Static177.aCanvas10);
			Static102.anInt9953 = 79;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 79) {
			Static395.aClass29_7 = new Class29(arg0, 17, true, Static177.aCanvas10);
			Static102.anInt9953 = 82;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 82) {
			Static219.aClass29_5 = new Class29(arg0, 19, true, Static177.aCanvas10);
			Static102.anInt9953 = 85;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 85) {
			Static130.aClass29_1 = new Class29(arg0, 22, true, Static177.aCanvas10);
			Static102.anInt9953 = 88;
			Static111.method2712(true);
			Static123.method2861();
		} else if (Static102.anInt9953 == 88) {
			Static171.aClass29_3 = new Class29(arg0, 26, true, Static177.aCanvas10);
			Static102.anInt9953 = 91;
			Static111.method2712(true);
			Static123.method2861();
		} else {
			Static188.aClass29_4 = new Class29(arg0, 30, true, Static177.aCanvas10);
			Static102.anInt9953 = 100;
			Static111.method2712(true);
			Static123.method2861();
			System.gc();
		}
	}
}
