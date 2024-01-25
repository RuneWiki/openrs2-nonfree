import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static262 {

	@OriginalMember(owner = "client!im", name = "W", descriptor = "Lclient!vha;")
	public static Class368 aClass368_2;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	public static int anInt4858 = 0;

	@OriginalMember(owner = "client!im", name = "K", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_93 = new Class359(46, 4);

	@OriginalMember(owner = "client!im", name = "V", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_6 = null;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V")
	public static void method4100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static51.anInt735 == 1) {
			Static208.method3305(arg0, arg1, Static315.aClass5_Sub3_Sub20_2);
		} else if (Static51.anInt735 == 2) {
			if (Static66.aBoolean570) {
				Static596.method2936(arg1 + Static106.method2037(), Static660.method8815() + arg0);
			} else {
				Static596.method2936(arg1, arg0);
			}
		}
		Static315.aClass5_Sub3_Sub20_2 = null;
		Static51.anInt735 = 0;
	}
}
