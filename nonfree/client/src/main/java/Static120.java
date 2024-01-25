import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public static int anInt2728 = 0;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_39 = new Class173(39, 5);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z")
	public static boolean method2530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static448.method6946(arg0, arg1) || Static335.method5481(arg0, arg1);
	}
}
