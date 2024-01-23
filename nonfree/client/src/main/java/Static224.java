import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method1073(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILjava/lang/String;[Ljava/lang/Object;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method1074(@OriginalArg(1) String arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg0, arg1);
	}
}
