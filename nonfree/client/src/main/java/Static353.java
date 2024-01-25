import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Lclient!um;")
	public static Class243 aClass243_201;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method4566() {
		@Pc(17) int local17 = Static216.aClass1_Sub1_1.method3589(Static146.anInt2644);
		if (local17 == 0) {
			Static264.aByteArrayArrayArray15 = null;
			Static51.method810(0);
		} else if (local17 == 1) {
			Static226.method2976((byte) 0);
			Static51.method810(512);
			if (Static452.aByteArrayArrayArray16 != null) {
				Static106.method5683();
			}
		} else {
			Static226.method2976((byte) (Static409.anInt6832 - 4 & 0xFF));
			Static51.method810(2);
		}
		Static230.anInt7229 = Static6.anInt131;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([[BLclient!ks;I)V")
	public static void method4568(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class113_Sub1 arg1) {
		@Pc(6) int local6 = Static160.aByteArrayArray7.length;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(16) byte[] local16 = arg0[local8];
			if (local16 != null) {
				@Pc(29) int local29 = (Static362.anIntArray418[local8] >> 8) * 64 - Static31.anInt618;
				@Pc(40) int local40 = (Static362.anIntArray418[local8] & 0xFF) * 64 - Static226.anInt3768;
				Static341.method4427();
				arg1.method2986(local16, local40, Static407.aClass200_9, Static163.aClass240Array1, local29);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static239.anIntArrayArrayArray15[arg0][local16][local20] == -Static138.anInt2465) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static419.anInt6980) + 1;
			@Pc(142) int local142 = (arg3 << Static419.anInt6980) + 2;
			@Pc(151) int local151 = Static410.aClass125Array3[arg0].ua(arg1, arg3) + arg5;
			if (!Static408.method5397(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static419.anInt6980) - 1;
			if (!Static408.method5397(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static419.anInt6980) - 1;
			if (!Static408.method5397(local20, local151, local177)) {
				return false;
			} else if (Static408.method5397(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static243.method3145(arg0, arg1, arg3)) {
			local16 = arg1 << Static419.anInt6980;
			local20 = arg3 << Static419.anInt6980;
			return Static408.method5397(local16 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static408.method5397(local16 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static408.method5397(local16 + Static92.anInt1592 - 1, Static410.aClass125Array3[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static92.anInt1592 - 1) && Static408.method5397(local16 + 1, Static410.aClass125Array3[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static92.anInt1592 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public static void method4571(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static369.anInt6043 = arg0;
	}
}
