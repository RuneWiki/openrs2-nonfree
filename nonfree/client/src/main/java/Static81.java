import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ob", name = "ib", descriptor = "[Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3[] aClass4_Sub1_Sub2_Sub3Array7;

	@OriginalMember(owner = "client!ob", name = "P", descriptor = "Lclient!ec;")
	public static Class22 aClass22_597 = Static60.method1113(")4u");

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
	public static int anInt2118 = -1;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_598 = Static60.method1113("img=");

	@OriginalMember(owner = "client!ob", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_599 = Static60.method1113("col=");

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
	public static int anInt2119 = 0;

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "Lclient!ec;")
	public static Class22 aClass22_600 = Static60.method1113("shad=");

	@OriginalMember(owner = "client!ob", name = "cb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_601 = Static60.method1113("lt");

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "Lclient!ec;")
	public static Class22 aClass22_602 = Static60.method1113(")4str");

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_603 = Static60.method1113("u=");

	@OriginalMember(owner = "client!ob", name = "hb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_604 = Static60.method1113(")4col");

	@OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_605 = Static60.method1113("gt");

	@OriginalMember(owner = "client!ob", name = "lb", descriptor = "I")
	public static int anInt2122 = -1;

	@OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_606 = Static60.method1113(")4shad");

	@OriginalMember(owner = "client!ob", name = "nb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_607 = Static60.method1113("str=");

	@OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
	public static int anInt2123 = -1;

	@OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
	public static int anInt2124 = 256;

	@OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
	public static int anInt2125 = 0;

	@OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
	public static int anInt2126 = -1;

	@OriginalMember(owner = "client!ob", name = "tb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_608 = Static60.method1113("str");

	@OriginalMember(owner = "client!ob", name = "ub", descriptor = "Lclient!ec;")
	public static Class22 aClass22_609 = Static60.method1113("u");

	@OriginalMember(owner = "client!ob", name = "vb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_610 = Static60.method1113("shad");

	@OriginalMember(owner = "client!ob", name = "wb", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!ob", name = "yb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_611 = Static60.method1113("br");

	@OriginalMember(owner = "client!ob", name = "zb", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!ob", name = "Ab", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array16 = new Class22[100];

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Lclient!ec;)Lclient!ec;")
	public static Class22 method1393(@OriginalArg(0) Class22 arg0) {
		@Pc(3) int local3 = arg0.method449();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray7[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class22 local28 = new Class22();
		local28.anInt668 = local3 + local5;
		local28.aByteArray7 = new byte[local28.anInt668];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray7[local42];
			if (local48 == 60) {
				local28.aByteArray7[local40++] = 60;
				local28.aByteArray7[local40++] = 108;
				local28.aByteArray7[local40++] = 116;
				local28.aByteArray7[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray7[local40++] = 60;
				local28.aByteArray7[local40++] = 103;
				local28.aByteArray7[local40++] = 116;
				local28.aByteArray7[local40++] = 62;
			} else {
				local28.aByteArray7[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([BIIIII)V")
	public static void method1394(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2114;
		@Pc(9) int local9 = Static118.anInt2114 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2111) {
			local20 = Static118.anInt2111 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2111;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2114;
		}
		if (arg2 + arg4 > Static118.anInt2113) {
			arg4 -= arg2 + arg4 - Static118.anInt2113;
		}
		if (arg1 < Static118.anInt2112) {
			local20 = Static118.anInt2112 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2112;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2115) {
			local20 = arg1 + arg3 - Static118.anInt2115;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1416(Static118.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1401(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "([BIIIIII)V")
	public static void method1408(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static118.anInt2114;
		@Pc(9) int local9 = Static118.anInt2114 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static118.anInt2111) {
			local20 = Static118.anInt2111 - arg2;
			arg4 -= local20;
			arg2 = Static118.anInt2111;
			local13 = local20 * arg3;
			local5 += local20 * Static118.anInt2114;
		}
		if (arg2 + arg4 > Static118.anInt2113) {
			arg4 -= arg2 + arg4 - Static118.anInt2113;
		}
		if (arg1 < Static118.anInt2112) {
			local20 = Static118.anInt2112 - arg1;
			arg3 -= local20;
			arg1 = Static118.anInt2112;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static118.anInt2115) {
			local20 = arg1 + arg3 - Static118.anInt2115;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1401(Static118.anIntArray213, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "()V")
	public static void method1412() {
		aClass22_601 = null;
		aClass22_605 = null;
		aClass22_598 = null;
		aClass22_611 = null;
		aClass22_599 = null;
		aClass22_604 = null;
		aClass22_603 = null;
		aClass22_609 = null;
		aClass22_597 = null;
		aClass22_600 = null;
		aClass22_610 = null;
		aClass22_606 = null;
		aClass22_607 = null;
		aClass22_608 = null;
		aClass22_602 = null;
		aClass4_Sub1_Sub2_Sub3Array7 = null;
		aRandom2 = null;
		aClass22Array16 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1416(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1418(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
