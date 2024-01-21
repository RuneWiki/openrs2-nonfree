import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public static int anInt3040;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray23 = new int[2][8];

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	public static void method1910() {
		aFloatArrayArray1 = null;
		anIntArrayArray23 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(F)F")
	public static float method1914(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
