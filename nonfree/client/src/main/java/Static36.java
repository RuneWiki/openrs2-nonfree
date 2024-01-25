import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
	public static int[] anIntArray86 = new int[2];

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!ec;)V")
	public static void method635(@OriginalArg(1) Class6_Sub10 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static207.aClass174_2 != null) {
			@Pc(25) int local25;
			try {
				Static207.aClass174_2.method4530(0L);
				Static207.aClass174_2.method4527(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method4014(local13, 24);
	}
}
