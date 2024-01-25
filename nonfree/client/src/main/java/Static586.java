import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!fba;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIB)V")
	public static void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static414.anInt7237; local7++) {
			@Pc(13) Rectangle local13 = Class237.aRectangleArray1[local7];
			if (arg0 < local13.x + local13.width && local13.x < arg1 + arg0 && arg3 < local13.y + local13.height && local13.y < arg2 + arg3) {
				Static31.aBooleanArray17[local7] = true;
			}
		}
	}
}
