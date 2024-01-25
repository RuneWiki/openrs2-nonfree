import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static546 {

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "[I")
	public static int[] anIntArray582;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public static void method7958() {
		Static410.anInt7495 = 0;
		Static387.anInt7217 = 0;
		Static588.anInt9613 = 0;
		Static23.anInt925 = 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public static boolean method7960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
