import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!vh", name = "cb", descriptor = "[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] aClass2_Sub3_Sub2_Sub3Array9;

	@OriginalMember(owner = "client!vh", name = "G", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1092 = Static38.method685("shad");

	@OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
	public static int anInt3701 = 0;

	@OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
	public static int anInt3702 = -1;

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1093 = Static38.method685("br");

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1094 = Static38.method685("col=");

	@OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
	public static int anInt3704 = -1;

	@OriginalMember(owner = "client!vh", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1095 = Static38.method685("shad=");

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1096 = Static38.method685("str=");

	@OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
	public static int anInt3705 = 0;

	@OriginalMember(owner = "client!vh", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1097 = Static38.method685("img=");

	@OriginalMember(owner = "client!vh", name = "V", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1098 = Static38.method685("u=");

	@OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
	public static int anInt3706 = 0;

	@OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
	public static int anInt3707 = 256;

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
	public static int anInt3708 = -1;

	@OriginalMember(owner = "client!vh", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1099 = Static38.method685("u");

	@OriginalMember(owner = "client!vh", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1100 = Static38.method685(")4col");

	@OriginalMember(owner = "client!vh", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1101 = Static38.method685(")4u");

	@OriginalMember(owner = "client!vh", name = "eb", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array21 = new Class6[100];

	@OriginalMember(owner = "client!vh", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1102 = Static38.method685(")4str");

	@OriginalMember(owner = "client!vh", name = "jb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1103 = Static38.method685("gt");

	@OriginalMember(owner = "client!vh", name = "kb", descriptor = "I")
	public static int anInt3710 = -1;

	@OriginalMember(owner = "client!vh", name = "lb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1104 = Static38.method685(")4shad");

	@OriginalMember(owner = "client!vh", name = "mb", descriptor = "I")
	public static int anInt3711 = 0;

	@OriginalMember(owner = "client!vh", name = "ob", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1105 = Static38.method685("lt");

	@OriginalMember(owner = "client!vh", name = "pb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1106 = Static38.method685("str");

	@OriginalMember(owner = "client!vh", name = "qb", descriptor = "I")
	public static int anInt3713 = 256;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method2503(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "()V")
	public static void method2509() {
		aClass6_1105 = null;
		aClass6_1103 = null;
		aClass6_1097 = null;
		aClass6_1093 = null;
		aClass6_1094 = null;
		aClass6_1100 = null;
		aClass6_1098 = null;
		aClass6_1099 = null;
		aClass6_1101 = null;
		aClass6_1095 = null;
		aClass6_1092 = null;
		aClass6_1104 = null;
		aClass6_1096 = null;
		aClass6_1106 = null;
		aClass6_1102 = null;
		aClass2_Sub3_Sub2_Sub3Array9 = null;
		aClass6Array21 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ai;)Lclient!ai;")
	public static Class6 method2510(@OriginalArg(0) Class6 arg0) {
		@Pc(3) int local3 = arg0.method107();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray2[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class6 local28 = new Class6();
		local28.anInt165 = local3 + local5;
		local28.aByteArray2 = new byte[local28.anInt165];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray2[local42];
			if (local48 == 60) {
				local28.aByteArray2[local40++] = 60;
				local28.aByteArray2[local40++] = 108;
				local28.aByteArray2[local40++] = 116;
				local28.aByteArray2[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray2[local40++] = 60;
				local28.aByteArray2[local40++] = 103;
				local28.aByteArray2[local40++] = 116;
				local28.aByteArray2[local40++] = 62;
			} else {
				local28.aByteArray2[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method2526(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method2529(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
