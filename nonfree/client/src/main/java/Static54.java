import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "Lclient!jba;")
	public static Class1_Sub6_Sub2 aClass1_Sub6_Sub2_2;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "Lclient!em;")
	public static final Class83 aClass83_35 = new Class83(8, 0);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public static void method938() throws IOException {
		if (Static485.aClass43_1 == null || Static528.anInt8967 <= 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		while (true) {
			@Pc(25) Class1_Sub9 local25 = (Class1_Sub9) Static263.aClass111_23.method2547();
			if (local25 == null) {
				Static400.anInt7179 += local18;
				Static337.anInt6171 = 0;
				return;
			}
			Static485.aClass43_1.method1047(local25.aClass1_Sub3_Sub1_1.aByteArray104, local25.anInt633);
			local18 += local25.anInt633;
			Static528.anInt8967 -= local25.anInt633;
			local25.method7908();
			local25.aClass1_Sub3_Sub1_1.method7941();
			local25.method556();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BLclient!fa;Lclient!r;)V")
	public static void method939(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class78 arg1) {
		if (Static287.aClass1_Sub8_Sub11_2 == null) {
			return;
		}
		if (Static142.anInt2752 < 10) {
			if (!Static287.aClass308_84.method6540(Static287.aClass1_Sub8_Sub11_2.aString84)) {
				Static142.anInt2752 = Static193.aClass308_80.method6553(Static287.aClass1_Sub8_Sub11_2.aString84) / 10;
				return;
			}
			Static4.method7630();
			Static142.anInt2752 = 10;
		}
		if (Static142.anInt2752 == 10) {
			Static287.anInt3862 = Static287.aClass1_Sub8_Sub11_2.anInt7418 >> 6 << 6;
			Static287.anInt3859 = Static287.aClass1_Sub8_Sub11_2.anInt7429 >> 6 << 6;
			Static287.anInt3861 = (Static287.aClass1_Sub8_Sub11_2.anInt7416 >> 6 << 6) + 64 - Static287.anInt3859;
			Static287.anInt3863 = (Static287.aClass1_Sub8_Sub11_2.anInt7424 >> 6 << 6) + 64 - Static287.anInt3862;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static287.aClass1_Sub8_Sub11_2.method5981(Static311.anInt5708 + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9), Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113, local74, Static539.anInt9045 + (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9))) {
				local78 = local74[2] - Static287.anInt3862;
				local76 = local74[1] - Static287.anInt3859;
			}
			if (!Static341.aBoolean497 && local76 >= 0 && local76 < Static287.anInt3861 && local78 >= 0 && local78 < Static287.anInt3863) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static249.anInt4547 = local78;
				Static500.anInt8734 = local76;
			} else if (Static74.anInt3294 == -1 || Static309.anInt5687 == -1) {
				Static287.aClass1_Sub8_Sub11_2.method5978(local74, Static287.aClass1_Sub8_Sub11_2.anInt7427 & 0x3FFF, Static287.aClass1_Sub8_Sub11_2.anInt7427 >> 14 & 0x3FFF);
				Static500.anInt8734 = local74[1] - Static287.anInt3859;
				Static249.anInt4547 = local74[2] - Static287.anInt3862;
			} else {
				Static287.aClass1_Sub8_Sub11_2.method5978(local74, Static309.anInt5687, Static74.anInt3294);
				if (local74 != null) {
					Static249.anInt4547 = local74[2] - Static287.anInt3862;
					Static500.anInt8734 = local74[1] - Static287.anInt3859;
				}
				Static341.aBoolean497 = false;
				Static309.anInt5687 = -1;
				Static74.anInt3294 = -1;
			}
			if (Static287.aClass1_Sub8_Sub11_2.anInt7423 == 37) {
				Static287.aFloat105 = 3.0F;
				Static287.aFloat106 = 3.0F;
			} else if (Static287.aClass1_Sub8_Sub11_2.anInt7423 == 50) {
				Static287.aFloat105 = 4.0F;
				Static287.aFloat106 = 4.0F;
			} else if (Static287.aClass1_Sub8_Sub11_2.anInt7423 == 75) {
				Static287.aFloat105 = 6.0F;
				Static287.aFloat106 = 6.0F;
			} else if (Static287.aClass1_Sub8_Sub11_2.anInt7423 == 100) {
				Static287.aFloat105 = 8.0F;
				Static287.aFloat106 = 8.0F;
			} else if (Static287.aClass1_Sub8_Sub11_2.anInt7423 == 200) {
				Static287.aFloat105 = 16.0F;
				Static287.aFloat106 = 16.0F;
			} else {
				Static287.aFloat105 = 8.0F;
				Static287.aFloat106 = 8.0F;
			}
			Static287.anInt3850 = (int) Static287.aFloat105 >> 1;
			Static287.aByteArrayArrayArray3 = Static351.method5245(Static287.anInt3850);
			Static434.method6193();
			Static287.method3141();
			Static49.aClass111_4 = new Class111();
			Static287.anInt3852 += (int) (Math.random() * 5.0D) - 2;
			if (Static287.anInt3852 < -8) {
				Static287.anInt3852 = -8;
			}
			if (Static287.anInt3852 > 8) {
				Static287.anInt3852 = 8;
			}
			Static287.anInt3851 += (int) (Math.random() * 5.0D) - 2;
			if (Static287.anInt3851 < -16) {
				Static287.anInt3851 = -16;
			}
			if (Static287.anInt3851 > 16) {
				Static287.anInt3851 = 16;
			}
			Static287.method3151(arg0, Static287.anInt3852 >> 2 << 10, Static287.anInt3851 >> 1);
			Static287.aClass113_3.method2593(256, 1024);
			Static287.aClass33_4.method792(256, 256);
			Static287.aClass122_2.method2772(4096);
			Static300.aClass321_3.method7115(256);
			Static142.anInt2752 = 20;
		} else if (Static142.anInt2752 == 20) {
			Static213.method3214(true);
			Static287.method3157(arg1, Static287.anInt3852, Static287.anInt3851);
			Static142.anInt2752 = 60;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 60) {
			if (Static287.aClass308_84.method6539(Static287.aClass1_Sub8_Sub11_2.aString84 + "_staticelements")) {
				if (!Static287.aClass308_84.method6540(Static287.aClass1_Sub8_Sub11_2.aString84 + "_staticelements")) {
					return;
				}
				Static287.aClass267_3 = Static361.method5317(Static287.aClass308_84, Static431.aBoolean583, Static287.aClass1_Sub8_Sub11_2.aString84 + "_staticelements");
			} else {
				Static287.aClass267_3 = new Class267(0);
			}
			Static287.method3150();
			Static142.anInt2752 = 70;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 70) {
			Static43.aClass204_1 = new Class204(arg1, 11, true, Static103.aCanvas2);
			Static142.anInt2752 = 73;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 73) {
			Static249.aClass204_4 = new Class204(arg1, 12, true, Static103.aCanvas2);
			Static142.anInt2752 = 76;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 76) {
			Static476.aClass204_7 = new Class204(arg1, 14, true, Static103.aCanvas2);
			Static142.anInt2752 = 79;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 79) {
			Static500.aClass204_8 = new Class204(arg1, 17, true, Static103.aCanvas2);
			Static142.anInt2752 = 82;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 82) {
			Static445.aClass204_6 = new Class204(arg1, 19, true, Static103.aCanvas2);
			Static142.anInt2752 = 85;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 85) {
			Static370.aClass204_5 = new Class204(arg1, 22, true, Static103.aCanvas2);
			Static142.anInt2752 = 88;
			Static213.method3214(true);
			Static583.method7812();
		} else if (Static142.anInt2752 == 88) {
			Static72.aClass204_2 = new Class204(arg1, 26, true, Static103.aCanvas2);
			Static142.anInt2752 = 91;
			Static213.method3214(true);
			Static583.method7812();
		} else {
			Static182.aClass204_3 = new Class204(arg1, 30, true, Static103.aCanvas2);
			Static142.anInt2752 = 100;
			Static213.method3214(true);
			Static583.method7812();
			System.gc();
		}
	}
}
