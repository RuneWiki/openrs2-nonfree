import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gca", name = "G", descriptor = "I")
	public static int anInt3278;

	@OriginalMember(owner = "client!gca", name = "I", descriptor = "I")
	public static int anInt3280;

	@OriginalMember(owner = "client!gca", name = "J", descriptor = "[Lclient!ub;")
	public static Class1_Sub4[] aClass1_Sub4Array1;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
	public static int anInt3275 = 0;

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "(I)Z")
	public static boolean method2934() {
		@Pc(15) Class4_Sub23 local15 = (Class4_Sub23) Static410.aClass244_54.method5963();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt4040; local21++) {
			if (local15.aClass234Array2[local21] != null && local15.aClass234Array2[local21].anInt6717 == 0) {
				return false;
			}
			if (local15.aClass234Array1[local21] != null && local15.aClass234Array1[local21].anInt6717 == 0) {
				return false;
			}
		}
		return true;
	}
}
