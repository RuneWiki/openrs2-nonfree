import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pd", name = "Eb", descriptor = "Lclient!pu;")
	public static Class270 aClass270_78;

	@OriginalMember(owner = "client!pd", name = "Jb", descriptor = "I")
	public static int anInt7013;

	@OriginalMember(owner = "client!pd", name = "Gb", descriptor = "I")
	public static int anInt7011 = -1;

	@OriginalMember(owner = "client!pd", name = "Hb", descriptor = "[Lclient!vr;")
	public static final Interface22[] anInterface22Array1 = new Interface22[128];

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "(II)V")
	public static void method5569(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static301.anInt5197 - Static147.anInt2734;
		if (local7 >= 100) {
			Static340.anInt5707 = 1;
			Static243.anInt4483 = -1;
			Static442.anInt7679 = -1;
			return;
		}
		@Pc(22) int local22 = (int) Static287.aFloat117;
		if (local22 < Static348.anInt5785 >> 8) {
			local22 = Static348.anInt5785 >> 8;
		}
		if (Static227.aBooleanArray6[4] && local22 < Static513.anIntArray659[4] + 128) {
			local22 = Static513.anIntArray659[4] + 128;
		}
		@Pc(59) int local59 = Static482.anInt8102 + (int) Static167.aFloat59 & 0x3FFF;
		Static39.method545(Static66.method1191(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365, Static433.anInt7592, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370) - 200, arg0, local59, (local22 >> 3) * 3 + 600 << 2, Static301.anInt5198, Static417.anInt7669, local22);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static295.anInt5077 = (int) ((float) Static434.anInt7642 + (float) (Static295.anInt5077 - Static434.anInt7642) * local104);
		Static103.anInt2093 = (int) ((float) Static376.anInt6285 + (float) (Static103.anInt2093 - Static376.anInt6285) * local104);
		Static59.anInt1132 = (int) ((float) Static520.anInt8824 + (float) (Static59.anInt1132 - Static520.anInt8824) * local104);
		Static405.anInt7085 = (int) ((float) (Static405.anInt7085 - Static113.anInt2218) * local104 + (float) Static113.anInt2218);
		@Pc(154) int local154 = Static561.anInt9344 - Static402.anInt7038;
		if (local154 > 8192) {
			local154 -= 16384;
		} else if (local154 < -8192) {
			local154 += 16384;
		}
		Static561.anInt9344 = (int) ((float) Static402.anInt7038 + (float) local154 * local104);
		Static561.anInt9344 &= 0x3FFF;
	}
}
