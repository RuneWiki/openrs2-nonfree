import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([FII)[F")
	public static float[] method7056(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static596.method7720(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIII)V")
	public static void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static79.anInt2700 == 0) {
			Static138.method2968(false);
		} else {
			Static212.anInt9969 = Static79.anInt2700;
			Static584.method7942(0);
		}
		Static485.anInt8586 = arg3;
		Static376.aBoolean471 = arg1;
		Static51.anInt910 = arg0;
		Static490.method1757(arg2);
	}
}
