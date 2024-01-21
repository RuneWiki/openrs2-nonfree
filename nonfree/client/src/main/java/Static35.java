import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!e", name = "N", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array8;

	@OriginalMember(owner = "client!e", name = "J", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!e", name = "K", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array4 = new Class10[100];

	@OriginalMember(owner = "client!e", name = "L", descriptor = "Lclient!cd;")
	public static Class10 aClass10_302 = Static51.method932("gt");

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	public static int anInt632 = 0;

	@OriginalMember(owner = "client!e", name = "P", descriptor = "I")
	public static int anInt633 = 256;

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_303 = Static51.method932("col=");

	@OriginalMember(owner = "client!e", name = "R", descriptor = "Lclient!cd;")
	public static Class10 aClass10_304 = Static51.method932("str=");

	@OriginalMember(owner = "client!e", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_305 = Static51.method932("str");

	@OriginalMember(owner = "client!e", name = "T", descriptor = "I")
	public static int anInt634 = 0;

	@OriginalMember(owner = "client!e", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_306 = Static51.method932(")4u");

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_307 = Static51.method932("img=");

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_308 = Static51.method932("lt");

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
	public static int anInt635 = -1;

	@OriginalMember(owner = "client!e", name = "cb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_309 = Static51.method932("u");

	@OriginalMember(owner = "client!e", name = "db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_310 = Static51.method932("shad=");

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_311 = Static51.method932(")4col");

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
	public static int anInt638 = 0;

	@OriginalMember(owner = "client!e", name = "hb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_312 = Static51.method932(")4shad");

	@OriginalMember(owner = "client!e", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_313 = Static51.method932(")4str");

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_314 = Static51.method932("shad");

	@OriginalMember(owner = "client!e", name = "mb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_315 = Static51.method932("u=");

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "I")
	public static int anInt640 = -1;

	@OriginalMember(owner = "client!e", name = "qb", descriptor = "I")
	public static int anInt641 = -1;

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
	public static int anInt642 = 256;

	@OriginalMember(owner = "client!e", name = "tb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_316 = Static51.method932("br");

	@OriginalMember(owner = "client!e", name = "ub", descriptor = "I")
	public static int anInt643 = -1;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method508(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public static void method511() {
		aClass10_308 = null;
		aClass10_302 = null;
		aClass10_307 = null;
		aClass10_316 = null;
		aClass10_303 = null;
		aClass10_311 = null;
		aClass10_315 = null;
		aClass10_309 = null;
		aClass10_306 = null;
		aClass10_310 = null;
		aClass10_314 = null;
		aClass10_312 = null;
		aClass10_304 = null;
		aClass10_305 = null;
		aClass10_313 = null;
		aClass2_Sub1_Sub4_Sub3Array8 = null;
		aClass10Array4 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method521(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Lclient!cd;)Lclient!cd;")
	public static Class10 method525(@OriginalArg(0) Class10 arg0) {
		@Pc(3) int local3 = arg0.method340();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray7[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class10 local28 = new Class10();
		local28.anInt513 = local3 + local5;
		local28.aByteArray7 = new byte[local28.anInt513];
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method530(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
