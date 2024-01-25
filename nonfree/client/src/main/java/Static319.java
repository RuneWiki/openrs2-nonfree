import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public static int anInt5425 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Z")
	public static boolean method4694() {
		if (Static177.aBoolean120) {
			try {
				Static396.method1248(Static341.aClass162_5.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!se;)V")
	public static void method4695(@OriginalArg(1) Class1_Sub40 arg0) {
		if (!Static65.aBoolean115) {
			arg0.method5577();
			Static215.anInt3678--;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method4696(@OriginalArg(1) int arg0) {
		Static11.anInt3596 = arg0;
		Static374.aClass227_47.method4871();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	public static void method4697(@OriginalArg(1) int arg0) {
		@Pc(16) Class1_Sub6_Sub11 local16 = Static295.method4455(arg0, 1);
		local16.method2998();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method4698() {
		for (@Pc(14) Class41_Sub3 local14 = (Class41_Sub3) Static63.aClass208_8.method4661(); local14 != null; local14 = (Class41_Sub3) Static63.aClass208_8.method4663()) {
			local14.method2141();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	public static void method4699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 - arg0 >= Static372.anInt1561 && Static98.anInt1774 >= arg0 + arg1 && arg3 - arg0 >= Static194.anInt3448 && arg0 + arg3 <= Static264.anInt4589) {
			Static359.method5474(arg2, arg1, arg0, arg3);
		} else {
			Static29.method480(arg3, arg1, arg0, arg2);
		}
	}
}
