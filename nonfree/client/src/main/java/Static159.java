import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fj", name = "F", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
	public static int anInt3350;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II[F)[F")
	public static float[] method3018(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static655.method5832(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(BI)Z")
	public static boolean method3019(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
