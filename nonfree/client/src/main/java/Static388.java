import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!mea", name = "K", descriptor = "F")
	public static float aFloat127;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V")
	public static void method5838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static137.method2243()) {
			return;
		}
		if (Static478.anInt8342 != arg1) {
			Static364.aString94 = "";
		}
		Static707.anInt11053 = arg0;
		Static478.anInt8342 = arg1;
		Static638.method8657(6);
	}
}
