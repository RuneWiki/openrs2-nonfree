import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "J")
	public static long aLong243;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "Z")
	public static boolean aBoolean672 = false;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray36 = new String[200];

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "[I")
	public static int[] anIntArray556 = new int[2];

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I[[BLclient!wca;)V")
	public static void method7266(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class234_Sub1 arg1) {
		@Pc(16) int local16 = Static145.aByteArrayArray5.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static91.anIntArray519[local18] >> 8) * 64 - Static539.anInt9045;
				@Pc(48) int local48 = (Static91.anIntArray519[local18] & 0xFF) * 64 - Static311.anInt5708;
				Static275.method4012();
				arg1.method7754(Static590.aClass240Array1, local24, Static31.aClass78_18, local37, local48);
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	public static void method7267() {
		if (Static452.anInt7956 == -1 || Static528.anInt8968 == -1) {
			return;
		}
		@Pc(25) int local25 = (Static567.anInt6884 * (Static294.anInt5308 - Static563.anInt9342) >> 16) + Static563.anInt9342;
		Static567.anInt6884 += local25;
		if (Static567.anInt6884 < 65535) {
			Static41.aBoolean615 = false;
			Static194.aBoolean274 = false;
		} else {
			if (Static194.aBoolean274) {
				Static41.aBoolean615 = false;
			} else {
				Static41.aBoolean615 = true;
			}
			Static567.anInt6884 = 65535;
			Static194.aBoolean274 = true;
		}
		@Pc(57) float local57 = (float) Static567.anInt6884 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static148.anInt2831 * 2;
		@Pc(90) int local90;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(162) int local162;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static260.anIntArrayArrayArray13[Static452.anInt7956][local64][local66] * 3;
			local90 = Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 1][local66] * 3;
			local122 = (Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 2][local66] + Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 2][local66] - Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 3][local66]) * 3;
			local130 = Static260.anIntArrayArrayArray13[Static452.anInt7956][local64][local66];
			local135 = local90 - local78;
			local143 = local122 + local78 - local90 * 2;
			local162 = Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 2][local66] + local90 - local122 - local130;
			local60[local66] = (float) local130 + ((float) local135 + local57 * ((float) local143 + local57 * (float) local162)) * local57;
		}
		Static20.anInt542 = (int) local60[1] * -1;
		Static393.anInt6978 = (int) local60[0] - Static539.anInt9045 * 512;
		Static78.anInt1534 = (int) local60[2] - Static311.anInt5708 * 512;
		@Pc(215) float[] local215 = new float[3];
		local90 = Static422.anInt7420 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static260.anIntArrayArrayArray13[Static528.anInt8968][local90][local122] * 3;
			local135 = Static260.anIntArrayArrayArray13[Static528.anInt8968][local90 + 1][local122] * 3;
			local143 = (Static260.anIntArrayArrayArray13[Static528.anInt8968][local90 + 2][local122] + Static260.anIntArrayArrayArray13[Static528.anInt8968][local90 + 2][local122] - Static260.anIntArrayArrayArray13[Static528.anInt8968][local90 + 3][local122]) * 3;
			local162 = Static260.anIntArrayArrayArray13[Static528.anInt8968][local90][local122];
			@Pc(292) int local292 = local135 - local130;
			@Pc(301) int local301 = local143 + local130 - local135 * 2;
			@Pc(318) int local318 = local135 + Static260.anIntArrayArrayArray13[Static528.anInt8968][local90 + 2][local122] - local162 - local143;
			local215[local122] = (local57 * ((float) local318 * local57 + (float) local301) + (float) local292) * local57 + (float) local162;
		}
		@Pc(353) float local353 = local215[0] - local60[0];
		@Pc(363) float local363 = -1.0F * (local215[1] - local60[1]);
		@Pc(371) float local371 = local215[2] - local60[2];
		@Pc(381) double local381 = Math.sqrt((double) (local353 * local353 + local371 * local371));
		Static428.anInt7673 = (int) (Math.atan2((double) local363, local381) * 2607.5945876176133D) & 0x3FFF;
		Static175.anInt3256 = (int) (-Math.atan2((double) local353, (double) local371) * 2607.5945876176133D) & 0x3FFF;
		Static76.anInt6369 = Static260.anIntArrayArrayArray13[Static452.anInt7956][local64][3] + ((Static260.anIntArrayArrayArray13[Static452.anInt7956][local64 + 2][3] - Static260.anIntArrayArrayArray13[Static452.anInt7956][local64][3]) * Static567.anInt6884 >> 16);
	}
}
