import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZLclient!sm;)V")
	public static void method4591(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub49 arg1) {
		if (arg1.aBoolean665) {
			if (arg1.anInt8926 < 0 || Static512.method7236(arg1.anInt8932, arg1.anInt8926)) {
				if (arg0) {
					Static326.method5077(arg1.anInt8928, arg1.anInt8927, arg1.anInt8924, arg1.anInt8929, (Class81) null);
				} else {
					Static551.method7574(arg1.anInt8932, arg1.anInt8923, arg1.anInt8928, arg1.anInt8929, arg1.anInt8927, arg1.anInt8924, -1, arg1.anInt8926);
				}
				arg1.method8770();
			}
		} else if (arg1.aBoolean664 && arg1.anInt8929 >= 1 && arg1.anInt8924 >= 1 && Static251.anInt4680 - 2 >= arg1.anInt8929 && Static406.anInt6924 - 2 >= arg1.anInt8924 && (arg1.anInt8934 < 0 || Static512.method7236(arg1.anInt8925, arg1.anInt8934))) {
			if (arg0) {
				Static326.method5077(arg1.anInt8928, arg1.anInt8927, arg1.anInt8924, arg1.anInt8929, arg1.aClass81_1);
			} else {
				Static551.method7574(arg1.anInt8925, arg1.anInt8922, arg1.anInt8928, arg1.anInt8929, arg1.anInt8927, arg1.anInt8924, -1, arg1.anInt8934);
			}
			arg1.aBoolean664 = false;
			if (!arg0 && arg1.anInt8934 == arg1.anInt8926 && arg1.anInt8926 == -1) {
				arg1.method8770();
			} else if (!arg0 && arg1.anInt8934 == arg1.anInt8926 && arg1.anInt8922 == arg1.anInt8923 && arg1.anInt8932 == arg1.anInt8925) {
				arg1.method8770();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!lu;Ljava/lang/Object;)V")
	public static void method4593(@OriginalArg(1) Class231 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static365.method3472(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
