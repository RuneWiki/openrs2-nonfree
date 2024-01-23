import java.applet.Applet;
import netscape.javascript.JSObject;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;ILjava/applet/Applet;)Ljava/lang/Object;")
	public static Object method946(@OriginalArg(0) String arg0, @OriginalArg(2) Applet arg1) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, (Object[]) null);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;Z)V")
	public static void method947(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) throws Throwable {
		JSObject.getWindow(arg0).eval(arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/applet/Applet;I[Ljava/lang/Object;)Ljava/lang/Object;")
	public static Object method948(@OriginalArg(0) String arg0, @OriginalArg(1) Applet arg1, @OriginalArg(3) Object[] arg2) throws Throwable {
		return JSObject.getWindow(arg1).call(arg0, arg2);
	}
}
