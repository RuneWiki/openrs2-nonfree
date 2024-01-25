import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "Z")
	public static boolean aBoolean523 = false;

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
	public static int anInt6640 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(FIIFF)F")
	public static float method5545(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static126.aFloatArrayArray1[arg1];
		return local17[2] * arg3 + arg0 * local17[0] + local17[1] * arg2;
	}
}
