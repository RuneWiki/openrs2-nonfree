import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_149 = new Class200(42, 6);

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
	public static final int[] anIntArray663 = new int[32];

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
	public static final boolean aBoolean729 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIZII)V")
	public static void method8718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static330.aClass77ArrayArrayArray2 == null) {
			Static323.aClass5_9.method7528(arg0, arg4, arg3, arg1, -16777216);
		} else if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >= 0 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 < Static634.anInt10129 * 512 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >= 0 && Static638.anInt10172 * 512 > Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911) {
			Static45.anInt1320++;
			if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 != null && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 - (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() - 1) * 256 >> 9 == Static520.anInt9372 && Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 - (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059() - 1) * 256 >> 9 == Static300.anInt5337) {
				Static520.anInt9372 = -1;
				Static300.anInt5337 = -1;
				Static368.method5986();
			}
			Static359.method5892();
			if (!arg2) {
				Static525.method4230();
			}
			Static347.method5790();
			Static11.method8403(arg1, arg3, arg0, arg4, true);
			@Pc(104) int local104 = Static509.anInt8807;
			@Pc(106) int local106 = Static506.anInt8740;
			@Pc(108) int local108 = Static517.anInt8967;
			@Pc(110) int local110 = Static596.anInt9758;
			Static401.anInt7417 = Static401.anInt7424;
			@Pc(120) int local120;
			@Pc(157) int local157;
			if (Static305.anInt5422 == 1) {
				local120 = (int) Static620.aFloat209;
				if (local120 < Static40.anInt1256 >> 8) {
					local120 = Static40.anInt1256 >> 8;
				}
				if (Static424.aBooleanArray19[4] && Static636.anIntArray660[4] + 128 > local120) {
					local120 = Static636.anIntArray660[4] + 128;
				}
				local157 = Static424.anInt7664 + (int) Static401.aFloat165 & 0x3FFF;
				Static439.method6844(Static528.anInt9022, local157, (local120 >> 3) * 3 + 600 << 2, Static192.method3263(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916, Static549.anInt9262) - 200, local106, local120, Static410.anInt7502);
			} else if (Static305.anInt5422 == 4) {
				local120 = (int) Static620.aFloat209;
				if (local120 < Static40.anInt1256 >> 8) {
					local120 = Static40.anInt1256 >> 8;
				}
				if (Static424.aBooleanArray19[4] && local120 < Static636.anIntArray660[4] + 128) {
					local120 = Static636.anIntArray660[4] + 128;
				}
				local157 = (int) Static401.aFloat165 & 0x3FFF;
				Static439.method6844(Static528.anInt9022, local157, (local120 >> 3) * 3 + 600 << 2, Static192.method3263(Static349.anInt6751, Static602.anInt9811, Static549.anInt9262) - 200, local106, local120, Static410.anInt7502);
			} else if (Static305.anInt5422 == 5) {
				Static288.method4613(local106);
			}
			local120 = Static611.anInt9892;
			local157 = Static557.anInt9304;
			@Pc(268) int local268 = Static20.anInt824;
			@Pc(270) int local270 = Static393.anInt7268;
			@Pc(272) int local272 = Static185.anInt5215;
			@Pc(315) int local315;
			for (@Pc(274) int local274 = 0; local274 < 5; local274++) {
				if (Static424.aBooleanArray19[local274]) {
					local315 = (int) (Math.random() * (double) (Static106.anIntArray91[local274] * 2 + 1) - (double) Static106.anIntArray91[local274] + Math.sin((double) Static293.anIntArray280[local274] * ((double) Static446.anIntArray494[local274] / 100.0D)) * (double) Static636.anIntArray660[local274]);
					if (local274 == 4) {
						Static393.anInt7268 += local315;
						if (Static393.anInt7268 < 1024) {
							Static393.anInt7268 = 1024;
						} else if (Static393.anInt7268 > 3072) {
							Static393.anInt7268 = 3072;
						}
					}
					if (local274 == 0) {
						Static611.anInt9892 += local315 << 2;
					}
					if (local274 == 1) {
						Static557.anInt9304 += local315 << 2;
					}
					if (local274 == 2) {
						Static20.anInt824 += local315 << 2;
					}
					if (local274 == 3) {
						Static185.anInt5215 = local315 + Static185.anInt5215 & 0x3FFF;
					}
				}
			}
			if (Static611.anInt9892 < 0) {
				Static611.anInt9892 = 0;
			}
			if ((Static569.anInt9425 << 9) - 1 < Static611.anInt9892) {
				Static611.anInt9892 = (Static569.anInt9425 << 9) - 1;
			}
			if (Static20.anInt824 < 0) {
				Static20.anInt824 = 0;
			}
			if (Static20.anInt824 > (Static293.anInt5181 << 9) - 1) {
				Static20.anInt824 = (Static293.anInt5181 << 9) - 1;
			}
			Static227.method3764();
			Static144.method2656();
			Static323.aClass5_9.KA(local104, local108, local104 + local110, local106 + local108);
			Static511.method7629(true);
			if (Static219.aBoolean285) {
				Static178.method8678(Static199.anInt3921);
				if (Static189.anInt3589 != Static401.anInt7417) {
					Static585.aBoolean690 = true;
				}
				Static189.anInt3589 = Static401.anInt7417;
			} else {
				Static323.aClass5_9.ya();
				local315 = Static199.anInt3921;
				if (Static175.aClass327_1 == null) {
					Static323.aClass5_9.GA(local315);
				} else {
					Static175.aClass327_1.method8025(Static393.anInt7268, local104, Static573.anInt9447 << 3, local106, local110, Static185.anInt5215, local315, Static323.aClass5_9, local108);
				}
			}
			Static1.method8294();
			Static250.aClass39_4.method7249(Static611.anInt9892, Static557.anInt9304, Static20.anInt824, -Static393.anInt7268 & 0x3FFF, -Static185.anInt5215 & 0x3FFF, -Static72.anInt1723 & 0x3FFF);
			Static323.aClass5_9.method7504(Static250.aClass39_4);
			Static323.aClass5_9.DA(local104 + local110 / 2, local108 - -(local106 / 2), Static105.anInt2311 << 1, Static105.anInt2311 << 1);
			Static128.method2509(Static105.anInt2311 << 1, Static105.anInt2311 << 1, local104 + local110 / 2, local106 / 2 + local108);
			Static60.method1629(-Static185.anInt5215 & 0x3FFF, Static557.anInt9304, Static611.anInt9892, -Static72.anInt1723 & 0x3FFF, -Static393.anInt7268 & 0x3FFF, Static20.anInt824);
			@Pc(577) byte local577 = Static262.aClass3_Sub27_12.aClass21_Sub27_1.method8338() == 2 ? (byte) Static45.anInt1320 : 1;
			if (Static219.aBoolean285) {
				Static309.method5101(-Static185.anInt5215 & 0x3FFF, -Static72.anInt1723 & 0x3FFF, -Static393.anInt7268 & 0x3FFF);
				Static208.method7377(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9, Static332.anIntArray382, Static101.anInt2262, Static262.aClass3_Sub27_12.aClass21_Sub7_1.method2118() == 0, Static429.anIntArray474, Static441.anIntArray484, Static3.aByteArrayArrayArray1, local577, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 + 1, Static557.anInt9304, Static401.anInt7417, Static444.anIntArray555, Static20.anInt824, Static576.anIntArray604, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9, Static611.anInt9892);
			} else {
				Static623.method8626(Static101.anInt2262, Static611.anInt9892, Static557.anInt9304, Static20.anInt824, Static3.aByteArrayArrayArray1, Static332.anIntArray382, Static441.anIntArray484, Static576.anIntArray604, Static429.anIntArray474, Static444.anIntArray555, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123 + 1, local577, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9, Static262.aClass3_Sub27_12.aClass21_Sub7_1.method2118() == 0, Static279.aBoolean329 ? Static401.anInt7417 : -1, 0, false);
			}
			Static1.method8294();
			if (Static485.anInt8420 == 10) {
				Static213.method3614(local110, local106, local104, local108);
				Static90.method2062(local108, local106, local104, local110);
				Static528.method7752(local108, local106, local104, local110);
				Static12.method830(local104, local110, local108, local106);
			}
			Static50.method1458();
			Static557.anInt9304 = local157;
			Static393.anInt7268 = local270;
			Static20.anInt824 = local268;
			Static611.anInt9892 = local120;
			Static185.anInt5215 = local272;
			if (Static538.aBoolean657 && Static365.aClass248_1.method6458() == 0) {
				Static538.aBoolean657 = false;
			}
			if (Static538.aBoolean657) {
				Static323.aClass5_9.method7528(local104, local106, local110, local108, -16777216);
				Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, false, Static59.aClass43_12.method1598(Static325.anInt6083));
			}
			Static511.method7629(false);
		} else {
			Static323.aClass5_9.method7528(arg0, arg4, arg3, arg1, -16777216);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method8719() {
		@Pc(16) Class3_Sub14 local16 = Static139.method2308(Static169.aClass130_49, Static24.aClass233_1);
		local16.aClass3_Sub3_Sub2_2.method4201(Static591.anInt9687);
		Static562.method8096(local16);
	}
}
