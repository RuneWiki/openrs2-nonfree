import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!th", name = "c", descriptor = "I")
	public static int anInt8080;

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
	public static final int[] anIntArray739 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!gn;)V")
	public static void method7128(@OriginalArg(0) Class20_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort124; local2 <= arg0.aShort126; local2++) {
			for (@Pc(6) int local6 = arg0.aShort123; local6 <= arg0.aShort125; local6++) {
				@Pc(16) Class64 local16 = Static263.aClass64ArrayArrayArray3[arg0.aByte108][local2][local6];
				if (local16 != null) {
					@Pc(21) Class232 local21 = local16.aClass232_2;
					@Pc(23) Class232 local23 = null;
					while (local21 != null) {
						if (local21.aClass20_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass232_2 = local21.aClass232_3;
							} else {
								local23.aClass232_3 = local21.aClass232_3;
							}
							local21.method6157();
							break;
						}
						local23 = local21;
						local21 = local21.aClass232_3;
					}
					local16.aByte32 = 0;
					for (@Pc(56) Class232 local56 = local16.aClass232_2; local56 != null; local56 = local56.aClass232_3) {
						local16.aByte32 = (byte) (local16.aByte32 | local56.anInt6822);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B[FI)[F")
	public static float[] method7129(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static556.method7042(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
