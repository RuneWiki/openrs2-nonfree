import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method1964(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
