import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static122 {

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
	public static int anInt2116;

	@OriginalMember(owner = "client!ef", name = "J", descriptor = "Lclient!du;")
	public static final Class79 aClass79_3 = new Class79("RC", 1);

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
	public static int anInt2112 = -2;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
	public static int anInt2114 = 13156520;

	@OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
	public static int anInt2115 = 2;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	public static int anInt2117 = 500;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)I")
	public static int method1910(@OriginalArg(1) int arg0) {
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
