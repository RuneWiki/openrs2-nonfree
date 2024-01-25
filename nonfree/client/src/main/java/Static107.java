import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static107 {

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_44 = new Class200(113, -1);

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Z")
	public static boolean aBoolean189 = true;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
	public static int method1971(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method1973(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static144.method2592(arg5, arg4, -1, arg3, arg2, arg0, (String) null, arg1);
	}
}
