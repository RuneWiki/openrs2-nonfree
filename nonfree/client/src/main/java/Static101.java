import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!eaa", name = "G", descriptor = "Lclient!pu;")
	public static Class270 aClass270_22;

	@OriginalMember(owner = "client!eaa", name = "J", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!eaa", name = "K", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_2 = new Class316(2, 4);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BLclient!pu;Lclient!pu;Lclient!pu;Lclient!bh;)Z")
	public static boolean method1680(@OriginalArg(1) Class270 arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) Class270 arg2, @OriginalArg(4) Class1_Sub7_Sub2 arg3) {
		Static547.aClass270_115 = arg1;
		Static442.aClass270_95 = arg2;
		Static511.aClass270_105 = arg0;
		Static97.aClass1_Sub7_Sub2_2 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IC)Z")
	public static boolean method1681(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
