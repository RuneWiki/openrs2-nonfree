import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "[Lclient!eh;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	public static void method4403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static30.aClass189ArrayArrayArray2[0][arg1][arg2] != null && Static30.aClass189ArrayArrayArray2[0][arg1][arg2].aClass189_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static30.aClass189ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class189 local46 = Static30.aClass189ArrayArrayArray2[local22][arg1][arg2] = new Class189(local22, arg1, arg2);
				if (local20) {
					local46.aByte58++;
				}
			}
		}
	}
}
