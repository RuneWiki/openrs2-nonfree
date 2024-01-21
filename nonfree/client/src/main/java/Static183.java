import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt4066;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray38 = new int[2][8];

	@OriginalMember(owner = "client!we", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	public static void method3029() {
		aFloatArrayArray2 = null;
		anIntArrayArray38 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(F)F")
	public static float method3034(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
