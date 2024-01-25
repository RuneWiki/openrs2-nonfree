import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!mm", name = "K", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_25 = new Class107(200);

	@OriginalMember(owner = "client!mm", name = "T", descriptor = "Z")
	public static boolean aBoolean384 = true;

	@OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
	public static int anInt4466 = 0;

	@OriginalMember(owner = "client!mm", name = "W", descriptor = "Lclient!ae;")
	public static Class2_Sub2 aClass2_Sub2_1 = null;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
	public static void method3872() {
		if (Static161.aBoolean324) {
			Static111.aClass46_9 = null;
			Static284.aClass46_21 = null;
			Static161.aBoolean324 = false;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZZI)V")
	public static void method3873(@OriginalArg(0) boolean arg0) {
		Static275.anInt5637++;
		Static201.method3811();
		if (arg0) {
			Static19.anInt314++;
			Static36.method471();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)I")
	public static int method3875(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
