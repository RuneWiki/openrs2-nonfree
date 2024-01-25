import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Lclient!d;")
	public static Class16[] aClass16Array2;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "Lclient!jv;")
	public static final Class182 aClass182_2 = new Class182("", 11);

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "Lclient!db;")
	public static final Class64 aClass64_102 = new Class64(14, -2);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILclient!gba;)Lclient!gba;")
	public static Class115 method2320(@OriginalArg(1) Class115 arg0) {
		@Pc(6) Class115 local6 = Static69.method1234(arg0);
		if (local6 == null) {
			local6 = arg0.aClass115_8;
		}
		return local6;
	}
}
