import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
	public static int anInt6832;

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
	public static int anInt6834;

	@OriginalMember(owner = "client!oga", name = "o", descriptor = "I")
	public static int anInt6845;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([BI)Z")
	public static boolean method6172(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub25 local8 = new Class3_Sub25(arg0);
		@Pc(12) int local12 = local8.method8632();
		if (local12 != 2) {
			return false;
		}
		@Pc(32) boolean local32 = local8.method8632() == 1;
		if (local32) {
			Static139.method2545(local8);
		}
		Static72.method1379(local8);
		return true;
	}
}
