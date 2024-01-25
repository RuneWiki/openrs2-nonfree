import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([[SB[[F)[[S")
	public static short[][] method1092(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < arg0[local7].length; local11++) {
				arg0[local7][local11] = (short) (int) (arg1[local7][local11] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V")
	public static void method1093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static634.anInt6735 != 0) {
			if (arg0 < 0) {
				for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
					anIntArray61[local10] = arg1;
				}
			} else {
				anIntArray61[arg0] = arg1;
			}
		}
		Static574.aClass3_Sub12_Sub3_3.method7552(arg0, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Lclient!ej;")
	public static Class103 method1095() {
		try {
			return (Class103) Class.forName("Class103_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!ha;II)V")
	public static void method1096(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		Static26.aClass382ArrayArray1 = new Class382[arg2][arg0];
		Static491.aClass95_11 = arg1;
		if (Static212.anIntArray206 != null) {
			Static43.aClass57_1 = Static458.method6167(Static212.anIntArray206[0], Static212.anIntArray206[3], Static212.anIntArray206[2], Static212.anIntArray206[1], Static212.anIntArray206[4], Static212.anIntArray206[5]);
		}
		Static89.aClass382_1 = new Class382();
		Static622.method8399();
	}
}
