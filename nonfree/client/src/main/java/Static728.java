import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static728 {

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method687(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method688(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "([Ljava/lang/Object;Ljava/applet/Applet;BLjava/lang/String;)Ljava/lang/Object;")
	public static Object method689(@OriginalArg(0) Object[] arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg2, arg0);
	}
}
