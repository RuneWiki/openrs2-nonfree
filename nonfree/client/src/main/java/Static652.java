import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static652 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method1817(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
	public static Object method1818(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method1819(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
