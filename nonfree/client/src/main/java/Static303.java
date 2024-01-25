import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIII)V")
	public static void method3951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static254.anInt4211 && arg1 <= Static275.anInt4594) {
			@Pc(28) int local28 = Static39.method544(arg3, Static62.anInt1114, Static207.anInt3632);
			@Pc(34) int local34 = Static39.method544(arg2, Static62.anInt1114, Static207.anInt3632);
			Static286.method3749(arg0, local28, arg1, local34);
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	public static void method3952() {
		Static247.aClass4_Sub9_Sub2_2.anInt6207 = 0;
		Static149.aClass56_102 = null;
		Static414.aClass56_249 = null;
		Static77.anInt1536 = 0;
		Static7.aClass56_7 = null;
		Static385.anInt6297 = 0;
		Static451.aClass56_267 = null;
		Static313.anInt5082 = 0;
		Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
		Static148.method2080();
		Static3.method35();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static267.aClass8_Sub3_Sub1_Sub1Array1[local31] = null;
		}
		Static401.aClass8_Sub3_Sub1_Sub1_2 = null;
		for (@Pc(49) int local49 = 0; local49 < Static367.aClass8_Sub3_Sub1_Sub2Array1.length; local49++) {
			@Pc(55) Class8_Sub3_Sub1_Sub2 local55 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local49];
			if (local55 != null) {
				local55.anInt7394 = -1;
			}
		}
		Static148.method2079();
		Static97.anInt1791 = 1;
		Static119.method4569(9);
		for (@Pc(74) int local74 = 0; local74 < 100; local74++) {
			Static72.aBooleanArray7[local74] = true;
		}
		Static66.method1083();
		Static333.aLong166 = 0L;
		Static170.aClass4_Sub16_3 = null;
	}
}
