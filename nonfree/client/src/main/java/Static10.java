import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "Lclient!ub;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
	public static int anInt114 = -1;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Lclient!eja;")
	public static Class89 method180(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static607.aClass89Array1[arg0] : null;
	}
}
