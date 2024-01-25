import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIZI)V")
	public static void method2047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static291.anInt5025 = arg2;
		Static458.anInt7890 = arg0;
		Static593.anInt9645 = arg1;
		Static15.anInt199 = arg3;
		Static373.anInt6267 = arg5;
		if (arg4 && Static15.anInt199 >= 100) {
			Static405.anInt7085 = Static373.anInt6267 * 512 + 256;
			Static59.anInt1132 = Static458.anInt7890 * 512 + 256;
			Static295.anInt5077 = Static66.method1191(Static405.anInt7085, Static433.anInt7592, Static59.anInt1132) - Static291.anInt5025;
		}
		Static243.anInt4483 = -1;
		Static442.anInt7679 = -1;
		Static340.anInt5707 = 2;
	}
}
