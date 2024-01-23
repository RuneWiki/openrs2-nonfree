import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Lclient!jm;")
	public static Class80 aClass80_3;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	public static int anInt6238;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!ok;")
	public static Class116 aClass116_19;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
	public static int anInt6234 = 0;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
	public static int anInt6235 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZ)V")
	public static void method4854(@OriginalArg(0) int arg0) {
		Static97.aFloatArray32[1] = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		Static97.aFloatArray32[0] = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		Static97.aFloatArray32[2] = (float) (arg0 & 0xFF) / 255.0F;
		Static130.method2205(3);
		Static130.method2205(4);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method4855() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static233.aBooleanArray22[local3] = false;
		}
		Static280.anInt5999 = 5;
		Static217.anInt4819 = -1;
		Static289.anInt6096 = 0;
		Static254.anInt5407 = 0;
		Static193.anInt4302 = -1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Lclient!el;")
	public static Class8 method4856() {
		try {
			return (Class8) Class.forName("Class8_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class8_Sub1();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4858(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(13) String local13 = Static25.method417(Static89.method1535(arg1));
		for (@Pc(15) int local15 = 0; local15 < Static266.anInt5789; local15++) {
			@Pc(28) Class25_Sub1_Sub1 local28 = Static271.aClass25_Sub1_Sub1Array1[Static39.anIntArray108[local15]];
			if (local28 != null && local28.aString26 != null && local28.aString26.equalsIgnoreCase(local13)) {
				if (arg0 == 1) {
					Static81.aClass1_Sub16_Sub1_1.method2676(150);
					Static81.aClass1_Sub16_Sub1_1.method2600(0);
					Static81.aClass1_Sub16_Sub1_1.method2615(Static39.anIntArray108[local15]);
				} else if (arg0 == 4) {
					Static81.aClass1_Sub16_Sub1_1.method2676(180);
					Static81.aClass1_Sub16_Sub1_1.method2657(Static39.anIntArray108[local15]);
					Static81.aClass1_Sub16_Sub1_1.method2626(0);
				} else if (arg0 == 5) {
					Static81.aClass1_Sub16_Sub1_1.method2676(207);
					Static81.aClass1_Sub16_Sub1_1.method2600(0);
					Static81.aClass1_Sub16_Sub1_1.method2615(Static39.anIntArray108[local15]);
				} else if (arg0 == 6) {
					Static81.aClass1_Sub16_Sub1_1.method2676(43);
					Static81.aClass1_Sub16_Sub1_1.method2617(Static39.anIntArray108[local15]);
					Static81.aClass1_Sub16_Sub1_1.method2626(0);
				} else if (arg0 == 7) {
					Static81.aClass1_Sub16_Sub1_1.method2676(60);
					Static81.aClass1_Sub16_Sub1_1.method2657(Static39.anIntArray108[local15]);
					Static81.aClass1_Sub16_Sub1_1.method2600(0);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static89.method1540(0, "", Static204.aString144 + local13);
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII)I")
	public static int method4859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static133.aBoolean152) {
			Static133.aBoolean152 = false;
			arg0 = 1000000;
		}
		@Pc(17) Class59 local17 = Static112.aClass59ArrayArray1[arg2][arg1];
		@Pc(20) float local20 = local17.aFloat66;
		@Pc(30) float local30 = ((float) arg3 * 0.1F + 0.7F) * local17.aFloat64;
		@Pc(33) int local33 = local17.anInt1951;
		@Pc(36) int local36 = local17.anInt1943;
		@Pc(39) float local39 = local17.aFloat61;
		@Pc(42) int local42 = local17.anInt1950;
		if (!Static70.aBoolean96) {
			local42 = 0;
		}
		@Pc(49) float local49 = local17.aFloat62;
		@Pc(52) float local52 = local17.aFloat63;
		@Pc(55) float local55 = local17.aFloat65;
		@Pc(58) Class1_Sub2_Sub21 local58 = local17.aClass1_Sub2_Sub21_3;
		if (Static256.anInt5552 != local33 || Static75.aFloat56 != local30 || Static256.aFloat182 != local20 || Static20.aFloat183 != local39 || Static284.anInt6045 != local36 || Static256.anInt5550 != local42 || local58 != Static236.aClass1_Sub2_Sub21_7 || Static235.aFloat166 != local55 || local52 != Static2.aFloat186 || Static108.aFloat78 != local49) {
			Static236.aFloat169 = Static33.aFloat30;
			Static170.aFloat198 = Static165.aFloat128;
			Static89.anInt2063 = Static233.anInt5148;
			Static74.anInt1826 = Static213.anInt4722;
			Static174.aFloat137 = Static295.aFloat114;
			Static87.anInt2037 = Static259.anInt5654;
			Static76.aFloat178 = Static80.aFloat60;
			Static66.aClass1_Sub2_Sub21_5 = Static16.aClass1_Sub2_Sub21_1;
			Static111.aFloat82 = Static259.aFloat185;
			Static262.aFloat188 = Static35.aFloat32;
			if (Static110.aClass1_Sub2_Sub21_4 == null || Static110.aClass1_Sub2_Sub21_4 == Static66.aClass1_Sub2_Sub21_5) {
				Static110.aClass1_Sub2_Sub21_4 = new Class1_Sub2_Sub21();
			}
			Static256.anInt5550 = local42;
			Static235.aFloat166 = local55;
			Static2.aFloat186 = local52;
			Static256.aFloat182 = local20;
			Static284.anInt6045 = local36;
			Static20.aFloat183 = local39;
			Static256.anInt5552 = local33;
			Static75.aFloat56 = local30;
			Static108.aFloat78 = local49;
			Static259.anInt5649 = 0;
			Static236.aClass1_Sub2_Sub21_7 = local58;
		}
		if (Static259.anInt5649 < 65536) {
			Static259.anInt5649 += arg0 * 250;
			if (Static259.anInt5649 >= 65536) {
				Static66.aClass1_Sub2_Sub21_5 = null;
				Static233.anInt5148 = Static256.anInt5552;
				Static80.aFloat60 = Static235.aFloat166;
				Static33.aFloat30 = Static20.aFloat183;
				Static213.anInt4722 = Static256.anInt5550;
				Static259.anInt5649 = 65536;
				Static16.aClass1_Sub2_Sub21_1 = Static236.aClass1_Sub2_Sub21_7;
				Static259.anInt5654 = Static284.anInt6045;
				Static295.aFloat114 = Static75.aFloat56;
				Static165.aFloat128 = Static108.aFloat78;
				Static259.aFloat185 = Static256.aFloat182;
				Static35.aFloat32 = Static2.aFloat186;
			} else {
				@Pc(208) int local208 = 65536 - Static259.anInt5649 >> 8;
				@Pc(212) int local212 = Static259.anInt5649 >> 8;
				Static233.anInt5148 = ((Static89.anInt2063 & 0xFF00FF) * local208 + local212 * (Static256.anInt5552 & 0xFF00FF) & 0xFF00FF00) + ((Static256.anInt5552 & 0xFF00) * local212 + local208 * (Static89.anInt2063 & 0xFF00) & 0xFF0000) >> 8;
				Static213.anInt4722 = Static256.anInt5550 * local212 + Static74.anInt1826 * local208 >> 8;
				Static259.anInt5654 = ((Static284.anInt6045 & 0xFF00FF) * local212 + (Static87.anInt2037 & 0xFF00FF) * local208 & 0xFF00FF00) + ((Static284.anInt6045 & 0xFF00) * local212 + local208 * (Static87.anInt2037 & 0xFF00) & 0xFF0000) >> 8;
				@Pc(290) float local290 = (float) (65536 - Static259.anInt5649) / 65536.0F;
				@Pc(295) float local295 = (float) Static259.anInt5649 / 65536.0F;
				Static35.aFloat32 = Static262.aFloat188 * local290 + local295 * Static2.aFloat186;
				Static165.aFloat128 = local295 * Static108.aFloat78 + Static170.aFloat198 * local290;
				Static80.aFloat60 = local295 * Static235.aFloat166 + Static76.aFloat178 * local290;
				Static33.aFloat30 = Static236.aFloat169 * local290 + local295 * Static20.aFloat183;
				Static259.aFloat185 = local290 * Static111.aFloat82 + local295 * Static256.aFloat182;
				Static295.aFloat114 = local290 * Static174.aFloat137 + Static75.aFloat56 * local295;
				if (Static66.aClass1_Sub2_Sub21_5 != Static236.aClass1_Sub2_Sub21_7) {
					if (Static66.aClass1_Sub2_Sub21_5 == null || Static236.aClass1_Sub2_Sub21_7 == null) {
						Static16.aClass1_Sub2_Sub21_1 = null;
					} else {
						Static16.aClass1_Sub2_Sub21_1 = Static110.aClass1_Sub2_Sub21_4.method4605(Static66.aClass1_Sub2_Sub21_5, Static236.aClass1_Sub2_Sub21_7, (float) Static259.anInt5649 / 65536.0F);
					}
				}
			}
		}
		return Static259.anInt5654;
	}
}
