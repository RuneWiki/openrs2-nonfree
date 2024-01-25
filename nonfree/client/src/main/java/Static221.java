import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[I")
	public static final int[] anIntArray223 = new int[16];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
	public static boolean method3809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static614.method8657(arg0, arg1) | (arg0 & 0x70000) != 0 || Static63.method1036(arg0, arg1);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBI)Z")
	public static boolean method3810(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIBLclient!pka;I)Z")
	public static boolean method3811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class289 arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg6;
		@Pc(7) int local7 = arg1;
		@Pc(15) int local15 = arg6 - 64;
		@Pc(20) int local20 = arg1 - 64;
		Static384.anIntArrayArray45[64][64] = 99;
		Static3.anIntArrayArray1[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static465.anIntArray413[0] = arg6;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static581.anIntArray499[0] = arg1;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray52;
		while (local48 != local51) {
			local7 = Static581.anIntArray499[local48];
			local5 = Static465.anIntArray413[local48];
			@Pc(69) int local69 = local7 - local20;
			@Pc(73) int local73 = local5 - local15;
			@Pc(79) int local79 = local7 - arg8.anInt8117;
			local48 = local48 + 1 & 0xFFF;
			@Pc(91) int local91 = local5 - arg8.anInt8133;
			if (arg2 == -4) {
				if (arg4 == local5 && local7 == arg7) {
					Static447.anInt7500 = local5;
					Static131.anInt2079 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static303.method6871(arg4, 1, arg7, arg5, arg9, 1, local7, local5)) {
					Static447.anInt7500 = local5;
					Static131.anInt2079 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg8.method7087(1, arg4, arg7, local5, arg3, arg9, arg5, local7, 1)) {
					Static447.anInt7500 = local5;
					Static131.anInt2079 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg8.method7072(arg3, local7, local5, arg5, arg4, 1, arg9, arg7)) {
					Static131.anInt2079 = local7;
					Static447.anInt7500 = local5;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg8.method7086(arg2, local7, 1, local5, arg0, arg7, arg4)) {
					Static131.anInt2079 = local7;
					Static447.anInt7500 = local5;
					return true;
				}
			} else if (arg8.method7080(local5, arg2, arg4, arg0, arg7, 1, local7)) {
				Static447.anInt7500 = local5;
				Static131.anInt2079 = local7;
				return true;
			}
			@Pc(270) int local270 = Static3.anIntArrayArray1[local73][local69] + 1;
			if (local73 > 0 && Static384.anIntArrayArray45[local73 - 1][local69] == 0 && (local56[local91 - 1][local79] & 0x42240000) == 0) {
				Static465.anIntArray413[local51] = local5 - 1;
				Static581.anIntArray499[local51] = local7;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local73 - 1][local69] = 2;
				Static3.anIntArrayArray1[local73 - 1][local69] = local270;
			}
			if (local73 < 127 && Static384.anIntArrayArray45[local73 + 1][local69] == 0 && (local56[local91 + 1][local79] & 0x60240000) == 0) {
				Static465.anIntArray413[local51] = local5 + 1;
				Static581.anIntArray499[local51] = local7;
				Static384.anIntArrayArray45[local73 + 1][local69] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local73 + 1][local69] = local270;
			}
			if (local69 > 0 && Static384.anIntArrayArray45[local73][local69 - 1] == 0 && (local56[local91][local79 - 1] & 0x40A40000) == 0) {
				Static465.anIntArray413[local51] = local5;
				Static581.anIntArray499[local51] = local7 - 1;
				Static384.anIntArrayArray45[local73][local69 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local73][local69 - 1] = local270;
			}
			if (local69 < 127 && Static384.anIntArrayArray45[local73][local69 + 1] == 0 && (local56[local91][local79 + 1] & 0x48240000) == 0) {
				Static465.anIntArray413[local51] = local5;
				Static581.anIntArray499[local51] = local7 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local73][local69 + 1] = 4;
				Static3.anIntArrayArray1[local73][local69 + 1] = local270;
			}
			if (local73 > 0 && local69 > 0 && Static384.anIntArrayArray45[local73 - 1][local69 - 1] == 0 && (local56[local91 - 1][local79 - 1] & 0x43A40000) == 0 && (local56[local91 - 1][local79] & 0x42240000) == 0 && (local56[local91][local79 - 1] & 0x40A40000) == 0) {
				Static465.anIntArray413[local51] = local5 - 1;
				Static581.anIntArray499[local51] = local7 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local73 - 1][local69 - 1] = 3;
				Static3.anIntArrayArray1[local73 - 1][local69 - 1] = local270;
			}
			if (local73 < 127 && local69 > 0 && Static384.anIntArrayArray45[local73 + 1][local69 - 1] == 0 && (local56[local91 + 1][local79 - 1] & 0x60E40000) == 0 && (local56[local91 + 1][local79] & 0x60240000) == 0 && (local56[local91][local79 - 1] & 0x40A40000) == 0) {
				Static465.anIntArray413[local51] = local5 + 1;
				Static581.anIntArray499[local51] = local7 - 1;
				Static384.anIntArrayArray45[local73 + 1][local69 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local73 + 1][local69 - 1] = local270;
			}
			if (local73 > 0 && local69 < 127 && Static384.anIntArrayArray45[local73 - 1][local69 + 1] == 0 && (local56[local91 - 1][local79 + 1] & 0x4E240000) == 0 && (local56[local91 - 1][local79] & 0x42240000) == 0 && (local56[local91][local79 + 1] & 0x48240000) == 0) {
				Static465.anIntArray413[local51] = local5 - 1;
				Static581.anIntArray499[local51] = local7 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local73 - 1][local69 + 1] = 6;
				Static3.anIntArrayArray1[local73 - 1][local69 + 1] = local270;
			}
			if (local73 < 127 && local69 < 127 && Static384.anIntArrayArray45[local73 + 1][local69 + 1] == 0 && (local56[local91 + 1][local79 + 1] & 0x78240000) == 0 && (local56[local91 + 1][local79] & 0x60240000) == 0 && (local56[local91][local79 + 1] & 0x48240000) == 0) {
				Static465.anIntArray413[local51] = local5 + 1;
				Static581.anIntArray499[local51] = local7 + 1;
				Static384.anIntArrayArray45[local73 + 1][local69 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local73 + 1][local69 + 1] = local270;
			}
		}
		Static131.anInt2079 = local7;
		Static447.anInt7500 = local5;
		return false;
	}
}
