import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
	public static int anInt4211;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray40 = new int[2][8];

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(F)F")
	public static float method3370(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
