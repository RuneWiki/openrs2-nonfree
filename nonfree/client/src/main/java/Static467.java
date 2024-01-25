import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static467 {

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
	public static int anInt7995 = 0;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_52 = new Class222(4);

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)V")
	public static void method6428() {
		if (Static375.aBoolean492) {
			return;
		}
		Static305.aBoolean423 = true;
		Static375.aBoolean492 = true;
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static167.aFloat59 = (int) Static167.aFloat59 + 191 & 0xFFFFFF80;
		} else {
			Static333.aFloat127 += (24.0F - Static333.aFloat127) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(ZI)V")
	public static void method6429(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static390.anInt6750 = arg0;
		Static341.aClass8_Sub7Array2 = new Class8_Sub7[Static571.anIntArray714[Static390.anInt6750] + 1];
		Static29.anInt423 = 0;
		Static269.anInt4736 = 0;
	}
}
