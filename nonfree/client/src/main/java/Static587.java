import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static587 {

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method3348(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method3349(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method3350(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
