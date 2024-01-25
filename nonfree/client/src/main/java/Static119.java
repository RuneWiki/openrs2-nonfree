import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
	public static int anInt2793 = 0;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(I)V")
	public static void method2327() {
		Static98.aClass171_1.method4162();
		Static436.aClass71_4.method2110();
		Static324.aClass356_1.method7912();
		Static536.aClass146_4.method3727();
		Static181.aClass60_1.method1800();
		Static272.aClass121_2.method3316();
		Static245.aClass155_1.method3823();
		Static386.aClass23_1.method229();
		Static333.aClass177_1.method4302();
		Static406.aClass144_1.method3704();
		Static98.aClass313_1.method6868();
		Static493.aClass296_4.method6525();
		Static550.aClass189_3.method4640();
		Static428.aClass124_1.method3406();
		Static106.aClass27_1.method486();
		Static345.aClass103_1.method2777();
		Static240.aClass13_1.method121();
		Static517.aClass261_1.method5827();
		Static198.aClass210_2.method4930();
		Static326.aClass7_1.method65();
		Static479.method6544();
		Static388.method5407();
		Static195.method3407();
		Static352.method5069();
		Static55.method6555();
		Static312.aClass342_121.method7687();
		Static426.aClass342_146.method7687();
		Static187.aClass342_75.method7687();
		Static476.aClass342_168.method7687();
		Static583.aClass342_199.method7687();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public static void method2328() {
		if (!Static432.method5973()) {
			return;
		}
		if (Static495.aStringArray41 == null) {
			Static314.method4680();
		}
		Static324.anInt5928 = 0;
		Static94.aBoolean171 = true;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(FI[FIIIIIBI)V")
	public static void method2329(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg4 - arg8;
		@Pc(13) int local13 = arg3 - arg1;
		@Pc(22) int local22 = arg5 - arg7;
		@Pc(43) float local43 = arg2[2] * (float) local13 + (float) local22 * arg2[1] + arg2[0] * (float) local9;
		@Pc(64) float local64 = arg2[3] * (float) local9 + (float) local22 * arg2[4] + (float) local13 * arg2[5];
		@Pc(85) float local85 = (float) local13 * arg2[8] + (float) local9 * arg2[6] + arg2[7] * (float) local22;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local85 * local85 + local64 * local64 + local43 * local43));
		@Pc(111) float local111 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg0 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(131) float local131;
		if (arg6 == 1) {
			local131 = local111;
			local111 = -local124;
			local124 = local131;
		} else if (arg6 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg6 == 3) {
			local131 = local111;
			local111 = local124;
			local124 = -local131;
		}
		Static229.aFloat114 = local124;
		Static385.aFloat153 = local111;
	}
}
