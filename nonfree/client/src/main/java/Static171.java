import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
	public static int anInt3359;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt3365;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt3363 = 0;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "J")
	public static long aLong122 = 0L;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static226.method3512(arg2, Static98.anInt2007, Static213.anInt4452);
		@Pc(17) int local17 = Static226.method3512(arg5, Static98.anInt2007, Static213.anInt4452);
		@Pc(23) int local23 = Static226.method3512(arg4, Static29.anInt517, Static11.anInt170);
		@Pc(29) int local29 = Static226.method3512(arg0, Static29.anInt517, Static11.anInt170);
		@Pc(43) int local43 = Static226.method3512(arg2 + arg1, Static98.anInt2007, Static213.anInt4452);
		@Pc(52) int local52 = Static226.method3512(arg5 - arg1, Static98.anInt2007, Static213.anInt4452);
		@Pc(54) int local54;
		for (local54 = local11; local54 < local43; local54++) {
			Static273.method4257(local23, Static183.anIntArrayArray26[local54], arg3, local29);
		}
		for (local54 = local17; local54 > local52; local54--) {
			Static273.method4257(local23, Static183.anIntArrayArray26[local54], arg3, local29);
		}
		@Pc(96) int local96 = Static226.method3512(arg4 + arg1, Static29.anInt517, Static11.anInt170);
		@Pc(105) int local105 = Static226.method3512(arg0 - arg1, Static29.anInt517, Static11.anInt170);
		for (local54 = local43; local54 <= local52; local54++) {
			@Pc(114) int[] local114 = Static183.anIntArrayArray26[local54];
			Static273.method4257(local23, local114, arg3, local96);
			Static273.method4257(local96, local114, arg6, local105);
			Static273.method4257(local105, local114, arg3, local29);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method2900() {
		Static296.aClass187_148.method4530();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 method2901() {
		@Pc(21) int local21 = Static160.anIntArray267[0] * Static235.anIntArray468[0];
		@Pc(25) byte[] local25 = Static69.aByteArrayArray15[0];
		@Pc(69) Class1_Sub2_Sub1_Sub2 local69;
		if (Static168.aBooleanArray14[0]) {
			@Pc(75) byte[] local75 = Static169.aByteArrayArray7[0];
			@Pc(78) int[] local78 = new int[local21];
			for (@Pc(80) int local80 = 0; local80 < local21; local80++) {
				local78[local80] = Static83.anIntArray144[local25[local80] & 0xFF] | (local75[local80] & 0xFF) << 24;
			}
			local69 = new Class1_Sub2_Sub1_Sub2_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], local78);
		} else {
			@Pc(32) int[] local32 = new int[local21];
			for (@Pc(34) int local34 = 0; local34 < local21; local34++) {
				local32[local34] = Static83.anIntArray144[local25[local34] & 0xFF];
			}
			local69 = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], local32);
		}
		Static117.method2101();
		return local69;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class91 local3 = new Class91();
		local3.anInt2874 = arg1 / 128;
		local3.anInt2883 = arg2 / 128;
		local3.anInt2875 = arg3 / 128;
		local3.anInt2886 = arg4 / 128;
		local3.anInt2891 = arg0;
		local3.anInt2878 = arg1;
		local3.anInt2873 = arg2;
		local3.anInt2877 = arg3;
		local3.anInt2888 = arg4;
		local3.anInt2887 = arg5;
		local3.anInt2884 = arg6;
		Static255.aClass91Array2[Static116.anInt2465++] = local3;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBIIII)I")
	public static int method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(22) int local22 = arg4;
			arg4 = arg2;
			arg2 = local22;
		}
		if (local15 == 0) {
			return arg5;
		} else if (local15 == 1) {
			return 1 + 7 - arg4 - arg0;
		} else if (local15 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg0;
		}
	}
}
