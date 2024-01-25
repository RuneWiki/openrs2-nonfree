import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "(I)V")
	public static void method2860() {
		@Pc(7) Class31 local7 = null;
		try {
			@Pc(13) Class331 local13 = Static352.aClass272_2.method6125(true, "2");
			while (local13.anInt8818 == 0) {
				Static318.method4952(1L);
			}
			if (local13.anInt8818 == 1) {
				local7 = (Class31) local13.anObject18;
				@Pc(40) byte[] local40 = new byte[(int) local7.method1003()];
				@Pc(54) int local54;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local54) {
					local54 = local7.method1004(local42, local40, local40.length - local42);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static451.method6358(new Class6_Sub21(local40));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local7 != null) {
				local7.method1007();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}
}
