import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static613 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!cb;")
	public static Class50 aClass50_172;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Lclient!re;")
	public static Class301 aClass301_3;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)Z")
	public static boolean method8234(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 15 || arg0 == 22 || arg0 == 50 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 3 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Lclient!rh;")
	public static Class307 method8236(@OriginalArg(1) int arg0) {
		@Pc(11) Class307[] local11 = Static429.method6471();
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			if (arg0 == local11[local13].anInt8535) {
				return local11[local13];
			}
		}
		return null;
	}
}
