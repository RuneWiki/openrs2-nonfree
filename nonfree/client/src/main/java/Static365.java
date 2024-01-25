import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!mm;")
	public static Class194 aClass194_6;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!qba;")
	public static Class25 aClass25_6;

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_24 = new Class33(0, 16);

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "[I")
	public static final int[] anIntArray768 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "[I")
	public static final int[] anIntArray769 = new int[1000];

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public static int anInt8921 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IC)Z")
	public static boolean method7498(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
