import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!nca;")
	public static Class254 aClass254_161;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray38 = new boolean[8];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method8981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(B)Z")
	public static boolean method8982() {
		@Pc(10) Class2_Sub52 local10 = (Class2_Sub52) Static49.aClass60_17.method1226(7);
		if (local10 == null) {
			return false;
		}
		for (@Pc(24) int local24 = 0; local24 < local10.anInt9333; local24++) {
			if (local10.aClass163Array2[local24] != null && local10.aClass163Array2[local24].anInt3843 == 0) {
				return false;
			}
			if (local10.aClass163Array1[local24] != null && local10.aClass163Array1[local24].anInt3843 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(B)V")
	public static void method8984() {
		Static643.aClass85_65.method1748();
		Static533.aClass85_54.method1748();
		Static225.aClass85_23.method1748();
		Static524.aClass85_52.method1748();
	}
}
