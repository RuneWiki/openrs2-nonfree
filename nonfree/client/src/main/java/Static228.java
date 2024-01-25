import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "Lclient!qw;")
	public static Class319 aClass319_15;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_43 = new Class320(53);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "Z")
	public static boolean aBoolean744 = false;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;IIILclient!d;Lclient!ik;BI)Lclient!ha;")
	public static synchronized Class22 method9348(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface4 arg4, @OriginalArg(5) Class182 arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static59.method1384(arg3, arg2, arg0, arg4);
		} else if (arg6 == 2) {
			return Static487.method6615(arg4, arg0, arg2, -122, arg3);
		} else if (arg6 == 1) {
			return Static290.method4045(arg0, arg1, arg4);
		} else if (arg6 == 5) {
			return Static414.method5527(arg5, arg0, arg1, arg4);
		} else if (arg6 == 3) {
			return Static734.method7381(arg5, arg4, arg1, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}
}
