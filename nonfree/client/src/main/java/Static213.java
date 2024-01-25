import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ifa", name = "Cb", descriptor = "F")
	public static float aFloat141 = 1024.0F;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(ZI)Z")
	public static boolean method4319(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!r;BLclient!n;)V")
	public static void method4331(@OriginalArg(0) Class44 arg0, @OriginalArg(2) Class225 arg1) {
		@Pc(31) boolean local31 = Static521.aClass273_2.method6723(arg1.aBoolean474 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null, arg1.anInt6500, arg0, arg1.anInt6479 | 0xFF000000, arg1.anInt6566, arg1.anInt6498, arg1.anInt6527) == null;
		if (local31) {
			Static500.aClass244_57.method5960(new Class4_Sub28(arg1.anInt6527, arg1.anInt6500, arg1.anInt6566, arg1.anInt6479 | 0xFF000000, arg1.anInt6498, arg1.aBoolean474));
			Static92.method2100(arg1);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLclient!pn;II)J")
	public static long method4333(@OriginalArg(1) Interface19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(15) long local15 = Long.MIN_VALUE;
		@Pc(22) Class101 local22 = Static204.aClass139_8.method3309(arg0.method7827());
		@Pc(43) long local43 = (long) (arg0.method7825() << 14 | arg2 | arg1 << 7 | arg0.method7829() << 20 | 0x40000000);
		if (local22.anInt2924 == 0) {
			local43 |= local15;
		}
		if (local22.anInt2922 == 1) {
			local43 |= local5;
		}
		return local43 | (long) arg0.method7827() << 32;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(IB)V")
	public static void method4338(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub5_Sub16 local15 = Static219.method3587(arg0, 10);
		local15.method7134();
	}
}
