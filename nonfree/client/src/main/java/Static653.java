import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static653 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method5389(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method5390(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method5391(@OriginalArg(0) Applet arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}
}
