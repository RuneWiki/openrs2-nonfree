import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public static int anInt8165;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public static int anInt8161 = 1;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public static int anInt8163 = 0;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "F")
	public static float aFloat210 = 0.0F;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIII)V")
	public static void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = ((arg4 << 1) - 3) * local25;
		@Pc(78) int local78 = local56;
		Static306.method5239(Static46.anIntArrayArray4[arg3], arg2 + arg1, arg0, arg2 - arg1);
		@Pc(97) int local97 = local52 * (arg4 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local78;
					local78 += local56;
					local64 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local48 += local78;
				local39 += local64;
				local64 += local56;
				local7++;
				local78 += local56;
			}
			local39 += -local97;
			local48 += -local72;
			local97 -= local52;
			local72 -= local52;
			local9--;
			@Pc(164) int local164 = arg3 - local9;
			@Pc(168) int local168 = arg3 + local9;
			@Pc(172) int local172 = arg2 + local7;
			@Pc(177) int local177 = arg2 - local7;
			Static306.method5239(Static46.anIntArrayArray4[local164], local172, arg0, local177);
			Static306.method5239(Static46.anIntArrayArray4[local168], local172, arg0, local177);
		}
	}
}
