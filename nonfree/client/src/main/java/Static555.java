import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static555 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
	public static void method5216(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method5217(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method5218(@OriginalArg(0) Applet arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}
}
