import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
	public static int anInt1548;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	public static int anInt1534 = 0;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "Lclient!ca;")
	public static final Class40 aClass40_1 = new Class40();

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
	public static int method1450() {
		if (Static15.aFrame1 == null) {
			return Static388.aBoolean466 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIIII)V")
	public static void method1452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
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
		@Pc(84) int local84 = (arg0 - 1) * local52;
		Static208.method3687(arg3 - arg4, arg1, Static454.anIntArrayArray71[arg2], arg4 + arg3);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local78;
					local7++;
					local78 += local56;
					local64 += local56;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local78;
				local64 += local56;
				local7++;
				local78 += local56;
			}
			local39 += -local84;
			local48 += -local72;
			local72 -= local52;
			local84 -= local52;
			local9--;
			@Pc(167) int local167 = arg2 - local9;
			@Pc(171) int local171 = local9 + arg2;
			@Pc(176) int local176 = arg3 + local7;
			@Pc(181) int local181 = arg3 - local7;
			Static208.method3687(local181, arg1, Static454.anIntArrayArray71[local167], local176);
			Static208.method3687(local181, arg1, Static454.anIntArrayArray71[local171], local176);
		}
	}
}
