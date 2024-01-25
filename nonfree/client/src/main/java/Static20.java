import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	public static int anInt955 = -60;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)V")
	public static void method827() {
		Static503.aClass167_55.method3961();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	public static void method828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static571.aClass182ArrayArrayArray3[0][arg1][arg2] != null && Static571.aClass182ArrayArrayArray3[0][arg1][arg2].aClass182_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static571.aClass182ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class182 local44 = Static571.aClass182ArrayArrayArray3[local22][arg1][arg2] = new Class182(local22);
				if (local20) {
					local44.aByte93++;
				}
			}
		}
	}
}
