import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public static int anInt1385;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[2][8];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(F)F")
	public static float method1291(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
