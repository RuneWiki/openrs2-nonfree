import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	public static int anInt9108;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_129 = new Class289(37, 3);

	@OriginalMember(owner = "client!si", name = "b", descriptor = "[I")
	public static final int[] anIntArray618 = new int[13];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V")
	public static void method7691(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg0 != Static479.anInt8231) {
			Static205.anIntArray199 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static205.anIntArray199[local17] = (local17 << 12) / arg0;
			}
			Static413.anInt7225 = arg0 - 1;
			Static479.anInt8231 = arg0;
			Static643.anInt10390 = arg0 * 32;
		}
		if (arg1 == Static434.anInt7425) {
			return;
		}
		if (arg1 == Static479.anInt8231) {
			Static230.anIntArray222 = Static205.anIntArray199;
		} else {
			Static230.anIntArray222 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static230.anIntArray222[local17] = (local17 << 12) / arg1;
			}
		}
		Static434.anInt7425 = arg1;
		Static476.anInt8174 = arg1 - 1;
	}
}
