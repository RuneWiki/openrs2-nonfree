import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static int anInt6363;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray10 = new float[2][8];

	@OriginalMember(owner = "client!og", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[2][8];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(F)F")
	public static float method5420(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
