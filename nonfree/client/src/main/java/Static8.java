import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
	public static int anInt745 = 1;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_2 = new Class90(85, 8);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIJBLclient!is;Lclient!ua;I)V")
	public static void method671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(6) Class155 arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg3 * arg3;
		if (arg4 < (long) local11) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg5.anInt4806 / 2, arg5.anInt4831 / 2);
		if (local11 <= local32 * local32) {
			Static327.method6515(arg0, arg2, arg5, Static191.aClass88Array4[arg1], arg3, arg6, arg7);
			return;
		}
		local32 -= 10;
		@Pc(63) int local63;
		if (Static300.anInt6053 == 4) {
			local63 = (int) Static189.aFloat83 & 0x3FFF;
		} else {
			local63 = (int) Static189.aFloat83 + Static136.anInt3033 & 0x3FFF;
		}
		@Pc(74) int local74 = Class262.anIntArray420[local63];
		@Pc(78) int local78 = Class262.anIntArray421[local63];
		if (Static300.anInt6053 != 4) {
			local78 = local78 * 256 / (Static273.anInt5737 + 256);
			local74 = local74 * 256 / (Static273.anInt5737 + 256);
		}
		@Pc(107) int local107 = local78 * arg0 + local74 * arg3 >> 14;
		@Pc(118) int local118 = local78 * arg3 - local74 * arg0 >> 14;
		@Pc(124) double local124 = Math.atan2((double) local107, (double) local118);
		@Pc(131) int local131 = (int) ((double) local32 * Math.sin(local124));
		@Pc(138) int local138 = (int) (Math.cos(local124) * (double) local32);
		Static537.aClass88Array14[arg1].method8050((float) local131 + (float) arg2 + (float) arg5.anInt4806 / 2.0F, (float) -local138 + (float) arg5.anInt4831 / 2.0F + (float) arg7, 4096, (int) (-local124 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method673() {
		if (Static521.aClass258_1 != null) {
			Static521.aClass258_1.method5975();
		}
		if (Static458.aThread5 == null) {
			return;
		}
		while (true) {
			try {
				Static458.aThread5.join();
				return;
			} catch (@Pc(23) InterruptedException local23) {
			}
		}
	}
}
