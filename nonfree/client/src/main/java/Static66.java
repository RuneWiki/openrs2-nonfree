import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "[I")
	public static int[] anIntArray363;

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
	public static int anInt2804;

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	public static int anInt2805;

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "I")
	public static int anInt2802 = 0;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	public static int anInt2803 = 0;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
	public static int anInt2806 = 0;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "I")
	public static int anInt2807 = 0;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	public static void method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2807 || arg0 >= anInt2806) {
			return;
		}
		if (arg1 < anInt2803) {
			arg2 -= anInt2803 - arg1;
			arg1 = anInt2803;
		}
		if (arg1 + arg2 > anInt2802) {
			arg2 = anInt2802 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2804;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray363[local32 + local34 * anInt2804] = arg3;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([III)V")
	public static void method1838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray363 = arg0;
		anInt2804 = arg1;
		anInt2805 = arg2;
		method1847(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIII)V")
	public static void method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2807) {
			arg2 -= anInt2807 - arg0;
			arg0 = anInt2807;
		}
		if (arg1 < anInt2803) {
			arg3 -= anInt2803 - arg1;
			arg1 = anInt2803;
		}
		if (arg0 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg0;
		}
		if (arg1 + arg3 > anInt2802) {
			arg3 = anInt2802 - arg1;
		}
		@Pc(43) int local43 = anInt2804 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2804;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray363[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIII)V")
	public static void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1844(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1844(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2807) {
					arg1 += local96 * (anInt2807 - arg0);
					arg0 = anInt2807;
				}
				if (arg2 >= anInt2806) {
					arg2 = anInt2806 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2803 && local125 < anInt2802) {
						anIntArray363[arg0 + local125 * anInt2804] = arg4;
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
				if (arg1 < anInt2803) {
					arg0 += local96 * (anInt2803 - arg1);
					arg1 = anInt2803;
				}
				if (arg3 >= anInt2802) {
					arg3 = anInt2802 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2807 && local125 < anInt2806) {
						anIntArray363[local125 + arg1 * anInt2804] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1837(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1837(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public static void method1841() {
		anIntArray363 = null;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIII)V")
	public static void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1844(arg0, arg1, arg2, arg4);
		method1844(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1837(arg0, arg1, arg3, arg4);
		method1837(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	public static void method1843() {
		anInt2807 = 0;
		anInt2803 = 0;
		anInt2806 = anInt2804;
		anInt2802 = anInt2805;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V")
	public static void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2803 || arg1 >= anInt2802) {
			return;
		}
		if (arg0 < anInt2807) {
			arg2 -= anInt2807 - arg0;
			arg0 = anInt2807;
		}
		if (arg0 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2804;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray363[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIIII)V")
	private static void method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2803 || arg1 >= anInt2802) {
			return;
		}
		if (arg0 < anInt2807) {
			arg2 -= anInt2807 - arg0;
			arg0 = anInt2807;
		}
		if (arg0 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2804;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray363[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray363[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray363[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray363[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIII)V")
	private static void method1846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2807 || arg0 >= anInt2806) {
			return;
		}
		if (arg1 < anInt2803) {
			arg2 -= anInt2803 - arg1;
			arg1 = anInt2803;
		}
		if (arg1 + arg2 > anInt2802) {
			arg2 = anInt2802 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2804;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray363[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray363[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray363[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray363[local58] = local111;
			local58 += anInt2804;
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIII)V")
	public static void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2804) {
			arg2 = anInt2804;
		}
		if (arg3 > anInt2805) {
			arg3 = anInt2805;
		}
		anInt2807 = arg0;
		anInt2803 = arg1;
		anInt2806 = arg2;
		anInt2802 = arg3;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)V")
	public static void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1845(arg0, arg1, arg2, arg4, arg5);
		method1845(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1846(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1846(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
	public static void method1849(@OriginalArg(0) int[] arg0) {
		anInt2807 = arg0[0];
		anInt2803 = arg0[1];
		anInt2806 = arg0[2];
		anInt2802 = arg0[3];
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	public static void method1850() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2804 * anInt2805 - 7;
		while (local1 < local7) {
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
			anIntArray363[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray363[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "([I)V")
	public static void method1851(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2807;
		arg0[1] = anInt2803;
		arg0[2] = anInt2806;
		arg0[3] = anInt2802;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIII)V")
	public static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2807) {
			arg2 -= anInt2807 - arg0;
			arg0 = anInt2807;
		}
		if (arg1 < anInt2803) {
			arg3 -= anInt2803 - arg1;
			arg1 = anInt2803;
		}
		if (arg0 + arg2 > anInt2806) {
			arg2 = anInt2806 - arg0;
		}
		if (arg1 + arg3 > anInt2802) {
			arg3 = anInt2802 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt2804 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt2804;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray363[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray363[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray363[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray363[local75++] = local132;
			}
			local75 += local69;
		}
	}
}
