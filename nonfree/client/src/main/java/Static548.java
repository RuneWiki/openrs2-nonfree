import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!so", name = "l", descriptor = "[I")
	public static int[] anIntArray622;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	public static int anInt9237 = 0;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "[S")
	public static final short[] aShortArray138 = new short[] { 48, 25, 19, 52, 17, 49, 53, 2 };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IFFIF)F")
	public static float method7796(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(12) float[] local12 = Static148.aFloatArrayArray8[arg2];
		return local12[2] * arg3 + local12[0] * arg0 + local12[1] * arg1;
	}
}
