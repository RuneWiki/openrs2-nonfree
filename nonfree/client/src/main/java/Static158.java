import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array23 = new Class46[200];

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1279 = Static65.method1172("shake:");

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1278 = aClass46_1279;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public static int anInt3511 = 0;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1280 = aClass46_1279;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1281 = Static65.method1172("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
	public static void method2549() {
		if (Static156.aClass70_1 != null) {
			@Pc(8) Class70 local8 = Static156.aClass70_1;
			synchronized (Static156.aClass70_1) {
				Static156.aClass70_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	public static void method2550() {
		aClass46_1279 = null;
		aClass46_1280 = null;
		aClass46Array23 = null;
		aClass46_1281 = null;
		aClass46_1278 = null;
	}
}
