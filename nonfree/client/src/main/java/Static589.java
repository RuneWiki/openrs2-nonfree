import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method8334(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub52 local15 = (Class2_Sub52) Static560.aClass323_36.method7484((long) arg0);
		if (local15 != null) {
			@Pc(22) Class2_Sub20_Sub2 local22 = local15.aClass161_Sub1_1.method3854();
			if (local22 != null) {
				@Pc(29) double local29 = local15.aClass161_Sub1_1.method3857();
				if (local29 >= (double) local22.method4649() && local29 <= (double) local22.method4651()) {
					return local22.method4653();
				}
			}
		}
		return null;
	}
}
