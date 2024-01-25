import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!ua;")
	public static final Class358 aClass358_10 = new Class358(2);

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
	public static int anInt4744 = -50;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	public static final int anInt4745 = 1408;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public static void method4311(@OriginalArg(0) int arg0) {
		Static579.anInt9037 = arg0;
		@Pc(7) Class168 local7 = Static630.aClass168_93;
		synchronized (Static630.aClass168_93) {
			Static630.aClass168_93.method3862();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static230.anInt3962 <= arg3 && arg0 <= Static463.anInt7530 && arg5 >= Static573.anInt8986 && arg6 <= Static319.anInt5445) {
			Static72.method1168(arg4, arg5, arg3, arg1, arg2, arg6, arg0);
		} else {
			Static355.method5210(arg1, arg5, arg0, arg6, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!tga;Ljava/lang/Object;I)V")
	public static void method4313(@OriginalArg(0) Class349 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg0.anEventQueue1.peekEvent() != null; local12++) {
			Static620.method7045(-4, 1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(57) Exception local57) {
		}
	}
}
