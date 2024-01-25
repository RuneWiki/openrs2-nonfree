import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "Lclient!via;")
	public static final Class386 aClass386_11 = new Class386("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(IIII)I")
	public static int method9085(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(BII)Z")
	public static boolean method9086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static619.method8404(arg0, arg1) | (arg0 & 0x70000) != 0 || Static409.method6022(arg0, arg1);
	}
}
