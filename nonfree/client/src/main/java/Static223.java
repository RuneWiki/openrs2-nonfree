import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
	public static boolean aBoolean489 = false;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_201 = new Class102(54, 6);

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_153 = new Class211(97, 11);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public static void method5278() {
		if (Static27.anInt2471 == -1 || Static96.anInt1857 == -1) {
			return;
		}
		@Pc(28) int local28 = Static320.anInt5507 + (Static241.anInt3890 * (Static195.anInt3319 - Static320.anInt5507) >> 16);
		Static241.anInt3890 += local28;
		if (Static241.anInt3890 < 65535) {
			Static215.aBoolean218 = false;
			Static287.aBoolean333 = false;
		} else {
			if (Static287.aBoolean333) {
				Static215.aBoolean218 = false;
			} else {
				Static215.aBoolean218 = true;
			}
			Static241.anInt3890 = 65535;
			Static287.aBoolean333 = true;
		}
		@Pc(58) float local58 = (float) Static241.anInt3890 / 65535.0F;
		@Pc(61) float[] local61 = new float[3];
		@Pc(65) int local65 = Static18.anInt3418 * 2;
		@Pc(91) int local91;
		@Pc(124) int local124;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(145) int local145;
		@Pc(163) int local163;
		for (@Pc(67) int local67 = 0; local67 < 3; local67++) {
			@Pc(79) int local79 = Static343.anIntArrayArrayArray14[Static27.anInt2471][local65][local67] * 3;
			local91 = Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 1][local67] * 3;
			local124 = (Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 2][local67] + Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 2][local67] - Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 3][local67]) * 3;
			local132 = Static343.anIntArrayArrayArray14[Static27.anInt2471][local65][local67];
			local136 = local91 - local79;
			local145 = local79 + local124 - local91 * 2;
			local163 = local91 + Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 2][local67] - local132 - local124;
			local61[local67] = ((float) local136 + ((float) local163 * local58 + (float) local145) * local58) * local58 + (float) local132;
		}
		Static174.anInt3028 = (int) local61[0] - Static275.anInt4506 * 128;
		Static143.anInt2544 = (int) local61[2] - Static209.anInt3497 * 128;
		Static40.anInt771 = (int) local61[1] * -1;
		@Pc(216) float[] local216 = new float[3];
		local91 = Static428.anInt6928 * 2;
		for (local124 = 0; local124 < 3; local124++) {
			local132 = Static343.anIntArrayArrayArray14[Static96.anInt1857][local91][local124] * 3;
			local136 = Static343.anIntArrayArrayArray14[Static96.anInt1857][local91 + 1][local124] * 3;
			local145 = (Static343.anIntArrayArrayArray14[Static96.anInt1857][local91 + 2][local124] + Static343.anIntArrayArrayArray14[Static96.anInt1857][local91 + 2][local124] - Static343.anIntArrayArrayArray14[Static96.anInt1857][local91 + 3][local124]) * 3;
			local163 = Static343.anIntArrayArrayArray14[Static96.anInt1857][local91][local124];
			@Pc(292) int local292 = local136 - local132;
			@Pc(301) int local301 = local132 + local145 - local136 * 2;
			@Pc(320) int local320 = Static343.anIntArrayArrayArray14[Static96.anInt1857][local91 + 2][local124] + local136 - local163 - local145;
			local216[local124] = ((float) local292 + local58 * ((float) local320 * local58 + (float) local301)) * local58 + (float) local163;
		}
		@Pc(353) float local353 = local216[0] - local61[0];
		@Pc(363) float local363 = (local216[1] - local61[1]) * -1.0F;
		@Pc(371) float local371 = local216[2] - local61[2];
		@Pc(381) double local381 = Math.sqrt((double) (local371 * local371 + local353 * local353));
		Static235.anInt3805 = (int) (Math.atan2((double) local363, local381) * 2607.5945876176133D) & 0x3FFF;
		Static310.anInt5375 = (int) (-Math.atan2((double) local353, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static381.anInt6280 = Static343.anIntArrayArrayArray14[Static27.anInt2471][local65][3] + ((Static343.anIntArrayArrayArray14[Static27.anInt2471][local65 + 2][3] - Static343.anIntArrayArrayArray14[Static27.anInt2471][local65][3]) * Static241.anInt3890 >> 16);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
	public static void method5283(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static215.anInt3546 = arg1;
		Static219.anInt6125 = 0;
		Static317.anInt6670 = 0;
		Static155.anInt2670 = arg0;
	}
}
