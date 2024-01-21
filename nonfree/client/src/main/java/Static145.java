import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	public static int anInt3841;

	@OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
	public static int anInt3836 = 0;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public static int anInt3837 = 0;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt3839 = 0;

	@OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
	public static int anInt3840 = 0;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()V")
	public static void method2929() {
		anInt3837 = 0;
		anInt3836 = 0;
		anInt3839 = anInt3841;
		anInt3840 = anInt3838;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
	public static void method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3837 < arg0) {
			anInt3837 = arg0;
		}
		if (anInt3836 < arg1) {
			anInt3836 = arg1;
		}
		if (anInt3839 > arg2) {
			anInt3839 = arg2;
		}
		if (anInt3840 > arg3) {
			anInt3840 = arg3;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIII)V")
	public static void method2931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt3837) {
			arg2 -= anInt3837 - arg0;
			arg0 = anInt3837;
		}
		if (arg1 < anInt3836) {
			arg3 -= anInt3836 - arg1;
			arg1 = anInt3836;
		}
		if (arg0 + arg2 > anInt3839) {
			arg2 = anInt3839 - arg0;
		}
		if (arg1 + arg3 > anInt3840) {
			arg3 = anInt3840 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt3841 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt3841;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray411[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray411[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIII)V")
	public static void method2932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt3841) {
			arg2 = anInt3841;
		}
		if (arg3 > anInt3838) {
			arg3 = anInt3838;
		}
		anInt3837 = arg0;
		anInt3836 = arg1;
		anInt3839 = arg2;
		anInt3840 = arg3;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([I)V")
	public static void method2933(@OriginalArg(0) int[] arg0) {
		anInt3837 = arg0[0];
		anInt3836 = arg0[1];
		anInt3839 = arg0[2];
		anInt3840 = arg0[3];
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[I[I)V")
	public static void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt3841;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(14) int local14 = local5 + arg2[local7];
			for (@Pc(19) int local19 = -arg3[local7]; local19 < 0; local19++) {
				anIntArray411[local14++] = 0;
			}
			local5 += anInt3841;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(IIII)V")
	public static void method2935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt3836 || arg1 >= anInt3840) {
			return;
		}
		if (arg0 < anInt3837) {
			arg2 -= anInt3837 - arg0;
			arg0 = anInt3837;
		}
		if (arg0 + arg2 > anInt3839) {
			arg2 = anInt3839 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3841;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray411[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([III)V")
	public static void method2936(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray411 = arg0;
		anInt3841 = arg1;
		anInt3838 = arg2;
		method2932(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(IIII)V")
	public static void method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt3837 || arg0 >= anInt3839) {
			return;
		}
		if (arg1 < anInt3836) {
			arg2 -= anInt3836 - arg1;
			arg1 = anInt3836;
		}
		if (arg1 + arg2 > anInt3840) {
			arg2 = anInt3840 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3841;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray411[local32 + local34 * anInt3841] = arg3;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "([I)V")
	public static void method2938(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3837;
		arg0[1] = anInt3836;
		arg0[2] = anInt3839;
		arg0[3] = anInt3840;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "()V")
	public static void method2939() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt3841 * anInt3838 - 7;
		while (local1 < local7) {
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
			anIntArray411[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray411[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public static void method2940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method2935(arg0, arg1, arg2 + 1, arg4);
			} else {
				method2935(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(125) int local125;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < anInt3837) {
					arg1 += local96 * (anInt3837 - arg0);
					arg0 = anInt3837;
				}
				if (arg2 >= anInt3839) {
					arg2 = anInt3839 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt3836 && local125 < anInt3840) {
						anIntArray411[arg0 + local125 * anInt3841] = arg4;
					}
					arg1 += local96;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(160) int local160 = arg2 << 16;
				local96 = (int) Math.floor((double) local160 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < anInt3836) {
					arg0 += local96 * (anInt3836 - arg1);
					arg1 = anInt3836;
				}
				if (arg3 >= anInt3840) {
					arg3 = anInt3840 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt3837 && local125 < anInt3839) {
						anIntArray411[local125 + arg1 * anInt3841] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method2937(arg0, arg1, arg3 + 1, arg4);
		} else {
			method2937(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIII)V")
	public static void method2941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3837) {
			arg2 -= anInt3837 - arg0;
			arg0 = anInt3837;
		}
		if (arg1 < anInt3836) {
			arg3 -= anInt3836 - arg1;
			arg1 = anInt3836;
		}
		if (arg0 + arg2 > anInt3839) {
			arg2 = anInt3839 - arg0;
		}
		if (arg1 + arg3 > anInt3840) {
			arg3 = anInt3840 - arg1;
		}
		@Pc(43) int local43 = anInt3841 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt3841;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray411[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(IIIII)V")
	private static void method2942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt3836 || arg1 >= anInt3840) {
			return;
		}
		if (arg0 < anInt3837) {
			arg2 -= anInt3837 - arg0;
			arg0 = anInt3837;
		}
		if (arg0 + arg2 > anInt3839) {
			arg2 = anInt3839 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3841;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray411[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray411[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray411[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray411[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(IIIIII)V")
	public static void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2942(arg0, arg1, arg2, arg4, arg5);
		method2942(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method2944(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method2944(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(IIIII)V")
	private static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3837 || arg0 >= anInt3839) {
			return;
		}
		if (arg1 < anInt3836) {
			arg2 -= anInt3836 - arg1;
			arg1 = anInt3836;
		}
		if (arg1 + arg2 > anInt3840) {
			arg2 = anInt3840 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3841;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray411[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray411[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray411[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray411[local58] = local111;
			local58 += anInt3841;
		}
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(IIIII)V")
	public static void method2945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method2935(arg0, arg1, arg2, arg4);
		method2935(arg0, arg1 + arg3 - 1, arg2, arg4);
		method2937(arg0, arg1, arg3, arg4);
		method2937(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(IIIIII)V")
	public static void method2946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt3837) {
			arg2 -= anInt3837 - arg0;
			arg0 = anInt3837;
		}
		if (anInt3836 > 0) {
			local1 = anInt3836 * 2849;
			arg3 = 23 - anInt3836;
			arg1 = anInt3836;
		}
		if (arg0 + arg2 > anInt3839) {
			arg2 = anInt3839 - arg0;
		}
		if (arg1 + arg3 > anInt3840) {
			arg3 = anInt3840 - arg1;
		}
		@Pc(57) int local57 = anInt3841 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt3841;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >>> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray411[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}
}
