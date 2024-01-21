import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
	public static int anInt3570;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[2][8];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
	public static void method2577() {
		aFloatArrayArray2 = null;
		anIntArrayArray30 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(F)F")
	public static float method2578(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
