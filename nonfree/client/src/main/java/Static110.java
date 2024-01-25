import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZI[Lclient!faa;I)V")
	public static void method1698(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class97[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class97 local13 = arg3[local7];
			if (local13 != null && arg2 == local13.anInt2655) {
				Static257.method5659(arg1, arg0, local13, arg4);
				Static570.method7831(arg0, local13, arg4);
				if (local13.anInt2691 > local13.anInt2658 - local13.anInt2690) {
					local13.anInt2691 = local13.anInt2658 - local13.anInt2690;
				}
				if (local13.anInt2691 < 0) {
					local13.anInt2691 = 0;
				}
				if (local13.anInt2603 - local13.anInt2670 < local13.anInt2665) {
					local13.anInt2665 = local13.anInt2603 - local13.anInt2670;
				}
				if (local13.anInt2665 < 0) {
					local13.anInt2665 = 0;
				}
				if (local13.anInt2637 == 0) {
					Static465.method6499(local13, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "(I)V")
	public static void method1699() {
		if (Static492.aBoolean563) {
			return;
		}
		Static380.aBoolean478 = true;
		Static492.aBoolean563 = true;
		if (Static58.aClass6_Sub17_Sub1_1.aBoolean598) {
			Static562.aFloat14 = (int) Static562.aFloat14 - 65 & 0xFFFFFF80;
		} else {
			Static7.aFloat12 += (-Static7.aFloat12 - 24.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
	public static boolean method1700() {
		return Static131.anInt2504 == 0 ? Static373.aClass6_Sub15_Sub3_2.method6647() : true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)Z")
	public static boolean method1701(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
