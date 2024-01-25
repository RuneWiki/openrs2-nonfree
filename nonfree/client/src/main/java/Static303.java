import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "[I")
	public static final int[] anIntArray273 = new int[6];

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	public static int anInt5651 = 0;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString152 = null;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static void method4582() {
		Static456.aClass321_2.method7222();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	public static void method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static314.anInt5780; local7++) {
			@Pc(13) Rectangle local13 = Class3_Sub16_Sub1.aRectangleArray2[local7];
			if (local13.width + local13.x > arg3 && arg1 + arg3 > local13.x && local13.y + local13.height > arg0 && arg0 + arg2 > local13.y) {
				Static383.aBooleanArray20[local7] = true;
			}
		}
	}
}
