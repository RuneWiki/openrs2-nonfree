import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
	public static int anInt4908;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString308;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
	public static int anInt4912 = 0;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public static int anInt4913 = -1;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!rl;)V")
	public static void method4278(@OriginalArg(1) Class36_Sub8 arg0) {
		arg0.aClass22_Sub2_Sub1_1 = null;
		if (Static42.anInt1096 < 20) {
			Static243.aClass191_5.method4872(arg0);
			Static42.anInt1096++;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!bi;IIIIIII)V")
	public static void method4282(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0.anInt520 == 2) {
			@Pc(29) int local29 = 99999;
			@Pc(31) int local31 = 0;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = 0; local35 < arg0.anInt518; local35++) {
				for (@Pc(39) int local39 = 0; local39 < arg0.anInt483; local39++) {
					@Pc(50) int local50 = local39 * (arg0.anInt534 + 32) + arg3;
					@Pc(60) int local60 = local35 * (arg0.anInt491 + 32) + arg5;
					if (local33 < 20) {
						local60 += arg0.anIntArray60[local33];
						local50 += arg0.anIntArray62[local33];
					}
					if (arg0.anIntArray72[local33] > 0 && (local50 + 32 > arg1 && local50 < arg2 && local60 + 32 > arg6 && local60 < arg4 || Static169.aClass26_20 == arg0 && Static69.anInt1714 == local33)) {
						if (local33 > local31) {
							local31 = local33;
						}
						if (local29 > local33) {
							local29 = local33;
						}
					}
					local33++;
				}
			}
			Static224.method3946(Static128.aClass89_3, local31, local29, arg0);
		} else if (arg0.anInt520 == 5 && arg0.anInt526 != -1) {
			Static201.method3719(arg0, Static128.aClass89_3);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
	public static void method4284() {
		Static21.aClass103_1.method2684();
	}
}
