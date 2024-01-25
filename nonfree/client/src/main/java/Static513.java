import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!lm;")
	public static Class219 aClass219_2;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
	public static int anInt9127 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
	public static void method7984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static506.anInt8995 = arg1;
		Static588.anInt10265 = arg0;
		if (Static255.anInt4904 == 0) {
			Static488.anInt8751 = Static569.anInt9977 * 2 + Static506.anInt8995;
			Static307.anInt5554 = Static454.anInt6415 * 2 + Static588.anInt10265;
		} else if (Static255.anInt4904 == 1) {
			Static19.anInt353 = Static473.anInt8444 + Static506.anInt8995 / Static532.anInt9333 + 2;
			Static395.anInt7388 = Static90.anInt1656 + Static588.anInt10265 / Static341.anInt6402 + 2;
			Static488.anInt8751 = Static532.anInt9333 * Static19.anInt353;
			Static307.anInt5554 = Static341.anInt6402 * Static395.anInt7388;
			Static454.anInt6415 = Static307.anInt5554 - Static588.anInt10265 >> 1;
			Static569.anInt9977 = Static488.anInt8751 - Static506.anInt8995 >> 1;
		} else if (Static255.anInt4904 == 2) {
			Static488.anInt8751 = Static506.anInt8995;
			Static307.anInt5554 = Static588.anInt10265;
			return;
		}
	}
}
