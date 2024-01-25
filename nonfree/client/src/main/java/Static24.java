import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(FFFII)F")
	public static float method345(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(15) float[] local15 = Static22.aFloatArrayArray1[arg3];
		return local15[1] * arg0 + local15[0] * arg1 + local15[2] * arg2;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([[II)V")
	public static void method346(@OriginalArg(0) int[][] arg0) {
		Static67.anIntArrayArray13 = arg0;
	}
}
