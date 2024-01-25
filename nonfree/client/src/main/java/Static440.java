import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "I")
	public static int anInt7951;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "F")
	public static float aFloat165;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[2][8];

	@OriginalMember(owner = "client!po", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray12 = new float[2][8];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(F)F")
	public static float method6815(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
