import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method2526(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}
}
