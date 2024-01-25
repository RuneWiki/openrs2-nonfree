import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
	public static int anInt3669;

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
	public static int anInt3664 = 0;

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_63 = new Class237(102, -2);

	@OriginalMember(owner = "client!jt", name = "Z", descriptor = "Lclient!gu;")
	public static Class100 aClass100_4 = null;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)Z")
	public static boolean method3066(@OriginalArg(0) int arg0) {
		if (arg0 == 60 || arg0 == 11 || arg0 == 47 || arg0 == 58 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1003;
		}
	}
}
