import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString16 = null;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "Lclient!vi;")
	public static final Class313 aClass313_1 = Static436.method6288();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZII)V")
	public static void method1431(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static7.method101();
		Static257.aLong118 = 0L;
		@Pc(10) int local10 = Static402.method6006();
		if (arg2 == 3 || local10 == 3) {
			arg1 = true;
		}
		if (!Static141.aClass13_27.method8114()) {
			arg1 = true;
		}
		Static261.method4310(arg1, arg0, arg3, arg2, local10);
	}
}
