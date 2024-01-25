import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!hh;")
	public static Class109 aClass109_61;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
	public static int anInt4468 = 0;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_222 = new Class12(14, 10);

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_223 = new Class12(90, 12);

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIILclient!ea;Lclient!tn;JI)V")
	public static void method3701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class34 arg4, @OriginalArg(6) Class229 arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = arg7 * arg7 + arg0 * arg0;
		if ((long) local24 > arg6) {
			return;
		}
		@Pc(40) int local40 = Math.min(arg5.anInt6905 / 2, arg5.anInt6895 / 2);
		if (local40 * local40 >= local24) {
			Static257.method3643(arg3, Static283.aClass78Array7[arg1], arg7, arg2, arg5, arg0, arg4);
			return;
		}
		local40 -= 10;
		@Pc(68) int local68;
		if (Static57.anInt883 == 4) {
			local68 = (int) Static147.aFloat59 & 0x3FFF;
		} else {
			local68 = Static388.anInt7297 + (int) Static147.aFloat59 & 0x3FFF;
		}
		@Pc(81) int local81 = Class262.anIntArray575[local68];
		@Pc(85) int local85 = Class262.anIntArray576[local68];
		if (Static57.anInt883 != 4) {
			local85 = local85 * 256 / (Static25.anInt430 + 256);
			local81 = local81 * 256 / (Static25.anInt430 + 256);
		}
		@Pc(116) int local116 = arg0 * local85 + local81 * arg7 >> 15;
		@Pc(127) int local127 = arg7 * local85 - local81 * arg0 >> 15;
		@Pc(133) double local133 = Math.atan2((double) local116, (double) local127);
		@Pc(140) int local140 = (int) ((double) local40 * Math.sin(local133));
		@Pc(147) int local147 = (int) (Math.cos(local133) * (double) local40);
		Static201.aClass78Array4[arg1].method6004((float) local140 + (float) arg5.anInt6905 / 2.0F + (float) arg3, (float) -local147 + (float) arg5.anInt6895 / 2.0F + (float) arg2, 4096, (int) (-local133 / 6.283185307179586D * 65535.0D));
	}
}
