import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[2][8];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(F)F")
	public static float method516(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public static void method518() {
		aFloatArrayArray1 = null;
		anIntArrayArray5 = null;
	}
}
