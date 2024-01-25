import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public static final int anInt8596 = 1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public static void method7320() {
		@Pc(16) Class5_Sub21 local16 = Static64.method905(Static263.aClass49_1, Static619.aClass305_98);
		local16.aClass5_Sub41_Sub2_1.method7848(Static446.anInt7663);
		Static495.method7092(local16);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JJ)J")
	public static long method7321(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public static void method7322() {
		Static192.method3179();
		@Pc(10) int local10 = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854();
		if (local10 == 2) {
			Static642.method8657(Static79.anInt1140, Static32.anInt510, Static208.aClass65_7);
		} else if (local10 == 3) {
			Static193.method3202(Static507.anInt8521, Static208.aClass65_7, Static32.anInt510, Static217.anInt4055, Static79.anInt1140);
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6853()) {
			Static614.method8347(Static141.aCanvas7);
		}
		if (Static208.aClass65_7 != null) {
			Static282.method4537();
		}
		Static632.aBoolean877 = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6854() != 0;
		Static66.aBoolean570 = Static172.aClass5_Sub50_14.aClass12_Sub24_1.method6853();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIIIILclient!id;)Z")
	public static boolean method7324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class160 arg5) {
		if (!Static37.aBoolean43 || !Static521.aBoolean738) {
			return false;
		} else if (Static383.anInt6814 < 100) {
			return false;
		} else if (arg1 != arg4 || arg2 != arg0) {
			for (@Pc(50) int local50 = arg4; local50 <= arg1; local50++) {
				for (@Pc(54) int local54 = arg2; local54 <= arg0; local54++) {
					if (-Static196.anInt3768 == Static276.anIntArrayArrayArray49[arg3][local50][local54]) {
						return false;
					}
				}
			}
			if (Static76.method1007(arg5)) {
				Static291.anInt9486++;
				return true;
			} else {
				return false;
			}
		} else if (!Static380.method5646(arg3, arg4, arg2)) {
			return false;
		} else if (Static76.method1007(arg5)) {
			Static291.anInt9486++;
			return true;
		} else {
			return false;
		}
	}
}
