import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray30;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!lh;")
	public static Class194 aClass194_5;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "Z")
	public static boolean aBoolean653 = false;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	public static void method7334() {
		if (Static91.anInt1774 == -1 || Static157.anInt3353 == -1) {
			return;
		}
		@Pc(24) int local24 = (Static272.anInt5215 * (Static213.anInt8690 - Static536.anInt8902) >> 16) + Static536.anInt8902;
		Static272.anInt5215 += local24;
		if (Static272.anInt5215 >= 65535) {
			Static272.anInt5215 = 65535;
			if (Static530.aBoolean641) {
				Static519.aBoolean635 = false;
			} else {
				Static519.aBoolean635 = true;
			}
			Static530.aBoolean641 = true;
		} else {
			Static519.aBoolean635 = false;
			Static530.aBoolean641 = false;
		}
		@Pc(56) float local56 = (float) Static272.anInt5215 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static497.anInt8315 * 2;
		@Pc(89) int local89;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static584.anIntArrayArrayArray21[Static91.anInt1774][local63][local65] * 3;
			local89 = Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 1][local65] * 3;
			local123 = (Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 2][local65] + Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 2][local65] - Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 3][local65]) * 3;
			local131 = Static584.anIntArrayArrayArray21[Static91.anInt1774][local63][local65];
			local135 = local89 - local77;
			local144 = local123 + local77 - local89 * 2;
			local162 = Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 2][local65] + local89 - local123 - local131;
			local59[local65] = (((float) local162 * local56 + (float) local144) * local56 + (float) local135) * local56 + (float) local131;
		}
		Static111.anInt2160 = (int) local59[1] * -1;
		Static322.anInt5904 = (int) local59[2] - Static138.anInt3088 * 512;
		Static371.anInt6572 = (int) local59[0] - Static39.anInt4952 * 512;
		@Pc(216) float[] local216 = new float[3];
		local89 = Static331.anInt6014 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static584.anIntArrayArrayArray21[Static157.anInt3353][local89][local123] * 3;
			local135 = Static584.anIntArrayArrayArray21[Static157.anInt3353][local89 + 1][local123] * 3;
			local144 = (Static584.anIntArrayArrayArray21[Static157.anInt3353][local89 + 2][local123] + Static584.anIntArrayArrayArray21[Static157.anInt3353][local89 + 2][local123] - Static584.anIntArrayArrayArray21[Static157.anInt3353][local89 + 3][local123]) * 3;
			local162 = Static584.anIntArrayArrayArray21[Static157.anInt3353][local89][local123];
			@Pc(291) int local291 = local135 - local131;
			@Pc(299) int local299 = local144 + local131 - local135 * 2;
			@Pc(316) int local316 = Static584.anIntArrayArrayArray21[Static157.anInt3353][local89 + 2][local123] + local135 - local162 - local144;
			local216[local123] = local56 * ((float) local291 + ((float) local299 + (float) local316 * local56) * local56) + (float) local162;
		}
		@Pc(349) float local349 = local216[0] - local59[0];
		@Pc(365) float local365 = -1.0F * (local216[1] - local59[1]);
		@Pc(374) float local374 = local216[2] - local59[2];
		@Pc(384) double local384 = Math.sqrt((double) (local374 * local374 + local349 * local349));
		Static67.anInt1407 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static570.anInt9340 = (int) (-Math.atan2((double) local349, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static385.anInt6775 = (Static272.anInt5215 * (Static584.anIntArrayArrayArray21[Static91.anInt1774][local63 + 2][3] - Static584.anIntArrayArrayArray21[Static91.anInt1774][local63][3]) >> 16) + Static584.anIntArrayArrayArray21[Static91.anInt1774][local63][3];
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V")
	public static void method7335(@OriginalArg(0) int arg0) {
		if (Static147.anIntArray692 == null || arg0 > Static147.anIntArray692.length) {
			Static147.anIntArray692 = new int[arg0];
		}
	}
}
