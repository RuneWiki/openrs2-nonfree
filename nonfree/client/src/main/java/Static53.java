import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!ha;")
	public static Class25 aClass25_4;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!jc;")
	public static final Class155 aClass155_1 = new Class155("stellardawn", 1);

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "[I")
	public static int[] anIntArray154 = new int[2];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public static boolean method1104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static505.method6629(arg1, arg0) || Static404.method5867(arg0, arg1);
	}
}
