import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "J")
	public static long aLong240;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray35 = new boolean[100];

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!em;")
	public static final Class83 aClass83_188 = new Class83(117, 3);

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_101 = new Class208(78, 0);

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)Z")
	public static boolean method7110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IC)Z")
	public static boolean method7111(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static309.aCharArray7;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
