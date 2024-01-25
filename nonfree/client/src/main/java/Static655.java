import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static655 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([Ljava/lang/Object;ILjava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method4697(@OriginalArg(0) Object[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;Z)Ljava/lang/Object;")
	public static Object method4698(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method4699(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
