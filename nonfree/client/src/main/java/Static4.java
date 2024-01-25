import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "Lb", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_3 = new Class397(8, -1);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIIII)V")
	public static void method227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static134.method2372(arg3);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg3 - arg0;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg3;
		@Pc(23) int local23 = -arg3;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(39) int local39 = -1;
		@Pc(43) int[] local43 = Static118.anIntArrayArray7[arg1];
		@Pc(47) int local47 = arg4 - local14;
		@Pc(51) int local51 = arg4 + local14;
		Static202.method3077(local43, arg4 - arg3, arg2, local47);
		Static202.method3077(local43, local47, arg5, local51);
		Static202.method3077(local43, local51, arg2, arg4 + arg3);
		while (local20 > local10) {
			local39 += 2;
			local30 += 2;
			local23 += local30;
			local28 += local39;
			if (local28 >= 0 && local25 >= 1) {
				Static405.anIntArray483[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(130) int[] local130;
			@Pc(137) int[] local137;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(188) int local188;
			@Pc(192) int local192;
			@Pc(197) int local197;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local20 >= local14) {
					local130 = Static118.anIntArrayArray7[local20 + arg1];
					local137 = Static118.anIntArrayArray7[arg1 - local20];
					local142 = arg4 + local10;
					local147 = arg4 - local10;
					Static202.method3077(local130, local147, arg2, local142);
					Static202.method3077(local137, local147, arg2, local142);
				} else {
					local130 = Static118.anIntArrayArray7[arg1 + local20];
					local137 = Static118.anIntArrayArray7[arg1 - local20];
					local142 = Static405.anIntArray483[local20];
					local147 = local10 + arg4;
					local188 = arg4 - local10;
					local192 = arg4 + local142;
					local197 = arg4 - local142;
					Static202.method3077(local130, local188, arg2, local197);
					Static202.method3077(local130, local197, arg5, local192);
					Static202.method3077(local130, local192, arg2, local147);
					Static202.method3077(local137, local188, arg2, local197);
					Static202.method3077(local137, local197, arg5, local192);
					Static202.method3077(local137, local192, arg2, local147);
				}
			}
			local130 = Static118.anIntArrayArray7[arg1 + local10];
			local137 = Static118.anIntArrayArray7[arg1 - local10];
			local142 = local20 + arg4;
			local147 = arg4 - local20;
			if (local10 < local14) {
				local188 = local10 > local25 ? Static405.anIntArray483[local10] : local25;
				local192 = local188 + arg4;
				local197 = arg4 - local188;
				Static202.method3077(local130, local147, arg2, local197);
				Static202.method3077(local130, local197, arg5, local192);
				Static202.method3077(local130, local192, arg2, local142);
				Static202.method3077(local137, local147, arg2, local197);
				Static202.method3077(local137, local197, arg5, local192);
				Static202.method3077(local137, local192, arg2, local142);
			} else {
				Static202.method3077(local130, local147, arg2, local142);
				Static202.method3077(local137, local147, arg2, local142);
			}
		}
	}
}
