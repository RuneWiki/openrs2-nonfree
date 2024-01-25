import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
	public static boolean aBoolean22;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public static int anInt249 = -1;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	public static int anInt252 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	public static void method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static50.method919(local7.aClass4_Sub3_Sub1_1);
		Static50.method919(local7.aClass4_Sub3_Sub1_2);
		if (local7.aClass4_Sub3_Sub1_1 != null) {
			local7.aClass4_Sub3_Sub1_1 = null;
		}
		if (local7.aClass4_Sub3_Sub1_2 != null) {
			local7.aClass4_Sub3_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!iha;)V")
	public static void method294(@OriginalArg(1) Object arg0, @OriginalArg(2) Class173 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 50 && arg1.anEventQueue1.peekEvent() != null; local17++) {
			Static548.method7968(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 < 1 || arg0 < 1 || arg6 > Static380.anInt6689 - 2 || Static542.anInt9214 - 2 < arg0) {
			return;
		}
		@Pc(39) int local39 = arg7;
		if (arg7 < 3 && Static551.method7974(arg6, arg0)) {
			local39 = arg7 + 1;
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub19_1.method5412() == 0 && !Static348.method5316(local39, arg0, Static114.anInt1886, arg6)) {
			return;
		}
		if (Static63.aClass89ArrayArrayArray1 == null) {
			return;
		}
		Static15.aClass49_Sub1_1.method6735(Static40.aClass289Array1[arg7], arg7, Static103.aClass144_3, arg3, arg6, arg0);
		if (arg2 < 0) {
			return;
		}
		@Pc(98) int local98 = Static181.aClass14_Sub26_9.aClass43_Sub27_1.method7915();
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub27_1);
		Static15.aClass49_Sub1_1.method6729(Static40.aClass289Array1[arg7], arg1, arg6, arg7, local39, Static103.aClass144_3, arg0, arg4, arg5, arg2);
		Static181.aClass14_Sub26_9.method5270(local98, Static181.aClass14_Sub26_9.aClass43_Sub27_1);
		return;
	}
}
