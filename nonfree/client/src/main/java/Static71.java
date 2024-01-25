import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
	public static int anInt1577;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	public static int anInt1572 = 0;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!em;)Lclient!em;")
	public static Class68 method1332(@OriginalArg(1) Class68 arg0) {
		if (arg0.anInt2221 != -1) {
			return Static165.method2704(arg0.anInt2221);
		}
		@Pc(24) int local24 = arg0.anInt2229 >>> 16;
		@Pc(29) Class15 local29 = new Class15(Static113.aClass163_11);
		for (@Pc(34) Class2_Sub35 local34 = (Class2_Sub35) local29.method314(); local34 != null; local34 = (Class2_Sub35) local29.method317()) {
			if (local24 == local34.anInt5537) {
				return Static165.method2704((int) local34.aLong227);
			}
		}
		return null;
	}
}
