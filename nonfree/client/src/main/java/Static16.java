import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	public static int anInt769 = 0;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "Lclient!lf;")
	public static Class49 aClass49_395 = Static32.method683("img=");

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "Lclient!lf;")
	public static Class49 aClass49_396 = Static32.method683(")4trans");

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_397 = Static32.method683(")4u");

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_398 = Static32.method683(")4shad");

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "I")
	public static int anInt771 = 0;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public static int anInt772 = -1;

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_399 = Static32.method683("str");

	@OriginalMember(owner = "client!bf", name = "Y", descriptor = "I")
	public static int anInt773 = -1;

	@OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_400 = Static32.method683(")4col");

	@OriginalMember(owner = "client!bf", name = "eb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_401 = Static32.method683("shad");

	@OriginalMember(owner = "client!bf", name = "fb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_402 = Static32.method683("u");

	@OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
	public static int anInt775 = -1;

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_403 = Static32.method683("euro");

	@OriginalMember(owner = "client!bf", name = "ib", descriptor = "Lclient!lf;")
	public static Class49 aClass49_404 = Static32.method683("u=");

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_405 = Static32.method683("shad=");

	@OriginalMember(owner = "client!bf", name = "kb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_406 = Static32.method683("lt");

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_407 = Static32.method683("reg");

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_408 = Static32.method683("col=");

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_409 = Static32.method683("gt");

	@OriginalMember(owner = "client!bf", name = "ob", descriptor = "I")
	public static int anInt776 = 256;

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_410 = Static32.method683("trans=");

	@OriginalMember(owner = "client!bf", name = "qb", descriptor = "I")
	public static int anInt777 = 0;

	@OriginalMember(owner = "client!bf", name = "rb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_411 = Static32.method683("str=");

	@OriginalMember(owner = "client!bf", name = "sb", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!bf", name = "ub", descriptor = "I")
	public static int anInt779 = -1;

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_412 = Static32.method683(")4str");

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_413 = Static32.method683("times");

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "I")
	public static int anInt780 = 256;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_414 = Static32.method683("shy");

	@OriginalMember(owner = "client!bf", name = "Ab", descriptor = "Lclient!lf;")
	public static Class49 aClass49_415 = Static32.method683("nbsp");

	@OriginalMember(owner = "client!bf", name = "Cb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_416 = Static32.method683("br");

	@OriginalMember(owner = "client!bf", name = "Db", descriptor = "Lclient!lf;")
	public static Class49 aClass49_417 = Static32.method683("copy");

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array5 = new Class49[100];

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!lf;)Lclient!lf;")
	public static Class49 method618(@OriginalArg(0) Class49 arg0) {
		@Pc(3) int local3 = arg0.method1653();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray28[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class49 local28 = new Class49();
		local28.anInt2058 = local3 + local5;
		local28.aByteArray28 = new byte[local28.anInt2058];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray28[local42];
			if (local48 == 60) {
				local28.aByteArray28[local40++] = 60;
				local28.aByteArray28[local40++] = 108;
				local28.aByteArray28[local40++] = 116;
				local28.aByteArray28[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray28[local40++] = 60;
				local28.aByteArray28[local40++] = 103;
				local28.aByteArray28[local40++] = 116;
				local28.aByteArray28[local40++] = 62;
			} else {
				local28.aByteArray28[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method632(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method634(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
	public static void method635() {
		aClass49_406 = null;
		aClass49_409 = null;
		aClass49_415 = null;
		aClass49_414 = null;
		aClass49_413 = null;
		aClass49_403 = null;
		aClass49_417 = null;
		aClass49_407 = null;
		aClass49_395 = null;
		aClass49_416 = null;
		aClass49_408 = null;
		aClass49_400 = null;
		aClass49_410 = null;
		aClass49_396 = null;
		aClass49_404 = null;
		aClass49_402 = null;
		aClass49_397 = null;
		aClass49_405 = null;
		aClass49_401 = null;
		aClass49_398 = null;
		aClass49_411 = null;
		aClass49_399 = null;
		aClass49_412 = null;
		aClass49Array5 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method636(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
