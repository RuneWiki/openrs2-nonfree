import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
	public static int anInt8023 = -1;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "([BI)Z")
	public static boolean method6717(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub29 local8 = new Class2_Sub29(arg0);
		@Pc(12) int local12 = local8.method5170();
		if (local12 != 2) {
			return false;
		}
		@Pc(26) boolean local26 = local8.method5170() == 1;
		if (local26) {
			Static105.method1940(local8);
		}
		Static77.method1567(local8);
		return true;
	}
}
