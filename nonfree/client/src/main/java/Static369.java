import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static final int anInt6529 = 52;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
	public static int anInt6535 = 2;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)Z")
	public static boolean method5394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public static void method5396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static370.method5402(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg5;
		@Pc(27) int local27 = -arg5;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(54) int local54;
		@Pc(62) int local62;
		@Pc(71) int local71;
		@Pc(79) int local79;
		if (Static126.anInt6658 <= arg1 && Static494.anInt8295 >= arg1) {
			@Pc(46) int[] local46 = Static478.anIntArrayArray51[arg1];
			local54 = Static468.method6610(arg4 - arg5, Static487.anInt8210, Static278.anInt5111);
			local62 = Static468.method6610(arg5 + arg4, Static487.anInt8210, Static278.anInt5111);
			local71 = Static468.method6610(arg4 - local15, Static487.anInt8210, Static278.anInt5111);
			local79 = Static468.method6610(local15 + arg4, Static487.anInt8210, Static278.anInt5111);
			Static250.method4000(local71, local46, local54, arg0);
			Static250.method4000(local79, local46, local71, arg3);
			Static250.method4000(local62, local46, local79, arg0);
		}
		while (local24 > local10) {
			local36 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static580.anIntArray626[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(235) int local235;
			@Pc(244) int local244;
			@Pc(251) int[] local251;
			@Pc(142) int local142;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local142 = arg1 - local24;
				local54 = arg1 + local24;
				if (local54 >= Static126.anInt6658 && Static494.anInt8295 >= local142) {
					if (local24 >= local15) {
						local62 = Static468.method6610(arg4 + local10, Static487.anInt8210, Static278.anInt5111);
						local71 = Static468.method6610(arg4 - local10, Static487.anInt8210, Static278.anInt5111);
						if (Static494.anInt8295 >= local54) {
							Static250.method4000(local62, Static478.anIntArrayArray51[local54], local71, arg0);
						}
						if (local142 >= Static126.anInt6658) {
							Static250.method4000(local62, Static478.anIntArrayArray51[local142], local71, arg0);
						}
					} else {
						local62 = Static580.anIntArray626[local24];
						local71 = Static468.method6610(arg4 + local10, Static487.anInt8210, Static278.anInt5111);
						local79 = Static468.method6610(arg4 - local10, Static487.anInt8210, Static278.anInt5111);
						local235 = Static468.method6610(local62 + arg4, Static487.anInt8210, Static278.anInt5111);
						local244 = Static468.method6610(arg4 - local62, Static487.anInt8210, Static278.anInt5111);
						if (local54 <= Static494.anInt8295) {
							local251 = Static478.anIntArrayArray51[local54];
							Static250.method4000(local244, local251, local79, arg0);
							Static250.method4000(local235, local251, local244, arg3);
							Static250.method4000(local71, local251, local235, arg0);
						}
						if (Static126.anInt6658 <= local142) {
							local251 = Static478.anIntArrayArray51[local142];
							Static250.method4000(local244, local251, local79, arg0);
							Static250.method4000(local235, local251, local244, arg3);
							Static250.method4000(local71, local251, local235, arg0);
						}
					}
				}
			}
			local142 = arg1 - local10;
			local54 = arg1 + local10;
			if (Static126.anInt6658 <= local54 && Static494.anInt8295 >= local142) {
				local62 = local24 + arg4;
				local71 = arg4 - local24;
				if (Static487.anInt8210 <= local62 && Static278.anInt5111 >= local71) {
					local62 = Static468.method6610(local62, Static487.anInt8210, Static278.anInt5111);
					local71 = Static468.method6610(local71, Static487.anInt8210, Static278.anInt5111);
					if (local15 <= local10) {
						if (local54 <= Static494.anInt8295) {
							Static250.method4000(local62, Static478.anIntArrayArray51[local54], local71, arg0);
						}
						if (Static126.anInt6658 <= local142) {
							Static250.method4000(local62, Static478.anIntArrayArray51[local142], local71, arg0);
						}
					} else {
						local79 = local10 > local29 ? Static580.anIntArray626[local10] : local29;
						local235 = Static468.method6610(local79 + arg4, Static487.anInt8210, Static278.anInt5111);
						local244 = Static468.method6610(arg4 - local79, Static487.anInt8210, Static278.anInt5111);
						if (Static494.anInt8295 >= local54) {
							local251 = Static478.anIntArrayArray51[local54];
							Static250.method4000(local244, local251, local71, arg0);
							Static250.method4000(local235, local251, local244, arg3);
							Static250.method4000(local62, local251, local235, arg0);
						}
						if (local142 >= Static126.anInt6658) {
							local251 = Static478.anIntArrayArray51[local142];
							Static250.method4000(local244, local251, local71, arg0);
							Static250.method4000(local235, local251, local244, arg3);
							Static250.method4000(local62, local251, local235, arg0);
						}
					}
				}
			}
		}
	}
}
