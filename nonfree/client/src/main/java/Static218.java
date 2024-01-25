import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!np", name = "O", descriptor = "[S")
	public static short[] aShortArray87;

	@OriginalMember(owner = "client!np", name = "P", descriptor = "Lclient!ct;")
	public static Class30 aClass30_65;

	@OriginalMember(owner = "client!np", name = "C", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_147 = new Class217(54, -1);

	@OriginalMember(owner = "client!np", name = "J", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_148 = new Class106("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!np", name = "N", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_149 = new Class106("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!np", name = "Q", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_148 = new Class18(42, 2);

	@OriginalMember(owner = "client!np", name = "R", descriptor = "I")
	public static int anInt4352 = 2;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
	public static void method4030() {
		if (Static2.anInt123 == -1 || Static7.anInt214 == -1) {
			return;
		}
		@Pc(26) int local26 = Static92.anInt2062 + ((Static128.anInt5884 - Static92.anInt2062) * Static153.anInt3175 >> 16);
		Static153.anInt3175 += local26;
		if (Static153.anInt3175 < 65535) {
			Static233.aBoolean357 = false;
			Static134.aBoolean208 = false;
		} else {
			Static153.anInt3175 = 65535;
			if (Static233.aBoolean357) {
				Static134.aBoolean208 = false;
			} else {
				Static134.aBoolean208 = true;
			}
			Static233.aBoolean357 = true;
		}
		@Pc(56) float local56 = (float) Static153.anInt3175 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static123.anInt2710 * 2;
		@Pc(89) int local89;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static241.anIntArrayArrayArray105[Static2.anInt123][local63][local65] * 3;
			local89 = Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 1][local65] * 3;
			local121 = (Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 2][local65] + Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 2][local65] - Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 3][local65]) * 3;
			local129 = Static241.anIntArrayArrayArray105[Static2.anInt123][local63][local65];
			local133 = local89 - local77;
			local142 = local121 + local77 - local89 * 2;
			local160 = local89 + Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 2][local65] - local121 - local129;
			local59[local65] = ((float) local133 + ((float) local142 + (float) local160 * local56) * local56) * local56 + (float) local129;
		}
		Static260.anInt5192 = (int) local59[2] - Static299.anInt4036 * 128;
		Static294.anInt5665 = (int) local59[1] * -1;
		Static14.anInt4971 = (int) local59[0] - Static50.anInt1271 * 128;
		@Pc(216) float[] local216 = new float[3];
		local89 = Static2.anInt126 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static241.anIntArrayArrayArray105[Static7.anInt214][local89][local121] * 3;
			local133 = Static241.anIntArrayArrayArray105[Static7.anInt214][local89 + 1][local121] * 3;
			local142 = (Static241.anIntArrayArrayArray105[Static7.anInt214][local89 + 2][local121] + Static241.anIntArrayArrayArray105[Static7.anInt214][local89 + 2][local121] - Static241.anIntArrayArrayArray105[Static7.anInt214][local89 + 3][local121]) * 3;
			local160 = Static241.anIntArrayArrayArray105[Static7.anInt214][local89][local121];
			@Pc(292) int local292 = local133 - local129;
			@Pc(301) int local301 = local129 + local142 - local133 * 2;
			@Pc(319) int local319 = local133 + Static241.anIntArrayArrayArray105[Static7.anInt214][local89 + 2][local121] - local160 - local142;
			local216[local121] = (float) local160 + local56 * (((float) local301 + (float) local319 * local56) * local56 + (float) local292);
		}
		@Pc(359) float local359 = local216[0] - local59[0];
		@Pc(370) float local370 = -1.0F * (local216[1] - local59[1]);
		@Pc(379) float local379 = local216[2] - local59[2];
		@Pc(389) double local389 = Math.sqrt((double) (local379 * local379 + local359 * local359));
		Static272.anInt5295 = (int) (Math.atan2((double) local370, local389) * 2607.5945876176133D) & 0x3FFF;
		Static320.anInt4362 = (int) (-Math.atan2((double) local359, (double) local379) * 2607.5945876176133D) & 0x3FFF;
		Static129.anInt2810 = (Static153.anInt3175 * (Static241.anIntArrayArrayArray105[Static2.anInt123][local63 + 2][3] - Static241.anIntArrayArrayArray105[Static2.anInt123][local63][3]) >> 16) + Static241.anIntArrayArrayArray105[Static2.anInt123][local63][3];
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!kg;I)V")
	public static void method4033(@OriginalArg(0) Class112 arg0) {
		if (Static331.anInt6242 != arg0.anInt3446) {
			return;
		}
		if (Static191.aClass11_Sub2_Sub6_Sub1_4.aString63 == null) {
			arg0.anInt3384 = 0;
			arg0.anInt3440 = 0;
			return;
		}
		arg0.anInt3367 = 150;
		arg0.anInt3371 = (int) (Math.sin((double) Static51.anInt1301 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3438 = 5;
		arg0.anInt3440 = Static352.anInt1802;
		arg0.anInt3384 = Static171.method3208(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63);
		arg0.anInt3409 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6747;
		arg0.anInt3387 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6733;
		arg0.anInt3441 = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6788;
		arg0.anInt3407 = 0;
	}
}
