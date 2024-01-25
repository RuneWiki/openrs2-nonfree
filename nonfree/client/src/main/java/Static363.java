import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
	public static int anInt6412;

	@OriginalMember(owner = "client!mu", name = "S", descriptor = "Lclient!rc;")
	public static Class298 aClass298_7;

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "I")
	public static int anInt6413 = 503;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "Lclient!uk;")
	public static final Class346 aClass346_4 = new Class346("LIVE", "", "", 0);

	@OriginalMember(owner = "client!mu", name = "L", descriptor = "I")
	public static int anInt6417 = -1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	public static void method5679() {
		if (!Static536.aBoolean732) {
			return;
		}
		while (true) {
			while (Static106.aClass166_Sub1Array1.length > Static635.anInt10309) {
				@Pc(26) Class166_Sub1 local26 = Static106.aClass166_Sub1Array1[Static635.anInt10309];
				if (local26 != null && local26.anInt8521 == -1) {
					if (Static339.aClass5_Sub44_2 == null) {
						Static339.aClass5_Sub44_2 = Static525.aClass340_1.method8132(local26.aString121);
					}
					@Pc(50) int local50 = Static339.aClass5_Sub44_2.anInt9280;
					if (local50 == -1) {
						return;
					}
					Static339.aClass5_Sub44_2 = null;
					Static635.anInt10309++;
					local26.anInt8521 = local50;
				} else {
					Static635.anInt10309++;
				}
			}
			return;
		}
	}
}
