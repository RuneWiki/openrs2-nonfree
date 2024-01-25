import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!di;")
	public static Class70 aClass70_1;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public static int anInt860;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public static void method672() {
		Static362.method7254();
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static678.aClass360Array5[local15].method8481();
		}
		Static82.method1060();
		Static299.method5787();
		Static610.method8345((byte) -80);
		System.gc();
		Static488.aClass67_12.ya();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
	public static void method674() {
		Static238.aClass20Array3 = null;
		if (Static178.aBoolean264 && Static502.method7210() != 1) {
			Static206.method9437(Static178.anInt3225 == 3 || Static178.anInt3225 == 7, Static456.method6764(), Static539.method8113(), 0, 0);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		if (Static178.aBoolean264) {
			local44 = Static448.method6652();
			local46 = Static143.method2382();
		}
		Static292.method4411(local46, local44 + Static575.anInt9435, Static633.anInt3426, local46, local44, local46 + Static272.anInt5005, -1, local44);
		if (Static238.aClass20Array3 != null) {
			Static130.method2166(Static178.anInt3227, Static238.aClass20Array3, local44 + Static575.anInt9435, true, Static85.aClass20_5.anInt535, local46 + Static272.anInt5005, -1412584499, Static19.anInt346, local46, local44);
			Static238.aClass20Array3 = null;
		}
	}
}
