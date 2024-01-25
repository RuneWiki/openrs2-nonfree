import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
	public static int anInt6562;

	@OriginalMember(owner = "client!ue", name = "O", descriptor = "B")
	public static byte aByte94;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "[I")
	public static final int[] anIntArray516 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!pc;Ljava/lang/Object;B)V")
	public static void method5319(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < 50 && arg0.anEventQueue1.peekEvent() != null; local25++) {
			Static435.method5777(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class4_Sub18 local7 = null;
		for (@Pc(17) Class4_Sub18 local17 = (Class4_Sub18) Static342.aClass244_34.method5263(); local17 != null; local17 = (Class4_Sub18) Static342.aClass244_34.method5271()) {
			if (local17.anInt3036 == arg1 && arg4 == local17.anInt3037 && local17.anInt3031 == arg6 && local17.anInt3028 == arg0) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub18();
			local7.anInt3037 = arg4;
			local7.anInt3036 = arg1;
			local7.anInt3031 = arg6;
			local7.anInt3028 = arg0;
			if (arg4 >= 0 && arg6 >= 0 && Static337.anInt5497 > arg4 && arg6 < Static282.anInt4644) {
				Static174.method2446(local7);
			}
			Static342.aClass244_34.method5273(local7);
		}
		local7.anInt3034 = 0;
		local7.anInt3038 = arg5;
		local7.anInt3032 = -1;
		local7.anInt3042 = arg3;
		local7.anInt3035 = arg2;
	}
}
