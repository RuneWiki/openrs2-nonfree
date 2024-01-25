import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!ha;")
	public static Class16 aClass16_11;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!gh;")
	public static Class118 aClass118_2;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
	public static boolean aBoolean407 = true;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_13 = new Class316(11, 0, 1, 2);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!oh;II)Lclient!hu;")
	public static Class21 method4648(@OriginalArg(0) Class237 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class21 local10 = (Class21) Static181.aClass236_31.method6242((long) arg1);
		if (local10 == null) {
			if (Static81.aBoolean186) {
				local10 = Static171.aClass16_5.method6135(Static647.method3299(arg0, arg1), true);
			} else {
				local10 = Static256.method3018(arg0.method6305(arg1));
			}
			Static181.aClass236_31.method6241((long) arg1, local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!s;)V")
	public static void method4650(@OriginalArg(0) int arg0, @OriginalArg(1) Class86 arg1) {
		Static34.aClass86Array5[arg0] = arg1;
	}
}
