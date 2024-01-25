import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int anInt3210;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[2][8];

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray7 = new float[2][8];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(F)F")
	public static float method2384(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
