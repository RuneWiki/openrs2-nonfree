import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_57 = new Class288(4);

	@OriginalMember(owner = "client!sc", name = "z", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_67 = new Class99();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!oh;I)Lclient!oh;")
	public static Class220 method6279(@OriginalArg(0) Class220 arg0) {
		@Pc(6) Class220 local6 = Static68.method1286(arg0);
		if (local6 == null) {
			local6 = arg0.aClass220_15;
		}
		return local6;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)Z")
	public static boolean method6281(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}
}
