import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_75;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "[I")
	public static int[] anIntArray305 = new int[100];

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "I")
	public static int anInt2857 = 0;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "[I")
	public static int[] anIntArray306 = new int[100];

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
	public static int anInt2858 = -1;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)Lclient!i;")
	public static Class41 method2001(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static149.method2324(new Class41[] { Static23.aClass41_138, Static152.method2471(arg0), Static60.aClass41_1279 });
		} else if (arg0 < 10000000) {
			return Static149.method2324(new Class41[] { Static15.aClass41_91, Static152.method2471(arg0 / 1000), Static144.aClass41_911, Static60.aClass41_1279 });
		} else {
			return Static149.method2324(new Class41[] { Static117.aClass41_801, Static152.method2471(arg0 / 1000000), Static117.aClass41_802, Static60.aClass41_1279 });
		}
	}
}
