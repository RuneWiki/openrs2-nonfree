import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method3590(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([Ljava/lang/Object;BLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method3591(@OriginalArg(0) Object[] arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/applet/Applet;Ljava/lang/String;)V")
	public static void method3592(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}
}
