import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!n", name = "tb", descriptor = "[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] aClass2_Sub2_Sub3_Sub3Array11;

	@OriginalMember(owner = "client!n", name = "W", descriptor = "Lclient!sg;")
	public static Class77 aClass77_683 = Static146.method2172("br");

	@OriginalMember(owner = "client!n", name = "X", descriptor = "Lclient!sg;")
	public static Class77 aClass77_684 = Static146.method2172(")4u");

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "Lclient!sg;")
	public static Class77 aClass77_685 = Static146.method2172("lt");

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "Lclient!sg;")
	public static Class77 aClass77_686 = Static146.method2172("gt");

	@OriginalMember(owner = "client!n", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_687 = Static146.method2172(")4shad");

	@OriginalMember(owner = "client!n", name = "db", descriptor = "I")
	public static int anInt1740 = -1;

	@OriginalMember(owner = "client!n", name = "fb", descriptor = "I")
	public static int anInt1741 = -1;

	@OriginalMember(owner = "client!n", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_688 = Static146.method2172("str=");

	@OriginalMember(owner = "client!n", name = "jb", descriptor = "I")
	public static int anInt1742 = 0;

	@OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
	public static int anInt1743 = 256;

	@OriginalMember(owner = "client!n", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_689 = Static146.method2172("img=");

	@OriginalMember(owner = "client!n", name = "nb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_690 = Static146.method2172(")4col");

	@OriginalMember(owner = "client!n", name = "ob", descriptor = "Lclient!sg;")
	public static Class77 aClass77_691 = Static146.method2172("col=");

	@OriginalMember(owner = "client!n", name = "pb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_692 = Static146.method2172("u");

	@OriginalMember(owner = "client!n", name = "qb", descriptor = "I")
	public static int anInt1745 = 0;

	@OriginalMember(owner = "client!n", name = "ub", descriptor = "I")
	public static int anInt1747 = 256;

	@OriginalMember(owner = "client!n", name = "vb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array13 = new Class77[100];

	@OriginalMember(owner = "client!n", name = "wb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_693 = Static146.method2172("shad");

	@OriginalMember(owner = "client!n", name = "xb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_694 = Static146.method2172(")4str");

	@OriginalMember(owner = "client!n", name = "zb", descriptor = "I")
	public static int anInt1749 = -1;

	@OriginalMember(owner = "client!n", name = "Ab", descriptor = "I")
	public static int anInt1750 = -1;

	@OriginalMember(owner = "client!n", name = "Bb", descriptor = "I")
	public static int anInt1751 = 0;

	@OriginalMember(owner = "client!n", name = "Cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_695 = Static146.method2172("str");

	@OriginalMember(owner = "client!n", name = "Db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_696 = Static146.method2172("shad=");

	@OriginalMember(owner = "client!n", name = "Eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_697 = Static146.method2172("u=");

	@OriginalMember(owner = "client!n", name = "Fb", descriptor = "I")
	public static int anInt1752 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1267(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1271(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1273(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
	public static void method1275() {
		aClass77_685 = null;
		aClass77_686 = null;
		aClass77_689 = null;
		aClass77_683 = null;
		aClass77_691 = null;
		aClass77_690 = null;
		aClass77_697 = null;
		aClass77_692 = null;
		aClass77_684 = null;
		aClass77_696 = null;
		aClass77_693 = null;
		aClass77_687 = null;
		aClass77_688 = null;
		aClass77_695 = null;
		aClass77_694 = null;
		aClass2_Sub2_Sub3_Sub3Array11 = null;
		aClass77Array13 = null;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(Lclient!sg;)Lclient!sg;")
	public static Class77 method1279(@OriginalArg(0) Class77 arg0) {
		@Pc(3) int local3 = arg0.method2532();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray46[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class77 local28 = new Class77();
		local28.anInt3606 = local3 + local5;
		local28.aByteArray46 = new byte[local28.anInt3606];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray46[local42];
			if (local48 == 60) {
				local28.aByteArray46[local40++] = 60;
				local28.aByteArray46[local40++] = 108;
				local28.aByteArray46[local40++] = 116;
				local28.aByteArray46[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray46[local40++] = 60;
				local28.aByteArray46[local40++] = 103;
				local28.aByteArray46[local40++] = 116;
				local28.aByteArray46[local40++] = 62;
			} else {
				local28.aByteArray46[local40++] = local48;
			}
		}
		return local28;
	}
}
