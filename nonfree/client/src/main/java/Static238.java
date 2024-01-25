import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "[S")
	public static short[] aShortArray103 = new short[256];

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
	public static int anInt4475 = -1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLclient!og;IILclient!an;Lclient!bd;I)V")
	public static void method3980(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9_Sub1_Sub1_Sub2_Sub1 arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub17 local7 = new Class3_Sub17();
		local7.anInt2497 = arg6 << 9;
		local7.anInt2500 = arg2 << 9;
		local7.anInt2487 = arg0;
		if (arg5 != null) {
			local7.aClass23_1 = arg5;
			@Pc(34) int local34 = arg5.anInt739;
			@Pc(37) int local37 = arg5.anInt744;
			if (arg3 == 1 || arg3 == 3) {
				local37 = arg5.anInt739;
				local34 = arg5.anInt744;
			}
			local7.aBoolean205 = arg5.aBoolean62;
			local7.anInt2496 = arg5.anInt731;
			local7.aBoolean204 = arg5.aBoolean70;
			local7.anInt2491 = arg5.anInt781;
			local7.anInt2499 = arg5.anInt778;
			local7.anInt2490 = local34 + arg2 << 9;
			local7.anInt2489 = arg6 + local37 << 9;
			local7.anInt2493 = arg5.anInt783 << 9;
			local7.anInt2498 = arg5.anInt742;
			local7.anIntArray176 = arg5.anIntArray76;
			if (arg5.anIntArray78 != null) {
				local7.aBoolean203 = true;
				local7.method2233();
			}
			if (local7.anIntArray176 != null) {
				local7.anInt2494 = (int) ((double) (local7.anInt2491 - local7.anInt2496) * Math.random()) + local7.anInt2496;
			}
			Static200.aClass130_19.method3548(local7);
		} else if (arg4 != null) {
			local7.aClass9_Sub1_Sub1_Sub2_Sub1_1 = arg4;
			@Pc(192) Class294 local192 = arg4.aClass294_1;
			if (local192.anIntArray588 != null) {
				local7.aBoolean203 = true;
				local192 = local192.method6429(Static427.aClass56_1);
			}
			if (local192 != null) {
				local7.anInt2490 = arg2 + local192.anInt7615 << 9;
				local7.anInt2489 = local192.anInt7615 + arg6 << 9;
				local7.anInt2498 = Static459.method6379(arg4);
				local7.anInt2499 = local192.anInt7625;
				local7.aBoolean205 = local192.aBoolean604;
				local7.anInt2493 = local192.anInt7628 << 9;
			}
			Static312.aClass130_37.method3548(local7);
		} else if (arg1 != null) {
			local7.aClass9_Sub1_Sub1_Sub2_Sub2_1 = arg1;
			local7.anInt2490 = arg2 + arg1.method5569() << 9;
			local7.anInt2489 = arg6 + arg1.method5569() << 9;
			local7.anInt2498 = Static541.method7125(arg1);
			local7.aBoolean205 = arg1.aBoolean534;
			local7.anInt2499 = arg1.anInt6508;
			local7.anInt2493 = arg1.anInt6476 << 9;
			Static145.aClass310_11.method6603(local7, (long) arg1.anInt6429);
			return;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!r;)V")
	public static void method3981(@OriginalArg(1) Class43 arg0) {
		if (Static255.aBoolean352) {
			Static181.method3147(arg0);
		} else {
			Static227.method3891(arg0);
		}
	}
}
