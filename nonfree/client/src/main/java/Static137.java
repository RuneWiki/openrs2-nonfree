import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!ik", name = "v", descriptor = "[Lclient!rg;")
	public static Class177[] aClass177Array1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IC)Z")
	public static boolean method2637(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!vk;I)Ljava/lang/String;")
	public static String method2638(@OriginalArg(0) Class1_Sub41 arg0) {
		return arg0.aString253 == null || arg0.aString253.length() <= 0 ? arg0.aString254 : arg0.aString254 + Static278.aString218 + arg0.aString253;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)I")
	public static int method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg1;
			arg1 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 7 + 1 - arg4 - arg2;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}
}
