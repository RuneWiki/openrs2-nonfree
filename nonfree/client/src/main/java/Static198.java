import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	public static final int anInt8759 = 1337;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method7519() {
		Static383.aClass5_12.method7544(Static291.aFloat105, Static485.aFloat186, Static436.aFloat181);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZLjava/awt/Canvas;Lclient!la;ILclient!d;I)Lclient!ha;")
	public static synchronized Class5 method7566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class196 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface7 arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static635.method8696(arg2, arg5, arg0, arg4);
		} else if (arg6 == 2) {
			return Static197.method3416(arg4, arg5, arg0, arg2);
		} else if (arg6 == 1) {
			return Static204.method3514(arg1, arg2, arg5);
		} else if (arg6 == 5) {
			return Static20.method904(arg1, arg5, arg2, arg3);
		} else if (arg6 == 3) {
			return Static649.method4788(arg2, arg3, arg1, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
