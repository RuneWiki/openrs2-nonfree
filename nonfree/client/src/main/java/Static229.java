import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_118 = new Class158("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	public static int anInt4545 = -1;

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "Lclient!ec;")
	public static Class68 aClass68_9 = null;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!jg;I)J")
	public static long method3504(@OriginalArg(1) int arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class192 local16 = Static455.aClass161_4.method3628(arg1.method5730());
		@Pc(37) long local37 = (long) ((arg1.method5727() | 0x10000) << 14 | arg0 << 7 | arg2 | arg1.method5729() << 20);
		if (local16.anInt5666 == 0) {
			local37 |= local9;
		}
		if (local16.anInt5634 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean351) {
			local37 |= local7;
		}
		return local37 | (long) arg1.method5730() << 32;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ec;BI)V")
	public static void method3506(@OriginalArg(0) int arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(3) int arg2) {
		Static167.anInt5708 = arg2;
		Static172.anInt3554 = arg0;
		aClass68_9 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIBIZ)V")
	public static void method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static262.anInt2805 == 0) {
			Static347.method4917(false);
		} else {
			Static402.anInt7265 = Static262.anInt2805;
			Static197.method3166(0);
		}
		Static429.anInt7614 = arg1;
		Static62.anInt1641 = arg2;
		Static200.aBoolean252 = arg3;
		Static377.method3850(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIB)V")
	public static void method3508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static12.aClass34_Sub1_1.anInt7173 != 0 && arg3 != 0 && Static113.anInt2513 < 50 && arg4 != -1) {
			Static117.aClass45Array1[Static113.anInt2513++] = new Class45((byte) 1, arg4, arg3, arg0, arg1, arg2);
		}
	}
}
