import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static471 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method4355(@OriginalArg(0) Applet arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method4356(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method4357(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
