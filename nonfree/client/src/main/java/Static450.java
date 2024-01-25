import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "Lclient!bt;")
	public static Class34 aClass34_94;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
	public static int anInt7035 = 0;

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "Lclient!ifa;")
	public static Class163 aClass163_49 = new Class163();

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V")
	public static void method6185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static267.aClass73ArrayArrayArray2[0][arg1][arg2] != null && Static267.aClass73ArrayArrayArray2[0][arg1][arg2].aClass73_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static267.aClass73ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class73 local44 = Static267.aClass73ArrayArrayArray2[local22][arg1][arg2] = new Class73(local22);
				if (local20) {
					local44.aByte20++;
				}
			}
		}
	}
}
