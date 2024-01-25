import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static634 {

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "Lclient!da;")
	public static Class27 aClass27_19;

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_103 = new Class257(48, 3);

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
	public static boolean method7625(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Z")
	public static boolean method7628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void method7629() {
		if (Static370.aBoolean496) {
			return;
		}
		Static367.method5736(Static383.aClass56ArrayArrayArray1);
		if (Static591.aClass56ArrayArrayArray3 != null) {
			Static367.method5736(Static591.aClass56ArrayArrayArray3);
		}
		Static370.aBoolean496 = true;
	}
}
