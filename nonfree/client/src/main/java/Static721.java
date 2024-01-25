import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static721 {

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
	public static int anInt3584;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	public static int anInt3580 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILclient!av;)Ljava/lang/String;")
	public static String method3074(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		if (!Static87.method1164(arg1).method4620(arg0) && arg1.anObjectArray30 == null) {
			return null;
		} else if (arg1.aStringArray2 == null || arg1.aStringArray2.length <= arg0 || arg1.aStringArray2[arg0] == null || arg1.aStringArray2[arg0].trim().length() == 0) {
			return Static632.aBoolean738 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray2[arg0];
		}
	}
}
