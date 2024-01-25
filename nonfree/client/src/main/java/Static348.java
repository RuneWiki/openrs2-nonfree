import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "[I")
	public static int[] anIntArray433;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
	public static final int[] anIntArray434 = new int[32];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
	public static boolean method6676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
	public static void method6679(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static550.method7597();
		Static98.method1636();
		Static113.method1829();
		Static72.method7647(arg2, arg0, arg1);
		Static201.method2821();
		Static209.method2989(Static563.aClass143_13);
		Static11.method173(Static563.aClass143_13);
		Static286.method3963(Static563.aClass143_13, Static471.aClass50_136);
		Static88.method1383();
		Static375.method5528(Static166.aClass59Array5);
		Static212.method3058();
		Static523.method8754();
		if (Static539.anInt8853 == 3) {
			Static42.method560(4);
		} else if (Static539.anInt8853 == 7) {
			Static42.method560(8);
		} else if (Static539.anInt8853 == 10) {
			Static42.method560(11);
		} else if (Static539.anInt8853 == 1 || Static539.anInt8853 == 2) {
			Static384.method5637();
		}
	}
}
