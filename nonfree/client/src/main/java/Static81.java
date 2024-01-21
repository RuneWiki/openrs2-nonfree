import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "Lclient!pa;")
	public static Class35_Sub1 aClass35_Sub1_19;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
	public static boolean aBoolean114 = true;

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
	public static int anInt2134 = 0;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!id;")
	public static Class34 aClass34_1058 = Static9.method266("");

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!id;")
	public static Class34 aClass34_1057 = aClass34_1058;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)V")
	public static void method1389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static60.anInt1655 == 0 || arg0 == 0 || Static31.anInt924 >= 50) {
			return;
		}
		Static114.anIntArray345[Static31.anInt924] = arg1;
		Static17.anIntArray66[Static31.anInt924] = arg0;
		Static30.anIntArray90[Static31.anInt924] = arg2;
		Static7.aClass72Array1[Static31.anInt924] = null;
		Static100.anIntArray316[Static31.anInt924] = 0;
		Static31.anInt924++;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
	public static void method1390() {
		aClass35_Sub1_19 = null;
		aClass34_1057 = null;
		aClass34_1058 = null;
		anIntArray262 = null;
	}
}
