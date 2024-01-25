import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "Lclient!kf;")
	public static Class198 aClass198_7;

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
	public static int anInt6287 = 0;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)Z")
	public static boolean method5283() {
		@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static608.aClass124_98.method2572();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt9816; local16++) {
			if (local10.aClass297Array1[local16] != null && local10.aClass297Array1[local16].anInt8459 == 0) {
				return false;
			}
			if (local10.aClass297Array2[local16] != null && local10.aClass297Array2[local16].anInt8459 == 0) {
				return false;
			}
		}
		return true;
	}
}
