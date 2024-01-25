import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public static int anInt7015;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[2][8];

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(F)F")
	public static float method5404(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
