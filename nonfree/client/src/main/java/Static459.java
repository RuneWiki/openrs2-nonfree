import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!su", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject16;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "[I")
	public static final int[] anIntArray625 = new int[1];

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)V")
	public static void method6906() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static80.aClass227Array3[local3] = null;
		}
		Static98.anInt2284 = 0;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ID)V")
	public static void method6908(@OriginalArg(1) double arg0) {
		if (arg0 == Static266.aDouble1) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static473.anIntArray642[local7] = local19 > 255 ? 255 : local19;
		}
		Static266.aDouble1 = arg0;
	}
}
