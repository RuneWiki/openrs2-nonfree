import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static129 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "I")
	public static int anInt2460;

	@OriginalMember(owner = "client!i", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "J")
	public static long aLong84 = 0L;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IC)Z")
	public static boolean method2266(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
