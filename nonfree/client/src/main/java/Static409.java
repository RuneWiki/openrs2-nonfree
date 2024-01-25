import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "Lclient!pq;")
	public static Class251 aClass251_36;

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_45 = new Class40(17, 8);

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "[I")
	public static final int[] anIntArray255 = new int[2048];

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)I")
	public static int method1599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + ((arg1 >>> 31) + arg1) % arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIII)V")
	public static void method1600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(45) int local45 = local17 - (local29 - 1) * local25;
		@Pc(49) int local49 = local13 << 2;
		@Pc(53) int local53 = local17 << 2;
		@Pc(61) int local61 = local21 * 3;
		@Pc(69) int local69 = local25 * ((arg2 << 1) - 3);
		@Pc(80) int local80 = local53;
		Static455.method6536(arg0 + arg1, -arg1 + arg0, arg4, Static503.anIntArrayArray12[arg3]);
		@Pc(99) int local99 = local49 * (arg2 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local61;
					local45 += local80;
					local61 += local53;
					local7++;
					local80 += local53;
				}
			}
			if (local45 < 0) {
				local37 += local61;
				local45 += local80;
				local80 += local53;
				local7++;
				local61 += local53;
			}
			local37 += -local99;
			local45 += -local69;
			local9--;
			local99 -= local49;
			local69 -= local49;
			@Pc(170) int local170 = arg3 - local9;
			@Pc(175) int local175 = arg3 + local9;
			@Pc(179) int local179 = local7 + arg0;
			@Pc(184) int local184 = arg0 - local7;
			Static455.method6536(local179, local184, arg4, Static503.anIntArrayArray12[local170]);
			Static455.method6536(local179, local184, arg4, Static503.anIntArrayArray12[local175]);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)Z")
	public static boolean method1601() {
		return Static43.aBoolean27;
	}
}
