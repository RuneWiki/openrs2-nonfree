import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!nc;")
	public static Class229 aClass229_1;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "[Lclient!rfa;")
	public static final Class167_Sub1[] aClass167_Sub1Array1 = new Class167_Sub1[37];

	@OriginalMember(owner = "client!ae", name = "qb", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Z")
	public static boolean method153(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)Lclient!ap;")
	public static Class21 method183(@OriginalArg(1) int arg0) {
		@Pc(8) Class21[] local8 = Static476.method6811();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class21 local16 = local8[local10];
			if (local16.anInt686 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
