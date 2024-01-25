import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "J")
	public static long aLong97;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!hm;I)Lclient!hm;")
	public static Class107 method2264(@OriginalArg(0) Class107 arg0) {
		@Pc(6) Class107 local6 = Static55.method771(arg0);
		if (local6 == null) {
			local6 = arg0.aClass107_6;
		}
		return local6;
	}
}
