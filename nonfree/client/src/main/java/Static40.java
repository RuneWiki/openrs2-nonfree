import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bha", name = "i", descriptor = "Lclient!eq;")
	public static Class97 aClass97_5;

	@OriginalMember(owner = "client!bha", name = "j", descriptor = "Lclient!rr;")
	public static final Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIZ)Z")
	public static boolean method837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(BLclient!dm;)Lclient!dm;")
	public static Class78 method838(@OriginalArg(1) Class78 arg0) {
		@Pc(11) Class78 local11 = Static69.method1325(arg0);
		if (local11 == null) {
			local11 = arg0.aClass78_3;
		}
		return local11;
	}
}
