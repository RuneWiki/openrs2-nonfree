import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Z")
	public static boolean aBoolean601;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method5739() {
		if (Static655.anInterface5Array1 == null) {
			return;
		}
		@Pc(3) Interface5[] local3 = Static655.anInterface5Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(10) Interface5 local10 = local3[local5];
			local10.method8494();
		}
	}
}
