import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)Ljava/lang/Object;")
	public static Object method1096(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).eval(arg1);
	}
}
