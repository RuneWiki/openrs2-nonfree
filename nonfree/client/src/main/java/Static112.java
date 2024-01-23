import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[2][8];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(F)F")
	public static float method1900(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
