import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static683 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)Ljava/lang/Object;")
	public static Object method5174(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;ZLjava/applet/Applet;)V")
	public static void method5175(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method5176(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}
}
