import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static246 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!tq;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public static int anInt4801;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
	public static int anInt4800 = 0;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString281 = "Loading wordpack - ";

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIII)V")
	public static void method4344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1011) {
			Static223.method3894(10, arg1, arg0);
		} else if (arg2 == 1010) {
			Static223.method3894(11, arg1, arg0);
		} else if (arg2 == 1008) {
			Static223.method3894(12, arg1, arg0);
		} else if (arg2 == 1003) {
			Static223.method3894(13, arg1, arg0);
		} else if (arg2 == 1006) {
			Static223.method3894(14, arg1, arg0);
		}
	}
}
