import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
	public static int anInt4067;

	@OriginalMember(owner = "client!nm", name = "Z", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!nm", name = "db", descriptor = "I")
	public static int anInt4076;

	@OriginalMember(owner = "client!nm", name = "S", descriptor = "I")
	public static int anInt4068 = 0;

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
	public static int anInt4069 = -1;

	@OriginalMember(owner = "client!nm", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString118 = "skill: ";

	@OriginalMember(owner = "client!nm", name = "bb", descriptor = "I")
	public static int anInt4075 = 0;

	@OriginalMember(owner = "client!nm", name = "cb", descriptor = "[J")
	public static long[] aLongArray10 = new long[32];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!kb;ILclient!kb;)V")
	public static void method3274(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static146.aClass83_108 = arg0;
		Static189.aClass83_130 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIIIZI)V")
	public static void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg2 == arg3 && arg5 == arg7 && arg6 == arg4) {
			Static132.method2271(arg0, arg6, arg7, arg3, arg8);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg3;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(67) int local67 = arg6 + local46 - local58 - arg3;
		@Pc(77) int local77 = local38 + local54 - local42 - local42;
		@Pc(86) int local86 = local42 + arg7 - local54 - arg0;
		@Pc(96) int local96 = local58 + local50 - local46 - local46;
		@Pc(101) int local101 = local42 - local38;
		@Pc(106) int local106 = local46 - local50;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(117) int local117 = local108 * local108 >> 12;
			@Pc(123) int local123 = local108 * local117 >> 12;
			@Pc(127) int local127 = local86 * local123;
			@Pc(131) int local131 = local77 * local117;
			@Pc(135) int local135 = local96 * local117;
			@Pc(139) int local139 = local108 * local101;
			@Pc(143) int local143 = local123 * local67;
			@Pc(147) int local147 = local106 * local108;
			@Pc(159) int local159 = arg0 + (local127 + local131 + local139 >> 12);
			@Pc(171) int local171 = arg3 + (local143 + local135 + local147 >> 12);
			Static132.method2271(local32, local171, local159, local34, arg8);
			local34 = local171;
			local32 = local159;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIBII)V")
	public static void method3276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static31.anInt803; local3++) {
			if (Static129.anIntArray268[local3] + Static120.anIntArray298[local3] > arg0 && arg0 + arg3 > Static120.anIntArray298[local3] && Static144.anIntArray299[local3] + Static32.anIntArray89[local3] > arg1 && arg1 + arg2 > Static32.anIntArray89[local3]) {
				Static138.aBooleanArray13[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)V")
	public static void method3277(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 11);
		local8.method1189();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([[II)V")
	public static void method3279(@OriginalArg(0) int[][] arg0) {
		Static57.anIntArrayArray9 = arg0;
	}
}
