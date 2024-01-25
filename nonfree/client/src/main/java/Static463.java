import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
	public static Object method2376(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;I)Ljava/lang/Object;")
	public static Object method2377(@OriginalArg(0) String arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method2378(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
