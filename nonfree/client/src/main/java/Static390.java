import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt6837;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "F")
	public static float aFloat200;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray10 = new float[2][8];

	@OriginalMember(owner = "client!om", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[2][8];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(F)F")
	public static float method5727(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
