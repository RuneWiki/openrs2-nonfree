import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static224 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public static int anInt11062;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_211 = new Class225(54, -1);

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
	public static final int anInt11064 = 16777215;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(CI)Z")
	public static boolean method9652(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!nca;ILjava/awt/Canvas;IIILclient!d;)Lclient!ha;")
	public static synchronized Class145 method9685(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Interface3 arg6) {
		if (arg1 == 0) {
			return Static227.method3263(arg4, arg6, arg5, arg2);
		} else if (arg1 == 2) {
			return Static440.method6372(arg6, arg5, arg4, arg2);
		} else if (arg1 == 1) {
			return Static236.method3350(arg3, arg6, arg2);
		} else if (arg1 == 5) {
			return Static339.method4724(arg2, arg3, arg0, arg6);
		} else if (arg1 == 3) {
			return Static732.method4144(arg0, arg6, arg2, arg3);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
