import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] aClass5_Sub2_Sub1_Sub3Array13;

	@OriginalMember(owner = "client!b", name = "V", descriptor = "I")
	public static int anInt769 = 256;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_232 = Static129.method2060("shad");

	@OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
	public static int anInt771 = -1;

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "Lclient!r;")
	public static Class61 aClass61_233 = Static129.method2060("str");

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_234 = Static129.method2060("gt");

	@OriginalMember(owner = "client!b", name = "db", descriptor = "I")
	public static int anInt772 = -1;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_235 = Static129.method2060(")4shad");

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_236 = Static129.method2060(")4str");

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "Lclient!r;")
	public static Class61 aClass61_237 = Static129.method2060("u=");

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "[Lclient!r;")
	public static Class61[] aClass61Array5 = new Class61[100];

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_238 = Static129.method2060("col=");

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
	public static int anInt774 = 256;

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "Lclient!r;")
	public static Class61 aClass61_239 = Static129.method2060("shad=");

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "Lclient!r;")
	public static Class61 aClass61_240 = Static129.method2060(")4u");

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
	public static int anInt777 = -1;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_241 = Static129.method2060(")4col");

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "Lclient!r;")
	public static Class61 aClass61_242 = Static129.method2060("str=");

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "Lclient!r;")
	public static Class61 aClass61_243 = Static129.method2060("br");

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
	public static int anInt780 = -1;

	@OriginalMember(owner = "client!b", name = "Bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_244 = Static129.method2060("img=");

	@OriginalMember(owner = "client!b", name = "Cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_245 = Static129.method2060("u");

	@OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
	public static int anInt781 = 0;

	@OriginalMember(owner = "client!b", name = "Eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_246 = Static129.method2060("lt");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method549(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()V")
	public static void method557() {
		aClass61_246 = null;
		aClass61_234 = null;
		aClass61_244 = null;
		aClass61_243 = null;
		aClass61_238 = null;
		aClass61_241 = null;
		aClass61_237 = null;
		aClass61_245 = null;
		aClass61_240 = null;
		aClass61_239 = null;
		aClass61_232 = null;
		aClass61_235 = null;
		aClass61_242 = null;
		aClass61_233 = null;
		aClass61_236 = null;
		aClass5_Sub2_Sub1_Sub3Array13 = null;
		aClass61Array5 = null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method559(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method563(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!r;)Lclient!r;")
	public static Class61 method570(@OriginalArg(0) Class61 arg0) {
		@Pc(3) int local3 = arg0.method1733();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray38[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class61 local28 = new Class61();
		local28.anInt2675 = local3 + local5;
		local28.aByteArray38 = new byte[local28.anInt2675];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray38[local42];
			if (local48 == 60) {
				local28.aByteArray38[local40++] = 60;
				local28.aByteArray38[local40++] = 108;
				local28.aByteArray38[local40++] = 116;
				local28.aByteArray38[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray38[local40++] = 60;
				local28.aByteArray38[local40++] = 103;
				local28.aByteArray38[local40++] = 116;
				local28.aByteArray38[local40++] = 62;
			} else {
				local28.aByteArray38[local40++] = local48;
			}
		}
		return local28;
	}
}
