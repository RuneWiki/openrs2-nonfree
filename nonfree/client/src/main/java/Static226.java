import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public static int anInt4123;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[2][8];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(F)F")
	public static float method3464(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
