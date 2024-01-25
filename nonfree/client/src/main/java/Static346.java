import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static346 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_50 = new Class277(260);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)Z")
	public static boolean method5755(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}
}
