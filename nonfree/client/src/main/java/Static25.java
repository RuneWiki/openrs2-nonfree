import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "[I")
	public static int[] anIntArray25;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
	public static int[] anIntArray26;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	public static int anInt420;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public static int anInt421;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	public static int anInt417 = 0;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt422 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
	public static void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt418) {
			arg2 -= anInt418 - arg0;
			arg0 = anInt418;
		}
		if (arg1 < anInt417) {
			arg3 -= anInt417 - arg1;
			arg1 = anInt417;
		}
		if (arg0 + arg2 > anInt422) {
			arg2 = anInt422 - arg0;
		}
		if (arg1 + arg3 > anInt419) {
			arg3 = anInt419 - arg1;
		}
		@Pc(43) int local43 = anInt420 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt420;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				anIntArray27[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[I[I)V")
	public static void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt420;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				anIntArray27[local17++] = 0;
			}
			local5 += anInt420;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([III)V")
	public static void method388(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray27 = arg0;
		anInt420 = arg1;
		anInt421 = arg2;
		method401(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIII)V")
	private static void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt418 || arg0 >= anInt422) {
			return;
		}
		if (arg1 < anInt417) {
			arg2 -= anInt417 - arg1;
			arg1 = anInt417;
		}
		if (arg1 + arg2 > anInt419) {
			arg2 = anInt419 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt420;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray27[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray27[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray27[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray27[local58] = local113;
			local58 += anInt420;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	public static void method390() {
		anIntArray25 = null;
		anIntArray26 = null;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIIII)V")
	public static void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return;
		}
		if (arg4 == 256) {
			method407(arg0, arg1, arg2, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(20) int local20 = 256 - arg4;
		@Pc(28) int local28 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(36) int local36 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(42) int local42 = (arg3 & 0xFF) * arg4;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < anInt417) {
			local46 = anInt417;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > anInt419) {
			local57 = anInt419;
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
		@Pc(151) int local151;
		@Pc(161) int local161;
		@Pc(169) int local169;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(191) int local191;
		while (local64 < arg1) {
			while (local82 <= local68 || local78 <= local68) {
				local78 += local70 + local70;
				local82 += local70++ + local70;
			}
			local116 = arg0 + 1 - local70;
			if (local116 < anInt418) {
				local116 = anInt418;
			}
			local125 = arg0 + local70;
			if (local125 > anInt422) {
				local125 = anInt422;
			}
			local136 = local116 + local64 * anInt420;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (anIntArray27[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray27[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray27[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray27[local136++] = local191;
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
			local116 = arg0 - local70;
			if (local116 < anInt418) {
				local116 = anInt418;
			}
			local125 = arg0 + local70;
			if (local125 > anInt422 - 1) {
				local125 = anInt422 - 1;
			}
			local136 = local116 + local64 * anInt420;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (anIntArray27[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray27[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray27[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray27[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt418 < arg0) {
			anInt418 = arg0;
		}
		if (anInt417 < arg1) {
			anInt417 = arg1;
		}
		if (anInt422 > arg2) {
			anInt422 = arg2;
		}
		if (anInt419 > arg3) {
			anInt419 = arg3;
		}
		method390();
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIII)V")
	public static void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method398(arg0, arg1, arg2 + 1, arg4);
			} else {
				method398(arg0 + arg2, arg1, 1 - arg2, arg4);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(96) int local96;
			@Pc(127) int local127;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(86) int local86 = arg3 << 16;
				local96 = (int) Math.floor((double) local86 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < anInt418) {
					arg1 += local96 * (anInt418 - arg0);
					arg0 = anInt418;
				}
				if (arg2 >= anInt422) {
					arg2 = anInt422 - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= anInt417 && local127 < anInt419) {
						anIntArray27[arg0 + local127 * anInt420] = arg4;
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
				if (arg1 < anInt417) {
					arg0 += local96 * (anInt417 - arg1);
					arg1 = anInt417;
				}
				if (arg3 >= anInt419) {
					arg3 = anInt419 - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= anInt418 && local127 < anInt422) {
						anIntArray27[local127 + arg1 * anInt420] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method409(arg0, arg1, arg3 + 1, arg4);
		} else {
			method409(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V")
	public static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method395(arg0, arg1, arg2, arg4, arg5);
		method395(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method389(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method389(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIIII)V")
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt417 || arg1 >= anInt419) {
			return;
		}
		if (arg0 < anInt418) {
			arg2 -= anInt418 - arg0;
			arg0 = anInt418;
		}
		if (arg0 + arg2 > anInt422) {
			arg2 = anInt422 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt420;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray27[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray27[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray27[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray27[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	private static void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= anInt418 && arg1 >= anInt417 && arg0 < anInt422 && arg1 < anInt419) {
			anIntArray27[arg0 + arg1 * anInt420] = arg2;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIIII)V")
	public static void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt418) {
			arg2 -= anInt418 - arg0;
			arg0 = anInt418;
		}
		if (arg1 < anInt417) {
			arg3 -= anInt417 - arg1;
			arg1 = anInt417;
		}
		if (arg0 + arg2 > anInt422) {
			arg2 = anInt422 - arg0;
		}
		if (arg1 + arg3 > anInt419) {
			arg3 = anInt419 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt420 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt420;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = anIntArray27[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray27[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIII)V")
	public static void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt417 || arg1 >= anInt419) {
			return;
		}
		if (arg0 < anInt418) {
			arg2 -= anInt418 - arg0;
			arg0 = anInt418;
		}
		if (arg0 + arg2 > anInt422) {
			arg2 = anInt422 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt420;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray27[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([I)V")
	public static void method399(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt418;
		arg0[1] = anInt417;
		arg0[2] = anInt422;
		arg0[3] = anInt419;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	public static void method400() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt420 * anInt421 - 7;
		while (local1 < local7) {
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
			anIntArray27[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray27[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIII)V")
	public static void method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt420) {
			arg2 = anInt420;
		}
		if (arg3 > anInt421) {
			arg3 = anInt421;
		}
		anInt418 = arg0;
		anInt417 = arg1;
		anInt422 = arg2;
		anInt419 = arg3;
		method390();
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(IIIII)V")
	public static void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method398(arg0, arg1, arg2, arg4);
		method398(arg0, arg1 + arg3 - 1, arg2, arg4);
		method409(arg0, arg1, arg3, arg4);
		method409(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([I[I)V")
	public static void method403(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != anInt419 - anInt417 || arg1.length != anInt419 - anInt417) {
			throw new IllegalArgumentException();
		}
		anIntArray25 = arg0;
		anIntArray26 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII[I[I)V")
	private static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (anInt419 - anInt417 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg0 >= anInt418 && arg0 < anInt422) {
			if (arg1 < anInt417) {
				arg2 -= anInt417 - arg1;
				arg1 = anInt417;
			}
			if (arg1 + arg2 > anInt419) {
				arg2 = anInt419 - arg1;
			}
			@Pc(40) int local40 = 256 - arg4;
			@Pc(48) int local48 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(56) int local56 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(62) int local62 = (arg3 & 0xFF) * arg4;
			@Pc(68) int local68 = arg0 + arg1 * anInt420;
			for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
				@Pc(79) int local79 = arg1 + local70 - anInt417;
				if (arg0 - anInt418 >= arg5[local79] && arg0 - anInt418 < arg5[local79] + arg6[local79]) {
					@Pc(107) int local107 = (anIntArray27[local68] >> 16 & 0xFF) * local40;
					@Pc(117) int local117 = (anIntArray27[local68] >> 8 & 0xFF) * local40;
					@Pc(125) int local125 = (anIntArray27[local68] & 0xFF) * local40;
					@Pc(147) int local147 = (local48 + local107 >> 8 << 16) + (local56 + local117 >> 8 << 8) + (local62 + local125 >> 8);
					anIntArray27[local68] = local147;
				}
				local68 += anInt420;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(IIIIII)V")
	public static void method405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method395(arg0, arg1, arg2, arg4, arg5);
			} else {
				method395(arg0 + arg2 + 1, arg1, -arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			@Pc(55) boolean local55 = false;
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
				local55 = true;
			}
			@Pc(79) int local79 = 256 - arg5;
			@Pc(87) int local87 = (arg4 >> 16 & 0xFF) * arg5;
			@Pc(95) int local95 = (arg4 >> 8 & 0xFF) * arg5;
			@Pc(101) int local101 = (arg4 & 0xFF) * arg5;
			@Pc(126) int local126;
			@Pc(167) int local167;
			@Pc(179) int local179;
			@Pc(189) int local189;
			@Pc(199) int local199;
			@Pc(207) int local207;
			@Pc(229) int local229;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(116) int local116 = arg3 << 16;
				local126 = (int) Math.floor((double) local116 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (local55) {
					arg1 += local126;
					arg0++;
				}
				if (arg0 < anInt418) {
					arg1 += local126 * (anInt418 - arg0);
					arg0 = anInt418;
				}
				if (arg2 >= anInt422) {
					arg2 = anInt422 - 1;
				}
				if (!local55) {
					arg2--;
				}
				while (arg0 <= arg2) {
					local167 = arg1 >> 16;
					if (local167 >= anInt417 && local167 < anInt419) {
						local179 = arg0 + local167 * anInt420;
						local189 = (anIntArray27[local179] >> 16 & 0xFF) * local79;
						local199 = (anIntArray27[local179] >> 8 & 0xFF) * local79;
						local207 = (anIntArray27[local179] & 0xFF) * local79;
						local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						anIntArray27[local179] = local229;
					}
					arg1 += local126;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(252) int local252 = arg2 << 16;
				local126 = (int) Math.floor((double) local252 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (local55) {
					arg0 += local126;
					arg1++;
				}
				if (arg1 < anInt417) {
					arg0 += local126 * (anInt417 - arg1);
					arg1 = anInt417;
				}
				if (arg3 >= anInt419) {
					arg3 = anInt419 - 1;
				}
				if (!local55) {
					arg3--;
				}
				while (arg1 <= arg3) {
					local167 = arg0 >> 16;
					if (local167 >= anInt418 && local167 < anInt422) {
						local179 = local167 + arg1 * anInt420;
						local189 = (anIntArray27[local179] >> 16 & 0xFF) * local79;
						local199 = (anIntArray27[local179] >> 8 & 0xFF) * local79;
						local207 = (anIntArray27[local179] & 0xFF) * local79;
						local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						anIntArray27[local179] = local229;
					}
					arg0 += local126;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method389(arg0, arg1, arg3, arg4, arg5);
		} else {
			method389(arg0, arg1 + arg3 + 1, -arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "([I)V")
	public static void method406(@OriginalArg(0) int[] arg0) {
		anInt418 = arg0[0];
		anInt417 = arg0[1];
		anInt422 = arg0[2];
		anInt419 = arg0[3];
		method390();
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIII)V")
	private static void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			method396(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < anInt417) {
			local15 = anInt417;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > anInt419) {
			local26 = anInt419;
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
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(105) int local105;
		@Pc(107) int local107;
		while (local33 < arg1) {
			while (local51 <= local37 || local47 <= local37) {
				local47 += local39 + local39;
				local51 += local39++ + local39;
			}
			local85 = arg0 + 1 - local39;
			if (local85 < anInt418) {
				local85 = anInt418;
			}
			local94 = arg0 + local39;
			if (local94 > anInt422) {
				local94 = anInt422;
			}
			local105 = local85 + local33 * anInt420;
			for (local107 = local85; local107 < local94; local107++) {
				anIntArray27[local105++] = arg3;
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
			local85 = arg0 - local39;
			if (local85 < anInt418) {
				local85 = anInt418;
			}
			local94 = arg0 + local39;
			if (local94 > anInt422 - 1) {
				local94 = anInt422 - 1;
			}
			local105 = local85 + local33 * anInt420;
			for (local107 = local85; local107 <= local94; local107++) {
				anIntArray27[local105++] = arg3;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII[I[I)V")
	public static void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		if (anInt419 - anInt417 != arg6.length) {
			throw new IllegalStateException();
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method410(arg0, arg1, arg2, arg4, arg5, arg6, arg7);
			} else {
				method410(arg0 + arg2 + 1, arg1, -arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			@Pc(73) boolean local73 = false;
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
				local73 = true;
			}
			@Pc(97) int local97 = 256 - arg5;
			@Pc(105) int local105 = (arg4 >> 16 & 0xFF) * arg5;
			@Pc(113) int local113 = (arg4 >> 8 & 0xFF) * arg5;
			@Pc(119) int local119 = (arg4 & 0xFF) * arg5;
			@Pc(144) int local144;
			@Pc(185) int local185;
			@Pc(189) int local189;
			@Pc(219) int local219;
			@Pc(229) int local229;
			@Pc(239) int local239;
			@Pc(247) int local247;
			@Pc(269) int local269;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(134) int local134 = arg3 << 16;
				local144 = (int) Math.floor((double) local134 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (local73) {
					arg1 += local144;
					arg0++;
				}
				if (arg0 < anInt418) {
					arg1 += local144 * (anInt418 - arg0);
					arg0 = anInt418;
				}
				if (arg2 >= anInt422) {
					arg2 = anInt422 - 1;
				}
				if (!local73) {
					arg2--;
				}
				while (arg0 <= arg2) {
					local185 = arg1 >> 16;
					local189 = local185 - anInt417;
					if (local185 >= anInt417 && local185 < anInt419 && arg0 - anInt418 >= arg6[local189] && arg0 - anInt418 < arg6[local189] + arg7[local189]) {
						local219 = arg0 + local185 * anInt420;
						local229 = (anIntArray27[local219] >> 16 & 0xFF) * local97;
						local239 = (anIntArray27[local219] >> 8 & 0xFF) * local97;
						local247 = (anIntArray27[local219] & 0xFF) * local97;
						local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						anIntArray27[local219] = local269;
					}
					arg1 += local144;
					arg0++;
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(292) int local292 = arg2 << 16;
				local144 = (int) Math.floor((double) local292 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (local73) {
					arg0 += local144;
					arg1++;
				}
				if (arg1 < anInt417) {
					arg0 += local144 * (anInt417 - arg1);
					arg1 = anInt417;
				}
				if (arg3 >= anInt419) {
					arg3 = anInt419 - 1;
				}
				if (!local73) {
					arg3--;
				}
				while (arg1 <= arg3) {
					local185 = arg0 >> 16;
					local189 = arg1 - anInt417;
					if (local185 >= anInt418 && local185 < anInt422 && local185 - anInt418 >= arg6[local189] && local185 - anInt418 < arg6[local189] + arg7[local189]) {
						local219 = local185 + arg1 * anInt420;
						local229 = (anIntArray27[local219] >> 16 & 0xFF) * local97;
						local239 = (anIntArray27[local219] >> 8 & 0xFF) * local97;
						local247 = (anIntArray27[local219] & 0xFF) * local97;
						local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						anIntArray27[local219] = local269;
					}
					arg0 += local144;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method404(arg0, arg1, arg3, arg4, arg5, arg6, arg7);
		} else {
			method404(arg0, arg1 + arg3 + 1, -arg3, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(IIII)V")
	public static void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt418 || arg0 >= anInt422) {
			return;
		}
		if (arg1 < anInt417) {
			arg2 -= anInt417 - arg1;
			arg1 = anInt417;
		}
		if (arg1 + arg2 > anInt419) {
			arg2 = anInt419 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt420;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			anIntArray27[local32] = arg3;
			local34++;
			local32 += anInt420;
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(IIIII[I[I)V")
	private static void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (anInt419 - anInt417 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg1 >= anInt417 && arg1 < anInt419) {
			@Pc(24) int local24 = anInt418 + arg5[arg1 - anInt417];
			if (arg0 < local24) {
				arg2 -= local24 - arg0;
				arg0 = local24;
			}
			@Pc(49) int local49 = anInt418 + arg5[arg1 - anInt417] + arg6[arg1 - anInt417];
			if (arg0 + arg2 > local49) {
				arg2 = local49 - arg0;
			}
			@Pc(62) int local62 = 256 - arg4;
			@Pc(70) int local70 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(78) int local78 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(84) int local84 = (arg3 & 0xFF) * arg4;
			@Pc(90) int local90 = arg0 + arg1 * anInt420;
			for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
				@Pc(105) int local105 = (anIntArray27[local90] >> 16 & 0xFF) * local62;
				@Pc(115) int local115 = (anIntArray27[local90] >> 8 & 0xFF) * local62;
				@Pc(123) int local123 = (anIntArray27[local90] & 0xFF) * local62;
				@Pc(145) int local145 = (local70 + local105 >> 8 << 16) + (local78 + local115 >> 8 << 8) + (local84 + local123 >> 8);
				anIntArray27[local90++] = local145;
			}
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "(IIIIII)V")
	public static void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(85) int local85 = arg0 - Static215.method3383();
		@Pc(89) int local89 = arg1 - Static215.method3370();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Static215.method3382(local93, local97, local103);
		Static215.method3384(local113, local117, local123, local93, local97, local103, arg4);
		Static215.method3382(local93, local103, local109);
		Static215.method3384(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()V")
	public static void method412() {
		anInt418 = 0;
		anInt417 = 0;
		anInt422 = anInt420;
		anInt419 = anInt421;
		method390();
	}
}
