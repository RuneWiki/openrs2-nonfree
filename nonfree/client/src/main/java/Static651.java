import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static651 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method4294(@OriginalArg(1) Applet arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method4295(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I)Ljava/lang/Object;")
	public static Object method4296(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}
}
