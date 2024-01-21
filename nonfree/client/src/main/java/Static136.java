import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "[Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4[] aClass1_Sub1_Sub12_Sub4Array10;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public static int anInt4230 = -1;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1612 = Static169.method2903("gt");

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1613 = Static169.method2903("shad");

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1614 = Static169.method2903("u");

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1615 = Static169.method2903("u=");

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public static int anInt4231 = -1;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
	public static int anInt4232 = 256;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1616 = Static169.method2903(")4u");

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1617 = Static169.method2903("str");

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
	public static int anInt4233 = 0;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1618 = Static169.method2903(")4shad");

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
	public static int anInt4234 = 0;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1619 = Static169.method2903("img=");

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	public static int anInt4235 = -1;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array23 = new Class23[100];

	@OriginalMember(owner = "client!qf", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1620 = Static169.method2903("br");

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
	public static int anInt4237 = 256;

	@OriginalMember(owner = "client!qf", name = "mb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1621 = Static169.method2903(")4str");

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1622 = Static169.method2903("lt");

	@OriginalMember(owner = "client!qf", name = "pb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1623 = Static169.method2903(")4col");

	@OriginalMember(owner = "client!qf", name = "rb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1624 = Static169.method2903("col=");

	@OriginalMember(owner = "client!qf", name = "tb", descriptor = "I")
	public static int anInt4239 = -1;

	@OriginalMember(owner = "client!qf", name = "ub", descriptor = "I")
	public static int anInt4240 = 0;

	@OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
	public static int anInt4241 = 0;

	@OriginalMember(owner = "client!qf", name = "wb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1625 = Static169.method2903("shad=");

	@OriginalMember(owner = "client!qf", name = "xb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1626 = Static169.method2903("str=");

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	public static void method3043() {
		aClass23_1622 = null;
		aClass23_1612 = null;
		aClass23_1619 = null;
		aClass23_1620 = null;
		aClass23_1624 = null;
		aClass23_1623 = null;
		aClass23_1615 = null;
		aClass23_1614 = null;
		aClass23_1616 = null;
		aClass23_1625 = null;
		aClass23_1613 = null;
		aClass23_1618 = null;
		aClass23_1626 = null;
		aClass23_1617 = null;
		aClass23_1621 = null;
		aClass1_Sub1_Sub12_Sub4Array10 = null;
		aClass23Array23 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method3045(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Lclient!ed;)Lclient!ed;")
	public static Class23 method3049(@OriginalArg(0) Class23 arg0) {
		@Pc(3) int local3 = arg0.method642();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray10[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class23 local28 = new Class23();
		local28.anInt1053 = local3 + local5;
		local28.aByteArray10 = new byte[local28.anInt1053];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray10[local42];
			if (local48 == 60) {
				local28.aByteArray10[local40++] = 60;
				local28.aByteArray10[local40++] = 108;
				local28.aByteArray10[local40++] = 116;
				local28.aByteArray10[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray10[local40++] = 60;
				local28.aByteArray10[local40++] = 103;
				local28.aByteArray10[local40++] = 116;
				local28.aByteArray10[local40++] = 62;
			} else {
				local28.aByteArray10[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method3051(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method3054(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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
