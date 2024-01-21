import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ta", name = "pb", descriptor = "[Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3[] aClass1_Sub1_Sub2_Sub3Array5;

	@OriginalMember(owner = "client!ta", name = "db", descriptor = "I")
	public static int anInt956 = 256;

	@OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
	public static int anInt957 = -1;

	@OriginalMember(owner = "client!ta", name = "fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_574 = Static106.method1849(")4u");

	@OriginalMember(owner = "client!ta", name = "gb", descriptor = "I")
	public static int anInt958 = -1;

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_575 = Static106.method1849("shad=");

	@OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
	public static int anInt959 = 0;

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
	public static int anInt960 = 0;

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_576 = Static106.method1849("br");

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array4 = new Class66[100];

	@OriginalMember(owner = "client!ta", name = "ub", descriptor = "I")
	public static int anInt962 = 0;

	@OriginalMember(owner = "client!ta", name = "vb", descriptor = "I")
	public static int anInt963 = 256;

	@OriginalMember(owner = "client!ta", name = "wb", descriptor = "I")
	public static int anInt964 = -1;

	@OriginalMember(owner = "client!ta", name = "yb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_577 = Static106.method1849(")4col");

	@OriginalMember(owner = "client!ta", name = "zb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_578 = Static106.method1849(")4str");

	@OriginalMember(owner = "client!ta", name = "Ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_579 = Static106.method1849("shad");

	@OriginalMember(owner = "client!ta", name = "Cb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_580 = Static106.method1849("u");

	@OriginalMember(owner = "client!ta", name = "Db", descriptor = "I")
	public static int anInt966 = -1;

	@OriginalMember(owner = "client!ta", name = "Eb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_581 = Static106.method1849(")4shad");

	@OriginalMember(owner = "client!ta", name = "Fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_582 = Static106.method1849("col=");

	@OriginalMember(owner = "client!ta", name = "Gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_583 = Static106.method1849("lt");

	@OriginalMember(owner = "client!ta", name = "Hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_584 = Static106.method1849("str=");

	@OriginalMember(owner = "client!ta", name = "Ib", descriptor = "Lclient!sc;")
	public static Class66 aClass66_585 = Static106.method1849("str");

	@OriginalMember(owner = "client!ta", name = "Jb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_586 = Static106.method1849("u=");

	@OriginalMember(owner = "client!ta", name = "Kb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_587 = Static106.method1849("img=");

	@OriginalMember(owner = "client!ta", name = "Lb", descriptor = "I")
	public static int anInt967 = 0;

	@OriginalMember(owner = "client!ta", name = "Nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_588 = Static106.method1849("gt");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIIII)V")
	public static void method766(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static115.anInt2366;
		@Pc(9) int local9 = Static115.anInt2366 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static115.anInt2367) {
			local20 = Static115.anInt2367 - arg2;
			arg4 -= local20;
			arg2 = Static115.anInt2367;
			local13 = local20 * arg3;
			local5 += local20 * Static115.anInt2366;
		}
		if (arg2 + arg4 > Static115.anInt2368) {
			arg4 -= arg2 + arg4 - Static115.anInt2368;
		}
		if (arg1 < Static115.anInt2370) {
			local20 = Static115.anInt2370 - arg1;
			arg3 -= local20;
			arg1 = Static115.anInt2370;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static115.anInt2369) {
			local20 = arg1 + arg3 - Static115.anInt2369;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method770(Static115.anIntArray395, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method768(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
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

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIIIIII)V")
	public static void method769(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static115.anInt2366;
		@Pc(9) int local9 = Static115.anInt2366 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static115.anInt2367) {
			local20 = Static115.anInt2367 - arg2;
			arg4 -= local20;
			arg2 = Static115.anInt2367;
			local13 = local20 * arg3;
			local5 += local20 * Static115.anInt2366;
		}
		if (arg2 + arg4 > Static115.anInt2368) {
			arg4 -= arg2 + arg4 - Static115.anInt2368;
		}
		if (arg1 < Static115.anInt2370) {
			local20 = Static115.anInt2370 - arg1;
			arg3 -= local20;
			arg1 = Static115.anInt2370;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static115.anInt2369) {
			local20 = arg1 + arg3 - Static115.anInt2369;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method784(Static115.anIntArray395, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method770(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sc;)Lclient!sc;")
	public static Class66 method772(@OriginalArg(0) Class66 arg0) {
		@Pc(3) int local3 = arg0.method1847();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray29[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class66 local28 = new Class66();
		local28.anInt2583 = local3 + local5;
		local28.aByteArray29 = new byte[local28.anInt2583];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray29[local42];
			if (local48 == 60) {
				local28.aByteArray29[local40++] = 60;
				local28.aByteArray29[local40++] = 108;
				local28.aByteArray29[local40++] = 116;
				local28.aByteArray29[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray29[local40++] = 60;
				local28.aByteArray29[local40++] = 103;
				local28.aByteArray29[local40++] = 116;
				local28.aByteArray29[local40++] = 62;
			} else {
				local28.aByteArray29[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method784(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	public static void method786() {
		aClass66_583 = null;
		aClass66_588 = null;
		aClass66_587 = null;
		aClass66_576 = null;
		aClass66_582 = null;
		aClass66_577 = null;
		aClass66_586 = null;
		aClass66_580 = null;
		aClass66_574 = null;
		aClass66_575 = null;
		aClass66_579 = null;
		aClass66_581 = null;
		aClass66_584 = null;
		aClass66_585 = null;
		aClass66_578 = null;
		aClass1_Sub1_Sub2_Sub3Array5 = null;
		aClass66Array4 = null;
	}
}
