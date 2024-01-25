import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
	public static int anInt5170;

	@OriginalMember(owner = "client!laa", name = "H", descriptor = "Z")
	public static boolean aBoolean348;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
	public static int anInt5165 = 0;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!laa", name = "y", descriptor = "I")
	public static int anInt5173 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
	public static void method4417() {
		if (Static32.aBoolean102) {
			return;
		}
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean324) {
			Static362.aFloat128 = (int) Static362.aFloat128 + 47 & 0xFFFFFFF0;
		} else {
			Static404.aFloat203 += (12.0F - Static404.aFloat203) / 2.0F;
		}
		Static32.aBoolean102 = true;
		Static126.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	public static void method4418() {
		Static407.method6109(Static478.aClass9_10, (long) Static416.anInt7252);
		if (Static85.anInt2201 != -1) {
			Static136.method2912(Static85.anInt2201);
		}
		for (@Pc(21) int local21 = 0; local21 < Static361.anInt6491; local21++) {
			if (Static145.aBooleanArray14[local21]) {
				Static44.aBooleanArray8[local21] = true;
			}
			Static547.aBooleanArray42[local21] = Static145.aBooleanArray14[local21];
			Static145.aBooleanArray14[local21] = false;
		}
		Static358.anInt2385 = Static416.anInt7252;
		if (Static478.aClass9_10.method7640()) {
			Static256.aBoolean338 = true;
		}
		if (Static85.anInt2201 != -1) {
			Static361.anInt6491 = 0;
			Static27.method1183();
		}
		Static478.aClass9_10.n();
		Static199.method3709(Static478.aClass9_10);
		@Pc(72) int local72 = Static364.method5664();
		if (local72 == -1) {
			local72 = Static151.anInt3437;
		}
		if (local72 == -1) {
			local72 = Static59.anInt1653;
		}
		Static414.method6199(local72);
		Static309.anInt5936 = 0;
	}
}
