import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method5458() {
		Static22.method525(Static415.aClass39_11, (long) Static378.anInt4244);
		if (Static407.anInt6564 != -1) {
			Static164.method2646(Static407.anInt6564);
		}
		for (@Pc(19) int local19 = 0; local19 < Static121.anInt2467; local19++) {
			if (Static71.aBooleanArray25[local19]) {
				Static391.aBooleanArray46[local19] = true;
			}
			Static193.aBooleanArray27[local19] = Static71.aBooleanArray25[local19];
			Static71.aBooleanArray25[local19] = false;
		}
		Static27.anInt601 = Static378.anInt4244;
		if (Static415.aClass39_11.method4551()) {
			Static300.aBoolean490 = true;
		}
		if (Static407.anInt6564 != -1) {
			Static121.anInt2467 = 0;
			Static270.method3987();
		}
		Static415.aClass39_11.e();
		Static316.method4486(Static415.aClass39_11);
		@Pc(70) int local70 = Static51.method6021();
		if (local70 == -1) {
			local70 = Static221.anInt2659;
		}
		if (local70 == -1) {
			local70 = Static402.anInt6499;
		}
		Static38.method696(local70);
		Static4.anInt115 = 0;
	}
}
