import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "Lclient!dl;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Lclient!ds;")
	public static Class3_Sub11_Sub4 method2622() {
		@Pc(13) Class3_Sub11_Sub4 local13 = (Class3_Sub11_Sub4) Static33.aClass74_15.method1842();
		if (local13 != null) {
			local13.method9380();
			local13.method9345();
			return local13;
		}
		do {
			local13 = (Class3_Sub11_Sub4) Static593.aClass74_13.method1842();
			if (local13 == null) {
				return null;
			}
			if (local13.method2193() > Static524.method7320()) {
				return null;
			}
			local13.method9380();
			local13.method9345();
		} while ((local13.aLong310 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static39.aShort9 + (Static215.aShort43 - Static39.aShort9) * local7 / 100;
		@Pc(39) int local39 = arg6 * local33 >> 8;
		Static675.anInt10880 = Static675.anInt10879 * local33 >> 8;
		@Pc(52) int local52 = 16384 - arg3 & 0x3FFF;
		@Pc(59) int local59 = 16384 - arg1 & 0x3FFF;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = 0;
		@Pc(71) int local71 = local39;
		if (local52 != 0) {
			local63 = -local39 * Class3_Sub20.anIntArray206[local52] >> 14;
			local71 = Class3_Sub20.anIntArray204[local52] * local39 >> 14;
		}
		if (local59 != 0) {
			local61 = local71 * Class3_Sub20.anIntArray206[local59] >> 14;
			local71 = local71 * Class3_Sub20.anIntArray204[local59] >> 14;
		}
		Static509.anInt8222 = arg5 - local61;
		Static146.anInt2945 = arg2 - local63;
		Static57.anInt1188 = arg1;
		Static631.anInt10060 = 0;
		Static520.anInt8367 = arg3;
		Static652.anInt10382 = arg0 - local71;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILclient!hj;III)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class138 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) Class3_Sub23 local17 = null;
		for (@Pc(22) Class3_Sub23 local22 = (Class3_Sub23) Static165.aClass338_227.method8177(); local22 != null; local22 = (Class3_Sub23) Static165.aClass338_227.method8168()) {
			if (local22.anInt3177 == arg4 && arg1 == local22.anInt3189 && local22.anInt3188 == arg0 && local22.anInt3184 == arg3) {
				local17 = local22;
				break;
			}
		}
		if (local17 == null) {
			local17 = new Class3_Sub23();
			local17.anInt3188 = arg0;
			local17.anInt3184 = arg3;
			local17.anInt3177 = arg4;
			local17.anInt3189 = arg1;
			Static165.aClass338_227.method8171(local17);
		}
		local17.aBoolean246 = false;
		local17.aBoolean247 = true;
		local17.aClass138_2 = arg2;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIBIILclient!ha;)Lclient!ka;")
	public static Class95 method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13 arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class95 local12 = (Class95) Static669.aClass165_84.method4389(local6);
		if (local12 == null) {
			@Pc(30) Class117 local30 = Static98.method1747(Static476.aClass15_122, arg3);
			if (local30 == null) {
				return null;
			}
			if (local30.anInt3824 < 13) {
				local30.method3478();
			}
			local12 = arg5.method8489(local30, 2055, Static674.anInt10876, 64, 768);
			Static669.aClass165_84.method4392(local12, local6);
		}
		local12 = local12.method5664((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.a(arg4);
		}
		if (arg1 != 0) {
			local12.FA(arg1);
		}
		if (arg2 != 0) {
			local12.VA(arg2);
		}
		if (arg0 != 0) {
			local12.H(0, arg0, 0);
		}
		return local12;
	}
}
