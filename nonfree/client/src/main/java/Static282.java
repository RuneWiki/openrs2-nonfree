import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
	public static int anInt5536;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
	public static int anInt5537;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString186 = "scroll:";

	@OriginalMember(owner = "client!va", name = "db", descriptor = "Lclient!ul;")
	public static Class172 aClass172_45 = new Class172(16);

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "[I")
	public static int[] anIntArray439 = new int[500];

	@OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
	public static void method4404() {
		if (Static13.anInt287 == -1 || Static242.anInt4773 == -1) {
			return;
		}
		@Pc(27) int local27 = Static171.anInt3438 + ((Static179.anInt3616 - Static171.anInt3438) * Static123.anInt2499 >> 16);
		Static123.anInt2499 += local27;
		@Pc(35) int local35 = Static178.anInt3609 * 2;
		if (Static123.anInt2499 < 65535) {
			Static122.aBoolean158 = false;
			Static236.aBoolean293 = false;
		} else {
			Static123.anInt2499 = 65535;
			if (Static122.aBoolean158) {
				Static236.aBoolean293 = false;
			} else {
				Static236.aBoolean293 = true;
			}
			Static122.aBoolean158 = true;
		}
		@Pc(59) float[] local59 = new float[3];
		@Pc(64) float local64 = (float) Static123.anInt2499 / 65535.0F;
		@Pc(81) int local81;
		@Pc(93) int local93;
		@Pc(134) int local134;
		@Pc(101) int local101;
		@Pc(139) int local139;
		@Pc(148) int local148;
		@Pc(166) int local166;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			local81 = Static170.anIntArrayArrayArray9[Static13.anInt287][local35][local66] * 3;
			local93 = Static170.anIntArrayArrayArray9[Static13.anInt287][local35 + 1][local66] * 3;
			local101 = Static170.anIntArrayArrayArray9[Static13.anInt287][local35][local66];
			local134 = (Static170.anIntArrayArrayArray9[Static13.anInt287][local35 + 2][local66] + Static170.anIntArrayArrayArray9[Static13.anInt287][local35 + 2][local66] - Static170.anIntArrayArrayArray9[Static13.anInt287][local35 + 3][local66]) * 3;
			local139 = local93 - local81;
			local148 = local134 + local81 - local93 * 2;
			local166 = local93 + Static170.anIntArrayArrayArray9[Static13.anInt287][local35 + 2][local66] - local134 - local101;
			local59[local66] = (float) local101 + local64 * (local64 * ((float) local148 + (float) local166 * local64) + (float) local139);
		}
		Static248.anInt4865 = (int) local59[2] - Static105.anInt2105 * 128;
		Static153.anInt3111 = (int) local59[1] * -1;
		@Pc(209) float[] local209 = new float[3];
		Static71.anInt1457 = (int) local59[0] - Static269.anInt5357 * 128;
		local81 = Static122.anInt2464 * 2;
		for (local93 = 0; local93 < 3; local93++) {
			local139 = (Static170.anIntArrayArrayArray9[Static242.anInt4773][local81 + 2][local93] + Static170.anIntArrayArrayArray9[Static242.anInt4773][local81 + 2][local93] - Static170.anIntArrayArrayArray9[Static242.anInt4773][local81 + 3][local93]) * 3;
			local101 = Static170.anIntArrayArrayArray9[Static242.anInt4773][local81 + 1][local93] * 3;
			local148 = Static170.anIntArrayArrayArray9[Static242.anInt4773][local81][local93];
			local134 = Static170.anIntArrayArrayArray9[Static242.anInt4773][local81][local93] * 3;
			local166 = local101 - local134;
			@Pc(312) int local312 = Static170.anIntArrayArrayArray9[Static242.anInt4773][local81 + 2][local93] + local101 - local148 - local139;
			@Pc(321) int local321 = local139 + local134 - local101 * 2;
			local209[local93] = (float) local148 + ((float) local166 + local64 * ((float) local321 + (float) local312 * local64)) * local64;
		}
		@Pc(352) float local352 = local209[0] - local59[0];
		@Pc(362) float local362 = (local209[1] - local59[1]) * -1.0F;
		@Pc(371) float local371 = local209[2] - local59[2];
		@Pc(381) double local381 = Math.sqrt((double) (local352 * local352 + local371 * local371));
		Static176.aFloat161 = (float) Math.atan2((double) local362, local381);
		Static32.aFloat22 = -((float) Math.atan2((double) local352, (double) local371));
		Static254.anInt4974 = (int) ((double) Static176.aFloat161 * 325.949D) & 0x7FF;
		Static56.anInt1258 = (int) ((double) Static32.aFloat22 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V")
	public static void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(9) int local9 = arg1; local9 <= arg3; local9++) {
			Static190.method3151(arg2, Static253.anIntArrayArray34[local9], arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V")
	public static void method4407() {
		Static23.anIntArray65 = Static307.method4706(0.4F);
	}
}
