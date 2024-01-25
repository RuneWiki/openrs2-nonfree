import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIIII)V")
	public static void method4896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static463.anInt7418; local3++) {
			@Pc(9) Rectangle local9 = Class4_Sub5_Sub21.aRectangleArray2[local3];
			if (arg0 < local9.width + local9.x && arg0 + arg1 > local9.x && local9.height + local9.y > arg2 && local9.y < arg3 + arg2) {
				Static387.aBooleanArray12[local3] = true;
			}
		}
		Static100.method2025(arg2, arg1 + arg0, arg0, arg3 + arg2);
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)Z")
	public static boolean method4897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
