import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "D")
	public static double aDouble121;

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
	public static final int[] anIntArray370 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_238 = new Class179(106, 4);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!oea;Z)I")
	public static int method5282(@OriginalArg(0) Class250 arg0) {
		if (Static417.aClass250_11 == arg0) {
			return 5120;
		} else if (arg0 == Static417.aClass250_12) {
			return 5122;
		} else if (Static417.aClass250_13 == arg0) {
			return 5124;
		} else if (arg0 == Static417.aClass250_14) {
			return 5121;
		} else if (arg0 == Static417.aClass250_15) {
			return 5123;
		} else if (Static417.aClass250_16 == arg0) {
			return 5125;
		} else if (Static417.aClass250_17 == arg0) {
			return 5131;
		} else if (Static417.aClass250_18 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(IZIII)V")
	public static void method5286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(93) Class351 local93 = Static441.aClass351ArrayArrayArray1[arg0][arg2][arg3];
			if (local93 != null) {
				if (arg1 == 1) {
					local93.aShort115 = 0;
				} else if (arg1 == 2) {
					local93.aShort116 = 0;
				}
			}
			Static37.method876();
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static242.anInt4294; local20++) {
			@Pc(26) Class379 local26 = Static414.aClass379Array2[local20];
			if (arg1 == local26.aByte145 && arg2 == local26.aShort128 && local26.aShort125 == arg3 || local26.aShort127 == arg2 && arg3 == local26.aShort125) {
				if (Static242.anInt4294 != local20) {
					Static679.method1568(Static414.aClass379Array2, local20 + 1, Static414.aClass379Array2, local20, Static414.aClass379Array2.length - local20 - 1);
				}
				Static242.anInt4294--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(III)Z")
	public static boolean method5288(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
