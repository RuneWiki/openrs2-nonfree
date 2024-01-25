import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static428 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_183 = new Class131(50, -1);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Z")
	public static boolean method5726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static133.method1904(arg1, arg0) & Static289.method4077(arg0, arg1);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)Z")
	public static boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
