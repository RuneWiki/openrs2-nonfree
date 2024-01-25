import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "Lclient!qu;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class180 local13 = local7.aClass180_3; local13 != null; local13 = local13.aClass180_2) {
			@Pc(17) Class12_Sub2_Sub1 local17 = local13.aClass12_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort120 == arg1 && local17.aShort121 == arg2) {
				Static153.method2102(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
	public static void method5577() {
		Static417.aFont4 = null;
		Static290.anImage12 = null;
	}
}
