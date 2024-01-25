import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "Lclient!oh;")
	public static Class237 aClass237_86;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
	public static int anInt6509;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public static int anInt6510;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Lclient!aha;")
	public static Class15_Sub1_Sub1 method5346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class15_Sub1_Sub1 local14 = local7.aClass15_Sub1_Sub1_1;
			local7.aClass15_Sub1_Sub1_1 = null;
			Static260.method4580(local14);
			return local14;
		}
	}
}
