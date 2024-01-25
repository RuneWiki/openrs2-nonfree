import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static494 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	public static int anInt7987;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public static int anInt7988;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public static int anInt7989 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!mj;II)Ljava/lang/String;")
	public static String method6913(@OriginalArg(0) Class238 arg0, @OriginalArg(2) int arg1) {
		if (!Static73.method1209(arg0).method1970(arg1) && arg0.anObjectArray33 == null) {
			return null;
		} else if (arg0.aStringArray28 == null || arg0.aStringArray28.length <= arg1 || arg0.aStringArray28[arg1] == null || arg0.aStringArray28[arg1].trim().length() == 0) {
			return Static628.aBoolean710 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray28[arg1];
		}
	}
}
