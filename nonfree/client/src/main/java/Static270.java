import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public static int anInt5194 = 104;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method4338() {
		if (Static456.anInt7969 != -1) {
			Static38.method828(-1, Static456.anInt7969, -1, false);
			Static456.anInt7969 = -1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
