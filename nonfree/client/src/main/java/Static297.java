import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_122 = new Class163(32, 8);

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "Lclient!of;")
	public static final Class174 aClass174_143 = new Class174("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BIIII)V")
	public static void method4223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static100.anInt1815; local7++) {
			@Pc(21) Rectangle local21 = Class43.aRectangleArray1[local7];
			if (local21.width + local21.x > arg2 && local21.x < arg1 + arg2 && local21.y + local21.height > arg0 && arg0 + arg3 > local21.y) {
				Static15.aBooleanArray3[local7] = true;
			}
		}
	}
}
