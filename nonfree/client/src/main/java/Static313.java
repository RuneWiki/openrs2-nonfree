import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Z")
	public static boolean aBoolean449 = true;

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)V")
	public static void method5161() {
		@Pc(5) Class198 local5 = Static170.aClass198_129;
		synchronized (Static170.aClass198_129) {
			Static170.aClass198_129.method5202(5);
		}
		local5 = Static245.aClass198_178;
		synchronized (Static245.aClass198_178) {
			Static245.aClass198_178.method5202(5);
		}
		local5 = Static142.aClass198_109;
		synchronized (Static142.aClass198_109) {
			Static142.aClass198_109.method5202(5);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public static void method5162() {
		if (Static51.aBoolean101) {
			return;
		}
		Static73.aBoolean138 = true;
		if (Static24.aBoolean37) {
			Static77.aFloat23 = (int) Static77.aFloat23 - 17 & 0xFFFFFFF0;
		} else {
			Static168.aFloat98 += (-12.0F - Static168.aFloat98) / 2.0F;
		}
		Static51.aBoolean101 = true;
	}
}
