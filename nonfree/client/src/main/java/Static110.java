import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray76 = new int[2][8];

	@OriginalMember(owner = "client!t", name = "g", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public static void method2061() {
		aFloatArrayArray2 = null;
		anIntArrayArray76 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(F)F")
	public static float method2062(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
