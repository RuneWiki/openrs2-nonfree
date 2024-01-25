import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!or;")
	public static Class244 aClass244_72;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "I")
	public static int anInt10224;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt10226;

	@OriginalMember(owner = "client!r", name = "p", descriptor = "I")
	public static int anInt10232;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!fa;Lclient!ri;I)Lclient!r;")
	public static synchronized Class31 method8065(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface4 arg3, @OriginalArg(4) Class284 arg4) {
		if (arg2 == 0) {
			return Static464.method6364(arg1, arg3);
		} else if (arg2 == 2) {
			return Static114.method2276(arg3, arg1);
		} else if (arg2 == 1) {
			return Static331.method4882(arg1, arg3, arg0);
		} else if (arg2 == 5) {
			return Static163.method1109(arg4, arg1, arg0, arg3);
		} else if (arg2 == 3) {
			return Static598.method1234(arg4, arg1, arg0, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
