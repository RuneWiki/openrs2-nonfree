import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_49 = new Class268(8);

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "Lclient!of;")
	public static final Class174 aClass174_168 = new Class174("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
	public static int anInt5767 = 0;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public static void method4780() {
		Static139.anInt2476 = 0;
		Static342.aClass216Array1 = new Class216[50];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
	public static int method4785(@OriginalArg(0) int arg0) {
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
}
