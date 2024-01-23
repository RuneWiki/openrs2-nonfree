import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	public static int anInt417;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "Lclient!sk;")
	public static Class1_Sub28 aClass1_Sub28_1 = new Class1_Sub28(0, 0);

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt418 = 5063219;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass61_1 != null && local7.aClass61_1.aLong65 == arg3) {
			return true;
		} else if (local7.aClass102_1 != null && local7.aClass102_1.aLong113 == arg3) {
			return true;
		} else if (local7.aClass171_1 != null && local7.aClass171_1.aLong196 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt3452; local46++) {
				if (local7.aClass60Array3[local46].aLong64 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
