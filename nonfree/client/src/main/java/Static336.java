import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_76 = new Class84("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!r", name = "q", descriptor = "[S")
	public static final short[] aShortArray81 = new short[] { 44, 18, 30, 10, 4, 12, 17, 6 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method4677() {
		for (@Pc(12) int local12 = 0; local12 < Static150.aClass33ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static150.aClass33ArrayArray1[local12].length; local16++) {
				Static150.aClass33ArrayArray1[local12][local16] = Static303.aClass33_2;
			}
		}
	}
}
