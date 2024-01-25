import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	public static int anInt7304;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public static int anInt7307;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_119 = new Class171(107, -2);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)I")
	public static int method6126(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static471.anInt7481;
		if (local10 == 0) {
			return arg0 ? 0 : Static117.anInt2122;
		} else if (local10 == 1) {
			return Static117.anInt2122;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
