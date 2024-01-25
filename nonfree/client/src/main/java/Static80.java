import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cja", name = "c", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_15 = new Class305(8, 3);

	@OriginalMember(owner = "client!cja", name = "e", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_4 = new Class340(4);

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lclient!iea;I)I")
	public static int method1040(@OriginalArg(0) Class162 arg0) {
		if (Static448.aClass162_5 == arg0) {
			return 9216;
		} else if (arg0 == Static287.aClass162_3) {
			return 34065;
		} else if (arg0 == Static122.aClass162_6) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
	public static void method1041() {
		if (Static438.anInt7717 == -1 || Static542.anInt6469 == -1) {
			return;
		}
		@Pc(23) int local23 = Static311.anInt5914 + ((Static376.anInt10480 - Static311.anInt5914) * Static311.anInt5916 >> 16);
		Static311.anInt5916 += local23;
		if (Static311.anInt5916 >= 65535) {
			Static311.anInt5916 = 65535;
			if (Static514.aBoolean732) {
				Static431.aBoolean647 = false;
			} else {
				Static431.aBoolean647 = true;
			}
			Static514.aBoolean732 = true;
		} else {
			Static431.aBoolean647 = false;
			Static514.aBoolean732 = false;
		}
		@Pc(51) float local51 = (float) Static311.anInt5916 / 65535.0F;
		@Pc(54) float[] local54 = new float[3];
		@Pc(58) int local58 = Static249.anInt4559 * 2;
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(124) int local124;
		@Pc(129) int local129;
		@Pc(139) int local139;
		@Pc(157) int local157;
		for (@Pc(60) int local60 = 0; local60 < 3; local60++) {
			@Pc(71) int local71 = Static305.anIntArrayArrayArray24[Static438.anInt7717][local58][local60] * 3;
			local83 = Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 1][local60] * 3;
			local116 = (Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 2][local60] + Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 2][local60] - Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 3][local60]) * 3;
			local124 = Static305.anIntArrayArrayArray24[Static438.anInt7717][local58][local60];
			local129 = local83 - local71;
			local139 = local71 + local116 - local83 * 2;
			local157 = local83 + Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 2][local60] - local116 - local124;
			local54[local60] = (((float) local139 + local51 * (float) local157) * local51 + (float) local129) * local51 + (float) local124;
		}
		Static407.anInt7215 = (int) local54[2] - Static201.anInt3839 * 512;
		Static200.anInt3808 = (int) local54[1] * -1;
		Static332.anInt6132 = (int) local54[0] - Static153.anInt3147 * 512;
		@Pc(211) float[] local211 = new float[3];
		local83 = Static403.anInt7771 * 2;
		for (local116 = 0; local116 < 3; local116++) {
			local124 = Static305.anIntArrayArrayArray24[Static542.anInt6469][local83][local116] * 3;
			local129 = Static305.anIntArrayArrayArray24[Static542.anInt6469][local83 + 1][local116] * 3;
			local139 = (Static305.anIntArrayArrayArray24[Static542.anInt6469][local83 + 2][local116] + Static305.anIntArrayArrayArray24[Static542.anInt6469][local83 + 2][local116] - Static305.anIntArrayArrayArray24[Static542.anInt6469][local83 - -3][local116]) * 3;
			local157 = Static305.anIntArrayArrayArray24[Static542.anInt6469][local83][local116];
			@Pc(286) int local286 = local129 - local124;
			@Pc(296) int local296 = local124 + local139 - local129 * 2;
			@Pc(315) int local315 = Static305.anIntArrayArrayArray24[Static542.anInt6469][local83 + 2][local116] + local129 - local157 - local139;
			local211[local116] = local51 * ((local51 * (float) local315 + (float) local296) * local51 + (float) local286) + (float) local157;
		}
		@Pc(349) float local349 = local211[0] - local54[0];
		@Pc(360) float local360 = (local211[1] - local54[1]) * -1.0F;
		@Pc(369) float local369 = local211[2] - local54[2];
		@Pc(379) double local379 = Math.sqrt((double) (local369 * local369 + local349 * local349));
		Static79.anInt1141 = (int) (Math.atan2((double) local360, local379) * 2607.5945876176133D) & 0x3FFF;
		Static207.anInt3885 = (int) (-Math.atan2((double) local349, (double) local369) * 2607.5945876176133D) & 0x3FFF;
		Static388.anInt6926 = ((Static305.anIntArrayArrayArray24[Static438.anInt7717][local58 + 2][3] - Static305.anIntArrayArrayArray24[Static438.anInt7717][local58][3]) * Static311.anInt5916 >> 16) + Static305.anIntArrayArrayArray24[Static438.anInt7717][local58][3];
	}
}
