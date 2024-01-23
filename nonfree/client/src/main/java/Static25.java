import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	public static int anInt692 = 0;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!c", name = "P", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)V")
	public static void method534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub22 local12 = Static271.method4108(13, arg1);
		local12.method4468();
		local12.anInt5852 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
	public static void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static98.method3942(arg3 + arg4, Static121.anIntArrayArray33[arg1], arg2, arg3 - arg4);
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local28 << 1;
		@Pc(36) int local36 = local24 << 1;
		@Pc(38) int local38 = arg0;
		@Pc(42) int local42 = arg0 << 1;
		@Pc(54) int local54 = local24 << 2;
		@Pc(62) int local62 = local32 + local24 * (1 - local42);
		@Pc(66) int local66 = local28 << 2;
		@Pc(72) int local72 = local66;
		@Pc(78) int local78 = local54 * (arg0 - 1);
		@Pc(86) int local86 = local36 * ((arg0 << 1) - 3);
		@Pc(95) int local95 = local28 - local36 * (local42 - 1);
		@Pc(103) int local103 = local32 * 3;
		while (local38 > 0) {
			local38--;
			if (local62 < 0) {
				while (local62 < 0) {
					local62 += local103;
					local20++;
					local103 += local66;
					local95 += local72;
					local72 += local66;
				}
			}
			if (local95 < 0) {
				local95 += local72;
				local20++;
				local62 += local103;
				local72 += local66;
				local103 += local66;
			}
			@Pc(163) int local163 = arg1 - local38;
			local95 += -local86;
			@Pc(172) int local172 = local20 + arg3;
			@Pc(176) int local176 = local38 + arg1;
			local62 += -local78;
			local86 -= local54;
			@Pc(190) int local190 = arg3 - local20;
			Static98.method3942(local172, Static121.anIntArrayArray33[local163], arg2, local190);
			Static98.method3942(local172, Static121.anIntArrayArray33[local176], arg2, local190);
			local78 -= local54;
		}
	}
}
