import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method4929(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method4930(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object method4931(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}
}
