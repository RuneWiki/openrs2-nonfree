import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "[I")
	public static final int[] anIntArray400 = new int[8];

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(CLjava/lang/String;Z)I")
	public static int method5384(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)V")
	public static void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static60.aClass209_5.method5038((long) arg0) != null) {
			return;
		}
		if (Static132.aBoolean140) {
			@Pc(26) Class6_Sub34 local26 = new Class6_Sub34(arg0, new Class204_Sub1(4096, Static262.aClass8_96, arg0), arg2, arg1);
			local26.aClass204_Sub1_1.method6599(Static65.aStringArray12[Static616.anInt10077]);
			Static60.aClass209_5.method5035((long) arg0, local26);
		} else {
			Static247.method3616(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIB)V")
	public static void method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static154.method2176(arg1 + arg2, Static153.anInt2554, Static502.anInt8456);
		@Pc(39) int local39 = Static154.method2176(arg2 - arg1, Static153.anInt2554, Static502.anInt8456);
		Static270.method3998(arg3, local39, local22, Static173.anIntArrayArray15[arg0]);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(89) int local89;
			@Pc(97) int local97;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local67 = arg0 - local9;
				local71 = arg0 + local9;
				if (Static55.anInt4238 <= local71 && local67 <= Static292.anInt4921) {
					local89 = Static154.method2176(arg2 + local7, Static153.anInt2554, Static502.anInt8456);
					local97 = Static154.method2176(arg2 - local7, Static153.anInt2554, Static502.anInt8456);
					if (Static292.anInt4921 >= local71) {
						Static270.method3998(arg3, local97, local89, Static173.anIntArrayArray15[local71]);
					}
					if (local67 >= Static55.anInt4238) {
						Static270.method3998(arg3, local97, local89, Static173.anIntArrayArray15[local67]);
					}
				}
			}
			local7++;
			local67 = arg0 - local7;
			local71 = local7 + arg0;
			if (local71 >= Static55.anInt4238 && local67 <= Static292.anInt4921) {
				local89 = Static154.method2176(local9 + arg2, Static153.anInt2554, Static502.anInt8456);
				local97 = Static154.method2176(arg2 - local9, Static153.anInt2554, Static502.anInt8456);
				if (local71 <= Static292.anInt4921) {
					Static270.method3998(arg3, local97, local89, Static173.anIntArrayArray15[local71]);
				}
				if (local67 >= Static55.anInt4238) {
					Static270.method3998(arg3, local97, local89, Static173.anIntArrayArray15[local67]);
				}
			}
		}
	}
}
