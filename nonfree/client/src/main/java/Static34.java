import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_446 = Static109.method1737("str");

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_447 = Static109.method1737("@str@");

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "[Lclient!na;")
	public static Class53[] aClass53Array8 = new Class53[100];

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "Lclient!na;")
	public static Class53 aClass53_448 = Static109.method1737("red");

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_449 = Static109.method1737("gre");

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_450 = Static109.method1737("dbl");

	@OriginalMember(owner = "client!ff", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_451 = Static109.method1737("cya");

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "Lclient!na;")
	public static Class53 aClass53_452 = Static109.method1737("gr3");

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Lclient!na;")
	public static Class53 aClass53_453 = Static109.method1737("yel");

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "Lclient!na;")
	public static Class53 aClass53_454 = Static109.method1737("or1");

	@OriginalMember(owner = "client!ff", name = "db", descriptor = "Lclient!na;")
	public static Class53 aClass53_455 = Static109.method1737("lre");

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_456 = Static109.method1737("or2");

	@OriginalMember(owner = "client!ff", name = "gb", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ff", name = "hb", descriptor = "Lclient!na;")
	public static Class53 aClass53_457 = Static109.method1737("dre");

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "Lclient!na;")
	public static Class53 aClass53_458 = Static109.method1737("whi");

	@OriginalMember(owner = "client!ff", name = "jb", descriptor = "Lclient!na;")
	public static Class53 aClass53_459 = Static109.method1737("gr2");

	@OriginalMember(owner = "client!ff", name = "lb", descriptor = "Lclient!na;")
	public static Class53 aClass53_460 = Static109.method1737("mag");

	@OriginalMember(owner = "client!ff", name = "mb", descriptor = "Lclient!na;")
	public static Class53 aClass53_461 = Static109.method1737("or3");

	@OriginalMember(owner = "client!ff", name = "nb", descriptor = "Lclient!na;")
	public static Class53 aClass53_462 = Static109.method1737("gr1");

	@OriginalMember(owner = "client!ff", name = "ob", descriptor = "Lclient!na;")
	public static Class53 aClass53_463 = Static109.method1737("bla");

	@OriginalMember(owner = "client!ff", name = "pb", descriptor = "Lclient!na;")
	public static Class53 aClass53_464 = Static109.method1737("blu");

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()V")
	public static void method732() {
		aClass53_446 = null;
		aClass53_447 = null;
		aClass53_448 = null;
		aClass53_449 = null;
		aClass53_464 = null;
		aClass53_453 = null;
		aClass53_451 = null;
		aClass53_460 = null;
		aClass53_458 = null;
		aClass53_463 = null;
		aClass53_455 = null;
		aClass53_457 = null;
		aClass53_450 = null;
		aClass53_454 = null;
		aClass53_456 = null;
		aClass53_461 = null;
		aClass53_462 = null;
		aClass53_459 = null;
		aClass53_452 = null;
		aClass53Array8 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method737(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BIIIIII)V")
	public static void method738(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static84.anInt1934;
		@Pc(9) int local9 = Static84.anInt1934 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static84.anInt1936) {
			local20 = Static84.anInt1936 - arg2;
			arg4 -= local20;
			arg2 = Static84.anInt1936;
			local13 = local20 * arg3;
			local5 += local20 * Static84.anInt1934;
		}
		if (arg2 + arg4 > Static84.anInt1932) {
			arg4 -= arg2 + arg4 - Static84.anInt1932;
		}
		if (arg1 < Static84.anInt1935) {
			local20 = Static84.anInt1935 - arg1;
			arg3 -= local20;
			arg1 = Static84.anInt1935;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static84.anInt1937) {
			local20 = arg1 + arg3 - Static84.anInt1937;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method754(Static84.anIntArray256, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BIIIII)V")
	public static void method747(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static84.anInt1934;
		@Pc(9) int local9 = Static84.anInt1934 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static84.anInt1936) {
			local20 = Static84.anInt1936 - arg2;
			arg4 -= local20;
			arg2 = Static84.anInt1936;
			local13 = local20 * arg3;
			local5 += local20 * Static84.anInt1934;
		}
		if (arg2 + arg4 > Static84.anInt1932) {
			arg4 -= arg2 + arg4 - Static84.anInt1932;
		}
		if (arg1 < Static84.anInt1935) {
			local20 = Static84.anInt1935 - arg1;
			arg3 -= local20;
			arg1 = Static84.anInt1935;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static84.anInt1937) {
			local20 = arg1 + arg3 - Static84.anInt1937;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method737(Static84.anIntArray256, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method754(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
