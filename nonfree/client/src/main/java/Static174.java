import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lj", name = "sb", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IJ[II)Ljava/lang/String;")
	public static String method3465(@OriginalArg(1) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static84.anInterface6_1 != null) {
			@Pc(17) String local17 = Static84.anInterface6_1.method908(arg2, arg1, arg0);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg0);
	}
}
