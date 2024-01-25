import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "Lclient!fda;")
	public static final Class93 aClass93_9 = new Class93(1);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BZZLclient!lc;)V")
	public static void method6029(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub28 arg2) {
		@Pc(8) int local8 = arg2.anInt5333;
		@Pc(12) int local12 = (int) arg2.aLong273;
		arg2.method7812();
		if (arg1) {
			Static569.method7560(local8);
		}
		Static545.method7265(local8);
		@Pc(37) Class203 local37 = Static414.method5954(local12);
		if (local37 != null) {
			Static138.method2656(local37);
		}
		Static67.method1532();
		if (!arg0 && Static307.anInt5578 != -1) {
			Static107.method5739(Static307.anInt5578, 1);
		}
		@Pc(61) Class262 local61 = new Class262(Static227.aClass310_15);
		for (@Pc(66) Class3_Sub28 local66 = (Class3_Sub28) local61.method5904(); local66 != null; local66 = (Class3_Sub28) local61.method5905()) {
			if (!local66.method7813()) {
				local66 = (Class3_Sub28) local61.method5904();
				if (local66 == null) {
					return;
				}
			}
			if (local66.anInt5330 == 3) {
				@Pc(88) int local88 = (int) local66.aLong273;
				if (local8 == local88 >>> 16) {
					method6029(arg0, true, local66);
				}
			}
		}
	}
}
