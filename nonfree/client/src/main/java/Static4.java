import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
	public static int anInt54;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!ui;Lclient!ui;)V")
	public static void method51(@OriginalArg(1) Class230 arg0, @OriginalArg(2) Class230 arg1) {
		Static163.aClass230_46 = arg1;
		Static366.aClass230_82 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZILclient!pp;II)V")
	public static void method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class185 arg4, @OriginalArg(6) int arg5) {
		if (Static104.anInt1830 >= 50 || (arg4 == null || arg4.anIntArrayArray54 == null || arg0 >= arg4.anIntArrayArray54.length || arg4.anIntArrayArray54[arg0] == null)) {
			return;
		}
		@Pc(30) int local30 = arg4.anIntArrayArray54[arg0][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(51) int local51 = local30 >> 5 & 0x7;
		@Pc(55) int local55 = local30 & 0x1F;
		@Pc(72) int local72;
		if (arg4.anIntArrayArray54[arg0].length > 1) {
			local72 = (int) (Math.random() * (double) arg4.anIntArrayArray54[arg0].length);
			if (local72 > 0) {
				local34 = arg4.anIntArrayArray54[arg0][local72];
			}
		}
		if (local55 == 0) {
			if (arg2) {
				Static256.method3911(local34, 255, 0, local51);
			}
		} else if (Static188.aClass135_Sub1_1.anInt3374 != 0) {
			Static300.anIntArray609[Static104.anInt1830] = local34;
			Static254.anIntArray539[Static104.anInt1830] = local51;
			Static255.anIntArray542[Static104.anInt1830] = 0;
			Static311.aClass159Array1[Static104.anInt1830] = null;
			Static190.anIntArray390[Static104.anInt1830] = 255;
			local72 = (arg1 - 64) / 128;
			@Pc(131) int local131 = (arg5 - 64) / 128;
			Static57.anIntArray700[Static104.anInt1830] = local55 + (local131 << 8) + (local72 << 16) + (arg3 << 24);
			Static104.anInt1830++;
		}
	}
}
