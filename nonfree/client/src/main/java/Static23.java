import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
	public static int anInt531 = 0;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public static int anInt532 = -1;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_150 = Static65.method1172("(U0a )2 in: ");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
	public static int[] anIntArray37 = new int[256];

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public static int anInt542 = 0;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!kb;")
	public static Class46 aClass46_151 = Static65.method1172("gelb:");

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "[I")
	public static int[] anIntArray39 = new int[4000];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class46 method413(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static178.method2860(new Class46[] { Static130.aClass46_1065, Static57.method1068(arg0), Static80.aClass46_689 });
		} else if (arg0 < 10000000) {
			return Static178.method2860(new Class46[] { Static3.aClass46_18, Static57.method1068(arg0 / 1000), Static41.aClass46_1322, Static80.aClass46_689 });
		} else {
			return Static178.method2860(new Class46[] { Static100.aClass46_803, Static57.method1068(arg0 / 1000000), Static121.aClass46_992, Static80.aClass46_689 });
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method414() {
		aClass46_151 = null;
		anIntArray38 = null;
		anIntArray37 = null;
		aClass46_150 = null;
		anIntArray39 = null;
	}
}
