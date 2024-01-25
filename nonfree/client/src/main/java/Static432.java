import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!fc;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_231 = new Class189("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "Z")
	public static final boolean aBoolean627 = false;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_151 = new Class119(44, 6);

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public static int anInt7225 = 0;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	public static int anInt7226 = 0;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)[Lclient!kr;")
	public static Class136[] method5645() {
		if (Static93.aClass136Array1 == null) {
			@Pc(9) Class136[] local9 = Static199.method3129(Static66.aClass143_2);
			@Pc(13) Class136[] local13 = new Class136[local9.length];
			@Pc(15) int local15 = 0;
			@Pc(64) int local64;
			@Pc(69) Class136 local69;
			label63: for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
				@Pc(22) Class136 local22 = local9[local17];
				if ((local22.anInt4113 <= 0 || local22.anInt4113 >= 24) && local22.anInt4114 >= 800 && local22.anInt4110 >= 600 && (Static286.anInt1448 >= 96 || Static105.anInt2382 != 0 || local22.anInt4114 <= 1024 && local22.anInt4110 <= 768)) {
					for (local64 = 0; local64 < local15; local64++) {
						local69 = local13[local64];
						if (local69.anInt4114 == local22.anInt4114 && local22.anInt4110 == local69.anInt4110) {
							if (local69.anInt4113 < local22.anInt4113) {
								local13[local64] = local22;
							}
							continue label63;
						}
					}
					local13[local15] = local22;
					local15++;
				}
			}
			Static93.aClass136Array1 = new Class136[local15];
			Static462.method4614(local13, 0, Static93.aClass136Array1, 0, local15);
			@Pc(128) int[] local128 = new int[Static93.aClass136Array1.length];
			for (local64 = 0; local64 < Static93.aClass136Array1.length; local64++) {
				local69 = Static93.aClass136Array1[local64];
				local128[local64] = local69.anInt4110 * local69.anInt4114;
			}
			Static71.method1403(local128, Static93.aClass136Array1);
		}
		return Static93.aClass136Array1;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public static void method5646() {
		Static210.method3247(false);
		if (Static167.anInt3389 >= 0 && Static167.anInt3389 != 0) {
			Static111.method1883(Static167.anInt3389);
			Static167.anInt3389 = -1;
		}
	}
}
