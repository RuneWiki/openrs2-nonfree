import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public static int anInt3359;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "J")
	public static long aLong155 = 0L;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "[I")
	public static int[] anIntArray313 = new int[1];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Lclient!rg;")
	public static Class255 method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static242.aClass255ArrayArrayArray2[0][arg1][arg2] != null && Static242.aClass255ArrayArrayArray2[0][arg1][arg2].aClass255_1 != null;
			if (local28 && arg0 >= Static388.anInt7032 - 1) {
				return null;
			}
			Static161.method2492(arg0, arg1, arg2);
		}
		return Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ID)V")
	public static void method2931(@OriginalArg(1) double arg0) {
		if (arg0 == Static361.aDouble9) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static193.anIntArray695[local7] = local19 > 255 ? 255 : local19;
		}
		Static361.aDouble9 = arg0;
	}
}
