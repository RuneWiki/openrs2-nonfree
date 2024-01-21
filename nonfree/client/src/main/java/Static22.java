import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_345 = Static63.method1251("whi");

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_346 = Static63.method1251("red");

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_347 = Static63.method1251("bla");

	@OriginalMember(owner = "client!df", name = "db", descriptor = "Lclient!mb;")
	public static Class45 aClass45_348 = Static63.method1251("lre");

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "[Lclient!mb;")
	public static Class45[] aClass45Array8 = new Class45[100];

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_349 = Static63.method1251("or1");

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_350 = Static63.method1251("dbl");

	@OriginalMember(owner = "client!df", name = "ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_351 = Static63.method1251("or2");

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_352 = Static63.method1251("gr3");

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_353 = Static63.method1251("gr2");

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "Lclient!mb;")
	public static Class45 aClass45_354 = Static63.method1251("gre");

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_355 = Static63.method1251("@str@");

	@OriginalMember(owner = "client!df", name = "rb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_356 = Static63.method1251("str");

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_357 = Static63.method1251("blu");

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_358 = Static63.method1251("dre");

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "Lclient!mb;")
	public static Class45 aClass45_359 = Static63.method1251("gr1");

	@OriginalMember(owner = "client!df", name = "vb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_360 = Static63.method1251("or3");

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_361 = Static63.method1251("mag");

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_362 = Static63.method1251("yel");

	@OriginalMember(owner = "client!df", name = "zb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_363 = Static63.method1251("cya");

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public static void method507() {
		aClass45_356 = null;
		aClass45_355 = null;
		aClass45_346 = null;
		aClass45_354 = null;
		aClass45_357 = null;
		aClass45_362 = null;
		aClass45_363 = null;
		aClass45_361 = null;
		aClass45_345 = null;
		aClass45_347 = null;
		aClass45_348 = null;
		aClass45_358 = null;
		aClass45_350 = null;
		aClass45_349 = null;
		aClass45_351 = null;
		aClass45_360 = null;
		aClass45_359 = null;
		aClass45_353 = null;
		aClass45_352 = null;
		aClass45Array8 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method513(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIII)V")
	public static void method517(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2722;
		@Pc(9) int local9 = Static118.anInt2722 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2724) {
			local20 = Static118.anInt2724 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2724;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2722;
		}
		if (arg2 + arg4 > Static118.anInt2720) {
			arg4 -= arg2 + arg4 - Static118.anInt2720;
		}
		if (arg1 < Static118.anInt2721) {
			local20 = Static118.anInt2721 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2721;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2723) {
			local20 = arg1 + arg3 - Static118.anInt2723;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method518(Static118.anIntArray414, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method518(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([BIIIIII)V")
	public static void method523(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2722;
		@Pc(9) int local9 = Static118.anInt2722 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2724) {
			local20 = Static118.anInt2724 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2724;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2722;
		}
		if (arg2 + arg4 > Static118.anInt2720) {
			arg4 -= arg2 + arg4 - Static118.anInt2720;
		}
		if (arg1 < Static118.anInt2721) {
			local20 = Static118.anInt2721 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2721;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2723) {
			local20 = arg1 + arg3 - Static118.anInt2723;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method513(Static118.anIntArray414, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
