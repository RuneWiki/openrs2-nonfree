import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_113 = new Class171(43, -2);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)Z")
	public static boolean method5939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static65.method1164(arg0, arg1) & Static435.method5966(arg1, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	public static int method5940() {
		if ((double) Static671.aFloat182 == 3.0D) {
			return 37;
		} else if ((double) Static671.aFloat182 == 4.0D) {
			return 50;
		} else if ((double) Static671.aFloat182 == 6.0D) {
			return 75;
		} else if ((double) Static671.aFloat182 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
