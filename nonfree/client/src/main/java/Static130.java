import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
	public static int anInt7192;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_139 = new Class56(114, -2);

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_140 = new Class56(19, -2);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZI)V")
	public static void method6014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(37) int local37 = (1 - local29) * local13 + local21;
		@Pc(50) int local50 = local17 - (local29 - 1) * local25;
		@Pc(54) int local54 = local13 << 2;
		@Pc(58) int local58 = local17 << 2;
		@Pc(66) int local66 = local21 * 3;
		@Pc(74) int local74 = local25 * ((arg3 << 1) - 3);
		@Pc(80) int local80 = local58;
		@Pc(86) int local86 = local54 * (arg3 - 1);
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (Static395.anInt6904 <= arg4 && Static561.anInt2703 >= arg4) {
			local100 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg2 + arg0);
			local108 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg0 - arg2);
			Static583.method7816(Static158.anIntArrayArray66[arg4], arg1, local108, local100);
		}
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local66;
					local50 += local80;
					local66 += local58;
					local80 += local58;
					local7++;
				}
			}
			if (local50 < 0) {
				local37 += local66;
				local50 += local80;
				local80 += local58;
				local66 += local58;
				local7++;
			}
			local37 += -local86;
			local50 += -local74;
			local86 -= local54;
			local74 -= local54;
			local9--;
			local100 = arg4 - local9;
			local108 = local9 + arg4;
			if (local108 >= Static395.anInt6904 && local100 <= Static561.anInt2703) {
				@Pc(212) int local212 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, local7 + arg0);
				@Pc(221) int local221 = Static554.method7333(Static469.anInt4270, Static325.anInt5516, arg0 - local7);
				if (local100 >= Static395.anInt6904) {
					Static583.method7816(Static158.anIntArrayArray66[local100], arg1, local221, local212);
				}
				if (Static561.anInt2703 >= local108) {
					Static583.method7816(Static158.anIntArrayArray66[local108], arg1, local221, local212);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)Z")
	public static boolean method6017() {
		return Static571.anInt9281 > 0;
	}
}
