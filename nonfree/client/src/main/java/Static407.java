import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
	public static int anInt6473;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "F")
	public static float aFloat136;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[2][8];

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[2][8];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(F)F")
	public static float method5770(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
