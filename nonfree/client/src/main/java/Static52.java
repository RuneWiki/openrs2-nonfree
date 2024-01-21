import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "I")
	public static int anInt3020;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	public static int anInt3021;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public static int anInt3016 = 0;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	public static int anInt3017 = 0;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "I")
	public static int anInt3018 = 0;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "I")
	public static int anInt3019 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V")
	public static void method2013(@OriginalArg(0) int[] arg0) {
		anInt3017 = arg0[0];
		anInt3016 = arg0[1];
		anInt3018 = arg0[2];
		anInt3019 = arg0[3];
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
	public static void method2014() {
		anIntArray309 = null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([III)V")
	public static void method2015(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray309 = arg0;
		anInt3020 = arg1;
		anInt3021 = arg2;
		method2025(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
	private static void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3017 || arg0 >= anInt3018) {
			return;
		}
		if (arg1 < anInt3016) {
			arg2 -= anInt3016 - arg1;
			arg1 = anInt3016;
		}
		if (arg1 + arg2 > anInt3019) {
			arg2 = anInt3019 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3020;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray309[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray309[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray309[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray309[local58] = local111;
			local58 += anInt3020;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIII)V")
	private static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt3016 || arg1 >= anInt3019) {
			return;
		}
		if (arg0 < anInt3017) {
			arg2 -= anInt3017 - arg0;
			arg0 = anInt3017;
		}
		if (arg0 + arg2 > anInt3018) {
			arg2 = anInt3018 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3020;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray309[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray309[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray309[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray309[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2017(arg0, arg1, arg2, arg4, arg5);
		method2017(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method2016(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method2016(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "([I)V")
	public static void method2019(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3017;
		arg0[1] = anInt3016;
		arg0[2] = anInt3018;
		arg0[3] = anInt3019;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(IIIII)V")
	public static void method2020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method2023(arg0, arg1, arg2 + 1, arg4);
			} else {
				method2023(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt3017) {
					arg1 += local96 * (anInt3017 - arg0);
					arg0 = anInt3017;
				}
				if (arg2 >= anInt3018) {
					arg2 = anInt3018 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt3016 && local125 < anInt3019) {
						anIntArray309[arg0 + local125 * anInt3020] = arg4;
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
				if (arg1 < anInt3016) {
					arg0 += local96 * (anInt3016 - arg1);
					arg1 = anInt3016;
				}
				if (arg3 >= anInt3019) {
					arg3 = anInt3019 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt3017 && local125 < anInt3018) {
						anIntArray309[local125 + arg1 * anInt3020] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method2022(arg0, arg1, arg3 + 1, arg4);
		} else {
			method2022(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
	public static void method2021() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt3020 * anInt3021 - 7;
		while (local1 < local7) {
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
			anIntArray309[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray309[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
	public static void method2022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt3017 || arg0 >= anInt3018) {
			return;
		}
		if (arg1 < anInt3016) {
			arg2 -= anInt3016 - arg1;
			arg1 = anInt3016;
		}
		if (arg1 + arg2 > anInt3019) {
			arg2 = anInt3019 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3020;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray309[local32 + local34 * anInt3020] = arg3;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V")
	public static void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt3016 || arg1 >= anInt3019) {
			return;
		}
		if (arg0 < anInt3017) {
			arg2 -= anInt3017 - arg0;
			arg0 = anInt3017;
		}
		if (arg0 + arg2 > anInt3018) {
			arg2 = anInt3018 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3020;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray309[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIII)V")
	public static void method2024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3017) {
			arg2 -= anInt3017 - arg0;
			arg0 = anInt3017;
		}
		if (arg1 < anInt3016) {
			arg3 -= anInt3016 - arg1;
			arg1 = anInt3016;
		}
		if (arg0 + arg2 > anInt3018) {
			arg2 = anInt3018 - arg0;
		}
		if (arg1 + arg3 > anInt3019) {
			arg3 = anInt3019 - arg1;
		}
		@Pc(43) int local43 = anInt3020 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt3020;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray309[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(IIII)V")
	public static void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt3020) {
			arg2 = anInt3020;
		}
		if (arg3 > anInt3021) {
			arg3 = anInt3021;
		}
		anInt3017 = arg0;
		anInt3016 = arg1;
		anInt3018 = arg2;
		anInt3019 = arg3;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIII)V")
	public static void method2026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt3017) {
			arg2 -= anInt3017 - arg0;
			arg0 = anInt3017;
		}
		if (arg1 < anInt3016) {
			arg3 -= anInt3016 - arg1;
			arg1 = anInt3016;
		}
		if (arg0 + arg2 > anInt3018) {
			arg2 = anInt3018 - arg0;
		}
		if (arg1 + arg3 > anInt3019) {
			arg3 = anInt3019 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt3020 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt3020;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray309[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray309[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray309[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray309[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(IIIII)V")
	public static void method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method2023(arg0, arg1, arg2, arg4);
		method2023(arg0, arg1 + arg3 - 1, arg2, arg4);
		method2022(arg0, arg1, arg3, arg4);
		method2022(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
	public static void method2028() {
		anInt3017 = 0;
		anInt3016 = 0;
		anInt3018 = anInt3020;
		anInt3019 = anInt3021;
	}
}
