import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	public static int anInt5942;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_18 = new Class118(42);

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public static void method5319(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static445.anInt7219 == 2) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[0]);
				Static403.aClass23Array1[1].method378(Static444.aClass324Array1[1]);
			} else if (Static445.anInt7219 == 3) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[0]);
				Static403.aClass23Array1[1].method378(Static444.aClass324Array1[1]);
				Static403.aClass23Array1[2].method378(Static444.aClass324Array1[2]);
			} else {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[0]);
				Static403.aClass23Array1[1].method378(Static444.aClass324Array1[1]);
				Static403.aClass23Array1[2].method378(Static444.aClass324Array1[2]);
				Static403.aClass23Array1[3].method378(Static444.aClass324Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static445.anInt7219 == 2) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[2]);
			} else if (Static445.anInt7219 == 3) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[3]);
				Static403.aClass23Array1[1].method378(Static444.aClass324Array1[4]);
			} else {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[4]);
				Static403.aClass23Array1[1].method378(Static444.aClass324Array1[5]);
				Static403.aClass23Array1[2].method378(Static444.aClass324Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static445.anInt7219 == 2) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[3]);
				return;
			}
			if (Static445.anInt7219 == 3) {
				Static403.aClass23Array1[0].method378(Static444.aClass324Array1[5]);
				return;
			}
			Static403.aClass23Array1[0].method378(Static444.aClass324Array1[7]);
		}
	}
}
