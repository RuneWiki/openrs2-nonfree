import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "J")
	public static long aLong9 = -1L;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ID)V")
	public static void method25(@OriginalArg(1) double arg0) {
		if (Static269.aDouble3 == arg0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(24) int local24 = (int) (Math.pow((double) local12 / 255.0D, arg0) * 255.0D);
			Static133.anIntArray473[local12] = local24 <= 255 ? local24 : 255;
		}
		Static269.aDouble3 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjava/lang/String;BLclient!la;)V")
	public static void method26(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class14 arg2) {
		@Pc(20) int local20 = Static458.aClass15_11.method322(null, 250, arg1);
		@Pc(29) int local29 = Static458.aClass15_11.method327(null, 250, arg1) * 13;
		Static257.aClass75_8.P(6, 6, local20 + 4 + 4, local29 + 4 + 4, -16777216, 0);
		Static257.aClass75_8.method5979(6, 6, local20 + 8, local29 + 4 + 4, -1, 0);
		arg2.method4891(local29, -1, local20, 10, null, 1, null, -1, null, arg1, 10, 0, 0);
		Static437.method5911(local20 + 4 + 4, 6, local29 + 4 + 4, 6);
		if (arg0) {
			Static257.aClass75_8.method5983();
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method27(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
