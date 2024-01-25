import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "B")
	public static byte aByte130;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_153 = new Class71(75, 3);

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[I")
	public static final int[] anIntArray624 = new int[14];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	public static int method8600() {
		return Static105.anInt2774 == 1 ? Static494.anInt8752 : Static553.anInt9617;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBIII)V")
	public static void method8601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(22) int local22 = arg0 * arg0;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local13 << 1;
		@Pc(34) int local34 = arg0 << 1;
		@Pc(43) int local43 = local26 + (1 - local34) * local13;
		@Pc(52) int local52 = local22 - (local34 - 1) * local30;
		@Pc(56) int local56 = local13 << 2;
		@Pc(60) int local60 = local22 << 2;
		@Pc(68) int local68 = local26 * 3;
		@Pc(76) int local76 = ((arg0 << 1) - 3) * local30;
		@Pc(82) int local82 = local60;
		@Pc(88) int local88 = (arg0 - 1) * local56;
		@Pc(102) int local102;
		@Pc(111) int local111;
		if (Static444.anInt8258 <= arg4 && Static188.anInt4410 >= arg4) {
			local102 = Static132.method2911(Static251.anInt9634, arg1 + arg3, Static366.anInt6946);
			local111 = Static132.method2911(Static251.anInt9634, arg1 - arg3, Static366.anInt6946);
			Static36.method1264(Static632.anIntArrayArray65[arg4], local111, arg2, local102);
		}
		while (local9 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local52 += local82;
					local43 += local68;
					local68 += local60;
					local82 += local60;
					local7++;
				}
			}
			if (local52 < 0) {
				local52 += local82;
				local43 += local68;
				local68 += local60;
				local7++;
				local82 += local60;
			}
			local52 += -local76;
			local43 += -local88;
			local88 -= local56;
			local9--;
			local76 -= local56;
			local102 = arg4 - local9;
			local111 = local9 + arg4;
			if (local111 >= Static444.anInt8258 && local102 <= Static188.anInt4410) {
				@Pc(212) int local212 = Static132.method2911(Static251.anInt9634, local7 + arg1, Static366.anInt6946);
				@Pc(221) int local221 = Static132.method2911(Static251.anInt9634, arg1 - local7, Static366.anInt6946);
				if (local102 >= Static444.anInt8258) {
					Static36.method1264(Static632.anIntArrayArray65[local102], local221, arg2, local212);
				}
				if (Static188.anInt4410 >= local111) {
					Static36.method1264(Static632.anIntArrayArray65[local111], local221, arg2, local212);
				}
			}
		}
	}
}
