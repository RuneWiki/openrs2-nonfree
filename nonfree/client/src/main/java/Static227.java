import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
	public static int anInt3674;

	@OriginalMember(owner = "client!iba", name = "h", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[2][8];

	@OriginalMember(owner = "client!iba", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(F)F")
	public static float method3116(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
