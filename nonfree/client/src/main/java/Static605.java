import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
	public static int anInt10972;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Lclient!dl;")
	public static Class2_Sub14 aClass2_Sub14_11;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)Z")
	public static boolean method9166() {
		@Pc(10) Class2_Sub10 local10 = (Class2_Sub10) Static489.aClass341_58.method8524();
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt1927; local24++) {
			if (local10.aClass240Array2[local24] != null && local10.aClass240Array2[local24].anInt7566 == 0) {
				return false;
			}
			if (local10.aClass240Array1[local24] != null && local10.aClass240Array1[local24].anInt7566 == 0) {
				return false;
			}
		}
		return true;
	}
}
