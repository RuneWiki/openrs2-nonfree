import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	public static final int anInt1035 = Static373.method6080(1600);

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	public static int anInt1041 = 0;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
	public static int anInt1043 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Z")
	public static boolean method1121(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub40 local8 = (Class3_Sub40) Static342.aClass183_44.method4795(); local8 != null; local8 = (Class3_Sub40) Static342.aClass183_44.method4793()) {
			if (Static566.method8142(local8.anInt7324) && (long) arg0 == local8.aLong191) {
				return true;
			}
		}
		return false;
	}
}
