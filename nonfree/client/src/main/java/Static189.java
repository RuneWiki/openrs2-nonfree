import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public static int anInt3460;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_122 = new Class67(21, -2);

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IB)Z")
	public static boolean method2734(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 2 || arg0 == 59 || arg0 == 49 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1006;
		}
	}
}
