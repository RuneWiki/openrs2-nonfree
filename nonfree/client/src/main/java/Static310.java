import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lp", name = "Z", descriptor = "I")
	public static int anInt5292;

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_106 = new Class56(79, 12);

	@OriginalMember(owner = "client!lp", name = "S", descriptor = "[I")
	public static final int[] anIntArray294 = new int[32];

	@OriginalMember(owner = "client!lp", name = "Y", descriptor = "[[I")
	public static final int[][] anIntArrayArray120 = new int[6][];

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	public static void method4549() {
		if (Static118.anInt2718 < 0) {
			return;
		}
		@Pc(12) long local12 = Static158.method2936();
		Static118.anInt2718 = (int) ((long) Static118.anInt2718 + Static11.aLong10 - local12);
		if (Static118.anInt2718 > 0) {
			@Pc(28) int local28 = (Static118.anInt2718 << 8) / Static594.anInt9732;
			@Pc(33) int local33 = 255 - local28;
			@Pc(38) float local38 = (float) local28 / 255.0F;
			Static221.anInt3922 = (local28 * (Static57.anInt1190 & 0xFF00FF) + local33 * (Static176.aClass344_1.anInt8738 & 0xFF00FF) & 0xFF00FF00) + ((Static57.anInt1190 & 0xFF00) * local28 + ((Static176.aClass344_1.anInt8738 & 0xFF00) * local33) & 0xFF0000) >>> 8;
			@Pc(75) float local75 = 1.0F - local38;
			Static156.aFloat88 = Static413.aFloat141 + local75 * (Static176.aClass344_1.aFloat174 - Static413.aFloat141);
			Static596.anInt9772 = (local28 * (Static183.anInt3514 & 0xFF00FF) + local33 * (Static176.aClass344_1.anInt8745 & 0xFF00FF) & 0xFF00FF00) + (local28 * (Static183.anInt3514 & 0xFF00) + (Static176.aClass344_1.anInt8745 & 0xFF00) * local33 & 0xFF0000) >>> 8;
			Static465.aFloat149 = Static385.aFloat140 + local75 * (Static176.aClass344_1.aFloat175 - Static385.aFloat140);
			Static196.anInt9123 = Static65.anInt1507 * local28 + Static176.aClass344_1.anInt8744 * local33 >> 8;
			Static462.aFloat146 = local75 * (Static176.aClass344_1.aFloat178 - Static195.aFloat91) + Static195.aFloat91;
			Static503.aFloat153 = Static529.aFloat156 + local75 * (Static176.aClass344_1.aFloat176 - Static529.aFloat156);
			Static352.aFloat139 = local75 * (Static176.aClass344_1.aFloat177 - Static277.aFloat102) + Static277.aFloat102;
			Static480.aFloat151 = (Static176.aClass344_1.aFloat173 - Static112.aFloat47) * local75 + Static112.aFloat47;
			if (Static18.aClass12_1 != Static176.aClass344_1.aClass12_3) {
				Static193.aClass12_2 = Static288.aClass45_9.method7381(Static18.aClass12_1, Static176.aClass344_1.aClass12_3, local75, Static193.aClass12_2);
			}
		} else {
			Static118.anInt2718 = -1;
			Static196.anInt9123 = Static176.aClass344_1.anInt8744;
			Static193.aClass12_2 = Static176.aClass344_1.aClass12_3;
			Static462.aFloat146 = Static176.aClass344_1.aFloat178;
			Static221.anInt3922 = Static176.aClass344_1.anInt8738;
			Static596.anInt9772 = Static176.aClass344_1.anInt8745;
			Static156.aFloat88 = Static176.aClass344_1.aFloat174;
			Static465.aFloat149 = Static176.aClass344_1.aFloat175;
			Static352.aFloat139 = Static176.aClass344_1.aFloat177;
			Static480.aFloat151 = Static176.aClass344_1.aFloat173;
			Static503.aFloat153 = Static176.aClass344_1.aFloat176;
		}
		Static11.aLong10 = local12;
	}
}
