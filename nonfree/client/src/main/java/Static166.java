import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public static int anInt3305;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
	public static int anInt3307;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!mh", name = "i", descriptor = "[I")
	public static int[] anIntArray295;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt3302 = 0;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
	public static int anInt3303 = 0;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public static int anInt3304 = 0;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public static int anInt3306 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "()V")
	public static void method2606() {
		anIntArray294 = null;
		anIntArray295 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[I[I)V")
	public static void method2607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt3305;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				anIntArray293[local17++] = 0;
			}
			local5 += anInt3305;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)V")
	public static void method2608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt3302 || arg0 >= anInt3306) {
			return;
		}
		if (arg1 < anInt3303) {
			arg2 -= anInt3303 - arg1;
			arg1 = anInt3303;
		}
		if (arg1 + arg2 > anInt3304) {
			arg2 = anInt3304 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3305;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			anIntArray293[local32] = arg3;
			local34++;
			local32 += anInt3305;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([I)V")
	public static void method2609(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt3302;
		arg0[1] = anInt3303;
		arg0[2] = anInt3306;
		arg0[3] = anInt3304;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)V")
	private static void method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			method2621(arg0, arg1);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < anInt3303) {
			local15 = anInt3303;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > anInt3304) {
			local26 = anInt3304;
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
			if (local85 < anInt3302) {
				local85 = anInt3302;
			}
			local94 = arg0 + local39;
			if (local94 > anInt3306) {
				local94 = anInt3306;
			}
			local105 = local85 + local33 * anInt3305;
			for (local107 = local85; local107 < local94; local107++) {
				anIntArray293[local105++] = 16776960;
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
			if (local85 < anInt3302) {
				local85 = anInt3302;
			}
			local94 = arg0 + local39;
			if (local94 > anInt3306 - 1) {
				local94 = anInt3306 - 1;
			}
			local105 = local85 + local33 * anInt3305;
			for (local107 = local85; local107 <= local94; local107++) {
				anIntArray293[local105++] = 16776960;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V")
	public static void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(85) int local85 = arg0 - Static204.method3229();
		@Pc(89) int local89 = arg1 - Static204.method3240();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Static204.method3225(local93, local97, local103);
		Static204.method3227(local113, local117, local123, local93, local97, local103, arg4);
		Static204.method3225(local93, local103, local109);
		Static204.method3227(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIIII)V")
	public static void method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method2613(arg0, arg1, arg2, arg4, arg5);
		method2613(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method2624(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method2624(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V")
	private static void method2613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt3303 || arg1 >= anInt3304) {
			return;
		}
		if (arg0 < anInt3302) {
			arg2 -= anInt3302 - arg0;
			arg0 = anInt3302;
		}
		if (arg0 + arg2 > anInt3306) {
			arg2 = anInt3306 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3305;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray293[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray293[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray293[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray293[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIIII)V")
	public static void method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method2615(arg0, arg1, arg2, arg4);
		method2615(arg0, arg1 + arg3 - 1, arg2, arg4);
		method2608(arg0, arg1, arg3, arg4);
		method2608(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIII)V")
	public static void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt3303 || arg1 >= anInt3304) {
			return;
		}
		if (arg0 < anInt3302) {
			arg2 -= anInt3302 - arg0;
			arg0 = anInt3302;
		}
		if (arg0 + arg2 > anInt3306) {
			arg2 = anInt3306 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt3305;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray293[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIIII)V")
	public static void method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt3302) {
			arg2 -= anInt3302 - arg0;
			arg0 = anInt3302;
		}
		if (arg1 < anInt3303) {
			arg3 -= anInt3303 - arg1;
			arg1 = anInt3303;
		}
		if (arg0 + arg2 > anInt3306) {
			arg2 = anInt3306 - arg0;
		}
		if (arg1 + arg3 > anInt3304) {
			arg3 = anInt3304 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt3305 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt3305;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = anIntArray293[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray293[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIII)V")
	public static void method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt3302 < arg0) {
			anInt3302 = arg0;
		}
		if (anInt3303 < arg1) {
			anInt3303 = arg1;
		}
		if (anInt3306 > arg2) {
			anInt3306 = arg2;
		}
		if (anInt3304 > arg3) {
			anInt3304 = arg3;
		}
		method2606();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "([I)V")
	public static void method2618(@OriginalArg(0) int[] arg0) {
		anInt3302 = arg0[0];
		anInt3303 = arg0[1];
		anInt3306 = arg0[2];
		anInt3304 = arg0[3];
		method2606();
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "()V")
	public static void method2619() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt3305 * anInt3307 - 7;
		while (local1 < local7) {
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
			anIntArray293[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray293[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(IIIII)V")
	public static void method2620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method2615(arg0, arg1, arg2 + 1, arg4);
			} else {
				method2615(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt3302) {
					arg1 += local96 * (anInt3302 - arg0);
					arg0 = anInt3302;
				}
				if (arg2 >= anInt3306) {
					arg2 = anInt3306 - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= anInt3303 && local127 < anInt3304) {
						anIntArray293[arg0 + local127 * anInt3305] = arg4;
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
				if (arg1 < anInt3303) {
					arg0 += local96 * (anInt3303 - arg1);
					arg1 = anInt3303;
				}
				if (arg3 >= anInt3304) {
					arg3 = anInt3304 - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= anInt3302 && local127 < anInt3306) {
						anIntArray293[local127 + arg1 * anInt3305] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method2608(arg0, arg1, arg3 + 1, arg4);
		} else {
			method2608(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
	private static void method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= anInt3302 && arg1 >= anInt3303 && arg0 < anInt3306 && arg1 < anInt3304) {
			anIntArray293[arg0 + arg1 * anInt3305] = 16776960;
		}
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIII)V")
	public static void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt3305) {
			arg2 = anInt3305;
		}
		if (arg3 > anInt3307) {
			arg3 = anInt3307;
		}
		anInt3302 = arg0;
		anInt3303 = arg1;
		anInt3306 = arg2;
		anInt3304 = arg3;
		method2606();
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([III)V")
	public static void method2623(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray293 = arg0;
		anInt3305 = arg1;
		anInt3307 = arg2;
		method2622(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(IIIII)V")
	private static void method2624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3302 || arg0 >= anInt3306) {
			return;
		}
		if (arg1 < anInt3303) {
			arg2 -= anInt3303 - arg1;
			arg1 = anInt3303;
		}
		if (arg1 + arg2 > anInt3304) {
			arg2 = anInt3304 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt3305;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray293[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray293[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray293[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray293[local58] = local113;
			local58 += anInt3305;
		}
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(IIIII)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 == 0) {
			return;
		}
		if (arg3 == 256) {
			method2610(arg0, arg1, arg2);
			return;
		}
		@Pc(20) int local20 = 256 - arg3;
		@Pc(28) int local28 = arg3 * 255;
		@Pc(36) int local36 = arg3 * 255;
		@Pc(42) int local42 = arg3 * 0;
		@Pc(46) int local46 = arg1 - arg2;
		if (local46 < anInt3303) {
			local46 = anInt3303;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > anInt3304) {
			local57 = anInt3304;
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
			if (local116 < anInt3302) {
				local116 = anInt3302;
			}
			local125 = arg0 + local70;
			if (local125 > anInt3306) {
				local125 = anInt3306;
			}
			local136 = local116 + local64 * anInt3305;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (anIntArray293[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray293[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray293[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray293[local136++] = local191;
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
			if (local116 < anInt3302) {
				local116 = anInt3302;
			}
			local125 = arg0 + local70;
			if (local125 > anInt3306 - 1) {
				local125 = anInt3306 - 1;
			}
			local136 = local116 + local64 * anInt3305;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (anIntArray293[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray293[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray293[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray293[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "()V")
	public static void method2626() {
		anIntArray293 = null;
		anIntArray294 = null;
		anIntArray295 = null;
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(IIIII)V")
	public static void method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt3302) {
			arg2 -= anInt3302 - arg0;
			arg0 = anInt3302;
		}
		if (arg1 < anInt3303) {
			arg3 -= anInt3303 - arg1;
			arg1 = anInt3303;
		}
		if (arg0 + arg2 > anInt3306) {
			arg2 = anInt3306 - arg0;
		}
		if (arg1 + arg3 > anInt3304) {
			arg3 = anInt3304 - arg1;
		}
		@Pc(43) int local43 = anInt3305 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt3305;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				anIntArray293[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([I[I)V")
	public static void method2628(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != anInt3304 - anInt3303 || arg1.length != anInt3304 - anInt3303) {
			throw new IllegalArgumentException();
		}
		anIntArray294 = arg0;
		anIntArray295 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "()V")
	public static void method2629() {
		anInt3302 = 0;
		anInt3303 = 0;
		anInt3306 = anInt3305;
		anInt3304 = anInt3307;
		method2606();
	}
}
