import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ji;I)V")
	public static void method6358(@OriginalArg(0) Class6_Sub21 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt7338 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6069();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray93.length - arg0.anInt7338 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method6003();
		if (arg0.aByteArray93.length - arg0.anInt7338 < local48 * 6) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local48; local66++) {
			@Pc(72) int local72 = arg0.method6003();
			@Pc(76) int local76 = arg0.method6036();
			if (Static395.anIntArray511.length > local72 && Static165.aBooleanArray29[local72] && (Static577.aClass80_1.method1993(local72).aChar4 != '1' || local76 >= -1 && local76 <= 1)) {
				Static395.anIntArray511[local72] = local76;
			}
		}
	}
}
