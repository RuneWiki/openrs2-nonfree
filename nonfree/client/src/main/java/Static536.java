import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!tda", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString103;

	@OriginalMember(owner = "client!tda", name = "A", descriptor = "Lclient!us;")
	public static final Class344 aClass344_113 = new Class344(56, -1);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!gaa;I)Lclient!gaa;")
	public static Class108 method7620(@OriginalArg(0) Class108 arg0) {
		@Pc(11) Class108 local11 = Static71.method1834(arg0);
		if (local11 == null) {
			local11 = arg0.aClass108_5;
		}
		return local11;
	}
}
