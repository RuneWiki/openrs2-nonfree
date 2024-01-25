import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray7 = new float[2][8];

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[2][8];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(F)F")
	public static float method3756(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
