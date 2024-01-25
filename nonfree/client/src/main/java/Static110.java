import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "Lclient!kha;")
	public static Class181 aClass181_22;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "Z")
	public static boolean aBoolean234 = true;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_28 = new Class218(74, -2);

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
	public static void method2709() {
		if (Static115.anInt9243 < 0) {
			return;
		}
		@Pc(8) long local8 = Static444.method6719();
		Static115.anInt9243 = (int) ((long) Static115.anInt9243 + Static592.aLong256 - local8);
		if (Static115.anInt9243 > 0) {
			@Pc(25) int local25 = (Static115.anInt9243 << 8) / Static322.anInt6495;
			@Pc(30) int local30 = 255 - local25;
			@Pc(35) float local35 = (float) local25 / 255.0F;
			Static565.anInt9605 = ((Static11.aClass260_1.anInt7870 & 0xFF00FF) * local30 + (Static577.anInt7611 & 0xFF00FF) * local25 & 0xFF00FF00) + (local25 * (Static577.anInt7611 & 0xFF00) + (local30 * (Static11.aClass260_1.anInt7870 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(73) float local73 = 1.0F - local35;
			Static260.anInt5718 = (local25 * (Static43.anInt768 & 0xFF00) + (Static11.aClass260_1.anInt7866 & 0xFF00) * local30 & 0xFF0000) + ((Static11.aClass260_1.anInt7866 & 0xFF00FF) * local30 + (Static43.anInt768 & 0xFF00FF) * local25 & 0xFF00FF00) >>> 8;
			Static42.aFloat16 = Static245.aFloat159 + local73 * (Static11.aClass260_1.aFloat215 - Static245.aFloat159);
			Static572.aFloat266 = local73 * (Static11.aClass260_1.aFloat216 - Static527.aFloat233) + Static527.aFloat233;
			Static136.aFloat125 = Static585.aFloat278 + local73 * (Static11.aClass260_1.aFloat212 - Static585.aFloat278);
			Static609.aFloat275 = Static519.aFloat232 + (Static11.aClass260_1.aFloat211 - Static519.aFloat232) * local73;
			Static501.anInt9728 = local30 * Static11.aClass260_1.anInt7869 + local25 * Static250.anInt5551 >> 8;
			Static117.aFloat99 = local73 * (Static11.aClass260_1.aFloat214 - Static97.aFloat93) + Static97.aFloat93;
			Static216.aFloat151 = (Static11.aClass260_1.aFloat213 - Static90.aFloat91) * local73 + Static90.aFloat91;
			if (Static11.aClass260_1.aClass4_10 != Static52.aClass4_3) {
				Static459.aClass4_11 = Static174.aClass33_7.method6222(Static52.aClass4_3, Static11.aClass260_1.aClass4_10, local73, Static459.aClass4_11);
			}
		} else {
			Static115.anInt9243 = -1;
			Static260.anInt5718 = Static11.aClass260_1.anInt7866;
			Static42.aFloat16 = Static11.aClass260_1.aFloat215;
			Static572.aFloat266 = Static11.aClass260_1.aFloat216;
			Static459.aClass4_11 = Static11.aClass260_1.aClass4_10;
			Static501.anInt9728 = Static11.aClass260_1.anInt7869;
			Static136.aFloat125 = Static11.aClass260_1.aFloat212;
			Static609.aFloat275 = Static11.aClass260_1.aFloat211;
			Static117.aFloat99 = Static11.aClass260_1.aFloat214;
			Static565.anInt9605 = Static11.aClass260_1.anInt7870;
			Static216.aFloat151 = Static11.aClass260_1.aFloat213;
		}
		Static592.aLong256 = local8;
	}
}
