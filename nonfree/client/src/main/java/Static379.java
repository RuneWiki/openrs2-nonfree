import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	public static int anInt6482;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	public static int anInt6484;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!ht;")
	public static final Class137 aClass137_9 = new Class137("", 10);

	@OriginalMember(owner = "client!of", name = "u", descriptor = "Lclient!bs;")
	public static final Class40 aClass40_9 = new Class40();

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;ZIII)V")
	public static void method5534(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static576.method7738(arg2, false, arg3, arg1, arg0, null);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBJIILclient!ua;ILclient!wp;)V")
	public static void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class361 arg7) {
		@Pc(16) int local16 = arg4 * arg4 + arg1 * arg1;
		if (arg2 < (long) local16) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg7.anInt9668 / 2, arg7.anInt9650 / 2);
		if (local16 <= local36 * local36) {
			Static212.method3418(arg1, Static186.aClass14Array10[arg0], arg5, arg3, arg7, arg4, arg6);
			return;
		}
		local36 -= 10;
		@Pc(58) int local58;
		if (anInt6482 == 4) {
			local58 = (int) Static43.aFloat20 & 0x3FFF;
		} else {
			local58 = Static244.anInt4328 + (int) Static43.aFloat20 & 0x3FFF;
		}
		@Pc(69) int local69 = Class356.anIntArray597[local58];
		@Pc(73) int local73 = Class356.anIntArray598[local58];
		if (anInt6482 != 4) {
			local73 = local73 * 256 / (Static41.anInt765 + 256);
			local69 = local69 * 256 / (Static41.anInt765 + 256);
		}
		@Pc(102) int local102 = local69 * arg1 + arg4 * local73 >> 14;
		@Pc(113) int local113 = arg1 * local73 - arg4 * local69 >> 14;
		@Pc(119) double local119 = Math.atan2((double) local102, (double) local113);
		@Pc(126) int local126 = (int) (Math.sin(local119) * (double) local36);
		@Pc(133) int local133 = (int) (Math.cos(local119) * (double) local36);
		Static10.aClass14Array2[arg0].method7678((float) arg3 + (float) arg7.anInt9668 / 2.0F + (float) local126, (float) arg7.anInt9650 / 2.0F + (float) arg6 - (float) local133, 4096, (int) (-local119 / 6.283185307179586D * 65535.0D));
	}
}
