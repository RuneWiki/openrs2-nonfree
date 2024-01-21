import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public static int anInt707;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[2][8];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(F)F")
	public static float method451(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	public static void method455() {
		aFloatArrayArray1 = null;
		anIntArrayArray2 = null;
	}
}
