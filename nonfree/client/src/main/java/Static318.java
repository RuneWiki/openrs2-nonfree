import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "F")
	public static float aFloat169;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public static int anInt5929 = 0;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
	public static int anInt5934 = 0;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "[I")
	public static final int[] anIntArray418 = new int[3];

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	public static void method4929() {
		if (Static50.anInt1258 != -1) {
			Static196.method3246(Static50.anInt1258, -1, false, -1);
			Static50.anInt1258 = -1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)Z")
	public static boolean method4930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)V")
	public static void method4932(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class2 local9 = Static9.aClass162_2.method3527(); local9 != null; local9 = Static9.aClass162_2.method3523()) {
			if ((local9.aLong268 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method7966();
			}
		}
	}
}
