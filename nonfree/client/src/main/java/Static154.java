import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "Lclient!r;")
	public static Class7 aClass7_9;

	@OriginalMember(owner = "client!fv", name = "i", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array2;

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[100];

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!nr;)V")
	public static void method2624(@OriginalArg(1) Class4_Sub21 arg0) {
		arg0.aBoolean567 = false;
		if (arg0.aClass4_Sub42_5 != null) {
			arg0.aClass4_Sub42_5.anInt9490 = 0;
		}
		for (@Pc(18) Class4_Sub21 local18 = arg0.method6157(); local18 != null; local18 = arg0.method6162()) {
			method2624(local18);
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method2625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg5 + arg1;
		@Pc(18) int local18 = arg0 + arg3;
		@Pc(22) int local22 = arg4 + arg2;
		if (!Static526.method7452(local18, local18, local22, local14, local22, arg2, arg5, local18, arg5)) {
			return false;
		} else if (Static526.method7452(local18, local18, arg2, local14, local22, arg2, local14, local18, arg5)) {
			if (arg5 < Static184.anInt3856) {
				if (!Static526.method7452(local18, arg3, arg2, arg5, local22, local22, arg5, local18, arg5)) {
					return false;
				}
				if (!Static526.method7452(arg3, arg3, arg2, arg5, arg2, local22, arg5, local18, arg5)) {
					return false;
				}
			} else if (!Static526.method7452(local18, arg3, arg2, local14, local22, local22, local14, local18, local14)) {
				return false;
			} else if (!Static526.method7452(arg3, arg3, arg2, local14, arg2, local22, local14, local18, local14)) {
				return false;
			}
			if (Static515.anInt4127 > arg2) {
				if (!Static526.method7452(local18, arg3, arg2, local14, arg2, arg2, arg5, local18, arg5)) {
					return false;
				}
				if (!Static526.method7452(arg3, arg3, arg2, local14, arg2, arg2, local14, local18, arg5)) {
					return false;
				}
			} else if (!Static526.method7452(local18, arg3, local22, local14, local22, local22, arg5, local18, arg5)) {
				return false;
			} else if (!Static526.method7452(arg3, arg3, local22, local14, local22, local22, local14, local18, arg5)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
