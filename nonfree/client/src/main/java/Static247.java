import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "[Lclient!tq;")
	public static Class318[] aClass318Array1;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
	public static boolean aBoolean361;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public static int anInt4639;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
	public static final int[] anIntArray283 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BIIIII)V")
	public static void method3983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(18) int local18 = arg3 * arg3;
		@Pc(22) int local22 = arg1 * arg1;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg1 << 1;
		@Pc(42) int local42 = local26 + (1 - local34) * local18;
		@Pc(51) int local51 = local22 - local30 * (local34 - 1);
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = local30 * ((arg1 << 1) - 3);
		@Pc(81) int local81 = local59;
		@Pc(99) int local99;
		@Pc(107) int local107;
		if (Static126.anInt6658 <= arg0 && arg0 <= Static494.anInt8295) {
			local99 = Static468.method6610(arg3 + arg2, Static487.anInt8210, Static278.anInt5111);
			local107 = Static468.method6610(arg2 - arg3, Static487.anInt8210, Static278.anInt5111);
			Static250.method4000(local99, Static478.anIntArrayArray51[arg0], local107, arg4);
		}
		@Pc(123) int local123 = local55 * (arg1 - 1);
		while (local14 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local51 += local81;
					local42 += local67;
					local67 += local59;
					local81 += local59;
					local12++;
				}
			}
			if (local51 < 0) {
				local42 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local12++;
			}
			local42 += -local123;
			local51 += -local75;
			local123 -= local55;
			local14--;
			local75 -= local55;
			local99 = arg0 - local14;
			local107 = arg0 + local14;
			if (Static126.anInt6658 <= local107 && local99 <= Static494.anInt8295) {
				@Pc(223) int local223 = Static468.method6610(arg2 + local12, Static487.anInt8210, Static278.anInt5111);
				@Pc(232) int local232 = Static468.method6610(arg2 - local12, Static487.anInt8210, Static278.anInt5111);
				if (Static126.anInt6658 <= local99) {
					Static250.method4000(local223, Static478.anIntArrayArray51[local99], local232, arg4);
				}
				if (Static494.anInt8295 >= local107) {
					Static250.method4000(local223, Static478.anIntArrayArray51[local107], local232, arg4);
				}
			}
		}
	}
}
