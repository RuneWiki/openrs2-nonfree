import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
	public static int anInt3854;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray32 = new int[2][8];

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(F)F")
	public static float method3526(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
