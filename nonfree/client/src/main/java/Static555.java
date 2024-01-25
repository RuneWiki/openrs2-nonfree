import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	public static int[] anIntArray766;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_183 = new Class180(78, 1);

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_63 = new Class165(30);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!or;IJBIIILclient!aa;I)V")
	public static void method7900(@OriginalArg(0) Class260 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = arg3 * arg3 + arg7 * arg7;
		if ((long) local16 > arg2) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg0.anInt6963 / 2, arg0.anInt6971 / 2);
		if (local32 * local32 >= local16) {
			Static236.method3938(arg3, arg7, arg1, arg0, arg6, Static219.aClass33Array13[arg4], arg5);
			return;
		}
		local32 -= 10;
		@Pc(62) int local62;
		if (Static428.anInt6834 == 4) {
			local62 = (int) Static618.aFloat207 & 0x3FFF;
		} else {
			local62 = Static490.anInt8101 + (int) Static618.aFloat207 & 0x3FFF;
		}
		@Pc(75) int local75 = Class3_Sub20.anIntArray206[local62];
		@Pc(79) int local79 = Class3_Sub20.anIntArray204[local62];
		if (Static428.anInt6834 != 4) {
			local79 = local79 * 256 / (Static663.anInt10571 + 256);
			local75 = local75 * 256 / (Static663.anInt10571 + 256);
		}
		@Pc(111) int local111 = arg7 * local75 + arg3 * local79 >> 14;
		@Pc(122) int local122 = arg7 * local79 - arg3 * local75 >> 14;
		@Pc(128) double local128 = Math.atan2((double) local111, (double) local122);
		@Pc(135) int local135 = (int) ((double) local32 * Math.sin(local128));
		@Pc(142) int local142 = (int) (Math.cos(local128) * (double) local32);
		Static118.aClass33Array10[arg4].method7661((float) local135 + (float) arg5 + (float) arg0.anInt6963 / 2.0F, (float) -local142 + (float) arg0.anInt6971 / 2.0F + (float) arg1, 4096, (int) (-local128 / 6.283185307179586D * 65535.0D));
	}
}
