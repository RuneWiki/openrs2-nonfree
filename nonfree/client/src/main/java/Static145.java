import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	public static int anInt3187;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[2][8];

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
	public static void method2484() {
		aFloatArrayArray2 = null;
		anIntArrayArray24 = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(F)F")
	public static float method2487(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
