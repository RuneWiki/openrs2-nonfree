import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lclient!pe;")
	public static Class196 aClass196_1;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_110 = new Class142("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	public static void method5437(@OriginalArg(1) boolean arg0) {
		Static447.method5755(Static40.anInt597, Static192.anInt3532, arg0, Static118.anInt1785);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IFLclient!sm;IIIFIF[BFIFI)V")
	public static void method5438(@OriginalArg(1) float arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) byte[] arg6, @OriginalArg(10) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg1.method128(arg7 / (float) 128, arg5 / (float) 128, arg3, arg0 / (float) 16, 0, arg8 * 127.0F, local12);
			local42 = arg2;
			arg5 *= 2.0F;
			arg8 *= arg4;
			arg0 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg6[local42] = (byte) ((float) arg6[local42] + local12[local56]);
				local42++;
			}
			arg7 *= 2.0F;
		}
		local42 = arg2;
		for (local56 = 0; local56 < 16384; local56++) {
			arg6[local42] = (byte) (arg6[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[BII)I")
	public static int method5439(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = -1;
		for (@Pc(21) int local21 = arg0; local21 < arg2; local21++) {
			local19 = Class1_Sub2_Sub9.anIntArray164[(local19 ^ arg1[local21]) & 0xFF] ^ local19 >>> 8;
		}
		return ~local19;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static281.anInt4757 <= arg1 && arg6 <= Static457.anInt7264 && arg4 >= Static142.anInt2163 && Static182.anInt3402 >= arg0) {
			Static363.method4763(arg2, arg1, arg3, arg0, arg6, arg4, arg5);
		} else {
			Static107.method1329(arg0, arg6, arg3, arg1, arg2, arg4, arg5);
		}
	}
}
