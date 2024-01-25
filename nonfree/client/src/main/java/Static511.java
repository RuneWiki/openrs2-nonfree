import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	public static int anInt8579;

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!ha;")
	public static Class82 aClass82_16;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
	public static final int[] anIntArray541 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(DI)V")
	public static void method7393(@OriginalArg(0) double arg0) {
		if (arg0 == Static304.aDouble18) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static234.anIntArray256[local7] = local19 > 255 ? 255 : local19;
		}
		Static304.aDouble18 = arg0;
	}
}
