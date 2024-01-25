import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public static int anInt10526 = 1;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!et;I)V")
	public static void method9219(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static70.aClass260_1 != null) {
			@Pc(20) int local20;
			try {
				Static70.aClass260_1.method6257(0L);
				Static70.aClass260_1.method6261(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(52) Exception local52) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method8565(local8, 0, 24);
	}
}
