import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "Lclient!sq;")
	public static final Class273 aClass273_5 = new Class273();

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "I")
	public static int anInt5370 = -1;

	@OriginalMember(owner = "client!lba", name = "v", descriptor = "I")
	public static final int anInt5374 = 1339;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIBI)V")
	public static void method4497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static423.anInt7490; local12++) {
			@Pc(18) Rectangle local18 = Class192.aRectangleArray3[local12];
			if (local18.x + local18.width > arg0 && arg0 + arg3 > local18.x && local18.height + local18.y > arg1 && local18.y < arg2 + arg1) {
				Static386.aBooleanArray15[local12] = true;
			}
		}
	}
}
