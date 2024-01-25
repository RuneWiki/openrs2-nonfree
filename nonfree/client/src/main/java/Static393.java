import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!jj;")
	public static Class4_Sub18_Sub1 aClass4_Sub18_Sub1_1;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!er;")
	public static final Class69 aClass69_68 = new Class69(64);

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_231 = new Class186(53, -2);

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	public static void method5277() {
		if (Static52.anInt1388 == -1 || Static282.anInt4959 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static39.anInt1897 - Static342.anInt6169) * Static300.anInt5428 >> 16) + Static342.anInt6169;
		Static300.anInt5428 += local24;
		if (Static300.anInt5428 < 65535) {
			Static154.aBoolean211 = false;
			Static79.aBoolean123 = false;
		} else {
			Static300.anInt5428 = 65535;
			if (Static154.aBoolean211) {
				Static79.aBoolean123 = false;
			} else {
				Static79.aBoolean123 = true;
			}
			Static154.aBoolean211 = true;
		}
		@Pc(54) float local54 = (float) Static300.anInt5428 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static264.anInt4722 * 2;
		@Pc(87) int local87;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(161) int local161;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static99.anIntArrayArrayArray12[Static52.anInt1388][local61][local63] * 3;
			local87 = Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 1][local63] * 3;
			local120 = (Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 2][local63] + Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 2][local63] - Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 3][local63]) * 3;
			local128 = Static99.anIntArrayArrayArray12[Static52.anInt1388][local61][local63];
			local133 = local87 - local75;
			local142 = local120 + local75 - local87 * 2;
			local161 = Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 2][local63] + local87 - local128 - local120;
			local57[local63] = (float) local128 + local54 * ((float) local133 + local54 * ((float) local161 * local54 + (float) local142));
		}
		Static30.anInt696 = (int) local57[2] - Static285.anInt5187 * 128;
		Static292.anInt5287 = (int) local57[1] * -1;
		Static254.anInt4614 = (int) local57[0] - Static381.anInt6688 * 128;
		@Pc(217) float[] local217 = new float[3];
		local87 = Static440.anInt7377 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static99.anIntArrayArrayArray12[Static282.anInt4959][local87][local120] * 3;
			local133 = Static99.anIntArrayArrayArray12[Static282.anInt4959][local87 + 1][local120] * 3;
			local142 = (Static99.anIntArrayArrayArray12[Static282.anInt4959][local87 + 2][local120] + Static99.anIntArrayArrayArray12[Static282.anInt4959][local87 + 2][local120] - Static99.anIntArrayArrayArray12[Static282.anInt4959][local87 + 3][local120]) * 3;
			local161 = Static99.anIntArrayArrayArray12[Static282.anInt4959][local87][local120];
			@Pc(293) int local293 = local133 - local128;
			@Pc(302) int local302 = local142 + local128 - local133 * 2;
			@Pc(320) int local320 = Static99.anIntArrayArrayArray12[Static282.anInt4959][local87 + 2][local120] + local133 - local161 - local142;
			local217[local120] = local54 * (local54 * ((float) local320 * local54 + (float) local302) + (float) local293) + (float) local161;
		}
		@Pc(352) float local352 = local217[0] - local57[0];
		@Pc(363) float local363 = -1.0F * (local217[1] - local57[1]);
		@Pc(371) float local371 = local217[2] - local57[2];
		@Pc(381) double local381 = Math.sqrt((double) (local352 * local352 + local371 * local371));
		Static183.anInt3503 = (int) (Math.atan2((double) local363, local381) * 2607.5945876176133D) & 0x3FFF;
		Static142.anInt2687 = (int) (-Math.atan2((double) local352, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static185.anInt6759 = Static99.anIntArrayArrayArray12[Static52.anInt1388][local61][3] + ((Static99.anIntArrayArrayArray12[Static52.anInt1388][local61 + 2][3] - Static99.anIntArrayArrayArray12[Static52.anInt1388][local61][3]) * Static300.anInt5428 >> 16);
	}
}
