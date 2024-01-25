import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "[I")
	public static final int[] anIntArray503 = new int[4096];

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
	public static int anInt8110 = -1;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lclient!fca;I)V")
	public static void method6822(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static30.aClass251_7 != null) {
			@Pc(20) int local20;
			try {
				Static30.aClass251_7.method5751(0L);
				Static30.aClass251_7.method5749(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method4838(0, 24, local8);
	}
}
