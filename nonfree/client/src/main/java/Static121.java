import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!we", name = "V", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1434 = Static38.method736("lre");

	@OriginalMember(owner = "client!we", name = "W", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1435 = Static38.method736("or1");

	@OriginalMember(owner = "client!we", name = "X", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1436 = Static38.method736("or2");

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1437 = Static38.method736("bla");

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1438 = Static38.method736("dbl");

	@OriginalMember(owner = "client!we", name = "bb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1439 = Static38.method736("or3");

	@OriginalMember(owner = "client!we", name = "cb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1440 = Static38.method736("gr2");

	@OriginalMember(owner = "client!we", name = "eb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1441 = Static38.method736("gre");

	@OriginalMember(owner = "client!we", name = "fb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1442 = Static38.method736("str");

	@OriginalMember(owner = "client!we", name = "ib", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1443 = Static38.method736("gr1");

	@OriginalMember(owner = "client!we", name = "jb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1444 = Static38.method736("red");

	@OriginalMember(owner = "client!we", name = "kb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1445 = Static38.method736("gr3");

	@OriginalMember(owner = "client!we", name = "nb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1446 = Static38.method736("mag");

	@OriginalMember(owner = "client!we", name = "ob", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1447 = Static38.method736("yel");

	@OriginalMember(owner = "client!we", name = "pb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1448 = Static38.method736("@str@");

	@OriginalMember(owner = "client!we", name = "qb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1449 = Static38.method736("blu");

	@OriginalMember(owner = "client!we", name = "rb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1450 = Static38.method736("whi");

	@OriginalMember(owner = "client!we", name = "sb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1451 = Static38.method736("cya");

	@OriginalMember(owner = "client!we", name = "tb", descriptor = "[Lclient!vc;")
	public static Class71[] aClass71Array19 = new Class71[100];

	@OriginalMember(owner = "client!we", name = "vb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1452 = Static38.method736("dre");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BIIIII)V")
	public static void method2029(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static52.anInt3020;
		@Pc(9) int local9 = Static52.anInt3020 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static52.anInt3016) {
			local20 = Static52.anInt3016 - arg2;
			arg4 -= local20;
			arg2 = Static52.anInt3016;
			local13 = local20 * arg3;
			local5 += local20 * Static52.anInt3020;
		}
		if (arg2 + arg4 > Static52.anInt3019) {
			arg4 -= arg2 + arg4 - Static52.anInt3019;
		}
		if (arg1 < Static52.anInt3017) {
			local20 = Static52.anInt3017 - arg1;
			arg3 -= local20;
			arg1 = Static52.anInt3017;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static52.anInt3018) {
			local20 = arg1 + arg3 - Static52.anInt3018;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method2034(Static52.anIntArray309, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method2034(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BIIIIII)V")
	public static void method2043(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static52.anInt3020;
		@Pc(9) int local9 = Static52.anInt3020 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static52.anInt3016) {
			local20 = Static52.anInt3016 - arg2;
			arg4 -= local20;
			arg2 = Static52.anInt3016;
			local13 = local20 * arg3;
			local5 += local20 * Static52.anInt3020;
		}
		if (arg2 + arg4 > Static52.anInt3019) {
			arg4 -= arg2 + arg4 - Static52.anInt3019;
		}
		if (arg1 < Static52.anInt3017) {
			local20 = Static52.anInt3017 - arg1;
			arg3 -= local20;
			arg1 = Static52.anInt3017;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static52.anInt3018) {
			local20 = arg1 + arg3 - Static52.anInt3018;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method2050(Static52.anIntArray309, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "()V")
	public static void method2047() {
		aClass71_1442 = null;
		aClass71_1448 = null;
		aClass71_1444 = null;
		aClass71_1441 = null;
		aClass71_1449 = null;
		aClass71_1447 = null;
		aClass71_1451 = null;
		aClass71_1446 = null;
		aClass71_1450 = null;
		aClass71_1437 = null;
		aClass71_1434 = null;
		aClass71_1452 = null;
		aClass71_1438 = null;
		aClass71_1435 = null;
		aClass71_1436 = null;
		aClass71_1439 = null;
		aClass71_1443 = null;
		aClass71_1440 = null;
		aClass71_1445 = null;
		aClass71Array19 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method2050(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
