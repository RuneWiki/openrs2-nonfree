import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
	public static int anInt9820;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	public static int anInt9821;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_112 = new Class387(72, 3);

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	public static int anInt9819 = 0;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)Lclient!aha;")
	public static Class12 method8432(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static268.aClass12Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method8437(@OriginalArg(0) String arg0) {
		return Static648.aHashtable14.containsKey(arg0);
	}
}
