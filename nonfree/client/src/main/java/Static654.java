import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static654 {

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)V")
	public static void method5163(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		JSObject.getWindow(arg1).eval(arg0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)Ljava/lang/Object;")
	public static Object method5164(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		return JSObject.getWindow(arg0).call(arg1, (Object[]) null);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[Ljava/lang/Object;Ljava/lang/String;Ljava/applet/Applet;)Ljava/lang/Object;")
	public static Object method5165(@OriginalArg(1) Object[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Applet arg2) throws Throwable {
		return JSObject.getWindow(arg2).call(arg1, arg0);
	}
}
