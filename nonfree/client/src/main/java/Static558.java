import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static558 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)V")
	public static void method7781(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method7782(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z[Ljava/lang/Object;Ljava/applet/Applet;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method7783(@OriginalArg(1) Object[] arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}
}
