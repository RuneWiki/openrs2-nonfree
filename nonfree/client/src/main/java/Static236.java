import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
	public static int anInt3827;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_139 = new Class196(10, -2);

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ha;IIIIZI)V")
	public static void method3375(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if ((Static545.aClass59_33 == null || Static471.aClass59_31 == null || Static27.aClass59_1 == null) && Static471.aClass50_136.method897(Static459.anInt7994) && Static471.aClass50_136.method897(Static19.anInt265) && Static471.aClass50_136.method897(Static78.anInt1275)) {
			@Pc(31) Class301 local31 = Static684.method7228(Static471.aClass50_136, Static19.anInt265, 0);
			Static471.aClass59_31 = arg0.method6247(local31, true);
			local31.method7233();
			Static428.aClass59_23 = arg0.method6247(local31, true);
			Static545.aClass59_33 = arg0.method6247(Static684.method7228(Static471.aClass50_136, Static459.anInt7994, 0), true);
			@Pc(56) Class301 local56 = Static684.method7228(Static471.aClass50_136, Static78.anInt1275, 0);
			Static27.aClass59_1 = arg0.method6247(local56, true);
			local56.method7233();
			Static303.aClass59_13 = arg0.method6247(local56, true);
		}
		if (Static545.aClass59_33 == null || Static471.aClass59_31 == null || Static27.aClass59_1 == null) {
			return;
		}
		@Pc(90) int local90 = (arg4 - Static27.aClass59_1.method8049() * 2) / Static545.aClass59_33.method8049();
		for (@Pc(92) int local92 = 0; local92 < local90; local92++) {
			Static545.aClass59_33.method8057(Static27.aClass59_1.method8049() + arg3 + local92 * Static545.aClass59_33.method8049(), arg2 + (arg1 - Static545.aClass59_33.method8061()));
		}
		@Pc(128) int local128 = (arg2 - Static27.aClass59_1.method8061() - 20) / Static471.aClass59_31.method8061();
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			Static471.aClass59_31.method8057(arg3, Static471.aClass59_31.method8061() * local130 + arg1 + 20);
			Static428.aClass59_23.method8057(arg4 + arg3 - Static428.aClass59_23.method8049(), Static471.aClass59_31.method8061() * local130 + (arg1 - -20));
		}
		Static27.aClass59_1.method8057(arg3, arg2 + arg1 - Static27.aClass59_1.method8061());
		Static303.aClass59_13.method8057(arg3 + arg4 - Static27.aClass59_1.method8049(), arg2 + arg1 + -Static27.aClass59_1.method8061());
	}
}
