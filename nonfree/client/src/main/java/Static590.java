import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_272 = new Class272(87, 8);

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
	public static int anInt9377 = 0;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "Z")
	public static boolean aBoolean729 = false;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)Z")
	public static boolean method7774() {
		@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) Static511.aClass130_51.method3543();
		if (local12 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < local12.anInt691; local18++) {
			if (local12.aClass192Array2[local18] != null && local12.aClass192Array2[local18].anInt5186 == 0) {
				return false;
			}
			if (local12.aClass192Array1[local18] != null && local12.aClass192Array1[local18].anInt5186 == 0) {
				return false;
			}
		}
		return true;
	}
}
