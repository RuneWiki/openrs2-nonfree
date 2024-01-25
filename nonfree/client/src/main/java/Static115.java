import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_4 = new Class165(9, 0, 4, 1);

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method1422(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII)V")
	public static void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - local25 * (local29 - 1);
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg4 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		@Pc(84) int local84 = local52 * (arg4 - 1);
		Static298.method3977(arg3 - arg1, arg2, arg1 + arg3, Static194.anIntArrayArray28[arg0]);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local78;
					local7++;
					local64 += local56;
					local78 += local56;
				}
			}
			if (local48 < 0) {
				local48 += local78;
				local39 += local64;
				local78 += local56;
				local64 += local56;
				local7++;
			}
			local39 += -local84;
			local48 += -local72;
			local9--;
			local84 -= local52;
			local72 -= local52;
			@Pc(171) int local171 = arg0 - local9;
			@Pc(175) int local175 = local9 + arg0;
			@Pc(179) int local179 = arg3 + local7;
			@Pc(183) int local183 = arg3 - local7;
			Static298.method3977(local183, arg2, local179, Static194.anIntArrayArray28[local171]);
			Static298.method3977(local183, arg2, local179, Static194.anIntArrayArray28[local175]);
		}
	}
}
