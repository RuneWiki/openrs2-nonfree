import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_576 = Static158.method3034("str=");

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_577 = Static158.method3034("shad");

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_578 = Static158.method3034("times");

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_579 = Static158.method3034("img=");

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_580 = Static158.method3034("str");

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	public static int anInt2248 = -1;

	@OriginalMember(owner = "client!nh", name = "R", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_581 = Static158.method3034("nbsp");

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_582 = Static158.method3034("col=");

	@OriginalMember(owner = "client!nh", name = "U", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_583 = Static158.method3034("gt");

	@OriginalMember(owner = "client!nh", name = "V", descriptor = "I")
	public static int anInt2249 = -1;

	@OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
	public static int anInt2250 = 256;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
	public static int anInt2251 = 0;

	@OriginalMember(owner = "client!nh", name = "ab", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_584 = Static158.method3034(")4str");

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_585 = Static158.method3034("u=");

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_586 = Static158.method3034("shy");

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "I")
	public static int anInt2253 = 0;

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_587 = Static158.method3034(")4col");

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_588 = Static158.method3034(")4shad");

	@OriginalMember(owner = "client!nh", name = "ib", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_589 = Static158.method3034("reg");

	@OriginalMember(owner = "client!nh", name = "kb", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array15 = new Class60[100];

	@OriginalMember(owner = "client!nh", name = "lb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_590 = Static158.method3034("trans=");

	@OriginalMember(owner = "client!nh", name = "mb", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!nh", name = "nb", descriptor = "I")
	public static int anInt2255 = -1;

	@OriginalMember(owner = "client!nh", name = "ob", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_591 = Static158.method3034("u");

	@OriginalMember(owner = "client!nh", name = "qb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_592 = Static158.method3034("shad=");

	@OriginalMember(owner = "client!nh", name = "rb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_593 = Static158.method3034("lt");

	@OriginalMember(owner = "client!nh", name = "sb", descriptor = "I")
	public static int anInt2257 = -1;

	@OriginalMember(owner = "client!nh", name = "tb", descriptor = "I")
	public static int anInt2258 = 256;

	@OriginalMember(owner = "client!nh", name = "ub", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_594 = Static158.method3034("copy");

	@OriginalMember(owner = "client!nh", name = "wb", descriptor = "I")
	public static int anInt2259 = 0;

	@OriginalMember(owner = "client!nh", name = "xb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_595 = Static158.method3034("euro");

	@OriginalMember(owner = "client!nh", name = "yb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_596 = Static158.method3034("br");

	@OriginalMember(owner = "client!nh", name = "zb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_597 = Static158.method3034(")4u");

	@OriginalMember(owner = "client!nh", name = "Bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_598 = Static158.method3034(")4trans");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ob;)Lclient!ob;")
	public static Class60 method1777(@OriginalArg(0) Class60 arg0) {
		@Pc(3) int local3 = arg0.method2673();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray39[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.anInt3466 = local3 + local5;
		local28.aByteArray39 = new byte[local28.anInt3466];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray39[local42];
			if (local48 == 60) {
				local28.aByteArray39[local40++] = 60;
				local28.aByteArray39[local40++] = 108;
				local28.aByteArray39[local40++] = 116;
				local28.aByteArray39[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray39[local40++] = 60;
				local28.aByteArray39[local40++] = 103;
				local28.aByteArray39[local40++] = 116;
				local28.aByteArray39[local40++] = 62;
			} else {
				local28.aByteArray39[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method1780(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method1787(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([I[BIIIIIII)V")
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
}
