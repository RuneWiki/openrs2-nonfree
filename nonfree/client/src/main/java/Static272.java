import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "[Lclient!ok;")
	public static Class254[] aClass254Array1;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "[I")
	public static int[] anIntArray275;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	public static int anInt5007 = 0;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(CIB)I")
	public static int method4001(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(24) char local24 = Character.toLowerCase(arg0);
			local15 = (local24 << 4) + 1;
		}
		return local15;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(DI)V")
	public static void method4003(@OriginalArg(0) double arg0) {
		if (Static6.aDouble11 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static49.anIntArray45[local12] = local24 <= 255 ? local24 : 255;
		}
		Static6.aDouble11 = arg0;
	}
}
