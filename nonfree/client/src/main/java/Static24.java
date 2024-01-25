import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
	public static int anInt674;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "J")
	public static long aLong27;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIB)V")
	public static void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg2 * arg2;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg3 << 1;
		@Pc(46) int local46 = (1 - local37) * local21 + local29;
		@Pc(55) int local55 = local25 - (local37 - 1) * local33;
		@Pc(59) int local59 = local21 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = ((arg3 << 1) - 3) * local33;
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = (arg3 - 1) * local59;
		Static250.method4000(arg2 + arg4, Static478.anIntArrayArray51[arg0], arg4 - arg2, arg1);
		while (local17 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local46 += local71;
					local55 += local85;
					local71 += local63;
					local85 += local63;
					local7++;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local71 += local63;
				local7++;
				local85 += local63;
			}
			local46 += -local91;
			local55 += -local79;
			local17--;
			local91 -= local59;
			local79 -= local59;
			@Pc(173) int local173 = arg0 - local17;
			@Pc(178) int local178 = arg0 + local17;
			@Pc(182) int local182 = local7 + arg4;
			@Pc(187) int local187 = arg4 - local7;
			Static250.method4000(local182, Static478.anIntArrayArray51[local173], local187, arg1);
			Static250.method4000(local182, Static478.anIntArrayArray51[local178], local187, arg1);
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBIII)V")
	public static void method599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static393.anInt6806 == 1) {
			Static78.aClass10Array8[Static414.anInt7055 / 100].method7679(Static179.anInt3214 - 8, Static120.anInt2406 + -8);
		}
		if (Static393.anInt6806 == 2) {
			Static78.aClass10Array8[Static414.anInt7055 / 100 + 4].method7679(Static179.anInt3214 - 8, Static120.anInt2406 + -8);
		}
		Static161.method2497();
	}
}
