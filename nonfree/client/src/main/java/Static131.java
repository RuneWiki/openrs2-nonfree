import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!wc", name = "kb", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array10;

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1286 = Static56.method816("img=");

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1287 = Static56.method816("str=");

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1288 = Static56.method816("str");

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1289 = Static56.method816("gt");

	@OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1290 = Static56.method816(")4shad");

	@OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
	public static int anInt2720 = 256;

	@OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
	public static int anInt2721 = -1;

	@OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1291 = Static56.method816("u=");

	@OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1292 = Static56.method816("col=");

	@OriginalMember(owner = "client!wc", name = "rb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1293 = Static56.method816("u");

	@OriginalMember(owner = "client!wc", name = "sb", descriptor = "I")
	public static int anInt2724 = 0;

	@OriginalMember(owner = "client!wc", name = "ub", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1294 = Static56.method816("shad");

	@OriginalMember(owner = "client!wc", name = "vb", descriptor = "I")
	public static int anInt2725 = -1;

	@OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
	public static int anInt2726 = 256;

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
	public static int anInt2727 = -1;

	@OriginalMember(owner = "client!wc", name = "Ab", descriptor = "I")
	public static int anInt2728 = -1;

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "I")
	public static int anInt2730 = 0;

	@OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
	public static int anInt2731 = 0;

	@OriginalMember(owner = "client!wc", name = "Eb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1295 = Static56.method816("br");

	@OriginalMember(owner = "client!wc", name = "Fb", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array20 = new Class34[100];

	@OriginalMember(owner = "client!wc", name = "Gb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1296 = Static56.method816(")4u");

	@OriginalMember(owner = "client!wc", name = "Hb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1297 = Static56.method816(")4str");

	@OriginalMember(owner = "client!wc", name = "Ib", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1298 = Static56.method816(")4col");

	@OriginalMember(owner = "client!wc", name = "Jb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1299 = Static56.method816("lt");

	@OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1300 = Static56.method816("shad=");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1739(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1755(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!ic;)Lclient!ic;")
	public static Class34 method1757(@OriginalArg(0) Class34 arg0) {
		@Pc(3) int local3 = arg0.method820();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray20[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class34 local28 = new Class34();
		local28.anInt1418 = local3 + local5;
		local28.aByteArray20 = new byte[local28.anInt1418];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray20[local42];
			if (local48 == 60) {
				local28.aByteArray20[local40++] = 60;
				local28.aByteArray20[local40++] = 108;
				local28.aByteArray20[local40++] = 116;
				local28.aByteArray20[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray20[local40++] = 60;
				local28.aByteArray20[local40++] = 103;
				local28.aByteArray20[local40++] = 116;
				local28.aByteArray20[local40++] = 62;
			} else {
				local28.aByteArray20[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
	public static void method1760() {
		aClass34_1299 = null;
		aClass34_1289 = null;
		aClass34_1286 = null;
		aClass34_1295 = null;
		aClass34_1292 = null;
		aClass34_1298 = null;
		aClass34_1291 = null;
		aClass34_1293 = null;
		aClass34_1296 = null;
		aClass34_1300 = null;
		aClass34_1294 = null;
		aClass34_1290 = null;
		aClass34_1287 = null;
		aClass34_1288 = null;
		aClass34_1297 = null;
		aClass8_Sub1_Sub3_Sub2Array10 = null;
		aClass34Array20 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1768(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
