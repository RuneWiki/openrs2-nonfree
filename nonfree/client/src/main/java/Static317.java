import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static317 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method293(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, arg2);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;)V")
	public static void method294(@OriginalArg(0) Applet arg0, @OriginalArg(2) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;")
	public static Object method295(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}
}
