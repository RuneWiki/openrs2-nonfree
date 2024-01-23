import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)V")
	public static void method3283(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method3284(@OriginalArg(0) Object[] arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}
}
