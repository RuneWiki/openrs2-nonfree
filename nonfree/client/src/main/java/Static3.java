import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "I", descriptor = "I")
	public static int anInt50;

	@OriginalMember(owner = "client!aaa", name = "L", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!aaa", name = "N", descriptor = "J")
	public static long aLong5 = 0L;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "(I)V")
	public static void method52() {
		if (Static501.anInt7991 < 0) {
			return;
		}
		@Pc(11) long local11 = Static587.method7753();
		Static501.anInt7991 = (int) ((long) Static501.anInt7991 + Static438.aLong128 - local11);
		if (Static501.anInt7991 > 0) {
			@Pc(31) int local31 = (Static501.anInt7991 << 8) / Static467.anInt7656;
			@Pc(36) int local36 = 255 - local31;
			@Pc(41) float local41 = (float) local31 / 255.0F;
			Static39.anInt951 = ((Static39.aClass217_1.anInt5956 & 0xFF00FF) * local36 + local31 * (Static426.anInt7110 & 0xFF00FF) & 0xFF00FF00) + ((Static426.anInt7110 & 0xFF00) * local31 + ((Static39.aClass217_1.anInt5956 & 0xFF00) * local36) & 0xFF0000) >>> 8;
			@Pc(78) float local78 = 1.0F - local41;
			Static348.aFloat126 = Static129.aFloat44 + local78 * (Static39.aClass217_1.aFloat119 - Static129.aFloat44);
			Static84.aFloat33 = Static155.aFloat49 + local78 * (Static39.aClass217_1.aFloat121 - Static155.aFloat49);
			Static278.anInt5099 = (local36 * (Static39.aClass217_1.anInt5958 & 0xFF00) + local31 * (Static592.anInt9398 & 0xFF00) & 0xFF0000) + (local36 * (Static39.aClass217_1.anInt5958 & 0xFF00FF) + local31 * (Static592.anInt9398 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static503.aFloat176 = Static204.aFloat84 + (Static39.aClass217_1.aFloat123 - Static204.aFloat84) * local78;
			Static589.aFloat224 = (Static39.aClass217_1.aFloat124 - Static13.aFloat128) * local78 + Static13.aFloat128;
			Static474.aFloat157 = Static379.aFloat144 + (Static39.aClass217_1.aFloat122 - Static379.aFloat144) * local78;
			Static143.aFloat182 = Static555.aFloat221 + (Static39.aClass217_1.aFloat120 - Static555.aFloat221) * local78;
			Static57.anInt1376 = Static534.anInt8388 * local31 + Static39.aClass217_1.anInt5957 * local36 >> 8;
			if (Static448.aClass55_4 != Static39.aClass217_1.aClass55_2) {
				Static447.aClass55_3 = Static131.aClass43_5.method7167(Static448.aClass55_4, Static39.aClass217_1.aClass55_2, local78, Static447.aClass55_3);
			}
		} else {
			Static474.aFloat157 = Static39.aClass217_1.aFloat122;
			Static278.anInt5099 = Static39.aClass217_1.anInt5958;
			Static39.anInt951 = Static39.aClass217_1.anInt5956;
			Static143.aFloat182 = Static39.aClass217_1.aFloat120;
			Static501.anInt7991 = -1;
			Static447.aClass55_3 = Static39.aClass217_1.aClass55_2;
			Static84.aFloat33 = Static39.aClass217_1.aFloat121;
			Static348.aFloat126 = Static39.aClass217_1.aFloat119;
			Static503.aFloat176 = Static39.aClass217_1.aFloat123;
			Static57.anInt1376 = Static39.aClass217_1.anInt5957;
			Static589.aFloat224 = Static39.aClass217_1.aFloat124;
		}
		Static438.aLong128 = local11;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method53(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static476.aClass241Array35[Static333.anInt5940++] = new Class241(4, arg4, arg0, arg6, arg6, arg0, arg1, arg3, arg3, arg1, arg5, arg5, arg2, arg2);
	}
}
