import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt4588 = -2;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!qh;I)V")
	public static void method4070(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static174.aClass204_3 != null) {
			@Pc(20) int local20;
			try {
				Static174.aClass204_3.method4814(0L);
				Static174.aClass204_3.method4816(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method3084(24, local8);
	}
}
