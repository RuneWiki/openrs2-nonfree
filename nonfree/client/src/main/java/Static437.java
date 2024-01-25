import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "[Lclient!cu;")
	public static Class50_Sub1[] aClass50_Sub1Array1;

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_20 = new Class33(3, 7);

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)I")
	public static int method6400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(43) int local43 = Static426.method6324(arg1 - 1, arg0 + -1) + Static426.method6324(arg1 - 1, arg0 - -1) + Static426.method6324(arg1 + 1, arg0 + -1) + Static426.method6324(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static426.method6324(arg1, arg0 - 1) + Static426.method6324(arg1, arg0 + 1) + Static426.method6324(arg1 - 1, arg0) + Static426.method6324(arg1 + 1, arg0);
		@Pc(80) int local80 = Static426.method6324(arg1, arg0);
		return local80 / 4 + local43 / 16 + local75 / 8;
	}
}
