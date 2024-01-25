import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!oi", name = "w", descriptor = "Lclient!us;")
	public static final Class344 aClass344_88 = new Class344(73, -1);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method6398() {
		Static2.method30(Static47.aClass33_3, (long) Static251.anInt5580);
		if (Static530.anInt9144 != -1) {
			Static518.method8298(Static530.anInt9144);
		}
		for (@Pc(18) int local18 = 0; local18 < Static457.anInt8300; local18++) {
			if (Static178.aBooleanArray12[local18]) {
				Static441.aBooleanArray17[local18] = true;
			}
			Static73.aBooleanArray3[local18] = Static178.aBooleanArray12[local18];
			Static178.aBooleanArray12[local18] = false;
		}
		Static499.anInt8835 = Static251.anInt5580;
		if (Static530.anInt9144 != -1) {
			Static457.anInt8300 = 0;
			Static522.method7467();
		}
		Static47.aClass33_3.la();
		Static608.method6804(Static47.aClass33_3);
		@Pc(60) int local60 = Static439.method6673();
		if (local60 == -1) {
			local60 = Static548.anInt9367;
		}
		if (local60 == -1) {
			local60 = Static219.anInt5059;
		}
		Static529.method7519(local60);
		Static550.anInt9371 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Z")
	public static boolean method6400(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)Z")
	public static boolean method6401() {
		return Static83.aBoolean604;
	}
}
