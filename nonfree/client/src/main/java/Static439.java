import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!os", name = "e", descriptor = "I")
	public static int anInt7651;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "F")
	public static float aFloat175;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[2][8];

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray77 = new int[2][8];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(F)F")
	public static float method6407(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
