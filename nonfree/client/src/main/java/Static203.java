import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!uh;")
	public static Class178 aClass178_2;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public static int anInt3974;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public static int anInt3978;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt3980 = -1;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZII)V")
	public static void method3359(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static262.aLong210 = 0L;
		@Pc(13) int local13 = Static254.method4299();
		if (arg3 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (Static275.aString208.startsWith("mac") && arg3 > 0) {
			arg1 = true;
		}
		@Pc(33) boolean local33 = false;
		if (local13 > 0 != arg3 > 0) {
			local33 = true;
		}
		if (arg1 && arg3 > 0) {
			local33 = true;
		}
		Static167.method2792(arg1, local13, arg0, local33, arg3, arg2);
	}
}
