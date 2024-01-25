import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static602 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method6575(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object method6576(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZLjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method6577(@OriginalArg(1) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}
}
