import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_140 = new Class73(33, 0);

	@OriginalMember(owner = "client!rba", name = "sb", descriptor = "I")
	public static int anInt7701 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BLclient!ji;)V")
	public static void method6302(@OriginalArg(1) Class6_Sub21 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static306.aClass257_3 != null) {
			@Pc(20) int local20;
			try {
				Static306.aClass257_3.method5941(0L);
				Static306.aClass257_3.method5935(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method6063(local8, 24);
	}
}
