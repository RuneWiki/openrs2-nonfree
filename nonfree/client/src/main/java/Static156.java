import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_70 = new Class217(103, 5);

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	public static int anInt3162 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIIII)V")
	public static void method2635(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static423.anInt7114 == 0) {
			Static260.method3743(false);
		} else {
			Static278.anInt5921 = Static423.anInt7114;
			Static178.method2951(0);
		}
		Static259.anInt6287 = arg3;
		Static18.aBoolean24 = arg0;
		Static115.anInt2360 = arg2;
		Static143.method2377(arg1);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	public static void method2640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static102.aClass147_3 == Static424.aClass147_4) {
			if (!Static28.method370(0, arg1, false, 1, arg0, -2, 1, 0)) {
				Static28.method370(0, arg1, false, 1, arg0, -3, 1, 0);
			}
		} else if (!Static28.method370(0, arg1, false, 1, arg0, -3, 1, 0)) {
			Static28.method370(0, arg1, false, 1, arg0, -2, 1, 0);
		}
	}
}
