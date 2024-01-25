import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method4927(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method4928(@OriginalArg(0) Object[] arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method4929(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
