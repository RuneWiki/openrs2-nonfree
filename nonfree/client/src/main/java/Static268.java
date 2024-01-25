import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "Lclient!ni;")
	public static final Class249 aClass249_3 = new Class249("RC", 1);

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
	public static final int anInt4665 = 1403;

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[Lclient!aha;")
	public static final Class12[] aClass12Array1 = new Class12[100];

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!hs;Lclient!df;I)V")
	public static void method4004(@OriginalArg(1) Class165 arg0, @OriginalArg(2) Class8_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (Static21.anInt322 >= 50 || (arg0 == null || arg0.anIntArrayArray26 == null || arg2 >= arg0.anIntArrayArray26.length || arg0.anIntArrayArray26[arg2] == null)) {
			return;
		}
		@Pc(42) int local42 = arg0.anIntArrayArray26[arg2][0];
		@Pc(46) int local46 = local42 >> 8;
		@Pc(52) int local52 = local42 >> 5 & 0x7;
		@Pc(69) int local69;
		if (arg0.anIntArrayArray26[arg2].length > 1) {
			local69 = (int) ((double) arg0.anIntArrayArray26[arg2].length * Math.random());
			if (local69 > 0) {
				local46 = arg0.anIntArrayArray26[arg2][local69];
			}
		}
		@Pc(85) int local85 = local42 & 0x1F;
		local69 = 256;
		if (arg0.anIntArray224 != null && arg0.anIntArray222 != null) {
			local69 = (int) ((double) (arg0.anIntArray222[arg2] - arg0.anIntArray224[arg2]) * Math.random()) + arg0.anIntArray224[arg2];
		}
		@Pc(127) int local127 = arg0.anIntArray221 == null ? 255 : arg0.anIntArray221[arg2];
		if (local85 == 0) {
			if (arg1 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1) {
				if (!arg0.aBoolean305) {
					Static443.method6563(0, local69, local52, local127, local46);
					return;
				}
				Static391.method5714(local127, 0, local46, local69, local52, false);
			}
		} else if (Static637.aClass5_Sub20_31.aClass24_Sub12_1.method3413() != 0) {
			@Pc(177) int local177 = arg1.anInt10355 - 256 >> 9;
			@Pc(184) int local184 = arg1.anInt10363 - 256 >> 9;
			@Pc(205) int local205 = arg1 == Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 ? 0 : local85 + (local184 << 8) + (local177 << 16) + (arg1.aByte145 << 24);
			Static377.aClass50Array1[Static21.anInt322++] = new Class50((byte) (arg0.aBoolean305 ? 2 : 1), local46, local52, 0, local127, local205, local69, arg1);
		}
	}
}
