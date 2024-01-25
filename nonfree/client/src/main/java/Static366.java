import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
	public static void method4252(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method4253(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method4254(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}
}
