import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static578 {

	@OriginalMember(owner = "client!we", name = "j", descriptor = "J")
	public static long aLong263;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "[I")
	public static final int[] anIntArray542 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_119 = new Class173(24, 7);

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Z")
	public static boolean method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static394.method6254(arg0, arg1) || Static485.method7231(arg0, arg1);
	}
}
