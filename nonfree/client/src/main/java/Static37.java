import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt923;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray9 = new int[2][8];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public static void method575() {
		aFloatArrayArray1 = null;
		anIntArrayArray9 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(F)F")
	public static float method578(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
