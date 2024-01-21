import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[2][8];

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(F)F")
	public static float method379(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()V")
	public static void method384() {
		aFloatArrayArray1 = null;
		anIntArrayArray15 = null;
	}
}
