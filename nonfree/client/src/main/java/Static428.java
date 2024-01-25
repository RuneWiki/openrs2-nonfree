import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
	public static int anInt7368;

	@OriginalMember(owner = "client!qda", name = "r", descriptor = "[I")
	public static final int[] anIntArray605 = new int[16];

	@OriginalMember(owner = "client!qda", name = "z", descriptor = "I")
	public static int anInt7363 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IBIII)V")
	public static void method6114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static433.anInt7419; local3++) {
			@Pc(9) Rectangle local9 = Class63_Sub1.aRectangleArray4[local3];
			if (arg2 < local9.width + local9.x && arg0 + arg2 > local9.x && local9.y + local9.height > arg1 && local9.y < arg1 + arg3) {
				Static424.aBooleanArray30[local3] = true;
			}
		}
	}
}
