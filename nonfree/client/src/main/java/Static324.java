import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qm", name = "M", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_112 = new Class92(68, 3);

	@OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
	public static int anInt5590 = 100;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B[B)Z")
	public static boolean method4674(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class6_Sub1 local13 = new Class6_Sub1(arg0);
		@Pc(17) int local17 = local13.method6433();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method6433() == 1;
		if (local33) {
			Static83.method1567(local13);
		}
		Static303.method4481(local13);
		return true;
	}
}
