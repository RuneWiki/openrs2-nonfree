import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Lclient!ni;")
	public static Class89 aClass89_1;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZII)I")
	public static int method6701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(28) int local28 = Static510.method7643(local7, local17);
		@Pc(35) int local35 = Static510.method7643(local7 + 1, local17);
		@Pc(42) int local42 = Static510.method7643(local7, local17 + 1);
		@Pc(51) int local51 = Static510.method7643(local7 + 1, local17 - -1);
		@Pc(64) int local64 = Static411.method6655(arg1, local35, local28, local13);
		@Pc(71) int local71 = Static411.method6655(arg1, local51, local42, local13);
		return Static411.method6655(arg1, local71, local64, local23);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZI)B")
	public static byte method6702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([[BILclient!iaa;)V")
	public static void method6703(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class152_Sub1 arg1) {
		@Pc(6) int local6 = Static558.aByteArrayArray26.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(16) byte[] local16 = arg0[local8];
			if (local16 != null) {
				@Pc(29) int local29 = (Static478.anIntArray584[local8] >> 8) * 64 - Static230.anInt4667;
				@Pc(39) int local39 = (Static478.anIntArray584[local8] & 0xFF) * 64 - Static563.anInt10006;
				Static129.method8413();
				arg1.method3664(local29, local39, Static403.aClass350Array1, Static546.aClass15_16, local16);
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6705(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 512 || arg6 < 512 || (Static460.anInt8640 - 2) * 512 < arg3 || arg6 > (Static292.anInt7682 - 2) * 512) {
			Static580.anIntArray664[0] = Static580.anIntArray664[1] = -1;
			return;
		}
		@Pc(48) int local48 = Static274.method4782(arg6, arg5, arg3) - arg0;
		Static574.aClass255_9.G(arg1, 0, 0);
		Static546.aClass15_16.method5291(Static574.aClass255_9);
		Static546.aClass15_16.na(arg3, local48, arg6, Static580.anIntArray664);
		Static574.aClass255_9.G(-arg1, 0, 0);
		Static546.aClass15_16.method5291(Static574.aClass255_9);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!dg;B)V")
	public static void method6706(@OriginalArg(0) Class2_Sub2_Sub1_Sub1 arg0) {
		@Pc(18) Class3_Sub37 local18 = (Class3_Sub37) Static521.aClass25_39.method946((long) arg0.anInt7603);
		if (local18 == null) {
			Static93.method2098(arg0.anIntArray487[0], null, null, 0, arg0, arg0.aByte103, arg0.anIntArray488[0]);
		} else {
			local18.method5842();
		}
	}
}
