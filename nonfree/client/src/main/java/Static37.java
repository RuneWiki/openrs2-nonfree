import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!gd", name = "Bb", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array2;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "Lclient!qf;")
	public static Class60 aClass60_491 = Static59.method1195(")4u");

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_492 = Static59.method1195("b");

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public static int anInt1248 = 0;

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_493 = Static59.method1195(")4str");

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_494 = Static59.method1195("shad=");

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
	public static int anInt1249 = -1;

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
	public static int anInt1250 = -1;

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_495 = Static59.method1195(")4shad");

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_496 = Static59.method1195("u");

	@OriginalMember(owner = "client!gd", name = "kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_497 = Static59.method1195("img=");

	@OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_498 = Static59.method1195("str=");

	@OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_499 = Static59.method1195(")4b");

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_500 = Static59.method1195("i");

	@OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lclient!qf;")
	public static Class60 aClass60_501 = Static59.method1195("shad");

	@OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
	public static int anInt1251 = 0;

	@OriginalMember(owner = "client!gd", name = "qb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gd", name = "rb", descriptor = "I")
	public static int anInt1252 = 0;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
	public static int anInt1253 = -1;

	@OriginalMember(owner = "client!gd", name = "ub", descriptor = "Lclient!qf;")
	public static Class60 aClass60_502 = Static59.method1195("gt");

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_503 = Static59.method1195("col=");

	@OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
	public static int anInt1254 = -1;

	@OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
	public static int anInt1255 = 0;

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_504 = Static59.method1195(")4i");

	@OriginalMember(owner = "client!gd", name = "Db", descriptor = "Lclient!qf;")
	public static Class60 aClass60_505 = Static59.method1195("u=");

	@OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_506 = Static59.method1195(")4col");

	@OriginalMember(owner = "client!gd", name = "Gb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_507 = Static59.method1195("lt");

	@OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
	public static int anInt1257 = 256;

	@OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_508 = Static59.method1195("str");

	@OriginalMember(owner = "client!gd", name = "Kb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_509 = Static59.method1195("br");

	@OriginalMember(owner = "client!gd", name = "Lb", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array3 = new Class60[100];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!qf;)Lclient!qf;")
	public static Class60 method834(@OriginalArg(0) Class60 arg0) {
		@Pc(3) int local3 = arg0.method1836();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray73[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class60 local28 = new Class60();
		local28.anInt2817 = local3 + local5;
		local28.aByteArray73 = new byte[local28.anInt2817];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray73[local42];
			if (local48 == 60) {
				local28.aByteArray73[local40++] = 60;
				local28.aByteArray73[local40++] = 108;
				local28.aByteArray73[local40++] = 116;
				local28.aByteArray73[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray73[local40++] = 60;
				local28.aByteArray73[local40++] = 103;
				local28.aByteArray73[local40++] = 116;
				local28.aByteArray73[local40++] = 62;
			} else {
				local28.aByteArray73[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIIII)V")
	public static void method837(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static40.anInt2854;
		@Pc(9) int local9 = Static40.anInt2854 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static40.anInt2852) {
			local20 = Static40.anInt2852 - arg2;
			arg4 -= local20;
			arg2 = Static40.anInt2852;
			local13 = local20 * arg3;
			local5 += local20 * Static40.anInt2854;
		}
		if (arg2 + arg4 > Static40.anInt2851) {
			arg4 -= arg2 + arg4 - Static40.anInt2851;
		}
		if (arg1 < Static40.anInt2855) {
			local20 = Static40.anInt2855 - arg1;
			arg3 -= local20;
			arg1 = Static40.anInt2855;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static40.anInt2856) {
			local20 = arg1 + arg3 - Static40.anInt2856;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method853(Static40.anIntArray304, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method840(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
	public static void method843() {
		aClass60_507 = null;
		aClass60_502 = null;
		aClass60_497 = null;
		aClass60_509 = null;
		aClass60_503 = null;
		aClass60_506 = null;
		aClass60_492 = null;
		aClass60_499 = null;
		aClass60_500 = null;
		aClass60_504 = null;
		aClass60_505 = null;
		aClass60_496 = null;
		aClass60_491 = null;
		aClass60_494 = null;
		aClass60_501 = null;
		aClass60_495 = null;
		aClass60_498 = null;
		aClass60_508 = null;
		aClass60_493 = null;
		aClass3_Sub1_Sub2_Sub4Array2 = null;
		aRandom1 = null;
		aClass60Array3 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIII)V")
	public static void method851(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static40.anInt2854;
		@Pc(9) int local9 = Static40.anInt2854 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static40.anInt2852) {
			local20 = Static40.anInt2852 - arg2;
			arg4 -= local20;
			arg2 = Static40.anInt2852;
			local13 = local20 * arg3;
			local5 += local20 * Static40.anInt2854;
		}
		if (arg2 + arg4 > Static40.anInt2851) {
			arg4 -= arg2 + arg4 - Static40.anInt2851;
		}
		if (arg1 < Static40.anInt2855) {
			local20 = Static40.anInt2855 - arg1;
			arg3 -= local20;
			arg1 = Static40.anInt2855;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static40.anInt2856) {
			local20 = arg1 + arg3 - Static40.anInt2856;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method840(Static40.anIntArray304, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method853(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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
