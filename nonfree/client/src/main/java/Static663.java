import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_248 = new Class359(17, 2);

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Lclient!dg;")
	public static final Class81 aClass81_18 = new Class81();

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!mc;B)V")
	public static void method8838(@OriginalArg(0) Class5_Sub41 arg0) {
		@Pc(11) byte[] local11 = new byte[24];
		if (Static573.aClass151_9 != null) {
			@Pc(23) int local23;
			try {
				Static573.aClass151_9.method3649(0L);
				Static573.aClass151_9.method3646(local11);
				for (local23 = 0; local23 < 24 && local11[local23] == 0; local23++) {
				}
				if (local23 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local23 = 0; local23 < 24; local23++) {
					local11[local23] = -1;
				}
			}
		}
		arg0.method7837(0, 24, local11);
	}
}
