import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Lclient!o;")
	public static final Class234 aClass234_1 = new Class234();

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)Z")
	public static boolean method743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
