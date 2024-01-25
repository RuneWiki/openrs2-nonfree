import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!eka", name = "s", descriptor = "Lclient!ef;")
	public static Class97 aClass97_2;

	@OriginalMember(owner = "client!eka", name = "t", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!eka", name = "u", descriptor = "Lclient!uq;")
	public static Class362 aClass362_32;

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)V")
	public static void method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static254.aClass368ArrayArrayArray2[0][arg1][arg2] != null && Static254.aClass368ArrayArrayArray2[0][arg1][arg2].aClass368_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static254.aClass368ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class368 local44 = Static254.aClass368ArrayArrayArray2[local22][arg1][arg2] = new Class368(local22);
				if (local20) {
					local44.aByte143++;
				}
			}
		}
	}
}
