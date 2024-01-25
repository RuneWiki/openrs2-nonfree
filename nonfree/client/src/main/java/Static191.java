import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt3979;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array4;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	public static int anInt3980;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_28 = new Class344(29, 11);

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[I")
	public static final int[] anIntArray188 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	public static boolean method3142() {
		@Pc(10) Class4_Sub10 local10 = (Class4_Sub10) Static438.aClass22_55.method895();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt2313; local24++) {
			if (local10.aClass316Array2[local24] != null && local10.aClass316Array2[local24].anInt9478 == 0) {
				return false;
			}
			if (local10.aClass316Array1[local24] != null && local10.aClass316Array1[local24].anInt9478 == 0) {
				return false;
			}
		}
		return true;
	}
}
