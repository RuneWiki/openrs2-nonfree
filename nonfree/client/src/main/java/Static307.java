import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static307 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!mq;")
	public static Class71 aClass71_9;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public static int anInt5554;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	public static final int[] anIntArray287 = new int[13];

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "[Lclient!hn;")
	public static Class150[] aClass150Array1 = new Class150[50];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Z")
	public static boolean method5029() {
		if (Static319.aClass2_Sub1_Sub13_2 == null) {
			return false;
		} else {
			if (Static319.aClass2_Sub1_Sub13_2.anInt6866 >= 2000) {
				Static319.aClass2_Sub1_Sub13_2.anInt6866 -= 2000;
			}
			return Static319.aClass2_Sub1_Sub13_2.anInt6866 == 1001;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public static boolean method5031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static172.method3361(arg1)) {
			return true;
		} else {
			return !Static172.method3361(arg0);
		}
	}
}
