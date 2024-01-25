import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public static void method2769() {
		if (Static324.anInt5144 == 5) {
			Static324.anInt5144 = 6;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZII)Z")
	public static boolean method2770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
