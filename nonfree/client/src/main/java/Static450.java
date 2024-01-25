import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static450 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_15 = new Class31(0, 2, 2, 1);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z")
	public static boolean method6420(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
