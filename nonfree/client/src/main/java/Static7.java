import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "Lclient!an;")
	public static Class16 aClass16_118;

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage14;

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
	public static int anInt9361 = 0;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "([BI)[B")
	public static byte[] method7757(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class12_Sub8 local8 = new Class12_Sub8(arg0);
		@Pc(12) int local12 = local8.method5216();
		@Pc(21) int local21 = local8.method5225();
		if (local21 < 0 || Static502.anInt9058 != 0 && Static502.anInt9058 < local21) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(87) byte[] local87 = new byte[local21];
			local8.method5181(local21, local87);
			return local87;
		} else {
			@Pc(41) int local41 = local8.method5225();
			if (local41 < 0 || Static502.anInt9058 != 0 && Static502.anInt9058 < local41) {
				throw new RuntimeException();
			}
			@Pc(55) byte[] local55 = new byte[local41];
			if (local12 == 1) {
				Static373.method5755(local55, local41, arg0, local21);
			} else {
				@Pc(62) Class196 local62 = Static103.aClass196_1;
				synchronized (Static103.aClass196_1) {
					Static103.aClass196_1.method4720(local8, local55);
				}
			}
			return local55;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZ)Z")
	public static boolean method7758(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}
}
