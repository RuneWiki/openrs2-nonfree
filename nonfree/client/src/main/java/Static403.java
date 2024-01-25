import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public static int anInt6989;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt6995;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	public static int anInt6994 = -1;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Z")
	public static boolean method5821() {
		if (Static598.anInt9831 < 1) {
			return false;
		} else {
			return Static327.aClass315_8 != Static106.aClass315_4 || Static540.anInt9129 >= 2;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5823(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
	public static void method5825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static392.anInt8803 / (float) Static392.anInt8795;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if ((float) 1 > local9) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg1 - local13) / 2;
		@Pc(48) int local48 = arg2 - (arg3 - local11) / 2;
		Static397.anInt6936 = local48 * Static392.anInt8795 / local11;
		Static470.anInt7923 = Static392.anInt8803 - local40 * Static392.anInt8803 / local13;
		Static439.anInt9627 = -1;
		Static70.anInt1454 = -1;
		Static575.method7836();
	}
}
