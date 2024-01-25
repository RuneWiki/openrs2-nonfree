import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public static int anInt4330;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Z")
	public static boolean aBoolean353 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIII)V")
	public static void method3998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg4; local7++) {
			Static160.method2840(arg0, arg2, arg1, Static129.anIntArrayArray46[local7]);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BI)V")
	public static void method3999(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub1_Sub2 local13 = Static166.method3027(arg0, 14);
		local13.method856();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!cd;B)V")
	public static void method4000(@OriginalArg(0) Class32_Sub1 arg0) {
		arg0.aClass4_Sub5_Sub2_1 = null;
		if (Static187.anInt3709 < 20) {
			Static343.aClass39_7.method809(arg0);
			Static187.anInt3709++;
		}
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Lclient!ae;")
	public static Class6_Sub1 method4001() {
		Static274.anInt5446 = 0;
		return Static208.method3803();
	}
}
