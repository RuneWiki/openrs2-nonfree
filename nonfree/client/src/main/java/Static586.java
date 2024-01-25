import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!ska", name = "n", descriptor = "Lclient!dca;")
	public static Class76 aClass76_8;

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IIIIIII)V")
	public static void method8129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 != 0) {
			method8129(2, 60, 120, 83, -93, -116, -106);
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(arg0 ^ 0x1) != 0 && arg4 != 0 && Static66.anInt1152 < 50 && arg2 != -1) {
			Static461.aClass177Array1[Static66.anInt1152++] = new Class177((byte) 1, arg2, arg4, arg6, arg3, arg5, arg1, (Class4_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(F[BFFFIILclient!qa;IIIFII)V")
	public static void method8130(@OriginalArg(0) float arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class111 arg6, @OriginalArg(8) int arg7, @OriginalArg(11) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg5;
			arg6.method2431(0, arg3 * 127.0F, arg2 / (float) 128, arg4 / (float) 128, arg8 / (float) 16, arg7, local12);
			arg3 *= arg0;
			arg2 *= 2.0F;
			arg8 *= 2.0F;
			arg4 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg1[local18] = (byte) (int) ((float) arg1[local18] + local12[local60]);
				local18++;
			}
		}
		local18 = arg5;
		if (-92 <= -105) {
			method8129(-48, -116, 32, -47, -19, 56, -39);
		}
		for (local60 = 0; local60 < 16384; local60++) {
			arg1[local18] = (byte) (arg1[local18] + 127);
			local18++;
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method8131(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub20 local8 = new Class2_Sub20(arg0);
		@Pc(19) int local19 = local8.method8581(-17416);
		@Pc(23) int local23 = local8.method8555(-9372);
		if (local23 < 0 || Static333.anInt5081 != 0 && local23 > Static333.anInt5081) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(51) byte[] local51 = new byte[local23];
			local8.method8573(local23, 0, local51);
			return local51;
		} else {
			@Pc(63) int local63 = local8.method8555(-9372);
			if (local63 < 0 || Static333.anInt5081 != 0 && Static333.anInt5081 < local63) {
				throw new RuntimeException();
			}
			@Pc(86) byte[] local86 = new byte[local63];
			if (local19 == 1) {
				Static318.method4429(local86, local63, arg0, local23);
			} else {
				@Pc(91) Class214 local91 = Static533.aClass214_1;
				synchronized (Static533.aClass214_1) {
					Static533.aClass214_1.method4740(local8, local86);
				}
			}
			return local86;
		}
	}
}
