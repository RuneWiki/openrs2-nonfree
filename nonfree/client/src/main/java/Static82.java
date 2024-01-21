import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oc", name = "ub", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array70;

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "Lclient!je;")
	public static Class40 aClass40_1130 = Static69.method1231("lt");

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_1131 = Static69.method1231(")4u");

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1132 = Static69.method1231(")4str");

	@OriginalMember(owner = "client!oc", name = "cb", descriptor = "I")
	public static int anInt2186 = -1;

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "Lclient!je;")
	public static Class40 aClass40_1133 = Static69.method1231("shad=");

	@OriginalMember(owner = "client!oc", name = "eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1134 = Static69.method1231("gt");

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1135 = Static69.method1231(")4col");

	@OriginalMember(owner = "client!oc", name = "hb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1136 = Static69.method1231("str");

	@OriginalMember(owner = "client!oc", name = "ib", descriptor = "I")
	public static int anInt2188 = 256;

	@OriginalMember(owner = "client!oc", name = "jb", descriptor = "I")
	public static int anInt2189 = -1;

	@OriginalMember(owner = "client!oc", name = "kb", descriptor = "I")
	public static int anInt2190 = 0;

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
	public static int anInt2191 = 0;

	@OriginalMember(owner = "client!oc", name = "mb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1137 = Static69.method1231(")4shad");

	@OriginalMember(owner = "client!oc", name = "ob", descriptor = "Lclient!je;")
	public static Class40 aClass40_1138 = Static69.method1231("str=");

	@OriginalMember(owner = "client!oc", name = "pb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1139 = Static69.method1231("img=");

	@OriginalMember(owner = "client!oc", name = "rb", descriptor = "I")
	public static int anInt2192 = -1;

	@OriginalMember(owner = "client!oc", name = "sb", descriptor = "I")
	public static int anInt2193 = -1;

	@OriginalMember(owner = "client!oc", name = "xb", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!oc", name = "zb", descriptor = "I")
	public static int anInt2194 = 0;

	@OriginalMember(owner = "client!oc", name = "Ab", descriptor = "I")
	public static int anInt2195 = 0;

	@OriginalMember(owner = "client!oc", name = "Bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1140 = Static69.method1231("u=");

	@OriginalMember(owner = "client!oc", name = "Cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1141 = Static69.method1231("col=");

	@OriginalMember(owner = "client!oc", name = "Eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1142 = Static69.method1231("br");

	@OriginalMember(owner = "client!oc", name = "Fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1143 = Static69.method1231("u");

	@OriginalMember(owner = "client!oc", name = "Hb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1144 = Static69.method1231("shad");

	@OriginalMember(owner = "client!oc", name = "Ib", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array13 = new Class40[100];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1529(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1530(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIIIIII)V")
	public static void method1533(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt2382;
		@Pc(9) int local9 = Static6.anInt2382 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static6.anInt2383) {
			local20 = Static6.anInt2383 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt2383;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt2382;
		}
		if (arg2 + arg4 > Static6.anInt2379) {
			arg4 -= arg2 + arg4 - Static6.anInt2379;
		}
		if (arg1 < Static6.anInt2380) {
			local20 = Static6.anInt2380 - arg1;
			arg3 -= local20;
			arg1 = Static6.anInt2380;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static6.anInt2384) {
			local20 = arg1 + arg3 - Static6.anInt2384;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1554(Static6.anIntArray258, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "()V")
	public static void method1538() {
		aClass40_1130 = null;
		aClass40_1134 = null;
		aClass40_1139 = null;
		aClass40_1142 = null;
		aClass40_1141 = null;
		aClass40_1135 = null;
		aClass40_1140 = null;
		aClass40_1143 = null;
		aClass40_1131 = null;
		aClass40_1133 = null;
		aClass40_1144 = null;
		aClass40_1137 = null;
		aClass40_1138 = null;
		aClass40_1136 = null;
		aClass40_1132 = null;
		aClass2_Sub1_Sub2_Sub1Array70 = null;
		aRandom2 = null;
		aClass40Array13 = null;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "([BIIIII)V")
	public static void method1539(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static6.anInt2382;
		@Pc(9) int local9 = Static6.anInt2382 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static6.anInt2383) {
			local20 = Static6.anInt2383 - arg2;
			arg4 -= local20;
			arg2 = Static6.anInt2383;
			local13 = local20 * arg3;
			local5 += local20 * Static6.anInt2382;
		}
		if (arg2 + arg4 > Static6.anInt2379) {
			arg4 -= arg2 + arg4 - Static6.anInt2379;
		}
		if (arg1 < Static6.anInt2380) {
			local20 = Static6.anInt2380 - arg1;
			arg3 -= local20;
			arg1 = Static6.anInt2380;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static6.anInt2384) {
			local20 = arg1 + arg3 - Static6.anInt2384;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1529(Static6.anIntArray258, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!je;)Lclient!je;")
	public static Class40 method1541(@OriginalArg(0) Class40 arg0) {
		@Pc(3) int local3 = arg0.method950();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray18[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class40 local28 = new Class40();
		local28.anInt1425 = local3 + local5;
		local28.aByteArray18 = new byte[local28.anInt1425];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray18[local42];
			if (local48 == 60) {
				local28.aByteArray18[local40++] = 60;
				local28.aByteArray18[local40++] = 108;
				local28.aByteArray18[local40++] = 116;
				local28.aByteArray18[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray18[local40++] = 60;
				local28.aByteArray18[local40++] = 103;
				local28.aByteArray18[local40++] = 116;
				local28.aByteArray18[local40++] = 62;
			} else {
				local28.aByteArray18[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1554(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
