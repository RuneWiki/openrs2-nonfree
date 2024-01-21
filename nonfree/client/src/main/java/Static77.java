import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt2363;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray69 = new int[2][8];

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	public static void method1687() {
		aFloatArrayArray1 = null;
		anIntArrayArray69 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(F)F")
	public static float method1690(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
