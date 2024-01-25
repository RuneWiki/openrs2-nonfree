import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aca", name = "c", descriptor = "Lclient!np;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
	public static int anInt62 = -1;

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)Z")
	public static boolean method93(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class3_Sub1_Sub4 local18 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local18 != null; local18 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
			if (Static438.method6668(local18.anInt3485) && (long) arg0 == local18.aLong74) {
				return true;
			}
		}
		return false;
	}
}
