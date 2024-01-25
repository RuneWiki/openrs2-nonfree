import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "Lclient!dj;")
	public static Class71 aClass71_3;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
	public static int anInt6907;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
	public static int anInt6904 = -1;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)V")
	public static void method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static120.aClass37ArrayArrayArray1[0][arg1][arg2] != null && Static120.aClass37ArrayArrayArray1[0][arg1][arg2].aClass37_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static120.aClass37ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class37 local46 = Static120.aClass37ArrayArrayArray1[local22][arg1][arg2] = new Class37(local22, arg1, arg2);
				if (local20) {
					local46.aByte23++;
				}
			}
		}
	}
}
