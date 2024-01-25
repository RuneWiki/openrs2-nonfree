import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!at;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	public static int anInt5407 = -1;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)Z")
	public static boolean method4356(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIZ)V")
	public static void method4357(@OriginalArg(0) boolean arg0) {
		Static202.anInt3664--;
		if (Static202.anInt3664 == 0) {
			anIntArray422 = null;
		}
		if (!arg0) {
			return;
		}
		Static158.anInt2676--;
		if (Static158.anInt2676 == 0) {
			Static389.anIntArray561 = null;
			return;
		}
	}
}
