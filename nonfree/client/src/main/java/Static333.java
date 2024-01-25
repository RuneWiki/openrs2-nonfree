import java.awt.Color;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
	public static void method4776(@OriginalArg(0) boolean arg0) {
		Static574.method7450();
		if (!Static578.method7492(Static540.anInt8912)) {
			return;
		}
		Static3.anInt2071++;
		if (Static3.anInt2071 < 50 && !arg0) {
			return;
		}
		Static3.anInt2071 = 0;
		if (!Static559.aBoolean766 && Static529.aClass124_2 != null) {
			@Pc(42) Class2_Sub34 local42 = Static555.method7264(Static235.aClass154_50, Static551.aClass64_2);
			Static100.method1508(local42);
			try {
				Static509.method6612();
			} catch (@Pc(51) IOException local51) {
				Static559.aBoolean766 = true;
			}
		}
		Static574.method7450();
	}
}
