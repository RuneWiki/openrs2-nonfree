import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
	public static int anInt134;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_14 = new Class123(9, -1);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)V")
	public static void method151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static348.aClass3_Sub51_Sub1_5.anInt9949 != 0 && arg3 != 0 && Static345.anInt6219 < 50 && arg0 != -1) {
			Static73.aClass367Array4[Static345.anInt6219++] = new Class367((byte) 1, arg0, arg3, arg2, arg4, 0, arg1, null);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
	public static void method152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) int local22;
		if (arg1 != Static481.anInt8358) {
			Static595.anIntArray600 = new int[arg1];
			for (local22 = 0; local22 < arg1; local22++) {
				Static595.anIntArray600[local22] = (local22 << 12) / arg1;
			}
			Static325.anInt5932 = arg1 - 1;
			Static432.anInt7643 = arg1 * 32;
			Static481.anInt8358 = arg1;
		}
		if (Static465.anInt8091 == arg0) {
			return;
		}
		if (arg0 == Static481.anInt8358) {
			Static231.anIntArray217 = Static595.anIntArray600;
		} else {
			Static231.anIntArray217 = new int[arg0];
			for (local22 = 0; local22 < arg0; local22++) {
				Static231.anIntArray217[local22] = (local22 << 12) / arg0;
			}
		}
		Static527.anInt10285 = arg0 - 1;
		Static465.anInt8091 = arg0;
	}
}
