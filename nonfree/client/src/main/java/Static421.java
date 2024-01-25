import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oca", name = "n", descriptor = "Z")
	public static boolean aBoolean575 = false;

	@OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
	public static int anInt7733 = -1;

	@OriginalMember(owner = "client!oca", name = "t", descriptor = "F")
	public static float aFloat163 = 1.0F;

	@OriginalMember(owner = "client!oca", name = "v", descriptor = "I")
	public static int anInt7736 = 0;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIIII)V")
	public static void method6914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static254.anInt4901; local8++) {
			@Pc(14) Rectangle local14 = Class33.aRectangleArray1[local8];
			if (arg0 < local14.x + local14.width && arg0 + arg3 > local14.x && local14.y + local14.height > arg2 && arg2 + arg1 > local14.y) {
				Static531.aBooleanArray54[local8] = true;
			}
		}
		Static220.method4070(arg2 + arg1, arg2, arg0, arg0 + arg3);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)I")
	public static int method6916(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
