import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public static void method7152(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static26.anInt350 - Static509.anInt8529;
		if (local8 >= 100) {
			Static493.anInt8261 = -1;
			Static513.anInt8562 = -1;
			Static660.anInt10605 = 1;
			return;
		}
		@Pc(23) int local23 = (int) Static298.aFloat116;
		if (local23 < Static543.anInt8933 >> 8) {
			local23 = Static543.anInt8933 >> 8;
		}
		if (Static95.aBooleanArray30[4] && local23 < Static223.anIntArray206[4] + 128) {
			local23 = Static223.anIntArray206[4] + 128;
		}
		@Pc(70) int local70 = Static430.anInt57 + (int) Static157.aFloat83 & 0x3FFF;
		Static588.method8083(local23, Static541.anInt8929, arg0, (local23 >> 3) * 3 + 600 << 2, Static40.anInt662, local70, Static441.method6444(Static481.anInt8082, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784) - 200);
		@Pc(114) float local114 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static200.anInt3808 = (int) ((float) (Static200.anInt3808 - Static333.anInt6165) * local114 + (float) Static333.anInt6165);
		Static79.anInt1141 = (int) ((float) (Static79.anInt1141 - Static643.anInt10418) * local114 + (float) Static643.anInt10418);
		Static332.anInt6132 = (int) ((float) Static424.anInt7472 + (float) (Static332.anInt6132 - Static424.anInt7472) * local114);
		Static407.anInt7215 = (int) ((float) (Static407.anInt7215 - Static382.anInt6782) * local114 + (float) Static382.anInt6782);
		@Pc(166) int local166 = Static207.anInt3885 - Static334.anInt6173;
		if (local166 > 8192) {
			local166 -= 16384;
		} else if (local166 < -8192) {
			local166 += 16384;
		}
		Static207.anInt3885 = (int) (local114 * (float) local166 + (float) Static334.anInt6173);
		Static207.anInt3885 &= 0x3FFF;
	}
}
