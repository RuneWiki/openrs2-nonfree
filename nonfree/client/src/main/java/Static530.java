import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	public static int anInt8404;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[8];

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Z")
	public static boolean aBoolean724 = false;

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	public static void method7454() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static426.anInt6942; local16++) {
			for (@Pc(20) int local20 = 0; local20 < Static280.anInt6752; local20++) {
				if (Static388.method5814(true, local16, Static632.aClass311ArrayArrayArray3, local20, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
