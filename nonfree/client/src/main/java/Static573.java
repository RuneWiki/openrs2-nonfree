import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "Lclient!kp;")
	public static Class196 aClass196_14;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
	public static int anInt9321 = 0;

	@OriginalMember(owner = "client!vv", name = "m", descriptor = "Z")
	public static boolean aBoolean715 = false;

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean716 = false;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIBI)V")
	public static void method7737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static451.anInt488; local3++) {
			@Pc(9) Rectangle local9 = Class230.aRectangleArray1[local3];
			if (arg1 < local9.width + local9.x && arg1 + arg2 > local9.x && local9.height + local9.y > arg0 && arg3 + arg0 > local9.y) {
				Static64.aBooleanArray5[local3] = true;
			}
		}
	}
}
