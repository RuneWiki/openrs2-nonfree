import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
	public static int[] anIntArray543;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!vh;")
	public static Class250 aClass250_75;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method5218() {
		for (@Pc(7) int local7 = 0; local7 < Static442.anInt5016; local7++) {
			@Pc(13) Class12 local13 = Static254.aClass12Array1[local7];
			if (local13.aByte1 == 2) {
				if (local13.aClass1_Sub7_Sub4_1 == null) {
					local13.anInt337 = Integer.MIN_VALUE;
				} else {
					Static38.aClass1_Sub7_Sub1_1.method3979(local13.aClass1_Sub7_Sub4_1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	public static boolean method5219(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
