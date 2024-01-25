import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method7588() {
		Static221.aBoolean307 = true;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public static void method7589() {
		@Pc(9) int local9;
		if (Static517.aClass34Array5 != null) {
			for (local9 = 0; local9 < Static274.anInt4914; local9++) {
				Static517.aClass34Array5[local9] = null;
			}
			Static517.aClass34Array5 = null;
		}
		if (Static108.aClass34Array3 != null) {
			for (local9 = 0; local9 < Static368.anInt6139; local9++) {
				Static108.aClass34Array3[local9] = null;
			}
			Static108.aClass34Array3 = null;
		}
		if (Static8.aClass34Array4 != null) {
			for (local9 = 0; local9 < Static239.anInt4416; local9++) {
				Static8.aClass34Array4[local9] = null;
			}
			Static8.aClass34Array4 = null;
		}
		Static480.anIntArray460 = null;
		Static41.aClass34Array2 = null;
		Static519.anIntArrayArrayArray13 = null;
		Static176.anInt3129 = -1;
		Static140.anInt2441 = -1;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public static void method7590() {
		if (!Static95.aBoolean143) {
			Static444.aFloat139 += (24.0F - Static444.aFloat139) / 2.0F;
			Static187.aBoolean232 = true;
			Static95.aBoolean143 = true;
		}
	}
}
