import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "F")
	public static float aFloat82;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public static int anInt2392 = 0;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Z")
	public static boolean aBoolean136 = true;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!im;)V")
	public static void method1794(@OriginalArg(1) Class1_Sub16 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static164.aClass14_4 != null) {
			try {
				Static164.aClass14_4.method236(0L);
				Static164.aClass14_4.method238(local13);
				@Pc(27) int local27;
				for (local27 = 0; local27 < 24 && local13[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(49) Exception local49) {
				for (@Pc(51) int local51 = 0; local51 < 24; local51++) {
					local13[local51] = -1;
				}
			}
		}
		arg0.method2623(24, local13);
	}
}
