import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!kl;")
	public static Class138 aClass138_2;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt4231 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(CI)Z")
	public static boolean method3209(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static49.aCharArray3;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (arg0 == local40) {
					return true;
				}
			}
		}
		return false;
	}
}
