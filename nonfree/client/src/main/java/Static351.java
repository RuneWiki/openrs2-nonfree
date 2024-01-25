import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!f;")
	public static Class46 aClass46_14;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt6124;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_5 = new Class260(8, 1);

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!ja;")
	public static final Class158 aClass158_10 = new Class158(0, 2, 2, 1);

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BFFIIIIFLclient!ss;ZFFI)V")
	public static void method5299(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) Class214 arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg6.method5127(local12, arg7 / (float) 16, arg8 / (float) 128, 0, arg3 * 127.0F, arg0, arg2 / (float) 128);
			local42 = arg4;
			arg3 *= arg5;
			arg7 *= 2.0F;
			arg2 *= 2.0F;
			arg8 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg1[local42] = (byte) ((float) arg1[local42] + local12[local60]);
				local42++;
			}
		}
		local42 = arg4;
		for (local60 = 0; local60 < 16384; local60++) {
			arg1[local42] = (byte) (arg1[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLclient!as;IIIZ)V")
	public static void method5300(@OriginalArg(0) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (Static407.anInt6912 >= 50 || (arg1 == null || arg1.anIntArrayArray2 == null || arg1.anIntArrayArray2.length <= arg0 || arg1.anIntArrayArray2[arg0] == null)) {
			return;
		}
		@Pc(40) int local40 = arg1.anIntArrayArray2[arg0][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(54) int local54 = local40 & 0x1F;
		@Pc(73) int local73;
		if (arg1.anIntArrayArray2[arg0].length > 1) {
			local73 = (int) (Math.random() * (double) arg1.anIntArrayArray2[arg0].length);
			if (local73 > 0) {
				local44 = arg1.anIntArrayArray2[arg0][local73];
			}
		}
		if (local54 == 0) {
			if (arg5) {
				if (arg1.aBoolean48) {
					Static544.method7134(255, 0, false, local50, local44);
					return;
				}
				Static34.method576(255, 0, local50, local44);
			}
		} else if (Static278.aClass3_Sub13_Sub1_1.anInt5139 != 0) {
			local73 = arg3 - 256 >> 9;
			@Pc(129) int local129 = arg2 - 256 >> 9;
			Static567.aClass232Array1[Static407.anInt6912++] = new Class232((byte) (arg1.aBoolean48 ? 2 : 1), local44, local50, 0, 255, (arg4 << 24) + (local73 << 16) + (local129 << 8) + local54);
		}
	}
}
