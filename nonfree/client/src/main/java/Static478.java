import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public static int anInt8414 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public static void method7046() {
		for (@Pc(12) int local12 = 0; local12 < Static530.anInt9223; local12++) {
			@Pc(18) Class343 local18 = Static433.aClass343Array1[local12];
			if (local18.aByte125 == 3) {
				if (local18.aClass6_Sub4_Sub5_4 == null) {
					local18.anInt9814 = Integer.MIN_VALUE;
				} else {
					Static152.aClass6_Sub4_Sub3_2.method5197(local18.aClass6_Sub4_Sub5_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method7047(@OriginalArg(1) File arg0) {
		return Static640.method8745(arg0, (int) arg0.length());
	}
}
