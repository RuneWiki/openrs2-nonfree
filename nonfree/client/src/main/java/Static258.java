import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public static int anInt4907;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
	public static int anInt4910;

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Lclient!pp;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V")
	public static void method4427() {
		if (Static153.aBoolean211 && Static345.aBooleanArray30[81] && Static41.anInt980 > 2) {
			Static97.method2213((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247.aClass14_247);
		} else {
			Static97.method2213((Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 - arg1;
		@Pc(19) int local19 = arg3 - arg1;
		@Pc(23) int local23 = arg2 * arg2;
		@Pc(27) int local27 = arg3 * arg3;
		@Pc(31) int local31 = local15 * local15;
		@Pc(35) int local35 = local19 * local19;
		@Pc(39) int local39 = local27 << 1;
		@Pc(55) int local55 = local23 << 1;
		@Pc(59) int local59 = local35 << 1;
		@Pc(63) int local63 = local31 << 1;
		@Pc(67) int local67 = arg3 << 1;
		@Pc(71) int local71 = local19 << 1;
		@Pc(80) int local80 = local23 * (1 - local67) + local39;
		@Pc(89) int local89 = local27 - (local67 - 1) * local55;
		@Pc(97) int local97 = local59 + (1 - local71) * local31;
		@Pc(106) int local106 = local35 - local63 * (local71 - 1);
		@Pc(110) int local110 = local23 << 2;
		@Pc(114) int local114 = local27 << 2;
		@Pc(118) int local118 = local31 << 2;
		@Pc(122) int local122 = local35 << 2;
		@Pc(126) int local126 = local39 * 3;
		@Pc(132) int local132 = local55 * (local67 - 3);
		@Pc(136) int local136 = local59 * 3;
		@Pc(142) int local142 = local63 * (local71 - 3);
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (arg3 - 1) * local110;
		@Pc(152) int local152 = local122;
		@Pc(158) int local158 = local118 * (local19 - 1);
		@Pc(162) int[] local162 = Static104.anIntArrayArray31[arg4];
		Static27.method690(arg6 - local15, local162, arg5, arg6 - arg2);
		Static27.method690(local15 + arg6, local162, arg0, arg6 - local15);
		Static27.method690(arg2 + arg6, local162, arg5, local15 + arg6);
		while (local9 > 0) {
			@Pc(207) boolean local207 = local9 <= local19;
			if (local80 < 0) {
				while (local80 < 0) {
					local89 += local144;
					local80 += local126;
					local144 += local114;
					local126 += local114;
					local7++;
				}
			}
			if (local207) {
				if (local97 < 0) {
					while (local97 < 0) {
						local97 += local136;
						local106 += local152;
						local136 += local122;
						local11++;
						local152 += local122;
					}
				}
				if (local106 < 0) {
					local97 += local136;
					local106 += local152;
					local11++;
					local136 += local122;
					local152 += local122;
				}
				local106 += -local142;
				local97 += -local158;
				local158 -= local118;
				local142 -= local118;
			}
			if (local89 < 0) {
				local80 += local126;
				local89 += local144;
				local144 += local114;
				local7++;
				local126 += local114;
			}
			local89 += -local132;
			local80 += -local150;
			local9--;
			local150 -= local110;
			local132 -= local110;
			@Pc(346) int local346 = arg4 - local9;
			@Pc(350) int local350 = local9 + arg4;
			@Pc(354) int local354 = local7 + arg6;
			@Pc(359) int local359 = arg6 - local7;
			if (local207) {
				@Pc(365) int local365 = arg6 + local11;
				@Pc(370) int local370 = arg6 - local11;
				Static27.method690(local370, Static104.anIntArrayArray31[local346], arg5, local359);
				Static27.method690(local365, Static104.anIntArrayArray31[local346], arg0, local370);
				Static27.method690(local354, Static104.anIntArrayArray31[local346], arg5, local365);
				Static27.method690(local370, Static104.anIntArrayArray31[local350], arg5, local359);
				Static27.method690(local365, Static104.anIntArrayArray31[local350], arg0, local370);
				Static27.method690(local354, Static104.anIntArrayArray31[local350], arg5, local365);
			} else {
				Static27.method690(local354, Static104.anIntArrayArray31[local346], arg5, local359);
				Static27.method690(local354, Static104.anIntArrayArray31[local350], arg5, local359);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method4429(@OriginalArg(1) Class143 arg0) {
		Static170.aClass143_70 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!e;II)V")
	public static void method4432(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static162.aClass188ArrayArray1 = new Class188[arg1][arg2];
		Static262.aClass46_7 = arg0;
		if (Static288.anIntArray503 != null) {
			Static2.aClass67_1 = Static50.method1220(Static288.anIntArray503[3], Static288.anIntArray503[4], Static288.anIntArray503[0], Static288.anIntArray503[1], Static288.anIntArray503[2], Static288.anIntArray503[5]);
		}
		Static338.aClass188_2 = new Class188();
		Static121.method2573();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4433(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) long local31 = arg0; local31 != 0L; local31 /= 37L) {
				local29++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local29);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static137.aCharArray1[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					@Pc(77) int local77 = local49.length() - 1;
					local67 = ' ';
					local49.setCharAt(local77, Character.toUpperCase(local49.charAt(local77)));
				}
				local49.append(local67);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ne;III)V")
	public static void method4435(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class156 local8 = arg0.method3798(Static218.aClass46_5);
		if (local8 == null) {
			return;
		}
		Static218.aClass46_5.method5172(arg1, arg2, arg1 + arg0.anInt4133, arg0.anInt4199 + arg2);
		if (Static7.anInt191 < 3) {
			Static294.aClass2_20.method2628((float) arg0.anInt4133 / 2.0F + (float) arg1, (float) arg0.anInt4199 / 2.0F + (float) arg2, ((int) -Static94.aFloat42 & 0x3FFF) << 2, local8, arg1, arg2);
		} else {
			Static218.aClass46_5.method5165(local8, arg1, arg2);
		}
	}
}
