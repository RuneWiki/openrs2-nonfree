import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_550 = Static69.method1153("dre");

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_551 = Static69.method1153("or2");

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_552 = Static69.method1153("gr3");

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_553 = Static69.method1153("blu");

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_554 = Static69.method1153("@str@");

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_555 = Static69.method1153("str");

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_556 = Static69.method1153("red");

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_557 = Static69.method1153("bla");

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_558 = Static69.method1153("dbl");

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_559 = Static69.method1153("yel");

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "Lclient!rd;")
	public static Class64 aClass64_560 = Static69.method1153("gre");

	@OriginalMember(owner = "client!gb", name = "wb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_561 = Static69.method1153("lre");

	@OriginalMember(owner = "client!gb", name = "xb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_562 = Static69.method1153("or3");

	@OriginalMember(owner = "client!gb", name = "yb", descriptor = "[Lclient!rd;")
	public static Class64[] aClass64Array9 = new Class64[100];

	@OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Lclient!rd;")
	public static Class64 aClass64_563 = Static69.method1153("or1");

	@OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_564 = Static69.method1153("cya");

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_565 = Static69.method1153("gr1");

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "Lclient!rd;")
	public static Class64 aClass64_566 = Static69.method1153("gr2");

	@OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_567 = Static69.method1153("whi");

	@OriginalMember(owner = "client!gb", name = "Ib", descriptor = "Lclient!rd;")
	public static Class64 aClass64_568 = Static69.method1153("mag");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method649(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method650(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIII)V")
	public static void method651(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static47.anInt2713;
		@Pc(9) int local9 = Static47.anInt2713 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static47.anInt2710) {
			local20 = Static47.anInt2710 - arg2;
			arg4 -= local20;
			arg2 = Static47.anInt2710;
			local13 = local20 * arg3;
			local5 += local20 * Static47.anInt2713;
		}
		if (arg2 + arg4 > Static47.anInt2711) {
			arg4 -= arg2 + arg4 - Static47.anInt2711;
		}
		if (arg1 < Static47.anInt2709) {
			local20 = Static47.anInt2709 - arg1;
			arg3 -= local20;
			arg1 = Static47.anInt2709;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static47.anInt2708) {
			local20 = arg1 + arg3 - Static47.anInt2708;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method650(Static47.anIntArray424, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIIII)V")
	public static void method657(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static47.anInt2713;
		@Pc(9) int local9 = Static47.anInt2713 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static47.anInt2710) {
			local20 = Static47.anInt2710 - arg2;
			arg4 -= local20;
			arg2 = Static47.anInt2710;
			local13 = local20 * arg3;
			local5 += local20 * Static47.anInt2713;
		}
		if (arg2 + arg4 > Static47.anInt2711) {
			arg4 -= arg2 + arg4 - Static47.anInt2711;
		}
		if (arg1 < Static47.anInt2709) {
			local20 = Static47.anInt2709 - arg1;
			arg3 -= local20;
			arg1 = Static47.anInt2709;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static47.anInt2708) {
			local20 = arg1 + arg3 - Static47.anInt2708;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method649(Static47.anIntArray424, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
	public static void method664() {
		aClass64_555 = null;
		aClass64_554 = null;
		aClass64_556 = null;
		aClass64_560 = null;
		aClass64_553 = null;
		aClass64_559 = null;
		aClass64_564 = null;
		aClass64_568 = null;
		aClass64_567 = null;
		aClass64_557 = null;
		aClass64_561 = null;
		aClass64_550 = null;
		aClass64_558 = null;
		aClass64_563 = null;
		aClass64_551 = null;
		aClass64_562 = null;
		aClass64_565 = null;
		aClass64_566 = null;
		aClass64_552 = null;
		aClass64Array9 = null;
	}
}
