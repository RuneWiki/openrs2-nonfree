import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
	public static int anInt2925;

	@OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
	public static int anInt2930;

	@OriginalMember(owner = "client!ia", name = "eb", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public static int anInt2926 = 0;

	@OriginalMember(owner = "client!ia", name = "ab", descriptor = "I")
	public static int anInt2927 = 0;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
	public static int anInt2928 = 0;

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
	public static int anInt2929 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIII)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1813(arg0, arg1, arg2, arg4);
		method1813(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1809(arg0, arg1, arg3, arg4);
		method1809(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	public static void method1807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt2925) {
			arg2 = anInt2925;
		}
		if (arg3 > anInt2930) {
			arg3 = anInt2930;
		}
		anInt2927 = arg0;
		anInt2926 = arg1;
		anInt2928 = arg2;
		anInt2929 = arg3;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	public static void method1808() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt2925 * anInt2930 - 7;
		while (local1 < local7) {
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
			anIntArray417[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray417[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIII)V")
	public static void method1809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt2927 || arg0 >= anInt2928) {
			return;
		}
		if (arg1 < anInt2926) {
			arg2 -= anInt2926 - arg1;
			arg1 = anInt2926;
		}
		if (arg1 + arg2 > anInt2929) {
			arg2 = anInt2929 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2925;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray417[local32 + local34 * anInt2925] = arg3;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V")
	public static void method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt2927) {
			arg2 -= anInt2927 - arg0;
			arg0 = anInt2927;
		}
		if (arg1 < anInt2926) {
			arg3 -= anInt2926 - arg1;
			arg1 = anInt2926;
		}
		if (arg0 + arg2 > anInt2928) {
			arg2 = anInt2928 - arg0;
		}
		if (arg1 + arg3 > anInt2929) {
			arg3 = anInt2929 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt2925 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt2925;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray417[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray417[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray417[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray417[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIII)V")
	private static void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2927 || arg0 >= anInt2928) {
			return;
		}
		if (arg1 < anInt2926) {
			arg2 -= anInt2926 - arg1;
			arg1 = anInt2926;
		}
		if (arg1 + arg2 > anInt2929) {
			arg2 = anInt2929 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2925;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray417[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray417[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray417[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray417[local58] = local111;
			local58 += anInt2925;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
	public static void method1812() {
		anInt2927 = 0;
		anInt2926 = 0;
		anInt2928 = anInt2925;
		anInt2929 = anInt2930;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(IIII)V")
	public static void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt2926 || arg1 >= anInt2929) {
			return;
		}
		if (arg0 < anInt2927) {
			arg2 -= anInt2927 - arg0;
			arg0 = anInt2927;
		}
		if (arg0 + arg2 > anInt2928) {
			arg2 = anInt2928 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt2925;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray417[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(IIIII)V")
	private static void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt2926 || arg1 >= anInt2929) {
			return;
		}
		if (arg0 < anInt2927) {
			arg2 -= anInt2927 - arg0;
			arg0 = anInt2927;
		}
		if (arg0 + arg2 > anInt2928) {
			arg2 = anInt2928 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt2925;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray417[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray417[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray417[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray417[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "(IIIII)V")
	public static void method1815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt2927) {
			arg2 -= anInt2927 - arg0;
			arg0 = anInt2927;
		}
		if (arg1 < anInt2926) {
			arg3 -= anInt2926 - arg1;
			arg1 = anInt2926;
		}
		if (arg0 + arg2 > anInt2928) {
			arg2 = anInt2928 - arg0;
		}
		if (arg1 + arg3 > anInt2929) {
			arg3 = anInt2929 - arg1;
		}
		@Pc(43) int local43 = anInt2925 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt2925;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray417[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "()V")
	public static void method1816() {
		anIntArray417 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([III)V")
	public static void method1817(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray417 = arg0;
		anInt2925 = arg1;
		anInt2930 = arg2;
		method1807(0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIIII)V")
	public static void method1818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1814(arg0, arg1, arg2, arg4, arg5);
		method1814(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1811(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1811(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}
}
