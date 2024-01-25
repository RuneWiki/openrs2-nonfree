import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static554 {

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method4838(@OriginalArg(0) String arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg0, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method4839(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)V")
	public static void method4840(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
