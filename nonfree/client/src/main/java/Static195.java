import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	public static void method3670() {
		if (Static119.anInterface9Array1 == null) {
			return;
		}
		@Pc(16) Interface9[] local16 = Static119.anInterface9Array1;
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Interface9 local24 = local16[local18];
			local24.method3095();
		}
	}
}
