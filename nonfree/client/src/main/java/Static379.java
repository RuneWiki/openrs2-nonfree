import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_120 = new Class67("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)I")
	public static int method5911() {
		@Pc(7) Class5 local7 = Static121.aClass5_7;
		@Pc(9) boolean local9 = false;
		if (Static382.anInt7091 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local7 = Static341.method7477(0, 0, null, local15, null);
			local9 = true;
		}
		@Pc(37) long local37 = Static12.method647();
		for (@Pc(39) int local39 = 0; local39 < 10000; local39++) {
			local7.method7436();
		}
		@Pc(66) int local66 = (int) (Static12.method647() - local37);
		local7.method7459(100, 0, -16777216, 100, 0);
		if (local9) {
			local7.method7437();
		}
		return local66;
	}
}
