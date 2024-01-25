import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "Lclient!iea;")
	public static Class31 aClass31_6;

	@OriginalMember(owner = "client!eba", name = "q", descriptor = "[Lclient!hb;")
	public static Class139[] aClass139Array1;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_46 = new Class145(77, 7);

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_47 = new Class145(82, 4);

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	public static void method2193(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static389.anInt6694 - anInt2587;
		if (local7 >= 100) {
			Static407.anInt6909 = 1;
			Static648.anInt10476 = -1;
			Static644.anInt10415 = -1;
			return;
		}
		@Pc(22) int local22 = (int) Static464.aFloat130;
		if (local22 < Static561.anInt9242 >> 8) {
			local22 = Static561.anInt9242 >> 8;
		}
		if (Static298.aBooleanArray10[4] && Static406.anIntArray460[4] + 128 > local22) {
			local22 = Static406.anIntArray460[4] + 128;
		}
		@Pc(68) int local68 = (int) Static225.aFloat85 + Static66.anInt1804 & 0x3FFF;
		Static11.method143((local22 >> 3) * 3 + 600 << 2, Static392.method5799(Static531.anInt8550, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034) - 200, arg0, local22, Static145.anInt3035, local68, Static553.anInt9177);
		@Pc(114) float local114 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static576.anInt9403 = (int) (local114 * (float) (Static576.anInt9403 - Static69.anInt1870) + (float) Static69.anInt1870);
		Static63.anInt1715 = (int) (local114 * (float) (Static63.anInt1715 - Static92.anInt2248) + (float) Static92.anInt2248);
		Static479.anInt7769 = (int) ((float) (Static479.anInt7769 - Static108.anInt2365) * local114 + (float) Static108.anInt2365);
		Static502.anInt9930 = (int) (local114 * (float) (Static502.anInt9930 - Static399.anInt6860) + (float) Static399.anInt6860);
		@Pc(164) int local164 = Static400.anInt7896 - Static391.anInt6747;
		if (local164 > 8192) {
			local164 -= 16384;
		} else if (local164 < -8192) {
			local164 += 16384;
		}
		Static400.anInt7896 = (int) ((float) Static391.anInt6747 + local114 * (float) local164);
		Static400.anInt7896 &= 0x3FFF;
	}
}
