import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "F")
	public static float aFloat213;

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "D")
	public static double aDouble35;

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray14 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "Lclient!ak;")
	public static final Class16 aClass16_46 = new Class16();

	@OriginalMember(owner = "client!qba", name = "g", descriptor = "(I)I")
	public static int method8942() {
		@Pc(7) Class100 local7 = Static273.aClass100_6;
		@Pc(9) boolean local9 = false;
		if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static121.method1790(local21, (Class126) null, 0, 0, (Interface7) null);
		}
		@Pc(38) long local38 = Static480.method6763();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method8606();
		}
		@Pc(69) int local69 = (int) (Static480.method6763() - local38);
		local7.method8644(0, -16777216, 100, 0, 100);
		if (local9) {
			local7.method8666();
		}
		return local69;
	}
}
