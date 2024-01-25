import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray50 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
	public static void method3724() {
		Static123.aClass11_1.method4916();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static442.aLongArray10[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static183.aLongArray5[local24] = 0L;
		}
		Static90.anInt1582 = 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public static void method3725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) float local17 = (float) Static114.anInt6803 / (float) Static114.anInt6796;
		@Pc(19) int local19 = arg0;
		@Pc(21) int local21 = arg3;
		if (local17 < 1.0F) {
			local21 = (int) (local17 * (float) arg0);
		} else {
			local19 = (int) ((float) arg3 / local17);
		}
		@Pc(47) int local47 = arg1 - (arg0 - local19) / 2;
		@Pc(55) int local55 = arg2 - (arg3 - local21) / 2;
		Static323.anInt5318 = -1;
		Static113.anInt2002 = -1;
		Static257.anInt6932 = local47 * Static114.anInt6796 / local19;
		Static2.anInt3076 = Static114.anInt6803 - Static114.anInt6803 * local55 / local21;
		Static144.method1907();
	}
}
