import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
	public static int anInt3320 = 0;

	@OriginalMember(owner = "client!jg", name = "F", descriptor = "Lclient!uq;")
	public static Class251 aClass251_6 = null;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_114 = new Class107(89, 6);

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)V")
	public static void method2891() {
		if (Static77.anInt1741 == -1 || Static222.anInt4041 == -1) {
			return;
		}
		@Pc(21) int local21 = (Static313.anInt5410 * (Static415.anInt6749 - Static83.anInt1823) >> 16) + Static83.anInt1823;
		Static313.anInt5410 += local21;
		if (Static313.anInt5410 < 65535) {
			Static229.aBoolean293 = false;
			Static59.aBoolean87 = false;
		} else {
			Static313.anInt5410 = 65535;
			if (Static59.aBoolean87) {
				Static229.aBoolean293 = false;
			} else {
				Static229.aBoolean293 = true;
			}
			Static59.aBoolean87 = true;
		}
		@Pc(49) float local49 = (float) Static313.anInt5410 / 65535.0F;
		@Pc(52) float[] local52 = new float[3];
		@Pc(56) int local56 = Static367.anInt6036 * 2;
		@Pc(81) int local81;
		@Pc(114) int local114;
		@Pc(122) int local122;
		@Pc(127) int local127;
		@Pc(137) int local137;
		@Pc(155) int local155;
		for (@Pc(58) int local58 = 0; local58 < 3; local58++) {
			@Pc(69) int local69 = Static3.anIntArrayArrayArray1[Static77.anInt1741][local56][local58] * 3;
			local81 = Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 1][local58] * 3;
			local114 = (Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 2][local58] + Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 2][local58] - Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 3][local58]) * 3;
			local122 = Static3.anIntArrayArrayArray1[Static77.anInt1741][local56][local58];
			local127 = local81 - local69;
			local137 = local69 + local114 - local81 * 2;
			local155 = Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 2][local58] + local81 - local122 - local114;
			local52[local58] = (float) local122 + ((float) local127 + ((float) local137 + local49 * (float) local155) * local49) * local49;
		}
		Static142.anInt5535 = (int) local52[1] * -1;
		Static92.anInt1946 = (int) local52[2] - Static345.anInt5799 * 128;
		Static139.anInt2727 = (int) local52[0] - Static165.anInt3049 * 128;
		@Pc(210) float[] local210 = new float[3];
		local81 = Static84.anInt1833 * 2;
		for (local114 = 0; local114 < 3; local114++) {
			local122 = Static3.anIntArrayArrayArray1[Static222.anInt4041][local81][local114] * 3;
			local127 = Static3.anIntArrayArrayArray1[Static222.anInt4041][local81 + 1][local114] * 3;
			local137 = (Static3.anIntArrayArrayArray1[Static222.anInt4041][local81 + 2][local114] + Static3.anIntArrayArrayArray1[Static222.anInt4041][local81 + 2][local114] - Static3.anIntArrayArrayArray1[Static222.anInt4041][local81 + 3][local114]) * 3;
			local155 = Static3.anIntArrayArrayArray1[Static222.anInt4041][local81][local114];
			@Pc(286) int local286 = local127 - local122;
			@Pc(294) int local294 = local137 + local122 - local127 * 2;
			@Pc(311) int local311 = Static3.anIntArrayArrayArray1[Static222.anInt4041][local81 + 2][local114] + local127 - local155 - local137;
			local210[local114] = (float) local155 + ((float) local286 + local49 * ((float) local294 + (float) local311 * local49)) * local49;
		}
		@Pc(344) float local344 = local210[0] - local52[0];
		@Pc(355) float local355 = (local210[1] - local52[1]) * -1.0F;
		@Pc(363) float local363 = local210[2] - local52[2];
		@Pc(373) double local373 = Math.sqrt((double) (local344 * local344 + local363 * local363));
		Static296.anInt5167 = (int) (Math.atan2((double) local355, local373) * 2607.5945876176133D) & 0x3FFF;
		Static406.anInt6527 = (int) (-Math.atan2((double) local344, (double) local363) * 2607.5945876176133D) & 0x3FFF;
		Static264.anInt4689 = Static3.anIntArrayArrayArray1[Static77.anInt1741][local56][3] + ((Static3.anIntArrayArrayArray1[Static77.anInt1741][local56 + 2][3] - Static3.anIntArrayArrayArray1[Static77.anInt1741][local56][3]) * Static313.anInt5410 >> 16);
	}
}
