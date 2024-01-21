import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_366 = Static80.method1463("blu");

	@OriginalMember(owner = "client!cd", name = "hb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_367 = Static80.method1463("gre");

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lclient!rd;")
	public static Class63 aClass63_368 = Static80.method1463("yel");

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_369 = Static80.method1463("lre");

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_370 = Static80.method1463("or1");

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_371 = Static80.method1463("or3");

	@OriginalMember(owner = "client!cd", name = "nb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_372 = Static80.method1463("red");

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "Lclient!rd;")
	public static Class63 aClass63_373 = Static80.method1463("gr1");

	@OriginalMember(owner = "client!cd", name = "pb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_374 = Static80.method1463("dbl");

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_375 = Static80.method1463("bla");

	@OriginalMember(owner = "client!cd", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_376 = Static80.method1463("or2");

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lclient!rd;")
	public static Class63 aClass63_377 = Static80.method1463("whi");

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array4 = new Class63[100];

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_378 = Static80.method1463("@str@");

	@OriginalMember(owner = "client!cd", name = "zb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_379 = Static80.method1463("str");

	@OriginalMember(owner = "client!cd", name = "Bb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_380 = Static80.method1463("cya");

	@OriginalMember(owner = "client!cd", name = "Cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_381 = Static80.method1463("gr2");

	@OriginalMember(owner = "client!cd", name = "Db", descriptor = "Lclient!rd;")
	public static Class63 aClass63_382 = Static80.method1463("gr3");

	@OriginalMember(owner = "client!cd", name = "Eb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_383 = Static80.method1463("dre");

	@OriginalMember(owner = "client!cd", name = "Gb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_384 = Static80.method1463("mag");

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
	public static void method447() {
		aClass63_379 = null;
		aClass63_378 = null;
		aClass63_372 = null;
		aClass63_367 = null;
		aClass63_366 = null;
		aClass63_368 = null;
		aClass63_380 = null;
		aClass63_384 = null;
		aClass63_377 = null;
		aClass63_375 = null;
		aClass63_369 = null;
		aClass63_383 = null;
		aClass63_374 = null;
		aClass63_370 = null;
		aClass63_376 = null;
		aClass63_371 = null;
		aClass63_373 = null;
		aClass63_381 = null;
		aClass63_382 = null;
		aClass63Array4 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIIII)V")
	public static void method448(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static121.anInt2988;
		@Pc(9) int local9 = Static121.anInt2988 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static121.anInt2989) {
			local20 = Static121.anInt2989 - arg2;
			arg4 -= local20;
			arg2 = Static121.anInt2989;
			local13 = local20 * arg3;
			local5 += local20 * Static121.anInt2988;
		}
		if (arg2 + arg4 > Static121.anInt2987) {
			arg4 -= arg2 + arg4 - Static121.anInt2987;
		}
		if (arg1 < Static121.anInt2986) {
			local20 = Static121.anInt2986 - arg1;
			arg3 -= local20;
			arg1 = Static121.anInt2986;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static121.anInt2985) {
			local20 = arg1 + arg3 - Static121.anInt2985;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method461(Static121.anIntArray338, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method449(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BIIIIII)V")
	public static void method453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static121.anInt2988;
		@Pc(9) int local9 = Static121.anInt2988 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static121.anInt2989) {
			local20 = Static121.anInt2989 - arg2;
			arg4 -= local20;
			arg2 = Static121.anInt2989;
			local13 = local20 * arg3;
			local5 += local20 * Static121.anInt2988;
		}
		if (arg2 + arg4 > Static121.anInt2987) {
			arg4 -= arg2 + arg4 - Static121.anInt2987;
		}
		if (arg1 < Static121.anInt2986) {
			local20 = Static121.anInt2986 - arg1;
			arg3 -= local20;
			arg1 = Static121.anInt2986;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static121.anInt2985) {
			local20 = arg1 + arg3 - Static121.anInt2985;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method449(Static121.anIntArray338, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method461(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
}
