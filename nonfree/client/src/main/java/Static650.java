import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static650 {

	@OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
	public static int anInt10864;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
	public static void method9057() {
		Static373.method5551();
		Static299.method4404();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method9058(@OriginalArg(1) String arg0) {
		if (Class17_Sub1_Sub1.aString105.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class17_Sub1_Sub1.aString105.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class17_Sub1_Sub1.aString105.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method9059(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static337.method5264(-1, arg1, arg0, -1);
	}
}
