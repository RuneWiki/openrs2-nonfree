import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
	public static int anInt6662 = -1;

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)I")
	public static int method5460() {
		@Pc(7) Class16 local7 = Static171.aClass16_5;
		@Pc(9) boolean local9 = false;
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static508.method7342(null, 0, null, 0, local21);
		}
		@Pc(38) long local38 = Static342.method5463();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method6057();
		}
		@Pc(73) int local73 = (int) (Static342.method5463() - local38);
		local7.method6114(-16777216, 0, 100, 0, 100);
		if (local9) {
			local7.method6063();
		}
		return local73;
	}
}
