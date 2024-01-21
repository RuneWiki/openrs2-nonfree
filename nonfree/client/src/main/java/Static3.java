import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt92;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[2][8];

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public static void method70() {
		aFloatArrayArray1 = null;
		anIntArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(F)F")
	public static float method71(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
