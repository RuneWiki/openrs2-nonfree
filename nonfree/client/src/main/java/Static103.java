import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt2166;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!di", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[2][8];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(F)F")
	public static float method1829(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
