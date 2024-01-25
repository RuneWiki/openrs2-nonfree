import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "Lclient!pga;")
	public static Class32 aClass32_39;

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "Lclient!on;")
	public static final Class155 aClass155_1 = Static164.method3037();

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(B)V")
	public static void method8443() {
		Static204.aClass166_21.method4802();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
	public static void method8445(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static113.anInt2243 - Static511.anInt8899;
		if (local8 >= 100) {
			Static334.anInt6354 = 1;
			Static624.anInt10280 = -1;
			Static160.anInt3352 = -1;
			return;
		}
		@Pc(23) int local23 = (int) Static591.aFloat197;
		if (Static211.anInt4157 >> 8 > local23) {
			local23 = Static211.anInt4157 >> 8;
		}
		if (Static303.aBooleanArray32[4] && Static113.anIntArray157[4] + 128 > local23) {
			local23 = Static113.anIntArray157[4] + 128;
		}
		@Pc(68) int local68 = Static27.anInt551 + (int) Static284.aFloat164 & 0x3FFF;
		Static539.method7919(local68, local23, Static138.method2248(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725, Static175.anInt3636, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729) - 200, Static96.anInt1900, Static359.anInt6657, arg0, (local23 >> 3) * 3 + 600 << 2);
		@Pc(113) float local113 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static428.anInt7788 = (int) ((float) (Static428.anInt7788 - Static393.anInt7360) * local113 + (float) Static393.anInt7360);
		Static580.anInt9662 = (int) ((float) Static239.anInt4786 + local113 * (float) (Static580.anInt9662 - Static239.anInt4786));
		Static524.anInt9123 = (int) ((float) Static228.anInt4471 + local113 * (float) (Static524.anInt9123 - Static228.anInt4471));
		Static263.anInt5239 = (int) ((float) (Static263.anInt5239 - Static489.anInt8504) * local113 + (float) Static489.anInt8504);
		@Pc(164) int local164 = Static470.anInt8261 - Static563.anInt9556;
		if (local164 > 8192) {
			local164 -= 16384;
		} else if (local164 < -8192) {
			local164 += 16384;
		}
		Static470.anInt8261 = (int) ((float) Static563.anInt9556 + (float) local164 * local113);
		Static470.anInt8261 &= 0x3FFF;
	}
}
