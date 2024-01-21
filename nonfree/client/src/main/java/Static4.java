import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
	public static int anInt120;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(F)F")
	public static float method136(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public static void method137() {
		aFloatArrayArray1 = null;
		anIntArrayArray1 = null;
	}
}
