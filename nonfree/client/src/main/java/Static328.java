import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "F")
	public static float aFloat126;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray123 = new int[2][8];

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(F)F")
	public static float method4492(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
