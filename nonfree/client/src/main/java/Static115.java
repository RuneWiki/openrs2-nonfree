import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "Lclient!wp;")
	public static Class380 aClass380_1 = new Class380();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Z")
	public static boolean method1890() {
		@Pc(12) Class6_Sub52 local12 = (Class6_Sub52) Static340.aClass8_37.method149();
		if (local12 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < local12.anInt10276; local18++) {
			if (local12.aClass328Array1[local18] != null && local12.aClass328Array1[local18].anInt9389 == 0) {
				return false;
			}
			if (local12.aClass328Array2[local18] != null && local12.aClass328Array2[local18].anInt9389 == 0) {
				return false;
			}
		}
		return true;
	}
}
