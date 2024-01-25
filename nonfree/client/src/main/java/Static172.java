import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Lclient!as;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!is", name = "q", descriptor = "I")
	public static int anInt3043;

	@OriginalMember(owner = "client!is", name = "r", descriptor = "I")
	public static int anInt3044;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V")
	public static void method2738() {
		if (Static148.anIntArray260 != null && Static37.anIntArray640 != null) {
			return;
		}
		Static37.anIntArray640 = new int[256];
		Static148.anIntArray260 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static148.anIntArray260[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static37.anIntArray640[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(DI)V")
	public static void method2741(@OriginalArg(0) double arg0) {
		if (arg0 == Static346.aDouble9) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static403.anIntArray578[local7] = local19 > 255 ? 255 : local19;
		}
		Static346.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)I")
	public static int method2743() {
		if (Static93.aFrame1 == null) {
			return Static447.aBoolean495 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
