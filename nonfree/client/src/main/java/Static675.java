import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static675 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method1325(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)V")
	public static void method1326(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/applet/Applet;[Ljava/lang/Object;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method1327(@OriginalArg(0) Applet arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}
}
