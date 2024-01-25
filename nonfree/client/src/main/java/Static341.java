import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static341 {

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!raa;")
	public static final Class253 aClass253_16 = new Class253("WTQA", 2);

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_165 = new Class133(43, -2);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBILclient!e;Ljava/awt/Canvas;Lclient!kea;)Lclient!oa;")
	public static synchronized Class5 method7477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Class161 arg4) {
		if (arg1 == 0) {
			return Static537.method7690(false, arg2, arg3);
		} else if (arg1 == 2) {
			return Static58.method1163(arg3, arg2);
		} else if (arg1 == 4) {
			return Static537.method7690(true, arg2, arg3);
		} else if (arg1 == 1) {
			return Static138.method2345(arg0, arg3, arg2);
		} else if (arg1 == 5) {
			return Static17.method3545(arg0, arg3, arg4, arg2);
		} else if (arg1 == 3) {
			return Static557.method5531(arg2, arg3, arg0, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
