import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!se", name = "H", descriptor = "[I")
	public static int[] anIntArray586;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "I")
	public static int anInt4226;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "I")
	public static int anInt4227;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	public static int anInt4224 = 0;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "I")
	public static int anInt4225 = 0;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "I")
	public static int anInt4228 = 0;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	public static int anInt4229 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
	public static void method3016() {
		anInt4229 = 0;
		anInt4225 = 0;
		anInt4224 = anInt4227;
		anInt4228 = anInt4226;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	public static void method3017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt4229 < arg0) {
			anInt4229 = arg0;
		}
		if (anInt4225 < arg1) {
			anInt4225 = arg1;
		}
		if (anInt4224 > arg2) {
			anInt4224 = arg2;
		}
		if (anInt4228 > arg3) {
			anInt4228 = arg3;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)V")
	public static void method3018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt4225 || arg1 >= anInt4228) {
			return;
		}
		if (arg0 < anInt4229) {
			arg2 -= anInt4229 - arg0;
			arg0 = anInt4229;
		}
		if (arg0 + arg2 > anInt4224) {
			arg2 = anInt4224 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt4227;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray586[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIII)V")
	public static void method3019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method3018(arg0, arg1, arg2, arg4);
		method3018(arg0, arg1 + arg3 - 1, arg2, arg4);
		method3026(arg0, arg1, arg3, arg4);
		method3026(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt4229) {
			arg2 -= anInt4229 - arg0;
			arg0 = anInt4229;
		}
		if (arg1 < anInt4225) {
			arg3 -= anInt4225 - arg1;
			arg1 = anInt4225;
		}
		if (arg0 + arg2 > anInt4224) {
			arg2 = anInt4224 - arg0;
		}
		if (arg1 + arg3 > anInt4228) {
			arg3 = anInt4228 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt4227 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt4227;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray586[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray586[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
	public static void method3021(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt4229;
		arg0[1] = anInt4225;
		arg0[2] = anInt4224;
		arg0[3] = anInt4228;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIII)V")
	public static void method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt4227) {
			arg2 = anInt4227;
		}
		if (arg3 > anInt4226) {
			arg3 = anInt4226;
		}
		anInt4229 = arg0;
		anInt4225 = arg1;
		anInt4224 = arg2;
		anInt4228 = arg3;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIII)V")
	public static void method3023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method3018(arg0, arg1, arg2 + 1, arg4);
			} else {
				method3018(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt4229) {
					arg1 += local96 * (anInt4229 - arg0);
					arg0 = anInt4229;
				}
				if (arg2 >= anInt4224) {
					arg2 = anInt4224 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt4225 && local125 < anInt4228) {
						anIntArray586[arg0 + local125 * anInt4227] = arg4;
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
				if (arg1 < anInt4225) {
					arg0 += local96 * (anInt4225 - arg1);
					arg1 = anInt4225;
				}
				if (arg3 >= anInt4228) {
					arg3 = anInt4228 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt4229 && local125 < anInt4224) {
						anIntArray586[local125 + arg1 * anInt4227] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method3026(arg0, arg1, arg3 + 1, arg4);
		} else {
			method3026(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(IIIII)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt4229) {
			arg2 -= anInt4229 - arg0;
			arg0 = anInt4229;
		}
		if (arg1 < anInt4225) {
			arg3 -= anInt4225 - arg1;
			arg1 = anInt4225;
		}
		if (arg0 + arg2 > anInt4224) {
			arg2 = anInt4224 - arg0;
		}
		if (arg1 + arg3 > anInt4228) {
			arg3 = anInt4228 - arg1;
		}
		@Pc(43) int local43 = anInt4227 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt4227;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray586[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
	public static void method3025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray586 = arg0;
		anInt4227 = arg1;
		anInt4226 = arg2;
		method3022(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(IIII)V")
	public static void method3026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt4229 || arg0 >= anInt4224) {
			return;
		}
		if (arg1 < anInt4225) {
			arg2 -= anInt4225 - arg1;
			arg1 = anInt4225;
		}
		if (arg1 + arg2 > anInt4228) {
			arg2 = anInt4228 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt4227;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray586[local32 + local34 * anInt4227] = arg3;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIIIII)V")
	public static void method3027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt4229) {
			arg2 -= anInt4229 - arg0;
			arg0 = anInt4229;
		}
		if (anInt4225 > 0) {
			local1 = anInt4225 * 2849;
			arg3 = 23 - anInt4225;
			arg1 = anInt4225;
		}
		if (arg0 + arg2 > anInt4224) {
			arg2 = anInt4224 - arg0;
		}
		if (arg1 + arg3 > anInt4228) {
			arg3 = anInt4228 - arg1;
		}
		@Pc(57) int local57 = anInt4227 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt4227;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >>> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray586[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(IIIII)V")
	private static void method3028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt4225 || arg1 >= anInt4228) {
			return;
		}
		if (arg0 < anInt4229) {
			arg2 -= anInt4229 - arg0;
			arg0 = anInt4229;
		}
		if (arg0 + arg2 > anInt4224) {
			arg2 = anInt4224 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt4227;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray586[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray586[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray586[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray586[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(IIIIII)V")
	public static void method3029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method3028(arg0, arg1, arg2, arg4, arg5);
		method3028(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method3031(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method3031(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "([I)V")
	public static void method3030(@OriginalArg(0) int[] arg0) {
		anInt4229 = arg0[0];
		anInt4225 = arg0[1];
		anInt4224 = arg0[2];
		anInt4228 = arg0[3];
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(IIIII)V")
	private static void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt4229 || arg0 >= anInt4224) {
			return;
		}
		if (arg1 < anInt4225) {
			arg2 -= anInt4225 - arg1;
			arg1 = anInt4225;
		}
		if (arg1 + arg2 > anInt4228) {
			arg2 = anInt4228 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt4227;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray586[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray586[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray586[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray586[local58] = local111;
			local58 += anInt4227;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()V")
	public static void method3032() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt4227 * anInt4226 - 7;
		while (local1 < local7) {
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
			anIntArray586[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray586[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()V")
	public static void method3033() {
		anIntArray586 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III[I[I)V")
	public static void method3034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt4227;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(14) int local14 = local5 + arg2[local7];
			for (@Pc(19) int local19 = -arg3[local7]; local19 < 0; local19++) {
				anIntArray586[local14++] = 0;
			}
			local5 += anInt4227;
		}
	}
}
