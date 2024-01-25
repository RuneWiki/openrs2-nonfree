import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!ci;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public static int anInt2136 = 0;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt2138 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method2172() {
		Static390.aClass160_64.method3595();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!vc;BLclient!tq;)V")
	public static void method2174(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Interface9 arg1) {
		if (Static338.aClass2_Sub10_Sub8_3 == null) {
			return;
		}
		if (Static309.anInt5191 < 10) {
			if (!Static338.aClass171_44.method3752(Static338.aClass2_Sub10_Sub8_3.aString19)) {
				Static309.anInt5191 = Static67.aClass171_25.method3737(Static338.aClass2_Sub10_Sub8_3.aString19) / 10;
				return;
			}
			Static4.method89();
			Static309.anInt5191 = 10;
		}
		if (Static309.anInt5191 == 10) {
			Static338.anInt3307 = Static338.aClass2_Sub10_Sub8_3.anInt1915 >> 6 << 6;
			Static338.anInt3305 = Static338.aClass2_Sub10_Sub8_3.anInt1919 >> 6 << 6;
			Static338.anInt3306 = (Static338.aClass2_Sub10_Sub8_3.anInt1909 >> 6 << 6) + 64 - Static338.anInt3305;
			Static338.anInt3296 = (Static338.aClass2_Sub10_Sub8_3.anInt1913 >> 6 << 6) + 64 - Static338.anInt3307;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static338.aClass2_Sub10_Sub8_3.method1860((Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 >> 7) + Static319.anInt5425, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, Static28.anInt606 + (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 >> 7), local76)) {
				local80 = local76[2] - Static338.anInt3307;
				local78 = local76[1] - Static338.anInt3305;
			}
			if (!Static148.aBoolean219 && local78 >= 0 && local78 < Static338.anInt3306 && local80 >= 0 && local80 < Static338.anInt3296) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static308.anInt5181 = local80;
				Static82.anInt1484 = local78;
			} else if (Static389.anInt6615 == -1 || Static54.anInt3846 == -1) {
				Static338.aClass2_Sub10_Sub8_3.method1863(local76, Static338.aClass2_Sub10_Sub8_3.anInt1920 & 0x3FFF, Static338.aClass2_Sub10_Sub8_3.anInt1920 >> 14 & 0x3FFF);
				Static82.anInt1484 = local76[1] - Static338.anInt3305;
				Static308.anInt5181 = local76[2] - Static338.anInt3307;
			} else {
				Static338.aClass2_Sub10_Sub8_3.method1863(local76, Static54.anInt3846, Static389.anInt6615);
				if (local76 != null) {
					Static308.anInt5181 = local76[2] - Static338.anInt3307;
					Static82.anInt1484 = local76[1] - Static338.anInt3305;
				}
				Static148.aBoolean219 = false;
				Static54.anInt3846 = -1;
				Static389.anInt6615 = -1;
			}
			if (Static338.aClass2_Sub10_Sub8_3.anInt1904 == 37) {
				Static338.aFloat53 = 3.0F;
				Static338.aFloat52 = 3.0F;
			} else if (Static338.aClass2_Sub10_Sub8_3.anInt1904 == 50) {
				Static338.aFloat53 = 4.0F;
				Static338.aFloat52 = 4.0F;
			} else if (Static338.aClass2_Sub10_Sub8_3.anInt1904 == 75) {
				Static338.aFloat53 = 6.0F;
				Static338.aFloat52 = 6.0F;
			} else if (Static338.aClass2_Sub10_Sub8_3.anInt1904 == 100) {
				Static338.aFloat53 = 8.0F;
				Static338.aFloat52 = 8.0F;
			} else if (Static338.aClass2_Sub10_Sub8_3.anInt1904 == 200) {
				Static338.aFloat53 = 16.0F;
				Static338.aFloat52 = 16.0F;
			} else {
				Static338.aFloat53 = 8.0F;
				Static338.aFloat52 = 8.0F;
			}
			Static338.anInt3294 = (int) Static338.aFloat53 >> 1;
			Static338.aByteArrayArrayArray10 = Static303.method4474(Static338.anInt3294);
			Static52.method874();
			Static338.method3042();
			Static224.aClass30_32 = new Class30();
			Static338.anInt3295 += (int) (Math.random() * 5.0D) - 2;
			if (Static338.anInt3295 < -8) {
				Static338.anInt3295 = -8;
			}
			if (Static338.anInt3295 > 8) {
				Static338.anInt3295 = 8;
			}
			Static338.anInt3293 += (int) (Math.random() * 5.0D) - 2;
			if (Static338.anInt3293 < -16) {
				Static338.anInt3293 = -16;
			}
			if (Static338.anInt3293 > 16) {
				Static338.anInt3293 = 16;
			}
			Static338.method3038(arg1, Static338.anInt3295 >> 2 << 10, Static338.anInt3293 >> 1);
			Static338.aClass226_3.method4912(1024, 256);
			Static338.aClass206_62.method4419(256, 256);
			Static338.aClass118_4.method2857(4096);
			Static341.aClass36_1.method798(256);
			Static309.anInt5191 = 20;
		} else if (Static309.anInt5191 == 20) {
			Static181.method5370(true);
			Static338.method3055(arg0, Static338.anInt3295, Static338.anInt3293);
			Static309.anInt5191 = 60;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 60) {
			if (Static338.aClass171_44.method3751(Static338.aClass2_Sub10_Sub8_3.aString19 + "_staticelements")) {
				if (!Static338.aClass171_44.method3752(Static338.aClass2_Sub10_Sub8_3.aString19 + "_staticelements")) {
					return;
				}
				Static338.aClass209_3 = Static1.method5647(Static338.aClass2_Sub10_Sub8_3.aString19 + "_staticelements", Static338.aClass171_44, Static269.aBoolean348);
			} else {
				Static338.aClass209_3 = new Class209(0);
			}
			Static338.method3036();
			Static309.anInt5191 = 70;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 70) {
			Static379.aClass110_8 = new Class110(arg0, 11, true, Static257.aCanvas4);
			Static309.anInt5191 = 73;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 73) {
			Static46.aClass110_1 = new Class110(arg0, 12, true, Static257.aCanvas4);
			Static309.anInt5191 = 76;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 76) {
			Static219.aClass110_4 = new Class110(arg0, 14, true, Static257.aCanvas4);
			Static309.anInt5191 = 79;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 79) {
			Static373.aClass110_7 = new Class110(arg0, 17, true, Static257.aCanvas4);
			Static309.anInt5191 = 82;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 82) {
			Static160.aClass110_3 = new Class110(arg0, 19, true, Static257.aCanvas4);
			Static309.anInt5191 = 85;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 85) {
			Static269.aClass110_5 = new Class110(arg0, 22, true, Static257.aCanvas4);
			Static309.anInt5191 = 88;
			Static181.method5370(true);
			Static41.method708();
		} else if (Static309.anInt5191 == 88) {
			Static361.aClass110_6 = new Class110(arg0, 26, true, Static257.aCanvas4);
			Static309.anInt5191 = 91;
			Static181.method5370(true);
			Static41.method708();
		} else {
			Static59.aClass110_2 = new Class110(arg0, 30, true, Static257.aCanvas4);
			Static309.anInt5191 = 100;
			Static181.method5370(true);
			Static41.method708();
			System.gc();
		}
	}
}
