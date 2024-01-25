import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!h;")
	public static Class90 aClass90_8;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public static int anInt6153;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public static int anInt6156 = 0;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)I")
	public static int method5323() {
		@Pc(7) Class105 local7 = Static217.aClass105_5;
		@Pc(9) boolean local9 = false;
		if (Static24.anInt437 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static130.method4247(local15, null, null, 0, 0);
		}
		@Pc(32) long local32 = Static292.method5114();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method4258();
		}
		@Pc(58) int local58 = (int) (Static292.method5114() - local32);
		local7.method4225(100, -16777216, 100, 0, 0);
		if (local9) {
			local7.method4299();
		}
		return local58;
	}
}
