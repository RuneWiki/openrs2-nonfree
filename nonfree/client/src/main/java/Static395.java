import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static395 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static int anInt4652 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method3918(@OriginalArg(1) int arg0) {
		if (Static377.anInt7322 == 1) {
			Static320.anInt6618 = arg0;
		} else if (Static377.anInt7322 == 2 || Static377.anInt7322 == 3) {
			Static573.anInt10095 = arg0;
		}
	}
}
