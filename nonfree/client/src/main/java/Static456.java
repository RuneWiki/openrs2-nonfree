import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method3805(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method3806(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method3807(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
