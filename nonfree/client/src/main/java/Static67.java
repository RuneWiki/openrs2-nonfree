import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ie", name = "Z", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array5;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
	public static int anInt2854 = 256;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "Lclient!ea;")
	public static Class18 aClass18_706 = Static8.method128(")4shad");

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "Lclient!ea;")
	public static Class18 aClass18_707 = Static8.method128(")4u");

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "Lclient!ea;")
	public static Class18 aClass18_708 = Static8.method128("u=");

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Lclient!ea;")
	public static Class18 aClass18_709 = Static8.method128("br");

	@OriginalMember(owner = "client!ie", name = "X", descriptor = "Lclient!ea;")
	public static Class18 aClass18_710 = Static8.method128("gt");

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
	public static int anInt2855 = 0;

	@OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
	public static int anInt2856 = -1;

	@OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_711 = Static8.method128("u");

	@OriginalMember(owner = "client!ie", name = "db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_712 = Static8.method128("img=");

	@OriginalMember(owner = "client!ie", name = "eb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_713 = Static8.method128("col=");

	@OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
	public static int anInt2857 = -1;

	@OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
	public static int anInt2858 = 256;

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
	public static int anInt2859 = 0;

	@OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
	public static int anInt2860 = -1;

	@OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_714 = Static8.method128(")4str");

	@OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
	public static int anInt2862 = 0;

	@OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lclient!ea;")
	public static Class18 aClass18_715 = Static8.method128(")4col");

	@OriginalMember(owner = "client!ie", name = "qb", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array16 = new Class18[100];

	@OriginalMember(owner = "client!ie", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_716 = Static8.method128("lt");

	@OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
	public static int anInt2865 = 0;

	@OriginalMember(owner = "client!ie", name = "ub", descriptor = "Lclient!ea;")
	public static Class18 aClass18_717 = Static8.method128("str=");

	@OriginalMember(owner = "client!ie", name = "vb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_718 = Static8.method128("shad");

	@OriginalMember(owner = "client!ie", name = "wb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_719 = Static8.method128("shad=");

	@OriginalMember(owner = "client!ie", name = "yb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_720 = Static8.method128("str");

	@OriginalMember(owner = "client!ie", name = "Ab", descriptor = "I")
	public static int anInt2866 = -1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ea;)Lclient!ea;")
	public static Class18 method2014(@OriginalArg(0) Class18 arg0) {
		@Pc(3) int local3 = arg0.method747();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray6[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class18 local28 = new Class18();
		local28.anInt1129 = local3 + local5;
		local28.aByteArray6 = new byte[local28.anInt1129];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray6[local42];
			if (local48 == 60) {
				local28.aByteArray6[local40++] = 60;
				local28.aByteArray6[local40++] = 108;
				local28.aByteArray6[local40++] = 116;
				local28.aByteArray6[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray6[local40++] = 60;
				local28.aByteArray6[local40++] = 103;
				local28.aByteArray6[local40++] = 116;
				local28.aByteArray6[local40++] = 62;
			} else {
				local28.aByteArray6[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "()V")
	public static void method2022() {
		aClass18_716 = null;
		aClass18_710 = null;
		aClass18_712 = null;
		aClass18_709 = null;
		aClass18_713 = null;
		aClass18_715 = null;
		aClass18_708 = null;
		aClass18_711 = null;
		aClass18_707 = null;
		aClass18_719 = null;
		aClass18_718 = null;
		aClass18_706 = null;
		aClass18_717 = null;
		aClass18_720 = null;
		aClass18_714 = null;
		aClass1_Sub1_Sub8_Sub1Array5 = null;
		aClass18Array16 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method2029(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method2031(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2034(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
