import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!hn;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "Lclient!th;")
	public static Class168 aClass168_116;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!ta;")
	public static Class162 aClass162_6 = new Class162(128);

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public static volatile int anInt3508 = -1;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2549(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = Static216.method3452(Static247.method3809(arg0));
		if (local11 == null) {
			local11 = "";
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)I")
	public static int method2550(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
