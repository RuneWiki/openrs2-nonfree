import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!w", name = "U", descriptor = "I")
	public static int anInt2722;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "I")
	public static int anInt2725;

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "[I")
	public static int[] anIntArray414;

	@OriginalMember(owner = "client!w", name = "S", descriptor = "I")
	public static int anInt2720 = 0;

	@OriginalMember(owner = "client!w", name = "T", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!w", name = "V", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!w", name = "W", descriptor = "I")
	public static int anInt2724 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V")
	private static void method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2721 || arg0 >= anInt2723) {
			return;
		}
		if (arg1 < anInt2724) {
			arg2 -= anInt2724 - arg1;
			arg1 = anInt2724;
		}
		if (arg1 + arg2 > anInt2720) {
			arg2 = anInt2720 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2722;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray414[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray414[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray414[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray414[local58] = local111;
			local58 += anInt2722;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIII)V")
	public static void method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2721) {
			arg2 -= anInt2721 - arg0;
			arg0 = anInt2721;
		}
		if (arg1 < anInt2724) {
			arg3 -= anInt2724 - arg1;
			arg1 = anInt2724;
		}
		if (arg0 + arg2 > anInt2723) {
			arg2 = anInt2723 - arg0;
		}
		if (arg1 + arg3 > anInt2720) {
			arg3 = anInt2720 - arg1;
		}
		@Pc(43) int local43 = anInt2722 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2722;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray414[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([III)V")
	public static void method1859(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray414 = arg0;
		anInt2722 = arg1;
		anInt2725 = arg2;
		method1869(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
	public static void method1860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2721 || arg0 >= anInt2723) {
			return;
		}
		if (arg1 < anInt2724) {
			arg2 -= anInt2724 - arg1;
			arg1 = anInt2724;
		}
		if (arg1 + arg2 > anInt2720) {
			arg2 = anInt2720 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2722;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray414[local32 + local34 * anInt2722] = arg3;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([I)V")
	public static void method1861(@OriginalArg(0) int[] arg0) {
		arg0[0] = anInt2721;
		arg0[1] = anInt2724;
		arg0[2] = anInt2723;
		arg0[3] = anInt2720;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	public static void method1862() {
		anInt2721 = 0;
		anInt2724 = 0;
		anInt2723 = anInt2722;
		anInt2720 = anInt2725;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	public static void method1863() {
		anIntArray414 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIII)V")
	public static void method1864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2724 || arg1 >= anInt2720) {
			return;
		}
		if (arg0 < anInt2721) {
			arg2 -= anInt2721 - arg0;
			arg0 = anInt2721;
		}
		if (arg0 + arg2 > anInt2723) {
			arg2 = anInt2723 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2722;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray414[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	public static void method1865() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2722 * anInt2725 - 7;
		while (local1 < local7) {
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
			anIntArray414[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray414[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIIII)V")
	public static void method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				method1864(arg0, arg1, arg2 + 1, arg4);
			} else {
				method1864(arg0 + arg2, arg1, 1 - arg2, arg4);
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
				if (arg0 < anInt2721) {
					arg1 += local96 * (anInt2721 - arg0);
					arg0 = anInt2721;
				}
				if (arg2 >= anInt2723) {
					arg2 = anInt2723 - 1;
				}
				while (arg0 <= arg2) {
					local125 = arg1 >> 16;
					if (local125 >= anInt2724 && local125 < anInt2720) {
						anIntArray414[arg0 + local125 * anInt2722] = arg4;
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
				if (arg1 < anInt2724) {
					arg0 += local96 * (anInt2724 - arg1);
					arg1 = anInt2724;
				}
				if (arg3 >= anInt2720) {
					arg3 = anInt2720 - 1;
				}
				while (arg1 <= arg3) {
					local125 = arg0 >> 16;
					if (local125 >= anInt2721 && local125 < anInt2723) {
						anIntArray414[local125 + arg1 * anInt2722] = arg4;
					}
					arg0 += local96;
					arg1++;
				}
			}
		} else if (arg3 >= 0) {
			method1860(arg0, arg1, arg3 + 1, arg4);
		} else {
			method1860(arg0, arg1 + arg3, -arg3 + 1, arg4);
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(IIIII)V")
	public static void method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1864(arg0, arg1, arg2, arg4);
		method1864(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1860(arg0, arg1, arg3, arg4);
		method1860(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(IIIII)V")
	private static void method1868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2724 || arg1 >= anInt2720) {
			return;
		}
		if (arg0 < anInt2721) {
			arg2 -= anInt2721 - arg0;
			arg0 = anInt2721;
		}
		if (arg0 + arg2 > anInt2723) {
			arg2 = anInt2723 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2722;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray414[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray414[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray414[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray414[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(IIII)V")
	public static void method1869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2722) {
			arg2 = anInt2722;
		}
		if (arg3 > anInt2725) {
			arg3 = anInt2725;
		}
		anInt2721 = arg0;
		anInt2724 = arg1;
		anInt2723 = arg2;
		anInt2720 = arg3;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "([I)V")
	public static void method1870(@OriginalArg(0) int[] arg0) {
		anInt2721 = arg0[0];
		anInt2724 = arg0[1];
		anInt2723 = arg0[2];
		anInt2720 = arg0[3];
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public static void method1871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2721) {
			arg2 -= anInt2721 - arg0;
			arg0 = anInt2721;
		}
		if (arg1 < anInt2724) {
			arg3 -= anInt2724 - arg1;
			arg1 = anInt2724;
		}
		if (arg0 + arg2 > anInt2723) {
			arg2 = anInt2723 - arg0;
		}
		if (arg1 + arg3 > anInt2720) {
			arg3 = anInt2720 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt2722 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt2722;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray414[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray414[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray414[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray414[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(IIIIII)V")
	public static void method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1868(arg0, arg1, arg2, arg4, arg5);
		method1868(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1857(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1857(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}
}
