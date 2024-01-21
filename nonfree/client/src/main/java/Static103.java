import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!rd", name = "wb", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
	public static int anInt1312 = 0;

	@OriginalMember(owner = "client!rd", name = "bb", descriptor = "Lclient!id;")
	public static Class34 aClass34_649 = Static9.method266(")4shad");

	@OriginalMember(owner = "client!rd", name = "cb", descriptor = "Lclient!id;")
	public static Class34 aClass34_650 = Static9.method266(")4col");

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "Lclient!id;")
	public static Class34 aClass34_651 = Static9.method266(")4str");

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "Lclient!id;")
	public static Class34 aClass34_652 = Static9.method266("u=");

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_653 = Static9.method266("str");

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "I")
	public static int anInt1313 = -1;

	@OriginalMember(owner = "client!rd", name = "ib", descriptor = "Ljava/util/Random;")
	public static Random aRandom2 = new Random();

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "I")
	public static int anInt1314 = 0;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "Lclient!id;")
	public static Class34 aClass34_654 = Static9.method266("shad=");

	@OriginalMember(owner = "client!rd", name = "mb", descriptor = "Lclient!id;")
	public static Class34 aClass34_655 = Static9.method266("col=");

	@OriginalMember(owner = "client!rd", name = "pb", descriptor = "Lclient!id;")
	public static Class34 aClass34_656 = Static9.method266("str=");

	@OriginalMember(owner = "client!rd", name = "qb", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "Lclient!id;")
	public static Class34 aClass34_657 = Static9.method266("u");

	@OriginalMember(owner = "client!rd", name = "sb", descriptor = "Lclient!id;")
	public static Class34 aClass34_658 = Static9.method266(")4u");

	@OriginalMember(owner = "client!rd", name = "tb", descriptor = "I")
	public static int anInt1317 = 256;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "Lclient!id;")
	public static Class34 aClass34_659 = Static9.method266("gt");

	@OriginalMember(owner = "client!rd", name = "xb", descriptor = "Lclient!id;")
	public static Class34 aClass34_660 = Static9.method266("img=");

	@OriginalMember(owner = "client!rd", name = "yb", descriptor = "Lclient!id;")
	public static Class34 aClass34_661 = Static9.method266("lt");

	@OriginalMember(owner = "client!rd", name = "Bb", descriptor = "I")
	public static int anInt1319 = 0;

	@OriginalMember(owner = "client!rd", name = "Cb", descriptor = "I")
	public static int anInt1320 = -1;

	@OriginalMember(owner = "client!rd", name = "Eb", descriptor = "Lclient!id;")
	public static Class34 aClass34_662 = Static9.method266("shad");

	@OriginalMember(owner = "client!rd", name = "Fb", descriptor = "I")
	public static int anInt1321 = -1;

	@OriginalMember(owner = "client!rd", name = "Gb", descriptor = "Lclient!id;")
	public static Class34 aClass34_663 = Static9.method266("br");

	@OriginalMember(owner = "client!rd", name = "Hb", descriptor = "I")
	public static int anInt1322 = -1;

	@OriginalMember(owner = "client!rd", name = "Ib", descriptor = "[Lclient!id;")
	public static Class34[] aClass34Array10 = new Class34[100];

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method842(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method847(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([BIIIIII)V")
	public static void method852(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static111.anInt2638;
		@Pc(9) int local9 = Static111.anInt2638 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static111.anInt2641) {
			local20 = Static111.anInt2641 - arg2;
			arg4 -= local20;
			arg2 = Static111.anInt2641;
			local13 = local20 * arg3;
			local5 += local20 * Static111.anInt2638;
		}
		if (arg2 + arg4 > Static111.anInt2640) {
			arg4 -= arg2 + arg4 - Static111.anInt2640;
		}
		if (arg1 < Static111.anInt2639) {
			local20 = Static111.anInt2639 - arg1;
			arg3 -= local20;
			arg1 = Static111.anInt2639;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static111.anInt2642) {
			local20 = arg1 + arg3 - Static111.anInt2642;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method842(Static111.anIntArray333, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method853(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(Lclient!id;)Lclient!id;")
	public static Class34 method856(@OriginalArg(0) Class34 arg0) {
		@Pc(3) int local3 = arg0.method982();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray20[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class34 local28 = new Class34();
		local28.anInt1553 = local3 + local5;
		local28.aByteArray20 = new byte[local28.anInt1553];
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

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "([BIIIII)V")
	public static void method858(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static111.anInt2638;
		@Pc(9) int local9 = Static111.anInt2638 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static111.anInt2641) {
			local20 = Static111.anInt2641 - arg2;
			arg4 -= local20;
			arg2 = Static111.anInt2641;
			local13 = local20 * arg3;
			local5 += local20 * Static111.anInt2638;
		}
		if (arg2 + arg4 > Static111.anInt2640) {
			arg4 -= arg2 + arg4 - Static111.anInt2640;
		}
		if (arg1 < Static111.anInt2639) {
			local20 = Static111.anInt2639 - arg1;
			arg3 -= local20;
			arg1 = Static111.anInt2639;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static111.anInt2642) {
			local20 = arg1 + arg3 - Static111.anInt2642;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method853(Static111.anIntArray333, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
	public static void method862() {
		aClass34_661 = null;
		aClass34_659 = null;
		aClass34_660 = null;
		aClass34_663 = null;
		aClass34_655 = null;
		aClass34_650 = null;
		aClass34_652 = null;
		aClass34_657 = null;
		aClass34_658 = null;
		aClass34_654 = null;
		aClass34_662 = null;
		aClass34_649 = null;
		aClass34_656 = null;
		aClass34_653 = null;
		aClass34_651 = null;
		aClass1_Sub1_Sub2_Sub2Array5 = null;
		aRandom2 = null;
		aClass34Array10 = null;
	}
}
