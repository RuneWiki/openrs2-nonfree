import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_8 = new Class67("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ao", name = "m", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!qp;IIFIF[BBFIIIFF)V")
	public static void method659(@OriginalArg(0) Class248 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg0.method7155(arg2 * 127.0F, arg8 / (float) 128, arg3 / (float) 128, arg5 / (float) 16, arg6, local12, 0);
			local42 = arg1;
			for (local44 = 0; local44 < 16384; local44++) {
				arg4[local42] = (byte) ((float) arg4[local42] + local12[local44]);
				local42++;
			}
			arg3 *= 2.0F;
			arg8 *= 2.0F;
			arg5 *= 2.0F;
			arg2 *= arg7;
		}
		local42 = arg1;
		for (local44 = 0; local44 < 16384; local44++) {
			arg4[local42] -= -127;
			local42++;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method660() {
		Static12.anIntArray111 = Static346.method5507(0.4F);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[B")
	public static byte[] method661(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub10_Sub9 local12 = (Class3_Sub10_Sub9) Static270.aClass168_2.method4551((long) arg0);
		if (local12 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(50) int local50 = 255 - local43;
				@Pc(55) int local55 = Static500.method7215(local28, local50);
				@Pc(59) byte local59 = local22[local55];
				local22[local55] = local22[local50];
				local22[local50] = local22[511 - local43] = local59;
			}
			local12 = new Class3_Sub10_Sub9(local22);
			Static270.aClass168_2.method4547((long) arg0, local12);
		}
		return local12.aByteArray47;
	}
}
