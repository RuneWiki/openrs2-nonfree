import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!v", name = "W", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1132 = Static2.method59("@str@");

	@OriginalMember(owner = "client!v", name = "X", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1133 = Static2.method59("str");

	@OriginalMember(owner = "client!v", name = "Y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1134 = Static2.method59("lre");

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array17 = new Class80[100];

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1135 = Static2.method59("mag");

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1136 = Static2.method59("or2");

	@OriginalMember(owner = "client!v", name = "db", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1137 = Static2.method59("bla");

	@OriginalMember(owner = "client!v", name = "eb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1138 = Static2.method59("cya");

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1139 = Static2.method59("gr1");

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1140 = Static2.method59("or3");

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1141 = Static2.method59("dre");

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1142 = Static2.method59("gre");

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1143 = Static2.method59("red");

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1144 = Static2.method59("dbl");

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1145 = Static2.method59("whi");

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1146 = Static2.method59("gr2");

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1147 = Static2.method59("blu");

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1148 = Static2.method59("yel");

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1149 = Static2.method59("or1");

	@OriginalMember(owner = "client!v", name = "vb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1150 = Static2.method59("gr3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method1905(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIII)V")
	public static void method1917(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static99.anInt2978;
		@Pc(9) int local9 = Static99.anInt2978 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static99.anInt2974) {
			local20 = Static99.anInt2974 - arg2;
			arg4 -= local20;
			arg2 = Static99.anInt2974;
			local13 = local20 * arg3;
			local5 += local20 * Static99.anInt2978;
		}
		if (arg2 + arg4 > Static99.anInt2976) {
			arg4 -= arg2 + arg4 - Static99.anInt2976;
		}
		if (arg1 < Static99.anInt2977) {
			local20 = Static99.anInt2977 - arg1;
			arg3 -= local20;
			arg1 = Static99.anInt2977;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static99.anInt2979) {
			local20 = arg1 + arg3 - Static99.anInt2979;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1928(Static99.anIntArray388, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIIII)V")
	public static void method1920(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static99.anInt2978;
		@Pc(9) int local9 = Static99.anInt2978 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static99.anInt2974) {
			local20 = Static99.anInt2974 - arg2;
			arg4 -= local20;
			arg2 = Static99.anInt2974;
			local13 = local20 * arg3;
			local5 += local20 * Static99.anInt2978;
		}
		if (arg2 + arg4 > Static99.anInt2976) {
			arg4 -= arg2 + arg4 - Static99.anInt2976;
		}
		if (arg1 < Static99.anInt2977) {
			local20 = Static99.anInt2977 - arg1;
			arg3 -= local20;
			arg1 = Static99.anInt2977;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static99.anInt2979) {
			local20 = arg1 + arg3 - Static99.anInt2979;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1905(Static99.anIntArray388, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
	public static void method1923() {
		aClass80_1133 = null;
		aClass80_1132 = null;
		aClass80_1143 = null;
		aClass80_1142 = null;
		aClass80_1147 = null;
		aClass80_1148 = null;
		aClass80_1138 = null;
		aClass80_1135 = null;
		aClass80_1145 = null;
		aClass80_1137 = null;
		aClass80_1134 = null;
		aClass80_1141 = null;
		aClass80_1144 = null;
		aClass80_1149 = null;
		aClass80_1136 = null;
		aClass80_1140 = null;
		aClass80_1139 = null;
		aClass80_1146 = null;
		aClass80_1150 = null;
		aClass80Array17 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method1928(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
