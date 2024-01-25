import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt1333;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "[Lclient!se;")
	public static Class182[] aClass182Array1;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!ro;")
	public static final Class176 aClass176_5 = new Class176();

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public static int anInt1335 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V")
	public static void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= Static184.anInt6250 && arg1 <= Static80.anInt4809) {
			@Pc(27) int local27 = Static133.method5819(Static334.anInt6315, arg0, Static314.anInt6018);
			@Pc(33) int local33 = Static133.method5819(Static334.anInt6315, arg2, Static314.anInt6018);
			Static126.method2448(arg3, local33, local27, arg1);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
	public static void method1177(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(13) InterruptedException local13) {
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1178(@OriginalArg(0) String arg0) {
		return Static233.method3988(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!en;III)V")
	public static void method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg2.method4795(arg4, arg1, arg4 + arg3, arg0 + arg1);
		arg2.method4835(arg1, arg4, arg0, arg3, -16777216);
		if (Static203.anInt3932 < 100) {
			return;
		}
		@Pc(36) float local36 = (float) Static186.anInt6011 / (float) Static186.anInt6008;
		@Pc(38) int local38 = arg3;
		@Pc(40) int local40 = arg0;
		if (local36 < 1.0F) {
			local40 = (int) ((float) arg3 * local36);
		} else {
			local38 = (int) ((float) arg0 / local36);
		}
		@Pc(67) int local67 = arg4 + (arg3 - local38) / 2;
		@Pc(81) int local81 = arg1 + (arg0 - local40) / 2;
		if (Static232.aClass54_13 == null || arg3 != Static232.aClass54_13.method5577() || arg0 != Static232.aClass54_13.method5565()) {
			Static186.method5343(Static186.anInt6007, Static186.anInt6012 + Static186.anInt6011, Static186.anInt6008 + Static186.anInt6007, Static186.anInt6012, local67, local81, local67 + local38, local40 + local81);
			Static186.method5357(arg2);
			Static232.aClass54_13 = arg2.method4794(local67, local81, local38, local40, false);
		}
		Static232.aClass54_13.method5569(local67, local81);
		@Pc(133) int local133 = local38 * Static112.anInt2426 / Static186.anInt6008;
		@Pc(139) int local139 = Static47.anInt1202 * local40 / Static186.anInt6011;
		@Pc(147) int local147 = local38 * Static112.anInt2424 / Static186.anInt6008 + local67;
		@Pc(161) int local161 = local81 + local40 - local139 - local40 * Static218.anInt4347 / Static186.anInt6011;
		@Pc(163) int local163 = -1996554240;
		if (Static298.anInt5725 == 1) {
			local163 = -1996488705;
		}
		arg2.method4877(local147, local161, local133, local139, local163, 1);
		arg2.method4851(local147, local161, local133, local139, local163, 0);
		if (Static210.anInt5623 <= 0) {
			return;
		}
		@Pc(193) int local193;
		if (Static31.anInt823 <= 50) {
			local193 = Static31.anInt823 * 5;
		} else {
			local193 = 500 - Static31.anInt823 * 5;
		}
		for (@Pc(209) Class5_Sub18 local209 = (Class5_Sub18) Static186.aClass211_36.method5608(); local209 != null; local209 = (Class5_Sub18) Static186.aClass211_36.method5603()) {
			@Pc(216) Class121 local216 = Static299.method5085(local209.anInt2293);
			if (Static333.method4065(local216)) {
				@Pc(238) int local238;
				@Pc(250) int local250;
				if (local209.anInt2293 == Static274.anInt5377) {
					local238 = local67 + local38 * local209.anInt2290 / Static186.anInt6008;
					local250 = local40 * (Static186.anInt6011 - local209.anInt2294) / Static186.anInt6011 + local81;
					arg2.method4835(local250 - 2, local238 + -2, 4, 4, local193 << 24 | 0xFFFF00);
				} else if (Static303.anInt5838 != -1 && Static303.anInt5838 == local216.anInt3575) {
					local238 = local67 + local209.anInt2290 * local38 / Static186.anInt6008;
					local250 = local81 + local40 * (Static186.anInt6011 - local209.anInt2294) / Static186.anInt6011;
					arg2.method4835(local250 - 2, local238 + -2, 4, 4, local193 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!en;BILclient!jf;)V")
	public static void method1180(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class96 arg3) {
		if (arg3.anInt2933 == 2) {
			for (@Pc(69) int local69 = arg0; local69 <= arg2; local69++) {
				@Pc(78) int local78 = arg3.anIntArray191[local69] - 1;
				if (local78 != -1) {
					@Pc(110) boolean local110;
					if (Static100.anInt2199 == 1 && Static229.anInt4484 == local69 && Static51.anInt1288 == arg3.anInt2877) {
						local110 = Static193.method3496(2, 0, arg1, arg3.anInt2895, local78, null, arg3.anIntArray195[local69]) == null;
						if (local110) {
							Static60.aClass211_3.method5609(new Class5_Sub41(local78, arg3.anIntArray195[local69], 2, 0, arg3.anInt2895, false));
						}
					} else {
						local110 = Static193.method3496(1, -13623264, arg1, arg3.anInt2895, local78, null, arg3.anIntArray195[local69]) == null;
						if (local110) {
							Static60.aClass211_3.method5609(new Class5_Sub41(local78, arg3.anIntArray195[local69], 1, -13623264, arg3.anInt2895, false));
						}
					}
				}
			}
		} else if (arg3.anInt2933 == 5) {
			@Pc(43) boolean local43 = Static193.method3496(arg3.anInt2938, arg3.anInt2948 | 0xFF000000, arg1, arg3.anInt2895, arg3.anInt2969, arg3.aBoolean208 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null, arg3.anInt2879) == null;
			if (local43) {
				Static60.aClass211_3.method5609(new Class5_Sub41(arg3.anInt2969, arg3.anInt2879, arg3.anInt2938, arg3.anInt2948 | 0xFF000000, arg3.anInt2895, arg3.aBoolean208));
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IZ)I")
	public static int method1181(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
