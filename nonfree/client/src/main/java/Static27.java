import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	public static void method362() {
		for (@Pc(10) Class2_Sub2_Sub19 local10 = (Class2_Sub2_Sub19) Static131.aClass70_5.method1264(); local10 != null; local10 = (Class2_Sub2_Sub19) Static131.aClass70_5.method1261()) {
			@Pc(20) Class12_Sub2_Sub1_Sub1 local20 = local10.aClass12_Sub2_Sub1_Sub1_1;
			if (Static532.anInt8757 > local20.anInt1050) {
				local10.method7657();
				local20.method1009();
			} else if (Static532.anInt8757 >= local20.anInt1061) {
				if (local20.anInt1058 > 0) {
					@Pc(41) Class2_Sub5 local41 = (Class2_Sub5) Static436.aClass90_26.method1685((long) (local20.anInt1058 - 1));
					if (local41 != null) {
						@Pc(46) Class12_Sub2_Sub1_Sub4_Sub2 local46 = local41.aClass12_Sub2_Sub1_Sub4_Sub2_1;
						if (local46.anInt9374 >= 0 && Static281.anInt4822 * 512 > local46.anInt9374 && local46.anInt9375 >= 0 && Static29.anInt491 * 512 > local46.anInt9375) {
							local20.method1010(Static24.method347(local46.anInt9375, local46.anInt9374, local20.aByte128) - local20.anInt1030, Static532.anInt8757, local46.anInt9374, local46.anInt9375);
						}
					}
				}
				if (local20.anInt1058 < 0) {
					@Pc(96) int local96 = -local20.anInt1058 - 1;
					@Pc(101) Class12_Sub2_Sub1_Sub4_Sub1 local101;
					if (local96 == Static18.anInt4109) {
						local101 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30;
					} else {
						local101 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local96];
					}
					if (local101 != null && local101.anInt9374 >= 0 && local101.anInt9374 < Static281.anInt4822 * 512 && local101.anInt9375 >= 0 && Static29.anInt491 * 512 > local101.anInt9375) {
						local20.method1010(Static24.method347(local101.anInt9375, local101.anInt9374, local20.aByte128) - local20.anInt1030, Static532.anInt8757, local101.anInt9374, local101.anInt9375);
					}
				}
				local20.method1011(Static534.anInt8792);
				Static526.method7745(local20, true);
			}
		}
	}
}
