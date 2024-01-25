import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!da;")
	public static Class73 aClass73_14;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject24;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	public static int anInt9831 = 0;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIZ)V")
	public static void method8196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = Static562.anInt9143;
		@Pc(11) int local11 = Static173.anInt3410;
		if (Static66.aBoolean570) {
			local9 += Static106.method2037();
			local11 += Static660.method8815();
		}
		@Pc(32) Class50 local32;
		if (Static645.anInt10469 == 1) {
			local32 = Static305.aClass50Array5[Static177.anInt3435 / 100];
			local32.method5996(local9 - 8, local11 + -8);
			Static520.method7366(local9 - 8, local32.method6010() + -8 + local11, local11 - 8, local32.method6003() + (local9 - 8));
		}
		if (Static645.anInt10469 == 2) {
			local32 = Static305.aClass50Array5[Static177.anInt3435 / 100 + 4];
			local32.method5996(local9 - 8, local11 + -8);
			Static520.method7366(local9 - 8, local11 + -8 - -local32.method6010(), local11 - 8, local9 - (-local32.method6003() + 8));
		}
		Static134.method1803();
	}
}
