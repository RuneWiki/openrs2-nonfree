import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method1278(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method1279(@OriginalArg(0) Object[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method1280(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
