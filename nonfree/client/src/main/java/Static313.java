import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!km", name = "K", descriptor = "[I")
	public static int[] anIntArray314;

	@OriginalMember(owner = "client!km", name = "L", descriptor = "I")
	public static int anInt5334;

	@OriginalMember(owner = "client!km", name = "M", descriptor = "Lclient!l;")
	public static Class200 aClass200_1;

	@OriginalMember(owner = "client!km", name = "E", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_79 = new Class289(65, 7);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IC)Z")
	public static boolean method4499(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(25) char[] local25 = Static454.aCharArray6;
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				@Pc(33) char local33 = local25[local27];
				if (arg0 == local33) {
					return true;
				}
			}
		}
		return false;
	}
}
