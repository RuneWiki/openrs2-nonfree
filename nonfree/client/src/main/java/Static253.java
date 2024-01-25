import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_76 = new Class242(64, -1);

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method3569() {
		@Pc(1) Class77 local1 = Static309.aClass77_37;
		synchronized (Static309.aClass77_37) {
			Static309.aClass77_37.method1394();
		}
		local1 = Static185.aClass77_25;
		synchronized (Static185.aClass77_25) {
			Static185.aClass77_25.method1394();
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public static void method3570() {
		@Pc(9) int[] local9 = new int[Static285.aClass226_2.anInt5944];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static285.aClass226_2.anInt5944; local17++) {
			@Pc(24) Class135 local24 = Static285.aClass226_2.method4788(local17);
			if (local24.anInt3831 >= 0 || local24.anInt3819 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static442.anIntArray501 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static442.anIntArray501[local52] = local9[local52];
		}
	}
}
