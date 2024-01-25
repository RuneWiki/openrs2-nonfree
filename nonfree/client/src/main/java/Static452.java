import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZZ)V")
	public static void method6395(@OriginalArg(0) boolean arg0) {
		@Pc(7) Class389[] local7 = Static4.aClass389Array8;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class389 local15 = local7[local9];
			local15.method9073();
		}
		Static13.method207();
		Static109.method8573();
		Static290.method4607();
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			Static553.aClass169Array1[local34].method3869();
		}
		Static487.method7255(false);
		System.gc();
		Static457.method6442(-1);
		Static603.anInt9717 = -1;
		Static76.aBoolean115 = false;
		Static348.method5140();
		Static98.method1524(true);
		Static75.method1248();
		Static216.method1139();
		Static270.method4446();
		if (arg0) {
			Static411.method6060(13, -3);
			return;
		}
		Static411.method6060(3, -3);
		try {
			Static684.method782(Static265.anApplet2, "loggedout");
		} catch (@Pc(89) Throwable local89) {
		}
	}
}
