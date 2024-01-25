import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public static int anInt7928;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!lb;")
	public static Class221 aClass221_121;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_138 = new Class186(128, 5);

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method6668() {
		if (Static101.anInt1604 < 0) {
			return;
		}
		@Pc(6) long local6 = Static626.method8479();
		Static101.anInt1604 = (int) ((long) Static101.anInt1604 + Static224.aLong143 - local6);
		if (Static101.anInt1604 <= 0) {
			Static643.aFloat194 = Static67.aClass28_2.aFloat8;
			Static629.aFloat191 = Static67.aClass28_2.aFloat13;
			Static311.aFloat92 = Static67.aClass28_2.aFloat11;
			Static104.aFloat19 = Static67.aClass28_2.aFloat12;
			Static234.anInt4454 = Static67.aClass28_2.anInt809;
			Static77.aClass77_4 = Static67.aClass28_2.aClass77_2;
			Static227.aFloat86 = Static67.aClass28_2.aFloat10;
			Static312.anInt5545 = Static67.aClass28_2.anInt806;
			Static143.aFloat55 = Static67.aClass28_2.aFloat9;
			Static636.anInt10300 = Static67.aClass28_2.anInt818;
			if (Static492.aClass275_4 != null) {
				Static492.aClass275_4.method6907();
			}
			Static492.aClass275_4 = Static67.aClass28_2.aClass275_1;
			Static101.anInt1604 = -1;
		} else {
			@Pc(69) int local69 = (Static101.anInt1604 << 8) / Static483.anInt8395;
			@Pc(74) int local74 = 255 - local69;
			@Pc(79) float local79 = (float) local69 / 255.0F;
			@Pc(83) float local83 = 1.0F - local79;
			Static234.anInt4454 = (local69 * (Static274.anInt5026 & 0xFF00) + (Static67.aClass28_2.anInt809 & 0xFF00) * local74 & 0xFF0000) + (local69 * (Static274.anInt5026 & 0xFF00FF) + (local74 * (Static67.aClass28_2.anInt809 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static227.aFloat86 = (Static67.aClass28_2.aFloat10 - Static39.aFloat7) * local83 + Static39.aFloat7;
			Static104.aFloat19 = Static525.aFloat163 + local83 * (Static67.aClass28_2.aFloat12 - Static525.aFloat163);
			Static643.aFloat194 = (Static67.aClass28_2.aFloat8 - Static19.aFloat3) * local83 + Static19.aFloat3;
			Static312.anInt5545 = local69 * Static187.anInt3300 + local74 * Static67.aClass28_2.anInt806 >> 8;
			Static636.anInt10300 = (local74 * (Static67.aClass28_2.anInt818 & 0xFF00) + (Static552.anInt9234 & 0xFF00) * local69 & 0xFF0000) + ((Static67.aClass28_2.anInt818 & 0xFF00FF) * local74 + (Static552.anInt9234 & 0xFF00FF) * local69 & 0xFF00FF00) >>> 8;
			Static143.aFloat55 = Static599.aFloat183 + (Static67.aClass28_2.aFloat9 - Static599.aFloat183) * local83;
			Static311.aFloat92 = (Static67.aClass28_2.aFloat11 - Static568.aFloat199) * local83 + Static568.aFloat199;
			Static629.aFloat191 = Static679.aFloat198 + local83 * (Static67.aClass28_2.aFloat13 - Static679.aFloat198);
			if (Static67.aClass28_2.aClass77_2 != Static35.aClass77_1) {
				Static77.aClass77_4 = Static510.aClass67_17.method7662(Static35.aClass77_1, Static67.aClass28_2.aClass77_2, local83, Static77.aClass77_4);
			}
			if (Static67.aClass28_2.aClass275_1 != Static626.aClass275_5) {
				if (Static626.aClass275_5 == null) {
					Static492.aClass275_4 = Static67.aClass28_2.aClass275_1;
					if (Static492.aClass275_4 != null) {
						Static492.aClass275_4.method6911(local74, 0);
					}
				} else {
					Static492.aClass275_4 = Static626.aClass275_5;
					if (Static492.aClass275_4 != null) {
						Static492.aClass275_4.method6911(local74, 255);
					}
				}
			}
		}
		Static224.aLong143 = local6;
	}
}
