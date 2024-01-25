import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public static int anInt6332;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "[Lclient!ek;")
	public static final Class70[] aClass70Array1 = new Class70[2048];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!qf;IZZ)V")
	public static void method5106(@OriginalArg(0) Class1_Sub37 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) int local13 = arg0.anInt5481;
		@Pc(17) int local17 = (int) arg0.aLong236;
		arg0.method5953();
		if (arg1) {
			Static364.method4777(local13);
		}
		Static12.method212(local13);
		@Pc(32) Class107 local32 = Static55.method754(local17);
		if (local32 != null) {
			Static260.method3633(local32);
		}
		Static458.method5894();
		if (!arg2 && Static118.anInt1785 != -1) {
			Static302.method4042(Static118.anInt1785, 1);
		}
		@Pc(54) Class200 local54 = new Class200(Static462.aClass208_42);
		for (@Pc(59) Class1_Sub37 local59 = (Class1_Sub37) local54.method4225(); local59 != null; local59 = (Class1_Sub37) local54.method4223()) {
			if (!local59.method5956()) {
				local59 = (Class1_Sub37) local54.method4225();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt5479 == 3) {
				@Pc(83) int local83 = (int) local59.aLong236;
				if (local13 == local83 >>> 16) {
					method5106(local59, true, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method5107() {
		Static111.aClass77_18.method1395();
	}
}
