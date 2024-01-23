import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
	public static int anInt489;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!qe;")
	public static Class78 aClass78_92 = Static199.method3560("<col=80ff00>");

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!qe;")
	public static Class78 aClass78_93 = Static199.method3560("<col=ffffff>");

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "[I")
	public static int[] anIntArray86 = new int[128];

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
	public static int anInt492 = -1;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	public static void method360() {
		if (Static167.anInt3840 == -1 || Static11.anInt314 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static45.anInt813 - Static146.anInt3311) * Static32.anInt4050 >> 16) + Static146.anInt3311;
		@Pc(27) int local27 = Static167.anInt3869 * 2;
		@Pc(30) float[] local30 = new float[3];
		Static32.anInt4050 += local23;
		if (Static32.anInt4050 >= 65535) {
			Static32.anInt4050 = 65535;
			if (Static74.aBoolean57) {
				Static117.aBoolean114 = false;
			} else {
				Static117.aBoolean114 = true;
			}
			Static74.aBoolean57 = true;
		} else {
			Static117.aBoolean114 = false;
			Static74.aBoolean57 = false;
		}
		@Pc(60) float local60 = (float) Static32.anInt4050 / 65535.0F;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(150) int local150;
		@Pc(132) int local132;
		@Pc(142) int local142;
		@Pc(167) int local167;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Static159.anIntArrayArrayArray13[Static167.anInt3840][local27][local70] * 3;
			local94 = Static159.anIntArrayArrayArray13[Static167.anInt3840][local27 + 1][local70] * 3;
			local127 = (Static159.anIntArrayArrayArray13[Static167.anInt3840][local27 + 2][local70] + Static159.anIntArrayArrayArray13[Static167.anInt3840][local27 + 2][local70] - Static159.anIntArrayArrayArray13[Static167.anInt3840][local27 + 3][local70]) * 3;
			local132 = local94 - local82;
			local142 = local82 + local127 - local94 * 2;
			local150 = Static159.anIntArrayArrayArray13[Static167.anInt3840][local27][local70];
			local167 = Static159.anIntArrayArrayArray13[Static167.anInt3840][local27 + 2][local70] + local94 - local127 - local150;
			local30[local70] = (float) local150 + local60 * ((float) local132 + local60 * ((float) local167 * local60 + (float) local142));
		}
		local94 = Static227.anInt4917 * 2;
		Static107.anInt2348 = (int) local30[1] * -1;
		@Pc(207) float[] local207 = new float[3];
		if (Static28.anInt497 == 0 && Static57.anInt628 == 0) {
			Static57.anInt628 = (((int) local30[2] >> 10) - 6) * 8;
			Static28.anInt497 = ((int) local30[0] >> 10) * 8 - 48;
		}
		Static71.anInt1394 = (int) local30[2] - Static57.anInt628 * 128;
		Static39.anInt727 = (int) local30[0] - Static28.anInt497 * 128;
		for (local127 = 0; local127 < 3; local127++) {
			local132 = Static159.anIntArrayArrayArray13[Static11.anInt314][local94 + 1][local127] * 3;
			local142 = (Static159.anIntArrayArrayArray13[Static11.anInt314][local94 + 2][local127] + Static159.anIntArrayArrayArray13[Static11.anInt314][local94 + 2][local127] - Static159.anIntArrayArrayArray13[Static11.anInt314][local94 + 3][local127]) * 3;
			local150 = Static159.anIntArrayArrayArray13[Static11.anInt314][local94][local127] * 3;
			local167 = Static159.anIntArrayArrayArray13[Static11.anInt314][local94][local127];
			@Pc(327) int local327 = local132 - local150;
			@Pc(336) int local336 = local150 + local142 - local132 * 2;
			@Pc(353) int local353 = local132 + Static159.anIntArrayArrayArray13[Static11.anInt314][local94 - -2][local127] - local142 - local167;
			local207[local127] = (float) local167 + ((float) local327 + local60 * ((float) local336 + local60 * (float) local353)) * local60;
		}
		@Pc(389) float local389 = (local207[1] - local30[1]) * -1.0F;
		@Pc(398) float local398 = local207[0] - local30[0];
		@Pc(406) float local406 = local207[2] - local30[2];
		@Pc(416) double local416 = Math.sqrt((double) (local406 * local406 + local398 * local398));
		Static108.aFloat3 = (float) Math.atan2((double) local389, local416);
		Static58.aFloat1 = -((float) Math.atan2((double) local398, (double) local406));
		Static138.anInt3181 = (int) ((double) Static58.aFloat1 * 325.949D) & 0x7FF;
		Static15.anInt335 = (int) ((double) Static108.aFloat3 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
	public static void method362() {
		Static186.aClass110_21.method3889();
		Static106.aClass53_9.method1797();
		Static184.aClass53_17.method1797();
		Static147.aClass53_14.method1797();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)V")
	public static void method363(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub3_Sub15 local13 = Static103.method1787(1, arg0);
		local13.method1648();
	}
}
