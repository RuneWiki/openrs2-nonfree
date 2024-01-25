import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
	public static int anInt6547;

	@OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
	public static int anInt6549;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt6543 = 13156520;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
	public static void method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg0 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(88) int local88 = (arg0 - 1) * local52;
		Static224.method5303(Static73.anIntArrayArray6[arg3], arg4 + arg1, arg2, arg1 - arg4);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local78;
					local39 += local64;
					local64 += local56;
					local7++;
					local78 += local56;
				}
			}
			if (local48 < 0) {
				local48 += local78;
				local39 += local64;
				local7++;
				local64 += local56;
				local78 += local56;
			}
			local48 += -local72;
			local39 += -local88;
			local72 -= local52;
			local88 -= local52;
			local9--;
			@Pc(175) int local175 = arg3 - local9;
			@Pc(179) int local179 = local9 + arg3;
			@Pc(183) int local183 = local7 + arg1;
			@Pc(188) int local188 = arg1 - local7;
			Static224.method5303(Static73.anIntArrayArray6[local175], local183, arg2, local188);
			Static224.method5303(Static73.anIntArrayArray6[local179], local183, arg2, local188);
		}
	}
}
