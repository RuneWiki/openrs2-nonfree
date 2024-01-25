import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
	public static void method4345() {
		Static314.method4915(Static554.aClass90_12, (long) Static363.anInt6671);
		if (Static152.anInt1936 != -1) {
			Static473.method6556(Static152.anInt1936);
		}
		for (@Pc(19) int local19 = 0; local19 < Static97.anInt1562; local19++) {
			if (Static543.aBooleanArray30[local19]) {
				Static366.aBooleanArray23[local19] = true;
			}
			Static100.aBooleanArray7[local19] = Static543.aBooleanArray30[local19];
			Static543.aBooleanArray30[local19] = false;
		}
		Static54.anInt963 = Static363.anInt6671;
		if (Static554.aClass90_12.method7480()) {
			Static17.aBoolean16 = true;
		}
		if (Static152.anInt1936 != -1) {
			Static97.anInt1562 = 0;
			Static146.method2357();
		}
		Static554.aClass90_12.F();
		Static354.method5328(Static554.aClass90_12);
		@Pc(71) int local71 = Static553.method7712();
		if (local71 == -1) {
			local71 = Static427.anInt7590;
		}
		if (local71 == -1) {
			local71 = Static269.anInt4756;
		}
		Static28.method408(local71);
		Static415.anInt7409 = 0;
	}
}
