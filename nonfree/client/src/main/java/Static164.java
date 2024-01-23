import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "Lclient!jd;")
	public static Class84 aClass84_65;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "Lclient!fa;")
	public static Class53 aClass53_3 = new Class53(64);

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString167 = " from your ignore list first.";

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
	public static int anInt3454 = 0;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "J")
	public static long aLong179 = 0L;

	@OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZ)V")
	public static void method2842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class2_Sub3_Sub16 local16 = Static119.method2204(arg0, 11);
		local16.method2718();
		local16.anInt3323 = arg1;
		local16.anInt3327 = arg2;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIILclient!mn;II)V")
	public static void method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class115 arg5, @OriginalArg(6) int arg6) {
		@Pc(13) int local13 = arg3 * arg3 + arg6 * arg6;
		if (arg0 < local13) {
			return;
		}
		@Pc(27) int local27 = Math.min(arg5.anInt3555 / 2, arg5.anInt3487 / 2);
		if (local27 * local27 >= local13) {
			Static201.method3394(arg5, arg2, arg3, arg4, Static214.aClass2_Sub3_Sub1Array10[arg1], arg6);
			return;
		}
		local27 -= 10;
		@Pc(54) int local54 = Static293.anInt6086 + (int) Static142.aFloat31 & 0x7FF;
		@Pc(58) int local58 = Class66.anIntArray148[local54];
		@Pc(66) int local66 = local58 * 256 / (Static266.anInt5527 + 256);
		@Pc(70) int local70 = Class66.anIntArray153[local54];
		@Pc(78) int local78 = local70 * 256 / (Static266.anInt5527 + 256);
		@Pc(88) int local88 = arg6 * local78 + local66 * arg3 >> 16;
		@Pc(99) int local99 = arg3 * local78 - local66 * arg6 >> 16;
		@Pc(105) double local105 = Math.atan2((double) local88, (double) local99);
		@Pc(112) int local112 = (int) ((double) local27 * Math.sin(local105));
		@Pc(119) int local119 = (int) ((double) local27 * Math.cos(local105));
		if (Static60.aBoolean106) {
			((Class2_Sub3_Sub1_Sub2) Static206.aClass2_Sub3_Sub1Array9[arg1]).method615((local112 + arg2 + arg5.anInt3555 / 2) * 16, (arg4 + arg5.anInt3487 / 2 - local119) * 16, (int) (local105 * 10430.378D));
		} else {
			((Class2_Sub3_Sub1_Sub1) Static206.aClass2_Sub3_Sub1Array9[arg1]).method4382(arg5.anInt3555 / 2 + arg2 + local112 - 10, -local119 + -10 + arg4 + arg5.anInt3487 / 2, local105);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
	public static void method2844(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub18 local14 = (Class2_Sub18) Static50.aClass79_4.method2002((long) arg0);
		if (local14 != null) {
			local14.method4926();
		}
	}
}
