import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method3099(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;Z)Ljava/lang/Object;")
	public static Object method3100(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method3101(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
