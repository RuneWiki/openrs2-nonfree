import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public static int anInt2204;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "F")
	public static float aFloat42;

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[2][8];

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(F)F")
	public static float method1764(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
