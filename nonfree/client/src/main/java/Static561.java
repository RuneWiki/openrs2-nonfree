import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static561 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "D")
	public static double aDouble31;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)Z")
	public static boolean method7660(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIB)Z")
	public static boolean method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
	public static void method7662() {
		Static55.aBoolean127 = false;
		Static517.method7334();
	}
}
