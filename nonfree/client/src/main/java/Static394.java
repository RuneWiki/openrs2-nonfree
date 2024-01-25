import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static394 {

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
	public static int anInt6578;

	@OriginalMember(owner = "client!tu", name = "L", descriptor = "I")
	public static int anInt6593;

	@OriginalMember(owner = "client!tu", name = "O", descriptor = "Lclient!lq;")
	public static Class139 aClass139_4;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLclient!ku;)V")
	public static void method5157(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.aClass16_Sub1_Sub5_1 = null;
		if (Static389.anInt6526 < 20) {
			Static325.aClass84_7.method2305(arg0);
			Static389.anInt6526++;
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	public static void method5160() {
		if (Static314.anInt5471 < 0) {
			Static314.anInt5471 = 0;
			Static127.anInt2674 = -1;
			Static71.anInt6920 = -1;
		}
		if (Static314.anInt5471 > Static148.anInt5729) {
			Static127.anInt2674 = -1;
			Static71.anInt6920 = -1;
			Static314.anInt5471 = Static148.anInt5729;
		}
		if (Static46.anInt5156 < 0) {
			Static71.anInt6920 = -1;
			Static127.anInt2674 = -1;
			Static46.anInt5156 = 0;
		}
		if (Static46.anInt5156 > Static148.anInt5733) {
			Static127.anInt2674 = -1;
			Static71.anInt6920 = -1;
			Static46.anInt5156 = Static148.anInt5733;
		}
	}
}
