import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fw", name = "Jb", descriptor = "Lclient!oj;")
	public static Class243 aClass243_4;

	@OriginalMember(owner = "client!fw", name = "Eb", descriptor = "I")
	public static int anInt3157 = 0;

	@OriginalMember(owner = "client!fw", name = "Ib", descriptor = "I")
	public static int anInt3161 = 0;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "(I)V")
	public static void method2572() {
		Static465.anIntArray526 = null;
		Static101.anIntArray109 = null;
		Static241.anIntArray297 = null;
		Static388.aBoolean530 = false;
		Static572.anIntArray676 = null;
		Static266.anIntArray332 = null;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(IZ)V")
	public static void method2574(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(9, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "(I)I")
	public static int method2576() {
		@Pc(7) int local7 = Static372.aClass204_24.method4549();
		if (Static272.aClass204Array1.length - 1 > local7) {
			Static372.aClass204_24 = Static272.aClass204Array1[local7 + 1];
		}
		return 100;
	}
}
