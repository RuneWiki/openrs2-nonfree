import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public static int anInt6808;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!md", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[2][8];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(F)F")
	public static float method5692(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
