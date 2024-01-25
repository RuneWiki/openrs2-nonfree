import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static146 {

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	public static int anInt2428;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_37 = new Class187(9, -1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
	public static boolean method2196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!nh;")
	public static Class243 method2198() {
		return new Class243(1, false);
	}
}
