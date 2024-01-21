import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public static int anInt1415;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[2][8];

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(F)F")
	public static float method848(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	public static void method849() {
		aFloatArrayArray1 = null;
		anIntArrayArray12 = null;
	}
}
