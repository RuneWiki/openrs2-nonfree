import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!uj", name = "X", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
	public static int anInt6132;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "Lclient!lg;")
	public static Interface4 anInterface4_1 = null;

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
	public static int anInt6124 = 0;

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "Lclient!td;")
	public static final Class191 aClass191_7 = new Class191();

	@OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
	public static int anInt6128 = 0;

	@OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
	public static int anInt6129 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V")
	public static void method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(29) int local29 = Static270.method4496(Static168.anInt3509, arg3 + arg1, Static61.anInt1534);
		@Pc(38) int local38 = Static270.method4496(Static168.anInt3509, arg1 - arg3, Static61.anInt1534);
		Static282.method4681(arg2, local38, Static323.anIntArrayArray55[arg0], local29);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(96) int local96;
			@Pc(104) int local104;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local70 = arg0 - local9;
				local74 = arg0 + local9;
				if (Static142.anInt3103 <= local74 && local70 <= Static314.anInt6030) {
					local96 = Static270.method4496(Static168.anInt3509, local7 + arg1, Static61.anInt1534);
					local104 = Static270.method4496(Static168.anInt3509, arg1 - local7, Static61.anInt1534);
					if (Static314.anInt6030 >= local74) {
						Static282.method4681(arg2, local104, Static323.anIntArrayArray55[local74], local96);
					}
					if (local70 >= Static142.anInt3103) {
						Static282.method4681(arg2, local104, Static323.anIntArrayArray55[local70], local96);
					}
				}
			}
			local7++;
			local70 = arg0 - local7;
			local74 = arg0 + local7;
			if (Static142.anInt3103 <= local74 && Static314.anInt6030 >= local70) {
				local96 = Static270.method4496(Static168.anInt3509, arg1 + local9, Static61.anInt1534);
				local104 = Static270.method4496(Static168.anInt3509, arg1 - local9, Static61.anInt1534);
				if (local74 <= Static314.anInt6030) {
					Static282.method4681(arg2, local104, Static323.anIntArrayArray55[local74], local96);
				}
				if (Static142.anInt3103 <= local70) {
					Static282.method4681(arg2, local104, Static323.anIntArrayArray55[local70], local96);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!pe;Lclient!pg;)V")
	public static void method5179(@OriginalArg(1) Class89 arg0, @OriginalArg(2) Interface6 arg1) {
		if (Static306.aClass7_Sub1_Sub10_2 == null) {
			return;
		}
		if (Static339.anInt6444 < 10) {
			if (!Static306.aClass180_46.method4559(Static306.aClass7_Sub1_Sub10_2.aString174)) {
				Static339.anInt6444 = Static87.aClass180_81.method4554(Static306.aClass7_Sub1_Sub10_2.aString174) / 10;
				return;
			}
			Static245.method4229();
			Static339.anInt6444 = 10;
		}
		if (Static339.anInt6444 == 10) {
			Static306.anInt3327 = Static306.aClass7_Sub1_Sub10_2.anInt2519 >> 6 << 6;
			Static306.anInt3329 = Static306.aClass7_Sub1_Sub10_2.anInt2512 >> 6 << 6;
			Static306.anInt3325 = (Static306.aClass7_Sub1_Sub10_2.anInt2521 >> 6 << 6) + 64 - Static306.anInt3327;
			Static306.anInt3326 = (Static306.aClass7_Sub1_Sub10_2.anInt2517 >> 6 << 6) + 64 - Static306.anInt3329;
			@Pc(72) int[] local72 = new int[3];
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = -1;
			if (Static306.aClass7_Sub1_Sub10_2.method2128(local72, Static168.anInt3508, (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7) + Static237.anInt4696, (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7) + Static350.anInt6609)) {
				local74 = local72[1] - Static306.anInt3327;
				local76 = local72[2] - Static306.anInt3329;
			}
			if (!Static50.aBoolean110 && local74 >= 0 && local74 < Static306.anInt3325 && local76 >= 0 && local76 < Static306.anInt3326) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local74 += (int) (Math.random() * 10.0D) - 5;
				Static244.anInt4835 = local74;
				Static107.anInt1502 = local76;
			} else if (Static233.anInt4638 == -1 || Static126.anInt2792 == -1) {
				Static306.aClass7_Sub1_Sub10_2.method2131(Static306.aClass7_Sub1_Sub10_2.anInt2520 & 0x3FFF, local72, Static306.aClass7_Sub1_Sub10_2.anInt2520 >> 14 & 0x3FFF);
				Static244.anInt4835 = local72[1] - Static306.anInt3327;
				Static107.anInt1502 = local72[2] - Static306.anInt3329;
			} else {
				Static306.aClass7_Sub1_Sub10_2.method2131(Static126.anInt2792, local72, Static233.anInt4638);
				Static50.aBoolean110 = false;
				if (local72 != null) {
					Static107.anInt1502 = local72[2] - Static306.anInt3329;
					Static244.anInt4835 = local72[1] - Static306.anInt3327;
				}
				Static126.anInt2792 = -1;
				Static233.anInt4638 = -1;
			}
			if (Static306.aClass7_Sub1_Sub10_2.anInt2525 == 37) {
				Static306.aFloat49 = 3.0F;
				Static306.aFloat50 = 3.0F;
			} else if (Static306.aClass7_Sub1_Sub10_2.anInt2525 == 50) {
				Static306.aFloat49 = 4.0F;
				Static306.aFloat50 = 4.0F;
			} else if (Static306.aClass7_Sub1_Sub10_2.anInt2525 == 75) {
				Static306.aFloat49 = 6.0F;
				Static306.aFloat50 = 6.0F;
			} else if (Static306.aClass7_Sub1_Sub10_2.anInt2525 == 100) {
				Static306.aFloat49 = 8.0F;
				Static306.aFloat50 = 8.0F;
			} else if (Static306.aClass7_Sub1_Sub10_2.anInt2525 == 200) {
				Static306.aFloat49 = 16.0F;
				Static306.aFloat50 = 16.0F;
			} else {
				Static306.aFloat49 = 8.0F;
				Static306.aFloat50 = 8.0F;
			}
			Static306.anInt3319 = (int) Static306.aFloat49 >> 1;
			Static306.aByteArrayArrayArray8 = Static73.method1454(Static306.anInt3319);
			Static201.method3720();
			Static306.method3075();
			Static10.aClass74_2 = new Class74();
			Static67.aClass166_2 = new Class166();
			Static306.anInt3318 += (int) (Math.random() * 5.0D) - 2;
			if (Static306.anInt3318 < -8) {
				Static306.anInt3318 = -8;
			}
			if (Static306.anInt3318 > 8) {
				Static306.anInt3318 = 8;
			}
			Static306.anInt3317 += (int) (Math.random() * 5.0D) - 2;
			if (Static306.anInt3317 < -16) {
				Static306.anInt3317 = -16;
			}
			if (Static306.anInt3317 > 16) {
				Static306.anInt3317 = 16;
			}
			Static306.method3070(arg1, Static306.anInt3318 >> 2 << 10, Static306.anInt3317 >> 1);
			Static66.method1337(1024, 256);
			Static60.method1209(256, 256);
			Static205.method3646(4096);
			Static193.method3464(256);
			Static339.anInt6444 = 20;
		} else if (Static339.anInt6444 == 20) {
			Static218.method3853(true);
			Static306.method3056(arg0, Static306.anInt3318, Static306.anInt3317);
			Static339.anInt6444 = 60;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 60) {
			if (Static306.aClass180_46.method4574(Static306.aClass7_Sub1_Sub10_2.aString174 + "_staticelements")) {
				if (!Static306.aClass180_46.method4559(Static306.aClass7_Sub1_Sub10_2.aString174 + "_staticelements")) {
					return;
				}
				Static306.aClass134_2 = Static225.method3957(Static306.aClass7_Sub1_Sub10_2.aString174 + "_staticelements", Static204.aBoolean315, Static306.aClass180_46);
			} else {
				Static306.aClass134_2 = new Class134(0);
			}
			Static306.method3055();
			Static339.anInt6444 = 70;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 70) {
			Static280.aClass4_6 = new Class4(arg0, 11, true, Static269.aCanvas4);
			Static339.anInt6444 = 73;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 73) {
			Static211.aClass4_5 = new Class4(arg0, 12, true, Static269.aCanvas4);
			Static339.anInt6444 = 76;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 76) {
			Static12.aClass4_3 = new Class4(arg0, 14, true, Static269.aCanvas4);
			Static339.anInt6444 = 79;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 79) {
			Static267.aClass4_8 = new Class4(arg0, 17, true, Static269.aCanvas4);
			Static339.anInt6444 = 82;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 82) {
			Static248.aClass4_7 = new Class4(arg0, 19, true, Static269.aCanvas4);
			Static339.anInt6444 = 85;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 85) {
			Static334.aClass4_9 = new Class4(arg0, 22, true, Static269.aCanvas4);
			Static339.anInt6444 = 88;
			Static218.method3853(true);
			Static57.method1170();
		} else if (Static339.anInt6444 == 88) {
			Static354.aClass4_10 = new Class4(arg0, 26, true, Static269.aCanvas4);
			Static339.anInt6444 = 91;
			Static218.method3853(true);
			Static57.method1170();
		} else {
			Static97.aClass4_4 = new Class4(arg0, 30, true, Static269.aCanvas4);
			Static339.anInt6444 = 100;
			Static218.method3853(true);
			Static57.method1170();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	public static void method5180() {
		if (Static339.anInt6449 == 0) {
			return;
		}
		try {
			if (++Static221.anInt4403 > 2000) {
				if (Static193.aClass61_1 != null) {
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
				}
				if (Static80.anInt2113 >= 1) {
					Static339.anInt6449 = 0;
					Static353.anInt2411 = -5;
					return;
				}
				Static221.anInt4403 = 0;
				Static339.anInt6449 = 1;
				Static80.anInt2113++;
				if (Static206.anInt4119 == Static64.anInt1615) {
					Static206.anInt4119 = Static342.anInt6490;
				} else {
					Static206.anInt4119 = Static64.anInt1615;
				}
			}
			if (Static339.anInt6449 == 1) {
				Static233.aClass99_8 = Static116.aClass21_4.method380(Static206.anInt4119, Static302.aString423);
				Static339.anInt6449 = 2;
			}
			@Pc(128) int local128;
			if (Static339.anInt6449 == 2) {
				if (Static233.aClass99_8.anInt2836 == 2) {
					throw new IOException();
				}
				if (Static233.aClass99_8.anInt2836 != 1) {
					return;
				}
				Static193.aClass61_1 = new Class61((Socket) Static233.aClass99_8.anObject2, Static116.aClass21_4);
				Static233.aClass99_8 = null;
				Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				local128 = Static193.aClass61_1.method1382();
				if (Static213.aClass15_1 != null) {
					Static213.aClass15_1.method4466();
				}
				if (Static272.aClass15_2 != null) {
					Static272.aClass15_2.method4466();
				}
				if (local128 != 21) {
					Static353.anInt2411 = local128;
					Static339.anInt6449 = 0;
					Static193.aClass61_1.method1376();
					Static193.aClass61_1 = null;
					return;
				}
				Static339.anInt6449 = 3;
			}
			if (Static339.anInt6449 == 3) {
				if (Static193.aClass61_1.method1372() < 1) {
					return;
				}
				Static310.aStringArray47 = new String[Static193.aClass61_1.method1382()];
				Static339.anInt6449 = 4;
			}
			if (Static339.anInt6449 == 4 && Static193.aClass61_1.method1372() >= Static310.aStringArray47.length * 8) {
				Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
				Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, Static310.aStringArray47.length * 8);
				for (local128 = 0; local128 < Static310.aStringArray47.length; local128++) {
					Static310.aStringArray47[local128] = Static180.method3309(Static200.aClass7_Sub3_Sub2_3.method2790());
				}
				Static339.anInt6449 = 0;
				Static353.anInt2411 = 21;
				Static193.aClass61_1.method1376();
				Static193.aClass61_1 = null;
			}
		} catch (@Pc(231) IOException local231) {
			if (Static193.aClass61_1 != null) {
				Static193.aClass61_1.method1376();
				Static193.aClass61_1 = null;
			}
			if (Static80.anInt2113 < 1) {
				Static221.anInt4403 = 0;
				if (Static206.anInt4119 == Static64.anInt1615) {
					Static206.anInt4119 = Static342.anInt6490;
				} else {
					Static206.anInt4119 = Static64.anInt1615;
				}
				Static339.anInt6449 = 1;
				Static80.anInt2113++;
			} else {
				Static339.anInt6449 = 0;
				Static353.anInt2411 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V")
	public static void method5181(@OriginalArg(1) long arg0) {
		Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
		Static29.aClass7_Sub3_Sub2_1.method2735(21);
		Static29.aClass7_Sub3_Sub2_1.method2777(arg0);
		Static221.anInt4403 = 0;
		Static80.anInt2113 = 0;
		Static353.anInt2411 = -3;
		Static339.anInt6449 = 1;
	}
}
