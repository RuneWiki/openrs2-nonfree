import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public static int anInt4230;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	public static int anInt4234;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
	public static int anInt4229 = 0;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	public static int anInt4231 = 0;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public static int anInt4232 = 0;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	public static int anInt4233 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	public static void method3180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt4232 || arg0 >= anInt4229) {
			return;
		}
		if (arg1 < anInt4231) {
			arg2 -= anInt4231 - arg1;
			arg1 = anInt4231;
		}
		if (arg1 + arg2 > anInt4233) {
			arg2 = anInt4233 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt4234;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			anIntArray319[local32] = arg3;
			local34++;
			local32 += anInt4234;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
	public static void method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method3188(arg0, arg1, arg2 + 1, arg4);
			} else {
				method3188(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt4232) {
					arg1 += local96 * (anInt4232 - arg0);
					arg0 = anInt4232;
				}
				if (arg2 >= anInt4229) {
					arg2 = anInt4229 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt4231 && local125 < anInt4233) {
						anIntArray319[arg0 + local125 * anInt4234] = arg4;
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
				if (arg1 < anInt4231) {
					arg0 += local96 * (anInt4231 - arg1);
					arg1 = anInt4231;
				}
				if (arg3 >= anInt4233) {
					arg3 = anInt4233 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt4232 && local125 < anInt4229) {
						anIntArray319[local125 + arg1 * anInt4234] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method3180(arg0, arg1, arg3 + 1, arg4);
		} else {
			method3180(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)V")
	public static void method3182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt4232 < arg0) {
			anInt4232 = arg0;
		}
		if (anInt4231 < arg1) {
			anInt4231 = arg1;
		}
		if (anInt4229 > arg2) {
			anInt4229 = arg2;
		}
		if (anInt4233 > arg3) {
			anInt4233 = arg3;
		}
		method3194();
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIII)V")
	private static void method3183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			method3192(arg0, arg1);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < anInt4231) {
			local15 = anInt4231;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > anInt4233) {
			local26 = anInt4233;
		}
		@Pc(33) int local33 = local15;
		@Pc(37) int local37 = arg2 * arg2;
		@Pc(39) int local39 = 0;
		@Pc(43) int local43 = arg1 - local15;
		@Pc(47) int local47 = local43 * local43;
		@Pc(51) int local51 = local47 - local43;
		if (arg1 > local26) {
			arg1 = local26;
		}
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(104) int local104;
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			local82 = arg0 + 1 - local39;
			if (local82 < anInt4232) {
				local82 = anInt4232;
			}
			local91 = arg0 + local39;
			if (local91 > anInt4229) {
				local91 = anInt4229;
			}
			local102 = local82 + local33 * anInt4234;
			for (local104 = local82; local104 < local91; local104++) {
				anIntArray319[local102++] = 16776960;
			}
			local33++;
			local47 -= local43-- + local43;
			local51 -= local43 + local43;
		}
		local39 = arg2;
		local43 = local33 - arg1;
		local51 = local43 * local43 + local37;
		local47 = local51 - arg2;
		local51 -= local43;
		while (local33 < local26) {
			while (local51 > local37 && local47 > local37) {
				local51 -= local39-- + local39;
				local47 -= local39 + local39;
			}
			local82 = arg0 - local39;
			if (local82 < anInt4232) {
				local82 = anInt4232;
			}
			local91 = arg0 + local39;
			if (local91 > anInt4229 - 1) {
				local91 = anInt4229 - 1;
			}
			local102 = local82 + local33 * anInt4234;
			for (local104 = local82; local104 <= local91; local104++) {
				anIntArray319[local102++] = 16776960;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
	public static void method3184() {
		anInt4232 = 0;
		anInt4231 = 0;
		anInt4229 = anInt4234;
		anInt4233 = anInt4230;
		method3194();
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIII)V")
	public static void method3185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method3188(arg0, arg1, arg2, arg4);
		method3188(arg0, arg1 + arg3 - 1, arg2, arg4);
		method3180(arg0, arg1, arg3, arg4);
		method3180(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIII)V")
	public static void method3186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg1;
		@Pc(14) int local14 = local3 >= 0 ? local3 : -local3;
		@Pc(21) int local21 = local7 >= 0 ? local7 : -local7;
		@Pc(23) int local23 = local14;
		if (local14 < local21) {
			local23 = local21;
		}
		if (local23 == 0) {
			return;
		}
		@Pc(37) int local37 = (local3 << 16) / local23;
		@Pc(43) int local43 = (local7 << 16) / local23;
		if (local43 <= local37) {
			local37 = -local37;
		} else {
			local43 = -local43;
		}
		@Pc(59) int local59 = arg5 * local43 >> 17;
		@Pc(67) int local67 = arg5 * local43 + 1 >> 17;
		@Pc(73) int local73 = arg5 * local37 >> 17;
		@Pc(81) int local81 = arg5 * local37 + 1 >> 17;
		@Pc(85) int local85 = arg0 - Static235.method3909();
		@Pc(89) int local89 = arg1 - Static235.method3907();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Static235.method3908(local93, local97, local103);
		Static235.method3912(local113, local117, local123, local93, local97, local103, arg4);
		Static235.method3908(local93, local103, local109);
		Static235.method3912(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIIII)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt4232) {
			arg2 -= anInt4232 - arg0;
			arg0 = anInt4232;
		}
		if (arg1 < anInt4231) {
			arg3 -= anInt4231 - arg1;
			arg1 = anInt4231;
		}
		if (arg0 + arg2 > anInt4229) {
			arg2 = anInt4229 - arg0;
		}
		if (arg1 + arg3 > anInt4233) {
			arg3 = anInt4233 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt4234 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt4234;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray319[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray319[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(IIII)V")
	public static void method3188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt4231 || arg1 >= anInt4233) {
			return;
		}
		if (arg0 < anInt4232) {
			arg2 -= anInt4232 - arg0;
			arg0 = anInt4232;
		}
		if (arg0 + arg2 > anInt4229) {
			arg2 = anInt4229 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt4234;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray319[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
	public static void method3189() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt4234 * anInt4230 - 7;
		while (local1 < local7) {
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
			anIntArray319[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray319[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(IIII)V")
	public static void method3190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt4234) {
			arg2 = anInt4234;
		}
		if (arg3 > anInt4230) {
			arg3 = anInt4230;
		}
		anInt4232 = arg0;
		anInt4231 = arg1;
		anInt4229 = arg2;
		anInt4233 = arg3;
		method3194();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I)V")
	public static void method3191(@OriginalArg(0) int[] arg0) {
		anInt4232 = arg0[0];
		anInt4231 = arg0[1];
		anInt4229 = arg0[2];
		anInt4233 = arg0[3];
		method3194();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
	private static void method3192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= anInt4232 && arg1 >= anInt4231 && arg0 < anInt4229 && arg1 < anInt4233) {
			anIntArray319[arg0 + arg1 * anInt4234] = 16776960;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIIII)V")
	public static void method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt4232) {
			arg2 -= anInt4232 - arg0;
			arg0 = anInt4232;
		}
		if (arg1 < anInt4231) {
			arg3 -= anInt4231 - arg1;
			arg1 = anInt4231;
		}
		if (arg0 + arg2 > anInt4229) {
			arg2 = anInt4229 - arg0;
		}
		if (arg1 + arg3 > anInt4233) {
			arg3 = anInt4233 - arg1;
		}
		@Pc(43) int local43 = anInt4234 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt4234;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray319[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	public static void method3194() {
		anIntArray318 = null;
		anIntArray317 = null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([I)V")
	public static void method3195(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt4232;
		arg0[1] = anInt4231;
		arg0[2] = anInt4229;
		arg0[3] = anInt4233;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(IIIII)V")
	private static void method3196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt4232 || arg0 >= anInt4229) {
			return;
		}
		if (arg1 < anInt4231) {
			arg2 -= anInt4231 - arg1;
			arg1 = anInt4231;
		}
		if (arg1 + arg2 > anInt4233) {
			arg2 = anInt4233 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt4234;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray319[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray319[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray319[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray319[local58] = local111;
			local58 += anInt4234;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I[I)V")
	public static void method3197(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != anInt4233 - anInt4231 || arg1.length != anInt4233 - anInt4231) {
			throw new IllegalArgumentException();
		}
		anIntArray318 = arg0;
		anIntArray317 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(IIIII)V")
	private static void method3198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt4231 || arg1 >= anInt4233) {
			return;
		}
		if (arg0 < anInt4232) {
			arg2 -= anInt4232 - arg0;
			arg0 = anInt4232;
		}
		if (arg0 + arg2 > anInt4229) {
			arg2 = anInt4229 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt4234;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray319[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray319[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray319[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray319[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([III)V")
	public static void method3199(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray319 = arg0;
		anInt4234 = arg1;
		anInt4230 = arg2;
		method3190(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III[I[I)V")
	public static void method3200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt4234;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(14) int local14 = local5 + arg2[local7];
			for (@Pc(19) int local19 = -arg3[local7]; local19 < 0; local19++) {
				anIntArray319[local14++] = 0;
			}
			local5 += anInt4234;
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(IIIIII)V")
	public static void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method3198(arg0, arg1, arg2, arg4, arg5);
		method3198(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method3196(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method3196(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(IIIII)V")
	public static void method3202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return;
		}
		if (arg3 == 256) {
			method3183(arg0, arg1, arg2);
			return;
		}
		@Pc(20) int local20 = 256 - arg3;
		@Pc(28) int local28 = arg3 * 255;
		@Pc(36) int local36 = arg3 * 255;
		@Pc(42) int local42 = arg3 * 0;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < anInt4231) {
			local46 = anInt4231;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > anInt4233) {
			local57 = anInt4233;
		}
		@Pc(64) int local64 = local46;
		@Pc(68) int local68 = arg2 * arg2;
		@Pc(70) int local70 = 0;
		@Pc(74) int local74 = arg1 - local46;
		@Pc(78) int local78 = local74 * local74;
		@Pc(82) int local82 = local78 - local74;
		if (arg1 > local57) {
			arg1 = local57;
		}
		@Pc(146) int local146;
		@Pc(156) int local156;
		@Pc(164) int local164;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(135) int local135;
		@Pc(186) int local186;
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			local113 = arg0 + 1 - local70;
			if (local113 < anInt4232) {
				local113 = anInt4232;
			}
			local122 = arg0 + local70;
			if (local122 > anInt4229) {
				local122 = anInt4229;
			}
			local133 = local113 + local64 * anInt4234;
			for (local135 = local113; local135 < local122; local135++) {
				local146 = (anIntArray319[local133] >> 16 & 0xFF) * local20;
				local156 = (anIntArray319[local133] >> 8 & 0xFF) * local20;
				local164 = (anIntArray319[local133] & 0xFF) * local20;
				local186 = (local28 + local146 >> 8 << 16) + (local36 + local156 >> 8 << 8) + (local42 + local164 >> 8);
				anIntArray319[local133++] = local186;
			}
			local64++;
			local78 -= local74-- + local74;
			local82 -= local74 + local74;
		}
		local70 = arg2;
		local74 = -local74;
		local82 = local74 * local74 + local68;
		local78 = local82 - arg2;
		local82 -= local74;
		while (local64 < local57) {
			while (local82 > local68 && local78 > local68) {
				local82 -= local70-- + local70;
				local78 -= local70 + local70;
			}
			local113 = arg0 - local70;
			if (local113 < anInt4232) {
				local113 = anInt4232;
			}
			local122 = arg0 + local70;
			if (local122 > anInt4229 - 1) {
				local122 = anInt4229 - 1;
			}
			local133 = local113 + local64 * anInt4234;
			for (local135 = local113; local135 <= local122; local135++) {
				local146 = (anIntArray319[local133] >> 16 & 0xFF) * local20;
				local156 = (anIntArray319[local133] >> 8 & 0xFF) * local20;
				local164 = (anIntArray319[local133] & 0xFF) * local20;
				local186 = (local28 + local146 >> 8 << 16) + (local36 + local156 >> 8 << 8) + (local42 + local164 >> 8);
				anIntArray319[local133++] = local186;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}
}
