import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
	public static int anInt9676;

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
	public static final int[] anIntArray839 = new int[200];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjava/awt/Canvas;BILclient!d;ILclient!aj;)Lclient!ha;")
	public static synchronized Class13 method8453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class15 arg6) {
		if (arg3 == 0) {
			return Static67.method1353(arg5, arg4, arg1, arg2);
		} else if (arg3 == 2) {
			return Static150.method5042(arg1, arg4, arg2, arg5);
		} else if (arg3 == 1) {
			return Static673.method9348(arg4, arg0, arg2);
		} else if (arg3 == 5) {
			return Static66.method1349(arg0, arg6, arg4, arg2);
		} else if (arg3 == 3) {
			return Static685.method6688(arg6, arg2, arg0, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
