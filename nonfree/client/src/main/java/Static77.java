import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "I")
	public static int anInt3239;

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!n", name = "cb", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!n", name = "X", descriptor = "I")
	public static int anInt3238 = 0;

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "I")
	public static int anInt3240 = 0;

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!n", name = "db", descriptor = "I")
	public static int anInt3243 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	public static void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3241) {
			arg2 -= anInt3241 - arg0;
			arg0 = anInt3241;
		}
		if (arg1 < anInt3243) {
			arg3 -= anInt3243 - arg1;
			arg1 = anInt3243;
		}
		if (arg0 + arg2 > anInt3238) {
			arg2 = anInt3238 - arg0;
		}
		if (arg1 + arg3 > anInt3240) {
			arg3 = anInt3240 - arg1;
		}
		@Pc(43) int local43 = anInt3239 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt3239;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray389[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III[I[I)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt3239;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(14) int local14 = local5 + arg2[local7];
			for (@Pc(19) int local19 = -arg3[local7]; local19 < 0; local19++) {
				anIntArray389[local14++] = 0;
			}
			local5 += anInt3239;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([I)V")
	public static void method2216(@OriginalArg(0) int[] arg0) {
		anInt3241 = arg0[0];
		anInt3243 = arg0[1];
		anInt3238 = arg0[2];
		anInt3240 = arg0[3];
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIII)V")
	private static void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt3243 || arg1 >= anInt3240) {
			return;
		}
		if (arg0 < anInt3241) {
			arg2 -= anInt3241 - arg0;
			arg0 = anInt3241;
		}
		if (arg0 + arg2 > anInt3238) {
			arg2 = anInt3238 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3239;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray389[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray389[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray389[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray389[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
	public static void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt3239) {
			arg2 = anInt3239;
		}
		if (arg3 > anInt3242) {
			arg3 = anInt3242;
		}
		anInt3241 = arg0;
		anInt3243 = arg1;
		anInt3238 = arg2;
		anInt3240 = arg3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([III)V")
	public static void method2219(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray389 = arg0;
		anInt3239 = arg1;
		anInt3242 = arg2;
		method2218(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIII)V")
	public static void method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt3241 || arg0 >= anInt3238) {
			return;
		}
		if (arg1 < anInt3243) {
			arg2 -= anInt3243 - arg1;
			arg1 = anInt3243;
		}
		if (arg1 + arg2 > anInt3240) {
			arg2 = anInt3240 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3239;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray389[local32 + local34 * anInt3239] = arg3;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "([I)V")
	public static void method2221(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3241;
		arg0[1] = anInt3243;
		arg0[2] = anInt3238;
		arg0[3] = anInt3240;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	public static void method2222() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt3239 * anInt3242 - 7;
		while (local1 < local7) {
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
			anIntArray389[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray389[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
	public static void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2217(arg0, arg1, arg2, arg4, arg5);
		method2217(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method2230(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method2230(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IIIIII)V")
	public static void method2224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt3241) {
			arg2 -= anInt3241 - arg0;
			arg0 = anInt3241;
		}
		if (arg1 < anInt3243) {
			arg3 -= anInt3243 - arg1;
			arg1 = anInt3243;
		}
		if (arg0 + arg2 > anInt3238) {
			arg2 = anInt3238 - arg0;
		}
		if (arg1 + arg3 > anInt3240) {
			arg3 = anInt3240 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt3239 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt3239;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray389[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray389[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
	public static void method2225() {
		anInt3241 = 0;
		anInt3243 = 0;
		anInt3238 = anInt3239;
		anInt3240 = anInt3242;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(IIIIII)V")
	public static void method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt3241) {
			arg2 -= anInt3241 - arg0;
			arg0 = anInt3241;
		}
		if (anInt3243 > 0) {
			local1 = anInt3243 * 2849;
			arg3 = 23 - anInt3243;
			arg1 = anInt3243;
		}
		if (arg0 + arg2 > anInt3238) {
			arg2 = anInt3238 - arg0;
		}
		if (arg1 + arg3 > anInt3240) {
			arg3 = anInt3240 - arg1;
		}
		@Pc(57) int local57 = anInt3239 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt3239;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >>> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray389[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(IIIII)V")
	public static void method2227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method2231(arg0, arg1, arg2 + 1, arg4);
			} else {
				method2231(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt3241) {
					arg1 += local96 * (anInt3241 - arg0);
					arg0 = anInt3241;
				}
				if (arg2 >= anInt3238) {
					arg2 = anInt3238 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt3243 && local125 < anInt3240) {
						anIntArray389[arg0 + local125 * anInt3239] = arg4;
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
				if (arg1 < anInt3243) {
					arg0 += local96 * (anInt3243 - arg1);
					arg1 = anInt3243;
				}
				if (arg3 >= anInt3240) {
					arg3 = anInt3240 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt3241 && local125 < anInt3238) {
						anIntArray389[local125 + arg1 * anInt3239] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method2220(arg0, arg1, arg3 + 1, arg4);
		} else {
			method2220(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(IIIII)V")
	public static void method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method2231(arg0, arg1, arg2, arg4);
		method2231(arg0, arg1 + arg3 - 1, arg2, arg4);
		method2220(arg0, arg1, arg3, arg4);
		method2220(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(IIII)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3241 < arg0) {
			anInt3241 = arg0;
		}
		if (anInt3243 < arg1) {
			anInt3243 = arg1;
		}
		if (anInt3238 > arg2) {
			anInt3238 = arg2;
		}
		if (anInt3240 > arg3) {
			anInt3240 = arg3;
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(IIIII)V")
	private static void method2230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3241 || arg0 >= anInt3238) {
			return;
		}
		if (arg1 < anInt3243) {
			arg2 -= anInt3243 - arg1;
			arg1 = anInt3243;
		}
		if (arg1 + arg2 > anInt3240) {
			arg2 = anInt3240 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3239;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray389[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray389[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray389[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray389[local58] = local111;
			local58 += anInt3239;
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(IIII)V")
	public static void method2231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt3243 || arg1 >= anInt3240) {
			return;
		}
		if (arg0 < anInt3241) {
			arg2 -= anInt3241 - arg0;
			arg0 = anInt3241;
		}
		if (arg0 + arg2 > anInt3238) {
			arg2 = anInt3238 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3239;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray389[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
	public static void method2232() {
		anIntArray389 = null;
	}
}
