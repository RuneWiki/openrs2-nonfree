import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ke", name = "ne", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!ke", name = "me", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!ke", name = "oe", descriptor = "I")
	public static int anInt6144 = -1;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(FIFIIFLclient!qg;IBIF[BIF)V")
	public static void method5230(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) Class185 arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) byte[] arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg1;
			arg4.method5469(arg2 / (float) 128, arg8 / (float) 16, 0, arg0 * 127.0F, arg6 / (float) 128, arg5, local12);
			arg6 *= 2.0F;
			arg2 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg7[local18] = (byte) ((float) arg7[local18] + local12[local52]);
				local18++;
			}
			arg8 *= 2.0F;
			arg0 *= arg3;
		}
		local18 = arg1;
		for (local52 = 0; local52 < 16384; local52++) {
			arg7[local18] = (byte) (arg7[local18] + 127);
			local18++;
		}
	}
}
