import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "[I")
	public static int[] anIntArray597;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIILclient!rg;I)V")
	public static void method4251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class177 arg5, @OriginalArg(7) int arg6) {
		if (Static223.aBoolean375) {
			Static153.anInt3078 = 32;
		} else {
			Static153.anInt3078 = 0;
		}
		Static223.aBoolean375 = false;
		@Pc(141) int local141;
		if (Static151.anInt3836 != 0) {
			if (arg4 >= arg2 && arg2 + 16 > arg4 && arg6 <= arg3 && arg6 + 16 > arg3) {
				arg5.anInt5182 -= 4;
				Static133.method2517(arg5);
			} else if (arg4 >= arg2 && arg4 < arg2 + 16 && arg1 + arg6 - 16 <= arg3 && arg3 < arg1 + arg6) {
				arg5.anInt5182 += 4;
				Static133.method2517(arg5);
			} else if (arg4 >= arg2 - Static153.anInt3078 && Static153.anInt3078 + arg2 + 16 > arg4 && arg6 + 16 <= arg3 && arg1 + arg6 - 16 > arg3) {
				local141 = (arg1 - 32) * arg1 / arg0;
				if (local141 < 8) {
					local141 = 8;
				}
				@Pc(156) int local156 = arg3 - arg6 - local141 / 2 - 16;
				@Pc(163) int local163 = arg1 - local141 - 32;
				arg5.anInt5182 = local156 * (arg0 - arg1) / local163;
				Static133.method2517(arg5);
				Static223.aBoolean375 = true;
			}
		}
		if (Static325.anInt4689 == 0) {
			return;
		}
		local141 = arg5.anInt5179;
		if (arg4 >= arg2 - local141 && arg3 >= arg6 && arg2 + 16 > arg4 && arg6 + arg1 >= arg3) {
			arg5.anInt5182 += Static325.anInt4689 * 45;
			Static133.method2517(arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Object;Lclient!kq;B)V")
	public static void method4252(@OriginalArg(0) Object arg0, @OriginalArg(1) Class110 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg1.anEventQueue1.peekEvent() != null; local15++) {
			Static134.method2598(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
