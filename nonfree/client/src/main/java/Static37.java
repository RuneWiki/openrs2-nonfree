import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "Lclient!bj;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	public static int anInt657 = 10;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIILclient!rg;)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class151 arg6) {
		@Pc(16) int local16 = arg0 * arg0 + arg5 * arg5;
		if (arg2 < local16) {
			return;
		}
		@Pc(34) int local34 = Math.min(arg6.anInt4773 / 2, arg6.anInt4751 / 2);
		if (local34 * local34 >= local16) {
			Static233.method3951(arg4, arg0, arg3, arg6, Static206.aClass3_Sub4_Sub12Array7[arg1], arg5);
			return;
		}
		@Pc(53) int local53;
		if (Static25.anInt467 == 4) {
			local53 = (int) Static84.aFloat21 & 0x7FF;
		} else {
			local53 = Static241.anInt4889 + (int) Static84.aFloat21 & 0x7FF;
		}
		local34 -= 10;
		@Pc(67) int local67 = Class11.anIntArray26[local53];
		@Pc(71) int local71 = Class11.anIntArray27[local53];
		if (Static25.anInt467 != 4) {
			local71 = local71 * 256 / (Static125.anInt2421 + 256);
			local67 = local67 * 256 / (Static125.anInt2421 + 256);
		}
		@Pc(103) int local103 = arg0 * local71 + arg5 * local67 >> 16;
		@Pc(114) int local114 = arg5 * local71 - local67 * arg0 >> 16;
		@Pc(120) double local120 = Math.atan2((double) local103, (double) local114);
		@Pc(127) int local127 = (int) (Math.sin(local120) * (double) local34);
		@Pc(134) int local134 = (int) ((double) local34 * Math.cos(local120));
		if (Static283.aBoolean393) {
			((Class3_Sub4_Sub12_Sub1) Static200.aClass3_Sub4_Sub12Array6[arg1]).method2279((local127 + arg3 + arg6.anInt4773 / 2) * 16, (arg4 + arg6.anInt4751 / 2 - local134) * 16, (int) (local120 * 10430.378D));
		} else {
			((Class3_Sub4_Sub12_Sub2) Static200.aClass3_Sub4_Sub12Array6[arg1]).method4712(arg3 + arg6.anInt4773 / 2 + local127 - 10, -local134 + arg6.anInt4751 / 2 + (arg4 - 10), local120);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(4) Class3_Sub10 local4 = (Class3_Sub10) Static219.aClass56_21.method1281();
		@Pc(20) Class3_Sub10 local20 = null;
		while (local4 != null) {
			if (arg3 == local4.anInt1477 && arg0 == local4.anInt1465 && local4.anInt1475 == arg8 && arg1 == local4.anInt1471) {
				local20 = local4;
				break;
			}
			local4 = (Class3_Sub10) Static219.aClass56_21.method1278();
		}
		if (local20 == null) {
			local20 = new Class3_Sub10();
			local20.anInt1465 = arg0;
			local20.anInt1471 = arg1;
			local20.anInt1475 = arg8;
			local20.anInt1477 = arg3;
			Static35.method537(local20);
			Static219.aClass56_21.method1282(local20);
		}
		local20.anInt1466 = arg2;
		local20.anInt1478 = arg4;
		local20.anInt1472 = arg7;
		local20.anInt1476 = arg5;
		local20.anInt1469 = arg6;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ug;I)Lclient!in;")
	public static Class2_Sub2 method554(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class2_Sub2(arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3930(), arg0.method3899(), arg0.method3915());
	}
}
