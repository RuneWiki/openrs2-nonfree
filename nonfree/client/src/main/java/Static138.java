import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!raa;IZI)V")
	public static void method2020(@OriginalArg(0) Class295 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static2.aClass295_1 = arg0;
		Static494.anInt8308 = arg2;
		Static338.anInt5733 = arg1;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!fc;ILjava/lang/Object;)V")
	public static void method2021(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static314.method4821(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I")
	public static int method2022() {
		if (Static323.aFrame2 == null) {
			return Static384.aBoolean456 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIILclient!mj;)V")
	public static void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub2 arg3) {
		@Pc(4) Class217 local4 = Static411.method6333(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub2_1 = arg3;
		@Pc(16) int local16 = Static11.aClass61Array1 == Static456.aClass61Array3 ? 1 : 0;
		if (arg3.method8733()) {
			if (arg3.method8727()) {
				arg3.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local16];
				Static457.aClass4_Sub2Array4[local16] = arg3;
				return;
			}
			arg3.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local16];
			Static79.aClass4_Sub2Array1[local16] = arg3;
			Static28.aBoolean15 = true;
			return;
		}
		arg3.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local16];
		Static243.aClass4_Sub2Array2[local16] = arg3;
	}
}
