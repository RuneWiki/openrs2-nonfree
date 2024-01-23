import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public static int anInt5533;

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public static int anInt5535;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public static int anInt5538;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt5532 = 0;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public static int anInt5534 = 0;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public static int anInt5536 = 0;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method4598() {
		Static89.aClass175_13.method4294();
		Static111.aClass175_17.method4294();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)Z")
	public static boolean method4599(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(12) int local12 = Static94.aShortArray46[arg0];
		if (local12 >= 2000) {
			local12 -= 2000;
		}
		return local12 == 1004;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBIIII)V")
	public static void method4606(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static103.method1978(arg4, arg3 + arg0, -arg3 + arg0, Static40.anIntArrayArray6[arg1]);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		@Pc(26) int local26 = arg3 * arg3;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = local30 << 1;
		@Pc(38) int local38 = local26 << 1;
		@Pc(42) int local42 = arg2 << 1;
		@Pc(51) int local51 = local34 + local26 * (1 - local42);
		@Pc(60) int local60 = local30 - (local42 - 1) * local38;
		@Pc(64) int local64 = local26 << 2;
		@Pc(73) int local73 = local30 << 2;
		@Pc(81) int local81 = local34 * 3;
		@Pc(87) int local87 = local73;
		@Pc(95) int local95 = ((arg2 << 1) - 3) * local38;
		@Pc(101) int local101 = (arg2 - 1) * local64;
		while (local22 > 0) {
			local22--;
			if (local51 < 0) {
				while (local51 < 0) {
					local51 += local81;
					local81 += local73;
					local60 += local87;
					local87 += local73;
					local20++;
				}
			}
			@Pc(136) int local136 = arg1 - local22;
			if (local60 < 0) {
				local20++;
				local60 += local87;
				local51 += local81;
				local87 += local73;
				local81 += local73;
			}
			local60 += -local95;
			local95 -= local64;
			@Pc(171) int local171 = local20 + arg0;
			@Pc(176) int local176 = arg0 - local20;
			Static103.method1978(arg4, local171, local176, Static40.anIntArrayArray6[local136]);
			local51 += -local101;
			@Pc(193) int local193 = local22 + arg1;
			Static103.method1978(arg4, local171, local176, Static40.anIntArrayArray6[local193]);
			local101 -= local64;
		}
	}
}
