import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static468 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;I[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method5096(@OriginalArg(0) Applet arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method5097(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method5098(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
