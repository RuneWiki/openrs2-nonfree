import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "[I")
	public static final int[] anIntArray689 = new int[32];

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_99 = new Class306("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "S")
	public static short aShort119 = 32767;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
	public static void method5995() {
		if (Static170.anInt3050 == -1) {
			return;
		}
		@Pc(12) int local12 = Static498.aClass5_1.method7052();
		@Pc(16) int local16 = Static498.aClass5_1.method7042();
		@Pc(21) Class1_Sub13 local21 = (Class1_Sub13) Static22.aClass37_50.method977();
		if (local21 != null) {
			local12 = local21.method5737();
			local16 = local21.method5742();
		}
		Static320.method4985(Static83.anInt1567, 0, local16, 0, Static350.anInt6255, 0, local12, Static170.anInt3050, 0);
		if (Static287.aClass156_13 != null) {
			Static315.method4922(local12, local16);
		}
	}
}
