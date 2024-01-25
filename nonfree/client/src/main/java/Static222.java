import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt4620 = 0;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
	public static final int[] anIntArray380 = new int[13];

	@OriginalMember(owner = "client!od", name = "v", descriptor = "S")
	public static short aShort59 = 256;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z")
	public static boolean method3816() {
		if (Static27.aBoolean27) {
			try {
				Static369.method5674(Static212.aClass120_3.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIII)V")
	public static void method3817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static2.anInt5069; local7++) {
			@Pc(13) Rectangle local13 = Class2.aRectangleArray21[local7];
			if (local13.x + local13.width > arg2 && arg2 + arg1 > local13.x && arg3 < local13.y + local13.height && arg3 + arg0 > local13.y) {
				Static60.aBooleanArray8[local7] = true;
			}
		}
	}
}
