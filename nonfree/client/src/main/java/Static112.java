import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;")
	public static Object method281(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).eval(arg0);
	}
}
