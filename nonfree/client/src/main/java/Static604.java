import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static604 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method8248(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method8249(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method8250(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}
}
