import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static558 {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
	public static int anInt9167;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_7 = new Class258("LOCAL", 4);

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray176 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Z")
	public static boolean method7614(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
