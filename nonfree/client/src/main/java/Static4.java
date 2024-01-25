import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "[I")
	public static final int[] anIntArray13 = new int[250];

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
	public static int anInt134 = -1;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	public static int anInt135 = 0;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_3 = new Class208(13, -2);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	public static void method60() {
		for (@Pc(18) Class2_Sub15 local18 = (Class2_Sub15) Static35.aClass238_3.method5795(); local18 != null; local18 = (Class2_Sub15) Static35.aClass238_3.method5799()) {
			if (local18.anInt2549 > 0) {
				local18.anInt2549--;
			}
			if (local18.anInt2549 != 0) {
				if (local18.anInt2541 > 0) {
					local18.anInt2541--;
				}
				if (local18.anInt2541 == 0 && local18.anInt2548 >= 1 && local18.anInt2545 >= 1 && Static89.anInt1891 - 2 >= local18.anInt2548 && Static85.anInt1839 - 2 >= local18.anInt2545 && (local18.anInt2536 < 0 || Static215.method3854(local18.anInt2542, local18.anInt2536))) {
					Static290.method4766(local18.anInt2538, local18.anInt2545, local18.anInt2543, local18.anInt2536, local18.anInt2548, local18.anInt2544, local18.anInt2542, -1);
					local18.anInt2541 = -1;
					if (local18.anInt2536 == local18.anInt2540 && local18.anInt2540 == -1) {
						local18.method6130();
					} else if (local18.anInt2540 == local18.anInt2536 && local18.anInt2546 == local18.anInt2538 && local18.anInt2542 == local18.anInt2537) {
						local18.method6130();
					}
				}
			} else if (local18.anInt2540 < 0 || Static215.method3854(local18.anInt2537, local18.anInt2540)) {
				Static290.method4766(local18.anInt2546, local18.anInt2545, local18.anInt2543, local18.anInt2540, local18.anInt2548, local18.anInt2544, local18.anInt2537, -1);
				local18.method6130();
			}
		}
	}
}
