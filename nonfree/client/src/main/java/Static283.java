import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[520];

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
	public static int anInt5716 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4988(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static18.anInt359 > 0) {
			local21 = Static254.aByteArrayArray16[--Static18.anInt359];
			Static254.aByteArrayArray16[Static18.anInt359] = null;
			return local21;
		} else if (arg0 == 5000 && Static226.anInt5591 > 0) {
			local21 = Static174.aByteArrayArray21[--Static226.anInt5591];
			Static174.aByteArrayArray21[Static226.anInt5591] = null;
			return local21;
		} else if (arg0 == 30000 && Static39.anInt1002 > 0) {
			local21 = Static94.aByteArrayArray5[--Static39.anInt1002];
			Static94.aByteArrayArray5[Static39.anInt1002] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	public static void method4989(@OriginalArg(0) int arg0) {
		Static275.anInt5621 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static97.anInt1852; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static3.anInt38; local6++) {
				if (Static347.aClass83ArrayArrayArray3[arg0][local3][local6] == null) {
					Static347.aClass83ArrayArrayArray3[arg0][local3][local6] = new Class83(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V")
	public static void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(10, arg2);
		local8.method4783();
		local8.anInt5461 = arg0;
		local8.anInt5458 = arg1;
		local8.anInt5467 = arg3;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!wm;I)V")
	public static void method4991(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static282.anInt3516 < arg1.anInt4073) {
			Static174.method5038(arg1);
		} else if (Static282.anInt3516 > arg1.anInt4054) {
			Static49.method4615(false, arg1);
			local7 = Static294.anInt5915;
			local9 = Static189.anInt6106;
		} else {
			Static344.method5753(arg1);
		}
		if (arg1.anInt6728 < 128 || arg1.anInt6726 < 128 || arg1.anInt6728 >= Static43.anInt1151 * 128 - 128 || arg1.anInt6726 >= (Static260.anInt5348 - 1) * 128) {
			arg1.anInt4058 = -1;
			arg1.anInt4026 = -1;
			arg1.anInt4073 = 0;
			arg1.anInt4054 = 0;
			arg1.anInt6728 = arg1.anIntArray387[0] * 128 + arg1.method3402() * 64;
			arg1.anInt6726 = arg1.anIntArray388[0] * 128 + arg1.method3402() * 64;
			arg1.method3414();
		}
		if (Static127.aClass10_Sub1_Sub2_Sub2_1 == arg1 && (arg1.anInt6728 < 1536 || arg1.anInt6726 < 1536 || (Static43.anInt1151 - 12) * 128 <= arg1.anInt6728 || arg1.anInt6726 >= Static260.anInt5348 * 128 - 1536)) {
			arg1.anInt4058 = -1;
			arg1.anInt4026 = -1;
			arg1.anInt4073 = 0;
			arg1.anInt4054 = 0;
			arg1.anInt6728 = arg1.anIntArray387[0] * 128 + arg1.method3402() * 64;
			arg1.anInt6726 = arg1.anIntArray388[0] * 128 + arg1.method3402() * 64;
			arg1.method3414();
		}
		@Pc(196) int local196 = Static308.method5235(arg1);
		Static355.method5866(local196, local7, arg1, local9);
		Static203.method3688(arg1);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z")
	public static boolean method4992() {
		@Pc(10) Class3 local10 = Static224.aClass3_1;
		synchronized (Static224.aClass3_1) {
			if (Static267.anInt5495 == Static347.anInt6680) {
				return false;
			} else {
				Static136.anInt2694 = Static291.anIntArray566[Static347.anInt6680];
				Static276.aChar4 = Static76.aCharArray1[Static347.anInt6680];
				Static347.anInt6680 = Static347.anInt6680 + 1 & 0x7F;
				return true;
			}
		}
	}
}
