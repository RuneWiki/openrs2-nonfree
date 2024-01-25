import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "F")
	public static float aFloat138;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray14 = new float[2][8];

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray135 = new int[2][8];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(F)F")
	public static float method5137(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
