import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public static int anInt4637;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	public static int anInt4639 = 1;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BIII)I")
	public static int method3130(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(18) int local18 = arg1; local18 < arg2; local18++) {
			local7 = Class1_Sub2.anIntArray6[(local7 ^ arg0[local18]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!ef;IIIIIII)V")
	public static void method3131(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static46.aBoolean211) {
			Static104.anInt3067 = 32;
		} else {
			Static104.anInt3067 = 0;
		}
		Static46.aBoolean211 = false;
		@Pc(134) int local134;
		if (Static127.anInt3639 != 0) {
			if (arg1 <= arg4 && arg4 < arg1 + 16 && arg5 <= arg6 && arg6 < arg5 + 16) {
				arg0.anInt1256 -= 4;
				Static152.method2858(arg0);
			} else if (arg4 >= arg1 && arg1 + 16 > arg4 && arg6 >= arg5 + arg2 - 16 && arg5 + arg2 > arg6) {
				arg0.anInt1256 += 4;
				Static152.method2858(arg0);
			} else if (arg1 - Static104.anInt3067 <= arg4 && arg4 < Static104.anInt3067 + arg1 + 16 && arg5 + 16 <= arg6 && arg5 + arg2 - 16 > arg6) {
				local134 = (arg2 - 32) * arg2 / arg3;
				if (local134 < 8) {
					local134 = 8;
				}
				@Pc(153) int local153 = arg6 - local134 / 2 - arg5 - 16;
				@Pc(160) int local160 = arg2 - local134 - 32;
				arg0.anInt1256 = (arg3 - arg2) * local153 / local160;
				Static152.method2858(arg0);
				Static46.aBoolean211 = true;
			}
		}
		if (Static88.anInt2731 == 0) {
			return;
		}
		local134 = arg0.anInt1260;
		if (arg4 >= arg1 - local134 && arg5 <= arg6 && arg4 < arg1 + 16 && arg6 <= arg2 + arg5) {
			arg0.anInt1256 += Static88.anInt2731 * 45;
			Static152.method2858(arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)V")
	public static void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) long local14 = (long) ((arg1 << 16) + arg0);
		@Pc(20) Class1_Sub1_Sub13 local20 = (Class1_Sub1_Sub13) Static173.aClass14_15.method569(local14);
		if (local20 != null) {
			Static10.aClass77_1.method2926(local20);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)I")
	public static int method3133(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class1_Sub1_Sub8_Sub4.anIntArray216[arg2 * 1024 / arg1] >> 1;
		return (arg0 * local12 >> 16) + ((65536 - local12) * arg3 >> 16);
	}
}
