import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array11;

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1286 = Static119.method1462(")4col");

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1287 = Static119.method1462(")4u");

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1288 = Static119.method1462("shad=");

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	public static int anInt2970 = -1;

	@OriginalMember(owner = "client!ka", name = "Y", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1289 = Static119.method1462("str=");

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
	public static int anInt2971 = 0;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1290 = Static119.method1462("img=");

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
	public static int anInt2972 = 0;

	@OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
	public static int anInt2973 = 256;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1291 = Static119.method1462("shad");

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1292 = Static119.method1462("u=");

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1293 = Static119.method1462("gt");

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1294 = Static119.method1462("br");

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1295 = Static119.method1462(")4str");

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
	public static int anInt2977 = -1;

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1296 = Static119.method1462("lt");

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
	public static int anInt2978 = -1;

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1297 = Static119.method1462("u");

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1298 = Static119.method1462(")4shad");

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
	public static int anInt2979 = -1;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
	public static int anInt2980 = 0;

	@OriginalMember(owner = "client!ka", name = "yb", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1299 = Static119.method1462("str");

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1300 = Static119.method1462("col=");

	@OriginalMember(owner = "client!ka", name = "Bb", descriptor = "[Lclient!pe;")
	public static Class65[] aClass65Array86 = new Class65[100];

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public static void method2088() {
		aClass65_1296 = null;
		aClass65_1293 = null;
		aClass65_1290 = null;
		aClass65_1294 = null;
		aClass65_1300 = null;
		aClass65_1286 = null;
		aClass65_1292 = null;
		aClass65_1297 = null;
		aClass65_1287 = null;
		aClass65_1288 = null;
		aClass65_1291 = null;
		aClass65_1298 = null;
		aClass65_1289 = null;
		aClass65_1299 = null;
		aClass65_1295 = null;
		aClass2_Sub1_Sub4_Sub2Array11 = null;
		aRandom2 = null;
		aClass65Array86 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method2090(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!pe;)Lclient!pe;")
	public static Class65 method2091(@OriginalArg(0) Class65 arg0) {
		@Pc(3) int local3 = arg0.method1502();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray27[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class65 local28 = new Class65();
		local28.anInt2005 = local3 + local5;
		local28.aByteArray27 = new byte[local28.anInt2005];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray27[local42];
			if (local48 == 60) {
				local28.aByteArray27[local40++] = 60;
				local28.aByteArray27[local40++] = 108;
				local28.aByteArray27[local40++] = 116;
				local28.aByteArray27[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray27[local40++] = 60;
				local28.aByteArray27[local40++] = 103;
				local28.aByteArray27[local40++] = 116;
				local28.aByteArray27[local40++] = 62;
			} else {
				local28.aByteArray27[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIIII)V")
	public static void method2092(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2964;
		@Pc(9) int local9 = Static118.anInt2964 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2965) {
			local20 = Static118.anInt2965 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2965;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2964;
		}
		if (arg2 + arg4 > Static118.anInt2969) {
			arg4 -= arg2 + arg4 - Static118.anInt2969;
		}
		if (arg1 < Static118.anInt2967) {
			local20 = Static118.anInt2967 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2967;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2968) {
			local20 = arg1 + arg3 - Static118.anInt2968;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method2090(Static118.anIntArray419, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIIIII)V")
	public static void method2102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2964;
		@Pc(9) int local9 = Static118.anInt2964 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2965) {
			local20 = Static118.anInt2965 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2965;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2964;
		}
		if (arg2 + arg4 > Static118.anInt2969) {
			arg4 -= arg2 + arg4 - Static118.anInt2969;
		}
		if (arg1 < Static118.anInt2967) {
			local20 = Static118.anInt2967 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2967;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2968) {
			local20 = arg1 + arg3 - Static118.anInt2968;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method2104(Static118.anIntArray419, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method2104(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2108(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(75) int local75 = local50[local58++] + local54[local62++];
			if (local75 < local37) {
				local37 = local75;
			}
		}
		return -local37;
	}
}
