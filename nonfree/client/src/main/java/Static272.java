import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt5095;

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray13 = new float[2][8];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(F)F")
	public static float method4646(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
