import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
	public static int anInt2810;

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[2][8];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(F)F")
	public static float method2418(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
