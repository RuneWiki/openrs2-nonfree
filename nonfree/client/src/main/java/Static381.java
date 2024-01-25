import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static381 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method5667(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method5668(@OriginalArg(0) String arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method5669(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
