import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static370 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Object;BLjava/applet/Applet;)Ljava/lang/Object;")
	public static Object method5988(@OriginalArg(0) String arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg0, arg1);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method5989(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;BLjava/applet/Applet;)V")
	public static void method5990(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}
}
