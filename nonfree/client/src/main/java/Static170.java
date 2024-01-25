import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	public static int anInt3907;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public static void method3249(@OriginalArg(1) int arg0) {
		Static274.anInt5655 = arg0;
		Static549.aClass125_71.method3521();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(II)I")
	public static int method3250(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method3251(@OriginalArg(1) int arg0) {
		@Pc(15) String local15 = Integer.toString(arg0);
		for (@Pc(20) int local20 = local15.length() - 3; local20 > 0; local20 -= 3) {
			local15 = local15.substring(0, local20) + "," + local15.substring(local20);
		}
		if (local15.length() > 9) {
			return " <col=00ff80>" + local15.substring(0, local15.length() - 8) + Static362.aClass67_109.method1934(Static193.anInt7803) + " (" + local15 + ")</col>";
		} else if (local15.length() > 6) {
			return " <col=ffffff>" + local15.substring(0, local15.length() - 4) + Static161.aClass67_52.method1934(Static193.anInt7803) + " (" + local15 + ")</col>";
		} else {
			return " <col=ffff00>" + local15 + "</col>";
		}
	}
}
