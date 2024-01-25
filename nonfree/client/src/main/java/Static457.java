import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!rj", name = "t", descriptor = "Lclient!vo;")
	public static Class348 aClass348_107;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "Lclient!gd;")
	public static final Class120 aClass120_9 = new Class120();

	@OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
	public static int anInt8737 = -2;

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "Lclient!eq;")
	public static final Class96 aClass96_7 = new Class96();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!wv;Ljava/lang/Object;B)V")
	public static void method6720(@OriginalArg(0) Class366 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static214.method3478(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(42) Exception local42) {
		}
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)V")
	public static void method6721() {
		for (@Pc(12) int local12 = 0; local12 < Static399.anInt7806; local12++) {
			@Pc(18) Class185 local18 = Static256.aClass185Array1[local12];
			if (local18.aByte94 == 3) {
				if (local18.aClass4_Sub21_Sub2_1 == null) {
					local18.anInt5795 = Integer.MIN_VALUE;
				} else {
					Static472.aClass4_Sub21_Sub3_2.method5931(local18.aClass4_Sub21_Sub2_1);
				}
			}
		}
	}
}
