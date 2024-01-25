import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public static int anInt5486;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[2][8];

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(F)F")
	public static float method4380(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
