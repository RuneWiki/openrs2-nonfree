import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
	public static int anInt2313;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z[BLjava/io/File;I)V")
	public static void method2179(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1, @OriginalArg(3) int arg2) throws IOException {
		@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local19.readFully(arg0, 0, arg2);
		} catch (@Pc(26) EOFException local26) {
		}
		local19.close();
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(BII)Z")
	public static boolean method2180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)Z")
	public static boolean method2181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)I")
	public static int method2182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(34) byte local34;
		if (arg1 > 20000) {
			Static354.method5383();
			local34 = 4;
		} else if (arg1 > 10000) {
			local34 = 3;
			Static682.method9410();
		} else if (arg1 <= 5000) {
			local34 = 1;
			Static620.method8714();
		} else {
			Static285.method4778();
			local34 = 2;
		}
		if (arg0 != Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801()) {
			Static181.aClass14_Sub26_9.method5270(arg0, Static181.aClass14_Sub26_9.aClass43_Sub1_2);
			Static459.method8986(false, arg0);
		}
		Static574.method8188();
		return local34;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIILclient!pka;IIIII)Z")
	public static boolean method2183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class289 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg8;
		@Pc(16) int local16 = arg4 - 64;
		Static384.anIntArrayArray45[64][64] = 99;
		@Pc(26) int local26 = arg8 - 64;
		Static3.anIntArrayArray1[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static465.anIntArray413[0] = arg4;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static581.anIntArray499[0] = arg8;
		@Pc(55) int[][] local55 = arg5.anIntArrayArray52;
		while (local47 != local50) {
			local7 = Static581.anIntArray499[local47];
			local5 = Static465.anIntArray413[local47];
			local47 = local47 + 1 & 0xFFF;
			@Pc(75) int local75 = local5 - local16;
			@Pc(80) int local80 = local7 - local26;
			@Pc(86) int local86 = local5 - arg5.anInt8133;
			@Pc(92) int local92 = local7 - arg5.anInt8117;
			if (arg0 == -4) {
				if (arg7 == local5 && arg9 == local7) {
					Static447.anInt7500 = local5;
					Static131.anInt2079 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static303.method6871(arg7, 2, arg9, arg6, arg3, 2, local7, local5)) {
					Static447.anInt7500 = local5;
					Static131.anInt2079 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg5.method7087(2, arg7, arg9, local5, arg1, arg3, arg6, local7, 2)) {
					Static131.anInt2079 = local7;
					Static447.anInt7500 = local5;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg5.method7072(arg1, local7, local5, arg6, arg7, 2, arg3, arg9)) {
					Static131.anInt2079 = local7;
					Static447.anInt7500 = local5;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg5.method7086(arg0, local7, 2, local5, arg2, arg9, arg7)) {
					Static131.anInt2079 = local7;
					Static447.anInt7500 = local5;
					return true;
				}
			} else if (arg5.method7080(local5, arg0, arg7, arg2, arg9, 2, local7)) {
				Static131.anInt2079 = local7;
				Static447.anInt7500 = local5;
				return true;
			}
			@Pc(265) int local265 = Static3.anIntArrayArray1[local75][local80] + 1;
			if (local75 > 0 && Static384.anIntArrayArray45[local75 - 1][local80] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static465.anIntArray413[local50] = local5 - 1;
				Static581.anIntArray499[local50] = local7;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local75 - 1][local80] = 2;
				Static3.anIntArrayArray1[local75 - 1][local80] = local265;
			}
			if (local75 < 126 && Static384.anIntArrayArray45[local75 + 1][local80] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static465.anIntArray413[local50] = local5 + 1;
				Static581.anIntArray499[local50] = local7;
				Static384.anIntArrayArray45[local75 + 1][local80] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local75 + 1][local80] = local265;
			}
			if (local80 > 0 && Static384.anIntArrayArray45[local75][local80 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static465.anIntArray413[local50] = local5;
				Static581.anIntArray499[local50] = local7 - 1;
				Static384.anIntArrayArray45[local75][local80 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local75][local80 - 1] = local265;
			}
			if (local80 < 126 && Static384.anIntArrayArray45[local75][local80 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static465.anIntArray413[local50] = local5;
				Static581.anIntArray499[local50] = local7 + 1;
				Static384.anIntArrayArray45[local75][local80 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static3.anIntArrayArray1[local75][local80 + 1] = local265;
			}
			if (local75 > 0 && local80 > 0 && Static384.anIntArrayArray45[local75 - 1][local80 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static465.anIntArray413[local50] = local5 - 1;
				Static581.anIntArray499[local50] = local7 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local75 - 1][local80 - 1] = 3;
				Static3.anIntArrayArray1[local75 - 1][local80 - 1] = local265;
			}
			if (local75 < 126 && local80 > 0 && Static384.anIntArrayArray45[local75 + 1][local80 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static465.anIntArray413[local50] = local5 + 1;
				Static581.anIntArray499[local50] = local7 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local75 + 1][local80 - 1] = 9;
				Static3.anIntArrayArray1[local75 + 1][local80 - 1] = local265;
			}
			if (local75 > 0 && local80 < 126 && Static384.anIntArrayArray45[local75 - 1][local80 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static465.anIntArray413[local50] = local5 - 1;
				Static581.anIntArray499[local50] = local7 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local75 - 1][local80 + 1] = 6;
				Static3.anIntArrayArray1[local75 - 1][local80 + 1] = local265;
			}
			if (local75 < 126 && local80 < 126 && Static384.anIntArrayArray45[local75 + 1][local80 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static465.anIntArray413[local50] = local5 + 1;
				Static581.anIntArray499[local50] = local7 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static384.anIntArrayArray45[local75 + 1][local80 + 1] = 12;
				Static3.anIntArrayArray1[local75 + 1][local80 + 1] = local265;
			}
		}
		Static447.anInt7500 = local5;
		Static131.anInt2079 = local7;
		return false;
	}
}
