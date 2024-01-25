import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!ou;")
	public static Class259 aClass259_1 = new Class259(8);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)Z")
	public static boolean method2759() {
		@Pc(10) Class2_Sub22 local10 = (Class2_Sub22) Static148.aClass70_6.method1264();
		if (local10 == null) {
			return false;
		}
		for (@Pc(22) int local22 = 0; local22 < local10.anInt3099; local22++) {
			if (local10.aClass5Array2[local22] != null && local10.aClass5Array2[local22].anInt151 == 0) {
				return false;
			}
			if (local10.aClass5Array1[local22] != null && local10.aClass5Array1[local22].anInt151 == 0) {
				return false;
			}
		}
		return true;
	}
}
