import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	public static void method5465(@OriginalArg(1) int arg0) {
		Static554.method8000();
		@Pc(11) int local11 = Static144.aClass379_2.method9125(arg0).anInt4239;
		if (local11 == 0) {
			return;
		}
		@Pc(21) int local21 = Static188.aClass238_1.anIntArray347[arg0];
		if (local11 == 5) {
			Static237.anInt4576 = local21;
		}
		if (local11 == 6) {
			Static44.anInt756 = local21;
		}
	}
}
