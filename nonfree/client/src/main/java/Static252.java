import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!ci;")
	public static Interface2 anInterface2_7;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "[I")
	public static int[] anIntArray352;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!nk;I)I", line = 5)
	public static int method4632(@OriginalArg(1) Class161 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method1406(arg0).method1856(arg1) && arg0.anObjectArray27 == null) {
			return -1;
		} else if (arg0.anIntArray279 == null || arg0.anIntArray279.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray279[arg1];
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILclient!kk;)Z", line = 129)
	public static boolean method4639(@OriginalArg(1) Class127 arg0) {
		return Class90.aClass127_8 == arg0 || Class24.aClass127_1 == arg0 || client.aClass127_2 == arg0 || Class39.aClass127_3 == arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)I", line = 485)
	public static int method4642(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
