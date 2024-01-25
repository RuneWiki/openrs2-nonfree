import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	public static int anInt9136;

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!wv;")
	public static final Class409 aClass409_13 = new Class409(2, 2);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!gn;")
	public static final Class136 aClass136_39 = new Class136(16);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
	public static int[] anIntArray503 = new int[2];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILclient!lb;Lclient!d;ILjava/awt/Canvas;I)Lclient!ha;")
	public static synchronized Class67 method7644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Canvas arg5, @OriginalArg(7) int arg6) {
		if (arg6 == 0) {
			return Static624.method8449(arg0, arg4, arg5, arg3);
		} else if (arg6 == 2) {
			return Static504.method7232(arg4, arg0, arg5, arg3);
		} else if (arg6 == 1) {
			return Static588.method8090(arg1, arg5, arg3);
		} else if (arg6 == 5) {
			return Static260.method4058(arg3, arg2, arg5, arg1);
		} else if (arg6 == 3) {
			return Static730.method6928(arg1, arg3, arg2, arg5);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIB)V")
	public static void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 >= Static85.anInt1313 && arg4 <= Static316.anInt6313 && arg1 >= Static280.anInt5114 && Static356.anInt6028 >= arg2) {
			Static66.method816(arg0, arg3, arg2, arg1, arg4);
		} else {
			Static624.method8452(arg2, arg1, arg3, arg4, arg0);
		}
	}
}
