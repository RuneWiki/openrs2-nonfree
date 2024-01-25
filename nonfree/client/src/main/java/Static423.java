import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
	public static int anInt7194;

	@OriginalMember(owner = "client!qaa", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString64 = "";

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BILclient!sp;)V")
	public static void method6023(@OriginalArg(1) int arg0, @OriginalArg(2) Class41_Sub2_Sub1_Sub4 arg1) {
		if (arg1.anIntArray627 == null) {
			return;
		}
		@Pc(18) int local18 = arg1.anIntArray627[arg0 + 1];
		if (arg1.anInt9489 == local18) {
			return;
		}
		arg1.anInt9489 = local18;
		arg1.anInt9463 = 0;
		arg1.anInt9478 = 0;
		arg1.anInt9460 = 1;
		arg1.anInt9534 = arg1.anInt9535;
		arg1.anInt9473 = 0;
		if (arg1.anInt9489 != -1) {
			Static462.method6421(arg1 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg1.anInt9444, Static545.aClass240_2.method5680(arg1.anInt9489), arg1.aByte117, arg1.anInt9442, arg1.anInt9473);
			return;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIBII)V")
	public static void method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static585.anInt9430 = arg3;
		Static157.anInt3283 = arg2;
		Static62.anInt1476 = arg0;
		Static342.anInt6002 = arg1;
	}
}
