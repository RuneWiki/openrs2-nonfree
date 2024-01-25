import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2782(@OriginalArg(0) Class82 arg0) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		if (Static80.aBoolean118) {
			local11 = Static211.method3297();
			local13 = Static551.method7856();
		}
		arg0.KA(local11, local13, Static330.anInt6254 + local11, local13 + 350);
		arg0.aa(local11, local13, Static330.anInt6254, 350, Static321.anInt6143 << 24 | 0x332277, 1);
		Static304.method7235(local11 + Static330.anInt6254, local13 + 350, local11, local13);
		@Pc(57) int local57 = 350 / Static143.anInt2899;
		@Pc(69) int local69;
		if (Static214.anInt4424 > 0) {
			local69 = 346 - Static143.anInt2899 - 4;
			@Pc(79) int local79 = local69 * local57 / (Static214.anInt4424 + local57 - 1);
			@Pc(81) int local81 = 4;
			if (Static214.anInt4424 > 1) {
				local81 = (Static214.anInt4424 - Static505.anInt8524 - 1) * (-local79 + local69) / (Static214.anInt4424 - 1) + 4;
			}
			arg0.aa(Static330.anInt6254 + local11 - 16, local81 + local13, 12, local79, Static321.anInt6143 << 24 | 0x332277, 2);
			for (@Pc(121) int local121 = Static505.anInt8524; local57 + Static505.anInt8524 > local121 && Static214.anInt4424 > local121; local121++) {
				@Pc(132) String[] local132 = Static557.method7916('\b', Static469.aStringArray66[local121]);
				@Pc(141) int local141 = (Static330.anInt6254 - 16 - 8) / local132.length;
				for (@Pc(143) int local143 = 0; local143 < local132.length; local143++) {
					@Pc(151) int local151 = local143 * local141 + 8;
					arg0.KA(local151 + local11, local13, local151 + local11 + local141 - 8, local13 - -350);
					Static232.aClass63_6.method7751(local11 + local151, -16777216, Static308.method1831(local132[local143]), -1, local13 + 350 - Static471.anInt8065 - Static240.aClass93_4.anInt2767 - (-Static505.anInt8524 + local121) * Static143.anInt2899 - 2);
				}
			}
		}
		Static227.aClass63_5.method7752(local11 + Static330.anInt6254 - 25, -1, local13 + 350 - 20, "Build: 641", -16777216);
		arg0.KA(local11, local13, Static330.anInt6254 + local11, local13 + 350);
		arg0.method6108(local11, local13 + 350 - Static471.anInt8065, -1, Static330.anInt6254);
		Static374.aClass63_9.method7751(local11 + 10, -16777216, "--> " + Static308.method1831(Static73.aString8), -1, local13 + 350 - Static426.aClass93_11.anInt2767 - 1);
		if (!Static489.aBoolean602) {
			return;
		}
		local69 = -1;
		if (Static304.anInt8391 % 30 > 15) {
			local69 = 16777215;
		}
		arg0.method6154(12, local69, local13 + 350 - Static426.aClass93_11.anInt2767 - 11, local11 - (-10 - Static426.aClass93_11.method2315("--> " + Static308.method1831(Static73.aString8).substring(0, Static412.anInt7257))));
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub26 local7 = null;
		for (@Pc(12) Class3_Sub26 local12 = (Class3_Sub26) Static588.aClass216_70.method5457(); local12 != null; local12 = (Class3_Sub26) Static588.aClass216_70.method5458()) {
			if (local12.anInt5293 == arg5 && local12.anInt5296 == arg6 && local12.anInt5286 == arg1 && local12.anInt5290 == arg4) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub26();
			local7.anInt5286 = arg1;
			local7.anInt5296 = arg6;
			local7.anInt5290 = arg4;
			local7.anInt5293 = arg5;
			if (arg6 >= 0 && arg1 >= 0 && arg6 < Static399.anInt7121 && arg1 < Static24.anInt345) {
				Static487.method7156(local7);
			}
			Static588.aClass216_70.method5449(local7);
		}
		local7.aBoolean387 = false;
		local7.anInt5294 = arg0;
		local7.anInt5292 = arg3;
		local7.anInt5289 = arg2;
		local7.aBoolean386 = true;
	}
}
