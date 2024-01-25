import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!cga;")
	public static final Class50 aClass50_14 = new Class50();

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IBI)Z")
	public static boolean method7056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
