import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
	public static int anInt6426;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_228 = new Class288(5, 8);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(JLclient!paa;IIIIIILclient!aa;)V")
	public static void method5532(@OriginalArg(0) long arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7) {
		@Pc(16) int local16 = arg5 * arg5 + arg4 * arg4;
		if (arg0 < (long) local16) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg1.anInt6595 / 2, arg1.anInt6622 / 2);
		if (local36 * local36 >= local16) {
			Static626.method8387(Static236.aClass61Array9[arg3], arg5, arg6, arg4, arg7, arg2, arg1);
			return;
		}
		local36 -= 10;
		@Pc(56) int local56;
		if (Static445.anInt7122 == 4) {
			local56 = (int) Static440.aFloat144 & 0x3FFF;
		} else {
			local56 = Static99.anInt7118 + (int) Static440.aFloat144 & 0x3FFF;
		}
		@Pc(67) int local67 = Canvas_Sub1.anIntArray497[local56];
		@Pc(71) int local71 = Canvas_Sub1.anIntArray498[local56];
		if (Static445.anInt7122 != 4) {
			local71 = local71 * 256 / (Static407.anInt9051 + 256);
			local67 = local67 * 256 / (Static407.anInt9051 + 256);
		}
		@Pc(102) int local102 = local71 * arg5 + local67 * arg4 >> 14;
		@Pc(113) int local113 = local71 * arg4 - local67 * arg5 >> 14;
		@Pc(119) double local119 = Math.atan2((double) local102, (double) local113);
		@Pc(126) int local126 = (int) ((double) local36 * Math.sin(local119));
		@Pc(133) int local133 = (int) (Math.cos(local119) * (double) local36);
		Static366.aClass61Array11[arg3].method6442((float) arg1.anInt6595 / 2.0F + (float) arg6 + (float) local126, (float) -local133 + (float) arg1.anInt6622 / 2.0F + (float) arg2, 4096, (int) (-local119 / 6.283185307179586D * 65535.0D));
	}
}
