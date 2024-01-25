import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static393 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!la;")
	public static Class63 aClass63_9;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)I")
	public static int method5568(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	public static void method5569() {
		if (Static409.anInt1461 == 3) {
			Static27.method293(4);
		} else if (Static409.anInt1461 == 7) {
			Static27.method293(8);
		} else if (Static409.anInt1461 == 10) {
			Static27.method293(11);
		}
	}
}
