import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static187 {

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
	public static int anInt3768;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString123 = "flash1:";

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "Lclient!th;")
	public static Class169 aClass169_106 = new Class169(16);

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V")
	public static void method3070() {
		Static179.aClass169_100.method4018();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method3071(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 >= 10000000) {
			return "<col=00ff80>" + arg0 / 1000000 + Static84.aString51 + "</col>";
		} else {
			return "<col=ffffff>" + arg0 / 1000 + Static144.aString99 + "</col>";
		}
	}
}
