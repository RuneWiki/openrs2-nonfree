import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
	public static void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static118.anInt4791; local3++) {
			@Pc(9) Rectangle local9 = Class1_Sub2_Sub3.aRectangleArray1[local3];
			if (arg2 < local9.width + local9.x && arg2 + arg3 > local9.x && arg0 < local9.height + local9.y && arg0 + arg1 > local9.y) {
				Static253.aBooleanArray27[local3] = true;
			}
		}
	}
}
