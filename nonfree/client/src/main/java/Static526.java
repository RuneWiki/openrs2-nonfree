import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!us", name = "f", descriptor = "Lclient!vw;")
	public static final Class340 aClass340_14 = new Class340();

	@OriginalMember(owner = "client!us", name = "h", descriptor = "I")
	public static final int anInt9120 = 2;

	@OriginalMember(owner = "client!us", name = "i", descriptor = "Z")
	public static boolean aBoolean687 = true;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILjava/lang/String;ZLclient!ta;)V")
	public static void method7658(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class73 arg2) {
		@Pc(20) int local20 = Static387.aClass82_9.method2287(arg0, 250, null);
		@Pc(29) int local29 = Static387.aClass82_9.method2288(null, 250, arg0) * 13;
		Static323.aClass9_8.C(6, 6, local20 + 8, local29 + 4 + 4, -16777216, 0);
		Static323.aClass9_8.method5436(6, 6, local20 + 4 + 4, local29 + 8, -1, 0);
		arg2.method7891(0, 10, -1, null, 0, local29, 1, 10, -1, 1, arg0, local20, null, null);
		Static550.method7860(local20 + 4 + 4, 6, local29 + 4 + 4, 6);
		if (arg1) {
			try {
				Static323.aClass9_8.method5411();
			} catch (@Pc(120) Exception_Sub1 local120) {
			}
		}
	}
}
