import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
	public static int anInt5682;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
	public static final int[] anIntArray423 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	public static void method4865() {
		if (Static350.aBoolean441) {
			return;
		}
		if (Static104.aClass6_Sub6_Sub1_4.aBoolean137) {
			Static412.aFloat175 = (int) Static412.aFloat175 - 65 & 0xFFFFFF80;
		} else {
			Static471.aFloat184 += (-24.0F - Static471.aFloat184) / 2.0F;
		}
		Static399.aBoolean713 = true;
		Static350.aBoolean441 = true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!iaa;)Lclient!du;")
	public static Class77_Sub1 method4866(@OriginalArg(1) Class6_Sub26 arg0) {
		return new Class77_Sub1(arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4949(), arg0.method4966());
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIILclient!ep;)V")
	public static void method4868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class93 arg2) {
		if (arg2.aByte35 == 0) {
			arg2.anInt2753 = arg2.anInt2817;
		} else if (arg2.aByte35 == 1) {
			arg2.anInt2753 = arg2.anInt2817 + (arg0 - arg2.anInt2777) / 2;
		} else if (arg2.aByte35 == 2) {
			arg2.anInt2753 = arg0 - arg2.anInt2817 - arg2.anInt2777;
		} else if (arg2.aByte35 == 3) {
			arg2.anInt2753 = arg0 * arg2.anInt2817 >> 14;
		} else if (arg2.aByte35 == 4) {
			arg2.anInt2753 = (arg0 - arg2.anInt2777) / 2 + (arg2.anInt2817 * arg0 >> 14);
		} else {
			arg2.anInt2753 = arg0 - arg2.anInt2777 - (arg2.anInt2817 * arg0 >> 14);
		}
		if (arg2.aByte36 == 0) {
			arg2.anInt2750 = arg2.anInt2774;
		} else if (arg2.aByte36 == 1) {
			arg2.anInt2750 = arg2.anInt2774 + (arg1 - arg2.anInt2738) / 2;
		} else if (arg2.aByte36 == 2) {
			arg2.anInt2750 = arg1 - arg2.anInt2738 - arg2.anInt2774;
		} else if (arg2.aByte36 == 3) {
			arg2.anInt2750 = arg1 * arg2.anInt2774 >> 14;
		} else if (arg2.aByte36 == 4) {
			arg2.anInt2750 = (arg1 - arg2.anInt2738) / 2 + (arg1 * arg2.anInt2774 >> 14);
		} else {
			arg2.anInt2750 = arg1 - arg2.anInt2738 - (arg2.anInt2774 * arg1 >> 14);
		}
		if (!Static13.aBoolean37 || Static69.method1454(arg2).anInt8800 == 0 && arg2.anInt2823 != 0) {
			return;
		}
		if (arg2.anInt2753 < 0) {
			arg2.anInt2753 = 0;
		} else if (arg0 < arg2.anInt2777 + arg2.anInt2753) {
			arg2.anInt2753 = arg0 - arg2.anInt2777;
		}
		if (arg2.anInt2750 < 0) {
			arg2.anInt2750 = 0;
		} else if (arg2.anInt2750 + arg2.anInt2738 > arg1) {
			arg2.anInt2750 = arg1 - arg2.anInt2738;
			return;
		}
	}
}
