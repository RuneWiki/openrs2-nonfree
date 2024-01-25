import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!aq", name = "Ff", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!aq", name = "nf", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!aq", name = "Wb", descriptor = "I")
	public static int anInt897 = 0;

	@OriginalMember(owner = "client!aq", name = "td", descriptor = "J")
	public static long aLong23 = -1L;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "(I)V")
	public static void method929() {
		if (Static67.anInt1614 == -1 || Static565.anInt8603 == -1) {
			return;
		}
		@Pc(29) int local29 = Static675.anInt10593 + ((Static212.anInt3494 - Static675.anInt10593) * Static93.anInt2108 >> 16);
		Static93.anInt2108 += local29;
		if (Static93.anInt2108 < 65535) {
			Static261.aBoolean260 = false;
			Static54.aBoolean96 = false;
		} else {
			Static93.anInt2108 = 65535;
			if (Static54.aBoolean96) {
				Static261.aBoolean260 = false;
			} else {
				Static261.aBoolean260 = true;
			}
			Static54.aBoolean96 = true;
		}
		@Pc(67) float local67 = (float) Static93.anInt2108 / 65535.0F;
		@Pc(70) float[] local70 = new float[3];
		@Pc(74) int local74 = Static430.anInt6558 * 2;
		@Pc(102) int local102;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(147) int local147;
		@Pc(157) int local157;
		@Pc(174) int local174;
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(90) int local90 = Static269.anIntArrayArrayArray5[Static67.anInt1614][local74][local76] * 3;
			local102 = Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 1][local76] * 3;
			local134 = (Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 2][local76] + Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 2][local76] - Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 3][local76]) * 3;
			local142 = Static269.anIntArrayArrayArray5[Static67.anInt1614][local74][local76];
			local147 = local102 - local90;
			local157 = local90 + local134 - local102 * 2;
			local174 = local102 + Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 2][local76] - local134 - local142;
			local70[local76] = (float) local142 + (local67 * ((float) local157 + (float) local174 * local67) + (float) local147) * local67;
		}
		Static263.anInt4101 = (int) local70[2] - Static189.anInt3243 * 512;
		Static490.anInt7687 = (int) local70[1] * -1;
		Static305.anInt4908 = (int) local70[0] - Static291.anInt4448 * 512;
		@Pc(227) float[] local227 = new float[3];
		local102 = Static686.anInt10661 * 2;
		for (local134 = 0; local134 < 3; local134++) {
			local142 = Static269.anIntArrayArrayArray5[Static565.anInt8603][local102][local134] * 3;
			local147 = Static269.anIntArrayArrayArray5[Static565.anInt8603][local102 + 1][local134] * 3;
			local157 = (Static269.anIntArrayArrayArray5[Static565.anInt8603][local102 + 2][local134] + Static269.anIntArrayArrayArray5[Static565.anInt8603][local102 + 2][local134] - Static269.anIntArrayArrayArray5[Static565.anInt8603][local102 + 3][local134]) * 3;
			local174 = Static269.anIntArrayArrayArray5[Static565.anInt8603][local102][local134];
			@Pc(308) int local308 = local147 - local142;
			@Pc(317) int local317 = local157 + local142 - local147 * 2;
			@Pc(335) int local335 = local147 + Static269.anIntArrayArrayArray5[Static565.anInt8603][local102 + 2][local134] - local157 - local174;
			local227[local134] = local67 * ((float) local308 + local67 * ((float) local317 + (float) local335 * local67)) + (float) local174;
		}
		@Pc(370) float local370 = local227[0] - local70[0];
		@Pc(381) float local381 = -1.0F * (local227[1] - local70[1]);
		@Pc(389) float local389 = local227[2] - local70[2];
		@Pc(399) double local399 = Math.sqrt((double) (local389 * local389 + local370 * local370));
		Static171.anInt8707 = (int) (Math.atan2((double) local381, local399) * 2607.5945876176133D) & 0x3FFF;
		Static46.anInt1301 = (int) (-Math.atan2((double) local370, (double) local389) * 2607.5945876176133D) & 0x3FFF;
		Static32.anInt1120 = Static269.anIntArrayArrayArray5[Static67.anInt1614][local74][3] + (Static93.anInt2108 * (Static269.anIntArrayArrayArray5[Static67.anInt1614][local74 + 2][3] - Static269.anIntArrayArrayArray5[Static67.anInt1614][local74][3]) >> 16);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 >= Static82.anInt1902 && Static77.anInt1737 >= arg0 && Static82.anInt1902 <= arg5 && Static77.anInt1737 >= arg5 && Static82.anInt1902 <= arg2 && arg2 <= Static77.anInt1737 && arg7 >= Static82.anInt1902 && Static77.anInt1737 >= arg7 && arg4 >= Static549.anInt5294 && arg4 <= Static334.anInt5381 && Static549.anInt5294 <= arg3 && Static334.anInt5381 >= arg3 && Static549.anInt5294 <= arg6 && arg6 <= Static334.anInt5381 && Static549.anInt5294 <= arg8 && arg8 <= Static334.anInt5381) {
			Static301.method4467(arg8, arg6, arg5, arg3, arg7, arg2, arg4, arg0, arg1);
		} else {
			Static584.method7522(arg2, arg4, arg5, arg8, arg0, arg6, arg1, arg3, arg7);
		}
	}
}
