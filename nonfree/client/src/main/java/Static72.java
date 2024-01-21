import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array4;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "Lclient!fc;")
	public static Class25 aClass25_710 = Static78.method1313("shad");

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "Lclient!fc;")
	public static Class25 aClass25_711 = Static78.method1313(")4i");

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "Lclient!fc;")
	public static Class25 aClass25_712 = Static78.method1313(")4col");

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "Lclient!fc;")
	public static Class25 aClass25_713 = Static78.method1313(")4u");

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	public static int anInt1514 = 256;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	public static int anInt1515 = -1;

	@OriginalMember(owner = "client!ma", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_714 = Static78.method1313(")4b");

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_715 = Static78.method1313("str");

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
	public static int anInt1516 = 0;

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_716 = Static78.method1313("u=");

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_717 = Static78.method1313("str=");

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
	public static int anInt1517 = -1;

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
	public static int anInt1518 = -1;

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_718 = Static78.method1313("i");

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_719 = Static78.method1313("gt");

	@OriginalMember(owner = "client!ma", name = "nb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_720 = Static78.method1313("lt");

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "Lclient!fc;")
	public static Class25 aClass25_721 = Static78.method1313("shad=");

	@OriginalMember(owner = "client!ma", name = "pb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_722 = Static78.method1313(")4str");

	@OriginalMember(owner = "client!ma", name = "qb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_723 = Static78.method1313(")4shad");

	@OriginalMember(owner = "client!ma", name = "sb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_724 = Static78.method1313("b");

	@OriginalMember(owner = "client!ma", name = "tb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_725 = Static78.method1313("img=");

	@OriginalMember(owner = "client!ma", name = "vb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_726 = Static78.method1313("col=");

	@OriginalMember(owner = "client!ma", name = "wb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_727 = Static78.method1313("br");

	@OriginalMember(owner = "client!ma", name = "xb", descriptor = "I")
	public static int anInt1520 = 0;

	@OriginalMember(owner = "client!ma", name = "zb", descriptor = "I")
	public static int anInt1522 = -1;

	@OriginalMember(owner = "client!ma", name = "Ab", descriptor = "Lclient!fc;")
	public static Class25 aClass25_728 = Static78.method1313("u");

	@OriginalMember(owner = "client!ma", name = "Bb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ma", name = "Cb", descriptor = "I")
	public static int anInt1523 = 0;

	@OriginalMember(owner = "client!ma", name = "Db", descriptor = "I")
	public static int anInt1524 = 0;

	@OriginalMember(owner = "client!ma", name = "Eb", descriptor = "[Lclient!fc;")
	public static Class25[] aClass25Array8 = new Class25[100];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method1178(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIII)V")
	public static void method1185(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static128.anInt2749;
		@Pc(9) int local9 = Static128.anInt2749 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static128.anInt2750) {
			local20 = Static128.anInt2750 - arg2;
			arg4 -= local20;
			arg2 = Static128.anInt2750;
			local13 = local20 * arg3;
			local5 += local20 * Static128.anInt2749;
		}
		if (arg2 + arg4 > Static128.anInt2752) {
			arg4 -= arg2 + arg4 - Static128.anInt2752;
		}
		if (arg1 < Static128.anInt2751) {
			local20 = Static128.anInt2751 - arg1;
			arg3 -= local20;
			arg1 = Static128.anInt2751;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static128.anInt2753) {
			local20 = arg1 + arg3 - Static128.anInt2753;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1178(Static128.anIntArray476, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lclient!fc;)Lclient!fc;")
	public static Class25 method1188(@OriginalArg(0) Class25 arg0) {
		@Pc(3) int local3 = arg0.method762();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray15[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class25 local28 = new Class25();
		local28.anInt956 = local3 + local5;
		local28.aByteArray15 = new byte[local28.anInt956];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray15[local42];
			if (local48 == 60) {
				local28.aByteArray15[local40++] = 60;
				local28.aByteArray15[local40++] = 108;
				local28.aByteArray15[local40++] = 116;
				local28.aByteArray15[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray15[local40++] = 60;
				local28.aByteArray15[local40++] = 103;
				local28.aByteArray15[local40++] = 116;
				local28.aByteArray15[local40++] = 62;
			} else {
				local28.aByteArray15[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method1194(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()V")
	public static void method1195() {
		aClass25_720 = null;
		aClass25_719 = null;
		aClass25_725 = null;
		aClass25_727 = null;
		aClass25_726 = null;
		aClass25_712 = null;
		aClass25_724 = null;
		aClass25_714 = null;
		aClass25_718 = null;
		aClass25_711 = null;
		aClass25_716 = null;
		aClass25_728 = null;
		aClass25_713 = null;
		aClass25_721 = null;
		aClass25_710 = null;
		aClass25_723 = null;
		aClass25_717 = null;
		aClass25_715 = null;
		aClass25_722 = null;
		aClass1_Sub2_Sub2_Sub4Array4 = null;
		aRandom1 = null;
		aClass25Array8 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIIIIII)V")
	public static void method1199(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static128.anInt2749;
		@Pc(9) int local9 = Static128.anInt2749 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static128.anInt2750) {
			local20 = Static128.anInt2750 - arg2;
			arg4 -= local20;
			arg2 = Static128.anInt2750;
			local13 = local20 * arg3;
			local5 += local20 * Static128.anInt2749;
		}
		if (arg2 + arg4 > Static128.anInt2752) {
			arg4 -= arg2 + arg4 - Static128.anInt2752;
		}
		if (arg1 < Static128.anInt2751) {
			local20 = Static128.anInt2751 - arg1;
			arg3 -= local20;
			arg1 = Static128.anInt2751;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static128.anInt2753) {
			local20 = arg1 + arg3 - Static128.anInt2753;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method1194(Static128.anIntArray476, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
