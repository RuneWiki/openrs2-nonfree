import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static372 {

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt6183 = 0;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_150 = new Class87(64);

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt6186 = -1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
	public static void method5483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1007) {
			Static370.method5470(Static323.aClass98_27, arg0, arg2);
		} else if (arg1 == 1003) {
			Static370.method5470(Static606.aClass98_50, arg0, arg2);
		} else if (arg1 == 1008) {
			Static370.method5470(Static70.aClass98_8, arg0, arg2);
		} else if (arg1 == 1012) {
			Static370.method5470(Static477.aClass98_37, arg0, arg2);
		} else if (arg1 == 1002) {
			Static370.method5470(Static604.aClass98_51, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method5484(@OriginalArg(0) Class133 arg0) {
		if (Static142.aBoolean190) {
			Static382.method5610(arg0);
		} else {
			Static232.method3879(arg0);
		}
	}
}
