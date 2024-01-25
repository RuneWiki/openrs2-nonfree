import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static417 {

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!la;")
	public static Class208 aClass208_98;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!hg;")
	public static Class158 aClass158_8;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	public static int anInt7212;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
	public static boolean aBoolean554 = true;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_75 = new Class387(64, -1);

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public static int anInt7207 = -1;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt7210 = 0;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
	public static final int[] anIntArray425 = new int[13];

	@OriginalMember(owner = "client!of", name = "y", descriptor = "Lclient!cn;")
	public static Class73 aClass73_19 = null;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IC)Z")
	public static boolean method6234(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
