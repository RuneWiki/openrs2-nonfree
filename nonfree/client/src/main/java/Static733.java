import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static733 {

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V")
	public static void method8726(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method8727(@OriginalArg(0) Object[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method8728(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
