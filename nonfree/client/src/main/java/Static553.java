import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!su", name = "s", descriptor = "F")
	public static float aFloat191;

	@OriginalMember(owner = "client!su", name = "cb", descriptor = "Lclient!wm;")
	public static Class390 aClass390_109;

	@OriginalMember(owner = "client!su", name = "Y", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_211 = new Class359(101, 6);

	@OriginalMember(owner = "client!su", name = "db", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_57 = new Class340(4);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)I")
	public static int method7675(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZII)I")
	public static int method7676(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static184.method3077(arg0 + 91923, 4, arg1 + 45365) + (Static184.method3077(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static184.method3077(arg0, 1, arg1) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}
}
