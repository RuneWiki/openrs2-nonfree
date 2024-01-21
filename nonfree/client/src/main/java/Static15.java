import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	public static int anInt2152;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	public static int anInt2154;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
	public static int anInt2153 = 0;

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
	public static int anInt2155 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)V")
	public static void method1502(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray326 = arg0;
		anInt2152 = arg1;
		anInt2154 = arg2;
		method1513(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIII)V")
	public static void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2151) {
			arg2 -= anInt2151 - arg0;
			arg0 = anInt2151;
		}
		if (arg1 < anInt2153) {
			arg3 -= anInt2153 - arg1;
			arg1 = anInt2153;
		}
		if (arg0 + arg2 > anInt2155) {
			arg2 = anInt2155 - arg0;
		}
		if (arg1 + arg3 > anInt2150) {
			arg3 = anInt2150 - arg1;
		}
		@Pc(43) int local43 = anInt2152 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2152;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray326[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIII)V")
	public static void method1504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1506(arg0, arg1, arg2, arg4);
		method1506(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1517(arg0, arg1, arg3, arg4);
		method1517(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public static void method1505() {
		anInt2151 = 0;
		anInt2153 = 0;
		anInt2155 = anInt2152;
		anInt2150 = anInt2154;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
	public static void method1506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2153 || arg1 >= anInt2150) {
			return;
		}
		if (arg0 < anInt2151) {
			arg2 -= anInt2151 - arg0;
			arg0 = anInt2151;
		}
		if (arg0 + arg2 > anInt2155) {
			arg2 = anInt2155 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2152;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray326[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([I)V")
	public static void method1507(@OriginalArg(0) int[] arg0) {
		anInt2151 = arg0[0];
		anInt2153 = arg0[1];
		anInt2155 = arg0[2];
		anInt2150 = arg0[3];
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	public static void method1508() {
		anIntArray326 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
	public static void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		if (arg0 < anInt2151) {
			arg2 -= anInt2151 - arg0;
			arg0 = anInt2151;
		}
		if (anInt2153 > 0) {
			local1 = anInt2153 * 2849;
			arg3 = 23 - anInt2153;
			arg1 = anInt2153;
		}
		if (arg0 + arg2 > anInt2155) {
			arg2 = anInt2155 - arg0;
		}
		if (arg1 + arg3 > anInt2150) {
			arg3 = anInt2150 - arg1;
		}
		@Pc(57) int local57 = anInt2152 - arg2;
		@Pc(63) int local63 = arg0 + arg1 * anInt2152;
		for (@Pc(66) int local66 = -arg3; local66 < 0; local66++) {
			@Pc(73) int local73 = 65536 - local1 >> 8;
			@Pc(77) int local77 = local1 >> 8;
			@Pc(107) int local107 = ((arg4 & 0xFF00FF) * local73 + (arg5 & 0xFF00FF) * local77 & 0xFF00FF00) + ((arg4 & 0xFF00) * local73 + (arg5 & 0xFF00) * local77 & 0xFF0000) >> 8;
			for (@Pc(110) int local110 = -arg2; local110 < 0; local110++) {
				anIntArray326[local63++] = local107;
			}
			local63 += local57;
			local1 += 2849;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()V")
	public static void method1510() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2152 * anInt2154 - 7;
		while (local1 < local7) {
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
			anIntArray326[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray326[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(IIIII)V")
	private static void method1511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2153 || arg1 >= anInt2150) {
			return;
		}
		if (arg0 < anInt2151) {
			arg2 -= anInt2151 - arg0;
			arg0 = anInt2151;
		}
		if (arg0 + arg2 > anInt2155) {
			arg2 = anInt2155 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2152;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray326[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray326[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray326[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray326[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIIIII)V")
	public static void method1512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1511(arg0, arg1, arg2, arg4, arg5);
		method1511(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1518(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1518(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(IIII)V")
	public static void method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2152) {
			arg2 = anInt2152;
		}
		if (arg3 > anInt2154) {
			arg3 = anInt2154;
		}
		anInt2151 = arg0;
		anInt2153 = arg1;
		anInt2155 = arg2;
		anInt2150 = arg3;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(IIIII)V")
	public static void method1514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1506(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1506(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2151) {
					arg1 += local96 * (anInt2151 - arg0);
					arg0 = anInt2151;
				}
				if (arg2 >= anInt2155) {
					arg2 = anInt2155 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2153 && local125 < anInt2150) {
						anIntArray326[arg0 + local125 * anInt2152] = arg4;
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
				if (arg1 < anInt2153) {
					arg0 += local96 * (anInt2153 - arg1);
					arg1 = anInt2153;
				}
				if (arg3 >= anInt2150) {
					arg3 = anInt2150 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2151 && local125 < anInt2155) {
						anIntArray326[local125 + arg1 * anInt2152] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1517(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1517(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "([I)V")
	public static void method1515(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2151;
		arg0[1] = anInt2153;
		arg0[2] = anInt2155;
		arg0[3] = anInt2150;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIIIII)V")
	public static void method1516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2151) {
			arg2 -= anInt2151 - arg0;
			arg0 = anInt2151;
		}
		if (arg1 < anInt2153) {
			arg3 -= anInt2153 - arg1;
			arg1 = anInt2153;
		}
		if (arg0 + arg2 > anInt2155) {
			arg2 = anInt2155 - arg0;
		}
		if (arg1 + arg3 > anInt2150) {
			arg3 = anInt2150 - arg1;
		}
		@Pc(59) int local59 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
		@Pc(63) int local63 = 256 - arg5;
		@Pc(67) int local67 = anInt2152 - arg2;
		@Pc(73) int local73 = arg0 + arg1 * anInt2152;
		for (@Pc(75) int local75 = 0; local75 < arg3; local75++) {
			for (@Pc(79) int local79 = -arg2; local79 < 0; local79++) {
				@Pc(84) int local84 = anIntArray326[local73];
				@Pc(104) int local104 = ((local84 & 0xFF00FF) * local63 >> 8 & 0xFF00FF) + ((local84 & 0xFF00) * local63 >> 8 & 0xFF00);
				anIntArray326[local73++] = local59 + local104;
			}
			local73 += local67;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(IIII)V")
	public static void method1517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2151 || arg0 >= anInt2155) {
			return;
		}
		if (arg1 < anInt2153) {
			arg2 -= anInt2153 - arg1;
			arg1 = anInt2153;
		}
		if (arg1 + arg2 > anInt2150) {
			arg2 = anInt2150 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2152;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray326[local32 + local34 * anInt2152] = arg3;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(IIIII)V")
	private static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2151 || arg0 >= anInt2155) {
			return;
		}
		if (arg1 < anInt2153) {
			arg2 -= anInt2153 - arg1;
			arg1 = anInt2153;
		}
		if (arg1 + arg2 > anInt2150) {
			arg2 = anInt2150 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2152;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray326[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray326[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray326[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray326[local58] = local111;
			local58 += anInt2152;
		}
	}
}
