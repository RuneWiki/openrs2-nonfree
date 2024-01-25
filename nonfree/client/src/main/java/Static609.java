import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
	public static int anInt9830;

	@OriginalMember(owner = "client!uja", name = "g", descriptor = "I")
	public static int anInt9834 = 0;

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "Z")
	public static boolean aBoolean752 = false;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V")
	public static void method8656() {
		if (Static608.anIntArray846 != null && Static144.anIntArray235 != null) {
			return;
		}
		Static608.anIntArray846 = new int[256];
		Static144.anIntArray235 = new int[256];
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(36) double local36 = (double) local27 / 255.0D * 6.283185307179586D;
			Static608.anIntArray846[local27] = (int) (Math.sin(local36) * 4096.0D);
			Static144.anIntArray235[local27] = (int) (Math.cos(local36) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(FFIFI)F")
	public static float method8657(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(12) float[] local12 = Static445.aFloatArrayArray12[arg3];
		return arg1 * local12[0] + local12[1] * arg0 + local12[2] * arg2;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIII)V")
	public static void method8658(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static329.anInt5472; local11++) {
			@Pc(17) Rectangle local17 = Class21.aRectangleArray9[local11];
			if (local17.x + local17.width > arg0 && arg3 + arg0 > local17.x && local17.y + local17.height > arg2 && arg1 + arg2 > local17.y) {
				Static200.aBooleanArray21[local11] = true;
			}
		}
		Static642.method8919(arg3 + arg0, arg1 + arg2, arg2, arg0);
	}
}
