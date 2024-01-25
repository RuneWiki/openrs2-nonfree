import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static653 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILjava/applet/Applet;Ljava/lang/String;)V")
	public static void method5176(@OriginalArg(1) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method5177(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
	public static Object method5178(@OriginalArg(0) Object[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}
}
