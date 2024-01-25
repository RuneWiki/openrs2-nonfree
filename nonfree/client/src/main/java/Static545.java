import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg0 < 1 || Static158.anInt927 - 2 < arg4 || arg0 > Static515.anInt8292 - 2) {
			return;
		}
		@Pc(25) int local25 = arg7;
		if (arg7 < 3 && Static488.method7052(arg4, arg0)) {
			local25 = arg7 + 1;
		}
		if (Static24.aClass3_Sub22_4.lb.method7116() == 0 && !Static426.method6149(arg0, arg4, Static34.anInt808, local25)) {
			return;
		}
		if (Static15.aClass164ArrayArrayArray5 == null) {
			return;
		}
		Static239.aClass73_Sub1_1.method1808(Static1.aClass252Array5[arg7], arg4, Static674.aClass13_22, arg0, arg6, arg7);
		if (arg3 >= 0) {
			@Pc(73) int local73 = Static24.aClass3_Sub22_4.aClass6_Sub4_1.method2638();
			Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub4_1);
			Static239.aClass73_Sub1_1.method1815(Static674.aClass13_22, arg3, local25, arg1, arg0, arg5, arg2, arg7, arg4, Static1.aClass252Array5[arg7]);
			Static24.aClass3_Sub22_4.method2840(local73, Static24.aClass3_Sub22_4.aClass6_Sub4_1);
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)Z")
	public static boolean method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}
}
