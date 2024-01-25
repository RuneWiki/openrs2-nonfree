import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_7 = new Class209("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "[I")
	public static final int[] anIntArray17 = new int[32];

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	public static int anInt206 = 0;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public static void method186(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg1, 16);
		local8.method4547();
		local8.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ)V")
	public static void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg1, 7);
		local8.method4547();
		local8.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public static void method188() {
		if (Static103.anInt2414 == -1 || Static385.anInt6454 == -1) {
			return;
		}
		@Pc(30) int local30 = Static316.anInt5473 + (Static150.anInt4217 * (Static288.anInt5173 - Static316.anInt5473) >> 16);
		Static150.anInt4217 += local30;
		if (Static150.anInt4217 < 65535) {
			Static346.aBoolean419 = false;
			Static144.aBoolean234 = false;
		} else {
			Static150.anInt4217 = 65535;
			if (Static346.aBoolean419) {
				Static144.aBoolean234 = false;
			} else {
				Static144.aBoolean234 = true;
			}
			Static346.aBoolean419 = true;
		}
		@Pc(62) float local62 = (float) Static150.anInt4217 / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = Static436.anInt7187 * 2;
		@Pc(95) int local95;
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(141) int local141;
		@Pc(150) int local150;
		@Pc(168) int local168;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(83) int local83 = Static444.anIntArrayArrayArray14[Static103.anInt2414][local69][local71] * 3;
			local95 = Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 1][local71] * 3;
			local128 = (Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 2][local71] + Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 2][local71] - Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 3][local71]) * 3;
			local136 = Static444.anIntArrayArrayArray14[Static103.anInt2414][local69][local71];
			local141 = local95 - local83;
			local150 = local128 + local83 - local95 * 2;
			local168 = Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 2][local71] + local95 - local128 - local136;
			local65[local71] = local62 * ((local62 * (float) local168 + (float) local150) * local62 + (float) local141) + (float) local136;
		}
		Static364.anInt6270 = (int) local65[0] - Static48.anInt962 * 128;
		Static355.anInt6031 = (int) local65[1] * -1;
		Static23.anInt567 = (int) local65[2] - Static324.anInt5624 * 128;
		@Pc(224) float[] local224 = new float[3];
		local95 = Static397.anInt6603 * 2;
		for (local128 = 0; local128 < 3; local128++) {
			local136 = Static444.anIntArrayArrayArray14[Static385.anInt6454][local95][local128] * 3;
			local141 = Static444.anIntArrayArrayArray14[Static385.anInt6454][local95 + 1][local128] * 3;
			local150 = (Static444.anIntArrayArrayArray14[Static385.anInt6454][local95 + 2][local128] + Static444.anIntArrayArrayArray14[Static385.anInt6454][local95 + 2][local128] - Static444.anIntArrayArrayArray14[Static385.anInt6454][local95 + 3][local128]) * 3;
			local168 = Static444.anIntArrayArrayArray14[Static385.anInt6454][local95][local128];
			@Pc(301) int local301 = local141 - local136;
			@Pc(310) int local310 = local150 + local136 - local141 * 2;
			@Pc(328) int local328 = local141 + Static444.anIntArrayArrayArray14[Static385.anInt6454][local95 + 2][local128] - local150 - local168;
			local224[local128] = local62 * ((local62 * (float) local328 + (float) local310) * local62 + (float) local301) + (float) local168;
		}
		@Pc(363) float local363 = local224[0] - local65[0];
		@Pc(374) float local374 = (local224[1] - local65[1]) * -1.0F;
		@Pc(382) float local382 = local224[2] - local65[2];
		@Pc(392) double local392 = Math.sqrt((double) (local382 * local382 + local363 * local363));
		Static119.anInt2680 = (int) (Math.atan2((double) local374, local392) * 2607.5945876176133D) & 0x3FFF;
		Static140.anInt2975 = (int) (-Math.atan2((double) local363, (double) local382) * 2607.5945876176133D) & 0x3FFF;
		Static130.anInt2796 = Static444.anIntArrayArrayArray14[Static103.anInt2414][local69][3] + (Static150.anInt4217 * (Static444.anIntArrayArrayArray14[Static103.anInt2414][local69 + 2][3] - Static444.anIntArrayArrayArray14[Static103.anInt2414][local69][3]) >> 16);
	}
}
