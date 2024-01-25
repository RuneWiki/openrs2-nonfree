import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "[I")
	public static final int[] anIntArray425 = new int[13];

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)I")
	public static int method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static341.anIntArray504[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIB)V")
	public static void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static528.anInt9120; local8++) {
			@Pc(14) Rectangle local14 = Class96.aRectangleArray1[local8];
			if (arg0 < local14.width + local14.x && arg3 + arg0 > local14.x && arg2 < local14.height + local14.y && arg1 + arg2 > local14.y) {
				Static36.aBooleanArray6[local8] = true;
			}
		}
	}
}
