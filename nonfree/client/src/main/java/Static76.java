import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!mf", name = "ub", descriptor = "[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] aClass4_Sub2_Sub3_Sub4Array4;

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_962 = Static28.method504("shad");

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_963 = Static28.method504("gt");

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_964 = Static28.method504(")4b");

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	public static int anInt1827 = -1;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_965 = Static28.method504(")4i");

	@OriginalMember(owner = "client!mf", name = "jb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_966 = Static28.method504("str");

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_967 = Static28.method504("br");

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_968 = Static28.method504("u");

	@OriginalMember(owner = "client!mf", name = "nb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_969 = Static28.method504(")4str");

	@OriginalMember(owner = "client!mf", name = "ob", descriptor = "Lclient!ja;")
	public static Class39 aClass39_970 = Static28.method504("img=");

	@OriginalMember(owner = "client!mf", name = "qb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_971 = Static28.method504("str=");

	@OriginalMember(owner = "client!mf", name = "rb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_972 = Static28.method504("col=");

	@OriginalMember(owner = "client!mf", name = "tb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_973 = Static28.method504("u=");

	@OriginalMember(owner = "client!mf", name = "vb", descriptor = "I")
	public static int anInt1830 = -1;

	@OriginalMember(owner = "client!mf", name = "wb", descriptor = "I")
	public static int anInt1831 = -1;

	@OriginalMember(owner = "client!mf", name = "xb", descriptor = "I")
	public static int anInt1832 = 0;

	@OriginalMember(owner = "client!mf", name = "yb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_974 = Static28.method504(")4shad");

	@OriginalMember(owner = "client!mf", name = "Ab", descriptor = "Lclient!ja;")
	public static Class39 aClass39_975 = Static28.method504("shad=");

	@OriginalMember(owner = "client!mf", name = "Bb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_976 = Static28.method504(")4col");

	@OriginalMember(owner = "client!mf", name = "Db", descriptor = "I")
	public static int anInt1834 = 0;

	@OriginalMember(owner = "client!mf", name = "Fb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_977 = Static28.method504("b");

	@OriginalMember(owner = "client!mf", name = "Gb", descriptor = "I")
	public static int anInt1836 = 256;

	@OriginalMember(owner = "client!mf", name = "Ib", descriptor = "Lclient!ja;")
	public static Class39 aClass39_978 = Static28.method504(")4u");

	@OriginalMember(owner = "client!mf", name = "Jb", descriptor = "I")
	public static int anInt1837 = 0;

	@OriginalMember(owner = "client!mf", name = "Kb", descriptor = "I")
	public static int anInt1838 = -1;

	@OriginalMember(owner = "client!mf", name = "Lb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_979 = Static28.method504("lt");

	@OriginalMember(owner = "client!mf", name = "Mb", descriptor = "Lclient!ja;")
	public static Class39 aClass39_980 = Static28.method504("i");

	@OriginalMember(owner = "client!mf", name = "Nb", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array14 = new Class39[100];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ja;)Lclient!ja;")
	public static Class39 method1263(@OriginalArg(0) Class39 arg0) {
		@Pc(3) int local3 = arg0.method953();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray10[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class39 local28 = new Class39();
		local28.anInt1481 = local3 + local5;
		local28.aByteArray10 = new byte[local28.anInt1481];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray10[local42];
			if (local48 == 60) {
				local28.aByteArray10[local40++] = 60;
				local28.aByteArray10[local40++] = 108;
				local28.aByteArray10[local40++] = 116;
				local28.aByteArray10[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray10[local40++] = 60;
				local28.aByteArray10[local40++] = 103;
				local28.aByteArray10[local40++] = 116;
				local28.aByteArray10[local40++] = 62;
			} else {
				local28.aByteArray10[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()V")
	public static void method1266() {
		aClass39_979 = null;
		aClass39_963 = null;
		aClass39_970 = null;
		aClass39_967 = null;
		aClass39_972 = null;
		aClass39_976 = null;
		aClass39_977 = null;
		aClass39_964 = null;
		aClass39_980 = null;
		aClass39_965 = null;
		aClass39_973 = null;
		aClass39_968 = null;
		aClass39_978 = null;
		aClass39_975 = null;
		aClass39_962 = null;
		aClass39_974 = null;
		aClass39_971 = null;
		aClass39_966 = null;
		aClass39_969 = null;
		aClass4_Sub2_Sub3_Sub4Array4 = null;
		aRandom1 = null;
		aClass39Array14 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method1268(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIIIIII)V")
	public static void method1269(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static17.anInt2257;
		@Pc(9) int local9 = Static17.anInt2257 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static17.anInt2258) {
			local20 = Static17.anInt2258 - arg2;
			arg4 -= local20;
			arg2 = Static17.anInt2258;
			local13 = local20 * arg3;
			local5 += local20 * Static17.anInt2257;
		}
		if (arg2 + arg4 > Static17.anInt2259) {
			arg4 -= arg2 + arg4 - Static17.anInt2259;
		}
		if (arg1 < Static17.anInt2261) {
			local20 = Static17.anInt2261 - arg1;
			arg3 -= local20;
			arg1 = Static17.anInt2261;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static17.anInt2256) {
			local20 = arg1 + arg3 - Static17.anInt2256;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1268(Static17.anIntArray247, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([BIIIII)V")
	public static void method1274(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static17.anInt2257;
		@Pc(9) int local9 = Static17.anInt2257 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static17.anInt2258) {
			local20 = Static17.anInt2258 - arg2;
			arg4 -= local20;
			arg2 = Static17.anInt2258;
			local13 = local20 * arg3;
			local5 += local20 * Static17.anInt2257;
		}
		if (arg2 + arg4 > Static17.anInt2259) {
			arg4 -= arg2 + arg4 - Static17.anInt2259;
		}
		if (arg1 < Static17.anInt2261) {
			local20 = Static17.anInt2261 - arg1;
			arg3 -= local20;
			arg1 = Static17.anInt2261;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static17.anInt2256) {
			local20 = arg1 + arg3 - Static17.anInt2256;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1282(Static17.anIntArray247, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method1282(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
