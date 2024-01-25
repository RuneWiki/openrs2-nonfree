import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static684 {

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLjava/applet/Applet;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;")
	public static Object method6375(@OriginalArg(1) Applet arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) String arg2) throws Throwable {
		return JSObject.getWindow(arg0).call(arg2, arg1);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;B)Ljava/lang/Object;")
	public static Object method6376(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V")
	public static void method6377(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}
}
