import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!iu", name = "h", descriptor = "Lclient!pc;")
	public static Class188 aClass188_52;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!ra;")
	public static final Class208 aClass208_9 = new Class208(10, 2, 2, 0);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "[Lclient!md;")
	public static final Class2_Sub20[] aClass2_Sub20Array1 = new Class2_Sub20[2048];

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
	public static void method2819() {
		if (Static21.anInt433 == -1 || Static148.anInt2821 == -1) {
			return;
		}
		@Pc(24) int local24 = Static164.anInt3208 + ((Static266.anInt4929 - Static164.anInt3208) * Static195.anInt3811 >> 16);
		Static195.anInt3811 += local24;
		if (Static195.anInt3811 >= 65535) {
			if (Static143.aBoolean653) {
				Static277.aBoolean430 = false;
			} else {
				Static277.aBoolean430 = true;
			}
			Static195.anInt3811 = 65535;
			Static143.aBoolean653 = true;
		} else {
			Static277.aBoolean430 = false;
			Static143.aBoolean653 = false;
		}
		@Pc(56) float local56 = (float) Static195.anInt3811 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static321.anInt5749 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(134) int local134;
		@Pc(144) int local144;
		@Pc(161) int local161;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static270.anIntArrayArrayArray12[Static21.anInt433][local63][local65] * 3;
			local89 = Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 1][local65] * 3;
			local122 = (Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 2][local65] + Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 2][local65] - Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 3][local65]) * 3;
			local130 = Static270.anIntArrayArrayArray12[Static21.anInt433][local63][local65];
			local134 = local89 - local77;
			local144 = local77 + local122 - local89 * 2;
			local161 = Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 2][local65] + local89 - local130 - local122;
			local59[local65] = (float) local130 + ((float) local134 + ((float) local161 * local56 + (float) local144) * local56) * local56;
		}
		Static225.anInt4310 = (int) local59[0] - Static173.anInt3340 * 128;
		Static293.anInt5621 = (int) local59[2] - Static379.anInt6721 * 128;
		Static110.anInt2281 = (int) local59[1] * -1;
		@Pc(216) float[] local216 = new float[3];
		local89 = Static121.anInt2406 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static270.anIntArrayArrayArray12[Static148.anInt2821][local89][local122] * 3;
			local134 = Static270.anIntArrayArrayArray12[Static148.anInt2821][local89 + 1][local122] * 3;
			local144 = (Static270.anIntArrayArrayArray12[Static148.anInt2821][local89 + 2][local122] + Static270.anIntArrayArrayArray12[Static148.anInt2821][local89 + 2][local122] - Static270.anIntArrayArrayArray12[Static148.anInt2821][local89 + 3][local122]) * 3;
			local161 = Static270.anIntArrayArrayArray12[Static148.anInt2821][local89][local122];
			@Pc(292) int local292 = local134 - local130;
			@Pc(302) int local302 = local130 + local144 - local134 * 2;
			@Pc(320) int local320 = local134 + Static270.anIntArrayArrayArray12[Static148.anInt2821][local89 - -2][local122] - local144 - local161;
			local216[local122] = (float) local161 + local56 * ((float) local292 + local56 * ((float) local302 + (float) local320 * local56));
		}
		@Pc(355) float local355 = local216[0] - local59[0];
		@Pc(366) float local366 = (local216[1] - local59[1]) * -1.0F;
		@Pc(375) float local375 = local216[2] - local59[2];
		@Pc(385) double local385 = Math.sqrt((double) (local375 * local375 + local355 * local355));
		Static293.anInt5622 = (int) (Math.atan2((double) local366, local385) * 2607.5945876176133D) & 0x3FFF;
		Static258.anInt4308 = (int) (-Math.atan2((double) local355, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static436.anInt7610 = ((Static270.anIntArrayArrayArray12[Static21.anInt433][local63 + 2][3] - Static270.anIntArrayArrayArray12[Static21.anInt433][local63][3]) * Static195.anInt3811 >> 16) + Static270.anIntArrayArrayArray12[Static21.anInt433][local63][3];
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)V")
	public static void method2820() {
		if (Static105.aClass141_2 != null) {
			Static105.aClass141_2.method5198();
		}
		if (Static51.aClass141_1 != null) {
			Static51.aClass141_1.method5198();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V")
	public static void method2823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
		Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_6.anInt7355);
		Static98.aClass2_Sub20_Sub1_1.method3699(arg0);
		Static98.aClass2_Sub20_Sub1_1.method3699(arg2);
		Static98.aClass2_Sub20_Sub1_1.method3745(arg1);
		Static98.aClass2_Sub20_Sub1_1.method3745(arg3);
		Static60.anInt1700 = -3;
		Static154.anInt2943 = 0;
		Static124.anInt2433 = 0;
		Static375.anInt6694 = 1;
	}
}
