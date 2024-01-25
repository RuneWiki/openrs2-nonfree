import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!wa", name = "N", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Lclient!it;")
	public static final Class149 aClass149_8 = new Class149();

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "Lclient!st;")
	public static final Class280 aClass280_10 = new Class280();

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_149 = new Class45(78, 2);

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
	public static boolean method7802(@OriginalArg(0) int arg0) {
		return arg0 == 25 || arg0 == 51 || arg0 == 1009 || arg0 == 3 || arg0 == 47;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIII)Z")
	public static boolean method7803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg1; local7++) {
			for (@Pc(11) int local11 = arg4; local11 <= arg0; local11++) {
				if (Static236.anIntArrayArray47[local7][local11] == arg2 && Static507.anIntArrayArray84[local7][local11] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
