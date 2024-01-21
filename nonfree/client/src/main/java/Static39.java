import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_596 = Static33.method650("bla");

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_597 = Static33.method650("dbl");

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_598 = Static33.method650("gr1");

	@OriginalMember(owner = "client!gb", name = "hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_599 = Static33.method650("yel");

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_600 = Static33.method650("lre");

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_601 = Static33.method650("mag");

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_602 = Static33.method650("str");

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_603 = Static33.method650("or2");

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lclient!oa;")
	public static Class56 aClass56_604 = Static33.method650("or1");

	@OriginalMember(owner = "client!gb", name = "pb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_605 = Static33.method650("gr3");

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_606 = Static33.method650("gr2");

	@OriginalMember(owner = "client!gb", name = "rb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_607 = Static33.method650("dre");

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_608 = Static33.method650("red");

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "Lclient!oa;")
	public static Class56 aClass56_609 = Static33.method650("gre");

	@OriginalMember(owner = "client!gb", name = "wb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_610 = Static33.method650("blu");

	@OriginalMember(owner = "client!gb", name = "xb", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array3 = new Class56[100];

	@OriginalMember(owner = "client!gb", name = "yb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_611 = Static33.method650("cya");

	@OriginalMember(owner = "client!gb", name = "zb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_612 = Static33.method650("whi");

	@OriginalMember(owner = "client!gb", name = "Ab", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "Lclient!oa;")
	public static Class56 aClass56_613 = Static33.method650("or3");

	@OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_614 = Static33.method650("@str@");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIIIIII)V")
	public static void method726(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt2244;
		@Pc(9) int local9 = Static6.anInt2244 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static6.anInt2241) {
			local20 = Static6.anInt2241 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt2241;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt2244;
		}
		if (arg2 + arg4 > Static6.anInt2246) {
			arg4 -= arg2 + arg4 - Static6.anInt2246;
		}
		if (arg1 < Static6.anInt2243) {
			local20 = Static6.anInt2243 - arg1;
			arg3 -= local20;
			arg1 = Static6.anInt2243;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static6.anInt2242) {
			local20 = arg1 + arg3 - Static6.anInt2242;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method747(Static6.anIntArray189, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method727(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
	public static void method732(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt2244;
		@Pc(9) int local9 = Static6.anInt2244 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static6.anInt2241) {
			local20 = Static6.anInt2241 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt2241;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt2244;
		}
		if (arg2 + arg4 > Static6.anInt2246) {
			arg4 -= arg2 + arg4 - Static6.anInt2246;
		}
		if (arg1 < Static6.anInt2243) {
			local20 = Static6.anInt2243 - arg1;
			arg3 -= local20;
			arg1 = Static6.anInt2243;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static6.anInt2242) {
			local20 = arg1 + arg3 - Static6.anInt2242;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method727(Static6.anIntArray189, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
	public static void method744() {
		aClass56_602 = null;
		aClass56_614 = null;
		aClass56_608 = null;
		aClass56_609 = null;
		aClass56_610 = null;
		aClass56_599 = null;
		aClass56_611 = null;
		aClass56_601 = null;
		aClass56_612 = null;
		aClass56_596 = null;
		aClass56_600 = null;
		aClass56_607 = null;
		aClass56_597 = null;
		aClass56_604 = null;
		aClass56_603 = null;
		aClass56_613 = null;
		aClass56_598 = null;
		aClass56_606 = null;
		aClass56_605 = null;
		aClass56Array3 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method747(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
