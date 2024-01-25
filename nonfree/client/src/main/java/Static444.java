import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
	public static int anInt6928 = 0;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!er;I[[B)V")
	public static void method6101(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2544; local12++) {
			Static253.method3677();
			for (@Pc(18) int local18 = 0; local18 < Static224.anInt3557 >> 3; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static267.anInt4309 >> 3; local22++) {
					@Pc(32) int local32 = Static418.anIntArrayArrayArray17[local12][local18][local22];
					if (local32 != -1) {
						@Pc(42) int local42 = local32 >> 24 & 0x3;
						if (!arg0.aBoolean182 || local42 == 0) {
							@Pc(56) int local56 = local32 >> 1 & 0x3;
							@Pc(62) int local62 = local32 >> 14 & 0x3FF;
							@Pc(68) int local68 = local32 >> 3 & 0x7FF;
							@Pc(78) int local78 = local68 / 8 + (local62 / 8 << 8);
							for (@Pc(80) int local80 = 0; local80 < Static472.anIntArray505.length; local80++) {
								if (Static472.anIntArray505[local80] == local78 && arg1[local80] != null) {
									arg0.method2464(arg1[local80], local18 * 8, local12, (local68 & 0x7) * 8, (local62 & 0x7) * 8, Static263.aClass389Array1, local22 * 8, Static582.aClass33_13, local56, local42);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z")
	public static boolean method6102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static16.method300(arg1, arg0) | (arg0 & 0x10000) != 0 || Static391.method5053(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static638.method8538(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(FI)F")
	public static float method6103(@OriginalArg(0) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}
}
