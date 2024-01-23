import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static int anInt826;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public static int anInt829;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
	public static int[] anIntArray62;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public static int anInt824 = 0;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public static int anInt825 = 0;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public static int anInt827 = 0;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method742(arg0, arg1, arg2, arg4, arg5);
		method742(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method746(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method746(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIII)V")
	public static void method728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt828) {
			arg2 -= anInt828 - arg0;
			arg0 = anInt828;
		}
		if (arg1 < anInt824) {
			arg3 -= anInt824 - arg1;
			arg1 = anInt824;
		}
		if (arg0 + arg2 > anInt825) {
			arg2 = anInt825 - arg0;
		}
		if (arg1 + arg3 > anInt827) {
			arg3 = anInt827 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt829 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt829;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(87) int local87 = anIntArray62[local73];
				@Pc(107) int local107 = ((local87 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local87 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray62[local73++] = local59 + local107;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public static void method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method752(arg0, arg1, arg2, arg4);
		method752(arg0, arg1 + arg3 - 1, arg2, arg4);
		method741(arg0, arg1, arg3, arg4);
		method741(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII)V")
	public static void method730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt828) {
			arg2 -= anInt828 - arg0;
			arg0 = anInt828;
		}
		if (arg1 < anInt824) {
			arg3 -= anInt824 - arg1;
			arg1 = anInt824;
		}
		if (arg0 + arg2 > anInt825) {
			arg2 = anInt825 - arg0;
		}
		if (arg1 + arg3 > anInt827) {
			arg3 = anInt827 - arg1;
		}
		@Pc(43) int local43 = anInt829 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt829;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				anIntArray62[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
	public static void method731() {
		anInt828 = 0;
		anInt824 = 0;
		anInt825 = anInt829;
		anInt827 = anInt826;
		method743();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V")
	public static void method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anInt828 < arg0) {
			anInt828 = arg0;
		}
		if (anInt824 < arg1) {
			anInt824 = arg1;
		}
		if (anInt825 > arg2) {
			anInt825 = arg2;
		}
		if (anInt827 > arg3) {
			anInt827 = arg3;
		}
		method743();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIII)V")
	public static void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method752(arg0, arg1, arg2 + 1, arg4);
			} else {
				method752(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt828) {
					arg1 += local96 * (anInt828 - arg0);
					arg0 = anInt828;
				}
				if (arg2 >= anInt825) {
					arg2 = anInt825 - 1;
				}
				while (arg0 <= arg2) {
					local127 = arg1 >> 16;
					if (local127 >= anInt824 && local127 < anInt827) {
						anIntArray62[arg0 + local127 * anInt829] = arg4;
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
				if (arg1 < anInt824) {
					arg0 += local96 * (anInt824 - arg1);
					arg1 = anInt824;
				}
				if (arg3 >= anInt827) {
					arg3 = anInt827 - 1;
				}
				while (arg1 <= arg3) {
					local127 = arg0 >> 16;
					if (local127 >= anInt828 && local127 < anInt825) {
						anIntArray62[local127 + arg1 * anInt829] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method741(arg0, arg1, arg3 + 1, arg4);
		} else {
			method741(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII[I[I)V")
	private static void method734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (anInt827 - anInt824 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg1 >= anInt824 && arg1 < anInt827) {
			@Pc(24) int local24 = anInt828 + arg5[arg1 - anInt824];
			if (arg0 < local24) {
				arg2 -= local24 - arg0;
				arg0 = local24;
			}
			@Pc(49) int local49 = anInt828 + arg5[arg1 - anInt824] + arg6[arg1 - anInt824];
			if (arg0 + arg2 > local49) {
				arg2 = local49 - arg0;
			}
			@Pc(62) int local62 = 256 - arg4;
			@Pc(70) int local70 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(78) int local78 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(84) int local84 = (arg3 & 0xFF) * arg4;
			@Pc(90) int local90 = arg0 + arg1 * anInt829;
			for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
				@Pc(105) int local105 = (anIntArray62[local90] >> 16 & 0xFF) * local62;
				@Pc(115) int local115 = (anIntArray62[local90] >> 8 & 0xFF) * local62;
				@Pc(123) int local123 = (anIntArray62[local90] & 0xFF) * local62;
				@Pc(145) int local145 = (local70 + local105 >> 8 << 16) + (local78 + local115 >> 8 << 8) + (local84 + local123 >> 8);
				anIntArray62[local90++] = local145;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V")
	private static void method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			method747(arg0, arg1, arg3);
			return;
		}
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < anInt824) {
			local15 = anInt824;
		}
		@Pc(26) int local26 = arg1 + arg2 + 1;
		if (local26 > anInt827) {
			local26 = anInt827;
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
			if (local85 < anInt828) {
				local85 = anInt828;
			}
			local94 = arg0 + local39;
			if (local94 > anInt825) {
				local94 = anInt825;
			}
			local105 = local85 + local33 * anInt829;
			for (local107 = local85; local107 < local94; local107++) {
				anIntArray62[local105++] = arg3;
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
			if (local85 < anInt828) {
				local85 = anInt828;
			}
			local94 = arg0 + local39;
			if (local94 > anInt825 - 1) {
				local94 = anInt825 - 1;
			}
			local105 = local85 + local33 * anInt829;
			for (local107 = local85; local107 <= local94; local107++) {
				anIntArray62[local105++] = arg3;
			}
			local33++;
			local51 += local43 + local43;
			local47 += local43++ + local43;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I[I)V")
	public static void method736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0.length != anInt827 - anInt824 || arg1.length != anInt827 - anInt824) {
			throw new IllegalArgumentException();
		}
		anIntArray61 = arg0;
		anIntArray60 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[I[I)V")
	public static void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) int local5 = arg0 + arg1 * anInt829;
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(17) int local17 = local5 + arg2[local7];
			for (@Pc(22) int local22 = -arg3[local7]; local22 < 0; local22++) {
				anIntArray62[local17++] = 0;
			}
			local5 += anInt829;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([III)V")
	public static void method738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray62 = arg0;
		anInt829 = arg1;
		anInt826 = arg2;
		method739(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIII)V")
	public static void method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt829) {
			arg2 = anInt829;
		}
		if (arg3 > anInt826) {
			arg3 = anInt826;
		}
		anInt828 = arg0;
		anInt824 = arg1;
		anInt825 = arg2;
		anInt827 = arg3;
		method743();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII[I[I)V")
	private static void method740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		if (anInt827 - anInt824 != arg5.length) {
			throw new IllegalStateException();
		} else if (arg0 >= anInt828 && arg0 < anInt825) {
			if (arg1 < anInt824) {
				arg2 -= anInt824 - arg1;
				arg1 = anInt824;
			}
			if (arg1 + arg2 > anInt827) {
				arg2 = anInt827 - arg1;
			}
			@Pc(40) int local40 = 256 - arg4;
			@Pc(48) int local48 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(56) int local56 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(62) int local62 = (arg3 & 0xFF) * arg4;
			@Pc(68) int local68 = arg0 + arg1 * anInt829;
			for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
				@Pc(79) int local79 = arg1 + local70 - anInt824;
				if (arg0 - anInt828 >= arg5[local79] && arg0 - anInt828 < arg5[local79] + arg6[local79]) {
					@Pc(107) int local107 = (anIntArray62[local68] >> 16 & 0xFF) * local40;
					@Pc(117) int local117 = (anIntArray62[local68] >> 8 & 0xFF) * local40;
					@Pc(125) int local125 = (anIntArray62[local68] & 0xFF) * local40;
					@Pc(147) int local147 = (local48 + local107 >> 8 << 16) + (local56 + local117 >> 8 << 8) + (local62 + local125 >> 8);
					anIntArray62[local68] = local147;
				}
				local68 += anInt829;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(IIII)V")
	public static void method741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt828 || arg0 >= anInt825) {
			return;
		}
		if (arg1 < anInt824) {
			arg2 -= anInt824 - arg1;
			arg1 = anInt824;
		}
		if (arg1 + arg2 > anInt827) {
			arg2 = anInt827 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt829;
		@Pc(34) int local34 = 0;
		while (local34 < arg2) {
			anIntArray62[local32] = arg3;
			local34++;
			local32 += anInt829;
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(IIIII)V")
	public static void method742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt824 || arg1 >= anInt827) {
			return;
		}
		if (arg0 < anInt828) {
			arg2 -= anInt828 - arg0;
			arg0 = anInt828;
		}
		if (arg0 + arg2 > anInt825) {
			arg2 = anInt825 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt829;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray62[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray62[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray62[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray62[local58++] = local113;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()V")
	public static void method743() {
		anIntArray61 = null;
		anIntArray60 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([I)V")
	public static void method744(@OriginalArg(0) int[] arg0) {
		anInt828 = arg0[0];
		anInt824 = arg0[1];
		anInt825 = arg0[2];
		anInt827 = arg0[3];
		method743();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIIII)V")
	public static void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
		@Pc(85) int local85 = arg0 - Static18.method316();
		@Pc(89) int local89 = arg1 - Static18.method314();
		@Pc(93) int local93 = local85 + local59;
		@Pc(97) int local97 = local85 - local67;
		@Pc(103) int local103 = local85 + local3 - local67;
		@Pc(109) int local109 = local85 + local3 + local59;
		@Pc(113) int local113 = local89 + local73;
		@Pc(117) int local117 = local89 - local81;
		@Pc(123) int local123 = local89 + local7 - local81;
		@Pc(129) int local129 = local89 + local7 + local73;
		Static18.method318(local93, local97, local103);
		Static18.method321(local113, local117, local123, local93, local97, local103, arg4);
		Static18.method318(local93, local103, local109);
		Static18.method321(local113, local123, local129, local93, local103, local109, arg4);
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(IIIII)V")
	private static void method746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt828 || arg0 >= anInt825) {
			return;
		}
		if (arg1 < anInt824) {
			arg2 -= anInt824 - arg1;
			arg1 = anInt824;
		}
		if (arg1 + arg2 > anInt827) {
			arg2 = anInt827 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt829;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(73) int local73 = (anIntArray62[local58] >> 16 & 0xFF) * local30;
			@Pc(83) int local83 = (anIntArray62[local58] >> 8 & 0xFF) * local30;
			@Pc(91) int local91 = (anIntArray62[local58] & 0xFF) * local30;
			@Pc(113) int local113 = (local38 + local73 >> 8 << 16) + (local46 + local83 >> 8 << 8) + (local52 + local91 >> 8);
			anIntArray62[local58] = local113;
			local58 += anInt829;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	private static void method747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= anInt828 && arg1 >= anInt824 && arg0 < anInt825 && arg1 < anInt827) {
			anIntArray62[arg0 + arg1 * anInt829] = arg2;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "([I)V")
	public static void method748(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt828;
		arg0[1] = anInt824;
		arg0[2] = anInt825;
		arg0[3] = anInt827;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(IIIII)V")
	public static void method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == 0) {
			return;
		}
		if (arg4 == 256) {
			method735(arg0, arg1, arg2, arg3);
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
		if (local46 < anInt824) {
			local46 = anInt824;
		}
		@Pc(57) int local57 = arg1 + arg2 + 1;
		if (local57 > anInt827) {
			local57 = anInt827;
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
			if (local116 < anInt828) {
				local116 = anInt828;
			}
			local125 = arg0 + local70;
			if (local125 > anInt825) {
				local125 = anInt825;
			}
			local136 = local116 + local64 * anInt829;
			for (local138 = local116; local138 < local125; local138++) {
				local151 = (anIntArray62[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray62[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray62[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray62[local136++] = local191;
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
			if (local116 < anInt828) {
				local116 = anInt828;
			}
			local125 = arg0 + local70;
			if (local125 > anInt825 - 1) {
				local125 = anInt825 - 1;
			}
			local136 = local116 + local64 * anInt829;
			for (local138 = local116; local138 <= local125; local138++) {
				local151 = (anIntArray62[local136] >> 16 & 0xFF) * local20;
				local161 = (anIntArray62[local136] >> 8 & 0xFF) * local20;
				local169 = (anIntArray62[local136] & 0xFF) * local20;
				local191 = (local28 + local151 >> 8 << 16) + (local36 + local161 >> 8 << 8) + (local42 + local169 >> 8);
				anIntArray62[local136++] = local191;
			}
			local64++;
			local82 += local74 + local74;
			local78 += local74++ + local74;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII[I[I)V")
	public static void method750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7) {
		if (anInt827 - anInt824 != arg6.length) {
			throw new IllegalStateException();
		}
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method734(arg0, arg1, arg2, arg4, arg5, arg6, arg7);
			} else {
				method734(arg0 + arg2 + 1, arg1, -arg2, arg4, arg5, arg6, arg7);
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
				if (arg0 < anInt828) {
					arg1 += local144 * (anInt828 - arg0);
					arg0 = anInt828;
				}
				if (arg2 >= anInt825) {
					arg2 = anInt825 - 1;
				}
				if (!local73) {
					arg2--;
				}
				while (arg0 <= arg2) {
					local185 = arg1 >> 16;
					local189 = local185 - anInt824;
					if (local185 >= anInt824 && local185 < anInt827 && arg0 - anInt828 >= arg6[local189] && arg0 - anInt828 < arg6[local189] + arg7[local189]) {
						local219 = arg0 + local185 * anInt829;
						local229 = (anIntArray62[local219] >> 16 & 0xFF) * local97;
						local239 = (anIntArray62[local219] >> 8 & 0xFF) * local97;
						local247 = (anIntArray62[local219] & 0xFF) * local97;
						local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						anIntArray62[local219] = local269;
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
				if (arg1 < anInt824) {
					arg0 += local144 * (anInt824 - arg1);
					arg1 = anInt824;
				}
				if (arg3 >= anInt827) {
					arg3 = anInt827 - 1;
				}
				if (!local73) {
					arg3--;
				}
				while (arg1 <= arg3) {
					local185 = arg0 >> 16;
					local189 = arg1 - anInt824;
					if (local185 >= anInt828 && local185 < anInt825 && local185 - anInt828 >= arg6[local189] && local185 - anInt828 < arg6[local189] + arg7[local189]) {
						local219 = local185 + arg1 * anInt829;
						local229 = (anIntArray62[local219] >> 16 & 0xFF) * local97;
						local239 = (anIntArray62[local219] >> 8 & 0xFF) * local97;
						local247 = (anIntArray62[local219] & 0xFF) * local97;
						local269 = (local105 + local229 >> 8 << 16) + (local113 + local239 >> 8 << 8) + (local119 + local247 >> 8);
						anIntArray62[local219] = local269;
					}
					arg0 += local144;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method740(arg0, arg1, arg3, arg4, arg5, arg6, arg7);
		} else {
			method740(arg0, arg1 + arg3 + 1, -arg3, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "()V")
	public static void method751() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt829 * anInt826 - 7;
		while (local1 < local7) {
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
			anIntArray62[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray62[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(IIII)V")
	public static void method752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt824 || arg1 >= anInt827) {
			return;
		}
		if (arg0 < anInt828) {
			arg2 -= anInt828 - arg0;
			arg0 = anInt828;
		}
		if (arg0 + arg2 > anInt825) {
			arg2 = anInt825 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt829;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray62[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(IIIIII)V")
	public static void method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method742(arg0, arg1, arg2, arg4, arg5);
			} else {
				method742(arg0 + arg2 + 1, arg1, -arg2, arg4, arg5);
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
				if (arg0 < anInt828) {
					arg1 += local126 * (anInt828 - arg0);
					arg0 = anInt828;
				}
				if (arg2 >= anInt825) {
					arg2 = anInt825 - 1;
				}
				if (!local55) {
					arg2--;
				}
				while (arg0 <= arg2) {
					local167 = arg1 >> 16;
					if (local167 >= anInt824 && local167 < anInt827) {
						local179 = arg0 + local167 * anInt829;
						local189 = (anIntArray62[local179] >> 16 & 0xFF) * local79;
						local199 = (anIntArray62[local179] >> 8 & 0xFF) * local79;
						local207 = (anIntArray62[local179] & 0xFF) * local79;
						local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						anIntArray62[local179] = local229;
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
				if (arg1 < anInt824) {
					arg0 += local126 * (anInt824 - arg1);
					arg1 = anInt824;
				}
				if (arg3 >= anInt827) {
					arg3 = anInt827 - 1;
				}
				if (!local55) {
					arg3--;
				}
				while (arg1 <= arg3) {
					local167 = arg0 >> 16;
					if (local167 >= anInt828 && local167 < anInt825) {
						local179 = local167 + arg1 * anInt829;
						local189 = (anIntArray62[local179] >> 16 & 0xFF) * local79;
						local199 = (anIntArray62[local179] >> 8 & 0xFF) * local79;
						local207 = (anIntArray62[local179] & 0xFF) * local79;
						local229 = (local87 + local189 >> 8 << 16) + (local95 + local199 >> 8 << 8) + (local101 + local207 >> 8);
						anIntArray62[local179] = local229;
					}
					arg0 += local126;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method746(arg0, arg1, arg3, arg4, arg5);
		} else {
			method746(arg0, arg1 + arg3 + 1, -arg3, arg4, arg5);
		}
	}
}
