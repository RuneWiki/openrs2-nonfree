import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static459 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method3565(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
	public static void method3566(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method3567(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
