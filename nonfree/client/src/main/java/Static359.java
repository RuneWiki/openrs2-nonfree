import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static int anInt6707;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[2][8];

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(F)F")
	public static float method5608(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
