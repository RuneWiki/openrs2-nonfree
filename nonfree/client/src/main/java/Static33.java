import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static int anInt875;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public static int anInt880;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBI)V")
	public static void method833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static489.anInt8712; local11++) {
			@Pc(17) Rectangle local17 = Class102.aRectangleArray1[local11];
			if (local17.x + local17.width > arg0 && arg3 + arg0 > local17.x && arg1 < local17.y + local17.height && arg2 + arg1 > local17.y) {
				Static125.aBooleanArray12[local11] = true;
			}
		}
	}
}
