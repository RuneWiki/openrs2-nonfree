import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
	public static int anInt2808;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "I")
	public static int anInt2809 = 0;

	@OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
	public static void method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1971(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1971(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2809) {
					arg1 += local96 * (anInt2809 - arg0);
					arg0 = anInt2809;
				}
				if (arg2 >= anInt2807) {
					arg2 = anInt2807 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2811 && local125 < anInt2806) {
						anIntArray421[arg0 + local125 * anInt2810] = arg4;
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
				if (arg1 < anInt2811) {
					arg0 += local96 * (anInt2811 - arg1);
					arg1 = anInt2811;
				}
				if (arg3 >= anInt2806) {
					arg3 = anInt2806 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2809 && local125 < anInt2807) {
						anIntArray421[local125 + arg1 * anInt2810] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1968(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1968(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V")
	public static void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2809 || arg0 >= anInt2807) {
			return;
		}
		if (arg1 < anInt2811) {
			arg2 -= anInt2811 - arg1;
			arg1 = anInt2811;
		}
		if (arg1 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2810;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray421[local32 + local34 * anInt2810] = arg3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIII)V")
	private static void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2811 || arg1 >= anInt2806) {
			return;
		}
		if (arg0 < anInt2809) {
			arg2 -= anInt2809 - arg0;
			arg0 = anInt2809;
		}
		if (arg0 + arg2 > anInt2807) {
			arg2 = anInt2807 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2810;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray421[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray421[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray421[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray421[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIII)V")
	public static void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt2809) {
			arg2 -= anInt2809 - arg0;
			arg0 = anInt2809;
		}
		if (anInt2811 > 0) {
			local1 = anInt2811 * 2849;
			arg3 = 23 - anInt2811;
			arg1 = anInt2811;
		}
		if (arg0 + arg2 > anInt2807) {
			arg2 = anInt2807 - arg0;
		}
		if (arg1 + arg3 > anInt2806) {
			arg3 = anInt2806 - arg1;
		}
		@Pc(57) int local57 = anInt2810 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt2810;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >>> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray421[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIII)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2811 || arg1 >= anInt2806) {
			return;
		}
		if (arg0 < anInt2809) {
			arg2 -= anInt2809 - arg0;
			arg0 = anInt2809;
		}
		if (arg0 + arg2 > anInt2807) {
			arg2 = anInt2807 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2810;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray421[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
	public static void method1972() {
		anIntArray421 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
	public static void method1973(@OriginalArg(0) int[] arg0) {
		anInt2809 = arg0[0];
		anInt2811 = arg0[1];
		anInt2807 = arg0[2];
		anInt2806 = arg0[3];
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[I[I)V")
	public static void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt2810;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(14) int local14 = local5 + arg2[local7];
			for (@Pc(19) int local19 = -arg3[local7]; local19 < 0; local19++) {
				anIntArray421[local14++] = 0;
			}
			local5 += anInt2810;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([III)V")
	public static void method1975(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray421 = arg0;
		anInt2810 = arg1;
		anInt2808 = arg2;
		method1981(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(IIIIII)V")
	public static void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1969(arg0, arg1, arg2, arg4, arg5);
		method1969(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1978(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1978(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "([I)V")
	public static void method1977(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2809;
		arg0[1] = anInt2811;
		arg0[2] = anInt2807;
		arg0[3] = anInt2806;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIIII)V")
	private static void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2809 || arg0 >= anInt2807) {
			return;
		}
		if (arg1 < anInt2811) {
			arg2 -= anInt2811 - arg1;
			arg1 = anInt2811;
		}
		if (arg1 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2810;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray421[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray421[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray421[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray421[local58] = local111;
			local58 += anInt2810;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIIII)V")
	public static void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1971(arg0, arg1, arg2, arg4);
		method1971(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1968(arg0, arg1, arg3, arg4);
		method1968(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()V")
	public static void method1980() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2810 * anInt2808 - 7;
		while (local1 < local7) {
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
			anIntArray421[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray421[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIII)V")
	public static void method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2810) {
			arg2 = anInt2810;
		}
		if (arg3 > anInt2808) {
			arg3 = anInt2808;
		}
		anInt2809 = arg0;
		anInt2811 = arg1;
		anInt2807 = arg2;
		anInt2806 = arg3;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
	public static void method1982() {
		anInt2809 = 0;
		anInt2811 = 0;
		anInt2807 = anInt2810;
		anInt2806 = anInt2808;
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(IIIIII)V")
	public static void method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2809) {
			arg2 -= anInt2809 - arg0;
			arg0 = anInt2809;
		}
		if (arg1 < anInt2811) {
			arg3 -= anInt2811 - arg1;
			arg1 = anInt2811;
		}
		if (arg0 + arg2 > anInt2807) {
			arg2 = anInt2807 - arg0;
		}
		if (arg1 + arg3 > anInt2806) {
			arg3 = anInt2806 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt2810 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt2810;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray421[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray421[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(IIIII)V")
	public static void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2809) {
			arg2 -= anInt2809 - arg0;
			arg0 = anInt2809;
		}
		if (arg1 < anInt2811) {
			arg3 -= anInt2811 - arg1;
			arg1 = anInt2811;
		}
		if (arg0 + arg2 > anInt2807) {
			arg2 = anInt2807 - arg0;
		}
		if (arg1 + arg3 > anInt2806) {
			arg3 = anInt2806 - arg1;
		}
		@Pc(43) int local43 = anInt2810 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2810;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray421[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(IIII)V")
	public static void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt2809 < arg0) {
			anInt2809 = arg0;
		}
		if (anInt2811 < arg1) {
			anInt2811 = arg1;
		}
		if (anInt2807 > arg2) {
			anInt2807 = arg2;
		}
		if (anInt2806 > arg3) {
			anInt2806 = arg3;
		}
	}
}
