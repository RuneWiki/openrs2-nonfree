import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static int anInt4092;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!cd;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "Lclient!mq;")
	public static Class134 aClass134_6;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public static volatile int anInt4090 = -1;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	public static int anInt4091 = -2;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljava/lang/String;")
	public static final String aString164 = "scroll:";

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public static int anInt4094 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V")
	public static void method3770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg0 * arg0;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(37) int local37 = local21 + local13 * (1 - local29);
		@Pc(45) int local45 = local17 - (local29 - 1) * local25;
		@Pc(49) int local49 = local13 << 2;
		@Pc(53) int local53 = local17 << 2;
		@Pc(61) int local61 = local21 * 3;
		@Pc(73) int local73 = ((arg3 << 1) - 3) * local25;
		@Pc(79) int local79 = local53;
		@Pc(97) int local97;
		@Pc(105) int local105;
		if (Static49.anInt1124 <= arg4 && arg4 <= Static291.anInt5657) {
			local97 = Static216.method3969(Static251.anInt6512, arg0 + arg2, Static106.anInt2157);
			local105 = Static216.method3969(Static251.anInt6512, arg2 - arg0, Static106.anInt2157);
			Static97.method1784(local105, Static327.anIntArrayArray63[arg4], arg1, local97);
		}
		@Pc(119) int local119 = local49 * (arg3 - 1);
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local45 += local79;
					local37 += local61;
					local79 += local53;
					local61 += local53;
					local7++;
				}
			}
			if (local45 < 0) {
				local45 += local79;
				local37 += local61;
				local7++;
				local61 += local53;
				local79 += local53;
			}
			local37 += -local119;
			local45 += -local73;
			local119 -= local49;
			local73 -= local49;
			local9--;
			local97 = arg4 - local9;
			local105 = local9 + arg4;
			if (Static49.anInt1124 <= local105 && Static291.anInt5657 >= local97) {
				@Pc(208) int local208 = Static216.method3969(Static251.anInt6512, local7 + arg2, Static106.anInt2157);
				@Pc(216) int local216 = Static216.method3969(Static251.anInt6512, arg2 - local7, Static106.anInt2157);
				if (Static49.anInt1124 <= local97) {
					Static97.method1784(local216, Static327.anIntArrayArray63[local97], arg1, local208);
				}
				if (Static291.anInt5657 >= local105) {
					Static97.method1784(local216, Static327.anIntArrayArray63[local105], arg1, local208);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!qj;IZLclient!qj;)V")
	public static void method3771(@OriginalArg(0) Class165 arg0, @OriginalArg(3) Class165 arg1) {
		Static37.aClass165_14 = arg1;
		Static96.aBoolean582 = true;
		Static89.aClass165_32 = arg0;
	}
}
