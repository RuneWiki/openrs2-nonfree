import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cd", name = "zb", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array14;

	@OriginalMember(owner = "client!cd", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_769 = Static122.method531("shad=");

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "Lclient!sd;")
	public static Class73 aClass73_770 = Static122.method531("u=");

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Lclient!sd;")
	public static Class73 aClass73_771 = Static122.method531("img=");

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "Lclient!sd;")
	public static Class73 aClass73_772 = Static122.method531(")4col");

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
	public static int anInt1396 = -1;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_773 = Static122.method531("gt");

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_774 = Static122.method531(")4u");

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array10 = new Class73[100];

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_775 = Static122.method531("str=");

	@OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
	public static int anInt1398 = 0;

	@OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
	public static int anInt1399 = 256;

	@OriginalMember(owner = "client!cd", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_776 = Static122.method531("u");

	@OriginalMember(owner = "client!cd", name = "jb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_777 = Static122.method531(")4str");

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
	public static int anInt1401 = -1;

	@OriginalMember(owner = "client!cd", name = "mb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_778 = Static122.method531("str");

	@OriginalMember(owner = "client!cd", name = "qb", descriptor = "I")
	public static int anInt1403 = -1;

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!cd", name = "ub", descriptor = "Lclient!sd;")
	public static Class73 aClass73_779 = Static122.method531("lt");

	@OriginalMember(owner = "client!cd", name = "vb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_780 = Static122.method531("shad");

	@OriginalMember(owner = "client!cd", name = "wb", descriptor = "I")
	public static int anInt1405 = 0;

	@OriginalMember(owner = "client!cd", name = "xb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_781 = Static122.method531("col=");

	@OriginalMember(owner = "client!cd", name = "yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_782 = Static122.method531("br");

	@OriginalMember(owner = "client!cd", name = "Ab", descriptor = "I")
	public static int anInt1406 = -1;

	@OriginalMember(owner = "client!cd", name = "Bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_783 = Static122.method531(")4shad");

	@OriginalMember(owner = "client!cd", name = "Cb", descriptor = "I")
	public static int anInt1407 = 256;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!sd;)Lclient!sd;")
	public static Class73 method1055(@OriginalArg(0) Class73 arg0) {
		@Pc(3) int local3 = arg0.method2435();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray36[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class73 local28 = new Class73();
		local28.anInt3356 = local3 + local5;
		local28.aByteArray36 = new byte[local28.anInt3356];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray36[local42];
			if (local48 == 60) {
				local28.aByteArray36[local40++] = 60;
				local28.aByteArray36[local40++] = 108;
				local28.aByteArray36[local40++] = 116;
				local28.aByteArray36[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray36[local40++] = 60;
				local28.aByteArray36[local40++] = 103;
				local28.aByteArray36[local40++] = 116;
				local28.aByteArray36[local40++] = 62;
			} else {
				local28.aByteArray36[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()V")
	public static void method1061() {
		aClass73_779 = null;
		aClass73_773 = null;
		aClass73_771 = null;
		aClass73_782 = null;
		aClass73_781 = null;
		aClass73_772 = null;
		aClass73_770 = null;
		aClass73_776 = null;
		aClass73_774 = null;
		aClass73_769 = null;
		aClass73_780 = null;
		aClass73_783 = null;
		aClass73_775 = null;
		aClass73_778 = null;
		aClass73_777 = null;
		aClass3_Sub1_Sub3_Sub3Array14 = null;
		aClass73Array10 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method1074(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1080(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1081(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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
