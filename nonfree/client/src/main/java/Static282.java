import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "Lclient!km;")
	public static Class91 aClass91_198;

	@OriginalMember(owner = "client!vj", name = "h", descriptor = "Z")
	public static boolean aBoolean424 = true;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z")
	public static boolean method4244() {
		if (Static55.aBoolean85) {
			try {
				Static309.method3982(Static253.aClass175_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(15) Throwable local15) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIIIILclient!bo;)V")
	public static void method4246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class14_Sub2 arg5) {
		Static238.method3083(arg1, arg4, arg2, arg5.anInt4630, arg5.anInt4680, arg0, arg3);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V")
	public static void method4247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static270.anInt5273; local7++) {
			if (Static55.anIntArray127[local7] + Static189.anIntArray351[local7] > arg2 && Static55.anIntArray127[local7] < arg2 + arg3 && arg0 < Static62.anIntArray136[local7] + Static215.anIntArray382[local7] && arg1 + arg0 > Static62.anIntArray136[local7]) {
				Static78.aBooleanArray17[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method4248(@OriginalArg(0) Class91 arg0) {
		Static150.aClass91_118 = arg0;
	}
}
