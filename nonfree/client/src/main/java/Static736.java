import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static736 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)V")
	public static void method7133(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method7134(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method7135(@OriginalArg(0) Object[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}
}
