import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static235 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public static int anInt8916 = 2;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!an;Lclient!an;Lclient!qa;B)V")
	public static void method7346(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class42 arg2) {
		Static186.aClass244_3 = Static173.method3438(Static208.anInt4588, arg1);
		Static340.aClass80_3 = arg2.method5850(Static186.aClass244_3, Static550.method895(arg0, Static208.anInt4588));
		Static267.aClass244_5 = Static173.method3438(Static206.anInt9617, arg1);
		Static56.aClass80_2 = arg2.method5850(Static267.aClass244_5, Static550.method895(arg0, Static206.anInt9617));
		Static445.aClass244_7 = Static173.method3438(Static461.anInt8356, arg1);
		Static12.aClass80_1 = arg2.method5850(Static445.aClass244_7, Static550.method895(arg0, Static461.anInt8356));
	}
}
