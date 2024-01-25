import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
	public static int anInt7886;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public static int anInt7888;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public static int anInt7889;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!gga;")
	public static Class124 aClass124_86;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_78 = new Class341(72, 11);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIZI)I")
	public static int method7050(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub42 local8 = Static47.method979(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && local8.anIntArray350.length > arg2) {
			return local8.anIntArray350[arg2];
		} else {
			return -1;
		}
	}
}
