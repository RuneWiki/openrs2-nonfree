import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
	public static int anInt324;

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "Lclient!cr;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_9 = new Class268(72, 2);

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
	public static int anInt323 = -1;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(BI)V")
	public static void method334() {
		@Pc(9) Class166 local9 = Static3.aClass166_1;
		synchronized (Static3.aClass166_1) {
			Static3.aClass166_1.method4809(5);
		}
		local9 = Static553.aClass166_54;
		synchronized (Static553.aClass166_54) {
			Static553.aClass166_54.method4809(5);
		}
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Z)V")
	public static void method335() {
		Static335.aClass302Array1 = null;
		if (Static389.aBoolean497 && Static323.method5374() != 1) {
			Static152.method4570(0, Static554.anInt1821 == 3 || Static554.anInt1821 == 7, Static450.method6939(), 0, Static185.method3355());
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (Static389.aBoolean497) {
			local34 = Static240.method4161();
			local36 = Static452.method6945();
		}
		Static200.method3540(Static321.anInt6137 + local34, local34, local36 + Static356.anInt6630, local36, -1, local36, local34, Static554.anInt1822);
		if (Static335.aClass302Array1 != null) {
			Static539.method7921(Static356.anInt6630 + local36, Static228.aClass302_30.anInt8810, local36, -1412584499, Static326.anInt6219, local34 + Static321.anInt6137, true, Static335.aClass302Array1, Static88.anInt1823, local34);
			Static335.aClass302Array1 = null;
		}
	}
}
