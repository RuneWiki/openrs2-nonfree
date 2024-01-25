import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "Lclient!m;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_118 = new Class92(61, 15);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!gf;Lclient!gf;IIIIIIB)V")
	public static void method3196(@OriginalArg(1) Class1_Sub3_Sub3 arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(21) int local21 = arg1.method4835();
		if (local21 == -1) {
			return;
		}
		@Pc(34) Class22 local34 = (Class22) Static99.aClass5_19.method104((long) local21);
		if (local34 == null) {
			@Pc(41) Class166[] local41 = Static460.method3984(Static20.aClass56_10, local21);
			if (local41 == null) {
				return;
			}
			local34 = Static266.aClass75_7.method2590(local41[0]);
			Static99.aClass5_19.method114((long) local21, local34);
		}
		Static270.method5071(arg0.anInt6055, arg0.anInt6053, arg0.aByte77, arg5 >> 1, arg0.method4831() * 64, 0, arg4 >> 1);
		@Pc(88) int local88 = arg3 + Static189.anIntArray294[0] - 18;
		@Pc(96) int local96 = local88 + arg6 / 4 * 18;
		@Pc(107) int local107 = arg2 + Static189.anIntArray294[1] - 16 - 54;
		@Pc(115) int local115 = local107 + arg6 % 4 * 18;
		local34.method6074(local96, local115);
		if (arg1 == arg0) {
			Static266.aClass75_7.method2625(-256, local115 - 1, 18, 18, local96 - 1);
		}
		@Pc(137) Class13_Sub5 local137 = Static426.method5665();
		local137.aClass1_Sub3_Sub3_1 = arg1;
		local137.anInt5705 = local115;
		local137.anInt5706 = local115 + 16;
		local137.anInt5704 = local96;
		local137.anInt5709 = local96 + 16;
		Static92.aClass40_2.method1190(local137);
	}
}
