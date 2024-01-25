import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString197 = "Loading sprites - ";

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[8];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
	public static String method2686(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static320.anInterface4_1 != null) {
			@Pc(20) String local20 = Static320.anInterface4_1.method1629(arg1, arg0, arg2);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}
}
