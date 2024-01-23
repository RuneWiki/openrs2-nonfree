import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static64 {

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!fh;")
	public static Class58 aClass58_37;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	public static void method1027() {
		Static146.method2310();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fh;)V")
	public static void method1028(@OriginalArg(0) Class58 arg0) {
		aClass58_37 = arg0;
	}
}
