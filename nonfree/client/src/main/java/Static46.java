import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ve;")
	public static Class69 aClass69_11;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array4;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[I")
	public static final int[] anIntArray98 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_290 = Static81.method1507(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_291 = Static81.method1507("::tele 0)1");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)I")
	public static int method845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg3;
			arg3 = local6;
		}
		@Pc(18) int local18 = arg1 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return arg5;
		} else if (local18 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return 7 + 1 - arg5 - arg3;
		}
	}
}
