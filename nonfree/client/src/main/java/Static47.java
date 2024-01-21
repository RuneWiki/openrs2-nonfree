import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
	public static int anInt2712;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	public static int anInt2708 = 0;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	public static int anInt2710 = 0;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
	public static int anInt2711 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public static void method1948() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2713 * anInt2712 - 7;
		while (local1 < local7) {
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
			anIntArray424[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray424[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
	public static void method1949() {
		anInt2709 = 0;
		anInt2710 = 0;
		anInt2708 = anInt2713;
		anInt2711 = anInt2712;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIII)V")
	public static void method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1955(arg0, arg1, arg2, arg4);
		method1955(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1958(arg0, arg1, arg3, arg4);
		method1958(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	public static void method1951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2713) {
			arg2 = anInt2713;
		}
		if (arg3 > anInt2712) {
			arg3 = anInt2712;
		}
		anInt2709 = arg0;
		anInt2710 = arg1;
		anInt2708 = arg2;
		anInt2711 = arg3;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([I)V")
	public static void method1952(@OriginalArg(0) int[] arg0) {
		anInt2709 = arg0[0];
		anInt2710 = arg0[1];
		anInt2708 = arg0[2];
		anInt2711 = arg0[3];
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2709) {
			arg2 -= anInt2709 - arg0;
			arg0 = anInt2709;
		}
		if (arg1 < anInt2710) {
			arg3 -= anInt2710 - arg1;
			arg1 = anInt2710;
		}
		if (arg0 + arg2 > anInt2708) {
			arg2 = anInt2708 - arg0;
		}
		if (arg1 + arg3 > anInt2711) {
			arg3 = anInt2711 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt2713 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt2713;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray424[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray424[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray424[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray424[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIII)V")
	public static void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1955(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1955(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2709) {
					arg1 += local96 * (anInt2709 - arg0);
					arg0 = anInt2709;
				}
				if (arg2 >= anInt2708) {
					arg2 = anInt2708 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2710 && local125 < anInt2711) {
						anIntArray424[arg0 + local125 * anInt2713] = arg4;
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
				if (arg1 < anInt2710) {
					arg0 += local96 * (anInt2710 - arg1);
					arg1 = anInt2710;
				}
				if (arg3 >= anInt2711) {
					arg3 = anInt2711 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2709 && local125 < anInt2708) {
						anIntArray424[local125 + arg1 * anInt2713] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1958(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1958(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V")
	public static void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2710 || arg1 >= anInt2711) {
			return;
		}
		if (arg0 < anInt2709) {
			arg2 -= anInt2709 - arg0;
			arg0 = anInt2709;
		}
		if (arg0 + arg2 > anInt2708) {
			arg2 = anInt2708 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2713;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray424[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIII)V")
	public static void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1959(arg0, arg1, arg2, arg4, arg5);
		method1959(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1961(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1961(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIIII)V")
	public static void method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2709) {
			arg2 -= anInt2709 - arg0;
			arg0 = anInt2709;
		}
		if (arg1 < anInt2710) {
			arg3 -= anInt2710 - arg1;
			arg1 = anInt2710;
		}
		if (arg0 + arg2 > anInt2708) {
			arg2 = anInt2708 - arg0;
		}
		if (arg1 + arg3 > anInt2711) {
			arg3 = anInt2711 - arg1;
		}
		@Pc(43) int local43 = anInt2713 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2713;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray424[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(IIII)V")
	public static void method1958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2709 || arg0 >= anInt2708) {
			return;
		}
		if (arg1 < anInt2710) {
			arg2 -= anInt2710 - arg1;
			arg1 = anInt2710;
		}
		if (arg1 + arg2 > anInt2711) {
			arg2 = anInt2711 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2713;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray424[local32 + local34 * anInt2713] = arg3;
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(IIIII)V")
	private static void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2710 || arg1 >= anInt2711) {
			return;
		}
		if (arg0 < anInt2709) {
			arg2 -= anInt2709 - arg0;
			arg0 = anInt2709;
		}
		if (arg0 + arg2 > anInt2708) {
			arg2 = anInt2708 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2713;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray424[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray424[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray424[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray424[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
	public static void method1960(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray424 = arg0;
		anInt2713 = arg1;
		anInt2712 = arg2;
		method1951(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(IIIII)V")
	private static void method1961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2709 || arg0 >= anInt2708) {
			return;
		}
		if (arg1 < anInt2710) {
			arg2 -= anInt2710 - arg1;
			arg1 = anInt2710;
		}
		if (arg1 + arg2 > anInt2711) {
			arg2 = anInt2711 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2713;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray424[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray424[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray424[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray424[local58] = local111;
			local58 += anInt2713;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "([I)V")
	public static void method1962(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2709;
		arg0[1] = anInt2710;
		arg0[2] = anInt2708;
		arg0[3] = anInt2711;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
	public static void method1963() {
		anIntArray424 = null;
	}
}
