import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "Cb", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array1;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
	public static int anInt140 = 0;

	@OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
	public static int anInt141 = -1;

	@OriginalMember(owner = "client!ad", name = "ab", descriptor = "Lclient!af;")
	public static Class5 aClass5_84 = Static45.method1937("u");

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "I")
	public static int anInt142 = -1;

	@OriginalMember(owner = "client!ad", name = "db", descriptor = "Lclient!af;")
	public static Class5 aClass5_85 = Static45.method1937(")4shad");

	@OriginalMember(owner = "client!ad", name = "fb", descriptor = "I")
	public static int anInt144 = 256;

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_86 = Static45.method1937("shad");

	@OriginalMember(owner = "client!ad", name = "hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_87 = Static45.method1937(")4b");

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "Lclient!af;")
	public static Class5 aClass5_88 = Static45.method1937("lt");

	@OriginalMember(owner = "client!ad", name = "jb", descriptor = "Lclient!af;")
	public static Class5 aClass5_89 = Static45.method1937("str");

	@OriginalMember(owner = "client!ad", name = "lb", descriptor = "Lclient!af;")
	public static Class5 aClass5_90 = Static45.method1937("i");

	@OriginalMember(owner = "client!ad", name = "mb", descriptor = "Lclient!af;")
	public static Class5 aClass5_91 = Static45.method1937(")4u");

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "Lclient!af;")
	public static Class5 aClass5_92 = Static45.method1937("b");

	@OriginalMember(owner = "client!ad", name = "ob", descriptor = "Lclient!af;")
	public static Class5 aClass5_93 = Static45.method1937("gt");

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "I")
	public static int anInt146 = 0;

	@OriginalMember(owner = "client!ad", name = "qb", descriptor = "Lclient!af;")
	public static Class5 aClass5_94 = Static45.method1937(")4i");

	@OriginalMember(owner = "client!ad", name = "rb", descriptor = "Lclient!af;")
	public static Class5 aClass5_95 = Static45.method1937("shad=");

	@OriginalMember(owner = "client!ad", name = "sb", descriptor = "I")
	public static int anInt147 = -1;

	@OriginalMember(owner = "client!ad", name = "tb", descriptor = "I")
	public static int anInt148 = 0;

	@OriginalMember(owner = "client!ad", name = "ub", descriptor = "I")
	public static int anInt149 = 0;

	@OriginalMember(owner = "client!ad", name = "vb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ad", name = "xb", descriptor = "I")
	public static int anInt150 = -1;

	@OriginalMember(owner = "client!ad", name = "yb", descriptor = "Lclient!af;")
	public static Class5 aClass5_96 = Static45.method1937("br");

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "Lclient!af;")
	public static Class5 aClass5_97 = Static45.method1937("u=");

	@OriginalMember(owner = "client!ad", name = "Ab", descriptor = "Lclient!af;")
	public static Class5 aClass5_98 = Static45.method1937(")4col");

	@OriginalMember(owner = "client!ad", name = "Db", descriptor = "Lclient!af;")
	public static Class5 aClass5_99 = Static45.method1937("str=");

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "Lclient!af;")
	public static Class5 aClass5_100 = Static45.method1937("col=");

	@OriginalMember(owner = "client!ad", name = "Gb", descriptor = "Lclient!af;")
	public static Class5 aClass5_101 = Static45.method1937(")4str");

	@OriginalMember(owner = "client!ad", name = "Hb", descriptor = "Lclient!af;")
	public static Class5 aClass5_102 = Static45.method1937("img=");

	@OriginalMember(owner = "client!ad", name = "Ib", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array1 = new Class5[100];

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([I[BIIIIIII)V")
	private static void method151(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
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

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([I[BIIIIIIII)V")
	private static void method155(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
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

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(Lclient!af;)Lclient!af;")
	public static Class5 method163(@OriginalArg(0) Class5 arg0) {
		@Pc(3) int local3 = arg0.method215();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray2[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class5 local28 = new Class5();
		local28.anInt178 = local3 + local5;
		local28.aByteArray2 = new byte[local28.anInt178];
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

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIIII)V")
	public static void method166(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static33.anInt2810;
		@Pc(9) int local9 = Static33.anInt2810 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static33.anInt2811) {
			local20 = Static33.anInt2811 - arg2;
			arg4 -= local20;
			arg2 = Static33.anInt2811;
			local13 = local20 * arg3;
			local5 += local20 * Static33.anInt2810;
		}
		if (arg2 + arg4 > Static33.anInt2806) {
			arg4 -= arg2 + arg4 - Static33.anInt2806;
		}
		if (arg1 < Static33.anInt2809) {
			local20 = Static33.anInt2809 - arg1;
			arg3 -= local20;
			arg1 = Static33.anInt2809;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static33.anInt2807) {
			local20 = arg1 + arg3 - Static33.anInt2807;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method151(Static33.anIntArray421, arg0, arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "()V")
	public static void method169() {
		aClass5_88 = null;
		aClass5_93 = null;
		aClass5_102 = null;
		aClass5_96 = null;
		aClass5_100 = null;
		aClass5_98 = null;
		aClass5_92 = null;
		aClass5_87 = null;
		aClass5_90 = null;
		aClass5_94 = null;
		aClass5_97 = null;
		aClass5_84 = null;
		aClass5_91 = null;
		aClass5_95 = null;
		aClass5_86 = null;
		aClass5_85 = null;
		aClass5_99 = null;
		aClass5_89 = null;
		aClass5_101 = null;
		aClass1_Sub3_Sub1_Sub3Array1 = null;
		aRandom1 = null;
		aClass5Array1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BIIIIII)V")
	public static void method174(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static33.anInt2810;
		@Pc(9) int local9 = Static33.anInt2810 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static33.anInt2811) {
			local20 = Static33.anInt2811 - arg2;
			arg4 -= local20;
			arg2 = Static33.anInt2811;
			local13 = local20 * arg3;
			local5 += local20 * Static33.anInt2810;
		}
		if (arg2 + arg4 > Static33.anInt2806) {
			arg4 -= arg2 + arg4 - Static33.anInt2806;
		}
		if (arg1 < Static33.anInt2809) {
			local20 = Static33.anInt2809 - arg1;
			arg3 -= local20;
			arg1 = Static33.anInt2809;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static33.anInt2807) {
			local20 = arg1 + arg3 - Static33.anInt2807;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			method155(Static33.anIntArray421, arg0, arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}
}
