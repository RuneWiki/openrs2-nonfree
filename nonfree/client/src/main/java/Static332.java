import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
	public static int anInt5780;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt5784;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Lclient!he;")
	public static Class100 aClass100_63;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_305 = new Class123(16, 6);

	@OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
	public static int[] anIntArray390 = new int[2];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(CB)Z")
	public static boolean method4837(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static300.method4423(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static172.aCharArray2;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
			@Pc(50) char[] local50 = Static334.aCharArray3;
			for (@Pc(52) int local52 = 0; local52 < local50.length; local52++) {
				@Pc(58) char local58 = local50[local52];
				if (arg0 == local58) {
					return true;
				}
			}
			return false;
		}
	}
}
