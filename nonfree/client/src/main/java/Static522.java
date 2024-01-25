import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static522 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_153 = new Class319(53, -1);

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_205 = new Class81(43, 8);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!wv;IB)Ljava/lang/String;")
	public static String method7127(@OriginalArg(0) Class365 arg0, @OriginalArg(1) int arg1) {
		if (!Static72.method1565(arg0).method4810(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray42 == null || arg1 >= arg0.aStringArray42.length || arg0.aStringArray42[arg1] == null || arg0.aStringArray42[arg1].trim().length() == 0) {
			return Static484.aBoolean581 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray42[arg1];
		}
	}
}
