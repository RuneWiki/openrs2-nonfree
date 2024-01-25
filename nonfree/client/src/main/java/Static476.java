import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method5363(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
	public static void method5364(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;B)Ljava/lang/Object;")
	public static Object method5365(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}
}
