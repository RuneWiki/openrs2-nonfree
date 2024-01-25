import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static682 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)V")
	public static void method5124(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method5125(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method5126(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}
}
