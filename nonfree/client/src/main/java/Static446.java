import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
	public static int anInt7455;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[2][8];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(F)F")
	public static float method6082(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
