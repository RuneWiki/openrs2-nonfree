import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ro", name = "U", descriptor = "I")
	public static int anInt6562;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "Lclient!vh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ro", name = "L", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_91 = new Class177(82, 3);

	@OriginalMember(owner = "client!ro", name = "Q", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "I")
	public static int anInt6563 = 0;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	public static void method5015(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static187.anInt3975 - Static233.anInt4621;
		if (local7 >= 100) {
			Static21.anInt6762 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static26.aFloat5;
		if (Static3.anInt49 >> 8 > local18) {
			local18 = Static3.anInt49 >> 8;
		}
		if (Static194.aBooleanArray16[4] && Static23.anIntArray41[4] + 128 > local18) {
			local18 = Static23.anIntArray41[4] + 128;
		}
		@Pc(55) int local55 = Static167.anInt5709 + (int) Static267.aFloat83 & 0x3FFF;
		Static166.method2706(Static162.anInt3418, Static323.anInt5976, arg0, Static227.method3475(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488, Static426.anInt1486) - 50, local18, (local18 >> 3) * 3 + 600 << 0, local55);
		@Pc(99) float local99 = 1.0F - (float) ((100 - local7) * (100 - local7) * (100 - local7)) / 1000000.0F;
		Static378.anInt6885 = (int) ((float) Static134.anInt2984 + local99 * (float) (Static378.anInt6885 - Static134.anInt2984));
		Static78.anInt1973 = (int) ((float) Static365.anInt6680 + (float) (Static78.anInt1973 - Static365.anInt6680) * local99);
		Static107.anInt2426 = (int) (local99 * (float) (Static107.anInt2426 - Static454.anInt7931) + (float) Static454.anInt7931);
		Static217.anInt4351 = (int) ((float) Static324.anInt7225 + local99 * (float) (Static217.anInt4351 - Static324.anInt7225));
		@Pc(152) int local152 = Static147.anInt3170 - Static162.anInt3424;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static147.anInt3170 = (int) ((float) Static162.anInt3424 + local99 * (float) local152);
		Static147.anInt3170 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ec;B)V")
	public static void method5017(@OriginalArg(0) Class68 arg0) {
		if (arg0.anInt2153 == 5 && arg0.anInt2136 != -1) {
			Static162.method2667(Static30.aClass106_3, arg0);
		}
	}
}
