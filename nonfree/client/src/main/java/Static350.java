import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!dp;")
	public static Class53 aClass53_159;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!pi;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Lclient!dj;")
	public static Class49 aClass49_9;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!mb;")
	public static Class132 aClass132_20 = null;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public static int anInt6303 = 0;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	public static void method5747(@OriginalArg(1) int arg0) {
		Static28.anInt542 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZBI)Ljava/lang/String;")
	public static String method5748(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(50) char[] local50 = new char[local34];
		local50[0] = '+';
		for (@Pc(63) int local63 = local34 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(77) int local77 = local67 - arg0 * 10;
			if (local77 >= 10) {
				local50[local63] = (char) (local77 + 87);
			} else {
				local50[local63] = (char) (local77 + 48);
			}
		}
		return new String(local50);
	}
}
