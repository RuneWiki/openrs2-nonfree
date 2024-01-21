import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_356 = Static72.method1077("gre");

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_357 = Static72.method1077("or3");

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_358 = Static72.method1077("whi");

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_359 = Static72.method1077("gr2");

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Lclient!u;")
	public static Class74 aClass74_360 = Static72.method1077("or1");

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "Lclient!u;")
	public static Class74 aClass74_361 = Static72.method1077("gr3");

	@OriginalMember(owner = "client!cc", name = "nb", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!cc", name = "ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_362 = Static72.method1077("cya");

	@OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_363 = Static72.method1077("mag");

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "Lclient!u;")
	public static Class74 aClass74_364 = Static72.method1077("blu");

	@OriginalMember(owner = "client!cc", name = "ub", descriptor = "Lclient!u;")
	public static Class74 aClass74_365 = Static72.method1077("dbl");

	@OriginalMember(owner = "client!cc", name = "vb", descriptor = "Lclient!u;")
	public static Class74 aClass74_366 = Static72.method1077("str");

	@OriginalMember(owner = "client!cc", name = "wb", descriptor = "Lclient!u;")
	public static Class74 aClass74_367 = Static72.method1077("or2");

	@OriginalMember(owner = "client!cc", name = "xb", descriptor = "Lclient!u;")
	public static Class74 aClass74_368 = Static72.method1077("gr1");

	@OriginalMember(owner = "client!cc", name = "yb", descriptor = "Lclient!u;")
	public static Class74 aClass74_369 = Static72.method1077("yel");

	@OriginalMember(owner = "client!cc", name = "zb", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array1 = new Class74[100];

	@OriginalMember(owner = "client!cc", name = "Ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_370 = Static72.method1077("bla");

	@OriginalMember(owner = "client!cc", name = "Bb", descriptor = "Lclient!u;")
	public static Class74 aClass74_371 = Static72.method1077("lre");

	@OriginalMember(owner = "client!cc", name = "Cb", descriptor = "Lclient!u;")
	public static Class74 aClass74_372 = Static72.method1077("@str@");

	@OriginalMember(owner = "client!cc", name = "Eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_373 = Static72.method1077("red");

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_374 = Static72.method1077("dre");

	@OriginalMember(owner = "client!cc", name = "Ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_375 = Static72.method1077("dma");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method305(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIII)V")
	public static void method309(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static58.anInt1010;
		@Pc(9) int local9 = Static58.anInt1010 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static58.anInt1013) {
			local20 = Static58.anInt1013 - arg2;
			arg4 -= local20;
			arg2 = Static58.anInt1013;
			local13 = local20 * arg3;
			local5 += local20 * Static58.anInt1010;
		}
		if (arg2 + arg4 > Static58.anInt1012) {
			arg4 -= arg2 + arg4 - Static58.anInt1012;
		}
		if (arg1 < Static58.anInt1009) {
			local20 = Static58.anInt1009 - arg1;
			arg3 -= local20;
			arg1 = Static58.anInt1009;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static58.anInt1011) {
			local20 = arg1 + arg3 - Static58.anInt1011;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method305(Static58.anIntArray117, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIIIII)V")
	public static void method315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static58.anInt1010;
		@Pc(9) int local9 = Static58.anInt1010 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static58.anInt1013) {
			local20 = Static58.anInt1013 - arg2;
			arg4 -= local20;
			arg2 = Static58.anInt1013;
			local13 = local20 * arg3;
			local5 += local20 * Static58.anInt1010;
		}
		if (arg2 + arg4 > Static58.anInt1012) {
			arg4 -= arg2 + arg4 - Static58.anInt1012;
		}
		if (arg1 < Static58.anInt1009) {
			local20 = Static58.anInt1009 - arg1;
			arg3 -= local20;
			arg1 = Static58.anInt1009;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static58.anInt1011) {
			local20 = arg1 + arg3 - Static58.anInt1011;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method325(Static58.anIntArray117, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	public static void method321() {
		aClass74_366 = null;
		aClass74_372 = null;
		aClass74_373 = null;
		aClass74_356 = null;
		aClass74_364 = null;
		aClass74_369 = null;
		aClass74_362 = null;
		aClass74_363 = null;
		aClass74_358 = null;
		aClass74_370 = null;
		aClass74_374 = null;
		aClass74_365 = null;
		aClass74_375 = null;
		aClass74_371 = null;
		aClass74_360 = null;
		aClass74_367 = null;
		aClass74_357 = null;
		aClass74_368 = null;
		aClass74_359 = null;
		aClass74_361 = null;
		aClass74Array1 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method325(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}
}
