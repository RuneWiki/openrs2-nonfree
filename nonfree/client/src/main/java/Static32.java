import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
	public static int anInt3683;

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
	public static int anInt3682 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIIIIIZ)V")
	public static void method3141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 < 1 || arg5 < 1 || arg2 > Static92.anInt2048 - 2 || arg5 > Static290.anInt5893 - 2) {
			return;
		}
		if (!Static313.method5257() && !Static213.method3693(arg5, arg3, Static45.anInt5654, arg2)) {
			return;
		}
		if (Static18.aClass57ArrayArrayArray1 == null) {
			return;
		}
		@Pc(52) int local52 = arg3;
		if (arg3 < 3 && Static288.method4932(arg5, arg2)) {
			local52 = arg3 + 1;
		}
		Static247.method4271(Static164.aClass92_7, local52, arg2, arg0, Static345.aClass174Array1[arg3], arg5, arg3);
		if (arg7 < 0) {
			return;
		}
		@Pc(79) boolean local79 = Static135.aBoolean261;
		Static135.aBoolean261 = true;
		Static46.method880(false, arg5, arg2, local52, false, arg4, Static345.aClass174Array1[arg3], arg7, arg6, arg3, Static164.aClass92_7, arg1);
		Static135.aBoolean261 = local79;
		return;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method3142(@OriginalArg(1) int arg0) {
		@Pc(21) Class4_Sub1_Sub8 local21 = Static155.method2994(arg0, 4);
		local21.method2034();
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)V")
	public static void method3145(@OriginalArg(0) int arg0) {
		Static288.anInt5842 = arg0;
		@Pc(7) Class154 local7 = Static108.aClass154_36;
		synchronized (Static108.aClass154_36) {
			Static108.aClass154_36.method4219();
		}
		local7 = Static202.aClass154_69;
		synchronized (Static202.aClass154_69) {
			Static202.aClass154_69.method4219();
		}
	}
}
