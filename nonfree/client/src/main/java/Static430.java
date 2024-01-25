import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qga", name = "v", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_77 = new Class344(15, -1);

	@OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
	public static int anInt8212 = 0;

	@OriginalMember(owner = "client!qga", name = "D", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!qga", name = "I", descriptor = "J")
	public static volatile long aLong219 = 0L;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
	public static void method6395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static365.anInt7047; local3++) {
			@Pc(9) Rectangle local9 = Class5.aRectangleArray5[local3];
			if (local9.width + local9.x > arg0 && arg0 + arg1 > local9.x && local9.height + local9.y > arg2 && arg2 + arg3 > local9.y) {
				Static155.aBooleanArray6[local3] = true;
			}
		}
	}
}
