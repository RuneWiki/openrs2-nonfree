import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!o;")
	public static final Class246 aClass246_19 = new Class246(9, 0, 4, 1);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	public static void method3614() {
		for (@Pc(1) int local1 = 0; local1 < Static25.anInt3151; local1++) {
			@Pc(6) Class2_Sub1_Sub1 local6 = Static493.aClass2_Sub1_Sub1Array1[local1];
			Static475.method6972(local6, true);
			Static493.aClass2_Sub1_Sub1Array1[local1] = null;
		}
		Static25.anInt3151 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public static void method3615() {
		if (Static367.anInt6283 == -1 || Static505.anInt8478 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static282.anInt4837 - Static291.anInt4914) * Static616.anInt10073 >> 16) + Static291.anInt4914;
		Static616.anInt10073 += local23;
		if (Static616.anInt10073 >= 65535) {
			Static616.anInt10073 = 65535;
			if (Static422.aBoolean487) {
				Static54.aBoolean56 = false;
			} else {
				Static54.aBoolean56 = true;
			}
			Static422.aBoolean487 = true;
		} else {
			Static54.aBoolean56 = false;
			Static422.aBoolean487 = false;
		}
		@Pc(53) float local53 = (float) Static616.anInt10073 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static558.anInt9348 * 2;
		@Pc(86) int local86;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static150.anIntArrayArrayArray15[Static367.anInt6283][local60][local62] * 3;
			local86 = Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 1][local62] * 3;
			local119 = (Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 2][local62] + Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 2][local62] - Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 3][local62]) * 3;
			local127 = Static150.anIntArrayArrayArray15[Static367.anInt6283][local60][local62];
			local132 = local86 - local74;
			local141 = local74 + local119 - local86 * 2;
			local159 = Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 2][local62] + local86 - local119 - local127;
			local56[local62] = ((float) local132 + ((float) local141 + local53 * (float) local159) * local53) * local53 + (float) local127;
		}
		Static170.anInt2855 = (int) local56[1] * -1;
		Static542.anInt9140 = (int) local56[2] - Static234.anInt4239 * 512;
		Static23.anInt564 = (int) local56[0] - Static534.anInt8753 * 512;
		@Pc(213) float[] local213 = new float[3];
		local86 = Static78.anInt1494 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static150.anIntArrayArrayArray15[Static505.anInt8478][local86][local119] * 3;
			local132 = Static150.anIntArrayArrayArray15[Static505.anInt8478][local86 + 1][local119] * 3;
			local141 = (Static150.anIntArrayArrayArray15[Static505.anInt8478][local86 + 2][local119] + Static150.anIntArrayArrayArray15[Static505.anInt8478][local86 + 2][local119] - Static150.anIntArrayArrayArray15[Static505.anInt8478][local86 + 3][local119]) * 3;
			local159 = Static150.anIntArrayArrayArray15[Static505.anInt8478][local86][local119];
			@Pc(289) int local289 = local132 - local127;
			@Pc(298) int local298 = local127 + local141 - local132 * 2;
			@Pc(315) int local315 = Static150.anIntArrayArrayArray15[Static505.anInt8478][local86 + 2][local119] + local132 - local159 - local141;
			local213[local119] = local53 * ((local53 * (float) local315 + (float) local298) * local53 + (float) local289) + (float) local159;
		}
		@Pc(347) float local347 = local213[0] - local56[0];
		@Pc(362) float local362 = -1.0F * (local213[1] - local56[1]);
		@Pc(371) float local371 = local213[2] - local56[2];
		@Pc(381) double local381 = Math.sqrt((double) (local371 * local371 + local347 * local347));
		Static598.anInt9788 = (int) (Math.atan2((double) local362, local381) * 2607.5945876176133D) & 0x3FFF;
		Static672.anInt10375 = (int) (-Math.atan2((double) local347, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static536.anInt8770 = Static150.anIntArrayArrayArray15[Static367.anInt6283][local60][3] + (Static616.anInt10073 * (Static150.anIntArrayArrayArray15[Static367.anInt6283][local60 + 2][3] - Static150.anIntArrayArrayArray15[Static367.anInt6283][local60][3]) >> 16);
	}
}
