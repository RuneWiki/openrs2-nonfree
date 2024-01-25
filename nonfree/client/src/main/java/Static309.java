import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_7 = new Class342(10, 2, 2, 0);

	@OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
	public static int anInt5671 = 0;

	@OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
	public static int anInt5674 = 0;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4875(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + Static124.method2555(arg0.charAt(local19)) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)Z")
	public static boolean method4877(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
