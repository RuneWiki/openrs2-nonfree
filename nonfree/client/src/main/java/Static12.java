import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt193;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_1 = new Class312("", 18);

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[S")
	private static final short[] aShortArray11 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "[S")
	private static final short[] aShortArray14 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "[S")
	private static final short[] aShortArray12 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "[S")
	private static final short[] aShortArray13 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { aShortArray14, aShortArray12, aShortArray11, aShortArray13 };

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)Lclient!fia;")
	public static Class117 method146(@OriginalArg(0) int arg0) {
		@Pc(6) Class117[] local6 = Static629.method8705();
		for (@Pc(21) int local21 = 0; local21 < local6.length; local21++) {
			if (arg0 == local6[local21].anInt3284) {
				return local6[local21];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)Z")
	public static boolean method149() {
		try {
			@Pc(7) Class154 local7 = new Class154();
			@Pc(17) byte[] local17 = local7.method3608(Static630.aByteArray106);
			Static183.method3128(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
	public static boolean method150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FFIIIFIZ)[F")
	public static float[] method151(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		@Pc(77) float[] local77 = new float[9];
		@Pc(79) float local79 = 1.0F;
		@Pc(81) float local81 = 0.0F;
		@Pc(86) float local86 = (float) arg3 / 32767.0F;
		@Pc(96) float local96 = -((float) Math.sqrt((double) (1.0F - local86 * local86)));
		@Pc(101) float local101 = 1.0F - local86;
		@Pc(112) float local112 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local112 == 0.0F && local86 == 0.0F) {
			local9 = local6;
		} else {
			if (local112 != 0.0F) {
				local79 = (float) -arg4 / local112;
				local81 = (float) arg2 / local112;
			}
			local77[4] = local86;
			local77[7] = local96 * -local79;
			local77[0] = local79 * local79 * local101 + local86;
			local77[8] = local86 + local101 * local81 * local81;
			local77[6] = local79 * local81 * local101;
			local77[2] = local101 * local81 * local79;
			local77[1] = local81 * local96;
			local77[3] = -local81 * local96;
			local77[5] = local79 * local96;
			local9[0] = local6[2] * local77[6] + local77[0] * local6[0] + local77[3] * local6[1];
			local9[1] = local77[7] * local6[2] + local6[1] * local77[4] + local77[1] * local6[0];
			local9[2] = local77[8] * local6[2] + local77[2] * local6[0] + local77[5] * local6[1];
			local9[3] = local6[5] * local77[6] + local6[4] * local77[3] + local6[3] * local77[0];
			local9[4] = local6[5] * local77[7] + local6[4] * local77[4] + local6[3] * local77[1];
			local9[5] = local6[3] * local77[2] + local6[4] * local77[5] + local6[5] * local77[8];
			local9[6] = local77[3] * local6[7] + local77[0] * local6[6] + local77[6] * local6[8];
			local9[7] = local6[6] * local77[1] + local6[7] * local77[4] + local77[7] * local6[8];
			local9[8] = local6[6] * local77[2] + local6[7] * local77[5] + local77[8] * local6[8];
		}
		local9[6] *= arg0;
		local9[7] *= arg0;
		local9[8] *= arg0;
		local9[3] *= arg1;
		local9[5] *= arg1;
		local9[4] *= arg1;
		local9[0] *= arg5;
		local9[2] *= arg5;
		local9[1] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public static void method152(@OriginalArg(0) int arg0) {
		Static417.anInt6978 = arg0;
	}
}
