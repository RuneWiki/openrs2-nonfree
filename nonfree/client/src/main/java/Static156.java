import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "[Lclient!gu;")
	public static Class143[] aClass143Array1;

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "[Lclient!eu;")
	public static Class105[] aClass105Array1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
	public static final int[] anIntArray148 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V")
	public static void method2238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(22) int local22 = arg4 * arg4;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local13 << 1;
		@Pc(34) int local34 = arg4 << 1;
		@Pc(42) int local42 = local26 + (1 - local34) * local13;
		@Pc(50) int local50 = local22 - (local34 - 1) * local30;
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local22 << 2;
		@Pc(66) int local66 = local26 * 3;
		@Pc(74) int local74 = local30 * ((arg4 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = (arg4 - 1) * local54;
		Static240.method4038(arg2 + arg3, Static144.anIntArrayArray30[arg1], arg0, arg3 - arg2);
		while (local9 > 0) {
			if (local42 < 0) {
				while (local42 < 0) {
					local42 += local66;
					local50 += local80;
					local66 += local58;
					local7++;
					local80 += local58;
				}
			}
			if (local50 < 0) {
				local50 += local80;
				local42 += local66;
				local66 += local58;
				local7++;
				local80 += local58;
			}
			local42 += -local86;
			local50 += -local74;
			local9--;
			local86 -= local54;
			local74 -= local54;
			@Pc(174) int local174 = arg1 - local9;
			@Pc(179) int local179 = arg1 + local9;
			@Pc(183) int local183 = arg3 + local7;
			@Pc(188) int local188 = arg3 - local7;
			Static240.method4038(local183, Static144.anIntArrayArray30[local174], arg0, local188);
			Static240.method4038(local183, Static144.anIntArrayArray30[local179], arg0, local188);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)[B")
	public static byte[] method2242(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static691.method82(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
