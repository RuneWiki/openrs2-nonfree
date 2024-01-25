import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt2390;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_42 = new Class57("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_43 = new Class57("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method2018() {
		Static201.aClass62Array2 = null;
		Static75.method1308(0, 0, 0, -1, Static199.anInt3567, 0, Static68.anInt1346, Static207.anInt2251);
		if (Static201.aClass62Array2 != null) {
			Static368.method5523(-1412584499, Static363.aClass62_19.anInt1528, 0, Static384.anInt6418, Static199.anInt3567, Static201.aClass62Array2, 0, Static365.anInt6146, Static207.anInt2251);
			Static201.aClass62Array2 = null;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
	public static void method2019() {
		if (Static302.anInt5239 == -1 || Static254.anInt1042 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static76.anInt1625 - Static75.anInt1616) * Static89.anInt6128 >> 16) + Static75.anInt1616;
		Static89.anInt6128 += local24;
		if (Static89.anInt6128 >= 65535) {
			Static89.anInt6128 = 65535;
			if (Static277.aBoolean370) {
				Static188.aBoolean252 = false;
			} else {
				Static188.aBoolean252 = true;
			}
			Static277.aBoolean370 = true;
		} else {
			Static277.aBoolean370 = false;
			Static188.aBoolean252 = false;
		}
		@Pc(56) float local56 = (float) Static89.anInt6128 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static286.anInt5989 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(163) int local163;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static207.anIntArrayArrayArray11[Static302.anInt5239][local63][local65] * 3;
			local89 = Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 1][local65] * 3;
			local122 = (Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 2][local65] + Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 2][local65] - Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 3][local65]) * 3;
			local130 = Static207.anIntArrayArrayArray11[Static302.anInt5239][local63][local65];
			local135 = local89 - local77;
			local144 = local122 + local77 - local89 * 2;
			local163 = Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 2][local65] + local89 - local122 - local130;
			local59[local65] = local56 * (((float) local144 + (float) local163 * local56) * local56 + (float) local135) + (float) local130;
		}
		Static339.anInt5726 = (int) local59[2] - Static103.anInt2044 * 128;
		Static206.anInt3639 = (int) local59[0] - Static21.anInt265 * 128;
		Static243.anInt4289 = (int) local59[1] * -1;
		@Pc(219) float[] local219 = new float[3];
		local89 = Static25.anInt339 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static207.anIntArrayArrayArray11[Static254.anInt1042][local89][local122] * 3;
			local135 = Static207.anIntArrayArrayArray11[Static254.anInt1042][local89 + 1][local122] * 3;
			local144 = (Static207.anIntArrayArrayArray11[Static254.anInt1042][local89 + 2][local122] + Static207.anIntArrayArrayArray11[Static254.anInt1042][local89 + 2][local122] - Static207.anIntArrayArrayArray11[Static254.anInt1042][local89 + 3][local122]) * 3;
			local163 = Static207.anIntArrayArrayArray11[Static254.anInt1042][local89][local122];
			@Pc(294) int local294 = local135 - local130;
			@Pc(303) int local303 = local130 + local144 - local135 * 2;
			@Pc(321) int local321 = Static207.anIntArrayArrayArray11[Static254.anInt1042][local89 + 2][local122] + local135 - local144 - local163;
			local219[local122] = (float) local163 + local56 * (local56 * ((float) local321 * local56 + (float) local303) + (float) local294);
		}
		@Pc(354) float local354 = local219[0] - local59[0];
		@Pc(365) float local365 = (local219[1] - local59[1]) * -1.0F;
		@Pc(374) float local374 = local219[2] - local59[2];
		@Pc(384) double local384 = Math.sqrt((double) (local374 * local374 + local354 * local354));
		Static327.anInt5556 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static145.anInt2716 = (int) (-Math.atan2((double) local354, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static331.anInt5600 = Static207.anIntArrayArrayArray11[Static302.anInt5239][local63][3] + ((Static207.anIntArrayArrayArray11[Static302.anInt5239][local63 + 2][3] - Static207.anIntArrayArrayArray11[Static302.anInt5239][local63][3]) * Static89.anInt6128 >> 16);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method2021(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static69.aClass48ArrayArrayArray1 = Static81.aClass48ArrayArrayArray2;
			Static337.aClass7Array3 = Static25.aClass7Array1;
		} else {
			Static69.aClass48ArrayArrayArray1 = Static307.aClass48ArrayArrayArray5;
			Static337.aClass7Array3 = Static89.aClass7Array4;
		}
		Static164.anInt2901 = Static69.aClass48ArrayArrayArray1.length;
	}
}
