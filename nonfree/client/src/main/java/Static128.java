import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	public static int anInt2749;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	public static int anInt2750 = 0;

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
	public static int anInt2751 = 0;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)V")
	public static void method1931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt2751) {
			arg2 -= anInt2751 - arg0;
			arg0 = anInt2751;
		}
		if (anInt2750 > 0) {
			local1 = anInt2750 * 2849;
			arg3 = 23 - anInt2750;
			arg1 = anInt2750;
		}
		if (arg0 + arg2 > anInt2753) {
			arg2 = anInt2753 - arg0;
		}
		if (arg1 + arg3 > anInt2752) {
			arg3 = anInt2752 - arg1;
		}
		@Pc(57) int local57 = anInt2749 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt2749;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray476[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V")
	public static void method1932(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray476 = arg0;
		anInt2749 = arg1;
		anInt2754 = arg2;
		method1942(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([I)V")
	public static void method1933(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2751;
		arg0[1] = anInt2750;
		arg0[2] = anInt2753;
		arg0[3] = anInt2752;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	private static void method1934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2751 || arg0 >= anInt2753) {
			return;
		}
		if (arg1 < anInt2750) {
			arg2 -= anInt2750 - arg1;
			arg1 = anInt2750;
		}
		if (arg1 + arg2 > anInt2752) {
			arg2 = anInt2752 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2749;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray476[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray476[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray476[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray476[local58] = local111;
			local58 += anInt2749;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIII)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2751) {
			arg2 -= anInt2751 - arg0;
			arg0 = anInt2751;
		}
		if (arg1 < anInt2750) {
			arg3 -= anInt2750 - arg1;
			arg1 = anInt2750;
		}
		if (arg0 + arg2 > anInt2753) {
			arg2 = anInt2753 - arg0;
		}
		if (arg1 + arg3 > anInt2752) {
			arg3 = anInt2752 - arg1;
		}
		@Pc(43) int local43 = anInt2749 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2749;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray476[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "([I)V")
	public static void method1936(@OriginalArg(0) int[] arg0) {
		anInt2751 = arg0[0];
		anInt2750 = arg0[1];
		anInt2753 = arg0[2];
		anInt2752 = arg0[3];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	public static void method1937() {
		anIntArray476 = null;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIIII)V")
	public static void method1938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1944(arg0, arg1, arg2, arg4);
		method1944(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1947(arg0, arg1, arg3, arg4);
		method1947(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(IIIII)V")
	private static void method1939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2750 || arg1 >= anInt2752) {
			return;
		}
		if (arg0 < anInt2751) {
			arg2 -= anInt2751 - arg0;
			arg0 = anInt2751;
		}
		if (arg0 + arg2 > anInt2753) {
			arg2 = anInt2753 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2749;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray476[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray476[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray476[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray476[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(IIIII)V")
	public static void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1944(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1944(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2751) {
					arg1 += local96 * (anInt2751 - arg0);
					arg0 = anInt2751;
				}
				if (arg2 >= anInt2753) {
					arg2 = anInt2753 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2750 && local125 < anInt2752) {
						anIntArray476[arg0 + local125 * anInt2749] = arg4;
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
				if (arg1 < anInt2750) {
					arg0 += local96 * (anInt2750 - arg1);
					arg1 = anInt2750;
				}
				if (arg3 >= anInt2752) {
					arg3 = anInt2752 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2751 && local125 < anInt2753) {
						anIntArray476[local125 + arg1 * anInt2749] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1947(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1947(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIII)V")
	public static void method1941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1939(arg0, arg1, arg2, arg4, arg5);
		method1939(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1934(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1934(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	public static void method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2749) {
			arg2 = anInt2749;
		}
		if (arg3 > anInt2754) {
			arg3 = anInt2754;
		}
		anInt2751 = arg0;
		anInt2750 = arg1;
		anInt2753 = arg2;
		anInt2752 = arg3;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()V")
	public static void method1943() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2749 * anInt2754 - 7;
		while (local1 < local7) {
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
			anIntArray476[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray476[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V")
	public static void method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2750 || arg1 >= anInt2752) {
			return;
		}
		if (arg0 < anInt2751) {
			arg2 -= anInt2751 - arg0;
			arg0 = anInt2751;
		}
		if (arg0 + arg2 > anInt2753) {
			arg2 = anInt2753 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2749;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray476[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIIIII)V")
	public static void method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2751) {
			arg2 -= anInt2751 - arg0;
			arg0 = anInt2751;
		}
		if (arg1 < anInt2750) {
			arg3 -= anInt2750 - arg1;
			arg1 = anInt2750;
		}
		if (arg0 + arg2 > anInt2753) {
			arg2 = anInt2753 - arg0;
		}
		if (arg1 + arg3 > anInt2752) {
			arg3 = anInt2752 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt2749 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt2749;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray476[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray476[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()V")
	public static void method1946() {
		anInt2751 = 0;
		anInt2750 = 0;
		anInt2753 = anInt2749;
		anInt2752 = anInt2754;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIII)V")
	public static void method1947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2751 || arg0 >= anInt2753) {
			return;
		}
		if (arg1 < anInt2750) {
			arg2 -= anInt2750 - arg1;
			arg1 = anInt2750;
		}
		if (arg1 + arg2 > anInt2752) {
			arg2 = anInt2752 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2749;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray476[local32 + local34 * anInt2749] = arg3;
		}
	}
}
