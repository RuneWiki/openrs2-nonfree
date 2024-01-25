import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "[Lclient!mu;")
	public static Class192[] aClass192Array1;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt1856;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!dn;")
	public static Class69 aClass69_22;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Z")
	public static boolean method1792(@OriginalArg(0) int arg0) {
		for (@Pc(15) Class1_Sub25 local15 = (Class1_Sub25) Static105.aClass295_10.method7543(); local15 != null; local15 = (Class1_Sub25) Static105.aClass295_10.method7540()) {
			if (Static459.method7010(local15.anInt4365) && (long) arg0 == local15.aLong114) {
				return true;
			}
		}
		return false;
	}
}
