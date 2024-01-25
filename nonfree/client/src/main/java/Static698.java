import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static698 {

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method8235(@OriginalArg(1) Applet arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)V")
	public static void method8236(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method8237(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
