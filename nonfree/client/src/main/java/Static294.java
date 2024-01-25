import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Lclient!og;")
	public static Class247 aClass247_3;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3996;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_68 = new Class173(56, -1);

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method3564() {
		for (@Pc(10) Class4_Sub5_Sub15 local10 = (Class4_Sub5_Sub15) Static212.aClass244_30.method5963(); local10 != null; local10 = (Class4_Sub5_Sub15) Static212.aClass244_30.method5965()) {
			@Pc(17) Class1_Sub4_Sub2_Sub2 local17 = local10.aClass1_Sub4_Sub2_Sub2_1;
			if (Static106.anInt2418 > local17.anInt5547) {
				local10.method8379();
				local17.method4713();
			} else if (Static106.anInt2418 >= local17.anInt5564) {
				if (local17.anInt5557 > 0) {
					@Pc(54) Class4_Sub4 local54 = (Class4_Sub4) Static585.aClass350_41.method8207((long) (local17.anInt5557 - 1));
					if (local54 != null) {
						@Pc(59) Class1_Sub4_Sub2_Sub1_Sub1 local59 = local54.aClass1_Sub4_Sub2_Sub1_Sub1_1;
						if (local59.anInt9934 >= 0 && Static428.anInt8046 * 512 > local59.anInt9934 && local59.anInt9935 >= 0 && local59.anInt9935 < Static119.anInt2717 * 512) {
							local17.method4719(local59.anInt9935, local59.anInt9934, Static501.method5641(local59.anInt9934, local17.aByte126, local59.anInt9935) - local17.anInt5551, Static106.anInt2418);
						}
					}
				}
				if (local17.anInt5557 < 0) {
					@Pc(113) int local113 = -local17.anInt5557 - 1;
					@Pc(124) Class1_Sub4_Sub2_Sub1_Sub2 local124;
					if (local113 == Static411.anInt7797) {
						local124 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1;
					} else {
						local124 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local113];
					}
					if (local124 != null && local124.anInt9934 >= 0 && local124.anInt9934 < Static428.anInt8046 * 512 && local124.anInt9935 >= 0 && Static119.anInt2717 * 512 > local124.anInt9935) {
						local17.method4719(local124.anInt9935, local124.anInt9934, Static501.method5641(local124.anInt9934, local17.aByte126, local124.anInt9935) - local17.anInt5551, Static106.anInt2418);
					}
				}
				local17.method4714(Static356.anInt6930);
				Static101.method2202(local17, true);
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lclient!ff;")
	public static Class4_Sub17 method3567() {
		if (Static455.aClass244_24 == null || Static39.aClass89_1 == null) {
			return null;
		}
		Static39.aClass89_1.method2482(Static455.aClass244_24);
		@Pc(18) Class4_Sub17 local18 = (Class4_Sub17) Static39.aClass89_1.method2483();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class338 local36 = Static455.aClass142_2.method3366(local18.anInt2866);
			return local36 != null && local36.aBoolean685 && local36.method7973(Static455.anInterface21_2) ? local18 : Static121.method2545();
		}
	}
}
