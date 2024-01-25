import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!un", name = "sb", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_165 = new Class21(4);

	@OriginalMember(owner = "client!un", name = "tb", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_217 = new Class106("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public static void method5534() {
		Static258.aClass21_42.method857();
		Static239.aClass21_128.method857();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIZ)V")
	public static void method5540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg3, 10);
		local8.method3480();
		local8.anInt3727 = arg1;
		local8.anInt3725 = arg0;
		local8.anInt3724 = arg2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!kg;Lclient!tm;IIIIILclient!hi;ILjava/lang/String;ILclient!df;)V")
	public static void method5545(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class80 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class33 arg10) {
		@Pc(13) int local13;
		if (Static50.anInt1273 == 4) {
			local13 = (int) Static357.aFloat76 & 0x3FFF;
		} else {
			local13 = Static163.anInt3359 + (int) Static357.aFloat76 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg0.anInt3381 / 2, arg0.anInt3444 / 2) + 10;
		@Pc(42) int local42 = arg5 * arg5 + arg9 * arg9;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(52) int local52 = Class208.anIntArray479[local13];
		@Pc(56) int local56 = Class208.anIntArray478[local13];
		if (Static50.anInt1273 != 4) {
			local52 = local52 * 256 / (Static293.anInt4951 + 256);
			local56 = local56 * 256 / (Static293.anInt4951 + 256);
		}
		@Pc(89) int local89 = local56 * arg9 + local52 * arg5 >> 15;
		@Pc(100) int local100 = arg5 * local56 - local52 * arg9 >> 15;
		@Pc(107) int local107 = arg6.method2538(100, arg8, null);
		@Pc(117) int local117 = arg6.method2533(arg8, null);
		@Pc(123) int local123 = local89 - local107 / 2;
		if (local123 >= -arg0.anInt3381 && arg0.anInt3381 >= local123 && -arg0.anInt3444 <= local100 && arg0.anInt3444 >= local100) {
			arg10.method6026(0, arg7 + arg0.anInt3444 / 2 - local117 - arg2 - local100, arg7, 0, 0, null, arg3, arg4, null, local123 + arg4 + arg0.anInt3381 / 2, local107, arg1, 50, arg8, 1);
		}
	}
}
