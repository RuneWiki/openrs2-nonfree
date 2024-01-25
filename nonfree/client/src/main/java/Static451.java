import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static451 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!hr;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBI)Z")
	public static boolean method6578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static22.method651(arg1, arg0) || Static397.method5858(arg0, arg1);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	public static void method6579() {
		if (Static67.aString10.length() == 0) {
			return;
		}
		Static36.method908("--> " + Static67.aString10);
		Static431.method6283(false, Static67.aString10);
		Static9.anInt359 = 0;
		Static67.aString10 = "";
		Static97.anInt2208 = 0;
	}
}
