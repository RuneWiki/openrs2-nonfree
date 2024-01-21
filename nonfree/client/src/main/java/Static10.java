import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bb", name = "vb", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array6;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "Lclient!eh;")
	public static Class28 aClass28_708 = Static170.method3101(")4shad");

	@OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
	public static int anInt2305 = 256;

	@OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lclient!eh;")
	public static Class28 aClass28_709 = Static170.method3101(")4str");

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!eh;")
	public static Class28 aClass28_710 = Static170.method3101("lt");

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	public static int anInt2306 = -1;

	@OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
	public static int anInt2307 = 0;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "Lclient!eh;")
	public static Class28 aClass28_711 = Static170.method3101("euro");

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_712 = Static170.method3101("str");

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
	public static int anInt2309 = -1;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array14 = new Class28[100];

	@OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_713 = Static170.method3101("img=");

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_714 = Static170.method3101("shad=");

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!eh;")
	public static Class28 aClass28_715 = Static170.method3101("nbsp");

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_716 = Static170.method3101("times");

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_717 = Static170.method3101("gt");

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
	public static int anInt2312 = 0;

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_718 = Static170.method3101("u=");

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_719 = Static170.method3101("copy");

	@OriginalMember(owner = "client!bb", name = "pb", descriptor = "I")
	public static int anInt2313 = -1;

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_720 = Static170.method3101(")4u");

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_721 = Static170.method3101("u");

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	public static int anInt2314 = 0;

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
	public static int anInt2315 = -1;

	@OriginalMember(owner = "client!bb", name = "ub", descriptor = "Lclient!eh;")
	public static Class28 aClass28_722 = Static170.method3101("col=");

	@OriginalMember(owner = "client!bb", name = "wb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_723 = Static170.method3101("reg");

	@OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
	public static int anInt2316 = 0;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_724 = Static170.method3101("shad");

	@OriginalMember(owner = "client!bb", name = "Bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_725 = Static170.method3101("str=");

	@OriginalMember(owner = "client!bb", name = "Cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_726 = Static170.method3101(")4col");

	@OriginalMember(owner = "client!bb", name = "Db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_727 = Static170.method3101("br");

	@OriginalMember(owner = "client!bb", name = "Eb", descriptor = "I")
	public static int anInt2317 = 256;

	@OriginalMember(owner = "client!bb", name = "Fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_728 = Static170.method3101("shy");

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!eh;)Lclient!eh;")
	public static Class28 method1786(@OriginalArg(0) Class28 arg0) {
		@Pc(3) int local3 = arg0.method901();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray15[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class28 local28 = new Class28();
		local28.anInt1118 = local3 + local5;
		local28.aByteArray15 = new byte[local28.anInt1118];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray15[local42];
			if (local48 == 60) {
				local28.aByteArray15[local40++] = 60;
				local28.aByteArray15[local40++] = 108;
				local28.aByteArray15[local40++] = 116;
				local28.aByteArray15[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray15[local40++] = 60;
				local28.aByteArray15[local40++] = 103;
				local28.aByteArray15[local40++] = 116;
				local28.aByteArray15[local40++] = 62;
			} else {
				local28.aByteArray15[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1789(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()V")
	public static void method1797() {
		aClass28_710 = null;
		aClass28_717 = null;
		aClass28_715 = null;
		aClass28_728 = null;
		aClass28_716 = null;
		aClass28_711 = null;
		aClass28_719 = null;
		aClass28_723 = null;
		aClass28_713 = null;
		aClass28_727 = null;
		aClass28_722 = null;
		aClass28_726 = null;
		aClass28_718 = null;
		aClass28_721 = null;
		aClass28_720 = null;
		aClass28_714 = null;
		aClass28_724 = null;
		aClass28_708 = null;
		aClass28_725 = null;
		aClass28_712 = null;
		aClass28_709 = null;
		aClass3_Sub2_Sub2_Sub3Array6 = null;
		aClass28Array14 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1798(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1806(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
