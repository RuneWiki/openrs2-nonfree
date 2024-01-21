import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray25 = new int[2][8];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(F)F")
	public static float method1186(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	public static void method1189() {
		aFloatArrayArray1 = null;
		anIntArrayArray25 = null;
	}
}
