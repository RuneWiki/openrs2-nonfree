import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "Lclient!saa;")
	public static Class312 aClass312_1;

	@OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
	public static int anInt4475;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_30 = new Class165(128, 4);

	@OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
	public static int anInt4476 = 0;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Lclient!or;")
	public static Class260 method4101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class260 local17 = Static383.method5492(arg0);
		if (arg1 == -1) {
			return local17;
		} else if (local17 == null || local17.aClass260Array2 == null || arg1 >= local17.aClass260Array2.length) {
			return null;
		} else {
			return local17.aClass260Array2[arg1];
		}
	}
}
