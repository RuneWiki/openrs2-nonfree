import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "Lclient!mu;")
	public static Class241 aClass241_2;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_162 = new Class126(46, 6);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method6841() {
		Static355.aClass16_6.xa(((float) Static227.aClass3_Sub15_11.aClass17_Sub25_1.method7847() * 0.1F + 0.7F) * 1.1523438F);
		Static355.aClass16_6.ZA(Static82.anInt1887, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static355.aClass16_6.L(Static301.anInt5502, -1, 0);
		Static355.aClass16_6.method8201(Static235.aClass106_2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	public static int method6842(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	public static void method6843(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static54.anInt1418 != 0) {
			if (arg0 < 0) {
				for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
					Static426.anIntArray450[local13] = arg1;
				}
			} else {
				Static426.anIntArray450[arg0] = arg1;
			}
		}
		Static402.aClass3_Sub9_Sub5_2.method6713(arg1, arg0);
	}
}
