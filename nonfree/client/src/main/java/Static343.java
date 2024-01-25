import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
	public static final int[] anIntArray448 = new int[13];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
	public static void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static55.anInt1303 && arg2 <= Static208.anInt4309) {
			@Pc(11) int local11 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg0);
			@Pc(17) int local17 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg3);
			Static32.method2513(arg1, local17, local11, arg2);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V")
	public static void method5824(@OriginalArg(0) int arg0) {
		Static296.anInt6027 = -1;
		Static568.anInt10054 = 3;
		Static338.anInt6970 = 100;
		Static407.anInt8012 = arg0;
	}
}
