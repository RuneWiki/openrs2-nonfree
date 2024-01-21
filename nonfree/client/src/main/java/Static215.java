import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method1445(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}
}
