import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_97 = new Class180(105, 8);

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)Z")
	public static boolean method4118(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IBI)I")
	public static int method4121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < arg0) {
			@Pc(10) int local10 = arg1;
			arg1 = arg0;
			arg0 = local10;
		}
		while (arg0 != 0) {
			@Pc(32) int local32 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local32;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4122(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}
}
