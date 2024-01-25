import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
	public static int anInt2654;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)V")
	public static void method2101(@OriginalArg(1) int arg0) {
		if (Static404.anInt7074 == 1) {
			Static266.anInt4706 = arg0;
		} else if (Static404.anInt7074 == 2 || Static404.anInt7074 == 3) {
			Static166.anInt2967 = arg0;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)I")
	public static int method2102(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
