import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!rw", name = "hc", descriptor = "Lclient!tca;")
	public static Class280 aClass280_1;

	@OriginalMember(owner = "client!rw", name = "kb", descriptor = "[I")
	public static final int[] anIntArray712 = new int[1000];

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!pq;Ljava/awt/Frame;B)V")
	public static void method6744(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class311 local6 = arg0.method6063(arg1);
			while (local6.anInt9169 == 0) {
				Static265.method3147(10L);
			}
			if (local6.anInt9169 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static265.method3147(100L);
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(B)V")
	public static void method6758() {
		if (Static167.method3162(Static186.anInt3863) || Static275.method4864(Static186.anInt3863)) {
			Static207.method3825(5000, Static46.anInt1256 >> 10, Static321.anInt6064 >> 10);
		} else {
			@Pc(27) int local27 = Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray780[0] >> 3;
			@Pc(34) int local34 = Static107.aClass20_Sub1_Sub1_Sub1_1.anIntArray781[0] >> 3;
			if (local27 >= 0 && Static237.anInt4563 >> 3 > local27 && local34 >= 0 && Static373.anInt6694 >> 3 > local34) {
				Static207.method3825(5000, local34, local27);
			} else {
				Static207.method3825(0, Static373.anInt6694 >> 4, Static237.anInt4563 >> 4);
			}
		}
		Static522.method7947();
		Static19.method549();
		Static396.method6293();
		Static77.method1769();
	}
}
