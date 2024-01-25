import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static299 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!db;")
	public static final Class64 aClass64_259 = new Class64(26, 6);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII)Z")
	public static boolean method4652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
