import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "[Lclient!i;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 + arg1;
		@Pc(11) int local11 = arg4 + arg0;
		@Pc(15) int local15 = arg2 + arg5;
		if (!Static314.method4794(local11, local11, local15, local15, local11, arg1, arg5, arg1, local7)) {
			return false;
		} else if (Static314.method4794(local11, local11, local15, arg5, local11, arg1, arg5, local7, local7)) {
			if (arg1 < Static221.anInt4276) {
				if (!Static314.method4794(arg0, local11, local15, arg5, local11, arg1, local15, arg1, arg1)) {
					return false;
				}
				if (!Static314.method4794(arg0, local11, arg5, arg5, arg0, arg1, local15, arg1, arg1)) {
					return false;
				}
			} else if (!Static314.method4794(arg0, local11, local15, arg5, local11, local7, local15, local7, local7)) {
				return false;
			} else if (!Static314.method4794(arg0, local11, arg5, arg5, arg0, local7, local15, local7, local7)) {
				return false;
			}
			if (Static41.anInt1080 <= arg5) {
				if (!Static314.method4794(arg0, local11, local15, local15, local11, arg1, local15, arg1, local7)) {
					return false;
				}
				if (!Static314.method4794(arg0, local11, local15, local15, arg0, arg1, local15, local7, local7)) {
					return false;
				}
			} else if (!Static314.method4794(arg0, local11, arg5, arg5, local11, arg1, arg5, arg1, local7)) {
				return false;
			} else if (!Static314.method4794(arg0, local11, arg5, arg5, arg0, arg1, arg5, local7, local7)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public static void method543() {
		try {
			@Pc(10) int local10;
			if (Static352.anInt6186 == 1) {
				local10 = Static504.aClass1_Sub8_Sub3_33.method4637();
				if (local10 > 0 && Static504.aClass1_Sub8_Sub3_33.method4658()) {
					local10 -= Static289.anInt5335;
					if (local10 < 0) {
						local10 = 0;
					}
					Static504.aClass1_Sub8_Sub3_33.method4651(local10);
					return;
				}
				Static504.aClass1_Sub8_Sub3_33.method4666();
				Static504.aClass1_Sub8_Sub3_33.method4646();
				Static34.aClass249_1 = null;
				if (Static250.aClass111_52 == null) {
					Static352.anInt6186 = 0;
				} else {
					Static352.anInt6186 = 2;
				}
				Static185.aClass1_Sub49_1 = null;
			}
			if (Static352.anInt6186 == 3) {
				local10 = Static504.aClass1_Sub8_Sub3_33.method4637();
				if (Static69.anInt1589 > local10 && Static504.aClass1_Sub8_Sub3_33.method4658()) {
					local10 += Static507.anInt8455;
					if (Static69.anInt1589 < local10) {
						local10 = Static69.anInt1589;
					}
					Static504.aClass1_Sub8_Sub3_33.method4651(local10);
					return;
				}
				Static352.anInt6186 = 0;
				Static507.anInt8455 = 0;
			}
		} catch (@Pc(97) Exception local97) {
			local97.printStackTrace();
			Static504.aClass1_Sub8_Sub3_33.method4666();
			Static250.aClass111_52 = null;
			Static34.aClass249_1 = null;
			Static352.anInt6186 = 0;
			Static185.aClass1_Sub49_1 = null;
		}
	}
}
